<!DOCTYPE html>
<html>
<head>
	<title>DYNAMIC ADDITION via AJAX</title>
	<script type="text/javascript" src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
	<style type="text/css">
		*
		{
			text-align: center;
			margin:auto;
		}
	</style>
</head>
<body>
	<form>
		Full Name : <input type="text" id="f_name" placeholder="Full Name"><br>
		Gender : <select id="gen">
				<option disabled selected>Gender</option>
				<option>Male</option>
				<option>Female</option>
				<option>Others</option>
				</select><br>
		Mobile Number : <input type="number" id="m_number" placeholder="Mobile Number"><br>
		City : <input type="text" id="city" placeholder="City"><br>
		State : <input type="text" id="state" placeholder="State"><br>
		Email : <input type="e-mail" id="e-mail" placeholder="Email"><br>
		<button id="sub" style="float: center;">Submit</button>
	</form>
	<div id="message"></div>
</body>
<script type="text/javascript">
	$(document).ready(function()
	{
		var req;
		var url = "show.php";
		if(window.XMLHttpRequest)
		{
			req = new XMLHttpRequest();
		}
		else if (window.ActiveXObject)
		{
			req = new ActiveXObject("Microsoft.XMLHTTP");
		}
		else
		{
			alert("Ajax Not supported!");
		}
		function meth()
		{
			if(req.readyState == 4)
			{
				$("#message").html(req.responseText);
			}
		}
		req.onreadystatechange = meth;
		req.open("GET",url,true);
		req.send(null);
	});
	$("#sub").on("click",function()
	{
		var req;
		var tf_name = $("#f_name").val();
		var tgen = $("#gen").val();
		var tm_num = $("#m_number").val();
		var tcity = $("#city").val();
		var tstate = $("#state").val();
		var te_mail = $("#e-mail").val();
		$("#f_name").val("");
		$("#gen").val("");
		$("#m_number").val("");
		$("#city").val("");
		$("#state").val("");
		$("#e-mail").val("");
		var url = "save.php?name="+ tf_name +"&gen=" + tgen + "&mob=" 
				+ tm_num + "&city=" + tcity + "&state=" + tstate + "&email=" + te_mail ;
		if(window.XMLHttpRequest)
		{
			req = new XMLHttpRequest();
		}
		else if (window.ActiveXObject)
		{
			req = new ActiveXObject("Microsoft.XMLHTTP");
		}
		else
		{
			alert("Ajax Not supported!");
		}
		function meth()
		{
			if(req.readyState == 4)
			{
				$("#message").html(req.responseText);
			}
		}
		req.onreadystatechange = meth;
		req.open("GET",url,true);
		req.send(null);	
	});
</script>
</html>			