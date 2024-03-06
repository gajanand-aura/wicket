package com.wickets;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.CheckBox;
import org.apache.wicket.markup.html.form.CheckBoxMultipleChoice;
import org.apache.wicket.markup.html.form.EmailTextField;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.FormComponent;
import org.apache.wicket.markup.html.form.ListChoice;
import org.apache.wicket.markup.html.form.PasswordTextField;
import org.apache.wicket.markup.html.form.RadioChoice;
import org.apache.wicket.markup.html.form.TextArea;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;
import org.apache.wicket.model.PropertyModel;

public class Forms extends WebPage{
	Form f=new Form("f");
	Inputs i=new Inputs();
	List<String> countries=Arrays.asList("India","Australia","China","");
	List<String> gen=Arrays.asList("male","female","others");
	List<String> lang=Arrays.asList("Telugu","English","Hindi","kannada");
	Label l1;
	Label l2;

	private final FormComponent f1;
	private final FormComponent f2;
	private final FormComponent f3;
	//	private final EmailTextField f2;
	//	private final PasswordTextField f3;
	//	//private final TextField f4;
	//	private final TextArea f5;
	//	private final ListChoice f6;
	//	private final RadioChoice f7;
	//	private final CheckBoxMultipleChoice f8;
	//	private final CheckBox f9;
	private Label label;
	public Forms()
	{
		f.add(createNameTextField("field"));
		f.add(createEmailTextField("mail"));
		f.add(f2=createPasswordTextField("pass"));
		f.add(f3=createConfirmPasswordTextField("pass1"));
		f.add(f1=createAgeTextField("a"));
		f.add(createPhoneNumberTextField("p"));
		f.add(createCountryTextField("category"));
		f.add(createGenderTextField("ge"));
		f.add(createLanguagesTextField("lan"));
		f.add(createIndianTextField("in"));
		f.add(createTextField("t"));
		f.add(new Button("s") {
			@Override
			public void onSubmit()
			{
				boolean flag=false;
				int i1=Integer.parseInt(i.getAge());
				String s1=i.getName();
				//"^[a-zA-Z][ ]*$"
				//"^[2-9]\\d{2}-\\d{3}-\\d{4}$"
				//^([A-Z][a-z]*((\s)))+[A-Z][a-z]*$
				//[a-zA-Z0-9_\-\.]+[@][a-z]+[\.][a-z]{2,3};
				//[89][0-9]{9};
				//^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[*.!@$%^&(){}[]:;<>,.?/~_+-=|\]).{8,32}$
				String regex="^[A-Z a-z//s\']*$";

				if(i1<18)
				{
					l1.setDefaultModelObject("Invalid Age");
					flag=true;
				}
				if(!(i.getPassword().equals(i.getPassword1())))
				{
					l1.setDefaultModelObject("Invalid Password");
					flag=true;
				}

				if(!(Pattern.matches(regex,s1)))
				{
					l1.setDefaultModelObject("Invalid name");
					flag=true;
				}
				if(flag==false)
				{

					label.setDefaultModelObject(i);
				}
			}
		});

		add(f);
		add(label=new Label("g",new Model("")));
		add(l1=new Label("an",new Model("")));
		add(l2=new Label("b",new Model("")));


	}
	public FormComponent createNameTextField(String s)
	{
		return new TextField(s,new PropertyModel(i,"name"));
	}
	public FormComponent createEmailTextField(String s)
	{
		return new EmailTextField(s,new PropertyModel(i,"email"));
	}
	public FormComponent createPasswordTextField(String s)
	{
		return new PasswordTextField(s,new PropertyModel(i,"password"));
	}
	public FormComponent createConfirmPasswordTextField(String s)
	{
		return new PasswordTextField(s,new PropertyModel(i,"password1"));
	}
	public FormComponent createAgeTextField(String s)
	{
		return new TextField(s,new PropertyModel(i,"age"));
	}
	public FormComponent createPhoneNumberTextField(String s)
	{
		return new TextField(s,new PropertyModel(i,"phoneNumber"),Long.class);
	}
	public FormComponent createCountryTextField(String s)
	{
		return new ListChoice(s,new PropertyModel(i,"country"),countries);
	}
	public FormComponent createGenderTextField(String s)
	{
		return new RadioChoice(s,new PropertyModel(i,"gender"),gen);
	}
	public FormComponent createLanguagesTextField(String s)
	{
		return new CheckBoxMultipleChoice(s,new PropertyModel(i,"languages"),lang);
	}
	public FormComponent createIndianTextField(String s)
	{
		return new CheckBox(s,new PropertyModel(i,"indian"));
	}
	public FormComponent createTextField(String s)
	{
		return new TextArea(s,new PropertyModel(i,"textArea"));
	}
}








