public class OperationDAOImplv1 implements operationDAO {

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
}
