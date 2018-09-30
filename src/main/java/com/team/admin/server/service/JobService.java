package com.team.admin.server.service;

import org.quartz.JobDataMap;
import org.quartz.SchedulerException;

import com.team.admin.server.model.JobModel;

public interface JobService {

	void saveJob(JobModel jobModel);

	void doJob(JobDataMap jobDataMap);

	void deleteJob(Long id) throws SchedulerException;
}
