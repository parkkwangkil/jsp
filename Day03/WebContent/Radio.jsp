<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>라디오</title>
</head>
<body>
<form method="get" action="Radio">
<label for="gender"> 성별 :</label>
<input type="radio" id="gender" name="gender" value="남자" checked> 남자
<input type="radio" id="gender" name="gender" value="여자"> 여자 <br><br>
<label for="chk_mail"> 메일 수신 정보  : </label>
<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked> 수신
<input type="radio" id="chk_mail" name="chk_mail" value="no"> 거부 <br><br>
<label for="content"> 간단한 가입인사를 적어주세요</label>
<textarea id="content" name="content" rows="3" cols="35"></textarea> <br>
<input type="submit" value="전송">
</form>

<br> <br>

<form method="post" action="Radio">
<label for="gender"> 성별 :</label>
<input type="radio" id="gender" name="gender" value="남자" checked> 남자
<input type="radio" id="gender" name="gender" value="여자"> 여자 <br><br>
<label for="chk_mail"> 메일 수신 정보  : </label>
<input type="radio" id="chk_mail" name="chk_mail" value="yes" checked> 수신
<input type="radio" id="chk_mail" name="chk_mail" value="no"> 거부 <br><br>
<label for="content"> 간단한 가입인사를 적어주세요</label>
<textarea id="content" name="content" rows="3" cols="35"></textarea> <br>
<input type="submit" value="전송">
</body>
</html>