package com.sample.tx;

import java.util.Arrays;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import com.sample.tx.service.JobService;
import com.sample.tx.vo.Job;

public class App {

	public static void main(String[] args) {
		String resources = "classpath:/META-INF/spring/app-context.xml";
		
		ApplicationContext context = new GenericXmlApplicationContext(resources);
		JobService service = context.getBean(JobService.class);
		List<Job> jobs = Arrays.asList(new Job("IT_WEB", "웹 개발", 5000, 15000),
										new Job("IT_APP", "어플리케이션 개발", 6000, 20000),
										new Job("IT_MOBILE", "모바일 어플리케이션 개발 프로토타입 개발담당 서울 본사 1팀 제작 1부", 7000, 16000));
		
		service.addAllJobs(jobs);
	}
}
