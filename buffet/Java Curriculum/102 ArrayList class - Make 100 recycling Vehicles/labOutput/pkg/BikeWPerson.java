//HIDE
package pkg;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public class BikeWPerson extends Bicycle
{
	private Ellipse head;
	private Ellipse body;
	private int size;
    
    public BikeWPerson(double x, double y)
    {
		super(x,y);
		size = 0;
		makeBody();	
    }
	public BikeWPerson(double x, double y, String n)
    {
		super(x,y,n);
		makeBody();
    }
	public BikeWPerson(double x, double y, String n, Color c)
    {
		super(x,y,n,c);
		makeBody();
    }
	public BikeWPerson(double x, double y, String n, Color c, int s, int perSize)
    {
		super(x,y,n,c,s);
		size = perSize;
		makeBody();
    }
	public void draw()
	{
		super.draw();
		head.draw();
		body.draw();
	}
	
	private void makeBody()
	{
		head = new Ellipse(super.getX()+super.getWidth()/2,super.getY(),15+size,25+size);
		body = new Ellipse(super.getX()+super.getWidth()/3,super.getY()+head.getHeight()*.75,30+size,45+size);
	}
	
	public void translate(double ex, double why)
	{
		super.translate(ex,why);
		head.translate(ex,why);
		body.translate(ex,why);
	}
	
	public void driveRandom()
	{
		translate(super.getStep(),0);
		if(getX() > 700)
		{
			translate(-1000+Canvas.rand(300),0);
		}
	}
	
    public String toString()
	{
		String temp = "There is a person with size " + size + " on the " +super.toString();
		return temp;
	}
 
}
