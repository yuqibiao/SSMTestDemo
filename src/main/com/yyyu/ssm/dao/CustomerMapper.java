package com.yyyu.ssm.dao;

import com.yyyu.ssm.pojo.Customer;
import com.yyyu.ssm.utils.page.Page;

import java.util.List;

public interface CustomerMapper {

    List<Customer>  getCustomersByPage(Page page);

}