public class Phone {
    String url;
    String name;

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

    public Phone(String url, String name) {
        this.url = url;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Phone{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
