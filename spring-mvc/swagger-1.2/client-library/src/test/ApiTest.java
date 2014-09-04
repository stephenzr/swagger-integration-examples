/**
 * Created by sryland on 9/2/14.
 */

/**
 Template from APIv2 Team IntelliJ
 */

import com.wordnik.client.api.Api;
import com.wordnik.client.model.RecordShop;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ApiTest {

    private final String PATH = "http://localhost:8083";

    @Test
    public void getRecordShop_VerifyDefaultName_Test() throws Exception {
        Api api = new Api();
        api.setBasePath(PATH);

        RecordShop shop = api.getRecordShop();

        Assert.assertEquals("Reckless", shop.getName());

    }


    @Test
    public void getRecordShop_VerifyStoreName_Test() throws Exception {
        Api api = new Api();
        api.setBasePath(PATH);

        RecordShop shop = api.getRecordShopByName("foo");

        Assert.assertEquals("foo", shop.getName());

    }

    @Test
    public void getRecordShop_VerifyNumber_Test() throws Exception {
        Api api = new Api();
        api.setBasePath(PATH);

        RecordShop shop = api.getRecordShopById(5678);

        Assert.assertEquals(new Integer(5678), shop.getStoreNumber());

    }
}