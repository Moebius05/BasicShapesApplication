import java.util.ArrayList;
import java.util.List;

public class BasicShapesApplication {

    public static void main(String[] args) {
        Shape   Circle;
        Circle = new Shape()     {
            public  String  toString(){
                return  "circle";
            }
            @Override
            public  String  getName() {
                return "circle";
            }
        };
        System.out.println(Circle.getName());
        Shape   Square;
        Square = new Shape()     {
            public  String  toString(){
                return  "square";
            }
            @Override
            public String getName() {
                return "square";
            }
        };
        System.out.println(Square.getName());
        Shape   Triangle;
        Triangle = new Triangle()  {
            public  String  toString(){
                return  "triangle";
            }
            public String getName(){
                return "triangle";
            }
        };
        System.out.println(Triangle.getName());

        List<Shape> meineListe = new ArrayList<>();
        meineListe.add(Circle);
        meineListe.add(Square);
        meineListe.add(Triangle);

        System.out.println(meineListe.toString());

        for (Shape item : meineListe){
            System.out.println(item.toString());
        }
    }
}
