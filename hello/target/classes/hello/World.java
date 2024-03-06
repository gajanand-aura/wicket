package hello;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink; // Necessary import for BookmarkablePageLink

public class World extends WebPage {
    public World() {
    
        add(new Label("hi", "hello world"));
    }
}
