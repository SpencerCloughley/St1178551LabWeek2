package com.example.st1178551labweek2;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class PhoneViewController implements Initializable {

    @FXML
    private Label manufacturer;

    @FXML
    private Label model;

    @FXML
    private Label year;

    @FXML
    private Label toStringLabel;


    Phone Spencer =new Phone("Galaxy S20","Samsung",2022);
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        updateLabels();
    }
    private void updateLabels(){
        manufacturer.setText(Spencer.getManufacturer());
        model.setText(Spencer.getModel());
        year.setText(Integer.toString(Spencer.getYear()));
        toStringLabel.setText(Spencer.toString());
    }

}

