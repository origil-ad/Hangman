import Models.HangmanModel;
import views.HangmanView;

public class HangmanController {

    private HangmanView _view;
    private HangmanModel _model;

    public HangmanController(HangmanView view, HangmanModel model) {
        _model = model;
        _view = view;
    }
}