<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
<style>
.main-div-style{
		width:60%;
		background:#CCC;
		margin-left:auto;
		margin-right:auto;
		color:#468847;
		background:#dff0d8;
		height:100%;
		border:1px solid #d6e9c6;
		box-shadow: 0 0 10px rgba(0,0,0,0.5);
}
a{
	text-decoration: none;
	background:#4CAF50;
	padding:10px;
	box-shadow: 0 0 10px #468847;
	display:inline-block;
	cursor:pointer;
	text-align:center;
	color:  #f5f5f0;
	font-size:18px;
}
#manually-inp{
	margin-left: 40%;
}
h1{font-size:36px;}
a:hover{
	background:white;
	color:#4CAF50;
	box-shadow: 0 10px 20px #468847;
}
.main-title{
	text-align:center;
}
.hidden-buttons a{
	margin-left:10px;
	font-size:16px;
}
.hidden-buttons{
	margin-left: 17%;
	margin-top:30px
}
.hidden-buttons h1{
	margin-left:8%;
}
#url-input{
	width:60%;
	box-shadow: 0 0 6px #468847;
	border:1 px solid #4CAF50;
}
#url-input:focus{
	outline: none;
}
.inputing-url{
	text-align:center;
	width:60%;
	margin:auto;
}
</style>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
</head>
<body style="height:500px;">
<div class="main-div-style">
<div class="menu-choose">
<div class="main-title">
<div class="additionl-action" style="position:absolute; right:21%; top:0px; width:25%">
<p style="display:inline-block; margin-right:8%" >Click here if you want to fill your database first</p>
<a href="fillDatabase" style="position:absolute; padding:0px;right:0px; top:30%">Fill</a>
</div>
<h1>Please, choose way to executing tasks</h1> 
</div>
<div style="width:60%; display:inline-block;">
<a id="manually-inp">Manually input url</a>
</div>
<div style="width:30%; display:inline-block;">
<a id = "help-inp">With extra help</a>
</div>
</div>
<div class="hidden-buttons" hidden>
<h1>Choose task for executing</h1>
<div id="additional-buttons" style="position:absolute; top:25%;left:20%" hidden>
<a href="task0movies">Task0movies</a>
<a href="task0users">Task0users</a>
<a href="task0ratings">Task0ratings</a>
</div>
<a id="tasks">Task0</a>
<a href="task1">Task1</a>
<a href="task2">Task2</a>
<a href="task3">Task3</a>
<a href="task4">Task4</a>
<a href="task5">Task5</a>
<a href="task6">Task6</a>
</div>
<div class="inputing-url" hidden>
<h1>Please input your url here:</h1>
<input type="text" id="url-input"> <a style="padding-top:0px;padding-bottom:0px;" id="ok">Ok</a>
</div>
</div>
<script>
$("#help-inp").click(function(){
 $(".menu-choose").fadeOut(1000);
    $(".hidden-buttons").attr('hidden','').delay(1000).slideDown(1000);
});
$("#manually-inp").click(function(){
 $(".menu-choose").fadeOut(1000);
    $(".inputing-url").attr('hidden','').delay(1000).slideDown(1000);
});
$('#ok').click(function(){
	var val = document.getElementById('url-input').value;
	if(val.charAt(0) == '/') location.href = location.href + val.slice(1);
	else location.href = location.href + val;
})
$('#tasks').click(function(){
	$('#additional-buttons').fadeIn("slow");
})
</script>
</body>
</html>