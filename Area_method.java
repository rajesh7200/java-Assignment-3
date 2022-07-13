class Area_method
{
    static void circle_area()
    {
      int redius=10;
	  double area=3.14*redius*redius;
      System.out.println("The area of Circle is "+area);
	}


static void ellipse_area()
    {
         int minar_axis=10,major_axis=20;
	    double area=3.14*minar_axis*major_axis;
		System.out.println("The area of ellipse is "+area);
	}



 static void parallelogram_area()
    {
         int base=10,height=20,area=0;
         area=base*height;
		System.out.println("The area of Parallelogram is "+area);

	}


    static void rectangle_Area()
    {
         int width=10,height=20;
        double area=width*height;
		System.out.println("The area of Rectangle is "+area);
   
	}



    static void sector_area()
    {
        double redius=10,angle=30,area=0;
        area=0.5*redius*redius*(angle/360);
		System.out.println("The area of Sector is "+area);

   
	}



    static void trapezoid_area()
    {
        int side_a=10,side_b=12,height=10;
        double area=0.5*(side_a+side_b)*height;
	    System.out.println("The area of Trapezoid is "+area);

   
	}



    static void triangle_area()
    {
        int base=5,height=10;
	    double area;
        area=0.5*base*height;
		System.out.println("The area of Triangle is "+area);
   
	}


    static void squre_area()
    {
        int side=10;
    	int area=side*side;
		System.out.println("The area of Squre is "+area);

   
	}



	public static void main(String [] args)
	{
	    circle_area();
        ellipse_area();
        parallelogram_area();
        rectangle_Area();
        sector_area();
        trapezoid_area();
        triangle_area();
        squre_area();

	}

};
