package com.example.customer.system.service;

import com.example.customer.system.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 削除Service
 */
@Service
@RequiredArgsConstructor
public class DeleteService {

  //* 顧客リポジトリ */
  private final CustomerRepository repository;

  /**
   * 顧客情報の削除
   * @param id 顧客ID
   */
  public void deleteCustomer(Long id){
    repository.deleteById(id);
  }
}
