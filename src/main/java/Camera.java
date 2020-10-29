public class Camera {
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

    public Camera(String url, String name) {
        this.url = url;
        this.name = name;

    }

    @Override
    public String toString() {
        return "Camera{" +
                "url='" + url + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
