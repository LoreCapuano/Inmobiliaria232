package fonts;

import java.awt.Font;
import java.io.InputStream;

public class fuentes {

    private Font font = null;
    public String RBlack = "Roboto-Black.ttf";
    public String RBlackItalic = "Roboto-BlackItalic.ttf";
    public String RBold = "Roboto-Bold.ttf";
    public String RBoldItalic = "Roboto-BoldItalic.ttf";
    public String RItalic = "Roboto-Italic.ttf";
    public String RLight = "Roboto-Light.ttf";
    public String RLightItalic = "Roboto-LightItalic.ttf";
    public String RMedium = "Roboto-Medium.ttf";
    public String RMediumItalic = "Roboto-MediumItalic.ttf";
    public String RRegular = "Roboto-Regular.ttf";
    public String RThin = "Roboto-Thin.ttf";
    public String RThinItalic = "Roboto-ThinItalic.ttf";

    public Font fuente(String fontName, int estilo, float tamanio) {

        try {

            InputStream is = getClass().getResourceAsStream(fontName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);

        } catch (Exception ex) {
            System.err.println(fontName + "No se pudo cargar la fuente");
            font = new Font("Arial", Font.PLAIN, 14);

        }
        Font tfont = font.deriveFont(estilo, tamanio);
        return tfont;

    }

}
