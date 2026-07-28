package JavaRefresher.Fnc_Arrays_Strings_Hash;

// String - Group of characters enclosed within double quotes

// String Immutability
// --> String literals -- it is immutable - once object is created it's value cannot be changed, if want to change it creates a new object, existing object remains there in memory
// --> StringBuilder -- it is mutable - if want to change it modifies the existing object

public class Strings {
    public static void main(String[] args) {
        String name = "Sangameshwaran Natarajan";
        System.out.println("name -> " + name);
        System.out.println("stringLength -> " + name.length());

        // empty string
        // String emptyString = "";

        // it includes from begin to end
        System.out.println("substring 1 -> " + name.substring(1));

        // it includes from begin and doesn't includes end
        System.out.println("substring 2 -> " + name.substring(0, 24));

        System.out.println("charAt -> " + name.charAt(1));

        // string concatenation
        String firstName = "Sangameshwaran";
        String lastName = "Natarajan";
        System.out.println("concat -> " + firstName + " " + lastName);

        // String literals are stored in String Pool and reused.
        // new String() always creates a new heap object.
        // == compares references, .equals() compares content.

        // s1 and s2 point to the same String Pool object because the literal "sanga",
        // already exists in the pool
        String s1 = "sanga";
        String s2 = "sanga";
        System.out.println(s1 == s2); // true
        System.out.println(s1.equals(s2)); // true

        // s3 stores a reference in the stack, and the object is created in the heap
        String s3 = new String("sanga");
        String s4 = new String("sanga");
        System.out.println(s3 == s4); // false
        System.out.println(s3.equals(s4)); // true

        // isEmpty - returns true or false
        System.out.println(s1.isEmpty()); // false

        // traverse a string
        String str = "Java";

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // *** StringBuilder ***
        StringBuilder sb = new StringBuilder("Hello");

        // length
        System.out.println(sb.length());

        // append - add at end of string
        sb.append(" Sanga!");
        System.out.println(sb);

        // insert
        sb.insert(5, " World");
        System.out.println(sb);

        // replace
        sb.replace(5, 11, " da"); // don't include end Index
        System.out.println(sb);

        // delete
        sb.delete(0, 2); // don't include end Index
        System.out.println(sb);

        // reverse
        sb.reverse();
        System.out.println(sb);

        // .toString() converts any object to string object
        String convertSB = sb.toString();
        System.out.println(convertSB);
    }
}