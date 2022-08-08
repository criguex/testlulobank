package co.com.testlulobank.task;


import co.com.testlulobank.utils.Constans;
import co.com.testlulobank.utils.UrlEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;


public class ReadUser implements Task {

    private final int id;

    public ReadUser(int id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(UrlEnum.URI_GET_USER.getValue() + id)
                .with(requestSpecification -> requestSpecification
                        .header(Constans.CONTENT_TYPE, Constans.APPLICATION_JSON)));
    }
    public static ReadUser inCompany(int id){
        return Tasks.instrumented(ReadUser.class,id);
    }
}