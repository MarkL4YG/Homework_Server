package de.mlessmann.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Life4YourGames on 05.07.16.
 */
public class CommonTest {
    @Test
    public void negateInt() throws Exception {

        assertEquals(-2000, Common.negateInt(2000));

    }

    @Test
    public void getFirstVersion() throws Exception {

        assertEquals("4.5.0.102.2", Common.getFirstVersion("iaehfubezgwhwieivwi v4.5.0.102.2 fjeiwj"));

    }

    @Test
    public void compareVersions() throws Exception {

        assertEquals(0, Common.compareVersions("2.7.8", "2.7.8"));

        assertEquals(0, Common.compareVersions("2.7.8.0", "2.7.8"));

        assertEquals(0, Common.compareVersions("2.7.8", "2.7.8.0"));

        assertEquals(-1, Common.compareVersions("2.7.7", "2.7.8"));

        assertEquals(1, Common.compareVersions("2.7.7", "2.7.6"));

    }

}