package com.zebra.controller;

import com.zebra.pojo.Address;
import com.zebra.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ResponseController {

    // 返回字符串
    @RequestMapping("/hello")
    public Result hello() {
        System.out.println("Hello World~");
        //return new Result(1, "success", "Hello World~");
        return Result.success("Hello World~");
    }

    // 返回对象
    @RequestMapping("/getAddr")
    public Result getAddr() {
        Address addr = new Address();
        addr.setProvince("浙江");
        addr.setCity("嘉兴");
        return Result.success(addr);
    }

    // 返回集合
    @RequestMapping("/listAddr")
    public Result listAddr() {

        ArrayList<Address> list = new ArrayList<>();

        Address addr1 = new Address();
        addr1.setProvince("广东");
        addr1.setCity("深圳");

        Address addr2 = new Address();
        addr2.setProvince("上海");
        addr2.setCity("上海");

        list.add(addr1);
        list.add(addr2);

        return Result.success(list);
    }
}
