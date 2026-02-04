package org.example.module_8;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ResponseTest {
    @Test
    public void test() {
        Response res = new Response();
//        assertEquals(null, res.getName());
        assertEquals("", res.getName());
        res.setName("hi");
        assertEquals("hi", res.getName());
        res.setName("    ");
        assertEquals("", res.getName());
    }
}