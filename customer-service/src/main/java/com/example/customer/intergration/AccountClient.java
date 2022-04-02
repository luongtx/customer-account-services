package com.example.customer.intergration;

import com.example.customer.model.Account;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("account-service")
public interface AccountClient {

    @RequestMapping(method = RequestMethod.GET, value = "/customer/{customerId}")
    List<Account> getAccounts(@PathVariable("customerId") Integer customerId);
    
}
