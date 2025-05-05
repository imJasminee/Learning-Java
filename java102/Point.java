package java102;

public class Point {
	public final double x;
	public final double y;

	public Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Point translateX(double t) {
		return new Point(x + t, y);
	}
	
	public Point translateY(double t) {
		return new Point(x, y + t);
	}

	@Override
	public String toString() {
		return "(" + x + ", " + y + ")";
	}

	public static double distance(Point p1, Point p2) {
		return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
	}
    public static Point centerOfMass(Point[] points);
    double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // #1: Center of Mass 
    public static Point centerOfMass(Point[] points) {
        double sumX = 0, sumY = 0;

        for (int i = 0; i < points.length; i++) {
            sumX += p.x;
            sumY += p.y;
        }
        return new Point
    }

    // #2: Angle 
    public class Point {
        private double x;
        private double y;
    
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    
        public double angle() {
            double radians = Math.atan2(y, x);  
            double degrees = Math.toDegrees(radians);
    
            if (degrees < 0) {
                degrees += 360;
            }
    
            return degrees;
        }
    }
    
}
