/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_strukdat.stack._mori_hovipah;

/**
 *
 * @author Mori Hovipah
 */
public class Tugas_StrukDatStack_Mori_Hovipah {
    private String data[];
    private int max;
    private int Top;

    public Tugas_StrukDatStack_Mori_Hovipah (int tempat){
        max = tempat;
        Top = -1;
        data = new String [max];
    }

    public boolean isEmpty(){
        return Top==-1;
    }
    public boolean isFull(){
        return Top == max-1;
    }
    public void push (String input){
        if(isFull()){
            System.out.println("Laci Meja Sudah Penuh");
            System.out.println("--------------------------------------------");
        } else {
            data[++Top]= input;
            System.out.println("+ Novel ("+input+ "),  dimasukan kedalam laci meja");
            System.out.println("--------------------------------------------");
        }

    }
    public void pop () {
        if(isEmpty()){
            System.out.println("Laci Meja Kosong");
            System.out.println("--------------------------------------------");
        } else {
            String temp = data[Top];
            data[Top]= data[Top--];
            System.out.println("- Novel ("+temp+ "), dikeluarkan dari laci meja");
            System.out.println("--------------------------------------------");

        }
    }

    public void cetak(){
        System.out.println("Novel yang Tersisa Didalam Laci Meja : ");
        for(int i =0; i<=Top;i++){

            System.out.println("* " +data[i]);
        }

    }

    public static void main(String[] args) {
        Tugas_StrukDatStack_Mori_Hovipah i = new Tugas_StrukDatStack_Mori_Hovipah(4);
        i.push("Teman Berjuang");
        i.push("Tumbuh Dari Luka");
        i.push("Nanti Kita Bicara Tentang Hari Ini");
        i.push("Kamu Terlalu Banyak Bercanda");
        i.pop();
        i.pop();
        System.out.println();
        i.cetak();
    }
}
