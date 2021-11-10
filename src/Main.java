import java.util.Random;
import java.util.Scanner;

public class Main extends Character  {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static String userName;

    public static void main(String[] args) {

        marine.getHealth_max(); // 초기 최대체력 초기화

        System.out.println("=====================================================================");
        System.out.println(" # 마린키우기 # ");
        System.out.println("");
        System.out.println("게임 목표 : 캐리건과 싸움에서 승리하세요");
        System.out.println("");
        System.out.println("사냥을 통해 마린을 업그레이드하고 최종적으로 캐리건을 잡으세요");

        System.out.println("당신의 캐릭터 ( 마린 ) 이름을 설정하세요");


        System.out.println(" ^_^ ");

        userName = scanner.nextLine();

        System.out.println(userName + " 으로 게임을 시작 하겠습니다 ^_^ !");
        System.out.println(" =============================================================");
        System.out.println("");
        while (true) {   // 각 구문들이 실행되도 프로그램이 끝나지 않게
            while (true) { // 각 구문들이 실행되어도 프로그램이 끝나지 않게 반복시켜준다.
                    System.out.println("어디로 이동 하시겠습니까?");
                    System.out.println("[1번].저그 소굴 , [2번]. 전방 기지");
                    int firstInput = scanner.nextInt();
                    if (firstInput == 1) { // 저그 소굴
                        System.out.println("(주의) 체력을 잘 확인하세요.");
                        System.out.println();
                        System.out.println("저그 소굴에 도착하였습니다.");
                        System.out.println("");
                        System.out.println("어느곳으로 입장 하시겠습니까?");
                        System.out.println();
                        System.out.println("[1번]저글링부화장. [2번]히드라굴. [3번]뮤탈리스트둥지. [4번]럴커밭. [5번]울드라리스크동굴. [6번](주의)케리건. [7번]뒤로 가기.");
                        int secondInput = scanner.nextInt();
                        if (secondInput == 1) {
                            marine.zergling_pool();
                            break;
                        }
                        if (secondInput == 2) {
                            marine.hydralisk_den();
                            break;
                        }
                        if (secondInput == 3) {
                            marine.mutalisk_spire();
                            break;
                        }
                        if (secondInput == 4) {
                            marine.lulker_badlands();
                            break;
                        }
                        if (secondInput == 5) {
                            marine.ultralisk_Cavern();
                            break;
                        }
                        if (secondInput == 6) {
                            marine.kerrigan_boss();
                        }
                        if (secondInput == 7) {
                            break;
                        } else {
                            System.out.println(" 다시 입력해주세요");
                            break;
                        }
                    } // 전방 기지

                    while (true) {

                        if (firstInput == 2) {
                            System.out.println("기지에 들어왔습니다.");
                            System.out.println("");
                            System.out.println("무엇을 할까요 ? ");
                            System.out.println("");
                            System.out.println("[1번] 회복. [2번] 업그레이드. [3번] 퀘스트. [4번] 나가기.");
                            int secondInput = scanner.nextInt();
                            if (secondInput == 1 && marine.mineral >= 5) { // 회복 센터
                                System.out.println("마린의 현제 채력 : " + marine.health + " / " + marine.health_max);
                                marine.healing_center();
                                System.out.println(marine.health + "/" + marine.health_max);
                                System.out.println("마린의 체력이 회복되었습니다.");
                            }
                            if (secondInput == 1 && marine.mineral < 5) {
                                System.out.println("돈이 부족합니다");
                            }
                            if (secondInput == 2) {
                                System.out.println("업그레이드 센터에 오신걸 환영합니다.");
                                System.out.println();
                                System.out.println("어느 업그레이드를 진행 하시겠습니까?");
                                System.out.println("");
                                System.out.println("[1번].마린 공격력.");
                                System.out.println("[2번].마린 방어력.");
                                System.out.println("[3번].마린 최대 체력");
                                System.out.println("[4번].뒤로 가기");
                                int fourthInput = scanner.nextInt();
                                if (fourthInput == 1) {
                                    marine.upgrade_damage();
                                }
                                if (fourthInput == 2) {
                                    marine.upgrade_defense();
                                }
                                if (fourthInput == 3) {
                                    marine.upgrade_health();
                                }
                                if (fourthInput == 4) {
                                    continue;
                                }
                            }
                            if (secondInput == 3) {
                                System.out.println("미구현");
                                break;
                            }
                            if (secondInput == 4) {
                                break;
                            }
                        }
                    }
                }
            }
        }
    }




