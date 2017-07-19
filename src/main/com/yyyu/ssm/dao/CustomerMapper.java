package com.yyyu.ssm.dao;

import com.yyyu.ssm.pojo.Customer;
import com.yyyu.ssm.pojo.CustomerQueryVo;
import com.yyyu.ssm.utils.page.Page;

import java.util.List;

public interface CustomerMapper {

    void deleteCustomerByCustId(long custId);

    Customer getCustomerByCustId(long custId);

    Integer getCustomerTotal(CustomerQueryVo customerQueryVo);

    List<Customer>  getCustomersByQueryVo(CustomerQueryVo queryVo);

    void modifyCustomerByCustId(Customer customer);

}