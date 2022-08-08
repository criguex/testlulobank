package co.com.testlulobank.task;

import co.com.testlulobank.utils.Constans;
import co.com.testlulobank.utils.UrlEnum;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;


public class DeleteUser implements Task {

    private final int id;

    public DeleteUser(int id) {
        this.id = id;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from(UrlEnum.URI_DELETE_USERS.getValue() + id)
                .with(requestSpecification -> requestSpecification
                        .header(Constans.CONTENT_TYPE, Constans.APPLICATION_JSON)));
    }
    public static DeleteUser inSistem(int id){
        return Tasks.instrumented(DeleteUser.class,id);
    }
}