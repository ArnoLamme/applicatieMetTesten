package be.vdab.valueobjects;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class JaarTest {
    
    public JaarTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void eenJaarDeelbaarDoor400IsEenSchrikkeljaar(){
        Jaar jaar = new Jaar(2000);
        Assert.assertEquals(true, jaar.isSchrikkeljaar());
    }
    
    @Test
    public void eenJaarDeelbaarDoor100IsGeenSchrikkeljaar(){
        Assert.assertEquals(false, new Jaar(1900).isSchrikkeljaar());
    }
    
    @Test
    public void eenJaarDeelbaarDoor4IsEenSchrikkeljaar(){
        Assert.assertEquals(true, new Jaar(2012).isSchrikkeljaar());
    }
    
    @Test
    public void eenJaarNietDeelbaarDoor4IsGeenSchrikkeljaar(){
        Assert.assertEquals(false, new Jaar(2015).isSchrikkeljaar());
    }
}
