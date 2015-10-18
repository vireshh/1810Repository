package hello;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ValueChangeEvent;
import javax.faces.event.ValueChangeListener;

@ManagedBean
public class StudentTwo implements ValueChangeListener {
	
	public StudentTwo()
	{
		countries = new ArrayList<>();
		countries.add("Germany");
		countries.add("Italy");
		countries.add("USA");
		countries.add("France");
		
	}

private List<String> countries;

public List<String> getCountries() {
		return countries;
		}
	
private ArrayList<Student> names;


public void setCountries(List<String> countries) {
	this.countries = countries;
}
public ArrayList<Student> getNames() {
	names = new ArrayList<Student>();
	Student stu = new Student();
	stu.setFirstName("viresh");
	stu.setLastName("dev");
	stu.setCountry("India");
	
	Student stu1 = new Student();
	stu1.setFirstName("mumbai");
	stu1.setLastName("bombay");
	stu1.setCountry("INdia");
	names.add(stu);
	names.add(stu1);
	return names;
}
public void setNames(ArrayList<Student> names) {
	this.names = names;
}

private String language;

public void valueChange(ValueChangeEvent event)
{
	
}

public String getLanguage() {
	return language;
}
public void setLanguage(String language) {
	this.language = language;
}

private String firstName;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
private String lastName;
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
private String country;
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
@Override
public void processValueChange(ValueChangeEvent arg0) throws AbortProcessingException {

	
}

}
