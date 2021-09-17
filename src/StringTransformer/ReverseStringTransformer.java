package StringTransformer;

public class ReverseStringTransformer extends StringTransformer{


    public ReverseStringTransformer(String str) {
        super(str);
    }

    public ReverseStringTransformer() {

    }

    @Override
    String transform(String str) {
        str = new StringBuilder(str).reverse().toString();

        return str;
    }
}
