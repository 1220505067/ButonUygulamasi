import javax.swing.*;
import java.awt.*;

public class ButonOlustur {
    private final Color pasifRenk = Color.RED; // Pasif butonun rengi.
    public JButton butonOlustur() {
        JButton buton = new JButton();
        buton.setBackground(pasifRenk);// Butonun rengi ayarlandı.
// Butonun client property'si olan GraphQLSemaAdresi'ni ayarlar.
        buton.putClientProperty("GraphQLSemaAdresi", "https://example.com/graphql");
        buton.putClientProperty("AktifSembol", "A"); // Buton aktif edildiğinde A harfi gözükür.
        // Buton pasif edildiğinde P harfi gözükür.
        buton.putClientProperty("PasifSembol", "P");

        return buton; // Buton döndürülür.


    }
}