package com.cts.fsd.plms.policy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.fsd.plms.policy.domain.model.PolicyInfo;
import com.cts.fsd.plms.policy.repository.PolicyRepository;
import com.cts.fsd.plms.policy.service.PolicyService;

@Service
public class PolicyServiceImpl implements PolicyService {

	@Autowired	
	private PolicyRepository policyRepository;
	
	@Override
	public List<PolicyInfo> getPolicyInfoList() {
		return policyRepository.findAll();
	}

	@Override
	public PolicyInfo getPolicyInfoByKey(long policyKey) {
		return policyRepository.findOne(policyKey);
	}

	@Override
	public PolicyInfo updatePolicyInfo(PolicyInfo policyInfo) {
		return policyRepository.save(policyInfo);
	}

}
