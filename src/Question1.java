public class Question1 {
    public String text;
    public String answer;

    public Question1(String answer) {
        //this.text = text;
        this.answer = answer;
    }


    public boolean checkAnswer(String response){
        String normalizedResponse = response.trim().toLowerCase().replaceAll("\\s+", " ");
        String normalizedAnswer = answer.trim().toLowerCase().replaceAll("\\s+", " ");
        return normalizedResponse.equals(normalizedAnswer);
    }
}
