import java.util.Random;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("오징어 게임에 오신 것을 환영합니다.");
        System.out.println("이번 게임은 구슬 게임입니다.");
        System.out.println("당신과 나는 각각 10개의 구슬을 가지고 있습니다.");
        System.out.println("10개의 구슬을 다 잃으면 죽습니다.");
        System.out.println("시작합니다.");

        Scanner sc = new Scanner(System.in); // 입력 받기 위한 준비
        int userGu = 10;
        int bet = 0;
        while (true) {
            System.out.print("배팅하세요 \n 입력 : ");
            // 배팅 숫자를 입력 받기
            bet = sc.nextInt(); // 숫자를 입력 받아서 bet 변수에 저장
            System.out.println("당신은 " + bet + "개의 구슬을 배팅했습니다");

            //내가 가진 갯수보다 많이 배팅하면 다시 배팅
            if (bet > userGu) {
                System.out.println("다시 배팅하세요");
            } else {
                break;
            }
        }

        System.out.println("맞춰봐");
        //컴퓨터가 10개의 구슬 중에서 랜덤으로 정함
        Random random = new Random();
        int rnum = random.nextInt(10) + 1; // 1~10까지 숫자가 랜덤으로 나옴
        System.out.println("컴퓨터가 낸 문제(구슬 갯수) : " + rnum);
        String dab = "";
        if ( rnum % 2 == 1){
            dab = "홀"
            //System.out.println("홀");
        }
        else  {
            dab = "짝";
            //System.out.println("짝");
        }
        // 유저가 입력한 값이 맞다 틀리다
        String udab = sc.next();

        // 맞으면 내가 가진 구슬과 배팅한 구슬의 갯수를 더한다
        // 틀리면 뺀다
        // 내가 가진 구슬의 갯수가 0이 되면 빵!! 으악
        userGu = userGu - bet;

        // 내가 가진 구슬의 갯수가 20이 되면 컴퓨터가 으악


    }
}
