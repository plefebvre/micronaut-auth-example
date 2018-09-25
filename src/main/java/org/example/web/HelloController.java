package org.example.web;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.security.Secured;
import io.micronaut.security.authentication.Authentication;
import io.micronaut.security.rules.SecurityRule;
import io.reactivex.Single;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Controller("/hello")
@Secured(SecurityRule.IS_AUTHENTICATED)
public class HelloController {

    @Get("/async")
    public Single<String> sayHelloAsync(Authentication authentication) {
        return Single.just("Hello " + authentication.getName());
    }

    @Get("/sync")
    public String sayHello(Authentication authentication) {
        return "Hello " + authentication.getName();
    }
}