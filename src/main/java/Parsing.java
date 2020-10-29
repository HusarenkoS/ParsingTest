import java.util.ArrayList;
import java.util.List;
import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import java.io.IOException;

public class Parsing {
    public static void main(String[] args) throws IOException {
        List<Tablet> tabletList = new ArrayList<>();
        List<Phone> phoneList = new ArrayList<>();
        List<Camera> cameraList = new ArrayList<>();

        Document document = Jsoup.connect("https://allegro.pl/kategoria/laptopy-dell-77917?ok=1&bmatch=product-cl-eyesa2-engag-dict45-dd-ele-1-2-1023").get();

        Elements elements = document.getElementsByAttributeValue("class", "mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0 mp4t_0 m3h2_0 mryx_0 munh_0");

        Document document1 = Jsoup.connect("https://allegro.pl/kategoria/smartfony-i-telefony-komorkowe-apple-48978?ok=1&bmatch=product-cl-eyesa2-engag-dict45-dd-ele-1-2-1023").get();

        Elements elements1 = document1.getElementsByAttributeValue("class", "mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0 mp4t_0 m3h2_0 mryx_0 munh_0");

        Document document2 = Jsoup.connect("https://allegro.pl/kategoria/aparaty-cyfrowe-110618?bmatch=product-cl-eyesa2-engag-dict45-dd-ele-1-2-1023&ok=1").get();

        Elements elements2 = document2.getElementsByAttributeValue("class", "mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0 mp4t_0 m3h2_0 mryx_0 munh_0");

        for (Element element : elements) {
            Element aElement = element.child(0);
            String url = aElement.attr("href");
            String title = aElement.text();
            tabletList.add(new Tablet(url, title));
            tabletList.forEach(System.out::println);
        }
        for (Element element : elements1) {
            Element aElement = element.child(0);
            String url = aElement.attr("href");
            String title = aElement.text();
            phoneList.add(new Phone(url, title));
            phoneList.forEach(System.out::println);
        }
        for (Element element : elements2) {
            Element aElement = element.child(0);
            String url = aElement.attr("href");
            String title = aElement.text();
            cameraList.add(new Camera(url, title));
            cameraList.forEach(System.out::println);

        }
    }
}