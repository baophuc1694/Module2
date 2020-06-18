package introductionJava.baitap.ComparableCircle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    public ComparableCircle(){
    }
    public ComparableCircle(double radius){
        super(radius);
    }
    public ComparableCircle(double radius, String color, boolean filled){
        super(radius, color, filled);
    }
    @Override
    public int compareTo(ComparableCircle a){
        if (getRadius() > a.getRadius()) return 1;
        else if (getRadius() < a.getRadius()) return -1;
        else return 1;
    }
}
