package org.vistula.homework.day2.www.original;

/**
 * Created by student on 2016-12-04.
 */
public class WebPage {

    public WebPage(String title) {this.title=title;}

    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WebPage webPage = (WebPage) o;

        return title.equals(webPage.title);

    }

    @Override
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public String toString() {
        return "WebPage{" +
                "title='" + title + '\'' +
                '}';
    }
}
