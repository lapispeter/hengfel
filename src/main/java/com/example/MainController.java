/*
* File: MainController.java
* Author: Lapis Péter
* Copyright: 2026, Lapis Péter
* Group: Szoft II-E
* Date: 2026-03-31
* Github: https://github.com/lapispeter/
* Licenc: MIT
*/

package com.example;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private TextField areaField;

    @FXML
    private TextField magassagField;

    @FXML
    private TextField sugarField;

    @FXML
    void onClickCalcButton(ActionEvent event) {
         startCalc();
    }

    void startCalc() {
        double sugar=Double.parseDouble(sugarField.getText());
        double magassag=Double.parseDouble(magassagField.getText());
        


        Double area= Henger.calcArea(sugar, magassag);
        areaField.setText(area.toString());
        Storage.writeContent(area.toString());
    }

}
