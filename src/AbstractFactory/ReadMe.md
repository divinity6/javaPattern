### AbstractFactory 패턴( 추상 팩토리 패턴 )

- Abstract Factory


- Abstract Factory = 추상적인 것들을 만드는 공장


- 먼저 만들어야할 컴포넌트들을 추상적으로 정하고 어떤 구체적인 상황이 주어지면


- 상황에 맞게 각 컴포넌트들을 구체적으로 만드는 패턴

---

### Diagram

- 만들어야할 공장과, 클래스들은 추상 클래스들로 정의된다

- abstract **ComponentFactory**
  - 만들어야할 컴포넌트들을 만들어주는 추상 팩토리 클래스
  - 정의만 하고 있으므로 인터페이스로 정의해도 된다
  - abstract **Button**
      - 버튼을 만드는 추상 팩토리 클래스
  - abstract **CheckBox**
      - 체크박스를 만드는 추상 팩토리 클래스
  - abstract **TextEdit**
      - 텍스트 에디터를 만드는 추상 팩토리 클래스


- **WindowsFactory**
  - 윈도우 운영체제에서 사용할 팩토리 클래스
  - ComponentFactory 를 상속받아 어떤 컴포넌트를 만들어야할지 알고 있다
  - **WindowsButton**
    - abstract Button 를 상속, WindowsFactory 에서 생성
  - **WindowsCheckBox**
    - abstract CheckBox 를 상속, WindowsFactory 에서 생성
  - **WindowsTextEdit**
    - abstract TextEdit 를 상속, WindowsFactory 에서 생성


- **LinuxFactory**
  - 리눅스 운영체제에서 사용할 팩토리
  - ComponentFactory 를 상속받아 어떤 컴포넌트를 만들어야할지 알고 있다
  - **LinuxButton**
    - abstract Button 를 상속, LinuxFactory 에서 생성
  - **LinuxCheckBox**
    - abstract CheckBox 를 상속, LinuxFactory 에서 생성
  - **LinuxTextEdit**
    - abstract TextEdit 를 상속, LinuxFactory 에서 생성

---

### 느낀점

- 사용하는곳 보면, factory 객체만 바꿔주면 다른애들은 정상동작하겠지...
  - 이런 factory 객체를 설정하는 것을 설정파일에서 해주는게 좋음


- factory 객체를 생성하는곳을 제외하고는 종속적인 코드가 존재하지 않는다
  - 특정한 상황에 따라, 특정한 컴포넌트를 생성해주는 패턴!


- 추상팩터리는 큰 구조 프레임워크 짤때 써봣지...