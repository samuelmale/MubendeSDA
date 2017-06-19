package mubende.com;

import java.util.*;

public class Member {
	private int id;
	private String erinyaElisooka;
	private String lastName;
	private int day;
	private int month;
	private int year;
	private Date birthDay;
    private String gender;
    private boolean baptism;
    private boolean serving;
    static GregorianCalendar  date;
    static Add_Member addMember;


//Constructor.
public 	Member(String firstname, String lastname,int day,int month,int year,String gender,boolean baptism,boolean serving){
this.erinyaElisooka=firstname;
this.lastName=lastname;
this.day=day;
this.month=month;
this.year=year;
this.gender=gender;
this.baptism=baptism;
this.serving=serving;
date = new GregorianCalendar(year,month,day);

}
public static String makeDateString( GregorianCalendar date){
	
	String sam = "sam";
	if(date!=null){
Integer year = date.get(Calendar.YEAR);

 String Year = year.toString();
 Integer month = date.get(Calendar.MONTH);
 String Month = month.toString();
 Integer day = date.get(Calendar.DATE);
 String Day = day.toString();
 String Date = Year+"/"+Month+"/"+Day;
 return Date;
 }
	else 
		return sam;
 
}
public static void main(String[] args) {
	addMember = new Add_Member();
	String firstName= addMember.textField.getText();
	String lastName= addMember.textField_1.getText();
	System.out.println(firstName+" "+lastName);
new Member("sam","male",13,8,1997,"sam",true,true);	

System.out.println( makeDateString(date));

}
}
