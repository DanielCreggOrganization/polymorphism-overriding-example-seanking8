
public class TwoDShape {

    private int sides;
    private int area;
    private int perimiter;

    TwoDShape(int area, int perimiter){
        this.area = area;
        this.perimiter = perimiter;
    }

    public int findArea(){
        return this.area;
    }

    public void setPerimiter(int perimiter){
        this.perimiter = perimiter;
    }
}