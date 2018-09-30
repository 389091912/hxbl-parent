package com.team.admin.server.service;

import com.team.admin.server.model.SysLogs;

/**
 * 日志service
 * 
 * @author wsy
 *
 *         2017年8月19日
 */
public interface SysLogService {

	void save(SysLogs sysLogs);

	void save(Long userId, String module, Boolean flag, String remark);

	void deleteLogs();
}
