class student {
    private int Area;
    private int radius;
     public int getRadius(){
    return radius;
    }
    public void setRadius(int r){
        radius= r;
    }
    public void setArea(int a){
        Area=a;
    }
    public int getArea(){
        return Area;
    }
}


public class firstClass {
    public static void main(String[] args) {
        System.out.println("this is our custom class");
        student circle= new student();
       // zaara.id=12;
       // zaara.name="codewithzaara";
       circle.setArea(45);
        System.out.println("the area is "+circle.getArea());
        circle.setRadius(22);
        System.out.println("the radius is "+circle.getRadius());
    }
}