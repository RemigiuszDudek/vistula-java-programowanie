package org.vistula.dudekre.referencemagic;

import org.junit.Test;
import org.vistula.dudekre.webframework.webpages.WebPage;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

public class ReferenceTest {
    @Test
    public void doesNotAddNewElementToList() {
        ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

        integerArrayList.add(1);
        integerArrayList.add(2);

        addToListMethod(integerArrayList);
        assertThat(integerArrayList).containsExactly(1, 2);
    }

    private void addToListMethod(ArrayList<Integer> integers) {
        integers = new ArrayList<Integer>(integers);
        integers.add(3);
    }

    @Test
    public void keeps2EvenThoughMethodChangedItTo3() {
        Integer i = 2;

        changeValueOfInteger(i);

        assertThat(i).isEqualTo(2);
    }

    private void changeValueOfInteger(Integer k) {
        k = 3;
    }


    @Test
    public void changesWebPageTitle() {
        WebPage p = new WebPage("someTitle");

        changeWebPageTitle(p);

        assertThat(p.getTitle()).isEqualTo("someOtherTitle");
    }

    private void changeWebPageTitle(WebPage r) {
        r.setTitle("someOtherTitle");
    }

    @Test
    public void doesNotChangeWebPageTitle() {
        WebPage p = new WebPage("someTitle");

        changeWebPageTitleByCreatingNewWebPageWithDifferentTitle(p);

        assertThat(p.getTitle()).isEqualTo("someTitle");
    }


    private void changeWebPageTitleByCreatingNewWebPageWithDifferentTitle(WebPage r) {
        r = new WebPage("otherTitle");
    }

}
