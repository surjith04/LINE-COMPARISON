
public class LineCompare {
    private double x,y;
    public LineCompare(double x1, double y1) {
        x = x1;
        y = y1;
    }
    public double distance(LineCompare p) {
        return Math.sqrt( Math.pow(p.x - x,2) + Math.pow(p.y -y,2) );
    }
    public static void main(String[] args) {
        LineCompare point1_line1= new LineCompare(2,1);
        LineCompare point2_line1= new LineCompare(8,2);
        double line1 = point1_line1.distance(point2_line1);
        System.out.println("Length of First Line : " + line1);
        LineCompare point1_line2= new LineCompare(2,0);
        LineCompare point2_line2= new LineCompare(5,1);
        double line2 = point1_line2.distance(point2_line2);
        System.out.println("Length of Second Line : " + line2);
        System.out.println("Using Equals Method");
        if(Double.toString(line1).equals(Double.toString(line2)))
        {
            System.out.println("Two Lines are Equal");
        }
        else {
            System.out.println("Two Lines are Not Equal");
        }
        System.out.println("Using CompareTo Method");
        Integer Value = (Double.toString(line1).compareTo(Double.toString(line2)));
        if(Value >= 1)
        {
            System.out.println("Line 1 is Greater");
        }
        else if (Value < 0 )
        {
            System.out.println("Line 2 is Greater");
        }
        else
        {
            System.out.println("Lines are Equal");
        }
    }
}