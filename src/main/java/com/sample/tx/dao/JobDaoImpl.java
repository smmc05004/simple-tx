package com.sample.tx.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.sample.tx.vo.Job;

public class JobDaoImpl implements JobDao {

	private JdbcTemplate template;
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
	}
	
	public void addJob(Job job) {

		String sql = "insert into jobs values (?,?,?,?)";
		template.update(sql, job.getId(),
							job.getTitle(),
							job.getMinSalary(),
							job.getMaxSalary());
	}
}
