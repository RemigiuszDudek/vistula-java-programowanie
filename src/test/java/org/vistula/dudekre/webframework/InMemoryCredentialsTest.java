package org.vistula.dudekre.webframework;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class InMemoryCredentialsTest {
    private InMemoryCredentials inMemoryCredentials = InMemoryCredentials.getInstance();

    @Before
    public void setUp() {
        inMemoryCredentials.reset();
    }

    @Test
    public void shouldOverridePassword() {
        String user1 = "User1";
        String password1 = "pass1";
        String password2 = "pass2";

        inMemoryCredentials.addValidCredentials(user1, password1);
        inMemoryCredentials.addValidCredentials(user1, password2);

        assertThat(inMemoryCredentials.validate(user1, password1)).isFalse();
        assertThat(inMemoryCredentials.validate(user1, password2)).isTrue();
    }

    @Test
    public void shouldConsiderAsValidAllAddedCredentials() {
        String user1 = "User1";
        String password1 = "pass1";
        String user2 = "User2";
        String password2 = "pass2";

        inMemoryCredentials.addValidCredentials(user1, password1);
        inMemoryCredentials.addValidCredentials(user2, password2);

        assertThat(inMemoryCredentials.validate(user1, password1)).isTrue();
        assertThat(inMemoryCredentials.validate(user2, password2)).isTrue();
    }

    @Test
    public void shouldConsiderAsInvalidNotAddedCredentials() {
        String user1 = "User1";
        String password1 = "pass1";
        String user2 = "User2";
        String password2 = "pass2";

        inMemoryCredentials.addValidCredentials(user1, password1);

        assertThat(inMemoryCredentials.validate(user2, password2)).isFalse();
    }
}