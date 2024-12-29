package com.example.customer.system.controller;

import com.example.customer.system.entity.CustomerInfo;
import com.example.customer.system.form.AddForm;
import com.example.customer.system.service.AddService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * 新規登録のController
 */
@Controller
@RequiredArgsConstructor
public class AddController {

  /** 新規追加service */
  private final AddService service;

  /**
   * 顧客情報の追加画面
   * @param form 顧客情報フォーム
   * @return 顧客情報追加画面
   */
  @GetMapping("customers/add")
  public String addCustomerInfo(AddForm form){
    return "customer/add";
  }

  /**
   * 顧客情報の追加
   * @param customerInfo 顧客情報
   * @param result エラーメッセージ
   * @return 正常に追加されれば、顧客リストにリダイレクト、エラーが発生すればエラーメッセージを追加画面に表示
   */
  @PostMapping("customers/add")
  public String resistCustomerInfo(@Valid @ModelAttribute("addForm") CustomerInfo customerInfo, BindingResult result){
    if (result.hasErrors()){
      return "customer/add";
    }else{
      service.addCustomer(customerInfo);
      return "redirect:/customers";
    }
  }
}
