CREATE TABLE hrbp.Departments (
    departmentId INT PRIMARY KEY,
    departmentName VARCHAR(50) UNIQUE

);


CREATE TABLE hrbp.Roles (
    roleId INT PRIMARY KEY,
	jobTitle VARCHAR(50),
    roleName VARCHAR(50) UNIQUE

);

CREATE TABLE hrbp.EmployeeMasterTable (
    employeeId INT PRIMARY KEY,
    firstName VARCHAR(50),
    lastName VARCHAR(50),
    roleId INT,  
    departmentId INT, 
    managerId INT, 
	buHeadId INT, 
	joiningDate DATE, 
	
	CONSTRAINT fk_manager FOREIGN KEY (managerID) REFERENCES EmployeeMasterTable(employeeId),
    CONSTRAINT fk_role FOREIGN KEY (roleId) REFERENCES Roles(roleId),
    CONSTRAINT fk_department FOREIGN KEY (departmentId) REFERENCES Departments(departmentId),
    CONSTRAINT fk_buhead FOREIGN KEY (buHeadId) REFERENCES EmployeeMasterTable(employeeId)

	
);


CREATE TABLE hrbp.Feedback(
    ticketId INT PRIMARY KEY,
    creatorId INT,  
    ticketDetails TEXT,
    status VARCHAR(20),
    createdDate DATETIME,
    lastStatusChangeDate DATETIME,
    CONSTRAINT fk_creator FOREIGN KEY (creatorId) REFERENCES EmployeeMasterTable(employeeId)
);
