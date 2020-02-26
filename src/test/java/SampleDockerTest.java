import io.qameta.allure.Allure;
import org.junit.jupiter.api.Test;

/**
 * Created by ngoyal on 26/02/20.
 */
public class SampleDockerTest {


    @Test
    public void sampleTest(){
        System.out.println("This test will run in docker container");
        Allure.addAttachment("sampleAttachment", "The test executed in docker container");
    }
}
