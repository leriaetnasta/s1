public class OperationDAOImplv2 implements operationDAO{

    @Override
    public int AddOP(int a, int b) {
        return a + b;
    }

    @Override
    public int DeleteOP(int a, int b) {
        if(a>=b){
            return a-b;
        }else{
            return b-a;
        }
    }

    public static void main(String[] args) {
        OperationDAOImplv1 op = new OperationDAOImplv1();
        System.out.println(op.AddOP(3,2));

    }
}
