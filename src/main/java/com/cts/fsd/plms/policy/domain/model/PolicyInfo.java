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
	
	@Column(name = "policycode")
	private String policyCode;
	
	@Column(name = "policyname")
	private String policyName;
	
	@Column(name = "policydescription")
	private String policyDescription;
	
	@Column(name = "policyinceptiondate")
	private String policyInceptionDate;
	
	@Column(name = "eligibleminage")
	private int eligibleMinAge;
	
	@Column(name = "eligiblemaxage")
	private int eligibleMaxAge;

	public int getPolicyKey() {
		return policyKey;
	}

	public void setPolicyKey(int policyKey) {
		this.policyKey = policyKey;
	}

	public String getPolicyCode() {
		return policyCode;
	}

	public void setPolicyCode(String policyCode) {
		this.policyCode = policyCode;
	}

	public String getPolicyName() {
		return policyName;
	}

	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}

	public String getPolicyDescription() {
		return policyDescription;
	}

	public void setPolicyDescription(String policyDescription) {
		this.policyDescription = policyDescription;
	}

	public String getPolicyInceptionDate() {
		return policyInceptionDate;
	}

	public void setPolicyInceptionDate(String policyInceptionDate) {
		this.policyInceptionDate = policyInceptionDate;
	}

	public int getEligibleMinAge() {
		return eligibleMinAge;
	}

	public void setEligibleMinAge(int eligibleMinAge) {
		this.eligibleMinAge = eligibleMinAge;
	}

	public int getEligibleMaxAge() {
		return eligibleMaxAge;
	}

	public void setEligibleMaxAge(int eligibleMaxAge) {
		this.eligibleMaxAge = eligibleMaxAge;
	}
	
}
