package feb9class.mobile;

/**
 *
 * @author Admin
 */
public class FeaturePhone extends Mobile {

    private String button, snakeGame, radio;

    public FeaturePhone() {
    }

    public FeaturePhone(String button, String snakeGame, String radio) {
        this.button = button;
        this.snakeGame = snakeGame;
        this.radio = radio;
    }

    public FeaturePhone(String button, String snakeGame, String radio, String call, String message, String games, String camera, String gallery) {
        super(call, message, games, camera, gallery);
        this.button = button;
        this.snakeGame = snakeGame;
        this.radio = radio;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public String getSnakeGame() {
        return snakeGame;
    }

    public void setSnakeGame(String snakeGame) {
        this.snakeGame = snakeGame;
    }

    public String getRadio() {
        return radio;
    }

    public void setRadio(String radio) {
        this.radio = radio;
    }

    @Override
    public String toString() {
        return "FeaturePhone{" + "button=" + button + ", snakeGame=" + snakeGame + ", radio=" + radio + '}' ;
    }

}
