package com.example.customer.system.controller;

import com.example.customer.system.service.DeleteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 顧客情報の削除Controller
 */
@Controller
@RequiredArgsConstructor
public class DeleteController {

  /** 削除Servie */
  private final DeleteService service;

  /**
   * 顧客情報の削除
   * @param id 顧客ID
   * @return 削除後は顧客リストにリダイレクト
   */
  @RequestMapping("/customers/{id}/delete")
  public String deleteCustomer(@PathVariable("id") Long id){
    service.deleteCustomer(id);
    return "redirect:/customers";
  }
}
