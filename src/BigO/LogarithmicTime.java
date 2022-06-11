package BigO;

public class LogarithmicTime {

    int num = 2000;
    int num2 = 1000;

    int countOperation(int n){
        int operation = 0;
        int i = 1;

        while (i < n){
            i = i * 2;
            operation++;
        }
        System.out.println(operation);
        return operation;
    }
    public static void main(String[] args) {
        LogarithmicTime run = new LogarithmicTime();
        run.countOperation(run.num);
    }
}
