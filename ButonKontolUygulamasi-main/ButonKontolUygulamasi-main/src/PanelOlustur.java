import javax.swing.*;
import java.awt.*;

public class PanelOlustur extends JFrame {
    // Butonların tutulduğu dizi.

    private JButton[][] butonlar; //4x4 butonlar dizi şeklinde oluşturuldu.
    private final ButonBasımIslemi butonBasımıListener = new ButonBasımIslemi();
    //Buton basımı sınıfını kullanmak için yapıldı.

    public PanelOlustur(){
        super("Buton Paneli");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Pencere kapatıldığında program sonlanır.
        setSize(400,400); //Pencerenin genişlik ve yükseklik değerleri girildi.
        setLayout(new GridLayout(4,4)); //Pencere 4x4'lük bir grid layout'a sahip olacak.


        butonlar = new JButton[4][4];
        ButonOlustur butonOlusturucu = new ButonOlustur();// Buton oluşturucu sınıfı kullanıldı.


        for (int i=0 ; i<4 ; i++){ // Butonlar oluşturuldu.
            for (int j=0 ; j<4 ; j++){
                butonlar[i][j] = butonOlusturucu.butonOlustur();
                butonlar[i][j].addActionListener(butonBasımıListener);
                add(butonlar[i][j]); // Butonlar panele eklendi.
            }
        }

    }


}
