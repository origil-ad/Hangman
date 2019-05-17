import Models.HangmanModel;
import views.HangmanView;

public class GameController {

    private HangmanView _view;
    private HangmanModel _model;

    public GameController(HangmanView view, HangmanModel model){
        _model = model;
        _view = view;
    }
}