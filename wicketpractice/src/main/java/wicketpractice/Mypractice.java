package wicketpractice;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

public class Mypractice extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return MyFormPage.class;
	} 
}
