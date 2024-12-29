package com.example.customer.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * index画面のコントローラー
 */

@Controller
@RequestMapping("/")
public class IndexController {

  /**
   * index画面
   *
   * @return 遷移先
   */

  @RequestMapping("index")
  public String index(){
    return "index";
  }
}
