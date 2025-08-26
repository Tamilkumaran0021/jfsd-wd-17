package com.example.demo_spring_webflux.service;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public class FluxMonoGeneratorService {

    public static Mono<String> namesMono() {
        return Mono.just("john");
    }

    public static Flux<String> namesFlux() {
        return Flux.fromIterable(List.of("john", "peter")).log();
    }

    public static void main(String[] args) {
//        namesMono().subscribe(name -> System.out.println(name));
        namesFlux().subscribe(name -> System.out.println(name));

    }
}
