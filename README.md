# Buton Kontol Uygulamasi

 ## Projenin Amacı
Bu proje, Java dilinde kullanıcı arayüzü (GUI) tasarımına yönelik bir başlangıç noktası sağlar. Özellikle, özelleştirilmiş butonlar kullanarak bir kullanıcı arayüzü oluşturulur. Bu butonlar, GraphQL şemalarına bağlı olarak durumlarını değiştirebilirler. Bu başlangıç projesi, Java'da GUI uygulamaları geliştirmeye yardımcı olacak temel bir anlayış sunar, basit bir grafik arayüz tasarımı ve olay işleme mekanizması ile.
## Kullanılma Nedeni
Bu proje, Java dilinde GUI programlama yeteneklerini geliştirmek isteyen geliştiricilere hitap eder. Ayrıca, temel GUI bileşenlerini nasıl özelleştireceğini ve olayları nasıl yöneteceğini öğrenmek isteyenler için idealdir. Proje, Swing veya JavaFX gibi GUI kütüphanelerini kullanarak temel grafik arayüz tasarımı ve olay işleme ilkelerini uygulamak için bir başlangıç noktası sağlar.
## Uygulamanın Özellikleri 
- Her buton, özel olarak oluşturulmuş `ButonOlustur` sınıfından türetilir.
- Her buton, bir GraphQL şemasını depolama yeteneğine sahiptir.
- Butonlar, tıklandığında bir GraphQL şemasında bir mutasyonu tetikleme kapasitesine sahiptir.
- Butonlar, aktif ve pasif durumlarını göstermek için farklı renk ve simgeleri kullanır.
- Bir butona tıklandığında, diğer butonların durumları güncellenir; önceki butonlar pasif hale gelir, sadece tıklanan buton aktif olur.
- Eğer ekranda örneğin 1. Butona basıldıktansonra  2.  Ve  daha  sonraki  herhangi  bir sıradaki basılmamış butona basıldığında onlarda aktif renk ve aktif simge gösterecektir. Ancak 1. Butona tekrar basılırsa önceden basılmış butonlar(varsa) pasif hale gelecektir ve sadece tekrar basılan buton aktif olacaktır.
## Nasıl Kullanılır?
- Projeyi yerel bilgisayarınıza klonlayın, bir Java IDE'sinde açın ve `ButonOlustur` sınıfını inceleyerek, main metoduyla ilgili örnekleri çalıştırarak projeyi anlamaya başlayabilirsiniz.
## Kullanım Alanları
  Bu tür bir proje, aşağıdaki kullanım alanlarına uygun olabilir:
- GUI programlamaya yeni başlayan geliştiricilerin eğitimi ve öğrenimi için örnek bir proje.
- Temel GUI becerilerini geliştirmek isteyen geliştiricilerin pratik yapması için bir temel proje.
- Java dilindeki GUI kütüphaneleri ile çalışmak isteyenlerin başlangıç noktası.
- Özelleştirilmiş butonlar gibi özel grafik bileşenlerinin nasıl oluşturulacağını ve kullanılacağını anlamak isteyenler için bir referans.
- Bu proje, kullanıcı arayüzü tasarımı ve olay işleme konularında temel bir anlayış kazanmak isteyen Java geliştiricileri için faydalı olabilir.

## GraphQL Nedir?
GraphQL, API'ler için bir veri sorgulama ve manipülasyon dili olup, bu sorguları ve mutasyonları gerçekleştirmek üzere tasarlanmış açık kaynaklı bir uygulamadır. Facebook tarafından oluşturulmuş ve 2015'te ilk kez açık kaynaklı olarak yayınlanmıştır. GraphQL, istemcinin gereksinim duyduğu veriyi belirlemesine ve sadece bu veriyi elde etmesine imkan sağlayan bir yapı sunar.

## GraphQL Avantajları:
- Esnek ve Kişiye Özel: İstemciler, kendi ihtiyaçlarına göre uyarlanabilen esnek sorgular oluşturabilirler.
- Tek Bir Nokta: GraphQL’de yalnızca bir endpoint mevcuttur, bu da istemcilerin çeşitli veri gereksinimlerini tek bir kaynaktan karşılamalarını sağlar.
- Veri Alımı İhtiyaca Göre: İstemci, sadece gereken verileri alabilir, bu da gereksiz veri transferini engeller.
- İlişkisel Veri İşleme: GraphQL, ilişkisel veritabanları ve modellerle etkileşim kurmayı basitleştirir.
- Canlı Sorgular (Abonelikler): GraphQL, canlı sorgular sayesinde anlık veri güncellemelerini desteklemektedir.
## GraphQL Dezavantajları:
- Öğrenme Süreci: GraphQL, özellikle REST'ten farklı bir yaklaşım sunduğu için yeni geliştiricilerin öğrenmesi biraz zaman alabilir.
- Güvenlik: Kullanıcıların kendi sorgularını oluşturabilmesi, güvenlik sorunlarına sebep olabilir.
- Karmaşıklık ve Performans: Çok detaylı sorgular oluşturmak ve performansı denetlemek zorluk çıkarabilir.
- Bazı Araçlar ve Kütüphaneler İşlemeyebilir: Bazı araçlar ve kütüphaneler, GraphQL'i desteklemeyebilir.
- REST ile Uyumluluk Sorunları: Özellikle REST tabanlı sistemlerle entegrasyon sağlamak, sistemler arasındaki geçiş sürecinin yönetilmesini zorlaştırabilir.


## Uygulama Çalıştırılması ve Süreci:
1- Butonların Basılmamış Hali:
![ss2](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/ba36d860-465a-4b6f-b544-fc4da59290f3)
2- Herhangi Bir Buton Aktif Olduğundaki Durum:
![ss1](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/b37c2d22-f8bb-44f3-ab75-fc32d0c31882)
3- Tüm butonların pasif olduğu durum:
![ss3](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/a5ae7714-14bc-4ab0-ae98-09bf3f7e62be)
3- Her Aktifleştirilen Butonun GraphQL Adresi:
![ss4](https://github.com/ayseguldal/ButonKontolUygulamasi/assets/118614193/ec4540b1-a210-4419-ba39-c1701937cf86)


