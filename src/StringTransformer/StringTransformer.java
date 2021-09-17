package StringTransformer;

abstract public class StringTransformer {
    protected String str;

    public StringTransformer(String str) {
        this.str = str;
    }

    public StringTransformer() {

    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    abstract String transform(String str);



}
