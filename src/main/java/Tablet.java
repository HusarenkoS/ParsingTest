public class Tablet {
    public String url;
    public String name;

    public Tablet(String url, String name) {
        this.url = url;
        this.name = name;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Tablet{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

