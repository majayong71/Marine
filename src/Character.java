import java.util.Random;
import java.util.Scanner;

public class Character {// 유닛들을 다 생성해주고 저그 건물이름으로 메소드를 만들어 그 메소드에서 조건문으로 싸움을 설정하자.

    //클래스 속성

    String name;  // 이름
    int health;  // 현 체력
    int health_max; // 최대 체력
    int defense; // 방어력
    int damage; // 대미지
    int mineral; // 미네랄
    int psionicEnergy; // 사이오닉 에너지
    int gas; // 가스
    static int queenRandom = 25;
    static int dmgUpgrade_cost = 8;
    static int defUpgrade_cost = 8;
    static int hpmUpgrade_cost = 8;

    //객체 생성
    static Marine marine = new Marine("마린",100,100,5,499,250);
    static Queen queen = new Queen("퀸",120,120,5,0,250);

   public int getHealth_max () {
       return health_max = health;
   }
    Random random = new Random();
    Scanner sc = new Scanner(System.in);

    public void healing_center () {
        System.out.println("현재체력 : " + health);
        health = health_max;
        System.out.println("체력이 회복 되었습니다.");
        System.out.println("현재체력 : " +health);

        System.out.println("회복비용 5 미네랄이 소모 됩니다.");
        marine.mineral -= 5;
        System.out.println(marine.mineral);
    }

    public void mutalisk_spire () { // 뮤탈리스크 사냥터
        Mutalisk mutalisk = new Mutalisk("뮤탈리스크",500,500,5,55);

        System.out.println("뮤탈리스크 둥지에 입장하였습니다...");
        while (true) {
            System.out.println(" [1번]. 공격한다  [2번]. 스킬사용 [3번]. 상태보기 [4번]. 도망가다");
            System.out.print("번호 입력 :");
            int mutaliskSpireFunction = sc.nextInt();
            if (mutaliskSpireFunction == 1) {
                if (mutalisk.health > 0) // 뮤탈리스크의 체력이 0보다 클 때 실행될 구문
                {
                    System.out.println("마린의 공격!");
                    System.out.println("");
//                    mutalisk.health += mutalisk.defense;
//                    mutalisk.health -= marine.damage;
                    mutalisk.health += mutalisk.defense;
                    mutalisk.health -= marine.damage;
                    if (mutalisk.health <= 0) { //뮤탈의 체력이 0보다 작거나 같을 때
                        mutalisk.health = 0; // 뮤탈 체력 0 으로 초기화.
                        System.out.println(mutalisk.name + " 이(가) 죽었습니다.");
                        System.out.println("");
                        System.out.println("미네랄 100 을(를) 얻었습니다.");
                        marine.mineral += 100;
                        System.out.println("");
                        System.out.println("미네랄 총 보유량");
                        System.out.println(marine.mineral);
                        break;
                    } // 뮤탈과의 전투가 아직 안 끝났을 때,
                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("뮤탈리스크의 상태");
                    System.out.println("뮤탈리스크의 현재 체력 " + "[" + mutalisk.health + "]" + "/" + "[" + mutalisk.health_max + "]");
                    System.out.println("뮤탈리스크의 현재 방어력 " + mutalisk.defense);
                    System.out.println("뮤탈리스크의 현재 공격력 " + mutalisk.damage);
                    System.out.println("");
                    System.out.println("뮤탈리스크의 공격 ! ");
                    marine.health += marine.defense;
                    marine.health -= mutalisk.damage;

                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("뮤탈리스크의 상태");
                    System.out.println("뮤탈리스크의 현재 체력 " + "[" + mutalisk.health + "]" + "/" + "[" + mutalisk.health_max + "]");
                    System.out.println("뮤탈리스크의 현재 방어력 " + mutalisk.defense);
                    System.out.println("뮤탈리스크의 현재 공격력 " + mutalisk.damage);
                    System.out.println("");
                    System.out.println("뮤탈리스크의 공격 ! ");
                }

                if (marine.health <= 0 ) { // 전투중 마린의 체력이 0보다 낮으면 죽는 구문
                    marine.health = 0;
                    System.out.println("마린이 죽었습니다.");
                    System.out.print("GameOver..." );
                    System.exit(0);
                }
            }
            if (mutaliskSpireFunction == 3) { // 상태창 확인하기
                System.out.println("-----------------------전투 상태창-----------------------");
                System.out.println("");
                System.out.println("마린의 상태");
                System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                System.out.println("마린의 현재 방어력 " + marine.defense);
                System.out.println("마린의 현재 공격력 " + marine.damage);
                System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                System.out.println("");
                System.out.println("뮤탈리스크의 상태");
                System.out.println("뮤탈리스크의 현재 체력 " + "[" + mutalisk.health + "]" + "/" + "[" + mutalisk.health_max + "]");
                System.out.println("뮤탈리스크의 현재 방어력 " + mutalisk.defense);
                System.out.println("뮤탈리스크의 현재 공격력 " + mutalisk.damage);
                System.out.println("");

            }

            if (mutaliskSpireFunction == 4) { // 돌아가기
                break;
            }
        }
    }

