package org.vistula.homework.day2.www.original;

import org.junit.Test;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by student on 2016-12-04.
 */
public class WebPageTest {

    @Test

    public void compareWebPages() {

        WebPage webPage = new WebPage("Forest Jr. Gump");
        WebPage webPage2 = new WebPage("Forest Gump");

        // Assertions.assertThat(webPage.equals(webPage2)).isTrue();- bardziej na piechotę; metoda porównuje dwa booleany
        //Assertions.assertThat(webPage).isEqualTo(webPage2); //porównuje dwa obiety; tak jest dobrze

        assertThat(webPage).isEqualTo(webPage2); //skrócone przez alt+enter "add static import"

        ArrayList<WebPage> webPages = new ArrayList<WebPage>();

        webPages.add(webPage);
        webPages.add(webPage2);
        webPages.add(new WebPage("Some book"));//w ten sposób można dodać do listy nowy obiekt, ale obiekt ten nie jest zdeiniowany- nie ma nazwy, np. webpage3. Żeby zdefiniować nazwę trzeba stworzyć nowy obiekt wcześniej.
        


    }
}
