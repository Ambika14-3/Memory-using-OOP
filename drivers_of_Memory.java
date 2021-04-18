// CONCEPTS USED: CLASSES, OBJECTS, EXCEPTION HANDLING

import java.util.Scanner;



class drive_mem_Type1 implements M_variables
{
	Scanner take_ip = new Scanner(System.in);
	
	public void driver(mem_Type1 ob)
	{

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("xxxxxxxx You are working with memory of type 1 xxxxxxxxxx");
	
		while(1>0)
		{
	
			System.out.println();
			System.out.println("What do you want to do ?");
			System.out.println("----------Read : " + Read  );
			System.out.println("----------Write : " + Write);
			System.out.println("----------End : e?");
	


		        System.out.println();
		        System.out.println();

			char op = take_ip.next().charAt(0);
		
			if(op  == Write)
			{
				ob.write_Data();	
			}	


			if(op == Read)
			{
				try
				{
					System.out.print("Enter address of memory: ");
					int addr = take_ip.nextInt();
			

					ob.out_Data(addr);
				}
				catch(Throwable exc)
				{
					System.out.println(" Please enter an address within range 0-3");
				}
				
			}


			if(op == 'e')
			{
				System.out.println("xxxxxxxx You left memory of type 1 xxxxxxxxxx");
				System.out.println();
				System.out.println();
		
				break;
			}	

		}
	}
}




class drive_mem_Type2 implements M_variables
{

	Scanner take_ip = new Scanner(System.in);
	
	public void driver(mem_Type2 ob)
	{

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("xxxxxxxx You are working with memory of type 2 xxxxxxxxxx");
	
		while(1>0)
		{
	
			System.out.println();
			System.out.println("What do you want to do ?");
			System.out.println("----------Reset :" + Reset );
			System.out.println("----------Read : " + Read  );
			System.out.println("----------Write :" + Write);
			System.out.println("----------End : e?");


		        System.out.println();
		        System.out.println();
	
			char op = take_ip.next().charAt(0);
		
			if(op  == Write)
			{
				ob.write_Data();	
			}	



			if(op == Read)
			{
				try
				{
					System.out.print("Enter address of memory: ");
					int addr = take_ip.nextInt();
			

					ob.out_Data(addr);
				}
				catch(Throwable exc)
				{
					System.out.println(" Please enter an address within range 0-3");
				}
				
			}

			if(op == Reset)
			{
				ob.reset_memory();
			}


			if(op == 'e')
			{
				System.out.println("xxxxxxxx You left memory of type 2 xxxxxxxxxx");
				System.out.println();
				System.out.println();
				break;
			}
				

		}
	}

}




class drive_mem_Type3 implements M_variables
{

	Scanner take_ip = new Scanner(System.in);


	public void driver(mem_Type3 ob)
	{

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("xxxxxxxx You are working with memory of type 3 xxxxxxxxxx");

		while(1>0)
		{
	
			System.out.println();
			System.out.println("What do you want to do ?");
		
	
			System.out.println("----------Reset :" + Reset );
			System.out.println("----------Read : " + Read  );
			System.out.println("----------Write :" + Write);
			System.out.println("----------End : e?");
			System.out.println("----------Display content : d");

		        System.out.println();
		        System.out.println();

			char op = take_ip.next().charAt(0);
		
			if(op  == Write)
			{
				ob.write_Data();	
			}	


			if(op == Read)
			{
				try
				{
					System.out.print("Enter address of memory: ");
					int addr = take_ip.nextInt();
			

					ob.out_Data(addr);
				}
				catch(Throwable exc)
				{
					System.out.println(" Please enter an address within range 0-3");
				}
				
			}


			if(op == Reset)
			{
				ob.reset_memory();
			}


			if(op == 'd')
			{
				ob.display_content();
			}	


			if(op == 'e')
			{
				System.out.println("xxxxxxxx You left memory of type 3 xxxxxxxxxx");
				System.out.println();
				System.out.println();
				break;
			}
		}				

	}

}



