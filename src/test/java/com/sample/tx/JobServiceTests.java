package com.sample.tx;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;
import com.sample.tx.service.JobService;
import com.sample.tx.vo.Job;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:/META-INF/spring/app-context.xml")
@Transactional // insert, delete 등의 테스트가 끝나면 사용되었던 데이터를 자동으로 복원 
public class JobServiceTests {

	@Autowired
	JobService jobService;
	
	@Test
	public void testAddAllJobs() {
		
		List<Job> jobs = Arrays.asList(new Job("IT_WEB", "웹 개발", 5000, 15000),
				new Job("IT_APP", "어플리케이션 개발", 6000, 20000));

		jobService.addAllJobs(jobs);
	}
}
