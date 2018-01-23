
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Student
 */
public class BelajarCollection {

    public static void main(String[] args) {
        List<Integer> angka = new ArrayList<>();

        angka.add(10);
        angka.add(7);
        angka.add(8);

        System.out.println("Banyak Data " + angka.size());

        for (int i = 0; i < angka.size(); i++) {
            System.out.println("Data ke " + i + " : " + angka.get(i));

        }

        System.out.println("Find indef of 10 >> " + angka.indexOf(10));

        //Iterator
        for (int i : angka) {
            System.out.println(i);
        }

        //java 8
        angka.forEach(x -> System.out.println(x));

        angka.forEach(new Consumer<Integer>() {
            public void accept(Integer x) {
                System.out.println(x);
            }

        });

        //Java 8, kirimkan reference terhadap method
        angka.forEach(System.out::println);

        //Add data to Arraylist
        angka.addAll(Arrays.asList(10, 7, 9, 15, 16, 30, 832, 66, 55, 32));

        //Sort Ascendings
        angka.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        angka.forEach(System.out::println);

        //Short ver of Sort Ascending
        angka.sort((Integer o1, Integer o2) -> o1 - o2);
        angka.forEach(System.out::println);

        //Sort Descendings
        angka.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        angka.forEach(System.out::println);

        //Short ver of Sort Ascending
        angka.sort((Integer o1, Integer o2) -> o2 - o1);
        angka.forEach(System.out::println);

        class Nilai {

            public String nama;
            public int nilai;

            public Nilai(String nama, int nilai) {
                this.nama = nama;
                this.nilai = nilai;

            }

            public String toString() {
                return "Nama : " + nama + " , Nilai : " + nilai;

            }
        }

        List<Nilai> daftar = new ArrayList<>(
                Arrays.asList(
                        new Nilai("Budi", 90),
                        new Nilai("Andi", 70),
                        new Nilai("Buise", 50)
                ));

        //daftar sort((n1,n2)-> n1.nilai - n2.nilai)
        daftar.sort((n1, n2) -> n1.nama.compareTo(n2.nama) * 100
                + (n1.nilai - n2.nilai));
        daftar.forEach(System.out::println);

        //java8, using lambda (anonymous function)
        /*ts.sort(p1, p2)-> new Double(p1.getPrice() - p2.getPrice()).intValue());*/
    }

}
