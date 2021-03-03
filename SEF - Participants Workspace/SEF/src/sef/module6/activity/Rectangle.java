package activity;

public class Rectangle extends Shape {
    //define parameters
    private double length;
    private double breadth;

    //3. Behavior - default constructor
    public Rectangle(){
        System.out.println("I am a rectangle constructor");
    }
    //3. Behavior - parameterized constructor
    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }
                // I am not sure, if getter and setter are necessary for these values - length and breadth,
                // as they are just numbers, not reference variables
                //getter for Double length
                public double getLength() {return length;}
                // setter for Double length
                public void setLength(double length) {
                    this.length = length;
                }

                // getter for double breadth
                public double getBreadth() {
                    return breadth;
                }

                // setter for double breadth
                public void getBreadth(double breadth) {
                    this.breadth = breadth;
                }


    //4. define method calculateArea()

    public static void calculateArea(double length, double breadth){
       // double length = 5.0;
        //double breadth = 6.0;
        System.out.println("Area is " +(length*breadth));
    }

   public static void main(String[] args) {
        //double calculateArea =new calculateArea;
        //double calculateArea(double [] numbers) {
        //double length = 5;
        //double breadth = 10;
        //double calculateArea = length * breadth;

       Rectangle.calculateArea(5,10);
       //System.out.println("Area of rectangle is " +calculateArea(5,10));
    }


    }

}