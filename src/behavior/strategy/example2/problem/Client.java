package behavior.strategy.example2.problem;

/**
 * taekwonV와 atom의 move와 attack기능을 추상화했다
 * 하지만...
 * 문제점1) 기존 로봇의 공격 또는 이동 방법을 수정하려면? 아톰을 걷게하고 태권V를 날게 하려면
 * 문제점2) 새로운 로봇을 만들어 기존의 공격 또는 이동방법을 추가하거나 수정하려면?
 * 현재 코드는 직접적인 수정이 필요하기 때문에 OCP에 위배된다.
 * 또한 기존의 공격 또는 이동방법을 추가하는 경우 코드의 중복이 발생한다.
 */
public class Client {
    public static void main(String[] args) {
        Robot taekwonV = new TaekwonV("TaekwonV");
        Robot atom = new Atom("Atom");

        System.out.println("My name is " + taekwonV.getName());
        taekwonV.move();
        taekwonV.attack();

        System.out.println();

        System.out.println("My name is " + atom.getName());
        atom.move();
        atom.attack();
    }
}
