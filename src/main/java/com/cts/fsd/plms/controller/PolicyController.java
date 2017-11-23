package com.cts.fsd.plms.controller;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cts.fsd.plms.policy.domain.model.PolicyInfo;
import com.cts.fsd.plms.policy.service.PolicyService;

@RestController
@RequestMapping(value="/policy")
public class PolicyController {
	
	private final static Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
	
	@Autowired
	private PolicyService policyService;
	
	
	@RequestMapping(value = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@PreAuthorize("hasRole('Admin')")
	public List<PolicyInfo> getAllPolicies() {
		logger.info("Fetch all PolicyInfo");
		return policyService.getPolicyInfoList();
	}
	
	@RequestMapping(value = "/{policykey}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@PostAuthorize("hasRole('Admin') or returnObject.policykey == principal.policykey")
	public ResponseEntity<PolicyInfo> getPolicyByKey(@PathVariable("policykey") long policyKey) {
		logger.info("Fetch PolicyDetail for policyKey: " + policyKey);
		
		PolicyInfo policyInfo = policyService.getPolicyInfoByKey(policyKey);
		
		if(policyInfo == null) {
			return new ResponseEntity<PolicyInfo>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<PolicyInfo>(policyInfo, HttpStatus.OK);
		}		
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	@PreAuthorize("hasRole('Admin')")
	public PolicyInfo createPolicy(@RequestBody PolicyInfo policyInfo) {
		return policyInfo;
	}
	
	@RequestMapping(value = "/{policykey}", method = RequestMethod.PUT)
	@PreAuthorize("hasRole('Admin')")
	public ResponseEntity<PolicyInfo> updatePolicy(@PathVariable("policykey") String policyKey, @Valid @RequestBody PolicyInfo policyInfo) {
		List<String> policies = null;
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/{policykey}", method = RequestMethod.DELETE)
	@PreAuthorize("hasRole('Admin')")
	public ResponseEntity<PolicyInfo> deletePolicy(@PathVariable("policykey") String policyKey) {
		List<String> policies = new ArrayList<String>();
		policies.add("Policy 001");
		policies.add("Policy 002");
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@RequestMapping(value = "/all", method = RequestMethod.DELETE)
	@PreAuthorize("hasRole('Admin')")
	public List<String> deleteAllPolicies() {
		List<String> policies = new ArrayList<String>();
		policies.add("Policy 001");
		policies.add("Policy 002");
		
		return policies;
	}

}
