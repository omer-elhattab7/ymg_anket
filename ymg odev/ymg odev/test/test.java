

import org.junit.Test;

import static org.junit.Assert.*;

import static junit.framework.Assert.assertEquals;

public class test {
    
     @Test
     //doğru bilgilerle giriş :
     
    public void ortalamaHesaplama()
    {
        System.out.println(" ");
        System.out.println("**** TEST 1 ****");
        YmgOdev ogr = new YmgOdev(60,80);
        double ort = ogr.ortalamaHesapla();
        System.out.println("ortalama : "+ort);
        
        assertEquals(72.0,ort);
        System.out.println("girdiniz değerle ort notunuz eşleşti");
    }
    
    
    @Test
    //yanlış bligi gonderme : 
    public void ortalamaHesaplama1()
    {
        System.out.println("");
        System.out.println("***** TEST 2 *****");
        YmgOdev ogr = new YmgOdev(48,73);
        double ort = ogr.ortalamaHesapla();
        System.out.println("ortalama : "+ort);
        System.out.println("verilen sonuclar meyotunuzun verdi cıkışla eşleşmedi ");
        System.out.println("metotun sonucu: "+ort);
        
        assertEquals(45.0,ort);
        
        
    }
    
    @Test
    //harf notu giriek doğru bilgi vermesini bekledik
    
    public void harhesapla(){
        System.out.println("");
        System.out.println("**** TEST 3 ****");
        YmgOdev ogr = new YmgOdev(85,75);
        String  harf_not=ogr.harf_notu_hesapla();
        double ort=ogr.ortalamaHesapla();
        System.out.println("harf notunuz:"+harf_not);
        assertEquals("Harf Notunuz BB", harf_not);
        System.out.println("girdiniz değerlere göre harf notunuz ortalama değerlere göre doğrudur ");
        System.out.print("ortalamanız:"+ort);
        System.out.println(" ");
    }
    //yanlş bilgileriyle girriş.
    @Test
    
    public void harhesapla1(){
        System.out.println(" ");
        System.out.println("******* TEST 4 ******");
        YmgOdev ogr = new YmgOdev(70,94);
        String  harf_not=ogr.harf_notu_hesapla();
        System.out.println("harf notunuz:"+harf_not);
        assertEquals("Harf Notunuz BA", harf_not);
         double ort = ogr.ortalamaHesapla();
        System.out.println("ortalamanız  : "+ort);
        
    }
    
     @Test
    
    public void harf_dogrulama(){
         System.out.println(" ");
         System.out.println("***** TEST 5 *****");
        YmgOdev ogr = new YmgOdev(45,94);
        System.out.println(" beklenen değer CB");
        String  harf_not=ogr.harf_notu_hesapla();
         System.out.println("harf notunuzu hatalıdır");
        System.out.println("harf notunuz:"+harf_not);
        assertEquals("Harf Notunuz BA", harf_not);
         
        
    }
    
    
    
   
}
