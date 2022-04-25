package chap07.section2

// 어노테이션은 코드에 부가 정보를 추가하는 역할을 한다.
// annotation class [어노테이션 이름] 으로 정의하여 사용

// 어노테이션의 속성
// @Target : 어노에티션이 지정되어 사용할 종류 (클래스, 함수, 프로퍼티 등)
// @Retention : 에노에이션을 컴파일된 클래스 파일에 저장할 것인지 실행시간에 반영할 것인지 결정
// @Repleatable : 어노테이션을 같은 요소에 여러 번 사용 가능하게 할지 결정.
// @MustBeDocumented : 어노테이션이 API의 일부분으로 문서화를 위해 사용

@Target(AnnotationTarget.CLASS, AnnotationTarget.FUNCTION, AnnotationTarget.VALUE_PARAMETER, AnnotationTarget.EXPRESSION)

// 어노테이션의 처리 방법, SOURCE : 컴파일 시간에 제거됨, BINARY : 클래스 파일에 포함되지만, 리플렉션에 위해 나타나지 않음, RUNTIME : 클래스 파일에 저장, 리플렉션에 의해 나타남
// 리플렉션 : 프로그램을 실행할 때 프로그램의 특정 구조를 분석해내는 기법.
@Retention (AnnotationRetention.SOURCE)

@MustBeDocumented
annotation class Fancy //선언

@Fancy class MyClass { //사용

}