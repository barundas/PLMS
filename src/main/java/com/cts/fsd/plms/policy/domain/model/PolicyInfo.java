package com.cts.fsd.plms.policy.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policyinfo")
public class PolicyInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "policykey", unique = true, nullable = false)
	private int policyKey;
	
	@Column(name = "policyid")
	private String policyid;
	
	@Column(name = "policyname")
	private String policyName;
	
	@Column(name = "policyinceptiondate")
	private String policyInceptionDate;
	
	@Column(name = "policminimumeligibilityage")
	private int policyMinimumEligibilityAge;
	
	@Column(name = "policmaximumeligibilityage")
	private int policyMaximumEligibilityAge;

	public int getPolicyKey() {
		return policyKey;
	}

	public void setPolicyKey(int policyKey) {
		this.policyKey = policyKey;
	}

	public String getPolicyid() {
		return policyid;
	}

	public void setPolicyid(String policyid) {
		this.policyid = policyid;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyInceptionDate() {
		return policyInceptionDate;
	}

	public void setPolicyInceptionDate(String policyInceptionDate) {
		this.policyInceptionDate = policyInceptionDate;
	}

	public int getPolicyMinimumEligibilityAge() {
		return policyMinimumEligibilityAge;
	}

	public void setPolicyMinimumEligibilityAge(int policyMinimumEligibilityAge) {
		this.policyMinimumEligibilityAge = policyMinimumEligibilityAge;
	}

	public int getPolicyMaximumEligibilityAge() {
		return policyMaximumEligibilityAge;
	}

	public void setPolicyMaximumEligibilityAge(int policyMaximumEligibilityAge) {
		this.policyMaximumEligibilityAge = policyMaximumEligibilityAge;
	}
	
}
