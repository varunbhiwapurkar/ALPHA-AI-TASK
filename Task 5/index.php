<!DOCTYPE html>
<html>
<head>
	<title></title>
	<script
  src="https://code.jquery.com/jquery-3.6.0.js"
  integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk="
  crossorigin="anonymous"></script>
</head>
<body>

<div id="result"></div>



<script type="text/javascript">
	window.onload= function()
	 {
	 	var click_no = 0;
		window.onclick = function(e)
		{
			var evt =  window.event || e ;
			document.getElementById("result").innerHTML = " mouse position:( X: " + evt.clientX +
			                           ", Y :" + evt.clientY + ")";
			click_no++;
			$.ajax({
				url:"save.php",
				type: "POST",
				data:{
					click_no: click_no,
					x_cord: evt.clientX,
					y_cord: evt.clientY,
				}
			});
		}
	 }
console.log('1')
</script>
</body>
</html>