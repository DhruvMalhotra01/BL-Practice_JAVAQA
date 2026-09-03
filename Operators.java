class Operators{
    public static void main(String[] args) {
        //Arithmetic Operators + - * / %
        //Relational Operators == <= >= > < !=  
        //Assignment Operators = += -= *= %= /= 
        //Unary Operators ++ --
        //Ternary Operator condition ? True : False
        //bitwise and Shift operator | & ^ << >> >>>
        //Logical Operators && || !

        // Q1. Find the maximum of 3 numbers using Ternary operators 
        // int a = 5;
        // int b = 4;
        // int c = 3;
        // int result;
        // result = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        // System.out.print(result);


        // Q2. Check Positive negative or ZERO
        // int num = 2;
        // String level = (num < 0 )? ("negative" : "positive" ) : (num == 0) ? "Zero" : "positive";
        // String level = (num < 0 )? "negative" : (num > 0) ? "positive" : "zero"; 
        // System.out.print(level);


        //Q.3 12. Grade calculator

        // int marks = 85;
        // String finalGrade = marks > 90 ? "A+" :
        //                     marks > 80 ? "A" :
        //                     marks > 70 ? "B" :
        //                     marks > 60 ? "C" :
        //                     marks > 50 ? "D" : "F";
        // System.out.print(finalGrade);

// 90+  → A+
// 80+  → A
// 70+  → B
// 60+  → C
// 50+  → D
// Below 50 → F
//     }
// }


    //Q4. Check character type
    char ch = '1';
    String result =  (ch >= 'a' && ch <= 'z') ? "Lowercase" :
                    (ch >= 'A' && ch <= 'Z') ? "Uppercase" :
                    (ch >= '0' && ch <= '9') ? "Digit" : "special Character";

    System.out.print(result);




// Try handling:

// A-Z → Uppercase
// a-z → Lowercase
// 0-9 → Digit
// otherwise → Special Character

    // Q5. Largest of 4 numbers 
        // int a = 50 , b = 2000 , c = 300 , d = 40;
        // int result = (a>c) ? a : (b>c) ? b : (c>d) ? c : (d>a) ? d : a;
        // System.out.print(result);
    }
}