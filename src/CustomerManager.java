public class CustomerManager {
    BaseDatabaseManager databaseManager;

    public CustomerManager(BaseDatabaseManager databaseManeger){
        this.databaseManager = databaseManeger;
    }

    public void getCustomers() {
        databaseManager.getData();
    }
}
