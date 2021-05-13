public class ForTest {
    public static void main(String[] args) {
        // for문의 구성
        // for(초기화 코드; 조건식 코드; 증감식 코드)로 구성 됩니다.
        // 초기화 코드는 for문에 최초 진입시 한 번만 실행 합니다.
        // 조건식 코드는 for문 내부(중괄호 파트)로 진입하기위한 조건 입니다.
        // 증감식 코드는 for문 내부의 동작이 완료된 이후 동작할 코드 입니다.
        // 이후 다시 조건식 코드로 가서 조건을 비교하고 충족한다면 위 루틴을 반복하며
        // 만약 조건식 코드에서 조건이 위배된다면 for문이 종료 됩니다.

        // for문을 작성하는 방법
        // 1. for를 적고 소괄호 열고 닫고 중괄호 열고 닫습니다.
        // 2. 초기화 코드 위치에 초기화가 필요하다면 초기화 코드를 작성한다.
        // 3. 저건식 코드 위치에 어떤 조건에서 동작시킬지 동작 조건을 작성한다.
        // 4. 증감식 코드 위치에 증가시키거나 감소시킬 값에 대한 코드를 작성한다.
        // 5. 중괄호 내부에 조건이 만족되었을 경우 동작시킬 코드를 작성한다.

        // 작거나 같다(<=)에서 주의점 : 작아도 참, 같아도 참, 크면 거짓
        // 작다(<)에서 주의점 :        작으면 참, 같으면 거짓, 크면 거짓
        // for(int i =1; i <=10; i+=2) //2씩 증가
        for(int i =1; i <=10; i++) { // 1씩 증가
            System.out.println("i = " + i);
        }
    }
}