package proxy;

public class RealImage implements Image {
    private String url;
    public  RealImage(String url){
        this.url=url;
    }

    @Override
    public void showImage() {
        System.out.println(url);
    }
}