    public void hydralisk_den () { //히드라리스크 사냥터
        Hydralisk hydralisk = new Hydralisk("히드라리스크",250,250,3,30);
        System.out.println("히드라 굴에 입장하였습니다..."); // 히드라리스크의 체력이 0으로 출력되는 문제 발생.
        hydralisk.getHealth_max();
        while(true) {
            System.out.println(" [1번]. 공격한다  [2번]. 스킬사용 [3번]. 상태보기 [4번]. 도망가다");
            System.out.print("번호 입력 :");
            int hydrealiskDenFunction = sc.nextInt();
            if (hydrealiskDenFunction == 1) {
                if (hydralisk.health > 0) // 히드라리스크의 체력이 0보다 클 때 실행될 구문
                {
                    System.out.println("마린의 공격!");
                    System.out.println("");
                    hydralisk.health += hydralisk.defense;
                    hydralisk.health -= marine.damage;
                    if (hydralisk.health <= 0) { //히드라리스크의 체력이 0보다 작거나 같을 때
                        hydralisk.health = 0; // 히드라리스크의 체력 0 으로 초기화.
                        System.out.println(hydralisk.name + " 이(가) 죽었습니다.");
                        System.out.println("");
                        System.out.println("미네랄 45 을(를) 얻었습니다.");
                        marine.mineral += 45;
                        System.out.println("");
                        System.out.println("미네랄 총 보유량");
                        System.out.println(marine.mineral);
                        break;
                    } // 히드라리스크와의 전투가 아직 안 끝났을 때,
                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("히드라리스크의 상태");
                    System.out.println("히드라리스크의 현재 체력 " + "[" + hydralisk.health + "]" + "/" + "[" + hydralisk.health_max + "]");
                    System.out.println("히드라리스크의 현재 방어력 " + hydralisk.defense);
                    System.out.println("히드라리스크의 현재 공격력 " + hydralisk.damage);
                    System.out.println("");
                    System.out.println("히드라리스크의 공격 ! ");
                    marine.health += marine.defense;
                    marine.health -= hydralisk.damage;

                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("히드라리스크의 상태");
                    System.out.println("히드라리스크의 현재 체력 " + "[" + hydralisk.health + "]" + "/" + "[" + hydralisk.health_max + "]");
                    System.out.println("히드라리스크의 현재 방어력 " + hydralisk.defense);
                    System.out.println("히드라리스크의 현재 공격력 " + hydralisk.damage);
                    System.out.println("");
                    System.out.println("히드라리스크의 공격 ! ");
                }
                if (marine.health <= 0 ) { // 전투중 마린의 체력이 0보다 낮으면 죽는 구문
                    System.out.println("마린이 죽었습니다.");
                    System.out.print("GameOver..." );
                    System.exit(0);
                }
            }
            if (hydrealiskDenFunction == 3) { // 상태창 확인하기
                System.out.println("-----------------------전투 상태창-----------------------");
                System.out.println("");
                System.out.println("마린의 상태");
                System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                System.out.println("마린의 현재 방어력 " + marine.defense);
                System.out.println("마린의 현재 공격력 " + marine.damage);
                System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                System.out.println("");
                System.out.println("히드라리스크의 상태");
                System.out.println("히드라리스크의 현재 체력 " + "[" + hydralisk.health + "]" + "/" + "[" + hydralisk.health_max + "]");
                System.out.println("히드라리스크의 현재 방어력 " + hydralisk.defense);
                System.out.println("히드라리스크의 현재 공격력 " + hydralisk.damage);
                System.out.println("");

            }

            if (hydrealiskDenFunction == 4) { // 돌아가기
                break;
            }
        }


        }


