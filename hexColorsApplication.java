package hexColors;

public class hexColorsApplication {

	String red;
	String green;
	String blue;

	
	String hexRGB ="#";
	
	public void stringCharCounter(String name)
	{
		if(name.length() < 15)
		{
			name = "0" + name;
			System.out.println("name: " + name);
		}
	}
	
	public String inputValues(int value)
	{
		String decToHexa = null;
		String remainderToHexa = null;
		
		
		if((value < 0) ||(value > 255))
		{
			System.out.println("Please enter values between 0 and 255.");
			return "Please enter values between 0 and 255.";

		} 
		else
		{
			//int value16 = value/16;
			//System.out.println("Value16: " + value16);
			
			if(value <= 9)
			{
				System.out.println(value);
				stringCharCounter(String.valueOf(value));
				return String.valueOf(value);
			}
			if((value > 9) || (value < 16))
			{
				switch(value) 
				{
				case 10:
					decToHexa = "A";
					break;
				case 11:
					decToHexa = "B";
					break;
				case 12:
					decToHexa= "C";
					break;
				case 13:
					decToHexa= "D";
					break;
				case 14:
					decToHexa = "E";
					break;
				case 15: 
					decToHexa = "F";
				}
				
					System.out.println(decToHexa);
					stringCharCounter(decToHexa);
					return "decToHexa";
			}
		}

	
		return "0";
	
	}
}
