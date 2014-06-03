package entities;

public class EntityBase
{
	public EntityBase(String name, int xCoordinate, int yCoordinate, int width, int height)
	{
		// sets the name of the entity
		entityName = name;
		
		// sets the hit box of the entity
		xLeft = xCoordinate;
		yUp = yCoordinate;
		xRight = xCoordinate + width;
		yDown = yCoordinate + height;
	}
	
	// initializes a variable to store the name of the entity
	public String entityName;
	
	// initializes the variables that store the info for the entity hit box
	public int xLeft;
	public int yUp;
	public int xRight;
	public int yDown;
}
