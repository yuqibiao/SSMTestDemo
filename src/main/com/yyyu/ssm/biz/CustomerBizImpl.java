package com.yyyu.ssm.biz;

import com.yyyu.ssm.dao.CustomerMapper;
import com.yyyu.ssm.pojo.Customer;
import com.yyyu.ssm.pojo.CustomerQueryVo;
import com.yyyu.ssm.utils.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 功能：
 *
 * @author yu
 * @date 2017/7/18.
 */
@Service
public class CustomerBizImpl implements CustomerBiz{

    @Autowired
    private CustomerMapper customerMapper;

    @Override
    public void deleteCustomerByCustId(long custId) {
        customerMapper.deleteCustomerByCustId(custId);
    }

    @Override
    public Customer getCustomerByCustId(long custId) {
        return customerMapper.getCustomerByCustId(custId);
    }

    @Override
    public List<Customer> getCustomersByQueryVo(CustomerQueryVo queryVo) {

        return customerMapper.getCustomersByQueryVo(queryVo);
    }

    @Override
    public Page<Customer> getPageByQueryVo(CustomerQueryVo queryVo) {
        Page<Customer> page = new Page<>();
        page.setSize(queryVo.getSize());
        page.setPage(queryVo.getPage());
        page.setTotal(customerMapper.getCustomerTotal(queryVo));
        page.setRows(getCustomersByQueryVo(queryVo));
        return page;
    }

    @Override
    public void modifyCustomerByCustId(Customer customer) {
        customerMapper.modifyCustomerByCustId(customer);
    }
}
