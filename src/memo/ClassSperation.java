package memo;

public class ClassSperation {
    /**
     * Class 역할 분리하기
     *  1. oooMain Class
     *      a.실행이 시작되는 클래스
     *      b.메뉴를 출력해주고 메뉴를 선택하면 해당 기능을 실행해줌
     *      c.oooService 클래스 객체를 가지고 있고 서비스 클래스의 메서드를 호출함
     *  2. oooService Class
     *      a.각 기능을 수행하기 위한 여러 메서드를 가지고 있음
     *      b.oooMain 에서 호출한 메서드를 실행하고 주로 oooRepository의 메서드를 호출해줌
     *      c.Main과 Repository의 중간 역할
     *  3. oooRepository Class
     *      a.데이터의 최종 저장곤간인 oooList를 관리하는 클래스
     *      b.Service클래스에서 호출되며, 저장(C),조회(R),수정(U),삭제(D)등의 열할을 담당
     *      c.각각의 처리 결과를 Service 클래스로 리턴
     *  4. oooDTO Class
     *      a.DTO(Data Transfer Object)
     *      b.프로젝트에서 달는 객체를 정의하는 클래스
     *      c.필드.getter,setter,생성자,toString 등을 가지고 있음
     */
}
