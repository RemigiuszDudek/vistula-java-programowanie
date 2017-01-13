package org.vistula.dudekre.loops;

import org.junit.Test;
import org.vistula.dudekre.webframework.webpages.WebPage;

import java.util.ArrayList;

public class ForLoopExampleTest {
    @Test
    public void basicForLoop() {
        // for (warunek początkowy; warunek kontynuacji; operacja na zakończenie pętli)
        for (int i = 9; i < 10; i++) {
            System.out.println(i);
        }
    }

    @Test
    public void collectionFor() {
        ArrayList<WebPage> webPages = new ArrayList<WebPage>();
        webPages.add(new WebPage("title1"));
        webPages.add(new WebPage("title2"));
        webPages.add(new WebPage("title3"));
        webPages.add(new WebPage("title4"));

        for (WebPage webPage : webPages) {
            System.out.println(webPage.getTitle());
        }
    }
}
