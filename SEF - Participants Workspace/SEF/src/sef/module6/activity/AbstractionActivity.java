package activity;

public class AbstractionActivity {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.setColor("black");
        System.out.println("rectangle----------------------------");
        print(rectangle);
    }
        private static void print (Shape shape){
            System.out.println("Shape's area is : " +Shape.calculateArea());
        }


        //shape area
        Rectangle.calculateArea(5, 10);

        //shape color
        Shape c = new Shape;
        c.setColor = "black";
        System.out.println("Shape's color is : " +c.setColor("black"));

            }
}
