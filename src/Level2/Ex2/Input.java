package Level2.Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        byte input = 0;
        boolean validInput = false;

        while(!validInput) {
            System.out.println(message);

            try {
                input = sc.nextByte();
                validInput = true;

            } catch (InputMismatchException e) {
                System.err.println("Exception catched: " + e.getMessage());
                System.out.println("Enter again...");

            } finally {
                sc.nextLine();
            }
        }
        return input;
    }

    public static int readInt(String message) {
        int input = 0;
        boolean validInput = false;

        while(!validInput) {
            System.out.println(message);

            try {
                input = sc.nextInt();
                validInput = true;

            } catch (InputMismatchException e) {
                System.err.println("Exception catched: " + e.getMessage());
                System.out.println("Enter again...");

            } finally {
                sc.nextLine();
            }
        }
        return input;
    }

    public static float readFloat(String message) {
        float input = 0;
        boolean validInput = false;
        while(!validInput) {
            System.out.println(message);
            try {
                input = sc.nextFloat();
                validInput = true;

            } catch (InputMismatchException e) {
                System.err.println("Exception catched: " + e.getMessage());
                System.out.println("Enter again...");
            } finally {
                sc.nextLine();
            }
        }
        return input;
    }

    public static double readDouble(String message) {
        double input = 0;
        boolean validInput = false;
        while(!validInput) {
            System.out.println(message);
            try {
                input = sc.nextDouble();
                validInput = true;

            } catch (InputMismatchException e) {
                System.err.println("Exception catched: " + e.getMessage());
                System.out.println("Enter again...");

            } finally {
                sc.nextLine();
            }
        }
        return input;
    }

    public static char readChar(String message) {
        char c = '\0';
        boolean validInput = false;
        while(!validInput) {
            System.out.println(message);
            try {
                String input = sc.nextLine();

                if(input.isEmpty()) throw new Exception("Empty input");

                c = input.charAt(0);
                validInput = true;

            } catch (Exception e) {
                System.err.println("Exception catched: " + e.getMessage());
                System.out.println("Enter again...");
            }
        }
        return c;
    }

    public static String readString(String message) {
        String input = "";
        boolean validInput = false;
        while(!validInput) {
            System.out.println(message);
            try {
                input = sc.nextLine();
                validInput = true;

            } catch (Exception e) {
                System.err.println("Exception catched: " + e.getMessage());
                System.out.println("Enter again...");
            }
        }
        return input;
    }

    public static boolean readSiNo(String message) {
        String input = "";
        boolean ret = false;
        boolean validInput = false;
        while(!validInput) {
            System.out.println(message + "(Y/y/ -> yes / N/n -> no)");
            try {
                input = sc.nextLine();

                if(input.isEmpty()) throw new Exception("Empty Input");

                ret = switch (input.toLowerCase().charAt(0)) {
                    case 'y' -> {
                        validInput = true;
                        yield true;
                    }
                    case 'n' -> {
                        validInput = true;
                        yield false;
                    }
                    default -> throw new Exception("Unexpected value: " + input.toLowerCase().charAt(0));
                };

            } catch (Exception e) {
                System.err.println("Exception catched: " + e.getMessage());
                System.out.println("Enter again...");
            }
        }
        return ret;
    }

    public static void closeInput() {
        sc.close();
    }
}
