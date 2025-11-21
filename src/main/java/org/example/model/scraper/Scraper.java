package org.example.model.scraper;

import org.example.model.data.CarDTO;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Scraper {

    ArrayList<CarDTO> cars = new ArrayList<>();

    public ArrayList<CarDTO> scrape(String url) throws IOException {
        Document doc = connect(url);
        Elements carElements = scrapeHTML(doc);

        for(Element element : carElements) {
            CarDTO car = new CarDTO();

            car.setUrl(element.selectFirst("a").attr("href"));
            car.setModel(String.valueOf(element.selectXpath("//*[@id=\"18818580\"]/text()")));
            car.setInfo(String.valueOf(element.selectXpath("//*[@id=\"app\"]/main/div/div[2]/section/div[3]/article[1]/div[3]/span[1]")));
            //car.setMadeYear(Integer.parseInt(String.valueOf(element.selectXpath("//*[@id=\"app\"]/main/div/div[2]/section/div[3]/article[1]/div[3]/span[2]"))));

            cars.add(car);

        }
        return cars;
    }

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