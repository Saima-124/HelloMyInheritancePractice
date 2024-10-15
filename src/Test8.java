public class Test8 {
    public static void main(String[] args) {
       AnyCorrectChoiceQuestion a = new AnyCorrectChoiceQuestion(
                "Who is the founder of Java?",
                "Saima Salma");

       System.out.println(  a.getText());
        System.out.println("Answer : " + a.checkAnswer("saima")); // true
        System.out.println("Answer : " + a.checkAnswer("salma")); // true
        System.out.println("Answer : " + a.checkAnswer("Someone Else")); // false


       /* AnyCorrectChoiceQuestion question = new AnyCorrectChoiceQuestion(
                "Who is the founder of Java?",
                "James Gosling Josh Bloch"
        );

        System.out.println(question.getText());
        System.out.println("Answer 'James Gosling': " + question.checkAnswer("James Gosling")); // true
        System.out.println("Answer 'josh bloch': " + question.checkAnswer("josh bloch")); // true
        System.out.println("Answer 'Someone Else': " + question.checkAnswer("Someone Else")); // false
*/
    }
}
