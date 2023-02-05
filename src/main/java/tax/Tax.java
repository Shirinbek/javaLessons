package tax;

public class Tax {

    double nall;

    private Tax[] tex;

    public Tax(Tax[] tex) {
        this.tex = tex;
    }



    public Tax[] getTex() {
        return tex;
    }

    public void setTex(Tax[] tex) {
        this.tex = tex;
    }

    public static void checkTex(Tax[] texIn) {

        for (Tax tex: texIn) {
            System.out.println(tex);

        }

    }

}
