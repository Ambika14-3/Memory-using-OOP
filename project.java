// CONCEPTS INVOLVED: CLASSES, OBJECTS, MULTITHREADING

import java.util.Scanner;

class Storage 
{
	int val;

	int getVal()
	{
		return val;
	}

	void setVal(int x)
	{
		val = x;
	}
}

class MyMemThread implements Runnable 
{
	Thread thrd;
	static Storage s;
	char op;
	mem_Type1 mmry;


	MyMemThread(Storage s, String name, char op, mem_Type1 MEMORY_OBJECT)
	{
		thrd = new Thread(this, name);
		this.s = s;
		this.op = op;
		this.mmry = MEMORY_OBJECT;
	}

	public void run()
	{
		

		for(int i = 0; i<4; i++)
		{
			try 
			{
				synchronized(s)
				{
					if(op == 'r')
					{
						System.out.println("You're in a memory called:" + thrd.getName());
						s.setVal(mmry.out_Data(i));
						System.out.println();
						s.notify();
						s.wait();
					}
					
					if(op == 'w')
					{
						System.out.println("You're in a memory called:" + thrd.getName());
						mmry.mem[i] = s.getVal();
						System.out.println("Written at address " + i + " " + mmry.mem[i]);
						System.out.println();
						if(i == 3)
						{
							s.notify();
							System.out.println();
							break;
						}
						s.notify();
						s.wait();
					}
					
				}

				
			}

			catch(InterruptedException ae)
			{
				System.out.println("Interrupt");
			}
		}
		
	}
	
}




// CLASS HAVING MAIN METHOD TO BE EXECUTED BY JVM
class project 
{
	
	public static void main(String args[])
	{
                            
		mem_Type1 myMem1 = new mem_Type1();
		mem_Type2 myMem2 = new mem_Type2();
		mem_Type3 myMem3 = new mem_Type3();
                               
		Scanner take_ip = new Scanner(System.in);
                             
                               
		System.out.println();
		System.out.println("You can make a memory with 4 registers with address ranging from 0 to 3 ");
		System.out.println();

			

		while(1>0)
		{

			System.out.println();


			System.out.print("On which memory you want to work with? 1, 2 or 3 : ");	
			int type = take_ip.nextInt();

			if(type == 1)
			{
				drive_mem_Type1 x = new drive_mem_Type1();
				x.driver(myMem1);
			}
		


			if(type == 2)
			{
				drive_mem_Type2 x = new drive_mem_Type2();
				x.driver(myMem2);
			}


			if(type == 3)
		        {
				drive_mem_Type3 x = new drive_mem_Type3();
				x.driver(myMem3);
			}



			System.out.println("Do you want to exit the program: Y ?  ");
			
			char c = take_ip.next().charAt(0);
			if (c == 'Y')
				break;
		        
				
		}




		System.out.println("Out of loop ");

		Storage s = new Storage();

		MyMemThread m1 = new MyMemThread( s, "Read_Memory", 'r', myMem1);
		MyMemThread m2 = new MyMemThread( s, "Write_Memory", 'w', myMem2);

		m1.thrd.start();
		m2.thrd.start();
		
		try
		{
			m1.thrd.join();
			m2.thrd.join();	
		}

		catch(Exception ae)
		{
			System.out.println("Interrupt");
		}

		drive_mem_Type2 y = new drive_mem_Type2();
		y.driver(myMem2);



	}

}