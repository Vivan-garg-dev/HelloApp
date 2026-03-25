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