public class FilePNG implements AdvancedImageLoader{
    @Override
    public void imageJPG(String image) {

    }

    @Override
    public void imagePNG(String image) {
        System.out.println("Output image in format PNG: " + image);
    }
}
