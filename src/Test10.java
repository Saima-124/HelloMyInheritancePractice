public class Test10 {
    public static void main(String[] args) {
        ChoiceQuestion c = new ChoiceQuestion("What is is your name");
        System.out.println(c.getText());
     System.out.println(c.addChoice("Option A : Saima",true));
        System.out.println(c.addChoice("Option B : Sima",false));
        System.out.println(c.addChoice("Option C : Simu",false));


    }
}
