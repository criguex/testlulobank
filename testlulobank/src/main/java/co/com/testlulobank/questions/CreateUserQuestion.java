package co.com.testlulobank.questions;

import co.com.testlulobank.utils.Constans;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class CreateUserQuestion implements Question<Boolean> {
    private final List<String> data;
    public CreateUserQuestion(List<String> data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String status = SerenityRest.lastResponse().getBody().jsonPath().get(Constans.STATUS).toString();
        String message = SerenityRest.lastResponse().getBody().jsonPath().get(Constans.MESSAGE).toString();
        return status.equalsIgnoreCase(Constans.SUCCESS) && message.equalsIgnoreCase(Constans.SUCCESSFULLYADD);
    }

    public static CreateUserQuestion withInformation (List<String> data){
        return new CreateUserQuestion(data);
    }
}
