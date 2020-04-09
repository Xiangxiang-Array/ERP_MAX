package com.array;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title:
 * @Description: 启动页
 * @return @return
 * @author array
 * @date 2020/3/31 10:25
 */
@SpringBootApplication
@MapperScan(basePackages= {"com.array.*.mapper"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
