<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<% 

// Ŭ���̾�Ʈ�� ���� request���� �α��� ���� ��Ű �ܿ��� �ٸ� ��Ű���� 
// �߷��� ���� ����
Cookie[] cookies = request.getCookies();
Cookie loginCookie = null;

if(cookies!=null){
	for(Cookie c : cookies){
		if(c.getName().equals("loginId")){
			loginCookie = c;
		}
	}
}
if(loginCookie==null){
	out.println("�α��� ������ �����ϴ�.<br>");
	out.println
	("<a href='test05_login_form.jsp'>�α��������� ����</a>");
}else{
	out.println(loginCookie.getValue()+"�� �α��� �����Դϴ�.<br>");
	out.println("�ݰ����ϴ�~~~!<br>");
	out.println("<a href='test05_logout.jsp'>�α׾ƿ�</a>");
}
%>


</body>
</html>
