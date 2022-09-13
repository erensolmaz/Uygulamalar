package com.example.cokluuygulama;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class GidilecekYerler extends Fragment  {
    List<Yerler> lstBook;
    public Context mContext;

    private View rootView;
    RecyclerViewAdapter recyclerViewAdapter;


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public GidilecekYerler() {

    }


    public static GidilecekYerler newInstance(String param1, String param2) {
        GidilecekYerler fragment = new GidilecekYerler();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        lstBook = new ArrayList<>();
        lstBook.add(new Yerler("Nusret Steakhouse","Yemek","Nusr-et Steakhouse, Türkiye'de ve birçok ülkede et ile tanınan popüler bir restorandır. Menü ve sunumları ile dikkat çeken Nusret Steakhouse'un sahibi Nusret Gökçe'dir. ... Nusr-et restoranları Türkiye ve Dünya'nın pek çok bölgesinde açılmıştır. 2010 yılında ilk restoranı açarak şu an 14 farklı şubeye sahip",R.drawable.nusret_steakhouse));
        lstBook.add(new Yerler("Topkapı Sarayı","Tarih","Topkapı Sarayı, İstanbul Sarayburnu'nda, Osmanlı İmparatorluğu'nun 600 yıllık tarihinin 400 yılı boyunca, devletin idare merkezi olarak kullanılan ve Osmanlı padişahlarının yaşadığı saraydır. Bir zamanlar içinde 4.000'e yakın insan yaşamıştır.",R.drawable.topkapi_palace));
        lstBook.add(new Yerler("Galata Kulesi","Tarih/Kültür","Galata Kulesi, Türkiye'nin İstanbul şehrinin Beyoğlu ilçesinde bulunan bir kuledir. Adını, bulunduğu semt olan Galata'dan alır.",R.drawable.galata_tower));
        lstBook.add(new Yerler("Dolmabahçe Sarayı","Tarihi/Kültür","Osmanlı'nın modernleşme hedefine uygun olarak Batı anlayışı ile tasarlanan Dolmabahçe Sarayı, 7 Haziran 1856 tarihinde kullanıma açılmış. İnşasına 13 Haziran 1843 yılında başlanan bu görkemli sarayın yapımı 13 yıl sürmüş. Dolmabahçe Sarayı, Garabet Amira Balyan ve oğlu Nikogos Balyan mimarlığında inşa edilmiş",R.drawable.dolmabahce_palace));
        lstBook.add(new Yerler("Saat Kulesi","Ege Bölgesi","II. Abdülhamit'in tahta çıkışının 25. yılı için 1901'de Sadrazam Mehmet Said Paşa tarafından Alman Konsolosluk binasını yapan mimara yaptırılan kule 25 metre boyunda olup, dairesel esas etrafında dört çeşmesi vardır ve kolonlar Kuzey Afrika temasını esinlendirir.",R.drawable.izmir));
        lstBook.add(new Yerler("Kapadokya Balon Turu","Kültür","Kapadokya balon turu yılın her mevsimi yapılmaktadır. Bölgede yağışlı günlerin sayısı azdır ama yağışlı ve fırtınalı günlerde uçuş yapılmaz. Firmalar tarafından hava durumu yakından takip edildiğinden bu günler için uçuş randevusu da verilmez. Yaz mevsiminde biraz daha yoğunluk olsa da Kapadokya’da her mevsim balon turu keyfi yaşanabilir.",R.drawable.kapadokyabalon));


        lstBook.add(new Yerler("Deyrulzafaran Manastırı","Tarih","Deyrulzafaran Manastırı, Mardin'in 4 kilometre doğusunda, Mardin Ovasına hakim bir noktadadır. Üç kattan oluşan Manastır 5'inci yüzyıldan başlayarak farklı zamanlarda yapılan eklentilerle bugünkü haline 18'inci yüzyılda kavuşmuştur. ... Bu nedenle Manastır, önceleri Mor Şleymun Manastırı olarak biliniyordu.",R.drawable.manastir));
        lstBook.add(new Yerler("Eskişehir Masal Şatosu","Eğlence","Eskişehir Büyükşehir Belediyesi Masal Şatosu. ... Masal Şatosu'nda çocuklarımız interaktif bir masala dahil ederek onlara merak, cesaret ve ... Masal Şatosu'nun kuleleri hakkında kısa bir animasyon film izleyebileceği, soru panoları ... Öyle Olsaydı” bilgi panoları ve atölye içerikleri ile toplumsal farkındalık kazanmaktadırlar.",R.drawable.sato));

        lstBook.add(new Yerler("Diyarbakır Surları","Tarihi/Kültür","Diyarbakır Kalesi veya Diyarbakır surları, Diyarbakır'ın Sur ilçesinde yer alan tarihî bir yapı. ... Yaklaşık dokuz bin yıllık olan surlar, Çin Seddi'nin ardından dünyadaki en uzun ve geniş savunma duvarıdır. 2000'de yapıyı Dünya Mirası Geçici Listesi'ne dahil eden UNESCO, 2015'te ise Dünya Mirası olarak tescil etti.",R.drawable.sur));
        lstBook.add(new Yerler("Nusret Steakhouse","Yemek","Nusr-et Steakhouse, Türkiye'de ve birçok ülkede et ile tanınan popüler bir restorandır. Menü ve sunumları ile dikkat çeken Nusret Steakhouse'un sahibi Nusret Gökçe'dir. ... Nusr-et restoranları Türkiye ve Dünya'nın pek çok bölgesinde açılmıştır. 2010 yılında ilk restoranı açarak şu an 14 farklı şubeye sahip",R.drawable.nusret_steakhouse));
        lstBook.add(new Yerler("Topkapı Sarayı","Tarih","Topkapı Sarayı, İstanbul Sarayburnu'nda, Osmanlı İmparatorluğu'nun 600 yıllık tarihinin 400 yılı boyunca, devletin idare merkezi olarak kullanılan ve Osmanlı padişahlarının yaşadığı saraydır. Bir zamanlar içinde 4.000'e yakın insan yaşamıştır.",R.drawable.topkapi_palace));
        lstBook.add(new Yerler("Galata Kulesi","Tarih/Kültür","Galata Kulesi, Türkiye'nin İstanbul şehrinin Beyoğlu ilçesinde bulunan bir kuledir. Adını, bulunduğu semt olan Galata'dan alır.",R.drawable.galata_tower));
        lstBook.add(new Yerler("Dolmabahçe Sarayı","Tarihi/Kültür","Osmanlı'nın modernleşme hedefine uygun olarak Batı anlayışı ile tasarlanan Dolmabahçe Sarayı, 7 Haziran 1856 tarihinde kullanıma açılmış. İnşasına 13 Haziran 1843 yılında başlanan bu görkemli sarayın yapımı 13 yıl sürmüş. Dolmabahçe Sarayı, Garabet Amira Balyan ve oğlu Nikogos Balyan mimarlığında inşa edilmiş",R.drawable.dolmabahce_palace));
        lstBook.add(new Yerler("Saat Kulesi","Ege Bölgesi","II. Abdülhamit'in tahta çıkışının 25. yılı için 1901'de Sadrazam Mehmet Said Paşa tarafından Alman Konsolosluk binasını yapan mimara yaptırılan kule 25 metre boyunda olup, dairesel esas etrafında dört çeşmesi vardır ve kolonlar Kuzey Afrika temasını esinlendirir.",R.drawable.izmir));
        lstBook.add(new Yerler("Kapadokya Balon Turu","Kültür","Kapadokya balon turu yılın her mevsimi yapılmaktadır. Bölgede yağışlı günlerin sayısı azdır ama yağışlı ve fırtınalı günlerde uçuş yapılmaz. Firmalar tarafından hava durumu yakından takip edildiğinden bu günler için uçuş randevusu da verilmez. Yaz mevsiminde biraz daha yoğunluk olsa da Kapadokya’da her mevsim balon turu keyfi yaşanabilir.",R.drawable.kapadokyabalon));


        lstBook.add(new Yerler("Deyrulzafaran Manastırı","Tarih","Deyrulzafaran Manastırı, Mardin'in 4 kilometre doğusunda, Mardin Ovasına hakim bir noktadadır. Üç kattan oluşan Manastır 5'inci yüzyıldan başlayarak farklı zamanlarda yapılan eklentilerle bugünkü haline 18'inci yüzyılda kavuşmuştur. ... Bu nedenle Manastır, önceleri Mor Şleymun Manastırı olarak biliniyordu.",R.drawable.manastir));
        lstBook.add(new Yerler("Eskişehir Masal Şatosu","Eğlence","Eskişehir Büyükşehir Belediyesi Masal Şatosu. ... Masal Şatosu'nda çocuklarımız interaktif bir masala dahil ederek onlara merak, cesaret ve ... Masal Şatosu'nun kuleleri hakkında kısa bir animasyon film izleyebileceği, soru panoları ... Öyle Olsaydı” bilgi panoları ve atölye içerikleri ile toplumsal farkındalık kazanmaktadırlar.",R.drawable.sato));

        lstBook.add(new Yerler("Diyarbakır Surları","Tarihi/Kültür","Diyarbakır Kalesi veya Diyarbakır surları, Diyarbakır'ın Sur ilçesinde yer alan tarihî bir yapı. ... Yaklaşık dokuz bin yıllık olan surlar, Çin Seddi'nin ardından dünyadaki en uzun ve geniş savunma duvarıdır. 2000'de yapıyı Dünya Mirası Geçici Listesi'ne dahil eden UNESCO, 2015'te ise Dünya Mirası olarak tescil etti.",R.drawable.sur));
        lstBook.add(new Yerler("Nusret Steakhouse","Yemek","Nusr-et Steakhouse, Türkiye'de ve birçok ülkede et ile tanınan popüler bir restorandır. Menü ve sunumları ile dikkat çeken Nusret Steakhouse'un sahibi Nusret Gökçe'dir. ... Nusr-et restoranları Türkiye ve Dünya'nın pek çok bölgesinde açılmıştır. 2010 yılında ilk restoranı açarak şu an 14 farklı şubeye sahip",R.drawable.nusret_steakhouse));
        lstBook.add(new Yerler("Topkapı Sarayı","Tarih","Topkapı Sarayı, İstanbul Sarayburnu'nda, Osmanlı İmparatorluğu'nun 600 yıllık tarihinin 400 yılı boyunca, devletin idare merkezi olarak kullanılan ve Osmanlı padişahlarının yaşadığı saraydır. Bir zamanlar içinde 4.000'e yakın insan yaşamıştır.",R.drawable.topkapi_palace));
        lstBook.add(new Yerler("Galata Kulesi","Tarih/Kültür","Galata Kulesi, Türkiye'nin İstanbul şehrinin Beyoğlu ilçesinde bulunan bir kuledir. Adını, bulunduğu semt olan Galata'dan alır.",R.drawable.galata_tower));
        lstBook.add(new Yerler("Dolmabahçe Sarayı","Tarihi/Kültür","Osmanlı'nın modernleşme hedefine uygun olarak Batı anlayışı ile tasarlanan Dolmabahçe Sarayı, 7 Haziran 1856 tarihinde kullanıma açılmış. İnşasına 13 Haziran 1843 yılında başlanan bu görkemli sarayın yapımı 13 yıl sürmüş. Dolmabahçe Sarayı, Garabet Amira Balyan ve oğlu Nikogos Balyan mimarlığında inşa edilmiş",R.drawable.dolmabahce_palace));
        lstBook.add(new Yerler("Saat Kulesi","Ege Bölgesi","II. Abdülhamit'in tahta çıkışının 25. yılı için 1901'de Sadrazam Mehmet Said Paşa tarafından Alman Konsolosluk binasını yapan mimara yaptırılan kule 25 metre boyunda olup, dairesel esas etrafında dört çeşmesi vardır ve kolonlar Kuzey Afrika temasını esinlendirir.",R.drawable.izmir));
        lstBook.add(new Yerler("Kapadokya Balon Turu","Kültür","Kapadokya balon turu yılın her mevsimi yapılmaktadır. Bölgede yağışlı günlerin sayısı azdır ama yağışlı ve fırtınalı günlerde uçuş yapılmaz. Firmalar tarafından hava durumu yakından takip edildiğinden bu günler için uçuş randevusu da verilmez. Yaz mevsiminde biraz daha yoğunluk olsa da Kapadokya’da her mevsim balon turu keyfi yaşanabilir.",R.drawable.kapadokyabalon));


        lstBook.add(new Yerler("Deyrulzafaran Manastırı","Tarih","Deyrulzafaran Manastırı, Mardin'in 4 kilometre doğusunda, Mardin Ovasına hakim bir noktadadır. Üç kattan oluşan Manastır 5'inci yüzyıldan başlayarak farklı zamanlarda yapılan eklentilerle bugünkü haline 18'inci yüzyılda kavuşmuştur. ... Bu nedenle Manastır, önceleri Mor Şleymun Manastırı olarak biliniyordu.",R.drawable.manastir));
        lstBook.add(new Yerler("Eskişehir Masal Şatosu","Eğlence","Eskişehir Büyükşehir Belediyesi Masal Şatosu. ... Masal Şatosu'nda çocuklarımız interaktif bir masala dahil ederek onlara merak, cesaret ve ... Masal Şatosu'nun kuleleri hakkında kısa bir animasyon film izleyebileceği, soru panoları ... Öyle Olsaydı” bilgi panoları ve atölye içerikleri ile toplumsal farkındalık kazanmaktadırlar.",R.drawable.sato));

        lstBook.add(new Yerler("Diyarbakır Surları","Tarihi/Kültür","Diyarbakır Kalesi veya Diyarbakır surları, Diyarbakır'ın Sur ilçesinde yer alan tarihî bir yapı. ... Yaklaşık dokuz bin yıllık olan surlar, Çin Seddi'nin ardından dünyadaki en uzun ve geniş savunma duvarıdır. 2000'de yapıyı Dünya Mirası Geçici Listesi'ne dahil eden UNESCO, 2015'te ise Dünya Mirası olarak tescil etti.",R.drawable.sur));


      /*  lstBook.add(new Book("Van","Şehir","Description book",R.drawable.van));
        lstBook.add(new Book("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Book("Kapadokya","Şehir","Description book",R.drawable.kapadokya));
        lstBook.add(new Book("Mardin","Şehir","Description book",R.drawable.mardin));
       lstBook.add(new Book("Pamukkale","Şehir","Description book",R.drawable.pamukkale));
        lstBook.add(new Book("Van","Şehir","Description book",R.drawable.van));
        lstBook.add(new Book("Eskişehir","Şehir","Description book",R.drawable.eskisehir));
        lstBook.add(new Book("Kapadokya","Şehir","Description book",R.drawable.kapadokya));
*/


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        rootView = inflater.inflate(R.layout.fragment_notifications, container, false);
        RecyclerView myrv = (RecyclerView) rootView.findViewById(R.id.recyclerview_id);
        recyclerViewAdapter = new RecyclerViewAdapter(getContext(),lstBook);
        myrv.setLayoutManager(new GridLayoutManager(getContext(),3));
        myrv.setAdapter(recyclerViewAdapter);
        return rootView;
    }



}
