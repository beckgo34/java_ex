package memo;

public class frontend {
    /**
     *  03_ Fronend
     *   * 사용자가 웹서비스를 활용할 때 만나는 화면
     *   * 화면,UI(User Interface), GUI(Graphical User Interface)
     *   * react, vue
     *   * 웹개발자, 웹디자이너, 웹퍼블리셔
     *
     *   1. 구석요소
     *      a. HTML (HyperText Markup language)
     *          1. 화면의 구조를 정의
     *          2. 화면에 나오는 텍스트, 이미지 등을 보여줌
     *          3. 여러 태그, 속성, 속성ㄱ밧 등으로 세부적인 특성 등을 정의
     *      b. CSS (Cascading Style Sheets)
     *          1. 화면의 레이아웃, 디자인 등을 꾸밀 수 있음
     *      C. JavaScript
     *          1. 화면을 동적으로 변화시킬 수 있는 기능
     *          2. 여러 api 연동 등을 통해 다양한 기능을 추가하는 코드 작성
     *          3. 프로그래밍 언어의 한 종류
     *   2. 파일
     *      a. 확장자: *.html
     *      b. html 파일안에 모든 내용을 작성
     *      c. .css, .js 파일을 따로 분리하여 사용가능
     *   3. html 태그
     *      a. <> 로 표현함
     *      b. html, head, body, div, p, table 등의 고유 태그들이 있으며, 필요시 직접 태그를 만들수도 있음.
     *      c. 시작태그, 졸료태그로 태그의 범위를 지정함.(자바에서의 중괄호 역할과 비슷)
     *          1.
     *              <body> body 시작태그
     *                 div, p 태그는 모두 body 태그 소속
     *                 <div> div 시작태그
     *                     div 의 영역
     *
     *                 </div>  div 종료태그
     *                 <p> p 시작태그
     *                     p 의 영역
     *                 </p> p 종료태그
     *              </body> body 태그 종료
     *  4. 인라인(inline)요소(태그), 블록(block)요소(태그)
     *      a. 인라인 요소
     *          1. span, input, strong, b 태그 등이 있음
     *          2. 인라인 요소로 작성한 내용은 딱 내용만큼 영역을 차지함
     *          3. 인라인 요소 다음에 작성하는 요소가 인라인 요소라면 바로 옆에 이어서 보이며,
     *             블록요소라면 새로운 줄에 보임
     *      b. 블록 요소
     *          1. div,p,h1~h6 태그등이 있음
     *          2. 블록 요소로 작성한 내용은 한 줄 전체를 모두 차지함.
     *          3. 블록요소 다음에 작성하는 요소는 무조건 새로운 줄에 보임
     *  5. 선택자(selector)
     *      a. css, javascript에서 특정 태그 또는 특정 속성 등을 가지 ㄴ요소를 선택하여 활용할 떄
     *         사용하는 문법
     *      b. *은 모든 요소를 선택한다는 의미
     *      c. 태그선택자
     *          1. 특정 태그에만 해당 스타일을 적요할 때
     *          2. 태그 이름만 작성
     *              // div 태그에 적용
     *              div{
     *                  적용할 효과
     *              }
     *
     *              //p 태그에 적용
     *              p{
     *                  적용할 효과
     *              }
     *      d. id 선택자
     *          1. 특정 id 속성을 가지고 있는 태그에 스타일을 적용할 때
     *          2. #id이름 으로 작성
     *
     *              // id1이 적용된 요소에 적용할 스타일
     *              #id{
     *                  적용할 효과
     *              }
     *              // body에 id=id1 이라고 적용된 div 태그
     *              <div id="id1">
     *
     *              </div>
     *       e. class 선택자
     *          1. 특정 class 속성을 가지고 있는 태그에 스타일을 적용할 때
     *          2. .class이름 으로 작성
     *
     *             // class1이 적용된 요소에 적용할 스타일
     *                 .class1{
     *                       적용할 효과
     *                   }
     *             // body에 class="class1" 이라고 적용된 div 태그
     *                    <div class="class1">
     *
     *                    </div>
     *   6. margin(마진),padding(패딩)
     *      a. 여백을 지정하는 방법
     *      b. margin
     *          1. 바깥쪽 여백
     *          2. 다른요소와의 여백
     *      c. padding
     *          1. 안쪽 여백
     *          2. 테두리를 기준으로 안쪽 여백
     *      d. 사용 방법
     *          1. 위(top),아래(bottom),좌(left or start),우(right or end) 여백을 각각 지정하거나
     *              한번에 지정 할 수 있음
     *          2. 4방향을 한 번에 적용: 값 하나만 작성
     *              1. margin: 10px
     *                  a. 4방향 모두 10px의 마진을 적용
     *          3. 위아래, 좌우를 각각 적용: 값 두개 작성
     *              1. margin: 10px 20px
     *                  a. 위아래 10px, 좌우 20px margin 적용
     *          4. 위,좌우,아래를 각각 적용: 값 세개 작성
     *              1. margin: 10px 20px 30px
     *                  a. 위 10px, 좌우 20px, 아래 30px margin 적용
     *          5. 4방향을 각각 적용 값 네개 작성
     *              1. margin: 10px 20px 30px 40px
     *                  a. 위 10px, 우 20px, 아래 30px, 좌 40px (시계방향)
     *          6. margin-top, margin-left, magin bottom, margin-right 와 같이 각각을 따로 지정할
     *             수 있는 속성도 있음
     *   7. position 속성
     *      a. 요소를 배치할 떄 사용하는 속성
     *      b. 종류:static(기본), relative, fixed, absolute, sticky
     *      c. static
     *          1. position 속성 값으 별도로 주지 않아도 기본으로 설정되는 값
     *          2. 요소 배치할 떄는 static 으로 사용 불가
     *      d. relative
     *          1. 원래 있어야 할 위치로 부터의 배치
     *          2. 이 속성을 지정하면 원래 해당 요소가 있어야 할 공간은 비워짐
     *          3. relative로 배치할 떄 사용하지 않음
     *          4. 자식 요소를 배치할 떄는 부모요소에 relative 속성을 지정해야 함
     *      e. absolute
     *          1. 부모요소를 기준으로 위치를 잡음
     *          2. 부모요소에 relative 속성을 주고 자식요소는 absolute를 지정하여 배치에 활용
     *          3. 자신의 직접적인 부모가 relative 속성을 가지고 있지 않으면 더 상위부모를 찾게되고
     *              그래도 없으면 body를 기준으로 위치를 잡음
     *      f. fixed
     *          1. 브라우저 기준으로 위치르 ㄹ지정
     *          2. 헤더(메뉴바), 배너 등을 고정시킬 때 활용
     *      g. sticky
     *          1. 스크롤과 함꼐 사용하는 경우 많음
     *          2. 스크롤 내릴 때 메뉴바가 화면 상당에 고정되는 상호아을 구현하고자 할 때 활용
     *
     *
     */
}
