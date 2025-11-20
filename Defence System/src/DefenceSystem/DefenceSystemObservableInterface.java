package DefenceSystem;

/**
 *
 * @author Shameel Shajaad
 */
public interface DefenceSystemObservableInterface {

    public void getMsgMain(String Msg);

    public void update(int position);

    public void areaClearLabel(boolean clear);

    public void updateButtons();
    
    public void setPosition(int position);
}
