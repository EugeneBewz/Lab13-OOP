package ua.edu.ucu.apps.task2;

public class ReportBuilder {
    private БазаДаних db;
    public ReportBuilder(БазаДаних db) {
        this.db = db;
    }

    public void testDB() {
        System.out.println("User Data: " + db.отриматиДаніКористувача());
        System.out.println("Static Data: " + db.отриматиСтатистичніДані());
    }
}
