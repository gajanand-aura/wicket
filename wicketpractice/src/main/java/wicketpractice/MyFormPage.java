package wicketpractice;

import org.apache.wicket.markup.html.form.EmailTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.ListMultipleChoice;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;
import org.apache.wicket.markup.html.form.AbstractChoice;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.DropDownChoice;

import java.net.PasswordAuthentication;
import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.wicket.Component;
import org.apache.wicket.ajax.AjaxRequestTarget;
import org.apache.wicket.ajax.form.AjaxFormComponentUpdatingBehavior;
import org.apache.wicket.datetime.markup.html.form.DateTextField;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;

public class MyFormPage extends WebPage {
	List<String> gen=Arrays.asList("male","female","others");
	
	List<String> fruits = Arrays.asList("apple", "strawberry", "watermelon" , "watermelon", "strawberry", "watermelon" , "watermelon");
	
	List<String> countries=Arrays.asList("India","US","UK");
	 List<List<String>> states = Arrays.asList(
	            Arrays.asList("Karnataka", "Maharashtra", "Goa"),
	            Arrays.asList("California", "New York", "Texas"),
	            Arrays.asList("England", "Scotland", "Wales")
	    );
	
	Label l;
	
    private TextField<String> fn;
    private TextField<String> ln;
    private EmailTextField email;
    private TextField<String> phone;
    private TextField<String> age;
    private String selectedCountry;
    private String selectedState;
    private DropDownChoice<String> countryDropDown;
    private DropDownChoice<String> stateDropDown;
    private RadioChoice<String> ge;
    private DropDownChoice<String> fruit;
    private TextArea<String> description;
    private CheckBox in;
    private Button sub;
    
    
    final Form f = new Form("form");
    Input ab = new Input();
    public MyFormPage() {
		fn = new TextField<String>("fn", new PropertyModel(ab, "fn"));
		ln = new TextField<String>("ln", new PropertyModel(ab, "ln"));
		email = new EmailTextField("email", new PropertyModel(ab, "email"));
		phone = new TextField<String>("phone", new PropertyModel(ab, "phone"));
		
		age = new TextField<String>("age", new PropertyModel(ab, "age"));
		// Country DropDownChoice
		DropDownChoice<String> countryDropDown = new DropDownChoice<String>("country", new PropertyModel<String>(ab, "country"), countries);
		f.add(countryDropDown);

		// State DropDownChoice
		 DropDownChoice<String> stateDropDown = new DropDownChoice("state");
		
		countryDropDown.add(new AjaxFormComponentUpdatingBehavior("onChange") {
		    private String selectedCountry;

			@Override
			public void onUpdate(AjaxRequestTarget target) {
			  
			        DropDownChoice stateDropDown = new DropDownChoice("state", new PropertyModel(ab, "state1"),getStatesForCountry(ab.getCountry()));               
//			        stateDropDown.setOutputMarkupId(true);
			        f.addOrReplace(stateDropDown);
			        target.addComponent(f);
			           
			}
			

			  private List<String> getStatesForCountry(String selectedCountry) {
			        int index = countries.indexOf(selectedCountry);
			        if (index >= 0 && index < states.size()) {
			            return states.get(index);
			        }
			        return null;
			    }
		});

	        
	        
		in = new CheckBox("in", new Model("in"));
		ge = new RadioChoice<String>("ge", new PropertyModel<String>(ab, "ge"), gen);
		description = new TextArea("description", new Model(""));
		
	 DropDownChoice<String> fruit = new DropDownChoice<String>("fruit",new PropertyModel<String>(ab,"fruitDropDown"), fruits);



		sub = new Button("button") {
			@Override
			public void onSubmit() {
				l.setDefaultModelObject(ab.toString()+"  indian:"+ in.getValue());
				
				
			//System.out.println(ab);z
				
			}
		};
	
		f.add(fn, ln, email, phone, age, in,stateDropDown,countryDropDown, ge,fruit,description,sub);
		/*f.add(fn);
		f.add(ln);
		f.add(email);
		f.add(age);
		f.add(phone);
		f.add(ge);
	//	f.add(checkGroup);
		f.add(fruit);
		f.add(in);
		f.add(sub);*/
		add(f);
	
	add(l = new Label("msg", new Model("")));
    }
    }
	
	


