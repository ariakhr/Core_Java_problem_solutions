import java.util.Arrays;

public class VarargsExample {

    public static void main(String args[]) {
        print(101,"Beck","Ethan","Luca","Mark");
    }

    public static void print(int id, String...args) {
        System.out.println("Id :" + id);
        Arrays.stream(args).forEach(a-> System.out.println(a));
    }
}
