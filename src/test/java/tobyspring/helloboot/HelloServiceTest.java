package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloServiceTest {

    @Test
    void simpleHelloService(){
        HelloService service = new SimpleHelloService();
        String result = service.sayHello("Test");
        Assertions.assertThat(result).isEqualTo("Hello Test");
    }

    @Test
    void helloDecorator(){
        HelloDecorator decorator = new HelloDecorator(name -> name);
        String ret = decorator.sayHello("Test");
        Assertions.assertThat(ret).isEqualTo("*Test*");
    }
}