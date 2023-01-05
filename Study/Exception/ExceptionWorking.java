package Study.Exception;

public class ExceptionWorking {
    public static void main(String[] args) {
//        BufferedReader Exist = new BufferedReader(new FileReader("없는 파일"));
//        Exist.readLine();
//        Exist.close();
//        int[] arr = {1, 2, 3};
//        System.out.println(arr[3]);
        System.out.println(4 * 4);
        try { // 예외 발생 가능성 있는 코드 삽입
            System.out.println(4 / 0);
        }
        catch (Exception e1) { // try에서 예외 발생시 실행
            System.out.printf("이게 되겠냐고");
        } // e1 에서도 예외 발생할 것 같다면 catch 로 계속 늘려주면 됨
        finally { // 예외 발생 여부와 관계 없이 항상 실행 / 옵셔널
            System.out.printf(" 이게");
        }
        System.out.println();
        try {
            throwException();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Exception intendedException = new Exception("의도된 예외");
            throw intendedException;
        } catch (Exception e) {
            System.out.println("\"의도된 예외\" 발생 성공");
        }
    }
    static void throwException() throws NullPointerException, ClassNotFoundException {
        Class.forName("java.lang.StringX");
    }
    // throwException 메소드에서 발생한 예외 상황을 throws 키워드를 통해
    // main 메소드 안의 try catch 로 넘겨버림
    // 즉 throws 키워드로 예외 처리의 책임을 main 메소드로 떠넘긴 것
}
