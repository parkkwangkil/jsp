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

	// dao Ȱ���� ���� ���� dao�� ����� ����
	private MemberDAO dao = MemberDAO.getInstance();

	// ȸ�� ���� �޼ҵ�
	public boolean join(MemberVO member) {
		MemberVO savedMember = dao.select(member.getId());
		if (savedMember != null) {
			// �Է��� ���̵��� ȸ���� �̹� db�� �ִ�.
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

	// �α��� �޼ҵ�
	public boolean login(String id, String password) {
		MemberVO savedMember = dao.select(id);
		if (savedMember != null && savedMember.getPassword().equals(password)) {
			// �ش� �����̵� �����ϰ� ��й�ȣ�� ��ġ �ϸ� ����
			return true;
		} else {
			return false;
		}
	}
}
