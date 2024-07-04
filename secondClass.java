class MyMainEmployee {
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 45;
        name = "your-name";
    }
    public String getName(){ return name;}
    public void setName(String n){ this.name=n;}
    public void setId(int i){ this.id=i;}
    public int getId(){ return id;}

    }
public class secondClass {
    public static void main(String[] args) {
        MyMainEmployee zaara = new MyMainEmployee();
        //zaara.setName("codewithzaara");
        //zaara.setId(34);
        System.out.println(zaara.getId());
        System.out.println(zaara.getName());
    }
}
