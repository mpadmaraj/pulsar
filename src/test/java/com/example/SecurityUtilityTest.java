package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SecurityUtilityTest {
    @Test	public void testQuantumSafety() {
        SecurityUtility securityUtility = new SecurityUtility();
        assertTrue(securityUtility.isQuantumSafe());
    }
}
