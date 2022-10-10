package youtube_demo_interfaces;

public abstract class BaseCreditManager implements ICreditManager {

    @Override
    public abstract void calculate();

    @Override
    public void save() {
        // TODO Auto-generated method stub
        System.out.println("Saved");
    }
    
}
