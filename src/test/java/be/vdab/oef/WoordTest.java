package be.vdab.oef;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author arno.lambrechts
 */
public class WoordTest {
    @Test
    public void lepelIsEenPalindroom(){
        assertTrue(new Woord("lepel").isPalindroom());
    }
    
    @Test
    public void bonoboIsGeenPalindroom(){
        assertFalse(new Woord("bonobo").isPalindroom());
    }
    
    @Test
    public void meetsysteemIsEenPalindroom(){
        assertTrue(new Woord("meetsysteem").isPalindroom());
    }
}
