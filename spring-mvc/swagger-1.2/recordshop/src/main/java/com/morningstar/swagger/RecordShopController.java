package com.morningstar.swagger;

import com.morningstar.swagger.entities.RecordShop;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Api(value = "Recordshop")
@Controller
@RequestMapping("/recordShop")
public class RecordShopController {


    //maps to root off the controller
    @ApiOperation(value="Get Default Record Shop", response=RecordShop.class)
    @RequestMapping( method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<RecordShop> getRecordShop(){

        RecordShop shop = new RecordShop();
        shop.name = "Reckless";
        shop.storeNumber = 5678;

        return new ResponseEntity<RecordShop>(shop, HttpStatus.OK);
    }


    @RequestMapping(value="/name/{name}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<RecordShop> getRecordShopByName(@PathVariable(value="name") String name){

        RecordShop shop = new RecordShop();
        shop.name = name;
        shop.storeNumber = 5678;

        return new ResponseEntity<RecordShop>(shop, HttpStatus.OK);
    }

    @RequestMapping(value="/number/{number}", method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<RecordShop> getRecordShopById(@PathVariable(value="number") int number){

        RecordShop shop = new RecordShop();
        shop.name = "Reckless foo";
        shop.storeNumber = number;

        return new ResponseEntity<RecordShop>(shop, HttpStatus.OK);
    }
}
