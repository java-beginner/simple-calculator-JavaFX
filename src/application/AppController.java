package application;

import java.awt.Desktop;
import java.net.URI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;

/**
 * JavaFX簡易電卓
 * アプリケーションコントローラークラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class AppController {

    @FXML TextField textFieldFormula;
    @FXML TextField textFieldValue;

    @FXML Button buttonOne;
    @FXML Button buttonTwo;
    @FXML Button buttonThree;
    @FXML Button buttonFour;
    @FXML Button buttonFive;
    @FXML Button buttonSix;
    @FXML Button buttonSeven;
    @FXML Button buttonEight;
    @FXML Button buttonNine;
    @FXML Button buttonZero;
    @FXML Button buttonPlus;
    @FXML Button buttonMinus;
    @FXML Button buttonMult;
    @FXML Button buttonDiv;
    @FXML Button buttonRem;
    @FXML Button buttonBracketOpen;
    @FXML Button buttonBracketClose;

    @FXML Hyperlink hyperlinkWebSite;

    Evaluation evaluation = new Evaluation();

    @FXML
    public void insert(ActionEvent event) throws Exception {

        String targetChara = Constants.STR_EMPTY;
        if (event.getSource() == buttonOne) targetChara          = Constants.STR_ONE;
        if (event.getSource() == buttonTwo) targetChara          = Constants.STR_TWO;
        if (event.getSource() == buttonThree) targetChara        = Constants.STR_THREE;
        if (event.getSource() == buttonFour) targetChara         = Constants.STR_FOUR;
        if (event.getSource() == buttonFive) targetChara         = Constants.STR_FIVE;
        if (event.getSource() == buttonSix) targetChara          = Constants.STR_SIX;
        if (event.getSource() == buttonSeven) targetChara        = Constants.STR_SEVEN;
        if (event.getSource() == buttonEight) targetChara        = Constants.STR_EIGHT;
        if (event.getSource() == buttonNine) targetChara         = Constants.STR_NINE;
        if (event.getSource() == buttonZero) targetChara         = Constants.STR_ZERO;
        if (event.getSource() == buttonPlus) targetChara         = Constants.STR_PLUS;
        if (event.getSource() == buttonMinus) targetChara        = Constants.STR_MINUS;
        if (event.getSource() == buttonMult) targetChara         = Constants.STR_MULT;
        if (event.getSource() == buttonDiv) targetChara          = Constants.STR_DIV;
        if (event.getSource() == buttonRem) targetChara          = Constants.STR_REM;
        if (event.getSource() == buttonBracketOpen) targetChara  = Constants.STR_BRACKET_OPEN;
        if (event.getSource() == buttonBracketClose) targetChara = Constants.STR_BRACKET_CLOSE;

        textFieldFormula.setText(textFieldFormula.getText() + targetChara);

    }

    @FXML
    public void calc(ActionEvent event) throws Exception {

        textFieldValue.setText(Constants.STR_EMPTY);

        String formulaText = textFieldFormula.getText();

        // 空文字チェック
        if (formulaText.isEmpty()) {
            showDialog(Constants.ERROR_MSG_NOT_INPUT);
            return ;
        }

        // 入力チェック
        if (!formulaText.matches(Constants.PATTERN_FORMULA)) {
            showDialog(Constants.ERROR_MSG_UNNECESSARY);
            return ;
        }

        String value = evaluation.getValueOf(textFieldFormula.getText());
        if (value.isEmpty()) {
            showDialog(Constants.ERROR_MSG_NO_RESULT);
        }
        textFieldValue.setText(value);

    }

    @FXML
    public void clear(ActionEvent event) throws Exception {

        textFieldFormula.setText(Constants.STR_EMPTY);
        textFieldValue.setText(Constants.STR_EMPTY);

    }

    private void showDialog(String contentText) {

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.getDialogPane().setHeaderText(null);
        alert.getDialogPane().setContentText(contentText);
        alert.showAndWait();

    }

    @FXML
    public void showWebSite(ActionEvent event) throws Exception {

        Desktop desktop = Desktop.getDesktop();
        URI uri = new URI(Constants.URI_WEB_SITE);
        desktop.browse(uri);

    }

}
