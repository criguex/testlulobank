package co.com.testlulobank.task;

import co.com.testlulobank.utils.UrlEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

public class CreateUser implements Task {

    private final List<String> data;

    public CreateUser(List<String> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Post.to(UrlEnum.URI_USER_CREATE.getValue()).with(requestSpecification -> requestSpecification.body(data)));
    }
    public static CreateUser withRequest (List<String> data){
        return Tasks.instrumented(CreateUser.class,data);
    }
}
