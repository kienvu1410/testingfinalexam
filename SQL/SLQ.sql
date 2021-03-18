DROP DATABASE IF EXISTS UserManager;
CREATE DATABASE UserManager;
USE UserManager;

/*============================== CREATE TABLE =======================================*/
/*======================================================================================*/

-- create table 1: Department  id, FullName, Email, Password
CREATE TABLE `employee`(
	ID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    ProjectId INT  NOT NULL,
    ProSkill ENUM('dev',  'test'),
    `Role`		ENUM('employee')
);
CREATE TABLE project(
	ProjectId	INT UNSIGNED,
	TeamSize 	VARCHAR(50)  NOT NULL,
  IdManager 		VARCHAR(50) NOT NULL,
  IdEmployee	VARCHAR(50) NOT NULL
);
CREATE TABLE manager(
	ID 		TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
	FullName 	VARCHAR(50) UNIQUE KEY NOT NULL,
    Email 		VARCHAR(50) UNIQUE KEY NOT NULL,
    `Password`	VARCHAR(50) NOT NULL CHECK(length(`Password`) >= 6),
    `Role`		ENUM('manager'),
    ExpInYear INT NOT NULL
);
INSERT INTO employee (ID, FullName, Email, `Password`, ProjectId, ProSkill, `Role`)
VALUES
					(1,			'Nguyễn Thị Mỵ',	'mynt2407@gmail.com', 'Mynguyen123',1,		'dev', 'employee'	),
					(2,			'Nguyễn Ngọc Duy',	'duynn03@gmail.com', 'duyNguyen',1,	'dev',		'employee'	),
                    (3,			'Nguyễn Hùng Mạnh','hungmanh@gmail.com', 'hunGmanh1',1,	'test',		'employee'	),
                    (4,		'Tống Thị Nhung',	'nhung@gmail.com', 		'nhungtOng',2,	'dev',	'employee'	),
                    (5,			'Trần Thị Kim Anh','kimoanh.tran@gmail.com', 'tran.kim',2,	'dev',	'employee'	);
                    INSERT INTO manager  (ID   , FullName, 			Email,				 `Password`,			`Role`, ExpInYear	) 
VALUES
					(1,			'Nguyễn Thị Tram,',	'tram2407@gmail.com', 'Mynguyen123667',		'manager', 7	),
					(2,			'Nguyễn Ngọc Quang',	'quang03@gmail.com', 'duyNguyen123',			'manager', 8	),
                    (3,			'Nguyễn Hùng Dang','dang@gmail.com', 'hunGmanh1231',			'manager', 7	),
                    (4,			'Tống Thị Van',	'van@gmail.com', 		'nhungtOng23',		'manager',8	),
                    (5,			'Trần Thị Oanh','oanh.tran@gmail.com', 'tran.kim23',		'manager',5	);
                    INSERT INTO Project( ProjectId, TeamSize, IdManager, IdEmployee)
                    VALUES (1, 10, 2, 1),
                    (2,12,1,2)