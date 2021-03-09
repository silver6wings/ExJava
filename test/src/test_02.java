import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
@Target(ElementType.METHOD)
@interface test_annotation {
}

public class test_02 {

    @test_annotation
    public static void main(String[] args) {
        System.out.println(123);
    }
}
