import java.util.Scanner;
class vehicle {
   protected String brand = "FORD";// setting this brand name to protected which means only the myCar class can inherit it

    public void honk() {
        System.out.println("tututututytttttt");
    }

    public void wheel() {
        System.out.println("cast iron");
    }

    public void glass() {
        System.out.println("diamond cut");
    }
}
class myCar extends vehicle{
    String car_name="Mustang";// attributes of myCar

    public static void main(String[] args) {
        myCar car=new myCar(); //making car object of mycar class
        System.out.println("my new car is " +car.car_name+" of the brand "+ car.brand);
        System.out.println("the amazing features is hold are ");
        car.honk();//calling the method by using car object of myCar
        car.glass();
        car.wheel();
    }
}