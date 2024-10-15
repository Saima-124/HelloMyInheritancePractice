public class Test5 {
    public static void main(String[] args) {
        NumericQuestion n = new NumericQuestion();
        n.setText("What is 2.5 + 2.5");
        System.out.println(n.getText());
        n.setCorrectAnswer(5.0);
        System.out.println("Is it correct " + n.checkAnswer("5.0"));//true
        System.out.println("Is it correct " + n.checkAnswer("5.01"));//true
        System.out.println("Is it correct " + n.checkAnswer("5.02"));//false
        System.out.println("Is it correct " + n.checkAnswer("6.0"));//false
    }
}
