package com.calpadia.mvc.model;

/**
 * @author Daniel Oktavian Duha
 */
public class Karyawan {
    private String NIK;
    private String nama;
    private String umur;
    private Integer gaji;

    public Karyawan() {
    }


    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public Integer getGaji() {
        return gaji;
    }

    public void setGaji(Integer gaji) {
        this.gaji = gaji;
    }

    @Override
    public String toString() {
        return "Karyawan{" +
                "NIK='" + NIK + '\'' +
                ", nama='" + nama + '\'' +
                ", umur='" + umur + '\'' +
                ", gaji=" + gaji +
                '}';
    }
}
