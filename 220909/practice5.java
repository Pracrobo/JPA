Class MemberService {
    public void process() {
        Member member1 = memberDAO.find(memberId);
        member1.getTeam();
        member1.getOrder().getDelivery();
        /*
        JPA를 통해 객체를 가져온 경우에는
         */
        Member member2 = jpa.find(Member.class, memberId);
        member2.getTeam;
        member2.getOrder().getDelivery();
    }
}
//객체 그래프를 완전히 자유롭게 탐색할 수 있게 한다.
// 지연로딩 전략*Lazy loading 사용
    // 관련된 객체를 사용하는 그 시점에 SELECT Query를 날려서 객체를 가져오는 전략

// 객체 그래프 탐색
Member member = em.find(Member.class, 100L);
Team team = member.getTeam();
System.out.println("팀이름 =" + team.getName());

// 객체 지향 쿼리
public static void testJPQL(EntityManager em) {
    String jpq11 = "select m from Member m join m.team t where t.name = :teamName";
    List<Member> resultList = em.createQuery(jpq11, Member.class).setParameter("teamName", "팀1").getResultList();

    for(Member member : resultList) {
    System.out.println("[query] member.username = " + member.getUsername());

        }
}