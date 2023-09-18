package decisionmaking;

public class returnStatement {
    public static void main(String[] args) {
//        * if we using return statement so we just got back the value of the case without other things like error below
//        * break is only for exit switch statement
//        * return is for exit the
//        * when we do return, basically the after return statement is not being executed

//        int k = 2;
//        switch(k){
//            case 1:
//                System.out.println(1);
//                break;
//            case 2:
//                System.out.println(2);
//                return;
//        }
//        System.out.println("Error!");

        boolean bool = true;
        System.out.println("Before Return Statement");
        if(bool){
            return;
        }
        System.out.println("This statement will not be executed");

    }
}
