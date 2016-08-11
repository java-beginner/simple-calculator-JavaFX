package application;

/**
 * JavaFX簡易電卓
 * 定数クラス
 * @author 「Javaを復習する初心者」
 * @version 1.0
 */
public class Constants {

    /* このクラスはインスタンスを生成しない */
    private Constants() {}

    /* アプリケーションの設定 */
    /** fxmlファイル */
    public static final String APP_SETTING_FXML = "app.fxml";

    /** タイトル */
    public static final String APP_SETTING_TITLE = "JavaFX簡易電卓";

    /* エラーメッセージ */
    /** エラーメッセージ: 結果がない場合 */
    public static final String ERROR_MSG_NO_RESULT = "結果がありませんでした。";

    /** エラーメッセージ: 未入力 */
    public static final String ERROR_MSG_NOT_INPUT = "未入力です。";

    /** エラーメッセージ: 余計な文字を含む */
    public static final String ERROR_MSG_UNNECESSARY = "余計な文字があります。";

    /* 文字 */
    /** 「null」 */
    public static final String STR_NULL = "null";

    /** 空文字 */
    public static final String STR_EMPTY = "";

    /** 0 */
    public static final String STR_ZERO = "0";

    /** 1 */
    public static final String STR_ONE = "1";

    /** 2 */
    public static final String STR_TWO = "2";

    /** 3 */
    public static final String STR_THREE = "3";

    /** 4 */
    public static final String STR_FOUR = "4";

    /** 5 */
    public static final String STR_FIVE = "5";

    /** 6 */
    public static final String STR_SIX = "6";

    /** 7 */
    public static final String STR_SEVEN = "7";

    /** 8 */
    public static final String STR_EIGHT = "8";

    /** 9 */
    public static final String STR_NINE = "9";

    /** + */
    public static final String STR_PLUS = "+";

    /** - */
    public static final String STR_MINUS = "-";

    /** * */
    public static final String STR_MULT = "*";

    /** / */
    public static final String STR_DIV = "/";

    /** % */
    public static final String STR_REM = "%";

    /** ( */
    public static final String STR_BRACKET_OPEN = "(";

    /** ) */
    public static final String STR_BRACKET_CLOSE = ")";

    /* 正規表現 */
    /** 式のパターン */
    public static final String PATTERN_FORMULA = "^[%()*+-/0-9]+$";

    /* スクリプトエンジン用 */
    /** 簡略名 */
    public static final String SCRIPTENGINE_SHORT_NAME = "JavaScript";

    /** 評価用フォーマット */
    public static final String SCRIPTENGINE_FORMAT_FOR_EVALUATION = "var value = eval(\"%s\");";

    /** 値取り出し用文字列 */
    public static final String SCRIPTENGINE_VALUE = "value";

    /* web site */
    /** web site uri */
    public static final String URI_WEB_SITE = "http://java-beginner.com/";

}
