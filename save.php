<?php
	include 'database.php';
	$click_no=$_POST['click_no'];
	$x_cord=$_POST['x_cord'];
	$y_cord=$_POST['y_cord'];
	
	$sql = "INSERT INTO `activity`( `click_no`, `x_cord`, `y_cord`) 
	VALUES ('$click_no','$x_cord','$y_cord')";
	if (mysqli_query($conn, $sql)) {
		echo json_encode(array("statusCode"=>200));
	} 
	else {
		echo json_encode(array("statusCode"=>201));
	}
	mysqli_close($conn);
?>