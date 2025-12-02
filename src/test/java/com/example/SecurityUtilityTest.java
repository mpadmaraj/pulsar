package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecurityUtilityTest {
 @Test
d public void testQuantumSafePrimitive() {
  // Arrange
  String input = "exampleData";

  // Act
  String result = SecurityUtility.encrypt(input);

  // Assert
  assertEquals("expectedQuantumSafeOutput", result);
 }
}