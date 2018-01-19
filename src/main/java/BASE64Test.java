import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

/**
 * Created by banma on 2018/1/10.
 */
public class BASE64Test {

    public static void main(String[] args) {

        BASE64Encoder base64Encoder = new BASE64Encoder();
        BASE64Decoder base64Decoder = new BASE64Decoder();

        String name = "xunyajie";

        String result = base64Encoder.encodeBuffer(name.getBytes());

        System.out.println(result);

        try {
            String decode = new String(base64Decoder.decodeBuffer(result));
            System.out.println(decode);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
