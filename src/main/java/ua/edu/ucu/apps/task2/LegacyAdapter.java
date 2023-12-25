package ua.edu.ucu.apps.task2;

public class LegacyAdapter {
    private БазаДаних legacyDatabase;
    private Авторизація legacyAuthorization;

    public LegacyAdapter(БазаДаних legacyDatabase, Авторизація legacyAuthorization) {
        this.legacyDatabase = legacyDatabase;
        this.legacyAuthorization = legacyAuthorization;
    }

    public БазаДаних getDatabase() {
        return legacyDatabase;
    }

    public Авторизація getAuthorization() {
        return this.legacyAuthorization;
    }

    public boolean authorize(БазаДаних db) {
        return this.legacyAuthorization.авторизуватися(db);
    }

}
