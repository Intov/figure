public class Circle extends Shape {
    int circleLeftX;
    int circleRightX;
    @Override
    public void draw() {
        String pictureOne = "   ";
        String pictureTwo = "  ";
        String pictureThree = " ";
        for (int i = 1; i <= circleLeftX + circleRightX - 4; i++) {
            pictureOne = pictureOne + "@";
        }
        pictureOne = pictureOne + "   ";
        for (int i = 1; i <= circleLeftX + circleRightX - 2; i++){
            pictureTwo =  pictureTwo + "@";
        }
        pictureTwo = pictureTwo + "  ";
        for (int i = 1; i <= circleLeftX + circleRightX; i++){
            pictureThree =  pictureThree + "@";
        }
        pictureThree = pictureThree + " ";
        System.out.println(pictureOne);
        System.out.println(pictureTwo);
        System.out.println(pictureThree);
        System.out.println(pictureThree);
        System.out.println(pictureTwo);
        System.out.println(pictureOne);

    }

    @Override
    public boolean equals(Shape figure) {
        if((figure instanceof Circle) && (this.Color == figure.Color) && (this.circleLeftX == ((Circle) figure).circleLeftX && this.circleRightX == ((Circle) figure).circleRightX)){
            return true;
        }
        else return false;
    }

    public Circle(int circleLeftX, int circleRightX){
        this.circleLeftX = circleLeftX;
        this.circleRightX = circleRightX;

    }

}
