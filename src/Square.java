public class Square extends Rectangle{
    public Square(double side1) {

        setSide1(side1);
        setSide2(side1);
        Rectangle rectangle = new Rectangle(getSide1(),getSide2());
    }
}

