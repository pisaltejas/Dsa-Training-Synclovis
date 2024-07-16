import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Rotate {
    public static void main(String[] args) {
        try {
            File inputFile = new File("dog_sample.jpg"); // Replace `dog_sample.jpg` with the actual name of your image file
            BufferedImage inputImage = ImageIO.read(inputFile);

            double rotationAngle = Math.toRadians(90);

            int width = inputImage.getWidth();
            int height = inputImage.getHeight();
            int newWidth = (int) Math.abs(width * Math.cos(rotationAngle)) + (int) Math.abs(height * Math.sin(rotationAngle));
            int newHeight = (int) Math.abs(height * Math.cos(rotationAngle)) + (int) Math.abs(width * Math.sin(rotationAngle));

            BufferedImage outputImage = new BufferedImage(newWidth, newHeight, inputImage.getType());

            AffineTransform transform = new AffineTransform();
            transform.rotate(rotationAngle, newWidth / 2, newHeight / 2);

            transform.translate((newWidth - width) / 2, (newHeight - height) / 2);

            Graphics2D g2d = outputImage.createGraphics();
            g2d.setTransform(transform);
            g2d.drawImage(inputImage, 0, 0, null);
            g2d.dispose();

            File outputFile = new File("output.jpg");
            ImageIO.write(outputImage, "jpg", outputFile);

            System.out.println("Image rotated successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
