package com.example.ex00.dependency;

import lombok.*;
import org.springframework.stereotype.Component;

// 일반 객체는 컴포넌트 붙이기 VO 랑 DTO 에 붙이기
@Component
// 게터세터
//@Data

@Getter
@ToString
// 기본생성자
//@NoArgsConstructor

// 전체 생성자
//@AllArgsConstructor

//DTO 일때 final 이나 수정X 널X   @NonNull  수정O 널X  붙어있는것만   @ 4개만하고 final 붙이고 ㄱㄱ (의존관계 있는것만 )
@RequiredArgsConstructor
public class Coding {
    // 주입 해줘 DI  필드주입
    // 필드 주입 피해라 // 단위 테스트에선 필드주입 사용하기
    // 굉장히 편하게 주입 할 수 있으나 순환 참조시(무한루프) 오류가 발생하지 않기 떄문에 StackOverFlow 발생.
    // final을 붙일 수 없기 때문에 다른 곳에서 변형 가능
    // final 이 있으면 반드시 초기화를 해줘야한다 

//    @Autowired
    private final Computer computer;

//    생성자 주입  필드에 final 붙일수 있다 이게 초기값으로 인식 해주기 때문에

//    생성자 주입
//    순환 참조시 컴파일러 인지 가능, 오류 발생
//    메모리에 할당되면서 초기값으로 주입되므로 final 키워드 사용 가능, 다른 곳에서 변형 불가능
//    의존성 주입이 되지 않으면 객체가 생성되지 않으므로 NPE 방어
//    생성자에 @AutoWired 생략 가능 

//    @Autowired
//    public Coding(Computer computer) {
//        this.computer = computer;
//    }
}
