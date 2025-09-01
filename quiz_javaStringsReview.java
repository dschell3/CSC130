class Solution {

    // Question 1
    public static void printNames( String s ) {
        int start = 0;

        // loop until break executed
        while (true)
        {
            // get index of 1st char in the name
            int start_colon = s.indexOf(':', start);

            // was there another ':' to find? break if not
            if (start_colon == -1) {
                break;
            }

            // get index of 2nd
            int end_colon = s.indexOf(':', start_colon + 1); // +1 to ignore ':'

            // using the found indexes make a new string for the name
            String name = s.substring(start_colon + 1, end_colon); // +1 to ignore ':'

            // print the name
            System.out.println(name);

            // advance start to new position, and continue search for names
            start = end_colon + 1;
        }
    }

    // Question 2
    public static void findSuccess(String str) {
        int start = 0;
        int success_count = 0;

        while (true)
        {
            // get index of success in str
            int success_start = str.indexOf("Success", start);

            // was there success to find? break if not
            if (success_start == -1) {
                break;
            }

            success_count++; // increment success count

            // advance start past last occurrence of success and continue search
            start = success_start + 7; // "Success" is 7 chars
        }
        // Display your success to the user...how many occurrences of 'Success'
        System.out.println("Success appearances: " + success_count);
    }

    public static int countExclaims(String str) {
        //
        int start = 0;
        int end = str.length() -1;
        int count = 0;

        while (start <= end )
        {
            char cursor = str.charAt(start);

            // look at one char at a time. is it '!'?
            String sub = str.substring(start, start + 1);
            if (sub.equals("!") == true) {
                count++;
            }
            start++;
        }
        return count;
    }

    public static void main(String[] args) {

        // Test Q1
        String test5 = "The students' names in the class are :Mary:, :John:, and also :Dave:";
        String test6 = "The names of the products are :12AFG_Apple:, :MicroCharger1:, :Battery:, and :Samsung986:";

        printNames(test5); // Mary - John - Dave
        printNames(test6); // 12AFG_Apple - MicroCharger1 - Battery - Samsung986

        // Test Q2
        String test3 = "The Secret to Success is becoming a Success!";
        String test4 = "The success doesn't always come.";

        findSuccess(test3);                                                 // Success appearances: 2
        findSuccess(test4);                                                 // Success appearances: 0

        // Test Q3
        String test1 = "Hello! WORLD!!!";
        String test2 = "Hello world!";

        System.out.println(countExclaims(test1));                           // 4
        System.out.println(countExclaims(test2));                           // 1
    }
}
