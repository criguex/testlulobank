package co.com.testlulobank.questions;

import co.com.testlulobank.utils.Constans;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class ReadUserQuestion implements Question<Boolean> {

    private final List<String> data;

    public ReadUserQuestion(List<String> data) {
        this.data = data;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

          String id = SerenityRest.lastResponse().getBody().jsonPath().get(Constans.ID).toString();
          String name = SerenityRest.lastResponse().getBody().jsonPath().get(Constans.NAME).toString();
          String salary= SerenityRest.lastResponse().getBody().jsonPath().get(Constans.SALARY).toString();
          String age= SerenityRest.lastResponse().getBody().jsonPath().get(Constans.AGE).toString();
          return id.equalsIgnoreCase(data.get(0)) && name.equalsIgnoreCase(data.get(1)) && salary.equalsIgnoreCase(data.get(2)) && age.equalsIgnoreCase(data.get(3));
    }

    public static ReadUserQuestion withInformation(List<String> data) {
        return new ReadUserQuestion(data);
    }


}
