package cs113hw3project01;

public class Rectangle extends Figure
{
	// create method that prints a
	// class and method information 
	// message.
	public void draw()
	{
		System.out.println("Entering draw() "
		+ "method for Rectangle.");			
	}
				
	public void erase()
	{
		System.out.println("Entering erase() "
		+ "method for Rectangle.");	
	}
	
	public void center()
	{
		System.out.println("Entering center() "
		+ "method for Rectangle.");
		
		draw();
		erase();
	}
	
	public String toString()
	{
		return "'toString' method has been invoked.";
	}

	public boolean equals() 
	{
		return true;
	}			
	
}
