public class ChoiceQuestion  extends Question10{
    public StringBuilder choices;
    public ChoiceQuestion(String text) {
        super(text);
        choices = new StringBuilder();
    }

    public String addChoice(String choice){
        choices.append(choice).append("\n");
        return choices;
    }
    @Override
    public String getText(){
        return super.getText();
    }
}
