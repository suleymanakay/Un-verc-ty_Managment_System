package org.example;

public class guvenlikgorevlisi extends memur{
    private String belge;

    public guvenlikgorevlisi(String name,String last_name,String telno,String posta,String mesai,String Departman,String belge){
    super(name,last_name,telno,posta,mesai,Departman);
    this.belge=belge;
    }
    public void nobet(){
        System.out.println(getName()+" "+getLast_name()+" "+"Nobetini tutuyor..");
    }
}
