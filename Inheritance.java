import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}
class Student extends Person{
	private int[] testScores;
    
    public Student (String firstname,String lastname,int id,int[] scores){
        super(firstname,lastname,id);
        this.testScores = scores;
    }

   
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    String calculate()
    {
        int i;
        //char grade;
        int sum=0;
        for(i=0;i<testScores.length;i++){
            sum+=testScores[i];
        }
        int avg = sum/testScores.length;
            if(avg>=90 && avg<=100)
            {
                return "O";
            }
             else if(avg>=80 && avg<90)
             {
                return "E";
             }
             else if(avg>=70 && avg<80)
             {
                return "A";
             }
             else if(avg>=55 && avg<70)
             {
                return "P";
             }
             else if(avg>=40 && avg<55)
             {
                return "D";
             }
             else if (avg<40)
             {
               return "T";
    }
            else {
               return "L";
        }
        //System.out.print(grade);
}
}