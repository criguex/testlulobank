package co.com.testlulobank.stepdefinitions;

import co.com.testlulobank.exceptions.ApisException;
import co.com.testlulobank.questions.CreateUserQuestion;
import co.com.testlulobank.task.CreateUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;


public class CreateUserStepDefinition {

    @When("the tester makes the request")
    public void thetestermakestherequest (DataTable dataTable) {
        List<String> data = dataTable.values();
        OnStage.theActorInTheSpotlight().attemptsTo(CreateUser.withRequest(data));
    }
    @Then("response status code is")
    public void responseStatusCodeIs(int status_code) {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.statusCode(status_code)
        ).orComplainWith(ApisException.class));
    }
    @Then("the answer in the body is message Successfully")
    public void theAnswerInTheBodyIsMessageSuccessfully(DataTable dataTable) {
       List<String> data = dataTable.values();
       OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CreateUserQuestion.withInformation(data)).orComplainWith(ApisException.class));
    }

}
