package java102;

import java.util.ArrayList; 

public class Main{
    Point point = new Point(4, 3);
    System.out.println("x: " + point.x + "y: " + point.y);

    Point xTranslation = point.translateX(3); // should be (7, 3)
    Point yTranslation = point.translateY(-7); // should be (4, -4)
    Point xyTranslation = point.translateX(-4).translateY(-3); // should be (0, 0)  
    
    System.out.println("x transl: " + xTranslation);
    System.out.println("y transl: " + yTranslation);
    System.out.println("xy transl: " + xyTranslation);

    System.out.println("point: " + point);

    System.out.println("x transl: " + xTranslation);
    System.out.println("y transl: " + yTranslation);
    System.out.println("xy transl: " + xyTranslation);

    Point a = new Point(4, 6)
    Point b = new Point(9, 10)
    System.out.println(Point.distance(a, b));

    ArrayList<String> arr = new ArrayList<>();
    arr.add("Hello");
    arr.add("World");
    System.out.println(arr);
    arr.set(0, "Goodbye");
    System.out.println(arr);

    ArrayList<Boolean> conditions = new ArrayList<>();
    conditions.add(true);
    conditions.add(arr.get(0) == "Hello");
    conditions.add(conditions.get(0) || conditions.get(1));
    
    ArrayList<Integer> intArr = new ArrayList<>();
    for (int i = 0; i < 50; i++) {
	intArr.add(0);
    }
    System.out.println(intArr.size());
    System.out.println(intArr.get(32));

    Grid<Integer> grid = new Grid<>(5, 0);
    grid.set(2, 2, 4);
    System.out.println(grid);

    static <T> String arrayToString(T[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length - 1; i++) {
            str += arr[i] + ", ";
        }
        return str + arr[arr.length - 1] + "]";
    }

    // Practice: Diagonal 
    public class Grid<T> {
        private ArrayList<ArrayList<T>> data;

        public Grid(ArrayList<ArrayList<T>> data) {
            this.data = data;
        }
    }   

    static double sumArea(Shape[] shapes) {
        double sum = 0;
        for (Shape shape : shapes) {
            sum += shape.area();
        }
        return sum;
    }
    Shape[] shapes = {new Circle(new Point(1.8, -20), 2), 
        new Square(new Point(100, 2.1), 5.4),
        new Circle(new Point(0, 0), 1),
        new Circle(new Point(4, 9.123), 98.32),
        new Square(new Point(-321, 0), 0.02)};
    System.out.println(sumArea(shapes));

    static Shape[] scaleAll(Shape[] shapes, double k) {
        Shape[] scaled = new Shape[shapes.length];
        for (int i = 0; i < shapes.length; i++) {
            scaled[i] = shapes[i].scale(k);
        }
        return scaled;
    }

    public static void returnAll(LibraryItem[] items) {
        for (LibraryItem item : items) {
            item.returnItem();  // Mark each item as returned
            System.out.println(item.title + " has been returned.");
        }
    }

    // Practice: returnAll 
    public static void main(String[] args) { 
        
        LibraryItem book1 = new LibraryItem("Rabbit", "B001");
        LibraryItem dvd1 = new LibraryItem("Cat", "D001");

        book1.isCheckedOut = true;
        dvd1.isCheckedOut = true;

        LibraryItem[] items = {book1, dvd1};

        returnAll(items);
    }

    // Practice: availableItems
    public class LibraryItem {
    
        public static ArrayList<LibraryItem> availableItems(LibraryItem[] items) {
            boolean isCheckedOut = false;
            public LibraryItem(String title, String itemId) {
                this.title = title;
                this.itemId = itemId;
            }
        
            public boolean available() {        <- checking 
                return !isCheckedOut;
            }
        
            // Method to mark the item as returned
            public void returnItem() {
                isCheckedOut = false;            <- returned books
            }
        
            // Method to mark the item as checked out
            public void checkOut() {
                isCheckedOut = true;             <- checked out
            }
        }
    }
}
