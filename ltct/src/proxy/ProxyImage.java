package proxy;

public class ProxyImage implements Image {
    private String url;
    private Image realImage;

    @Override
    public void showImage() {
        if (realImage == null) {
            realImage = new RealImage(this.url);
        }
        realImage.showImage();
    }

    public ProxyImage(String url) {
        this.url = url;
    }
}
