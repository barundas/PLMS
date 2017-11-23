CREATE TABLE `userinfo` (
  `userkey` int(11) DEFAULT NULL,
  `userid` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `confirmpassword` varchar(45) DEFAULT NULL,
  `firstname` varchar(45) DEFAULT NULL,
  `lastname` varchar(45) DEFAULT NULL,
  `address` varchar(2000) DEFAULT NULL,
  `contactnumber` varchar(15) DEFAULT NULL,
  `dateofbirth` datetime DEFAULT NULL,
  `email` varchar(256) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  UNIQUE KEY `userkey_UNIQUE` (`userkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `plms`.`userinfo`
(`userkey`,
`userid`,
`username`,
`password`,
`confirmpassword`,
`firstname`,
`lastname`,
`address`,
`contactnumber`,
`dateofbirth`,
`email`,
`status`)
VALUES
(1, 'Admin0101', 'Admin', 'Admin', 'Admin', '', '', '', '', '2017-11-23 17:45:55', 'admin@cts.com', '1');
INSERT INTO `plms`.`userinfo`
(`userkey`,
`userid`,
`username`,
`password`,
`confirmpassword`,
`firstname`,
`lastname`,
`address`,
`contactnumber`,
`dateofbirth`,
`email`,
`status`)
VALUES
(1, 'Barun0101', 'BarunDas', 'User01', 'User01', 'Barun', 'Das', 'Flat-UV09/03B, Udayan, 1050/1, Survey Park, Kolkata - 700075', '9903033301', '1977-12-22 17:45:55', 'barun3.das3@cognizant.com', '1');



CREATE TABLE `usergroups` (
  `groupkey` int(11) NOT NULL,
  `groupname` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`groupkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `plms`.`usergroups`
(`groupkey`,
`groupname`)
VALUES
(1, 'Admin');
INSERT INTO `plms`.`usergroups`
(`groupkey`,
`groupname`)
VALUES
(2, 'User');


CREATE TABLE `usergroupmember` (
  `userkey` int(11) NOT NULL,
  `groupkey` int(11) NOT NULL,
  PRIMARY KEY (`userkey`,`groupkey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `plms`.`usergroupmember`
(`userkey`,
`groupkey`)
VALUES
(1, 1);
INSERT INTO `plms`.`usergroupmember`
(`userkey`,
`groupkey`)
VALUES
(2, 2);

CREATE TABLE `policyinfo` (
  `policykey` int(11) NOT NULL,
  `policyid` varchar(45) DEFAULT NULL,
  `policyname` varchar(256) DEFAULT NULL,
  `policyinceptiondate` date DEFAULT NULL,
  `policminimumeligibilityage` int(11) DEFAULT NULL,
  `policmaximumeligibilityage` int(11) DEFAULT NULL,
  PRIMARY KEY (`policykey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Policy master table';

CREATE TABLE `policysubscriptiondetails` (
  `userkey` int(11) NOT NULL,
  `policykey` int(11) NOT NULL,
  `policystartdate` date DEFAULT NULL,
  `policyenddate` date DEFAULT NULL,
  `policyPremium` decimal(8,2) DEFAULT NULL,
  `totalpremiumpaid` decimal(8,2) DEFAULT NULL,
  `isvalid` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`userkey`,`policykey`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;