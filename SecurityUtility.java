import org.bouncycastle.pqc.jcajce.provider.BouncyCastlePQCProvider;
import java.security.KeyPairGenerator;
import java.security.Security;
import org.bouncycastle.pqc.crypto.kyber.KyberParameterSpec;

public class SecurityUtility {

  public void generateKeyPair() {
    Security.addProvider(new BouncyCastlePQCProvider());
    KeyPairGenerator keyGen = KeyPairGenerator.getInstance("Kyber512", new BouncyCastlePQCProvider());
    keyGen.initialize(new KyberParameterSpec(KyberParameterSpec.kyber512));
  }
}