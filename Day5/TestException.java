class TestException
{
	public static void main(String[] args)
		{
		try{
			m1();
			System.out.println("The End");
		}
}
	

	static void m1()
    		{
			m2();
			System.out.println("m1 over");
		}			
	static void m2()
		{
			m3();
			System.out.println("m2 over");
		}

	
	static void m3() 
		{
			throw new NullPointerException(); 
		}
		
}
}