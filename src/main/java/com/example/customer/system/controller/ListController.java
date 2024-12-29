package com.example.customer.system.controller;

import com.example.customer.system.entity.CustomerInfo;
import com.example.customer.system.repository.CustomerRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * 顧客情報リストのController
 */
@Controller
@RequiredArgsConstructor
public class ListController {

  /** 顧客リポジトリ */
  private final CustomerRepository repository;

  /**
   * リスト画面の表示
   * @param model 全ての顧客情報
   * @return リスト画面
   */
  @GetMapping("customers")
  public String view(Model model){
    List<CustomerInfo> customerInfoList = repository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    model.addAttribute("customerList",customerInfoList);
    return "customer/customersList";
  }
}
