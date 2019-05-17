import Models.HangmanModel;
import views.HangmanView;

public class Maman13Q1 {

    public static void main(String[] args) {
        HangmanModel        model   =   new HangmanModel();
        HangmanView         view    =   new HangmanView(model);
        HangmanController   ctrl    =   new HangmanController(view, model);
    }
}
