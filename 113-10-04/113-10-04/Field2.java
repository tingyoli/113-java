class Clothes2{
    String color;
    char size;

    Clothes2(String color,char size) {
        this.color = color;
        this.size = size;
    }

    void chageColor(String color){
        this.color = color;
    }

    
}
public class Field2 {
    public static void main(String[] args) {
        Clothes2 sun = new Clothes2("red",'s');
        Clothes2 spring = new Clothes2("green", 'M');

        spring.chageColor("yellow");
        System.out.printf("sun(%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring(%s, %c)%n", spring.color, spring.size);
    }
    
}
