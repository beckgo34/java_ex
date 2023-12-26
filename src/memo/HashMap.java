package memo;

public class HashMap {
    /**
     *
     *  HashMap
     *  * Key, Value 의 쌍으로 구성된 데이터 구조
     *  * key 값을 이용하여 데이터에 접근할 수 있음.
     *  * Key 값은 정수,문자 등 다양한 타입으로 지정 가능
     *  1.선언 문법
     *     Map<Key타입, Value타입,> [map 객체이름] = new HashMap<>();
     *
     *     // Key가 정수, Value가 String 이라면
     *     Map<Integer, String> map1 = new HashMap<>();
     *
     *     // Key가 long,Value가 MemberDTO 라면
     *     Map<Long, MemberDTO> map2 = new HashMap<>();
     *
     *  2.map 주요 메서드
     *      a.put()
     *          map이름.put(key이름, 저장할데이터);
     *
     *      b.get():데이터 꺼내기
     *          map이름.get(key이름);
     *
     *      c.remove():삭제
     *          map이름.remove(key이름);
     *
     *   3.반복문으로 map 데이터 접근
     *      a.key로 이루어진 Set 객체를 만들고 이를 반복문으로 접근한 뒤 반복문 안에서 get() 활용
     *      b.keySet:map의 key만으로 만들어진 Set객체
     *          // Key가 정수 Value가 String 이라면
     *          Map<Integer, String> map1 = new HashMap<>();
     *
     *          // map1에 반복문 적용
     *          for(Integer 1 : map1.keySet()){
     *              System.out.println(map1.get(i))
     *          }
     */
}
