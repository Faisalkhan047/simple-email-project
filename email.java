package com.emailApp;

import java.util.Scanner;

public class email {
	  
	//all variable that can be used
	
      private String FirstName;
      private String LastName;
      private String DefaultPassword;
      private String newPassword;
      private String Department;
      private String email;
      private String alternateEmail;
      private String userInfo;  
      private int MailBoxCapacity;
      private String OTP;

      
      Scanner sc=new Scanner(System.in);
      
      email(){
    	  for(int i=0; i<100; i++) {
    	  System.out.println("\n1.Create email \n2.change password \n3.change mailbox capacity");
    	  

    	   int choice=sc.nextInt();
    	   
    	   if(choice==1) {
    		   this.FirstName=this.setFirstName();
        	   this.LastName=this.setLastName();
        	  this.Department=this.setDepartment();
        	  
        	  this.OTP=this.setOTP(6);
        	  System.out.println("Enter this OTP to get proceed further:"+this.OTP);
        	  System.out.println("Enter the Otp:");
        	 String validotp=sc.next();
        	 
        	 if(validotp.equals(this.OTP)) {
        		 
        		 //format for proper email i.e firstnamelastname@department.com
        		 
        	 email=this.FirstName.toLowerCase()+this.LastName.toLowerCase()+"@"+this.Department.toLowerCase()+".com";
        	  System.out.println("Your email looks like this..."+this.email);
        	  
        	  
        	  this.DefaultPassword=this.setRandomPassword(6);
        	  System.out.println("Generating a Default Password for you:"+this.DefaultPassword);
        	  
        	  this.MailBoxCapacity=this.setMailCapacity();
        	  
        	  
        	  
        	  
        	   this.alternateEmail=this.setAlternateEmail();
//             System.out.println("Your alternate email is"+this.alternateEmail);
             
             this.newPassword=this.setPassword();
//             System.out.println("Your new password is:"+this.newPassword);
             
       	  this.userInfo=this.ShowInfo();
       	  System.out.println("================= USER DETAILS =============");
       	  System.out.println(userInfo);
       	  System.out.println("=============================================");
       	  
       	  
       	  
       	 }
       	  else {System.out.println("Wrong OTP..");
       	 }}
       	  
        	 else if(choice==2) {
        		 System.out.println("Enter old password:");
        		 String oldPassword=sc.next();
        		 if(oldPassword==this.newPassword) {
        			 System.out.println("Enter new Password:");
        			 String modifiedPassword=sc.next();
        			 this.newPassword=modifiedPassword;
        			 System.out.println("Password changed as:"+this.newPassword);
        			 
        		 }
        		 
        	 }
        	 
        	 else if(choice==3) {
        		 System.out.println("setting the mail box capacity:");
        	 }

        	  
    	   }
      }
    	  //calling the respective functions to set first name last name and department 
    	  
    	   
    	  
    	  //calling the setOTP method for generating an otp 
    	  
    	 
    	  
    	 
    	 //otp validation
    	 
    	 
    	  //calling RandomPassword method to generate default password
    	  
    	  
    	  
    	  
    	  //calling mail capacity method set mailbox capacity
    	  
    	 
    	  
       
    	 
    	 
    	  
    	 
      
      
      
      //Asking for first name
      
      private String setFirstName() {
    	  System.out.println("Enter your first name :");
    	  String fname=sc.next();
    	  this.FirstName=fname;
    	  return this.FirstName;
      }
      
      //Asking for the last name
      
      private String setLastName() {
    	  System.out.println("Enter YOur last name:");
    	  String Lname=sc.next();
    	  this.LastName=Lname;
    	  return this.LastName;
      }
      
      
      //setting the department for the email
      
      private String setDepartment() {
    	  System.out.println("Enter a choice for the Department:\n 1.Sales \n 2.HR \n 3.Development \n 4.Accounting \n 5.None/Others");
//    	  Scanner sc=new Scanner(System.in);
    	  int n=sc.nextInt();
    	  if(n==1) {return "Sales";}
    	  else if(n==2) {return "HR";}
    	  else if(n==3) {return "Development";}
    	  else if(n==4) {return "Accounting";}
    	  else if(n==5) {return "None/Other";}
		return Department;
    	  
      }
      
      //Generating a random/default password for the user 
      
      private String setRandomPassword(int length) {
    	  String passwordLength="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*abcdefghijklmnopqrstuvwxyz";
    	  char[] password=new char[length];
    	  for(int i=0; i<length;i++) {
    		  int rand=(int)(Math.random()* passwordLength.length());
    		  password[i]=passwordLength.charAt(rand);
    	  }
    	  return new String(password);
      }
      
      
      // Ask for the mailbox capacity i.e no.of mails to be stored
      
      public int setMailCapacity() {
    	  System.out.println("Enter the capacity you want for your mail box:");
    	  int capacity=sc.nextInt();
    	  this.MailBoxCapacity=capacity;
    	  return this.MailBoxCapacity;
      }
      
      
      
      // Ask an alternate email from user only changing first name
      
      public String setAlternateEmail() {
    	  System.out.println("enter your Alternate email(Only first name):");
    	  
    	  String anotherEmail=sc.next();
    	  this.alternateEmail=anotherEmail;
    	  return this.alternateEmail;
      }
      
      
      
      // Generating the user defined password
      
      public String setPassword() {
    	  System.out.println("Enter the password you want to change:");
    	 String nPassword=sc.next();
    	  this.newPassword=nPassword;
    	  return newPassword;
      }
      
      
      
      
      // Generating OTP
      
      public String setOTP(int length) {
    	  String OTPlength="1234567890";
    	  char[] OTP=new char[length];
    	  for(int i=0; i<length; i++) {
    		  int rand=(int)(Math.random()*OTPlength.length());
    		  OTP[i]=OTPlength.charAt(rand);
    	  }
    	  return new String(OTP);
      }
      
      
      // All user Information
      
      public String ShowInfo() {
    	  return "\n Firstname:"+this.FirstName+"\n Department:"+this.Department+"\n Email capacity:"
                    +this.MailBoxCapacity+"\n Your default password was:"+this.DefaultPassword+"\n Your new pass:"
    			  +this.newPassword+"\nYour alternate email is:"+this.alternateEmail.toLowerCase()+this.LastName.toLowerCase()+"@"+this.Department.toLowerCase()+".com"+"\n Your main email is:"+this.email;
      }
      
}
