class Rectangle{
    duoble length;
    double width;
    double area;
    string color;


    public void set_length (double l){
        lenght = l;
    }

    public void set_length (double w){
        width = w;
    }
    public void find_area() {
        area = length*width;
    }
}

public class Ex6
{
    public static void main(String[] args){
        Rectangle r1 = new Reactangle ();
        r1.set_lenght(5);
        r1.set_width(10);
        r1.findarea();
        r1.color ="red";

        Reactangle r2 = new Reactangle();
        r2.set_lenght(5);
        r2.set_width(10);
        r2.findarea();
        r2.color = "red";

        
        if(r1.area == r2.area && r1.color.equals(r2.color)) {
            System.out.println("Matching Rectangles.");
    }
}
