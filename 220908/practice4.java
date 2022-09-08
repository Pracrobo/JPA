list.add(album); // Entity객체 컬렉션에 저장
list.add(movie); // 중복 객체가 있는 것을 컬렉션에 저장
Album album = list.get(albumId); //get()를 써서 가져오기

jpa.persist(album); // 메소드 사용해서 객체 저장
// CRUD도 마찬가지로 저장

//연관관계 : 객체는 참조 사용해서 연관된 객체를 조회한다.
// 테이블은 외래키를 사용해 다른 테이블과 조인해 연관된 테이블을 조회한다.

//Join 기능이 있어 외래 키의 값을 그대로 보관 가능 ; 참조를 사용
Team team = member.getTeam();
// 객체 지향 모델링 : 참조
class Member {
    String id; //MEMBER_ID 컬럼사용
    Team team; // 참조연관관계
    String username; //USERNAME 컬럼사용

    Team getTeam() {
        retrun team;
    }
}

class Team {
    Long id;  //TEAM_ID PK 사용
    String name; //NAME 컬럼사용
}
