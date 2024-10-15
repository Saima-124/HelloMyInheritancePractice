public class Test7 {
    public static void main(String[] args) {
        Question1 q = new Question1("James Gosling");
        System.out.println(q.checkAnswer("JAMES   gosling"));//true
        System.out.println(q.checkAnswer("  James Gosling  "));//true
        System.out.println(q.checkAnswer("james gosling"));//true
        System.out.println(q.checkAnswer("Gosling James"));//false

    }
}
