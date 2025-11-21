package DefenceSystem;

/**
 *
 * @author Shameel Shajaad
 */
public interface DefenceSystemObserver {

    public void getMsgMain(String Msg);

    public void update(int position);

    public void areaClearLabel(boolean clear);

    public void updateButtons();

    public String getSoldierCount(int index);

    public String getAmmoCount(int index);

    public String getFuelAmount(int index);
}
