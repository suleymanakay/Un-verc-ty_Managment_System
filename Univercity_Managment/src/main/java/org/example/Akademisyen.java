package org.example;

public class Akademisyen extends calisan{
    private String bolum;
    private String unvan;

    public Akademisyen(String name,String last_name,String telno,String posta,String bolum,String unvan){
        super(name,last_name,telno,posta);
        this.bolum=bolum;
        this.unvan=unvan;

    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }
    public void dersegir(){
        System.out.println(this.getName()+" "+this.getLast_name()+" "+" dersine girdi..");
    }
}

