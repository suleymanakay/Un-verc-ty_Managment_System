package org.example;

public class ogretimgorevlisi extends Akademisyen{
    private int kapıno;

    public ogretimgorevlisi(String name,String last_name,String telno,String posta,String bolum,String unvan,int kapıno){
        super(name,last_name,telno,posta,bolum,unvan);
        this.kapıno=kapıno;
    }

    public int getKapıno() {
        return kapıno;
    }

    public void setKapıno(int kapıno) {
        this.kapıno = kapıno;
    }
    public void toplanti(){
        System.out.println(getName()+" "+getLast_name()+ " "+" Toplantıya katılmıştır...");
    }
    public void sinavyap(){
        System.out.println(getName()+" "+getLast_name()+" "+"Sınavı yapıyor...");
    }
}
