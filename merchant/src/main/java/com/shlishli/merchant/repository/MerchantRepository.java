package com.shlishli.merchant.repository;

import com.shlishli.merchant.entity.Merchant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MerchantRepository extends JpaRepository<Merchant, Long>{


    Merchant findByFirebaseMerchantId(String firebaseMerchantId);
}
