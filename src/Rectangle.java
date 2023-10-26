public class Rectangle extends Geometric {
    private double side1;
    private double side2;
    private double side3;
    private double side4;

    public Rectangle() {

    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }
    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3() {
        this.side3 = this.side1;
    }

    public void setSide4() {
        this.side4 = this.side2;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide4() {
        return side4;
    }

    @Override
    public double Perimeter() {
        return (side1 + side2 + side3 + side4);
    }

    @Override
    public double Size() {
        return side1*side2;
    }

    public Rectangle (double side1, double side2) {
        setSide1(side1);
        setSide2(side2);
        setSide3();
        setSide4();

        for (int i = 0; i < getSide1(); i++) {
            for (int j = 0; j < getSide2(); j++) {
                System.out.print("*\t");
            }
            System.out.println();

        }
        System.out.println("Периметр фигуры равен: " + Perimeter());
        System.out.println("Площадь фигуры составляет: " + Size());
        System.out.println("Длина сторон фигуры: " + getSide1() + " " + getSide2() + " " + getSide3() + " " + getSide4());
    }

}


