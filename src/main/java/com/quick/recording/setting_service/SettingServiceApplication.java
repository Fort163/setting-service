package com.quick.recording.setting_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SettingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SettingServiceApplication.class, args);
	}

}
