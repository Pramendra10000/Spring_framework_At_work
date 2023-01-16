package com.person.details.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.person.details.model.Person;

@RestController
public class PersonController {
  
  @GetMapping("/person")
  public static List<Person> getAllPersons(){
   
    List<Person> personList = new ArrayList<Person>();
    personList.add(new Person(1,"Mickey Mouse", 30));
    personList.add(new Person(2,"Donald Duck", 35));
    personList.add(new Person(3,"Robert allen", 15));
    return personList;
  } 
  
  @GetMapping("/person/{personId}")
  public String getPersonWithId(@PathVariable Integer personId){
	 if (personId==1) {
		 
		 PersonController.getAllPersons();
		
		 System.out.println("1,\"Mickey Mouse\", 30");
		 return "1,\"Mickey Mouse\", 30" ;
		
	} 
	 else if (personId==2) {
		 System.out.println("2,\"Donald Duck\", 35");

			return "2,\"Donald Duck\", 35";
	}
	 
	 else{
		System.out.println("3,\"Robert allen\", 15");
		
		return "3,\"Robert allen\", 15";
		 
	}
  } 
  
  
 

@PostMapping("/person/new")
  public void addPerson(@RequestBody Person person){
	
    System.out.println("Saving person information");
    
  }
  
  
  
}