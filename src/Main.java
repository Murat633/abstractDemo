public class Main {
    public static void main(String[] args) {
        var database = new MysqlDatabaseManager();
        CustomerManager customerManager = new CustomerManager(database);
        customerManager.getCustomers();
    }
}