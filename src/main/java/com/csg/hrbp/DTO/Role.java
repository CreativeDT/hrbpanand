package com.csg.hrbp.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Role {
	
	private Integer roleId;
	private String jobTitle;
	private String roleName;

}
