import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButonBasımIslemi implements ActionListener {
    private JButton sonTiklananButon;
    private final Color aktifRenk = Color.GREEN; // Buton üstüne tıklandığında olacak renk.
    private final Color pasifRenk = Color.RED; // Pasif butonun rengi.


    @Override
    public void actionPerformed(ActionEvent e) {
        JButton aktifButon = (JButton) e.getSource();
    //Eğer tıklanmış olan butona tekrar tıklandıysa pasif olur.
        if (aktifButon == sonTiklananButon) {
            pasifYap(aktifButon);
            sonTiklananButon = null;
        } else {
            // Eğer farklı bir butona tıklandıysa, tıklanan butonu aktif yapar.
            pasifYapTumAktifler();
            aktifYap(aktifButon);
            sonTiklananButon = aktifButon;
        }
            // Butonun client property'si olan GraphQLSemaAdresi'ni alır.


        String graphQLSemaAdresi = (String) aktifButon.getClientProperty("GraphQLSemaAdresi");
        Sema graphQLSemaAdres = new Sema();
        graphQLSemaAdres.GraphQLSemasiniBaslat(graphQLSemaAdresi);

    }   // Butonun client property'si olan GraphQLSemaAdresi'ni alır.

    private void aktifYap(JButton button) {
        button.setBackground(aktifRenk); // Arkaplan aktif görünümde.
        button.setText((String) button.getClientProperty("AktifSembol")); // Butonda aktif sembol gözükür.
    }

    private void pasifYap(JButton button) {
        button.setBackground(pasifRenk); // Arkaplan pasif görünümde.
        button.setText((String) button.getClientProperty("PasifSembol")); // Butonda pasif sembol görünür.
    }

    private void pasifYapTumAktifler() {
        // Eğer önceki bir tıklama varsa, tüm aktif butonları pasif hale getir.
        if (sonTiklananButon != null) {
            pasifYap(sonTiklananButon);
        }
    }

}
