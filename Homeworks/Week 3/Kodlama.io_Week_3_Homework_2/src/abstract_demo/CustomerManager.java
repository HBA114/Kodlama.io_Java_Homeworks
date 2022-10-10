package abstract_demo;

public class CustomerManager {
    public BaseDatabaseManager databaseManager;
    
    public void getCustomers(){
        databaseManager.getData();        
    }
}
