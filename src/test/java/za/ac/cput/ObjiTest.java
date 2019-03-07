package za.ac.cput;


import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

//import static org.junit.Assert.*;

public class ObjiTest {
    Obji objObji = new Obji();
    @Test
    public void alcoholEquality() {

        Assert.assertEquals("Henisiy Viceroy", objObji.alcohol("Henisiy","Viceroy"));
    }
    @Test
    public void alcoholIdentity() {

        Assert.assertNotSame("Henisiy Viceroy", objObji.alcohol("randy","Henisiy"));
    }
    @Test
    public void alcoholFailing() {

        Assert.assertEquals("Henisiy,Viceroy", objObji.alcohol("Henisiy","Viceroy"));
    }
    @Rule
    public Timeout tymout = new Timeout(30);
    @Test
    public void alcoholTimeouts() {

        for (int i = 0; i < 1; i--) {

        }
        //Assert.assertEquals("Henisiy Viceroy", objObji.alcohol("Henisiy","Viceroy"));
    }
    @Ignore
    @Test
    public void alcoholDisabling() {

        Assert.assertEquals("Henisiy Viceroy", objObji.alcohol("Henisiy","Viceroy"));
    }
}