    public void lulker_badlands () { // 럴커 사냥터
        Lurker lurker = new Lurker("럴커",380,380,5,40);
        System.out.println("럴커황무지에 입장하였습니다...");
        while(true) {
            System.out.println(" [1번]. 공격한다  [2번]. 스킬사용 [3번]. 상태보기 [4번]. 도망가다");
            System.out.print("번호 입력 :");
            int lulkerBadlandsFunction = sc.nextInt();
            if (lulkerBadlandsFunction == 1) {
                if (lurker.health > 0) // 럴커의 체력이 0보다 클 때 실행될 구문
                {
                    System.out.println("마린의 공격!");
                    System.out.println("");
                    lurker.health += lurker.defense;
                    lurker.health -= marine.damage;
                    if (lurker.health <= 0) { //럴커의 체력이 0보다 작거나 같을 때
                        lurker.health = 0; // 럴커의 체력 0 으로 초기화.
                        System.out.println(lurker.name + " 이(가) 죽었습니다.");
                        System.out.println("");
                        System.out.println("미네랄 70 을(를) 얻었습니다.");
                        marine.mineral += 70;
                        System.out.println("");
                        System.out.println("미네랄 총 보유량");
                        System.out.println(marine.mineral);
                        break;
                    } // 럴커와의 전투가 아직 안 끝났을 때,
                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("럴커의 상태");
                    System.out.println("럴커의 현재 체력 " + "[" + lurker.health + "]" + "/" + "[" + lurker.health_max + "]");
                    System.out.println("럴커의 현재 방어력 " + lurker.defense);
                    System.out.println("럴커의 현재 공격력 " + lurker.damage);
                    System.out.println("");
                    System.out.println("럴커의 공격 ! ");
                    marine.health += marine.defense;
                    marine.health -= lurker.damage;

                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("럴커의 상태");
                    System.out.println("럴커의 현재 체력 " + "[" + lurker.health + "]" + "/" + "[" + lurker.health_max + "]");
                    System.out.println("럴커의 현재 방어력 " + lurker.defense);
                    System.out.println("럴커의 현재 공격력 " + lurker.damage);
                    System.out.println("");
                    System.out.println("럴커의 공격 ! ");
                }

                if (marine.health <= 0 ) { // 전투중 마린의 체력이 0보다 낮으면 죽는 구문
                    System.out.println("마린이 죽었습니다.");
                    System.out.print("GameOver..." );
                    System.exit(0);
                }
            }
            if (lulkerBadlandsFunction == 3) { // 상태창 확인하기
                System.out.println("-----------------------전투 상태창-----------------------");
                System.out.println("");
                System.out.println("마린의 상태");
                System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                System.out.println("마린의 현재 방어력 " + marine.defense);
                System.out.println("마린의 현재 공격력 " + marine.damage);
                System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                System.out.println("");
                System.out.println("럴커의 상태");
                System.out.println("럴커의 현재 체력 " + "[" + lurker.health + "]" + "/" + "[" + lurker.health_max + "]");
                System.out.println("럴커의 현재 방어력 " + lurker.defense);
                System.out.println("럴커의 현재 공격력 " + lurker.damage);
                System.out.println("");

            }

            if (lulkerBadlandsFunction == 4) { // 돌아가기
                break;
            }
        }


        }

