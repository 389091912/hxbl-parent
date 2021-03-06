package com.team.admin.server.service;

import com.team.admin.server.model.Permission;

public interface PermissionService {

	void save(Permission permission);

	void update(Permission permission);

	void delete(Long id);
}
