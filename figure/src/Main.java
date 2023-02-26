public class Main {
    public static void main(String[] args) {
        Circle circleOne = new Circle(4,4);
        Circle circleTwo = new Circle(6,6);
        Rectangle rectangleOne = new Rectangle(3,3,3,3);
        Rectangle rectangleTwo = new Rectangle(3,3,3,3);

        Shape[] figure = new Shape[] {circleOne,rectangleOne,circleTwo,rectangleTwo};

        for (Shape shape : figure){
            shape.draw();
        }
        System.out.println(circleOne.equals(circleTwo));
        System.out.println(rectangleOne.equals(rectangleTwo));
    }
}