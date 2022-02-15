public class SyntaxTypesVariables {
    
    public static void main (String[] args){
        // primitive data types
        // not objects
        // store values of a specific type
        // byte, short, int, long, float, double, char, boolean (see chart in curriculum)
        
        
        // DECLARING VARIABLES IN JAVA
//  JS -->    let, const, var nameofVar = value
        // 1 .you MUST declare it's data type before assigning it
        int myFavoriteNumber;
        myFavoriteNumber = 18;
        System.out.println(myFavoriteNumber);
        
        // let's store my favorite letter:
        char myFavoriteLetter = 'L';
        System.out.println(myFavoriteLetter);
        
        // boolean
        boolean isSunny = true;
        System.out.println(isSunny);
        
        // good to know
        // int --> primitive / not an object
        // Integer  --> object / give us access to manipulate the Integer as an object
        
        // double = primitive
        // Double - obj
        
        // char - prim
        // Character - obj
        
        // why not just use double for everything
        // it will affect how quickly the program runs.
        // use the correct data type to be more efficient
        
        // Strings
        // strings are not primitive data type
        // objects
        // declaring a variable of the String data type
        String school;
        // assign a value (initializing) the variable
        school = "Codeup";
        System.out.println(school);
        
        String team = "Spurs";
        System.out.println(team);
        
        String student1, student2, student3;
        student1 = "Cody";
        student2 = "Nelson";
        student3 = "Jonathan";
        
        System.out.println(student1 + "\t" +student2 + "      " +student3);
//        System.out.println(student2);
//        System.out.println(student3);
    
        
        // RESERVED WORDS
        // abstract continue for new switch assert default goto package synchronized boolean do if private this break double implements protected throw byte else import public throws case enum instanceof return transient catch extends int short try char final interface static void class finally long strictfp volatile const float native super while
//        String int = 18; --> WRONG
//        // int can't be a string
//        // String can't be an int
//        // int is a reserved word
//        String myInt = "eighteen";
//        int otherInt = 18;
//            String myInt = "18";
    
//        Arithmetic Expressions
//        3, 9
//        byte firstNum = 120;
//        byte secondNum = 120;
//        byte result = (byte) (firstNum + secondNum);
//        System.out.println(result);
        
//        System.out.println(firstNum + " " + secondNum);
    
//        byte firstNum = 120;
//        byte secondNum = 125;
//        ++firstNum;
//        System.out.println(firstNum );

//        JS --> let, var, const
//         JS --> const, doesn't allow you to re-assign
        // java --> `final` keyword
        // final keyword --> you cannot re-assign the variable once it's been declared
        
//        final String myName = "laura";
//        myName = "bananas"; --> I cannot change myName to bananas because it's final


//        CASTING --> don't fret if you don't fully understand yet
        // coerce --> persuade an unwilling person  to do something forcefully
//        int myInteger = 900;
//        long morePrecise = myInteger;
//
//        System.out.println(myInteger);
//        System.out.println(morePrecise);
        
        // explicit casting (coercing the pi (double) into an int data type)
        double pi = 3.14159;
        int almostPi = (int) pi;
        System.out.println(pi);
        System.out.println(almostPi);
        


// ignore for now
//        char firstLetter = 'a';
//        char secondLetter = 'b';
    }
    
}
