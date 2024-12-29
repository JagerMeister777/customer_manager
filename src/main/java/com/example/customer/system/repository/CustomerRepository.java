package com.example.customer.system.repository;

import com.example.customer.system.entity.CustomerInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * 顧客リポジトリインターフェース
 */

@Repository
public interface CustomerRepository extends JpaRepository<CustomerInfo, Long> {

}
