package com.A.add.calculator;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class calculate {

	
	
@RequestMapping("/add/{x}/{y}") 
	public String add(@PathVariable int x, @PathVariable int y)   
	{  
	int res=x+y;
	System.out.println("Addition of two no is : "+res);
	return "                     Addition of two no is : "+res;  
	}  

@RequestMapping("/sub/{x}/{y}") 
public String sub(@PathVariable int x, @PathVariable int y)   
{  
int res=x-y;
System.out.println("Substraction of two no is : "+res);
return "                     Substraction of two no is : "+res;  
} 

@RequestMapping("/mul/{x}/{y}") 
public String mul(@PathVariable int x, @PathVariable int y)   
{  
	int res=x*y;
System.out.println("Multiplication of two no is : "+res);
return                     "Multiplication of two no is : "+res;  
} 

@RequestMapping("/div/{x}/{y}") 
public String div(@PathVariable int x, @PathVariable int y)   
{  
	int res=x/y;
System.out.println("Division of two no is : "+res);
return                            "Division of two no is : "+res;  
} 


}
