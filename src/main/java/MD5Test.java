import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by banma on 2018/1/10.
 */
public class MD5Test {

    public static String KEY = "MD5";

    public static void main(String[] args) {
        String name = "xunyajie";
        try {
            MessageDigest md = MessageDigest.getInstance(KEY);
            byte[] inputData = name.getBytes();
//            md.update(inputData);
            BigInteger bigInteger = new BigInteger(md.digest(inputData));
            System.out.println(bigInteger.toString(16));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

    }

}
