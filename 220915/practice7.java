@Entity
@Table(name="MEMBER")
public class Member {
    @Id
    @Column(name="ID")
    private String id;

    @Column(name="NAME", nullable=false, length=10) // 추가
    private String username;

}
//DDL에 not null 제약조건 추가할 수 있다.
// length 속성값 사용하면 자동 생성되는 DDL에 문자의 크기를 지정할 수 있다.
//nullable = false, length = 10


//유니크 제약조건
@Entity(name="MEMBER")
@Table(name="MEMBER", uniqueConstraints = {@UniqueConstratint (
        name = "NAME_AGE_UNIQUE",
        columnNames = {"NAME", "AGE"} )})
public class Member {
    @Id
    @Column(name = "id")
    private String id;

    @Column (name = "name")
    private String username;

    private Integer age;
    ...
}



/*
ALTER TABLE MEMBER
ADD CONSTRAINT NAME_AGE_UNIQUE UNIQUE (NAME, AGE)
 */

@Entity
public class Member{

    @Id
    @Column(name = "ID")
    private String id;
}