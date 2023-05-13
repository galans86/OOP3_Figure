public class Triangle extends Polygon {
    public Triangle(Double a, Double b, Double c) {
        super(new Double[]{a, b, c});
        if ((a <= 0.0 || b <= 0.0 || c <= 0.0) || !(a + b > c && a + c > b && b + c > a))
            System.out.println("Неправильные стороны!");
    }

    @Override
    public Double getArea() {
        Double p = super.getPerimeter() / 2;
        // Формула Герона
        return Math.sqrt(p * (p - getSides()[0]) * (p - getSides()[1]) * (p - getSides()[2]));
    }
}