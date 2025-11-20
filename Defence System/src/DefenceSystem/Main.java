package DefenceSystem;

/**
 *
 * @author Shameel Shajaad
 */
public class Main {

    public static void main(String[] args) {
        DefenceSystemObservable defenceSystemObservable = new DefenceSystemObservable();

        defenceSystemObservable.addDefenceSystemObserver(new Helicopter());
        defenceSystemObservable.addDefenceSystemObserver(new Tank());
        defenceSystemObservable.addDefenceSystemObserver(new Submarine());
        new MainController(defenceSystemObservable).setVisible(true);
    }
}
