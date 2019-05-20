package com.zzx.webfluxs.controller;


import com.zzx.webfluxs.entity.UserEntity;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/web")
@Component
public class UserController {

    @GetMapping("/flux")
    public Mono<String> hello1() {
        return Mono.just("Welcome to reactive world !");
    }

    public Mono<ServerResponse> get(ServerRequest request){
        List<UserEntity> stus = Arrays.asList(UserEntity.builder().age("10").name("zhangsan").sex("女").build());
        return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON)//这里改为json
                .body(Flux.just(stus), List.class);

    }

}
