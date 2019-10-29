package com.example.quizjani;

import android.graphics.drawable.Drawable;

public class family {
    public String nama ,jabatan ,status;
    public Drawable gambar;


    public Drawable getGambar()
    {
        return gambar;
    }

    public void setGambar(Drawable gambar)
    {
        this.gambar = gambar;
    }

    public family(Drawable gambar, String nama, String jabatan, String status) {
        this.gambar = gambar;
        this.nama = nama;
        this.jabatan = jabatan;
        this.status = status;

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
