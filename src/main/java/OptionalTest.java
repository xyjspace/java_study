import java.util.Optional;

/**
 * Created by banma on 2018/1/19.
 */
public class OptionalTest {

    public static void main(String[] args) {

        Optional<String> opt = Optional.of("213");

        System.out.println(opt.get());
    }

}
