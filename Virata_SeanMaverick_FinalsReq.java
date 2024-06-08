import java.util.*;
import java.math.*;

public class Virata_SeanMaverick_FinalsReq {
    public static void main(String[] args) {
        // Declare a constant for solving the power set of a set
        BigInteger POW_CONST = new BigInteger("2");

        // Create the given set using HashSet
        HashSet<String> setName = new HashSet<String>();
            setName.add("Maia");
            setName.add("Electra");
            setName.add("Taygete");
            setName.add("Celaeno");
            setName.add("Alcyone");
            setName.add("Sterope");
            setName.add("Merope");
        
        // Prints the content of a set
        System.out.println("A = " + setName);

        // Determines the cardinality of the set
        int setSize = setName.size();

        // Calculates the power of the set using the pow method of BigInteger
        BigInteger setPow = POW_CONST.pow(setSize);

        // Print the power set of the set
        System.out.println("\n" + "The P(A) = " + setPow);

        /* 
        Coding standards and conventions
        - Modified the names for variables and constants in the program.

        Comments
        - Comments remain unchanged.
        - Added this new multi-line comment to explain changes.

        Error handling
        - Didn't add error handling as the program doesn't require use input.

        Code reusability and modularity
        - Program doesn't need or have reused code.

        Optimization and performance
        - Not applicable to the program.

        Security best practice
        - The program doesn't accept user input, not security measures required.
        */
    }
}
