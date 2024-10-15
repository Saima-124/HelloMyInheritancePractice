public class Test9 {
    public static void main(String[] args) {
        MultiChoiceQuestion m = new MultiChoiceQuestion(
                "What are the colors of the rainbow?",
                new String[] {"Red", "Orange", "Yellow", "Green", "Blue", "Indigo", "Violet"}
        );
        System.out.println(m.getText());
        System.out.println("Rainbow color is " + m.checkAnswer("Red Orange Yellow Green Blue Indigo Violet"));//true
        System.out.println("Rainbow color is " + m.checkAnswer("Saima Salma Tania Sima Simu Anisa Puspa"));//false

    }
}
