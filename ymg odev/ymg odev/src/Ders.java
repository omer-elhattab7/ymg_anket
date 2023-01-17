


public class Ders {
    //bu metota bizim program yazılmaktadır.
    

   
    public static void main(String[] args) {
        
        YmgOdev suayıbnotu=new YmgOdev(63,30); 
        YmgOdev mehmet = new YmgOdev();
        double a =suayıbnotu.ortalamaHesapla();
       // double b=mehmet.ortalamaHesapla();
        String har=suayıbnotu.harf_notu_hesapla();
        System.out.println("ortalama : "+a);
        System.out.println("hafr notunuz:"+har);
        
        YmgOdev omer=new YmgOdev(45,96);
        double ömero=omer.ortalamaHesapla();
        String ömerh=omer.harf_notu_hesapla();
        System.out.println("ömer ortalamsı"+ömero);
        System.out.println("ömer harf notu"+ömerh);
        
        
        
        
       
    }
    
}
