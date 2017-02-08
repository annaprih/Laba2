package by.belstu.it.prykhach;

/**
 * Created by Anna on 04.02.2017.
 */
public class TextFunction implements ITextFunction {
    int a;

    @Override
    public int getA() {
        return a;
    }

    @Override
    public void setA(int a) {
        this.a = a;
    }

    public TextFunction(int a) {

        this.a = a;
    }

    public TextFunction() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Counter "+i);
        }
    }

    @Override
    public String getValue()
    {
        for ( int i=0; i< 9; i++) {
            if (i > -1 && i < 10) System.out.println(i);
        }
        taskJ();
        return "Hello from First project";}

    private void taskJ() {
        System.out.print("anna_prykhach");
    }
}
