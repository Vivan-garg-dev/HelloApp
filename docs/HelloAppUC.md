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


---

## UC3: Optional Argument Handling with Default Greeting

### Description
This use case enhances UC2 by handling cases where no command-line argument is provided. A default name "Guest" is used to ensure the program always produces a meaningful output.

---

### Disadvantages of Previous Use Case
UC2 required user input to display a personalized greeting and defaulted to "Hello World", which is inconsistent.

---

### Preconditions
- Java program is compiled.
- User may or may not provide a command-line argument.

---

### Main Flow
1. User runs the program.
2. Program checks if arguments are provided.
3. If yes → prints "Hello <name>".
4. If no → prints "Hello Guest".
5. Program exits.

---

### Post Conditions
- Program always displays a greeting message.
- Default value is used when input is missing.

---

### Code Snippet

```java
String name;

if (args.length > 0) {
    name = args[0];
} else {
    name = "Guest";
}

System.out.println("Hello " + name);

---

## UC4: Handle Multiple Command-Line Names

### Description
This use case extends UC3 by allowing multiple names to be passed as command-line arguments. The program prints a greeting for each name.

---

### Disadvantages of Previous Use Case
UC3 supports only a single name input and cannot process multiple users in one execution.

---

### Preconditions
- Java program is compiled.
- User provides one or more names as command-line arguments.

---

### Main Flow
1. User runs the program with multiple names.
2. Program checks if arguments exist.
3. Iterates through each argument.
4. Prints greeting for each name.
5. If no arguments → prints "Hello Guest".

---

### Post Conditions
- Greeting is displayed for all provided names.
- Default greeting is shown if no input is given.

---

### Code Snippet

```java
for (String name : args) {
    System.out.println("Hello " + name);
}