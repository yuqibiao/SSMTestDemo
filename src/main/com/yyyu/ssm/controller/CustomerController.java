package com.yyyu.ssm.controller;

import com.yyyu.ssm.biz.BaseDictBiz;
import com.yyyu.ssm.biz.CustomerBiz;
import com.yyyu.ssm.pojo.BaseDict;
import com.yyyu.ssm.pojo.Customer;
import com.yyyu.ssm.pojo.CustomerQueryVo;
import com.yyyu.ssm.utils.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 功能：Customer控制器
 *
 * @author yu
 * @date 2017/7/19.
 */
@Controller
public class CustomerController {

    @Autowired
    private CustomerBiz customerBiz;
    @Autowired
    private BaseDictBiz baseDictBiz;

    @Value("${fromType.code}")
    private String fromTypeCode;
    @Value("${industryType.code}")
    private String industryTypeCode;
    @Value("${levelType.code}")
    private String levelTypeCode;


    @RequestMapping(value = "/customer/deleteCustomer.action", method = RequestMethod.POST)
    public @ResponseBody String deleteCustomerByCustId(long custId){
        customerBiz.deleteCustomerByCustId(custId);
        return "删除成功";
    }

    @RequestMapping(value = "/customer/modifyCustomer.action", method = RequestMethod.POST)
    public @ResponseBody  String  modifyCustomer(Customer customer){
        Customer customer1 = customer;
        customerBiz.modifyCustomerByCustId(customer);
        return "修改成功";
    }

    @RequestMapping("/customer/getCustomerByCustId.action")
    public @ResponseBody  Customer getCustomerByCustId(long custId){
        return  customerBiz.getCustomerByCustId(custId);
    }

    @RequestMapping("/customer/list.action")
    public String listCustomer(CustomerQueryVo queryVo , Model model){
        String result = "customer";
        List<BaseDict> fromType =  baseDictBiz.getBaseDictByTypeCode(fromTypeCode);
        List<BaseDict> industryType =  baseDictBiz.getBaseDictByTypeCode(industryTypeCode);
        List<BaseDict> levelType =  baseDictBiz.getBaseDictByTypeCode(levelTypeCode);
        Page<Customer> page = customerBiz.getPageByQueryVo(queryVo);
        model.addAttribute("page" ,page );
        model.addAttribute("fromType" ,fromType );
        model.addAttribute("industryType" ,industryType );
        model.addAttribute("levelType" ,levelType );

        return result;
    }

}
