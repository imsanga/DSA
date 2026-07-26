package JavaRefresher.IO_DataTypes_Operators;

// I/O + Data Types + Operators

// Compile time vs Run time
// => java compile time - converts source code to byte code
// => java run time - byte code is converted to machine code by jvm and runs the machine code and gives the output

// JDK
// --> java development kit
// --> jdk is a package where we can develop java applications; inside that jre, jvm is present
// JRE
// --> java runtime environment
// --> contains jvm + libraries to run java programs
// JVM
// --> java virtual machine
// --> it converts bytecode into machine code

// Memory Model
// --> Stack memory - stores primitive data type values and references of objects
// --> Heap memory - stores the actual objects and their data

import java.util.Scanner;

import javax.accessibility.Accessible;

public class Notes {
    public static void main(String[] args) {

        // *****output in java*****

        // Rules - Case sensitive

        // print
        System.out.print("Hello, World!");

        // print and press enter(go to next line)
        System.out.println("Hello, World!");

        // operators
        System.out.println(5); // 5
        System.out.println("5*10"); // 5*10
        System.out.println(5 * 10); // 50
        System.out.println(50 / 10); // 5
        System.out.println(50 + 10); // 60
        System.out.println(50 - 10); // 40

        // if any one of the operand is string with + it concatenates
        // apart from + any other operator will give an error
        System.out.println("Hello" + "World!"); // HelloWorld!
        System.out.println(5 + " World!"); // 5 World!
        System.out.println("Hello " + 5); // Hello 5

        // Java evaluates expressions from left to right, but the meaning of + changes:
        // number + number -> arithmetic addition
        // String + anything -> string concatenation
        System.out.println(7 + 1 + "856"); // 8856
        System.out.println("856" + 7 + 1); // 85671

        // bracket is having higher priority
        System.out.println("856" + (7 + 1)); // 8568
        // "856" + (7+1)
        // "856" + 8
        // 8568

        // *****Comments*****

        // Sanga (single line comment)

        /*
         * double line comments
         * Virat
         * Dhoni
         * Sachin
         */

        // *****Datatypes in java*****

        // primitive Datatypes - predefined Datatypes(already defined in java)
        // numeric - byte,short,int,long,float,double
        // non-numeric - char,boolean

        // non-primitive Datatypes - strings,arrays,userdefined classes

        // byte - 8bits
        // short - 2 byte
        // int - 4 byte -- upto -10^9 to 10^9
        int x1 = 10;

        // long - 8 byte -- upto -10^18 to 10^18
        // We explicitly use L/l to indicate that the literal is of type long.
        // Integer literals are treated as int by default for non decimal numbers.
        long x = 10000000000L;
        System.out.println(x);

        // float (6-7 decimal digits) - 4 byte
        // We explicitly use F/f to indicate that the literal is of type float.
        // Decimal literals are treated as double by default.
        float x3 = 121.1234567F;

        // double (15 decimal digits) - 8 byte
        double x4 = 121.123456789012345;

        // boolean - 1 bit (stores true or false (size JVM-dependent))
        boolean x5 = true;

        // character - 2 byte
        char x6 = 'a';

        // *****Typecasting in java*****

        // converting from one datatype to another
        // implicit conversion - java compiler automatically converts smaller to bigger
        // datatype
        int y = 87;
        long z = y;
        System.out.println(z);

        long y1 = 87444444444444444L;
        long z1 = y;
        System.out.println(z1);

        // explicit conversion - converting bigger to smaller datatype
        // possible loss in conversion, so we need to explicitly declare
        long y2 = 8744444443444444L;
        int z2 = (int) y2;
        System.out.println(z2); // -1597029156

        // int to float
        int w1 = 45;
        float w2 = w1;
        System.out.println(w2); // 45.0

        // float to int
        float q = 123.45f;
        int w = (int) q;
        System.out.println(w); // 123

        // *****Input in java*****

        Scanner sc = new Scanner(System.in);
        int ip = sc.nextInt();
        System.out.println(ip);

        // sc.nextLong();
        // sc.nextFloat();
        // sc.nextDouble();

        String st1 = sc.next(); // consumes a word
        System.out.println(st1);

        String st2 = sc.nextLine(); // consumes the entire line
        System.out.println(st2);

        sc.close(); // scanner close

        // Scanner Rules

        // Whitespaces: space (' '), tab ('\t'), newline ('\n')

        // 1. nextInt(), nextLong(), nextFloat(), nextDouble()
        // - Skip leading whitespaces.
        // - Read one value (token).
        // - Do NOT consume the trailing '\n'.

        // 2. next()
        // - Skip leading whitespaces.
        // - Read one word (token).
        // - Do NOT consume the trailing '\n'.

        // Example Input:
        // 5545
        // zdasd

        int x8 = sc.nextInt();
        String y8 = sc.nextLine();

        System.out.println(x8); // 5545
        System.out.println(y8); // "" (empty string)

        // Reason:
        // nextInt() leaves the '\n' in the buffer.
        // nextLine() immediately consumes that '\n' and returns an empty string.

        // If another nextInt(), nextLong(), nextDouble(), next(), etc. is called,
        // it skips any leading whitespaces (including the leftover '\n')
        // before reading the next token.

        // 3. nextLine()
        // - Does NOT skip leading whitespaces.
        // - Reads the entire remaining line.
        // - Consumes the terminating '\n'.

        // Ascii
        // A starts from 65
        // a starts from 97

        // bigger type is the type of the result
        // byte
        // ↓
        // short
        // ↓
        // char
        // ↓
        // int
        // ↓
        // long
        // ↓
        // float
        // ↓
        // double

        // scope of variables
        // 1. Local variable
        // → Inside a method
        // → Accessible only in that method

        // 2. Block variable
        // → Inside if/for/while
        // → Accessible only inside that block

        // 3. Instance variable
        // → Belongs to an object
        // → Accessible directly in non-static methods
        // → Static methods need an object

        // 4. Static variable
        // → Belongs to the class
        // → Accessible directly in both static and non-static methods

        // break vs continue vs return
        // break -> Exit the loop
        // continue -> Skip the current iteration
        // return -> Exit the method

    }
}
