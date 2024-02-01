package _02_Generics_Store;

import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class Food {
    protected String item;
    
    public int price;

    public abstract JLabel getFood();

    @SuppressWarnings("rawtypes")
    public static ImageIcon loadImage(String fileName) {
        try {
            return new ImageIcon(ImageIO
                    .read(new Cart().getClass().getResourceAsStream("/_06_Console_Store/images/"+fileName)));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
    	return item.replace(".jpg", "");
    }
}
