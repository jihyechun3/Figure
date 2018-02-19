package cs113hw3project01;

public class FigureMain 
{

	public static void main(String[] args) 
	{
		Figure rectangleOne = new Rectangle();
		Figure rectangleTwo = new Rectangle();
		Figure triangleOne = new Triangle();
		Figure triangleTwo = new Triangle();
		
		rectangleOne.draw();
		rectangleOne.center();
		
		rectangleTwo.draw();
		rectangleTwo.center();
		
		triangleOne.draw();
		triangleOne.center();
		
		triangleTwo.draw();
		triangleTwo.center();

	}

}
