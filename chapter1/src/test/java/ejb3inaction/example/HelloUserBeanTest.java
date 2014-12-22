package ejb3inaction.example;

import javax.ejb.EJB;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Unit Test for the HelloUserBean
 */
@RunWith(Arquillian.class)
public class HelloUserBeanTest {

    @EJB
    private HelloUser helloUser;

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(WebArchive.class, "client1-test.war")
        .addClasses(HelloUser.class, HelloUserBean.class);
    }

    /**
     * Tests the hello message
     */
    @Test
    public void testSayHello() {
        String helloMessage = helloUser.sayHello("Curious George");
        Assert.assertEquals("Message did not match.","Hello Curious George welcome to EJB 3.1!",helloMessage);
    }
}
