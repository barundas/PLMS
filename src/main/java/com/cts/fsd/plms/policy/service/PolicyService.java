package com.cts.fsd.plms.policy.service;

import java.util.List;

import com.cts.fsd.plms.policy.domain.model.PolicyInfo;

public interface PolicyService {

	public List<PolicyInfo> getPolicyInfoList();
	
	public PolicyInfo getPolicyInfoByKey(long policyKey);
	
	public PolicyInfo updatePolicyInfo(PolicyInfo policyInfo);
}
