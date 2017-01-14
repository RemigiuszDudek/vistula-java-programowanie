package org.vistula.dudekre.webframework.webpages;

public class WebPage {
    private String title;

    public WebPage(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

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
