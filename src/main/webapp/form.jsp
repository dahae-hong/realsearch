<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
function search(s){
	console.log(s);
	$.ajax({url: "/searchlist?search="+s, success: function(result){ //searchlist.jsp의 내용을 가지고와서 result 에 뿌려줌
	      $("#result").html(result);
	    }});
}

</script>
</head>
<body>
<input type="text" name="search" onkeyup="search(this.value)"><br>
<div id="result">

</div>
</body>
</html>