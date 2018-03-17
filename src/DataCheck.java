public class DataCheck {
    private String answer = "";
    private String[] correctAnswers  = {"UP", "DOWN", "LEFT", "RIGHT", "SUPER", "END"};
    private Boolean correctStr = false;
    private Boolean correctInt = false;
    private Integer intSize;

    private void checkStr(){
        correctStr = false;
        for (String ans : correctAnswers){
            if(answer.equals(ans)){
                correctStr = true;
                break;
            }
            correctStr = false;
        }
    }
    private void checkInt(){
        correctInt = true;
        try{
            intSize = Integer.parseInt(answer);
        }catch(NumberFormatException nfe){
            correctInt = false;
        }
    }
    public void setAnswer(String ans){
        answer = ans;
    }
    public Boolean getConfirmationStr(){
        checkStr();
        return correctStr;
    }
    public Boolean getConfirmationInt(){
        checkInt();
        return correctInt;
    }
}
