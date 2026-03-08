# Java Platform Independence

Computers fundamentally understand only two values: **0 and 1**. These are known as **binary values**.

When we write a program, we typically want it to run on any operating system (OS), such as Windows, Unix, or Linux. However, each OS has its own specific instructions and can only process machine-level binary code. This means a program written for one OS usually won't work on another without modification.

## Platform Independence in Java

Java was designed to overcome this challenge through **platform independence**. This means that code written in Java can run on any operating system, without needing to be rewritten for each one.

But how does Java achieve this, given the differences between operating systems?

## Bytecode: The Key to Platform Independence

Instead of compiling Java code directly into machine code specific to an OS, the Java compiler generates an **intermediate representation** called **bytecode**. This bytecode is universal and is the same regardless of the underlying operating system.

### How Is Bytecode Generated?

1. **Compilation**: The Java compiler takes your source code (`.java` files) and compiles it into bytecode (`.class` files). This bytecode is identical across all platforms.
2. **Execution (Running)**: Bytecode cannot be executed directly by the machine because machines only understand their own specific binary instructions.

## The Role of the JVM

To bridge this gap, Java introduces the **Java Virtual Machine (JVM)**. The JVM is a software layer that interprets or compiles bytecode into machine-specific instructions, allowing the program to run on any operating system.

- The **JVM** is different for each OS, ensuring the bytecode is translated properly for that specific platform.
- When you run a Java program, the JVM on your operating system takes the bytecode and converts it into executable instructions for your machine.

## Summary

There are **two main steps** in executing a Java program:

1. **Compilation** (Source Code ➔ Bytecode)
2. **Execution** (Bytecode ➔ Machine Code via JVM)

By introducing bytecode and the JVM, Java enables true platform independence.

![Java Platform Independence](<./../images/Java Platform.png>)

## How to Compile and Run Java Code

Follow these steps to compile and run your Java program:

1. **Save your code:**  
   Save your Java source file with the `.java` extension. For example: `FileName.java`.

2. **Open your terminal:**  
   Navigate to the directory where your Java file is saved.

3. **Compile the program:**  
   Run the following command to compile the Java file:

   ```
   javac FileName.java
   ```

   This will generate a `FileName.class` file (the compiled bytecode) if there are no compilation errors.

4. **Run the program:**  
   Execute the compiled program using: (Here we are using JVM)

   ```
   java FileName
   ```

   **Note:** Do _not_ include the `.class` extension.

5. **Program output:**  
   Your Java program will now run and display any output in the terminal.

### JDK vs. JRE vs. JVM

- **JVM (Java Virtual Machine):**
  - Executes Java bytecode and converts it to machine-specific instructions so the program can run on any device or operating system with a compatible JVM.

- **JRE (Java Runtime Environment):**
  - Contains the JVM along with core Java libraries and other resources needed to run Java applications.
  - In short: `JRE = JVM +  Inbuilt Java Libraries + Other Components`
  - This is for application users.

- **JDK (Java Development Kit):**
  - A full-featured software development kit required to develop Java applications.
  - Includes the JRE, a compiler (`javac`), debugger, and development tools.
  - In short: `JDK = JRE + Compiler + Debugger + Development Tools`
  - This is for application developers.
