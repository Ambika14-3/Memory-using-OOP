//CONCEPTS INVOLVED: IMPLENTATION OF INTERFACES, INHERITANCE, EXTENSION OF INTERFACE, ADDING A METHOD NOT DEFINED IN INTERFACE, POLYMORPHISM


import java.util.Scanner;


// LEARNT : IMPLENTATION OF INTERFACES


// IMPLEMENTATION OF MEMORY OF TYPE1 : HAVING WRITE AND READ PORTS
class mem_Type1 implements Memory
{


	int mem[] = new int[4];
			

	public void write_Data()
	{
		Scanner take_ip = new Scanner(System.in);
		
		for(int i = 0; i<4; i++)
		{
			System.out.print("Enter value for address " + i + ": ");
			mem[i] = take_ip.nextInt();
		}
		System.out.println();
	}

	
	public int out_Data(int addr)
	{
		System.out.println("Value of memory at address: " + mem[addr] );
		return mem[addr];
	}	

	


}




// LEARNT: INHERITANCE, EXTENSION OF INTERFACE

// IMPLEMENTATION OF MEMORY OF TYPE2 : HAVING WRITE, READ AND RESET PORTS
class mem_Type2 extends mem_Type1 implements Memory_with_Reset
{
	
	public void reset_memory()
	{
		for(int i = 0; i<4; i++)
		{
			mem[i] = 0;
		}
		System.out.println();
		System.out.println("oooooooooooooooo All memory registers are reset oooooooooooooooo");
		System.out.println();
	}


}






// LEARNT: POLYMORPHISM (SAME INTERFACE, DIFFERENT IMPLEMENTATION) , ADDING A METHOD NOT DEFINED IN INTERFACE


// IMPLEMENTATION OF MEMORY OF TYPE3 : HAVING WRITE AT A PARTICULAR ADDRESS, READ AND RESET PORTS
class mem_Type3 implements Memory_with_Reset
{

	int mem[] = new int[4];
			

	public void write_Data()
	{
		Scanner take_ip = new Scanner(System.in);
		
		System.out.print("At which address ? : ");
		int addr = take_ip.nextInt();
		
		System.out.print("Write the value to be stored in at memory["+ addr + "]: ");
		
		int val = take_ip.nextInt();

		mem[addr] = val;

		System.out.println("Value at address: " + addr + " is " + mem[addr] );
		System.out.println();
	}
	
	public int out_Data(int addr)
	{
		System.out.println("Value of memory at address: " + mem[addr] );
		return mem[addr];
	}	

	public void reset_memory()
	{
		for(int i = 0; i<4; i++)
		{
			mem[i] = 0;
		}
		System.out.println("All memory registers are reset");
		System.out.println();
	}

	



	public void display_content()
	{
		System.out.println();
		System.out.println("xxxxxxxxxxx Displaying contents of memory xxxxxxxxxxxxx");

		for(int i = 0; i<4; i++)
		{
			System.out.println("Memory[" + i + "] ::: " + mem[i]);
		}
	}




}