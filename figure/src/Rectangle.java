public class Rectangle extends Shape{
    int rectangleLeftX;
    int rectangleRightX;
    int rectangleDownY;
    int rectangleUpY;
    @Override
    public void draw() {
        String picture = " ";
        for (int i = 1; i <= rectangleLeftX + rectangleRightX; i++){
            picture = picture + "@";
        }
        picture = picture + " ";
        for (int i = 1; i <= rectangleUpY + rectangleDownY; i++){
            System.out.println(picture);
        }
    }

    @Override
    public boolean equals(Shape figure) {
        if((figure instanceof Rectangle) && (this.Color == figure.Color) && (this.rectangleLeftX == ((Rectangle) figure).rectangleLeftX
        && this.rectangleRightX == ((Rectangle) figure).rectangleRightX && ((Rectangle) figure).rectangleUpY == this.rectangleUpY
        && this.rectangleDownY == ((Rectangle) figure).rectangleDownY)){
            return true;
        }
        else return false;
    }

    public Rectangle(int rectangleLeftX, int rectangleRightX, int rectangleDownY, int rectangleUpY){
        this.rectangleLeftX = rectangleLeftX;
        this.rectangleRightX = rectangleRightX;
        this.rectangleDownY = rectangleDownY;
        this.rectangleUpY = rectangleUpY;
    }

}
