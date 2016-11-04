<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Select</title>
</head>
<body>
<form method="get" action="SelectServlet">
<span style ="float : left; margin-right: 20px">
<label for="job"> 직업</label>
<select id="job" name="job" size="1">
<option value=""> 선택하세요 </option>
<option value="student"> 학생 </option>
<option value="computer/internet"> 컴퓨터 / 인터넷 </option>
<option value="messcom"> 언론 </option>
<option value="savant">공무원 </option>
<option value="solder">군인</option>
<option value="serviceup"> 서비스업 </option>
<option value="teacher"> 교육 </option>
</select>
</span>

<label for="interest" style="float: left;"> 관심분야 </label>
<select id="interest" name="interest" size='1' multiple="multiple">
<option value="Kilimanjaro"> 킬리만자로</option>
<option value="Roastingl">로스팅</option>
<option value="caramel Macchiato">카라멜 마끼아또</option>
<option value="cappuccino">카푸치노</option>
<option value="cocoa">코코아</option>
</select><br><br>
<input type="submit" value="전송" style="float:right;margin-right:50px">

</form>
</body>
</html>