package org.example;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")  // "org.example.service" немесе басқа қажетті пакеттерді көрсетсеңіз болады
public class AppConfig {
}