    public void ultralisk_Cavern () { // 울트라리스크 사냥터
        Ultralisk ultralisk = new Ultralisk("울트라리스크",900,900,7,70);
        System.out.println("울트라리스크 동굴에 입장하였습니다...");
        while(true) {
            System.out.println(" [1번]. 공격한다  [2번]. 스킬사용 [3번]. 상태보기 [4번]. 도망가다");
            System.out.print("번호 입력 :");
            int ultraliskCavernFunction = sc.nextInt();
            if (ultraliskCavernFunction == 1) {
                if (ultralisk.health > 0) // 울트라리스크의 체력이 0보다 클 때 실행될 구문
                {
                    System.out.println("마린의 공격!");
                    System.out.println("");
                    ultralisk.health += ultralisk.defense;
                    ultralisk.health -= marine.damage;
                    if (ultralisk.health <= 0) { //울트라리스크의 체력이 0보다 작거나 같을 때
                        ultralisk.health = 0; // 울트라리스크의 체력 0 으로 초기화.
                        System.out.println(ultralisk.name + " 이(가) 죽었습니다.");
                        System.out.println("");
                        System.out.println("미네랄 170 을(를) 얻었습니다.");
                        marine.mineral += 170;
                        System.out.println("");
                        System.out.println("미네랄 총 보유량");
                        System.out.println(marine.mineral);
                        break;
                    } // 울트라리스크와의 전투가 아직 안 끝났을 때,
                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("울트라리스크의 상태");
                    System.out.println("울트라리스크의 현재 체력 " + "[" + ultralisk.health + "]" + "/" + "[" + ultralisk.health_max + "]");
                    System.out.println("울트라리스크의 현재 방어력 " + ultralisk.defense);
                    System.out.println("울트라리스크의 현재 공격력 " + ultralisk.damage);
                    System.out.println("");
                    System.out.println("울트라리스크의 공격 ! ");
                    marine.health += marine.defense;
                    marine.health -= ultralisk.damage;

                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("울트라리스크의 상태");
                    System.out.println("울트라리스크의 현재 체력 " + "[" + ultralisk.health + "]" + "/" + "[" + ultralisk.health_max + "]");
                    System.out.println("울트라리스크의 현재 방어력 " + ultralisk.defense);
                    System.out.println("울트라리스크의 현재 공격력 " + ultralisk.damage);
                    System.out.println("");
                    System.out.println("울트라리스크의 공격 ! ");
                }

                if (marine.health <= 0 ) { // 전투중 마린의 체력이 0보다 낮으면 죽는 구문
                    System.out.println("마린이 죽었습니다.");
                    System.out.print("GameOver..." );
                    System.exit(0);
                }
            }
            if (ultraliskCavernFunction == 3) { // 상태창 확인하기
                System.out.println("-----------------------전투 상태창-----------------------");
                System.out.println("");
                System.out.println("마린의 상태");
                System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                System.out.println("마린의 현재 방어력 " + marine.defense);
                System.out.println("마린의 현재 공격력 " + marine.damage);
                System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                System.out.println("");
                System.out.println("울트라리스크의 상태");
                System.out.println("울트라리스크의 현재 체력 " + "[" + ultralisk.health + "]" + "/" + "[" + ultralisk.health_max + "]");
                System.out.println("울트라리스크의 현재 방어력 " + ultralisk.defense);
                System.out.println("울트라리스크의 현재 공격력 " + ultralisk.damage);
                System.out.println("");

            }

            if (ultraliskCavernFunction == 4) { // 돌아가기
                break;
            }


        }

    }

