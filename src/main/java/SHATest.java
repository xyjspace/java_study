import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by banma on 2018/1/10.
 */
public class SHATest {

    public static final String KEY_SHA = "SHA";

    public static void main(String[] args) {

        String name = "xunyajie";
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
            messageDigest.update(name.getBytes());
            BigInteger bigInteger = new BigInteger(messageDigest.digest());
            System.out.println(bigInteger.toString(32));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }


    }

}
