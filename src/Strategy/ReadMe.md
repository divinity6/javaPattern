### Strategy 패턴( 전략 패턴 )

- 상대적으로 가장 단순한 패턴


- 어떤 하나의 기능을 구성하는 특정 부분을 실행중에 다른것으로 효과적으로 변경할 수 있는 방안을 제공


- 즉, 필요할 경우 전략을 바꿀 수 있는 패턴이라고 볼 수 있다

---

### class SumPrinter

- **print() : void**
  - n 까지의 총 합을 출력하는 print 메서드
  - SumStrategy strategy : 총합을 계산하는 방법
  - int N : 총 합을 구하기 위한 N 
  - N 값 출력 후, strategy 에서 총 합을 구한후 출력 함

---

### interface SumStrategy

- **get( N ): int**
  - 총 합을 얻는 메서드만 제공함

---

### class SimpleSumStrategy

- interface SumStrategy 를 구현하는 구현 클래스

---

### class GaussSumStrategy

- interface SumStrategy 를 구현하는 구현 클래스

---

### 느낀점

- 하나의 기능에 대해, 서로다른 방식의 구현을 실행중에 변경할 수 있다


- 같은 기능인데 여러 상태 값에 따라 로직들이 달라져야한다면 생각보다 유용할듯?

