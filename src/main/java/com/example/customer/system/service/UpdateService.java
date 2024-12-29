package com.example.customer.system.service;

import com.example.customer.system.entity.CustomerInfo;
import com.example.customer.system.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


/**
 * 更新Service
 */
@Service
@RequiredArgsConstructor
public class UpdateService {

  /** 顧客リポジトリ */
  private final CustomerRepository repository;

  /**
   * 顧客情報の検索
   * @param id 顧客ID
   * @return 検索結果
   */
  public CustomerInfo showCustomerInfo(Long id){
    return repository.getReferenceById(id);
  }

  /**　
   * 顧客情報の更新処理
   * @param customerInfo 顧客情報
   */
  public void updateCustomerInfo(CustomerInfo customerInfo){
    repository.save(customerInfo);
  }
}
