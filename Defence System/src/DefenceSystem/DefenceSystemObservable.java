package DefenceSystem;

import java.util.ArrayList;

/**
 *
 * @author Shameel Shajaad
 */
public class DefenceSystemObservable implements DefenceSystemObservableInterface {

    int position;

    private ArrayList<DefenceSystemObserver> ObserverList = new ArrayList<>();

    public void addDefenceSystemObserver(DefenceSystemObserver defenceSystemObserver) {
        ObserverList.add(defenceSystemObserver);
    }

    @Override
    public void getMsgMain(String Msg) {
        for (DefenceSystemObserver defenceSystemObserver : ObserverList) {
            defenceSystemObserver.getMsgMain(Msg);
        }
    }

    @Override
    public void update(int position) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void areaClearLabel(boolean clear) {
        for (DefenceSystemObserver defenceSystemObserver : ObserverList) {
            defenceSystemObserver.areaClearLabel(clear);
        }
    }

    @Override
    public void updateButtons() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setPosition(int position) {
        if (this.position != position) {
            this.position = position;
            notifyDefence();
        }
    }

    public void notifyDefence() {
        for (DefenceSystemObserver defenceSystemObserver : ObserverList) {
            defenceSystemObserver.update(position);
            defenceSystemObserver.updateButtons();
        }
    }

    @Override
    public String getSoldierCount(int index) {
        for (DefenceSystemObserver defenceSystemObserver : ObserverList) {
            String count = defenceSystemObserver.getSoldierCount(index);
            if (count != null) {
                return count;
            }
        }
        return null;
    }
}
