### Template 패턴( 템플릿 패턴 )

- 템플릿 패턴은 어떤 기능에 대해, 실행되어야 할 각 단계에 대한 순서만을 정의


- 각 단계에 대한 세부 구현을 상황에 맞게 다르게 구현하도록 하는 패턴


- 즉 상황에 따라 구현 A , B 를 실행하도록 하는것.

---

### abstract class DisplayArticleTemplate

- 각 단계에 해당하는 메서드를 실행만해주는 클래스


- 단계 1, 2 ,3 에 대한 메서드는 클래스 내부에 선언만 되어있을 뿐, 구현되지 않기 때문


- 실행을 시켜야 하기 때문에 interface 가 아니라 추상클래스로 뺀건가?


- **display() : void**
  - 각 단계를 출력해주는 메서드
  - final 로 선언해서 파생클래스들에서 해당 메서드를 변경하지 못하도록 강제함
  - title , content , footer 메서드들을 순서대로 호출해줌

- **title() , content() , footer() : void**
  - 해당 클래스들을 구현없이 선언만 해둠

---

### class SimpleDisplayArticle

- abstract class DisplayArticleTemplate 구현

---

### class CaptionDisplayArticle

- abstract class DisplayArticleTemplate 구현

---

### class Article

- SimpleDisplayArticle , CaptionDisplayArticle 에서 반환하는 데이터를 얻을 수 있는 Class


- 애가 데이터 클래스구만

---
### 느낀점

- 이거는 Editor 만들때, 내부 hook 호출하게 할때 매우 유용하겠는데...?


- Template 에 지정해둔 Hook 대로 호출하게 하면 되겠네.


- 내부에서는 상황에 맞게 구현할 수 있으니깐...

