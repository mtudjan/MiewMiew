package hr.miewmiew.MiewMiew;

import java.util.concurrent.Executor;

import javax.transaction.Transactional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.AsyncConfigurerSupport;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Transactional
@SpringBootApplication
@EnableAsync
public class MiewMiewApplication extends AsyncConfigurerSupport {
	
	public static void main(String[] args) {
		SpringApplication.run(MiewMiewApplication.class, args);
	}
	
	@Override
	public Executor getAsyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(2);
		executor.setMaxPoolSize(2);
		executor.setQueueCapacity(500);
		executor.setThreadNamePrefix("MailService-");
		executor.initialize();
		return executor;
	}
	
}
