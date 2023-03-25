## 디자인 패턴( Design Pattern )

- 소프트웨어 설계 방법


- 반복되는 패턴처럼 자주 나타나는 클래스 간의 관계를 맺는 방법

---

### 올바른 관계를 맺어야 하는 이유

1. 클래스는 최소한의 단위 기능을 가짐


2. 큰 기능은 이러한 단위 기능을 갖는 클래스들 간의 상호 관계를 통해 개발됨


3. 꼭 필요한 것들로만 구성된 최적화된 소프트웨어 개발이 용이함


4. 문제 발생 시 최소한의 코드 수정으로 유지보수가 용이함


5. 기존 기능에 영향을 주지 않고 새로운 기능 추가가 용이함

---

### GoF 의 디자인 패턴

- 가장 유용하며 대표적인 디자인 패턴


- 선배 개발자( Gang of Four )가 체계적으로 정리해 놓은 설계 방법


- 총 23개 패턴으로 구성되며 생성 패턴( 5 개 ), 구조 패턴( 7 개 ), 행위 패턴( 11 개 )로 분류


|        **생성**        |    **구조**     |           **행위**            |     
|:--------------------:|:-------------:|:---------------------------:|
|  **Factory Method**  |  **Adaptor**  |       **Interpreter**       |
| **Abstract Factory** |  **Bridge**   |     **Template Method**     |
|     **Builder**      | **Composite** | **Chain of Responsibility** |
|    **Prototype**     | **Decorator** |         **Command**         |
|    **Singleton**     |  **Facade**   |        **Iterator**         |
|                      | **Flyweight** |        **Mediator**         |
|                      |   **Proxy**   |         **Memento**         |
|                      |               |        **Observer**         |
|                      |               |        **Strategy**         |
|                      |               |         **Visitor**         |

- 사실 위의 분류는 중요하지 않다


- 설계에 반드시 적용할 필요가 없고, 이해하는 것이 중요하다


- 디자인 패턴을 여**러 관점에서 변형하고, 혼합하여 소프트웨어 설계에 활용**하면 된다


- 출처 : https://www.youtube.com/@gisdeveloper