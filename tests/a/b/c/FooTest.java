package a.b.c;


import org.junit.Assert;
import org.junit.Test;


class FooTest {



    @Test
    public void testFoo() {
        Foo fpp = new Foo("foo");
        Assert.assertEquals(fpp.getId(),"foo");
    }
    @Test
    public void testBar() {
        Foo fpp = new Foo("bar");
        Assert.assertEquals(fpp.getId(),"bar");
    }
}