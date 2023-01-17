

import java.util.Scanner;

public class YmgOdev{
    
    public double vize;
    
    public double dSonu;
    
    public YmgOdev(double vize,double dSonu)
    {
        this.dSonu=dSonu;
        this.vize=vize;
    }

    public YmgOdev()
    {
        this.dSonu=-1;
        this.vize=-1;
    }
    public YmgOdev(double  vize){
        this.vize=vize;
    }
    
    public double ortalamaHesapla()
    {
        return this.vize*0.4+this.dSonu*0.6;
    }
    
    //bu metotun işi  harf notu hisaplamak: 
    
    
    public String harf_notu_hesapla(){
         
        double sonuc=ortalamaHesapla();
        
        
        String har_not=new String();
    
     if (sonuc>85) {
         
         har_not="Harf Notunuz AA";
     }
     else if (sonuc<85 && sonuc>80) {
         
         har_not="Harf Notunuz BA";
     }
     else if (sonuc<80 && sonuc>75) {
         
       har_not="Harf Notunuz BB";
     }
     else if (sonuc<75 && sonuc>65) {
       har_not="Harf Notunuz CB";
     }
     else if (sonuc<65 && sonuc>60) {
         
         har_not="Harf Notunuz CC";
     }
      else if (sonuc<60&& sonuc>55) {
         
         har_not="Harf Notunuz CD";
     }
      else if (sonuc<55 && sonuc>50) {
         
       har_not="Harf Notunuz DD";
     }
      else{
         har_not="Harf Notunuz FF Başarısız Oldunuz!";
      }
     return har_not;

        
    }
    
    
     public String harf_notu_hesapla(double a,double b){
         this.vize=a;
         this.dSonu=b;
         
        double sonuc=ortalamaHesapla();
        
        
        String har_not=new String();
    
     if (sonuc>85) {
         
         har_not="Harf Notunuz AA";
     }
     else if (sonuc<85 && sonuc>80) {
         
         har_not="Harf Notunuz BA";
     }
     else if (sonuc<80 && sonuc>75) {
         
       har_not="Harf Notunuz BB";
     }
     else if (sonuc<75 && sonuc>65) {
       har_not="Harf Notunuz CB";
     }
     else if (sonuc<65 && sonuc>60) {
         
         har_not="Harf Notunuz CC";
     }
      else if (sonuc<60&& sonuc>55) {
         
         har_not="Harf Notunuz CD";
     }
      else if (sonuc<55 && sonuc>50) {
         
       har_not="Harf Notunuz DD";
     }
      else{
         har_not="Harf Notunuz FF Başarısız Oldunuz!";
      }
     return har_not;

        
    }

 
}



    
    
  
        
   
    
  

    
    
