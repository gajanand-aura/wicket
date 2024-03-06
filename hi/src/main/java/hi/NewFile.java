package hi;


import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.util.diff.AddDelta;

public class NewFile extends WebPage {
	public NewFile() {
		add(new Label("hi","hello world"));
	}

}
