package org.andywang.dentist.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
    @Bean
        public SecurityFilterChain SecurityFilterChain(HttpSecurity http) throws Exception {
            http
                    .csrf(csrf -> csrf.disable()) // 禁用 CSRF（适用于前后端分离）
                    .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) // 无状态会话
                    .authorizeHttpRequests(authorize -> authorize
                            .requestMatchers("/").permitAll()         // 允许根路径
                            .requestMatchers("/api/**").permitAll()   // 允许所有 /api 开头的接口
                            .anyRequest().permitAll()              // 其他请求需要认证
                    );
            return http.build();
    }

}
