package com.codealpha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    void testGetGreeting() {
        App app = new App();
        assertNotNull(app.getGreeting());
    }
}
