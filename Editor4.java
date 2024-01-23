import java.awt.Color;

public class Editor4 {

    public static void main(String[] args) {
        String source = args[0];
        Color[][] sourceImage = Runigram.read(source);
        Color[][] newImage = Runigram.grayScaled(sourceImage);
        Runigram.setCanvas(sourceImage);
        Runigram.morph(sourceImage, newImage, 1);
    }
}