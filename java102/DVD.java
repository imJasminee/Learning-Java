package java102; 

public class DVD extends LibraryItem {
    public final double runtime;

    public DVD(String title, String itemId, double runtime) {
        super(title, itemId);
        this.runtime = runtime;
    }

    @Override
    public String toString() {
        return "DVD: " + title + ", Runtime: " + runtime + " minutes";
    }
}