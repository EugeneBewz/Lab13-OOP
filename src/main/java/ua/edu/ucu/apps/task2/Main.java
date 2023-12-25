package ua.edu.ucu.apps.task2;

public class Main {
    public static void main(String[] args) {
        LegacyAdapter dbAdapter = new LegacyAdapter(new БазаДаних(), new Авторизація());

        БазаДаних db = dbAdapter.getDatabase();

        if (dbAdapter.authorize(db)) {
            ReportBuilder br = new ReportBuilder(db);
            br.testDB();
        }
    }
}
