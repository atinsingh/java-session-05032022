public class Demo {
   private String name;
   private int age;
   private Double balance;

    public Demo(String name) {
        this.name = name;
    }

    public Demo(){
      this("Atin");
    }

    public Demo(Double balance) {
        this.balance = balance;
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        System.out.println(demo);
    }


}
