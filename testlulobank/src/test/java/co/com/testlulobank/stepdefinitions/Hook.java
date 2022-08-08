package co.com.testlulobank.stepdefinitions;

import co.com.testlulobank.utils.Constans;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

public class Hook {

    @Before
    public void initActor() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActor("actor");

    }
    @Given("the Qa wants do testing")
    public void theQaWantsDoTesting() {
        OnStage.theActorInTheSpotlight().whoCan(CallAnApi.at(Constans.URL));
    }


}