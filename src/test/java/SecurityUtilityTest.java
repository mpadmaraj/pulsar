import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SecurityUtilityTest {

  @Test
  void testKeyPairGeneration() {
    SecurityUtility securityUtility = new SecurityUtility();
    securityUtility.generateKeyPair();
    // Add assertions or verification here to ensure key pair generation is successful
  }
}