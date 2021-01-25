

        import java.io.IOException;
        import java.util.ArrayList;

        import org.jsoup.Jsoup;
        import org.jsoup.nodes.Document;
        import org.jsoup.nodes.Element;

public class ScrapeTable {


    public ArrayList<String> scrape(String html) throws IOException {

        ArrayList<String> tableData = new ArrayList<String>();

        Document doc = Jsoup.parse(html, "UTF-8");

        Element table = doc.select("table").first();

        for (Element row : table.select("tr")) {
            tableData.addAll(row.select("td").eachText());
        }

        return tableData;

    }

}
