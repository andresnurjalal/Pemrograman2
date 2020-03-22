/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.dosen.entity;

/**
 *
 * @author andresnj
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String jurusan;
    private String alamat;
    private String email;
    private String telepon;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String jurusan, String alamat, String email, String telepon) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.alamat = alamat;
        this.email = email;
        this.telepon = telepon;
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getEmail() {
        return email;
    }

    public String getTelepon() {
        return telepon;
    }

    public Object getValue(int index) {
        switch (index) {
            case 0:
                return nim;
            case 1:
                return nama;
            case 2:
                return jurusan;
            case 3:
                return alamat;
            case 4:
                return email;
            case 5:
                return telepon;
            default:
                return null;
        }
    }
}
