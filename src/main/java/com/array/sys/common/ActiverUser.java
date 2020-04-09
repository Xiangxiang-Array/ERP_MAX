package com.array.sys.common;

import java.util.List;

import com.array.sys.domain.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author array
 *
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ActiverUser {

	private User user;
	
	private List<String> roles;
	
	private List<String> permissions;
}
