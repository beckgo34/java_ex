package memo;

public class ArrayList {
    /**
     * ArrayList
     *  * 특정 타입의 데이터를 여러 개 담아주기 위한 객체
     *  * Collection Framwork의 한 종류
     *      ' List(ArrayList...), Map(HashMap....), Set(HashSet....)
     *      ' List라는 인터페이스 타입을 구현한 ArrayLlst 클래스
     *  * 담는 데이터는 인덱스 번호를 가지며, 인덱스는 0번부터 시작
     *  * ArrayList 객체 선언시 크기를 따로 지정하지 않으며,데이터를 저장하는대로 크기가 늘어남
     *      1.선언 문법
     *          a.제네릭(<>)을 사용하며, <>안에는 클래스 이름만 올 수 있음.
     *          b.정수(int)를 다루는 List라면 <int>가 아닌 <Integer>로 사용해야 함.
     *
     *              List<[크래스타입]> [객체이름] = new ArrayList<[클래스타입(좌변과 동일하게, 하지만 생략가능]>();
     *              // String 을 담는 strList를 선언한다면
     *              List<String> strList = new ArrayList<>();
     *              // 정수(int)를 담는 intList를 선언한다면
     *              List<Integer> intList = new ArrayList<>();
     *              // 따로 정의한 회원 클래스(Member)를 담는 memberList를 선언한다면
     *              List<Member> memberList = new ArrayList<>();
     *      2.주요 메서드
     *          a. add():리스트에 데이터를 추가할 때
     *              1. add("담을데이터"):순서대로 데이터를 추가함.
     *              2. add(index번호,"담을데이터"):해당 인덱스에 데이터를 추가하고 기존 데이터는 하나씩 밀림
     *          b.get():리스트에서 데이터를 가져올 때
     *              1. get(index번호): 해당 인덱스에 담긴 데이터를 가져옴
     *          c.size():리스트에 담긴 데이터의 갯수를 반환(return type:int)
     *          d.remove():데이터를 삭제할때
     *              1.remove(index번호):해당 인덱스에 담긴 데이터를 삭제함
     */
}
