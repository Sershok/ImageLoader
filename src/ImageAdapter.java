public class ImageAdapter implements ImageLoader {

    AdvancedImageLoader advancedImageLoader;

    public ImageAdapter(String imageFormat){
        if(imageFormat.equalsIgnoreCase("JPG")){
            advancedImageLoader = new FileJPG();
        } else if (imageFormat.equalsIgnoreCase("PNG")){
            advancedImageLoader = new FilePNG();
        }
    }

    @Override
    public void image(String imageFormat, String image) {

        if (imageFormat.equalsIgnoreCase("JPG")) {
            advancedImageLoader.imageJPG(image);
        } else if (imageFormat.equalsIgnoreCase("PNG")) {
            advancedImageLoader.imagePNG(image);
        }
    }
}
