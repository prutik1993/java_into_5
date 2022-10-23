package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise10_CountCharactersUsingScanner {
    public static void main(String[] args) {

               /*
                Ask user to enter a name and count how many l letter exists in the name

               Lionel -> 2
               Leo    -> 1
               lucy   -> 1
               */

        String name = ScannerHelper.getAName(); // String name = ScannerHelper.getAName().toLowerCase();
        int counter = 0;
        String name1 = name.toLowerCase();
        for (int i = 0; i <= name1.length()-1 ; i++) {
            if(name1.charAt(i) == 'l') counter++; // if(name1.charAt(i) == 'l' || name1.charAt(i) == 'L')counter++;
                                                 // (name1.toLowerCase().charAt(i) == 'l')counter++;
        }
        System.out.println(counter);
    }

}
