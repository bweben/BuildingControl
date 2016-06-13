package com.java.testing;

import static org.junit.Assert.*;

/**
 * Created by natha on 13.06.2016.
 */
public class FigurUnitTest {
    private FigurParser fp;

    @org.junit.Before
    public void setUp() throws Exception {
        fp = new FigurParser(new FigurFileStubDAO());
    }

    @org.junit.Test
    public void testCount() throws Exception {
        assertEquals(fp.parse().size(),3);
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

}