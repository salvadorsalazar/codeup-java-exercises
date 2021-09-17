package StringTransformer;

public class UpperCaseStringTransformer extends StringTransformer{


    public UpperCaseStringTransformer(String str) {
        super(str);
    }

    public UpperCaseStringTransformer() {
        super();
    }

    @Override
    String transform(String str) {
        return str.toUpperCase();
    }
}
