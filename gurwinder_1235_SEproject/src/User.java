import java.util.Scanner;

public class User {

	//creating the static field to store th value from user
	private static int gym=0;
	
	//declaring an array
	static Gym[] gym1=new Gym[35];
	static Trainer[] trainer= new Trainer[10];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User temp;
		Scanner input=new Scanner(System.in);
		int choice;
		

			System.out.println("Press The following options for me to do!!");
			System.out.println();
			System.out.println("1.Add a User");
			System.out.println("2.Delete User");
			System.out.println("3.Change User");
			System.out.println("4.Book a trainer");
			System.out.println("5.Membership of Gym");
			
			choice=input.nextInt();
			
			//switch statements for prompting the values from the user
			switch(choice) {
			case 1:
			if(gym==35) {
				System.out.println("Database is Full");
			}
			else {
				//calling the add data, sorting and printing method
				addData();
			   print();
				
			}
			break;
			case 2:
				if(gym==0) {
					System.out.println("Database is empty");
				}
				else {
					
					//calling the delete data, sorting and printing method
					delData();
					print();
				}
			break;
			case 3:
				if(gym==0) {
					System.out.println("Database EMPTY");
				}
					else {
						//calling the change data, sorting and printing method
						changeData();
						print();
				
			}
				break;
			case 4:{
						//calling the change data, sorting and printing method
						bookTrainer();
						
					
				
			}
				break;
				
			case 5:{
				bookGym();
					
	}
		break;
	
			
			}
		}

	
	public static void addData() {
		Scanner input=new Scanner(System.in);
		
		//defining the data fields
		String phone;
		String pass;
		String Name;
		String DOB;
		String Height;
		
		
		System.out.println("Enter Username");
		Name=input.next();
		
		
		System.out.println("Enter the password");
		pass=input.next();
		
		System.out.println("Phone");
		phone=input.next();
		
		System.out.println("DOB");
		DOB=input.next();
		
		System.out.println("Height");
		Height=input.next();
		
		//checking the range of the cgpa entered if not ok the issuing an error message
		
			//storing the values in the array
		gym1[gym]=new Gym(Name,phone,pass,DOB,Height,"",""); 
		gym++;
		
	}
	
	public static void print() {
		for(int g=0;g<gym;g++) {
			//printing student Id
			System.out.println("Name:"+gym1[g].getName()+" Phone:"+gym1[g].getPhone()+ "Height :"+gym1[g].getHeight()+ "DOB: "+gym1[g].getDOB());
			System.out.println();
		}
	}
	

	
	public static void delData() {
		Scanner input=new Scanner(System.in);
		String Name;
		//prompting the student id
		System.out.println("Enter the Student Id");
		Name=input.next();

		//deleting the value from the array
		gym1[gym]=new Gym("",Name,"","","","","");
		gym--;
		
	}
	
	public static void bookGym() {
		Scanner input1=new Scanner(System.in);
				int choice1=0;
				choice1=input1.nextInt();
				System.out.println("You can Book the following Gyms");
				System.out.println("1. Anytime Fitness");
				System.out.println("2. Planet Fitness");
				System.out.println("3. Flex ");
				System.out.println("4. Club 16");
				System.out.println("5. Newton sports");
				System.out.println("6. Trevor Lindon");
				System.out.println(" ");
				System.out.println("Press the option");
				
				
				switch(choice1) {
				case 1:{
					choice1=input1.nextInt();
					System.out.println("You have booked Fitness");
					System.out.println("Thanks");
					
				}
				break;
				case 2:{
					choice1=input1.nextInt();
					System.out.println("You have booked Planet Fitness");
					System.out.println("Thanks");
					
				}
				break;
				case 3:{
					choice1=input1.nextInt();
					System.out.println("You have booked Flex");
					System.out.println("Thanks");
					
				}
				break;
				case 4:{
					choice1=input1.nextInt();
					System.out.println("You have booked Club 16");
					System.out.println("Thanks");
					
				}
				break;
				
				case 5:{
					choice1=input1.nextInt();
					System.out.println("You have booked Newton sports");
					System.out.println("Thanks");
					
				}
				break;
				
				case 6:{
					choice1=input1.nextInt();
					System.out.println("You have booked Trevor Lindon");
					System.out.println("Thanks");
					
				}
				break;
				}
	}
	
	
	public static void bookTrainer() {
		Scanner input2=new Scanner(System.in);
		int choice=0;
		choice=input2.nextInt();
		System.out.println("You can Book the following Trainers");
		System.out.println("1. Martin");
		System.out.println("2. James");
		System.out.println("3. George");
		System.out.println("4. Terry");
		System.out.println(" ");
		System.out.println("Press the option");
		
		switch(choice) {
		case 1:{
			choice=input2.nextInt();
			System.out.println("You have booked Martin");
			System.out.println("Thanks");
		}
		break;
		case 2:{
			choice=input2.nextInt();
			System.out.println("You have booked James");
			System.out.println("Thanks");
			
		}
		break;
		case 3:{
			choice=input2.nextInt();
			System.out.println("You have booked George");
			System.out.println("Thanks");
			
		}
		break;
		case 4:{
			choice=input2.nextInt();
			System.out.println("You have booked Terry");
			System.out.println("Thanks");
			
		}
		break;
		}
		
	}
	
	public static void changeData() {
		Scanner input=new Scanner(System.in);
		//prompting student Id
		System.out.println("Enter Username");
		int id=input.nextInt();
		
		//check whether the id is valid or not
		if(id==gym) {
			System.out.println("ERROR!!");
		}
		else {
			//prompting the cgpa to change
			System.out.println("Enter Username");
			String Name=input.next();

		     gym1[0].setName(Name);;
			
		
		}
		
	}

}
