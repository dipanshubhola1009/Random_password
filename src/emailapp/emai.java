package emailapp;

import java.util.Scanner;

public class emai {
	private String firstname;
	private String Secondname;
	private String department;
	private int length=10;
	private String email;
	
	
	public emai(String firstname,String Secondname )
	{
		this.firstname= firstname;
		this.Secondname = Secondname;
		System.out.println("email created: "+this.firstname+" "+this.Secondname);
		this.department= depart();
		System.out.println("Department: "+this.department);
		email = this.firstname.toLowerCase()+"."+this.Secondname.toLowerCase()+"@"+this.department+"company.com";
		System.out.println(email);
		System.out.println(pwsd(10));
		
	}
    private String depart() {
    	System.out.println("Select department \n 1.IT\n 2.CSE \n 3. ECE");
    	Scanner in = new Scanner(System.in);
    	int value= in.nextInt();
    	
    	if(value==1)
    		{
    		return "IT";
    		}
    	else
    	if(value==2)
    	{
    		return "cse";
    	}
    	else
    	if(value==3) {
    		return "Ece";
    	}
    	else {
    		return " ";
    	}
   	}
    private String pwsd( int lenght )
    {
      String password = "abcdefghijklmnopqrstuvwcxz1234567890~!@#$%^&*()_][';,./";
      char[] mypassword=new char[lenght];
      for(int i=0;i<lenght;i++) {
      int rand = (int)(Math.random() * password.length());
      mypassword[i]=password.charAt(rand);
      }
      return new String(mypassword);
      
    }
}
