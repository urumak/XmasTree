import com.sun.org.apache.bcel.internal.generic.RETURN;

public class Info {
    private String typeQuestion = "Jaką choinkę chcesz narysować?\n" +
            "'UP' - czubek choinki jest zwrócony go góry\n" +
            "'DOWN' - czubek choinki jest zwrócony w dół\n" +
            "'RIGHT' - czubek choinki jest zwrócony w prawo\n" +
            "'LEFT - czubek choinki jest zwrócony w lewo\n" +
            "'SUPER' - wypasiona choinka\n" +
            "'END' - wyłączenie programu";
    private String sizeQuestion = "Jaki ma być rozmiar choinki?";
    private String errorStatement = "Wprowadziłeś niepoprawne dane. Podaj dane jeszcze raz.";
    private String pressButton = "Naciśnij Enter...";

    public String getTypeQuestion(){
        return typeQuestion;
    }
    public String getSizeQuestion(){
        return sizeQuestion;
    }
    public String getErrorStatement() {
        return errorStatement;
    }
    public String getPressButton(){
        return pressButton;
    }
}