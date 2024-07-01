import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

  /* 1. Develop a program that takes the weight (in kilograms) and height (in meters) as
input and calculates the BMI, then prints it.
 • Input: Weight (kg) = 70, Height (m) = 1.75
 • Expected Output: BMI = 22.86 */

       Scanner input = new Scanner (System.in);

       /* System.out.println("Please enter your weight (in kilograms):");
        double weight = input.nextDouble();
        System.out.println("Please enter your height (in meters):");
        double height = input.nextDouble();
        double BMI = weight / (height * height);
        System.out.println("The BMI is: " + BMI ); **/





        /*2. Write a program that takes the obtained marks and total marks as input
        and calculates the percentage, then prints it.
        • Input: Obtained Marks = 85, Total Marks = 100
        • Expected Output: Percentage = 85.0%
         **/

       /* System.out.println("Please enter your obtained marks:");
        double marks = input.nextDouble();
        System.out.println("Please enter your total marks: ");
        double total = input.nextDouble();
        double percentage = (marks/total)*100;
        System.out.println("Your percentage is: " + percentage+"%"); */






        /*3. Create a program that takes an amount in one currency and an exchange rate as
        input, then converts and prints the amount in another currency.
        • Input: Amount in USD = 100, Exchange Rate (USD to EUR) = 0.85
        • Expected Output: Amount in EUR = 85.0 */

       /* System.out.println("Please enter an amount in USD: ");
        double amount = input.nextDouble();
        System.out.println("Please enter the exchange rate: ");
        double exchange_Rate = input.nextDouble();
        double convertedAmount = amount*exchange_Rate;
        System.out.println("The amount after converting from USD to EUR: "+convertedAmount); */





       /* 4. Create a program that takes a string as input, calculates its length, and then reverses
         the string using the StringBuilder class, finally printing both the length and reversed string
         • Input: "Hello, World!"
         • Expected Output: Length of the string: 13 And Reversed string: "!dlroW ,olleH"    */
       /* System.out.println("Please enter a string: ");
        String s = input.nextLine();

        StringBuilder HW = new StringBuilder("Hello, World!");
        HW.reverse();
        System.out.print("Length of the string: "+ s.length() + "  "+"And the Reversed string: "+HW.toString());*/






        /*5. Develop a program that takes a sentence as input and extracts a substring from it,then prints the
        extracted substring.
        • Input: Sentence = "The quick brown fox jumps over the lazy dog", Start Index= 10, End Index = 20
        • Expected Output: "brown fox"
        * */
       /* System.out.println("Please Enter a sentence: ");
        String sentence = input.nextLine();
        sentence = sentence.substring(10,20);
        System.out.println(sentence);*/





        /* 6. Write a program that takes a sentence and a keyword as input, then check if the keyword is present
        in the sentence and prints the result.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Keyword = "jumps"
• Expected Output: Keyword "jumps" is present in the sentence.*/
       /* System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();
        System.out.println("Please enter a Key word:");
        String keyword = input.nextLine();

        if (sentence.contains(keyword)) {
        System.out.println( "Keyword"+" "+keyword+" " +"is present in the sentence." );}*/






/*7. Develop a program that takes a sentence and a word to replace as input, then replace all occurrences
of the word with another word and prints the modified sentence.
• Input: Sentence = "The quick brown fox jumps over the lazy dog", Word to Replace = "fox", Replacement Word = "cat"
• Expected Output: "The quick brown cat jumps over the lazy dog"*/

      /*  System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();
        System.out.println("Please enter a word to replace:");
        String wtr = input.nextLine();
        System.out.println(sentence.replace( wtr, "cat"));*/





/*8. Write a program that takes two strings as input and check if they are equal, ignoring
the case, then prints whether they are equal or not.
• Input: String 1 = "Hello", String 2 = "hello"
• Expected Output: Strings are equal (ignoring case).
*/

        /* System.out.println("Enter a string:");
        String s1 = input.nextLine();
        System.out.println("Enter another string:");
        String s2 = input.nextLine();
        if(s1.equalsIgnoreCase(s2)){
        System.out.println("Strings are  equal (ignoring case). ");} */










    }
}