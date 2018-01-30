/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarcollection;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Student
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    private LocalDate tgl_lahir;
    private String jenis_kelamin;

    public Mahasiswa(String nama, String nim, LocalDate tgl_lahir, String jenis_kelamin) {
        this.nama = nama;
        this.nim = nim;
        this.tgl_lahir = tgl_lahir;
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public LocalDate getTgl_lahir() {
        return tgl_lahir;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public void setTgl_lahir(LocalDate tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.nama);
        hash = 59 * hash + Objects.hashCode(this.nim);
        hash = 59 * hash + Objects.hashCode(this.tgl_lahir);
        hash = 59 * hash + Objects.hashCode(this.jenis_kelamin);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Mahasiswa other = (Mahasiswa) obj;
        if (!Objects.equals(this.nama, other.nama)) {
            return false;
        }
        if (!Objects.equals(this.nim, other.nim)) {
            return false;
        }
        if (!Objects.equals(this.jenis_kelamin, other.jenis_kelamin)) {
            return false;
        }
        if (!Objects.equals(this.tgl_lahir, other.tgl_lahir)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nama=" + nama + ", nim=" + nim + ", tgl_lahir=" + tgl_lahir + ", jenis_kelamin=" + jenis_kelamin + '}';
    }
    
    
}
