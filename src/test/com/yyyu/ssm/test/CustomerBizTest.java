package com.yyyu.ssm.test;

import com.yyyu.ssm.biz.CustomerBizImpl;
import com.yyyu.ssm.pojo.Customer;
import com.yyyu.ssm.pojo.CustomerQueryVo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/19.
 */


public class CustomerBizTest extends BaseTest{

    @Autowired
    private CustomerBizImpl customerBiz;


    @Test
    public void testGetCustomerByCustId(){
        customerBiz.getCustomerByCustId(29l);
    }

    @Test
    public void testGetCustomerTotal(){

    }

    @Test
    public void testGetCustomersByQueryVo(){
        CustomerQueryVo customerQueryVo = new CustomerQueryVo();
        int pageNow = 1;
        int pageSize = 10;
        int startRow = (pageNow-1)*pageSize;
        customerQueryVo.setPage(pageNow);
        customerQueryVo.setSize(pageSize);
        customerQueryVo.setRows(startRow);
        customerQueryVo.setCustSource("7");
        customerQueryVo.setCustIndustry("1");
        customerQueryVo.setCustLevel("23");
        List<Customer> customerList =  customerBiz.getCustomersByQueryVo(customerQueryVo);
        for (Customer customer:customerList) {
            System.out.println("customer:"+customer);
        }
    }

    @Test
    public void testModifyCustomerByCustId(){
        Customer customer = new Customer();
        customer.setCustId(29l);
        customer.setCustName("中文字符");
        customer.setCustMobile("13165691974");
        customerBiz.modifyCustomerByCustId(customer);
    }

}
