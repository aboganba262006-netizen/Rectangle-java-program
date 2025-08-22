class Main {
 public static void main(String[] args) {
        
        Rectangle r1 = new Rectangle();
        
        r1.setlength(5);
        r1.setwidth(10.5);
        
        System.out.println("length = " + r1.getlength());
        System.out.println("width = " + r1.getwidth());
        System.out.println("area = " +r1.getarea());
    }
}
 class Rectangle {
    private double length;
    private double width;
    
    public void setlength(double l) {
        length = l;
    }
    public void setwidth(double w) {
        width = w;
    }
    public double getlength() {
        return length;
    }
    public double getwidth() {
        return width;
    }
    public double getarea() {
        return length*width;
    }
}