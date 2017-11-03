package com.sample.tx.service;

import java.util.List;
import org.springframework.dao.DataAccessException;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import com.sample.tx.dao.JobDao;
import com.sample.tx.vo.Job;


public class JobServiceImpl implements JobService {

	private JobDao jobDao;
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	private PlatformTransactionManager tx;
	public void setTx(PlatformTransactionManager tx) {
		this.tx = tx;
	}
	
	public void addAllJobs(List<Job> jobs) {
		TransactionDefinition def = new DefaultTransactionDefinition();
		// status -> 현재 진행중인 트랜잭션의 정보를 담음
		TransactionStatus status = tx.getTransaction(def);
				
		try {
		
			if(jobs == null || jobs.isEmpty()) {
				return;
			}
			
			for (Job job : jobs) {
				jobDao.addJob(job);
			}
			tx.commit(status);
		}catch (DataAccessException e) {
			tx.rollback(status);
			throw e;
		}
		
	}
}
