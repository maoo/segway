package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: mauriziopillitu
 * Date: 11/6/11
 * Time: 1:49 PM
 * To change this template use File | Settings | File Templates.
 */
public class TrimWhite {
      private BufferedImage img;

    public TrimWhite(File input) {
        try {
          img = ImageIO.read(input);
        } catch (IOException e) {
            throw new RuntimeException( "Problem reading image", e );
        }
    }

    public void squareTrim() {
        int width  = getTrimmedWidth();
        int height = getTrimmedHeight();

        int topLeftX = 0;
        int topLeftY = 0;

        int min = (width < height) ? width : height;

        if (width < height) {
          topLeftY = - (height - width) / 2;
        } else {
          topLeftX = - (width - height) / 2;
        }

        BufferedImage newImg = new BufferedImage(min, min,
                BufferedImage.TYPE_INT_RGB);
        Graphics g = newImg.createGraphics();

        g.drawImage( img, topLeftX, topLeftY, null );
        img = newImg;
    }

    public void write(File f) {
        try {
            ImageIO.write(img, "jpg", f);
        } catch (IOException e) {
            throw new RuntimeException( "Problem writing image", e );
        }
    }

    private int getTrimmedWidth() {
        int height       = this.img.getHeight();
        int width        = this.img.getWidth();
        int trimmedWidth = 0;

        for(int i = 0; i < height; i++) {
            for(int j = width - 1; j >= 0; j--) {
                if(img.getRGB(j, i) != Color.WHITE.getRGB() &&
                        j > trimmedWidth) {
                    trimmedWidth = j;
                    break;
                }
            }
        }

        return trimmedWidth;
    }

    private int getTrimmedHeight() {
        int width         = this.img.getWidth();
        int height        = this.img.getHeight();
        int trimmedHeight = 0;

        for(int i = 0; i < width; i++) {
            for(int j = height - 1; j >= 0; j--) {
                if(img.getRGB(i, j) != Color.WHITE.getRGB() &&
                        j > trimmedHeight) {
                    trimmedHeight = j;
                    break;
                }
            }
        }

        return trimmedHeight;
    }

    public static void main(String[] args) {
      if (args.length > 0) {
        String path = args[0];
        if (!path.isEmpty()) {
          for (File file : (new File(path).listFiles())) {
            if (!file.getName().startsWith(".")) {
              TrimWhite trim = new TrimWhite(file);
              trim.squareTrim();
              trim.write(file);
            }
          }
        }
      }
    }
}