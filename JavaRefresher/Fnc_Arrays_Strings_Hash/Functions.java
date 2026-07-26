package JavaRefresher.Fnc_Arrays_Strings_Hash;

// => Functions - It is a block of code designed to perform specific tasks and it is executed when it is called

// pass by value vs reference
// --> pass by value
//  -- passes copy of a value to a method
//  -- in the method if the passed value is changed inside, original value is not changed
// --> pass by reference(not present in java)
//  -- passes address of a variable to the method
//  -- in the method if the passed value is changed inside, original value is also changed because the value present in that address is updated

public class Functions {
    static void dummy1() {
        System.out.println("Dummy1 called");
    }

    // with arguments, parameters
    static void dummy2(String name, int age) {
        System.out.println("Dummy2 called " + name + " of age " + age);
    }

    // with return
    static String dummy3(int monthlyIncome) {
        return "Dummy3 yearly income is " + (monthlyIncome * 12);
    }

    public static void main(String[] args) {
        dummy1();
        dummy2("Sanga", 25);
        System.out.println(dummy3(50400));
    }

}