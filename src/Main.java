
import java.util.*;

public class Main {
    public static void main(String[] args) {

    ArrayList<Figure> figDB = new ArrayList<>();
        figDB.add(new Triangle(4.0, 5.0, 7.0));
        figDB.add(new Square(Math.random() * 100));
        figDB.add(new Rectangle(Math.random() * 100, Math.random() * 100));
        figDB.add(new Circle(Math.random() * 100));

        int ex = 1;
   while (ex != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("1.Добавить новую фигуру\n" +
                    "2.Посчитать периметр у всех фигур\n" +
                    "3.Посчитать площадь у всех фигур\n" +
                    "4.Посчитать длины окружностей у всех фигур\n" +
                    "5.Удалить фигуру\n"+
                    "6.Сортировать\n"+
                    "0.Выход");
            ex = scan.nextInt();
            switch (ex) {
                case 1:
                    System.out.println("1.Треугольник\n" +
                            "2.Квадрат\n" +
                            "3.Прямоугольник\n" +
                            "4.Круг");
                    int type = scan.nextInt();
                    switch (type) {
                        case 1:
                            figDB.add(new Triangle(3.0, 4.0, 5.0));
                            break;
                        case 2:
                            figDB.add(new Square(Math.random() * 100));
                            break;
                        case 3:
                            figDB.add(new Rectangle(Math.random() * 100, Math.random() * 100));
                            break;
                        case 4:
                            figDB.add(new Circle(Math.random() * 100));
                            break;
                        default:
                            throw new IllegalStateException("Unexpected value: " + type);
                    }
                    break;
                case 2:
                    for (Figure fig : figDB) {
                        if (fig instanceof Polygon)
                            System.out.println("Периметр " + fig.getClass().getSimpleName() + " = " + ((Polygon) fig).getPerimeter());
                    }
                    break;
                case 3:
                    for (Figure fig : figDB) {
                        System.out.println("Площадь " + fig.getClass().getSimpleName() + " = " + fig.getArea());
                    }
                    break;
                case 4:
                    for (Figure fig : figDB) {
                        if (fig instanceof Circle)
                            System.out.println("Длина окружности = " + ((Circle) fig).getLen());
                    }
                    break;
                case 5:
                    figDB.remove(figDB.size());
                    break;
                case 6:
                    figDB.sort(new AreaComporator());
                    //Collections.sort((List) figDB);
                    for (Figure fig : figDB) {
                        System.out.println("Площадь " + fig.getClass().getSimpleName() + " = " + fig.getArea());
                    }
                    break;
            }

        }

}
}