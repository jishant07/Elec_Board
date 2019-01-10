<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";
$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) 
{
    die("Connection failed: " . $conn->connect_error);
}
$fname = $_GET['name'];
$gen = $_GET['gen'];
$mob = $_GET['mob'];
$city = $_GET['city'];
$state = $_GET['state'];
$email = $_GET['email'];
$sql1 = "INSERT INTO `vol_data`(`id`, `full_name`, `gender`, `city`, `state`, `email`, `m_number`) VALUES" . "(1890,`" . $fname . "`,`" . $gen . "`,`" . $city . "`,`" . $state . 
		"`,`" . $email . "`," . $mob . ");";
echo $sql1;
$result1 = $conn->query($sql1);
?>