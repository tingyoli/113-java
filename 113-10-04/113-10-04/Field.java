class Clothes{
    String color;
    char size;
}
public class Field {
    public static void main(String[] args) {
        Clothes sun = new Clothes();
        Clothes spring = new Clothes();

        sun.color = "red";
        sun.size = 's';
        spring.color = "green";
        spring.size = 'm';

        System.out.printf("sun(%s, %c)%n", sun.color, sun.size);
        System.out.printf("spring(%s, %c)%n", spring.color, spring.size);
    }
}
