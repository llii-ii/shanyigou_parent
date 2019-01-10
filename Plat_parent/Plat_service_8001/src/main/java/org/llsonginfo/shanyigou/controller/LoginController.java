package org.llsonginfo.shanyigou.controller;

import org.llsonginfo.shanyigou.domain.Employee;
import org.llsonginfo.shanyigou.util.AjaxResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        System.out.println(employee);
        if("admin".equals(employee.getUsername())&&"admin".equals(employee.getPassword()))
            return AjaxResult.me();
        return AjaxResult.me().setSuccess(false).setMessage("err");
    }
}
