public abstract class Polygon extends Figure implements Perimeter {

    private Double[]  Sides ;

    public Polygon( Double[] Sides) {
        this.Sides = Sides;
    }

    public Double[] getSides() {
        return Sides;
    }

    @Override
    public Double getPerimeter() {
        Double res = 0.0;
        for (Double side : Sides) {
            if (side != null)
                res += side;
        }
        return res;
    }
}
