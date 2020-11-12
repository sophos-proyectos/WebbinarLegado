package com.sophossolutions.stepdefinitions;

import com.sophossolutions.interactions.WaitSeconds;
import com.sophossolutions.models.Email;
import com.sophossolutions.questions.ValidateSendEmail;
import com.sophossolutions.tasks.GoToSentEmail;
import com.sophossolutions.tasks.OpenOutook;
import com.sophossolutions.tasks.SendEmail;
import com.sophossolutions.utilities.Constants;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

public class SendEmailStepDefinitions {

    @Before
    public void setup(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^\"([^\"]*)\" want to open aplication$")
    public void wantToOpenAplication(String actor, List<String> apps) {
        theActorCalled(actor).attemptsTo(OpenOutook.openOutlook(apps.get(0)));
    }


    @When("^I wish send a email from Outlook with data$")
    public void iWishSendAEmailFromOutlookWithData(List<Email> infoEmail) {
        theActorInTheSpotlight().attemptsTo(SendEmail.sendEmail(infoEmail.get(0)), WaitSeconds.sleepSeconds(5),
                GoToSentEmail.goToSentEmails());
    }

    @Then("^I verify that the email was sent$")
    public void iVerifyThatTheEmailWasSent() {
        theActorInTheSpotlight()
                .should(seeThat(ValidateSendEmail.getText(Constants.TITTLE_LAST_EMAIL), equalTo(Constants.SUBJECT)));
    }

}
