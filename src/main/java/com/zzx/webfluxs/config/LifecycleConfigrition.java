package com.zzx.webfluxs.config;


import com.zzx.webfluxs.controller.UserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;

@Configuration
public class LifecycleConfigrition {


    @Autowired
    UserController controller;


    @Bean
    public RouterFunction<ServerResponse> timerRouter() {
        return RouterFunctions.route(GET("/get"), req -> controller.get(req));
    }

}
