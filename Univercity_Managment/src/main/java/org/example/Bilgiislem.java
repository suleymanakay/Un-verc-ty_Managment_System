package org.example;

public class Bilgiislem extends memur {
    private String gorev;
    public Bilgiislem(String name,String last_name,String telno,String posta,String mesai,String Departman,String  gorev){
        super(name,last_name,telno,posta,mesai,Departman);
        this.gorev=gorev;

    }

    public String getGorev() {
        return gorev;
    }

    public void setGorev(String gorev) {
        this.gorev = gorev;
    }

    public void networkkurulum(){
        System.out.println(getName()+" "+getLast_name()+" "+"Ağ kurulumu yapıldı...");
    }
}
