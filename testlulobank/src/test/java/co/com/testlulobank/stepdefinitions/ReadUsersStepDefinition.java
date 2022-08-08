package co.com.testlulobank.stepdefinitions;

import co.com.testlulobank.exceptions.ApisException;

import co.com.testlulobank.questions.ReadUsersQuestion;
import co.com.testlulobank.task.ReadUsers;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ReadUsersStepDefinition {
    @When("I consult the information")
    public void i_consult_the_information() {
        { theActorInTheSpotlight().attemptsTo(ReadUsers.inCompany());
        }
    }
    @Then("response status code2 is (.*)$")
    public void responseStatusCode2Is(Integer code) {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(
                validatableResponse -> validatableResponse.statusCode(code)
        ).orComplainWith(ApisException.class));
    }

    @Then("valid in response information2")
    public void valid_in_response_information2(DataTable dataTable) {
        List<String> data = dataTable.values();
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ReadUsersQuestion.withInformation(data)).orComplainWith(ApisException.class));
    }
}
