public class FileJPG implements AdvancedImageLoader{
    @Override
    public void imageJPG(String image) {
        System.out.println("Output image in format JPG: " + image);
    }

    @Override
    public void imagePNG(String image) {

    }
}
