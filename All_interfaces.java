// CONCEPTS INVOLVED: INTERFACE , INTERFACES CAN BE EXTENDED


interface Memory
{
	void out_Data(int addr);                  // READ DATA STORED AT ADDRESS
	void write_Data();                        // WRITE DATA TO MEMORY REGISTERS
}


interface Memory_with_Reset extends Memory
{
	void reset_memory();                      // RESET ALL DATA TO ZERO
}







