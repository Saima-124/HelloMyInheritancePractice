public class AnyCorrectChoiceQuestion extends Question7{
    public AnyCorrectChoiceQuestion(String text, String answer) {
        super(text, answer);
    }
    @Override
    public boolean checkAnswer(String response){
        String normalizedResponse = response.trim().toLowerCase().replaceAll("\\s+","");
        String[] correctChoices= answer.trim().toLowerCase().split("\\s+");

        for(String choices : correctChoices){
            if(choices.equals(normalizedResponse)){
                return true;
            }
        }
        return false;
    }

}
