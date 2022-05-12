



interface myLambda
{

    public int add(int a, int b);

}
public class LambdaExpression {
    public static void main(String[] args){

        myLambda m = (a,b)->{return a+b;};
        System.out.println(m.add(200, 450));

    }

    
    
}
