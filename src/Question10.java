public class Question10 {
    public String text;

    public Question10(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
    public void display(){
        System.out.println(text);
    }
    public void addText(String questionText) {
        this.text=questionText;
        }

    }