    public void kerrigan_boss () { // 캐리건 사냥 페이지
        Kerrigan kerrigan = new Kerrigan("캐리건",9000,9000,10,10,250);
        System.out.println("최종보스 캐리건에게 도착하였습니다...");
        while(true) {
            System.out.println(" [1번]. 공격한다  [2번]. 스킬사용 [3번]. 상태보기 [4번]. 도망가다");
            System.out.print("번호 입력 :");
            int kerriganBossFunction = sc.nextInt();
            if (kerriganBossFunction == 1) {
                if (kerrigan.health > 0) // 캐리건의 체력이 0보다 클 때 실행될 구문
                {
                    System.out.println("마린의 공격!");
                    System.out.println("");
                    kerrigan.health += kerrigan.defense;
                    kerrigan.health -= marine.damage;
                    if (kerrigan.health <= 0) { //캐리건의 체력이 0보다 작거나 같을 때
                        kerrigan.health = 0; // 캐리건의 체력 0 으로 초기화.
                        System.out.println(kerrigan.name + " 이(가) 죽었습니다.");
                        System.out.println("");
                        System.out.println("미네랄 200 을(를) 얻었습니다.");
                        marine.mineral += 200;
                        System.out.println("");
                        System.out.println("미네랄 총 보유량");
                        System.out.println(marine.mineral);
                        System.out.println("");
                        System.out.println("보스가 쓰러졌습니다. 평화가 찾아옵니다");
                        System.out.println("수고하셨습니다!!");
                        System.out.println("...");
                        System.out.println("...Ending ! ");
                        System.exit(0);
                    } // 캐리건과의 전투가 아직 안 끝났을 때,
                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("캐리건의 상태");
                    System.out.println("캐리건의 현재 체력 " + "[" + kerrigan.health + "]" + "/" + "[" + kerrigan.health_max + "]");
                    System.out.println("캐리건의 현재 방어력 " + kerrigan.defense);
                    System.out.println("캐리건의 현재 공격력 " + kerrigan.damage);
                    System.out.println("");
                    System.out.println("캐리건의 공격 ! ");
                    marine.health += marine.defense;
                    marine.health -= kerrigan.damage;

                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("캐리건의 상태");
                    System.out.println("캐리건의 현재 체력 " + "[" + kerrigan.health + "]" + "/" + "[" + kerrigan.health_max + "]");
                    System.out.println("캐리건의 현재 방어력 " + kerrigan.defense);
                    System.out.println("캐리건의 현재 공격력 " + kerrigan.damage);
                    System.out.println("");
                    System.out.println("캐리건의 공격 ! ");
                }

                if (marine.health <= 0 ) { // 전투중 마린의 체력이 0보다 낮으면 죽는 구문
                    System.out.println("마린이 죽었습니다.");
                    System.out.print("GameOver..." );
                    System.exit(0);
                }
            }
            if (kerriganBossFunction == 3) { // 상태창 확인하기
                System.out.println("-----------------------전투 상태창-----------------------");
                System.out.println("");
                System.out.println("마린의 상태");
                System.out.println("마린의 현재 체력 " + "[" + marine.health + "]" + "/" + "[" + marine.health_max + "]");
                System.out.println("마린의 현재 방어력 " + marine.defense);
                System.out.println("마린의 현재 공격력 " + marine.damage);
                System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                System.out.println("");
                System.out.println("캐리건의 상태");
                System.out.println("캐리건의 현재 체력 " + "[" + kerrigan.health + "]" + "/" + "[" + kerrigan.health_max + "]");
                System.out.println("캐리건의 현재 방어력 " + kerrigan.defense);
                System.out.println("캐리건의 현재 공격력 " + kerrigan.damage);
                System.out.println("");

            }

            if (kerriganBossFunction == 4) { // 돌아가기
                break;
            }


        }

    }




