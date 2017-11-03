package com.sample.tx.service;

import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import com.sample.tx.vo.Job;

// interface, 구현클래스, 각각의 메소드에도 붙일 수 있다. 
public interface JobService {

	void addAllJobs(List<Job> jobs);
}
