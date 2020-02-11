package com.eastcom_sw.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: libertinus
 * @Date: 2020/2/11
 * @Description:
 */
@Controller
public class RestController {

  @RequestMapping("/demo")
  public String test(){
    return "data";
  }
}
