# UserUpgradePolicy

UserUpgradePolicy는 토비 스프링 vol1권의 5장 '서비스의 추상화'의 연습을 하기 위해 만들어진 미니 프로젝트입니다.

주어진 코드는 템플릿 코드이며 각 스터디 구성원 분들은 포크를 떠서 새 브랜치를 판다음 각자 구현을 해주시면 될 것 같습니다.

### Project Purpose

책 348 페이지의 '업그레이드 정책 인터페이스'를 만들어 레벨을 업그레이드하는 정책을 유연하게 변경할 수 있도록 코드를 개선하는 것이 목표입니다.

> 연말 이벤트나 새로운 서비스 홍보기간 중에는 레벨 업그레이드 정책을 다르게 적용할 필요가 있을 수도 있다. 그럴 때마다 중요한 사용자 관리 로직을 담은 UserService의 코드를 직접 수정했다가 이벤트 기간이 끝나면 다시 이전 코드로 수정한다는 것 상당히 번거롭고 위험한 방법이다. 
>
> 이런 경우 사용자 업그레이드 정책을 UserService에서 분리하는 방법을 고려해볼 수 있다. [후략 ... ] 

### Get Started

1. `git clone https://github.com/DE-labtory/sc.git`
2. 자신이 사용하는 코드 에디더를 열어 sc/userupgradepolicy 폴더를 open 합니다.
3. IntelliJ의 경우 IntelliJ IDEA > Preference > Annotation Processors에 들어가서 상단의 Enabling annotation 체크박스를 체크해줍니다.
4. src/test/java/com.delabtory.userupgradepolicy/UserRepositoryTests 의 테스트 케이스를 실행시켜 통과하는 것을 확인합니다.

개발의 편의성을 위해 JPA를 사용해 데이터베이스의 데이터에 접근합니다. 그렇기 때문에 책에서 나온 UserDao의 역할을 UserRepository가 수행한다고 생각하면 됩니다.

구현의 검증은 편의성을 위해 테스트 코드의 통과로 확인합니다. 원하시면 컨트롤러를 붙여 직접 http 통신을 하여 확인하셔도 됩니다!

### Tip

* JPA가 낯선 분들도 있으실 거 같은데 이번 프로젝트에서 UserRepository는 따로 건드릴 필요가 없다고 생각합니다. User, Level, UserService에 집중하시면 될 것 같습니다.
* 테스트 코드 작성은 일부로 생략을 하였습니다. JUNIT 사용법을 익혀보면서 직접 User, Level, UserService의 테스트 코드를 작성해보시면 엄청 큰 공부가 될 것이라고 생각합니다.
