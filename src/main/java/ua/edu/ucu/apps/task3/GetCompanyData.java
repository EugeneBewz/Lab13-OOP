package ua.edu.ucu.apps.task3;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class GetCompanyData {
    private String url;

    public static void collectCompanyData(String url) {
        try {
            Document doc = Jsoup.connect(url).get();
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
}
