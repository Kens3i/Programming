import java.util.Scanner;

class Overload
{
    double area(float l, float w, float h) {
        return l * w * h;
    }

    double area(float l) {
        return l * l * l;
    }

    double area(float r, float h) {
        return 3.1416 * r * r * h;
    }
}

public class OverloadingVolume {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of Cube:");
        int lc = sc.nextInt();
        System.out.print("Enter the Radius of Cylinder:");
        int lry = sc.nextInt();
        System.out.print("Enter the Height of Cylinder:");
        int lcy = sc.nextInt();
        System.out.print("Enter the Length of Rectangular Box:");
        int lrb = sc.nextInt();
        System.out.print("Enter the Width of Rectangular Box:");
        int lwb = sc.nextInt();
        System.out.print("Enter the Height of Rectangular Box:");
        int lhb = sc.nextInt();
        Overload overload = new Overload();
        double cube = overload.area(lc);
        System.out.println("Area of Cube is " + cube);
        System.out.println("");
        double cylinder = overload.area(lry, lcy);
        System.out.println("Area of Cylinder is " + cylinder);
        System.out.println("");
        double rectangleBox = overload.area(lrb, lwb, lhb);
        System.out.println("Area of Rectangular box is " + rectangleBox);
    }
}