# HelloApp Use Cases

---

## UC1: Print Hello World

### Description
This use case prints a simple greeting message "Hello World" to the console. It serves as the starting point of the HelloApp application.

---

### Disadvantages of Previous Use Case
Not applicable, as this is the first use case.

---

### Preconditions
- Java JDK is installed.
- Project structure is set up.
- User can run Java programs from terminal or IDE.

---

### Main Flow
1. User runs the application.
2. The program executes the main method.
3. The program prints "Hello World" to the console.
4. The program terminates.

---

### Post Conditions
- "Hello World" is displayed in the console.
- Program execution completes successfully.

---

### Code Snippet

```java
public class HelloApp {

    public static void main(String[] args) {
        System.out.println("Hello World");
    }

}


---

## UC2: Display Greeting with User Name (Command-Line Input)

### Description
This use case extends UC1 by accepting a user name as a command-line argument and displaying a personalized greeting.

---

### Disadvantages of Previous Use Case
UC1 only prints a fixed message and does not support dynamic user input.

---

### Preconditions
- Java program is compiled.
- User provides a name as a command-line argument.

---

### Main Flow
1. User runs the program with a name as argument.
2. Program checks if an argument is provided.
3. Program prints "Hello <name>".
4. Program exits.

---

### Post Conditions
- Personalized greeting is displayed if input is given.
- Defaults to "Hello World" if no input is provided.

---

### Code Snippet

```java
if (args.length > 0) {
    System.out.println("Hello " + args[0]);
} else {
    System.out.println("Hello World");
}