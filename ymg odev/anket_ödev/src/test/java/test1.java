
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class test1  extends besttest{
    @Test
    //bu metota doğru değer gondermek
    public void ogr_tru(){
        anket.ogrnokatlm("2212101204");
        Assertions.assertEquals("2212101204",anket.gettru(),"girdiniz değer doğrudur");

    }
     @Test
    public void ogr_bos(){
        anket.ogrnokatlm(" ");
        Assertions.assertEquals("2212101204",anket.bosdeger(),"eror boş değer girmesiniz .");

    }
    @Test
    public  void ogr_strng(){
        anket.ogrnokatlm("omer");
        Assertions.assertEquals("2212101204",anket.getstring(),"eror string bir değer gondermesiniz ");

    }
    @Test
    public void iki_gr(){
        anket.ogrnokatlm("2212101204");
        Assertions.assertEquals("2212101204",anket.gettru(),"aynı değeri iki defa gire bilirsiniz ");

    }





















}
