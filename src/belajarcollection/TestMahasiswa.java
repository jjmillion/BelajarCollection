/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajarcollection;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Student
 */
public class TestMahasiswa {

    public static void main(String[] args) {
        Mahasiswa Budi, Susi;

        Budi = new Mahasiswa("Budi", "0001",
                LocalDate.of(2000, Month.JANUARY, 25), "Pria");
        Susi = new Mahasiswa("Susi", "0002",
                LocalDate.of(2001, Month.MAY, 27), "Wanita");

        System.out.println(Budi.getNama());
        System.out.println(Budi + "\n");

        List<Mahasiswa> kelas = Arrays.asList(Budi, Susi,
                new Mahasiswa("Joe", "0003",
                        LocalDate.of(2001, Month.JUNE, 17), "PRIA"),
                new Mahasiswa("Marry", "0004",
                        LocalDate.of(2004, Month.MAY, 1), "Wanita"));

        for (int i = 0; i < kelas.size(); i++) {
            Mahasiswa mhs = kelas.get(i);
            System.out.printf("%s%s%s%n", mhs.getNama(), mhs.getNim(), mhs.getJenis_kelamin());
        }
        System.out.println("\n");

        for (Mahasiswa mhs : kelas) {
            System.out.printf("%s%s%s%n", mhs.getNama(), mhs.getNim(), mhs.getJenis_kelamin());
        }

        System.out.println("\n");

        //Java 8
        kelas.forEach(mhs -> {
            System.out.printf("%s%s%s%n", mhs.getNama(), mhs.getNim(), mhs.getJenis_kelamin());

        });

        System.out.println("\n");

        Map<String, List<Mahasiswa>> jurusanIS = new HashMap<>();
        jurusanIS.put("17IS2", new ArrayList<>(kelas));
        jurusanIS.put("16IS2", new ArrayList<>(
                Arrays.asList(
                        new Mahasiswa("JodyRes", "0124",
                                LocalDate.of(2001, Month.JUNE, 17), "PRIA"),
                        new Mahasiswa("VAroKah", "0024",
                                LocalDate.of(2004, Month.MAY, 1), "Wanita")
                )));

        for (Mahasiswa m : jurusanIS.get("16IS2")) {
            System.out.println(m);
        }

        System.out.println("\n");

        for (Mahasiswa m : jurusanIS.get("17IS2")) {
            System.out.println(m);
        }

        System.out.println("\n");

        List<Mahasiswa> kelas16is2 = jurusanIS.get("16IS2");
        for (Mahasiswa m : kelas16is2) {
            System.out.println(m);
        }

        System.out.println("\n");

        kelas16is2.add(new Mahasiswa("Johan", "3948", LocalDate.of(2039, Month.MARCH, 1), "Pria"));
        for (Mahasiswa m : kelas16is2) {
            System.out.println(m);
        }

        System.out.println("\n");

        for (String k : jurusanIS.keySet()) {
            List<Mahasiswa> mhs = jurusanIS.get(k);
            System.out.println(k + " " + mhs.size() + " " + " mahasiswa");

            for (Mahasiswa m : mhs) {
                System.out.println(m);
            }

        }

        //=============Di bawah ni test
        //Ini bukan loop
        System.out.println(jurusanIS.get("17IS2"));

        System.out.println("\n");

        kelas.forEach(System.out::println);

    }

}
