package co.com.testlulobank.questions;

import co.com.testlulobank.utils.Constans;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class DeleteUserQuestion implements Question<Boolean> {

    private final List<String> data;

    public DeleteUserQuestion(List<String> data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String id = SerenityRest.lastResponse().getBody().jsonPath().get(Constans.ID1).toString();
        String status = SerenityRest.lastResponse().getBody().jsonPath().get(Constans.STATUS).toString();
        return id.equalsIgnoreCase(data.get(0)) && status.equalsIgnoreCase(Constans.SUCCESS);
    }

    public static DeleteUserQuestion withInformation(List<String> data) {
        return new DeleteUserQuestion(data);
    }


}