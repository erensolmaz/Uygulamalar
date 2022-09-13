package com.example.cokluuygulama;

import java.util.Date;

public class kullanici {
    private String id;
    private String pw;
    private Integer kullanici_uid;
    private String homedizi;
    private Date acildigi_tarih;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public Integer getKullanici_uid() {
        return kullanici_uid;
    }

    public void setKullanici_uid(Integer kullanici_uid) {
        this.kullanici_uid = kullanici_uid;
    }

    public String getHomedizi() {
        return homedizi;
    }

    public void setHomedizi(String homedizi) {
        this.homedizi = homedizi;
    }

    public Date getAcildigi_tarih() {
        return acildigi_tarih;
    }

    public void setAcildigi_tarih(Date acildigi_tarih) {
        this.acildigi_tarih = acildigi_tarih;
    }

    public kullanici(String id, String pw) {
        this.id = id;
        this.pw = pw;
    }
}
