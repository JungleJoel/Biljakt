package org.example.model.scraper;

import org.example.model.data.CarDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public abstract class Scraper {

    ArrayList<CarDTO> cars = new ArrayList<>();
    
    

    abstract ArrayList<CarDTO> scrape();

    private Document connect(String url) throws IOException {
        return Jsoup
                .connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) " +
                        "Chrome/124.0.0.0 Safari/537.36")
                .header("Accept-Language", "*")
                .get();
    }

    private Elements scrapeHTML(Document doc) {
        return doc.select("article.relative");
    }
}