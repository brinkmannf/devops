package th.rosenheim.devopsdemo2023;

import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;
import th.rosenheim.devopsdemo2023.model.Greeting;
import th.rosenheim.devopsdemo2023.model.User;

import java.util.function.Function;

@Component
public class Hello implements Function<Mono<User>, Mono<Greeting>> {

    public Mono<Greeting> apply(Mono<User> mono) {
        return mono.map(user -> new Greeting("Hello, " + user.getName() + "!\n"));
    }
}
