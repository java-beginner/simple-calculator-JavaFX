package application;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

/**
 * JavaFX簡易電卓
 * 評価クラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class Evaluation {

    ScriptEngine engine;

    public Evaluation() {
        engine = new ScriptEngineManager().getEngineByName(Constants.SCRIPTENGINE_SHORT_NAME);
    }

    public String getValueOf(String formula) {

        String value = Constants.STR_EMPTY;
        try {
            engine.eval(String.format(Constants.SCRIPTENGINE_FORMAT_FOR_EVALUATION, formula));
            value = String.valueOf(engine.get(Constants.SCRIPTENGINE_VALUE));
        } catch (ScriptException e1) {
        }

        return value.equals(Constants.STR_NULL) ? Constants.STR_EMPTY : value;

    }

}
