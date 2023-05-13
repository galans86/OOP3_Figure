public class Rectangle extends Polygon{

    public Rectangle(Double width, Double height) {
        super(new Double[]{width, height, width, height});

        if (width <= 0.0 || height <= 0.0 || width == height)
            System.out.println("Это не прямоугольник или стороны неверны!"); ;

    }

    public Rectangle(Double width) {
        super( new Double[]{width, width, width, width});
        if (width <= 0.0)
            System.out.println("Стороны неверны!"); ;
    }
    @Override
    public Double getArea() {
        return getSides()[0] * getSides()[1];
    }
}
