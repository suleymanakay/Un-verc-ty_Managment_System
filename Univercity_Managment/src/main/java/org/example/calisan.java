package org.example;

public class calisan {
    private String name;
    private String last_name;

    private String telno;
    private String posta;

    public String getTelno() {
        return telno;
    }

    public void setTelno(String telno) {
        this.telno = telno;
    }

    public calisan(String name, String last_name, String telno, String posta) {
        this.name = name;
        this.last_name = last_name;
        this.telno = telno;
        this.posta = posta;
    }

    public void giris(){
        System.out.println(this.name+" "+this.last_name+" "+"Üniversiteye Hoş geldiniz.");
    }
    public void cikis(){
        System.out.println(this.name+" "+this.last_name+" "+"Üniversiteden çıkış yaptınız.");

    }
    public void yemekhane(){
        System.out.println(this.name+" "+this.last_name+" "+"Yemekhaneye girdi. !!");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }


}
