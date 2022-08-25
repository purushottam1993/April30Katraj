package testNgPractice;

import org.testng.annotations.Test;

public class EnabledCheck {
	
     @Test(priority=1)
     public void Login() {
    	 System.out.println("Method Login");
     }
     @Test(priority=2,enabled=false)   //if we want to skip any method from execution
     public void home() {              //mention that method enabled=false
    	 System.out.println("method home");
     }
     @Test(priority=3)
     public void logout() {
    	 System.out.println("method logout");
     }

 }
