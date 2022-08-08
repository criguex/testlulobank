package co.com.testlulobank.task;

import co.com.testlulobank.utils.UrlEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ReadUsers implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(UrlEnum.URI_GET_USERS.getValue()));
    }
    public static ReadUsers inCompany(){
        return Tasks.instrumented(ReadUsers.class);
    }
}