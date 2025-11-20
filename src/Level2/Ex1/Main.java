package Level2.Ex1;

public class Main {
    public static void main(String[] args) {
        byte age = Input.readByte("Enter your age: ");
        System.out.println("Your age is: " + age);

        char c = Input.readChar("Enter the firs chacracter of your name: ");
        System.out.println("The first character of your name is: " + c);

        int i = Input.readInt("Enter an integer number: ");
        System.out.println("The number you entered is: " + i);

        float f = Input.readFloat("Enter a float number: ");
        System.out.println("The number you entered is: " + f);

        double d = Input.readDouble("Enter a double number: ");
        System.out.println("The number you entered is: " + f);

        String s = Input.readString("Enter your favorite season: ");
        System.out.println("Your favorite season is: " + s);

        boolean b = Input.readSiNo("Is a sunny day?");
        System.out.println("The answer is: " + (b ? "Yes" : "No"));

    }
}
