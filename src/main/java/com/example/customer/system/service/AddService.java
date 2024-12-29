package com.example.customer.system.service;

import com.example.customer.system.entity.CustomerInfo;
import com.example.customer.system.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 新規登録Service
 */
@Service
@RequiredArgsConstructor
public class AddService {

  /** 顧客情報リポジトリ */
  private final CustomerRepository repository;

  /**
   * 顧客情報の登録
   * @param customerInfo 顧客情報
   */
  public void addCustomer(CustomerInfo customerInfo){
    repository.save(customerInfo);
  }
}
