package com.actionbazaar.buslogic;

import com.actionbazaar.persistence.Bidder;
import com.actionbazaar.persistence.Billing;
import com.actionbazaar.persistence.Item;
import com.actionbazaar.persistence.Shipping;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.ejb.EJB;
import java.util.Date;
import java.util.List;

/**
 * Created by john@bagab.org on 12/21/14.
 * <p/>
 * Replacement for the original ItemServiceTest, OrderProcessorTest, and UserServiceTest. Includes all tests in a single file.
 * <p/>
 * Runs tests faster by avoiding multiple deployments and restarts of the embedded container. Another option could be the the unofficial Arquillian test suite extension @ https://github.com/ingwarsw/arquillian-suite-extension. To see the difference comment out @RunWith line and the body of the class and comment in ItemServiceTest, OrderProcessorTest, and UserServiceTest java files, @RunWith lines and the body of the classes.
 */
//@RunWith(Arquillian.class)
public class IntegrationTest {

//    @Deployment
//    public static Archive<?> createDeployment() {
//        return ShrinkWrap.create(WebArchive.class, "chapter2-test.war")
//                .addAsResource("META-INF/test-persistence.xml","META-INF/persistence.xml")
//                .addAsWebInfResource(EmptyAsset.INSTANCE, "beans.xml")
//                .addAsWebInfResource("test-ds.xml")
//                        // add all classes under com.actionbazaar.persistence
//                .addPackage(Bidder.class.getPackage())
//                        // add all classes under com.actionbazaar.buslogic
//                .addPackage(OrderProcessor.class.getPackage())
//                ;
//    }
//
//    @EJB
//    private ItemService itemService;
//
//
//    /**
//     * Test persistence of item
//     */
//    @Test
//    public void testItemPersistence() {
//        Item item = new Item("Apple IIGS", new Date(), new Date(), 45.0f);
//        itemService.createItem(item);
//        Assert.assertNotNull(item.getItemId());
//        itemService.getItem(item.getItemId());
//    }
//
//    @EJB
//    private UserService userService;
//
//    /**
//     * Test persistence of a user
//     */
//    @Test
//    public void testBidderPersistence() {
//        Bidder bidder = new Bidder("John", "Wesley Powell", 1869l);
//        userService.createUser(bidder);
//        Assert.assertNotNull(bidder.getBidderId());
//        Assert.assertNotNull(userService.getUser(bidder.getBidderId()));
//    }
//
//    @EJB
//    private OrderProcessor orderProcessor;
//
//    /**
//     * Test processing an order
//     */
//    @Test
//    public void testOrderProcessor() {
//        // set things up
//        Item item = new Item("Apple IIGS", new Date(), new Date(), 45.0f);
//        itemService.createItem(item);
//        Bidder bidder = new Bidder("John", "Wesley Powell", 1869l);
//        userService.createUser(bidder);
//        Long itemId = item.getItemId();
//        Long userId = bidder.getBidderId();
//
//        bidder = (Bidder) userService.getUser(userId);
//
//        // Test item
//        item = itemService.getItem(itemId);
//
//        orderProcessor.setBidder(bidder);
//        orderProcessor.setItem(item);
//
//        // Get the shipping history of the test bidder
//        List<Shipping> shippingChoices = orderProcessor.getShippingChoices();
//        Assert.assertNotNull(shippingChoices);
//
//        // Choose the first one in the list
//        orderProcessor.setShipping(shippingChoices.get(0));
//
//        // Get the billing history of the test bidder
//        List<Billing> billingChoices = orderProcessor.getBillingChoices();
//
//        // Choose the first one in the list
//        orderProcessor.setBilling(billingChoices.get(0));
//
//        // Finish the workflow and end the stateful session
//        orderProcessor.placeOrder();
//    }

}
