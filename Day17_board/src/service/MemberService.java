package service;

import dao.MemberDAO;
import vo.MemberVO;

public class MemberService {
	private static MemberService instance = new MemberService();

	private MemberService() {
	}

	public static MemberService getInstance() {
		return instance;

	}

	// dao 활용할 일이 많아 dao를 멤버로 유지
	private MemberDAO dao = MemberDAO.getInstance();

	// 회원 가입 메소드
	public boolean join(MemberVO member) {
		MemberVO savedMember = dao.select(member.getId());
		if (savedMember != null) {
			// 입력한 아이디의 회원이 이미 db에 있다.
			return false;
		} else {
			int result = dao.intsert(member);
			if (result == 1) {
				return true;
			} else {
				return false;
			}

		}

	}

	// 로그인 메소드
	public boolean login(String id, String password) {
		MemberVO savedMember = dao.select(id);
		if (savedMember != null && savedMember.getPassword().equals(password)) {
			// 해당 아이이디가 존재하고 비밀번호가 일치 하면 성공
			return true;
		} else {
			return false;
		}
	}
}
