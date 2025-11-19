# 🛡️ Java Exceptions & Input Handling

## 📄 Description
This repository contains a set of practical Java exercises designed to master **Error Handling** and **Robust User Input**. The goal is to practice creating custom exceptions, managing the Java Exception hierarchy, and building static utilities to validate user input via `Scanner`, ensuring application stability against invalid data formats.

## 📚 Exercise Details

### Level 1: Custom Exceptions & Collections
**Exercise 1: Sales Management**
The objective is to manage a list of products and handle errors when attempting to process empty sales.

* **Classes:**
    * `Product`: Attributes include `name` and `price`.
    * `Sale`: Contains a collection of products and a `totalPrice`.
* **Logic:**
    * The `Sale` class has a method `calculateTotal()`.
    * If the product collection is empty, it must throw a custom exception named **`EmptySaleException`**.
    * If products exist, it iterates through the collection to sum the prices.
* **Exception Handling:**
    * `EmptySaleException` must extend the standard `Exception` class.
    * The constructor accepts the message: *"To make a sale you must first add products"*.
    * The main execution must catch this exception and print the message using `getMessage()`.
* **Additional Task:** Write code to deliberately generate and catch an `IndexOutOfBoundsException` (e.g., accessing an array index that does not exist).



### Level 2: Robust Input Control
**Exercise 1: The Input Class**
The goal is to create an `Input` class that wraps the Java `Scanner` to handle data entry errors gracefully. If a user enters the wrong data type, the application should catch the exception, display an error, and ask for the data again until it is correct.

* **Implementation:**
    * Instantiate a `Scanner` object.
    * Create static methods to read different data types.
    * **Behavior:** If an exception (like `InputMismatchException`) occurs (e.g., entering a string when an integer is expected), catch it, print a format error, and loop until valid data is entered.
* **Required Methods:**
    * *Catching `InputMismatchException`:*
        * `public static byte readByte(String message)`
        * `public static int readInt(String message)`
        * `public static float readFloat(String message)`
        * `public static double readDouble(String message)`
    * *Catching Custom/Generic Exceptions:*
        * `public static char readChar(String message)`
        * `public static String readString(String message)`
        * `public static boolean readYesNo(String message)` (Returns `true` for "y/Y", `false` for "n/N").

## 💻 Technologies Used
* **Java 21** - Core language for logic and exception handling.
* **JUnit 5** (Optional) - For testing exception throwing.
* **IDE** (IntelliJ IDEA / Eclipse) - Development environment.
* **Git** - Version control.

## 📋 Requirements
* **Java SDK 17** or higher installed locally.
* Basic understanding of:
    * Java `try-catch-finally` blocks.
    * Inheritance (extending `Exception`).
    * `java.util.Scanner` and `ArrayList`.

## 🛠️ Installation
1.  Clone this repository:
    ```bash
    git clone [https://github.com/your-username/java-exceptions-exercises.git](https://github.com/your-username/java-exceptions-exercises.git)
    ```
2.  Navigate to the project directory:
    ```bash
    cd java-exceptions-exercises
    ```
3.  Open the project in your preferred IDE.

## 🚀 Execute
Each level is separated into its own package. To run the exercises:

1.  **Compile the project** using your IDE or terminal.
2.  **Run Level 1:**
    Find the `Main` class in the `n1exercise1` package and run it to see the Custom Exception logic.
3.  **Run Level 2:**
    Find the `Main` class in the `n2exercise1` package. This will trigger the console prompts to test the `Input` class validation.

## 🤝 Contributions
Contributions are welcome! If you find a bug or want to add a new complexity level:

1.  **Fork** the repository.
2.  Create a **branch** for your feature:
    ```bash
    git checkout -b feature/NewInputMethod
    ```
3.  **Commit** your changes:
    ```bash
    git commit -m "feat: Added regex validation for emails"
    ```
4.  **Push** to the branch:
    ```bash
    git push origin feature/NewInputMethod
    ```
5.  Open a **Pull Request**.
