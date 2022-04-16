// 어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.

// 예를 들어
// 2 6 18 54 162 486 ... 은
// 2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.

// 이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여
// 등비(비율이 같다의 한문 말) 수열이라고 한다.

// 등비 수열을 알게된 영일이는 갑자기 궁금해졌다.

// "그럼.... 13번째 나오는 수는 뭘까?"

// 영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.

// 시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
// n번째 수를 출력하는 프로그램을 만들어보자.

// 입력
// 시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
// 공백을 두고 입력된다.(모두 0 ~ 10)

// 출력
// n번째 수를 출력한다.

// 입력 예시   
// 2 3 7

// 출력 예시
// 1458

import java.util.Scanner;

public class Question1090 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // by Caramel1004, 입력 값 ->초항, 등비, n번째
        int a1 = input.nextInt();
        int r = input.nextInt();
        int n = input.nextInt();

        input.close();

        long an = a1;// 초기화

        // by Caramel1004, an = a1 * r^(n - 1);
        // 반복문으로 거듭제곱 계산
        for (int k = 2; k <= n; k++) {
            an *= r;
        }

        System.out.println(an);
    }
}
