package hi;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;



public class Hello extends WebApplication{

	@Override
	public Class<? extends Page> getHomePage() {
		// TODO Auto-generated method stub
		return NewFile.class;
	}

}