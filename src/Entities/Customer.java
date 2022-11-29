package Entities;

import java.time.LocalDate;

public class Customer {
	
	public int Id;
	public String Name;
	public String Surname;
	public LocalDate dateofBirth;
	public Long NationalityId;
	
	public Customer(int id,String name,String surname,LocalDate dateofBirth,Long nationaltyId) {
		super();
		Id=id;
		Name=name;
		this.dateofBirth=dateofBirth;
		NationalityId=nationaltyId;
		
	}
	

}
