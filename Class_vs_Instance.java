import java.io.*;
import java.util.*;
public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(initialAge<0){
            age =0;
            System.out.println("Age is not valid, setting age to 0.");
          //  ans ="Age is not valid, setting age to 0."
            // ans ="You are young."
            
        }
        else {
            age = initialAge;
        }
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        String result;
        //System.out.print("Age: " + this.age);
        if(this.age < 13 ){
            result = "You are young.";
        }
        else if(this.age < 18){
            result = "You are a teenager.";
        }
        else {
            result ="You are old.";
        }
        System.out.println(result);
	}

	public void yearPasses() {
        this.age = this.age + 1;
  		// Increment this person's age.
	}
