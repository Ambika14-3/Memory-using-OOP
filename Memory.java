// CONCEPTS INVOLVED: INTERFACE , INTERFACES CAN BE EXTENDED


interface Memory
{
	int out_Data(int addr);
	void write_Data();
}

interface Memory_with_Reset
{
	void reset_memory();
}