package org.example;

public class Asistan extends Akademisyen {
    private String officesaati;

    public Asistan(String name,String last_name,String telno,String posta,String bolum,String unvan,String officesaati){
        super(name,last_name,telno,posta,bolum,unvan);
        this.officesaati=officesaati;

    }

    public String getOfficesaati() {
        return officesaati;
    }

    public void setOfficesaati(String officesaati) {
        this.officesaati = officesaati;
    }

    public void quizyap(){
        System.out.println(getName()+" "+getLast_name()+" "+" Quiz yaptı !");
    }
}