    public void zergling_pool () { //저글링 사냥터
        Zergling zergling = new Zergling("저글링",45,45,0,6);
        System.out.println("저글링 부화장에 입장하였습니다...");
        while(true) {
            System.out.println(" [1번]. 공격한다  [2번]. 스킬사용 [3번]. 상태보기 [4번]. 도망가다");
            System.out.print("번호 입력 :");
            int zerglingpoolFunction = sc.nextInt();
            if (zerglingpoolFunction == 1) {
                if (zergling.health > 0 ){
                    System.out.println("마린의 공격!!");
                    System.out.println("");
                    zergling.health -= marine.damage;

                    if (zergling.health <= 0) { //저글링의 체력이 0보다 작거나 같을 때 실행 될 구문 .
                        zergling.health = 0;
                        System.out.println(zergling.name + " 이(가) 죽었습니다.");
                        System.out.println("");
                        System.out.println("미네랄 5 을(를) 얻었습니다.");
                        marine.mineral += 5;
                        System.out.println("");
                        System.out.println("미네랄 총 보유량");
                        System.out.println(marine.mineral);
                        break;
                    }

                    // 저글링과의 전투가 아직 안 끝났을 때,
                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "["+marine.health+"]"+"/"+"["+marine.health_max+"]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("저글링의 상태");
                    System.out.println("저글링의 현재 체력 "+"["+ zergling.health+"]"+"/"+"["+zergling.health_max+"]");
                    System.out.println("저글링의 현재 방어력 " + zergling.defense);
                    System.out.println("저글링의 현재 공격력 " + zergling.damage);
                    System.out.println("");
                    System.out.println("저글링의 공격 ! ");
                    marine.health -= zergling.damage;

                    System.out.println("-----------------------전투 상태창-----------------------");
                    System.out.println("");
                    System.out.println("마린의 상태");
                    System.out.println("마린의 현재 체력 " + "["+marine.health+"]"+"/"+"["+marine.health_max+"]");
                    System.out.println("마린의 현재 방어력 " + marine.defense);
                    System.out.println("마린의 현재 공격력 " + marine.damage);
                    System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                    System.out.println("");
                    System.out.println("저글링의 상태");
                    System.out.println("저글링의 현재 체력 "+"["+ zergling.health+"]"+"/"+"["+zergling.health_max+"]");
                    System.out.println("저글링의 현재 방어력 " + zergling.defense);
                    System.out.println("저글링의 현재 공격력 " + zergling.damage);
                    System.out.println("");
                    System.out.println("저글링의 공격 ! ");

                }

                if (marine.health <= 0 ) { // 전투중 마린의 체력이 0보다 낮으면 죽는 구문
                    System.out.println("마린이 죽었습니다.");
                    System.out.print("GameOver..." );
                    System.exit(0);
                }
            }
            if (zerglingpoolFunction == 3 )  {
                System.out.println("-----------------------전투 상태창-----------------------");
                System.out.println("");
                System.out.println("마린의 상태");
                System.out.println("마린의 현재 체력 " + "["+marine.health+"]"+"/"+"["+marine.health_max+"]");
                System.out.println("마린의 현재 방어력 " + marine.defense);
                System.out.println("마린의 현재 공격력 " + marine.damage);
                System.out.println("마린의 사이오닉 에너지 " + marine.psionicEnergy);
                System.out.println("");
                System.out.println("저글링의 상태");
                System.out.println("저글링의 현재 체력 "+"["+ zergling.health+"]"+"/"+"["+zergling.health_max+"]");
                System.out.println("저글링의 현재 방어력 " + zergling.defense);
                System.out.println("저글링의 현재 공격력 " + zergling.damage);
                System.out.println("");
            }
            if (zerglingpoolFunction==4) {
                break;
            }
        }

    }

    public void upgrade_damage () { // 비용 미네랄 8 ++ , 업그레이드가 될 때마다 1원씩 추가해야한다
        int damage_upgrade = 1;
        if (marine.mineral>dmgUpgrade_cost) {
            damage += damage_upgrade;
            marine.mineral -= dmgUpgrade_cost;
            dmgUpgrade_cost++;

        }
        else
        {
            System.out.println("돈이 부족합니다 할 수 없습니다.");
        }

        System.out.println("현재 미네랄 보유량 : " + marine.mineral);

        System.out.println("다음 업그레이드 비용 "+dmgUpgrade_cost);

        System.out.println("업그레이드 된 마린 공격력 " + marine.damage);

    }

    public void upgrade_defense () { // 비용 미네랄 8 ++ // 방어력 업그레이드
       int defense_upgrade = 1;
        if (marine.mineral>defUpgrade_cost) {
            defense += defense_upgrade ;
            marine.mineral -= defUpgrade_cost;
            defUpgrade_cost++;

        }
        else
        {
            System.out.println("돈이 부족합니다 할 수 없습니다.");
        }

        System.out.println("현재 미네랄 보유량 : " + marine.mineral);

        System.out.println("다음 업그레이드 비용 "+defUpgrade_cost);

        System.out.println("업그레이드 된 마린 방어력 " + marine.defense);
    }

    public void upgrade_health () { // 비용 미네랄 8 ++ // 최대체력 업그레이드
        int hpm_upgrade = 10;
        if (marine.mineral>hpmUpgrade_cost) {
            health_max += hpm_upgrade;
            marine.mineral -= hpmUpgrade_cost;
            hpmUpgrade_cost++;

        }
        else
        {
            System.out.println("돈이 부족합니다 할 수 없습니다.");
        }

        System.out.println("현재 미네랄 보유량 : " + marine.mineral);

        System.out.println("다음 업그레이드 비용 "+hpmUpgrade_cost);

        System.out.println("업그레이드 된 마린 최대체력 " + marine.health_max);
    }


    public void show_state () {
        System.out.println("이름 : "+ name);
        System.out.println("현재체력 : "+ health);
        System.out.println("방어력 : "+ defense);
        System.out.println("공격력 : "+ damage);
    }

}



