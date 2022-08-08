package co.com.testlulobank.stepdefinitions;

import co.com.testlulobank.exceptions.ApisException;
import co.com.testlulobank.questions.DeleteUserQuestion;
import co.com.testlulobank.task.DeleteUser;
import co.com.testlulobank.task.ReadUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.rest.questions.ResponseConsequence;


import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteUserStepDefinition {
    @When("I delete the information of the user")
    public void iDeleteTheInformationOfTheUser(int id) {
        theActorInTheSpotlight().attemptsTo(DeleteUser.inSistem(id));
    }
    @Then("response status code10 is")
    public void responseStatusCodeIs(int status_code) {
        OnStage.theActorInTheSpotlight().should(ResponseConsequence.seeThatResponse(
                validaTableResponse -> validaTableResponse.statusCode(status_code)
        ).orComplainWith(ApisException.class));
    }
    @Then("valid in response information3")
    public void valid_in_response_information3(DataTable dataTable) {
      List<String> data = dataTable.values();
      OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(DeleteUserQuestion.withInformation(data)).orComplainWith(ApisException.class));
    }

}
