package com.walsh;

class FizzBuzz {
    static String userInput;
    static boolean choice;
    static String result;

    public static boolean choice() throws IllegalStateException {
        switch(userInput) {
            case "y": choice = true;
            break;

            case "n": choice = false;
            break;
            default: throw new IllegalStateException("Unexpected value: " + userInput);
        }
        return choice;
    }

    public static String calculation(int toConvert) {
        while(choice) {
            if (toConvert % 15 == 0) {
                result = "FizzBuzz!!";
            } else if (toConvert % 3 == 0) {
                result = "Fizz";
            } else if (toConvert % 5 == 0) {
                result = "Buzz";
            } else {
                result = "Error: Value not divisible by 3 or 5";
            }
            return result;
        }
        return null;
    }
}







