package org.example;

public class Main {
    public static void main(String[] args) {
       calisan a =new calisan("Ahmet","yalçın","0544444","kartal@mail");
       Akademisyen a1=new Akademisyen("Mehmet","taş","025458745","kedi@mailcom","MAT","Doçer");
       memur m =new memur("yusuf","akay","052555485","hty@fkj","12.40","mimarlık");
       Asistan r=new Asistan("resul","akay","0554566","kjk@fjwf","Elektrik","personel","17.00");
       Lab_Asistani lb =new Lab_Asistani("Gulistan","Gül","05455488","fert@fjhgj","Pdr","Profesör","12.00");
        lb.giris();
        lb.dersegir();
        lb.lablaragir();
        lb.yemekhane();
        lb.cikis();


    }
}