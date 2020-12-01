package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.fxml.FXML;


import  java.io.IOException;

public class Controller {
    @FXML
    private AnchorPane rootPane;


    public void start(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void register(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("REGISTRATION.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void admin(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("ADMIN LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void NGO(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("NGO.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void officer(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("AGRICULTURE OFFICER.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void user(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("USER LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void registration(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void ADD(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("ADD SOIL.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void UPDATE(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("UPDATE SOIL.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void VIEW(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("VIEW SOIL.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void NAMES(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("ADD MARKET NAMES.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void MARKETS(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("VIEW MARKETS.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void report(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("ADD MARKET REPORT.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void REPORT(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("MARKET REPORT .fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void forgot(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("FORGOT PASSWORD.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void password(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("FORGOT PASSWORD.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void FORGOT(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("FORGOT PASSWORD.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void PASSWORD(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("FORGOT PASSWORD.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void PASS(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void change(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("CHANGE PASSWORD.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void security(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("CHANGE SECURITY Q.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void TRAINING(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("ADD TRAININGS.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void training(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("VIEW TRAININGS.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void TRAINS(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("VIEW TRAININGS.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void request(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("TRAINING REQUEST FORM.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void soils(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("VIEW SOIL.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void one(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void two(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void three(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void four(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("LOGIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void ONE(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME ADMIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void TWO(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME ADMIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void THREE(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME ADMIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void FOUR(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME ADMIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void FIVE(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME ADMIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void SIX(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME ADMIN.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void SEVEN(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("ADD MARKET REPORT.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void EIGHT(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME NGO.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void NINE(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME NGO.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void TEN(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME AGRICULTURE OFFICER.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void ELEVEN(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME AGRICULTURE OFFICER.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
    public void TWELVE(ActionEvent event) throws IOException {
        AnchorPane pane4 = FXMLLoader.load(getClass().getResource("WELCOME USER.fxml"));
        rootPane.getChildren().setAll(pane4);
    }
}
