import io.pragra.learning.Calculator;

public class Demo {
   private String name;
   private int age;
   private Double balance;

    public Demo(String name, int age, Double balance) {
        this.name = name;
        this.age = age;
        this.balance = balance;
    }

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

        Calculator calculator = new Calculator();
        System.out.println(calculator.sum(2, 2,7));
        String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin nisl ex, ultricies vitae egestas et, lobortis sit amet velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Vivamus placerat sem quis semper rhoncus. Aenean lacus nisi, dictum vitae pulvinar et, mattis et mi. Quisque ut arcu in elit rutrum ultricies. Proin iaculis mauris consequat leo luctus, eget porttitor tortor mattis. Vestibulum ut euismod nulla, ac tempus libero. Aenean molestie, odio a ornare rhoncus, ipsum purus eleifend lacus, et accumsan sem enim eu nisl. Duis condimentum, nunc a aliquet semper, ipsum sapien aliquet mi, luctus commodo velit turpis sit amet quam. Etiam felis nisi, ornare et condimentum id, pharetra ut ante. Ut vehicula scelerisque dapibus. Curabitur blandit quis erat vel tempor. Donec fermentum purus eget eros porta malesuada";
        String[] split = str.split(" ");
        int wordCount = 0;
        for( String st : split) {
            if(st.length()>=5) {
                wordCount++;
            }
        }

        char[] chars = str.toCharArray();
        int charCount = 0;
        for( char c : chars) {
            if( c == 'A' || c=='a'){
                charCount++;
            }
        }

        String upperCase = str.toUpperCase();
        // i am a java lover;
        int newCharCount = 0;
        while (upperCase.indexOf("A")!= -1) {
            newCharCount++;
            upperCase = upperCase.substring(upperCase.indexOf("A")+1);
        }


        System.out.println("Total Words >= 5  : " + wordCount );

    }


}
