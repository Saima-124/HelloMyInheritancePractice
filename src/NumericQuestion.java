public class NumericQuestion extends Question{
   public double correctAnswer;
    public void setCorrectAnswer(double correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
    @Override
    public boolean checkAnswer(String response){
        double userAnswer = Double.parseDouble(response);
        if(Math.abs(userAnswer-correctAnswer)<=0.01){
            return true;
        }else{
            return false;
        }
    }
}
