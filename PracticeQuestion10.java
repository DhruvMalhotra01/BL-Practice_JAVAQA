public class PracticeQuestion10 {
    public static void main(String[] args) {
        String s = "Hello World";

        int vowels = 0;
        int consonants = 0;

        String str = s.toUpperCase();
        // System.out.println("String = " + str);

        for(int i = 0;i < str.length();i++){
            if(str.charAt(i) >= 'A' &&  str.charAt(i) <= 'Z' || str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                if(str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
            System.out.println("Vowels = " + vowels);
            System.out.println("Consonants = " + consonants);
        
    }
}

