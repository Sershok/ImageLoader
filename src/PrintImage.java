public class PrintImage implements ImageLoader{

    ImageAdapter imageAdapter;

    @Override
    public void image(String imageFormat, String image) {

        if(imageFormat.equalsIgnoreCase("JPG")){
            System.out.println("Output image in format JPG: " + image);

        } else if(imageFormat.equalsIgnoreCase("PNG")){
            imageAdapter = new ImageAdapter(imageFormat);
            imageAdapter.image(imageFormat,image);

        } else System.out.println("Invalid image. " + imageFormat + " format not supported");
    }
}
