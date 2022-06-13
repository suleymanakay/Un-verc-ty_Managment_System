package org.example;

public class Lab_Asistani extends Asistan {
    public Lab_Asistani(String name,String last_name,String telno,String posta,String bolum,String unvan,String officesaati){
        super(name,last_name,telno,posta,bolum,unvan,officesaati);

    }
    public void lablaragir(){
        System.out.println(getName()+" "+getLast_name()+" "+"Lablara girdi!!");

    }
    public void dersegir(){
        System.out.println(getName()+" "+getLast_name()+" "+ "Derse girdi!");
    }
}
