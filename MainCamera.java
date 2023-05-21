package cameraRentall;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainCamera {
public static void main(String[] args) {
	System.out.println("+------------------------------------+ ");
	System.out.println("|    WELCOME TO CAMERA RENTAL APP    | ");
	System.out.println("|              Your's Trusted App    | ");
	System.out.println("+------------------------------------+ ");
	System.out.println(" \nPLEASE LOGIN TO CONTINUE - ");
	Camera  user = new Camera();
	//CameraOperations ac = new CameraOperations();
	
	//adding list elements to show
	List<CameraValue> rentacam = new ArrayList<CameraValue>();
	List<CameraValue> re = new ArrayList<CameraValue>();
	CameraValue camrnt = new CameraValue(11, "Somet", "Some ",200.00f, "Rented");
	rentacam.add(camrnt);
	
	camrnt = new CameraValue(12, "Some", "Another",100.00f, "Available");
	rentacam.add(camrnt);

	camrnt = new CameraValue(14, "NIKON", "DSLRD75",500.00f, "Available");
	rentacam.add(camrnt);
	camrnt = new CameraValue(15, "Sony", "DSLR12",1200.00f, "Available");
	rentacam.add(camrnt);
	
	camrnt = new CameraValue(17, "Samsung", "SM123 ",567.80f, "Available");
	rentacam.add(camrnt);
	
	camrnt = new CameraValue(19, "SONY", "SONY123",200.00f, "Available");
	rentacam.add(camrnt);
	
	camrnt = new CameraValue(20, "canon", "5050 ",678.2f, "Rented");
	rentacam.add(camrnt);
	
	camrnt = new CameraValue(21, "nikon", "2030 ",200.00f, "Available");
	rentacam.add(camrnt);
	rentacam.addAll(re);
	
			Scanner sc = new Scanner(System.in);
			System.out.print("USERNAME - ");
			String usern = sc.next();		
			System.out.print("PASSWORD - ");
			String passw = sc.next();
			//login only when it correct
			if(usern.equals("admin") && passw.equals("admin123"))
			
				
			//first screen
				try{
				{
				System.out.println("1. MY CAMERA \n2. RENT A CAMERA \n"
						+ "3. VIEW ALL CAMERAS \n4. MY WALLET \n"
						+ "5. EXIT");
				 //char operator = sc.next().charAt(0); 
				int operator; 
	  			operator = sc.nextInt();
				 switch(operator) {
				
			    	  case 1:
			    	  System.out.println("1. ADD \n2. REMOVE \n"
								+ "3. VIEW MY CAMERAS \n4. GO TO PREVIOUS MENU");
			    	  			int operator1; 
			    	  			operator1 = sc.nextInt();
					    	    switch (operator1) {
						    	  		case 1:
						    	  			Scanner sc1 = new Scanner(System.in);
						    	  			System.out.print("ENTER CAMERA ID -  ");
						    	  			int camera_id = sc.nextInt();
						    	  			System.out.print("ENTER THE CAMERA BRAND - ");
						    	  	        String value1 = sc.next();
						    	  	        System.out.print("ENTER THE MODEL - ");
						    	  	        String value2 = sc.next();
						    	  	        System.out.print("ENTER THE PER DAY PRICE (INR) - ");
						    	  	        float value3 = sc.nextFloat();
						    	  	    
						    	  	        String value4 = ("Available");
						    	  	        //adding to the existing table
						    	  	    	rentacam.add(new CameraValue(camera_id, value1, value2, value3, value4));
						    	  	        System.out.print("YOUR CAMERA HAS BEEN SUCCESSFULLY ADDED TO THE LIST. \n");
								        
						    	  	        System.out.println("===================================================================");
						    				System.out.println("Camid  Brand   Model  Price(/day)  Status  ");
						    				System.out.println("===================================================================");
						    	  	      	for (int i = 0; i < rentacam.size(); i++) {
						    	  			CameraValue c = rentacam.get(i);
						    	  		
						    	  			System.out.println(c.getCamid() + "\t" + c.getBrand() + "\t" + c.getModel() + "\t" + c.getRentperday() + "\t" + c.getStatus());
						    	  			
						    			}
						    	  	      System.out.println("===================================================================");    
						    	  	        
					    	    		  
						    	  	    break;
								        
						    	  		case 2:
						    	  			
						    	  			System.out.println("===================================================================");
						    				System.out.println("Camid  Brand   Model  Price(/day)  Status  ");
						    				System.out.println("===================================================================");
						    	  			for (int i = 0; i < rentacam.size(); i++) {
							    	  			CameraValue c = rentacam.get(i);					    	  			
							    	  			System.out.println(c.getCamid() + "\t" + c.getBrand() + "\t" + c.getModel() + "\t" + c.getRentperday() + "\t" + c.getStatus());
							    	  			}
						    	  			System.out.println("===================================================================");
						    	  			try {
						    	  			Scanner sc2 = new Scanner(System.in);
						    	  			System.out.print("ENTER THE CAMERAID TO REMOVE -  ");
						    	  			int remove = sc.nextInt();	
						    	  			boolean b = false;
						    	  			for (int i = 0; i < rentacam.size(); i++) {
							    	  			CameraValue c = rentacam.get(i);
							    	  			if (c.getCamid()== remove) {
							    	  				if (c.getStatus()=="Available") {
							    	  					// removing the particular camera,if it is rented it can't be removed.
							    	  				rentacam.remove(i);
							    	  				b = true;
							    	  				
							    	  			System.out.println( c.getBrand() + " " + c.getModel() + " with Camera ID " +c.getCamid()+ " is removed");
							    	  			}
							    	  			}
						    	  			}
						    	  			if(b==false)
						    	  				//when not founded/rented
						    	  				System.out.println("CAMERA NOT FOUND / IT IS RENTED.....");
						    	  			
						    	  			}catch(Exception e) {System.out.println(e);}
						    	  			
						    	  			break;
								      
						    	  		case 3:
						    	  			System.out.println("===================================================================");
						    				System.out.println("Camid  Brand   Model  Price(/day)  Status  ");
						    				System.out.println("===================================================================");
						    	  			for (int i = 0; i < rentacam.size(); i++) {
							    	  			CameraValue c = rentacam.get(i);
							    	  			
							    	  			System.out.println(c.getCamid() + "\t" + c.getBrand() + "\t" + c.getModel() + "\t" + c.getRentperday() + "\t" + c.getStatus());
							    	  			}
						    	  			System.out.println("===================================================================");
						    	  			 //Collections.sort((List<CameraValue>)rentacam);
						    	  			 
						    	  	        // Iterate over ArrayList using for each loop
						    	  	        for (CameraValue c : rentacam) {
						    	  	 
						    	  	            // Print the sorted ArrayList
						    	  	        	System.out.println(c.getCamid() + "\t" + c.getBrand() + "\t" + c.getModel() + "\t" + c.getRentperday() + "\t" + c.getStatus());
						    	  	        }
						    	  			break;
		
								      
						    	  		case 4:
						    	  			System.out.println("Going back to previous menu.");
						    	  		
										
						    	  		default:
									        System.out.println("INVALID OPERATOR");
				 
									    break;
					    	    }
					    	    break;
			    	   case 2:
		            	 System.out.println("THE AVAILABLE CAMERAS LIST -  ");
				    	    System.out.println("===================================================================");
		    				System.out.println("Camid  Brand   Model  Price(/day)  Status  ");
		    				System.out.println("===================================================================");
		    	  			for (int i = 0; i < rentacam.size(); i++) {
			    	  			CameraValue c = rentacam.get(i);
			    	  				if (c.getStatus()=="Available") {	
			    	  					//Showing only available cameras list
			    	  			System.out.println(c.getCamid() + "\t" + c.getBrand() + "\t" + c.getModel() + "\t" + c.getRentperday() + "\t" + c.getStatus());
			    	  			}
			    	  		
		    	  			}
		    	  			try {
		    	  			System.out.println("===================================================================");
		    	  			Scanner sc5 = new Scanner(System.in);
		    	  			System.out.print("\nENTER THE CAMERAID TO RENT -  ");
		    	  			int rent_cam_id = sc.nextInt();
		    	  			Camera user1 = new Camera();
		    	  			double Avail;
		    	  			boolean bn = false;
		    	  			for (int i = 0; i < rentacam.size(); i++) {
			    	  			CameraValue c = rentacam.get(i);
			    	  				if (c.getCamid() == rent_cam_id) {	
			    	  					if(c.getRentperday()<= user1.wallet) {
			    	  						bn = true;
			    	  						System.out.println( c.getBrand()+" " +  c.getModel() + " with rent INR " + c.getRentperday() + " HAS SUCCESSFULLY COMPLETED ");
				    	  					 Avail = (user1.wallet-c.getRentperday());
				    	  					 System.out.println("Available Balance - "+Avail);
			    	  				           
			    	  				           //returns balance wallet money after rent
				    	  					 
				    	  					//double Avail2 = (c.getRentperday()-user1.wallet);
			    	  				           
			    	  					}
			    	  					 //System.out.println( c.getBrand()+" " +  c.getModel() + " with rent INR " + c.getRentperday() + " HAS SUCCESSFULLY COMPLETED ");
			    	  					 //Avail = (user1.wallet-c.getRentperday());
			    	  					 //System.out.println("Available Balance - "+Avail);
			    	  					}
		    	  			         }
		    	  			if(bn==false)
		    	  				//when not sufficient balance
		    	  				for (int i = 0; i < rentacam.size(); i++) {
				    	  			CameraValue c = rentacam.get(i);
				    	  				if (c.getCamid() == rent_cam_id) {	
				    	  					if(c.getRentperday()>= user1.wallet) {
		    	  				System.out.println("INSUFFICIENT BALANCE.....");
		    	  				double Avail2 = (c.getRentperday()-user1.wallet);
		    	  				System.out.println("YOU ARE INR "+Avail2+" SHORT TO RENT.....ADD MONEY AND CONTINUE PURCHASING");
				    	  					}
				    	  				}
		    	  				}
		    	  			}catch(Exception e) {System.out.println(e);}
		    	  			break;
		    	  						//break;

		      
			    	  	case 3:
				    	    System.out.println("===================================================================");
		    				System.out.println("Camid  Brand   Model  Price(/day)  Status  ");
		    				System.out.println("===================================================================");
		    	  			//printing list of all cameras
		    				for (int i = 0; i < rentacam.size(); i++) {
			    	  			CameraValue c = rentacam.get(i);					    	  			
			    	  			System.out.println(c.getCamid() + "\t" + c.getBrand() + "\t" + c.getModel() + "\t" + c.getRentperday() + "\t" + c.getStatus());
			    	  			}
		    	  			System.out.println("===================================================================");
		    	  			break;			        
			        
			    	  	case 4:
				    	  //Scanner sc3 = new Scanner(System.in);
				    	  //Camera user1 = new Camera();
				    	  //printing available balance
			    	  		try {
				    	  System.out.println("AVAILABLE BALANCE - "+ user.wallet);
				    	  System.out.println("DO YOU WANT TO ADD MONEY TO WALLET - (1.YES 2.NO)");
				    	  int w = sc.nextInt();
				    	  if (w == 1) {
				    		  System.out.println("HOW MUCH MONEY NEED TO ADD - ");
				    		  double a = sc.nextDouble();
				    		  user.wallet+=a;
				    		  //printing updated balance
				    		  System.out.println("AVAILABLE BALANCE - "+ user.wallet+" INR");
				    	  }
				    	  else {
				    		  System.out.println("AVAILABLE BALANCE - "+ user.wallet+" INR");
				    	  }
			    	  	}catch(InputMismatchException e) {System.out.println("Enter an Integer "+e);}
			    	  	 catch(Exception e) {System.out.println(e);}	
					  break;
					   case 5:
			    		  CloseApp();//closing the app
			    		  
					   default:
					        System.out.println("INVALID OPERATOR");

					    break;
			    	 // break;
			    	    }
				}
			//System.out.println("  Login Successful");
				}catch(InputMismatchException e) {System.out.println("Enter an Integer Value to proceed...\n"+e);}
	    	  	 catch(Exception e) {System.out.println(e);}
		
				 
				
                      else
                      {
			        	//shows whenever username/password is incorrect
			            System.out.println("Login Failed due to Incorrect"
			            		+ " Username or Password!!!");
                      }

			
}

	private static void CloseApp() {
		System.out.println("Closing your application... \nThank you! For Visiting & Purchasing...\nWe Welcomes You!!! AnyTime... ");
	 System.out.println("----------------------------------------");
	     }

}




					