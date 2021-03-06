

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for {@link Foo}.
 *
 * @author joe@clanryan.us Joe Ryan)
 */
public class FooTest {

    @Test
    public void thisAlwaysPasses() {

    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }
    
    @Test
    public void testMyFoo() {
        MyFoo mine = new MyFoo();
        mine.wong = "Smile!";
        assertEquals(mine.wong, "Smile!");
          
    }
}