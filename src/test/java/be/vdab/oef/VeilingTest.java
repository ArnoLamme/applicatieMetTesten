package be.vdab.oef;

import org.junit.Test;
import static org.junit.Assert.*;

public class VeilingTest {
    @Test
    public void hoogsteBodVanNieuweVeilingIsNul(){
        Veiling veiling = new Veiling();
        assertEquals(0, veiling.getHoogsteBod());
    }
    
    @Test
    public void naEersteBodIsDatBedragHoogsteBod(){
        Veiling veiling = new Veiling();
        veiling.doeBod(100);
        assertEquals(100, veiling.getHoogsteBod());
    }
    
    @Test
    public void hoogsteBedragNaMeerdereBoden(){
        Veiling veiling = new Veiling();
        veiling.doeBod(50);
        veiling.doeBod(100);
        veiling.doeBod(20);
        assertEquals(100, veiling.getHoogsteBod());
    }
}