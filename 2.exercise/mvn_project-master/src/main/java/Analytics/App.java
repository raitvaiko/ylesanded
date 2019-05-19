package Analytics;

import java.io.IOException;

public final class App {

    public static void main(String[] args) throws IOException, InterruptedException {
        DelfiLinkScraper scraper = new DelfiLinkScraper("https://www.delfi.ee/");
        scraper.makeWebRequest();
        scraper.extractLinks();
       //System.out.println(scraper.getHtml());
    }
}