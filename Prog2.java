abstract class Shape
{
	protected String color;
	protected boolean filled;

	public Shape()
	{
		this.color="WHITE";
		this.filled=true;
	}
	
	public Shape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}



	public String getColor()
	{
		return color;
	}


	public void setColor(String color)
	{
		this.color=color;
	}

	public boolean isFilled()
	{
		if(filled == true)
			return true;
		else
			return false;
	}

	public void setFilled(boolean filled)
	{
		this.filled=filled;
	}

	public abstract double getArea();
	public abstract double getPerimeter();
	public String toString()
	{
		return "Shape";
	}
}


class Circle extends Shape
{
	protected double radius;
	public Circle()
	{
		super();
		radius=0.0;
	}
	public Circle(double radius)
	{
		super();
		this.radius=radius;
	}
	
	public Circle(double radius, String color, boolean filled)
	{
		super(color,filled);
		this.radius=radius;
	}

	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius=radius;
	}
	public double getArea()
	{
		return Math.PI*radius*radius;
	}
	public double getPerimeter()
	{
		return 2*Math.PI*radius;
	}

	public String toString()
	{
		return "Circle[radius=" + radius+ "]";
	}
}


class Rectangle extends Shape
{
	protected double width;
	protected double length;
	public Rectangle()
	{
	}
	public Rectangle(double width, double length)
	{
		super();
		this.width=width;
		this.length=length;
	}

	public Rectangle(double width, double length, String color, boolean filled)
	{
		super(color,filled);
		this.width=width;
		this.length=length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width=width;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length=length;
	}
	public double getArea()
	{
		return length*width;
	}
	public double getPerimeter()
	{
		return 2*length*width;
	}

	public String toString()
	{
		return "Rectangle[length=" +length+ ",width=" +width+ "]";
	}
}


class Square extends Rectangle
{
	
	public Square()
	{
		super();
	}
	public Square(double side)
	{
		super(side,side);
		
	}	
	public Square(double side, String color, boolean filled)
	{
		super(side,side,color,filled);
		
	}
	public double getSide()
	{
		return super.getLength();
	}
	public void setSide(double side)
	{
		super.setWidth(side);
		super.setLength(side);
	}
	public void setWidth(double side)
	{
		super.setWidth(side);
	}
	public void setLength(double side)
	{
		super.setLength(side);
	}
	public String toString()
	{
		return "Square[side=" +super.getLength()+ "]";
	}

}




public class Prog2
{
	public static void main(String args[])
	{
		Shape c = new Circle(5.0);
		System.out.println(c.getArea());
           	System.out.println(c);

		Shape r =new Rectangle(5.0,5.0);
		System.out.println(r.getArea());
           	System.out.println(r);

		Shape s =new Square(10.0);
		System.out.println(s.getArea());
           	System.out.println(s);
	}
}
