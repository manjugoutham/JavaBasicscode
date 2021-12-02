package bridgelabz.com;

abstract class Shape {
	
	abstract void draw();

}

class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("drawing the rectangle shape");
	}
}

class Circle extends Shape
{
	void draw()
	{
		System.out.println("drawing the circle shape");
	}
}
