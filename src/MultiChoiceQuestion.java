public class MultiChoiceQuestion extends Question9{
    //public String[] options;
    public String[] correctAnswer;

    public MultiChoiceQuestion(String text, String[] correctAnswer) {
        super(text);
        //this.options = options;
        this.correctAnswer = correctAnswer;
    }
    @Override
    public boolean checkAnswer(String respnse){
        int count = 0;
        boolean found=false;
        String[] provideResponse = respnse.split("\\s+");
        if(provideResponse.length!=correctAnswer.length)
            return false;
        for(String proResponse : provideResponse ){
            found = false;
            for(String correctAnswers : correctAnswer){
                if(proResponse.equals(correctAnswers)){
                    found = true;
                    count++;
                    break;
                }
            }
        }
        if(found && count==7)
            return true;
        else
        return false;
    }
}
