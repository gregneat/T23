// something wrong with modulo.  maybe rethink using modulo to space cars.


public class starter implements InputControl {
	
	private static Truck[] traffic;
	private static Truck joe;
	private static Car c1;
	private static Car c2;
	private static Truck t3;
	private static Truck t4;
	
	public static void main(String args[])
        {
			// following line is necessary for onMouseClick, don't change
			MouseController mC = new MouseController(Canvas.getInstance(),new starter());
	
			int r = (int)(Math.random()*255);
			int g = (int)(Math.random()*255);
			int b = (int)(Math.random()*255);
			Color temp = new Color(r,g,b);
			joe = new Truck(5,10,"neato",temp,23);
			
			// next vehicle
			
			r = (int)(Math.random()*255);
			g = (int)(Math.random()*255);
			b = (int)(Math.random()*255);
			temp = new Color(r,g,b);
			int sp = (int)(Math.random()*5)+1;
			int yStart = 11;
			while(yStart%Truck.TRUCKHEIGHT != 0)
				{
					yStart++;
				}
			c1 = new Car(5,yStart,"vehicle 1",temp,sp);
			
			// next vehicle
			
			r = (int)(Math.random()*255);
			g = (int)(Math.random()*255);
			b = (int)(Math.random()*255);
			temp = new Color(r,g,b);
			sp = (int)(Math.random()*5)+1;
			yStart++;
			while(yStart%Car.CARHEIGHT != 0)
				{
					yStart++;
				}
			t3 = new Truck(5,yStart,"vehicle 3",temp,sp);
			
			// next vehicle
			
			r = (int)(Math.random()*255);
			g = (int)(Math.random()*255);
			b = (int)(Math.random()*255);
			temp = new Color(r,g,b);
			sp = (int)(Math.random()*5)+1;
			yStart++;
			while(yStart%Truck.TRUCKHEIGHT != 0)
				{
					yStart++;
				}
			t4 = new Truck(5,yStart,"vehicle 4",temp,sp);
			
			// next vehicle
			
			r = (int)(Math.random()*255);
			g = (int)(Math.random()*255);
			b = (int)(Math.random()*255);
			temp = new Color(r,g,b);
			sp = (int)(Math.random()*5)+1;
			yStart++;
			while(yStart%Truck.TRUCKHEIGHT != 0)
				{
					yStart++;
				}
			c2 = new Car(5,yStart,"vehicle 5",temp,sp);
			
			while(true)
			{
				joe.translate(joe.getSpeed(),0);
				if(joe.getX() > 570)
				{
					joe.translate(-570,0);
				}
				c1.translate(c1.getSpeed(),0);
				if(c1.getX() > 570)
				{
					c1.translate(-570,0);
				}
				t3.translate(t3.getSpeed(),0);
				if(t3.getX() > 570)
				{
					t3.translate(-570,0);
				}
				t4.translate(t4.getSpeed(),0);
				if(t4.getX() > 570)
				{
					t4.translate(-570,0);
				}
				c2.translate(c2.getSpeed(),0);
				if(c2.getX() > 570)
				{
					c2.translate(-570,0);
				}
				Canvas.pause(10000);
			}	
		}

		public void onMouseClick(double x, double y)
		{
			if(joe.contains(x,y))
			{
				joe.changeSpeed(0);
			}
			if(c1.contains(x,y))
			{
				c1.changeSpeed(0);
			}
			if(t4.contains(x,y))
			{
				t4.changeSpeed(0);
			}
			if(t3.contains(x,y))
			{
				t3.changeSpeed(0);
			}
			if(c2.contains(x,y))
			{
				c2.changeSpeed(0);
			}
			
				// if(traffic[i].contains(x,y))
				// {				
					// traffic[i].changeSpeed(0);
					// System.out.print(traffic[i].getName() + " " +traffic[i].getSpeed());
				// }
			
		}
}
