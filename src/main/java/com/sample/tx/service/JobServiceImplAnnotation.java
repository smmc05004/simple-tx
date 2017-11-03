package com.sample.tx.service;

import java.util.List;
import com.sample.tx.dao.JobDao;
import com.sample.tx.vo.Job;

public class JobServiceImplAnnotation implements JobService {

	private JobDao jobDao;
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	public void addAllJobs(List<Job> jobs) {
		
		if(jobs == null || jobs.isEmpty()) {
			return;
		}
		
		for (Job job : jobs) {
			jobDao.addJob(job);
		}
	}
}
