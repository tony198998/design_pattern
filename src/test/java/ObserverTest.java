import com.design.MySpringBootApplication;
import com.design.observer.event.OrderEvent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MySpringBootApplication.class)
public class ObserverTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test01(){
        OrderEvent order = new OrderEvent(this, "用户下单成功");
        applicationContext.publishEvent(order);
        System.out.println("....................over........................");
    }
}