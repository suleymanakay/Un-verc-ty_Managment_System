package org.example;

public class memur extends calisan {
    private String mesai;
    private String Departman;

    public memur(String name,String last_name,String telno,String posta,String mesai,String Departman){
        super(name,last_name,telno,posta);
        this.Departman=Departman;
        this.mesai=mesai;

    }

    public String getMesai() {
        return mesai;
    }

    public void setMesai(String mesai) {
        this.mesai = mesai;
    }

    public String getDepartman() {
        return Departman;
    }

    public void setDepartman(String departman) {
        Departman = departman;
    }
    public void calis(){
        System.out.println(this.getName()+" "+this.getLast_name()+" "+ "Çalışmaya başladı !");
    }
}
