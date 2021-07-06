package homeworkTest;

import homework.Manifest;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ManifestTest {
    
    private Manifest manifest;
    private final static String MAINCLASS = "NotMain"; //error for test
    
    @Before
    public void init(){
        manifest = new Manifest(MAINCLASS);
    }
    
    @After
    public void finalizeTest(){
        manifest = null;
    }
    
    @Test
    public void manifestConstructorWithArgsTest(){
        assertTrue("Main".equals(manifest.getMainClass()));
    }
}
