package com.cts.fsd.plms.policy.repository;

import org.springframework.data.jpa.repository.*;

import com.cts.fsd.plms.policy.domain.model.PolicyInfo;


public interface PolicyRepository extends JpaRepository<PolicyInfo, Long> {

}
