package hello.core.member;

public interface MemberRepository {

    //회원 저장
    void save(Member member);
    //Id 조회
    Member findById(Long memberId);

}
