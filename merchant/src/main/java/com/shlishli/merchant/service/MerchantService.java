package com.shlishli.merchant.service;

import com.shlishli.merchant.entity.Merchant;
import com.shlishli.merchant.repository.MerchantRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import java.util.Optional;

@Service
@Slf4j
public class MerchantService {

    @Autowired
    MerchantRepository merchantRepository;

	public Merchant registerMerchant(Merchant merchant) {
		return merchantRepository.save(merchant);
	}

	public Optional<Merchant> findMerchantById(Long merchantId) {
		return merchantRepository.findById(merchantId);
	}



	public Merchant findByFirebaseMerchantId(String firebaseMerchantId) {
		return merchantRepository.findByFirebaseMerchantId(firebaseMerchantId);
	}
}
