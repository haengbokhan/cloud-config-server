# cloud-config-server
`Eirene(에이레네)` 프로젝트의 분산 시스템에서 사용될 환경 설정 정보들을
관리 및 제공해주는 서비스입니다.

## 프로젝트 정보
|사항|이름|버전|
|--|--|--|
|개발 언어|Java|OpenJDK 23|
|빌드 도구|Gradle|8.10|


## 저장소 설정
> ⚠️ 이 단계를 하기 전, 환경 설정 정보를 가져올 저장소가 구성되어야 합니다.

> ✅ 환경 설정 저장소를 구성이 필요하신가요? [이곳](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_environment_repository)을 참고하세요.

사용하고자 하는 프로필(profile) 이름을 지정하여 Spring 설정 파일을 생성합니다(택 1).

<ul style="padding-inline-start: 0; list-style-type: none;">
    <li>
        <span>1. </span>
        <code>
            <img alt="spring icon dark theme" src=".github/IMAGE/spring-icon-dark.svg" style="vertical-align: sub;" />
            <span>application-{profile}.properties</span>
        </code>
    </li>
    <li>
        <span>2. </span>
        <code>
            <img alt="spring icon dark theme" src=".github/IMAGE/spring-icon-dark.svg" style="vertical-align: sub;" />
            <span>application-{profile}.yml</span>
        </code>
    </li>
    <li>
        <span>3. </span>
        <code>
            <img alt="spring icon dark theme" src=".github/IMAGE/spring-icon-dark.svg" style="vertical-align: sub;" />
            <span>application-{profile}.yaml</span>
        </code>
    </li>
</ul>

`Git`, `JDBC`, `AWS`, `Vault` 등의 저장소 서비스와 연동합니다.

다음은 `Git` 연동 예제입니다.

```properties
# .properties

# HTTP 연결 타임아웃(단위 : 초)
spring.cloud.config.server.git.timeout=10

# Git 저장소 URI
spring.cloud.config.server.git.uri=https://github.com/haengbokhan/git-backend-example

# Git 계정 아이디
spring.cloud.config.server.git.username=tester

# Git 계정 비밀번호
spring.cloud.config.server.git.password=tester-password
```

```yaml
# .yml(.yaml)

spring:
  cloud:
    config:
      server:
        git:
          # HTTP 연결 타임아웃(단위 : 초)
          timeout: 10
          # Git 저장소 URI
          uri: https://github.com/haengbokhan/git-backend-example
          # Git 계정 아이디
          username: tester
          # Git 계정 비밀번호
          password: tester-password
```

더 자세한 저장소 정보와 연동은 [이곳](https://docs.spring.io/spring-cloud-config/docs/current/reference/html/#_environment_repository)을 참고하세요.

## IDE 설정(Optional)
`Intellij`를 사용할 경우 다음과 같은 작업이 필요합니다.

1. `[File | Settings]` 메뉴에 들어갑니다.
   - `Windows` - `Ctrl + Alt + S`
   - `MacOS` - `⌘ Сmd + 0`
2. `[Build, Execution, Deployment | Compiler | Annotation Processor] 하위 메뉴로 이동합니다.`
   - 검색 창에 `annotation processing`을 입력하셔도 됩니다.
3. `Enable annotation processing` 체크박스에 체크를 합니다.
4. 창 오른쪽 하단에 `Apply` 버튼을 누르고 닫거나, `OK` 버튼을 누릅니다.