package com.example.customer.system.controller;

import com.example.customer.system.entity.CustomerInfo;
import com.example.customer.system.service.UpdateService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 顧客情報の更新Controller
 */
@Controller
@RequestMapping("/customers")
@RequiredArgsConstructor
public class UpdataController {

  /** 更新処理ロジック */
  private final UpdateService service;

  /**
   * 顧客情報の更新画面
   * @param id 顧客ID
   * @param model 顧客情報
   * @return 更新画面
   */
  @GetMapping("/{id}/update")
  public String showCustomerInfo(@PathVariable("id") Long id, Model model){
    model.addAttribute("customer", service.showCustomerInfo(id));
    return "customer/update";
  }

  /**
   * 顧客情報の更新
   * @param customerInfo 顧客情報
   * @param result 更新するデータがエラーかどうか
   * @param model エラーメッセージ
   * @return 更新が正常に完了したら顧客リストにリダイレクト エラーが発生すれば更新画面にエラーメッセージを表示
   */
  @PostMapping("/{id}/update")
  public String customerUpdate(@Valid @ModelAttribute("customer") CustomerInfo customerInfo, BindingResult result, Model model){
    if (result.hasErrors()){
      return "customer/update";
    }else{
      service.updateCustomerInfo(customerInfo);
      return "redirect:/customers";
    }

  }
}
