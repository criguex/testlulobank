package co.com.testlulobank.stepdefinitions;

import co.com.testlulobank.exceptions.ApisException;
import co.com.testlulobank.questions.ReadUserQuestion;
import co.com.testlulobank.task.ReadUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReadUserStepDefinition {


    @When("I consult the information by")
    public void i_consult_the_information_by(int id) {
        theActorInTheSpotlight().attemptsTo(ReadUser.inCompany(id));
    }

    @Then("response status code1 is (.*)$")
    public void responseStatusCodeIs(Integer code) {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.statusCode(code)
        ).orComplainWith(ApisException.class));
    }
    @Then("valid in response information")
    public void valid_in_response_information(DataTable dataTable) {
        List<String> data = dataTable.values();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ReadUserQuestion.withInformation(data)).orComplainWith(ApisException.class));
    }
}
