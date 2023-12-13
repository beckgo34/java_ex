package memo;

public class GetterSetter {
    /**
     * 4.getter/setter 메서드
     *  a.클래스가 가지고 있는 필드는 외부에서 직접 접근을 못하게 해야함.
     *      1. 필드에는 private 이라는 접근제한자를 붙임.
     *  b. getter/setter 라는 메서드를 이용하여 필드 값을 간접적으로 저장하고 사용하도록 함.
     *  c. 각각의 필드는 각각의 getter/setter 메서드를 하나씩 가짐.
     *  d. setter 메서드
     *      1. 필드에 값을 저장하기 위한 메서드
     *      2. 필드 이름이 name이라면 setName()이라는 이름으로 만듦.
     *      3. 실행 내용은 저장할 값을 매개변수로 전달 받고 전달받은 값을 필드에 저장
     *      4. 예
     *           public class Ex{
     *              private String name;
     *            public void setName(String name){
     *                this.name = name;
     *             }
     *              public String getName(){
     *                  return name;
     *              }
     *            }
     *  e.getter 메서드
     *      1. 필드값을 전달하기 위한 메서드
     *      2. 필드 이름이 name이라면 getName()이라는 이름으로 만듦.
     *      3. 해당 필드와 동일한 타입의 리턴타입으로 정의하고 매개변수는 없음.
     *            public class Ex{
     *                   private String name;
     *                 public void setName(String name){
     *                      this.name = name;
     *                  }
     *                    public String getName(){
     *                        return name;
     *                    }
     *                  }
     */
}
