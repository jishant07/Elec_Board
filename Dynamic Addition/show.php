<?php 
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "test";
$conn = new mysqli($servername, $username, $password, $dbname);
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}
$sql = "SELECT * FROM vol_data ORDER BY id desc";
$result = $conn->query($sql);

if ($result->num_rows > 0) 
{
    while($row = $result->fetch_assoc())
    {
        echo "<li>" . "Name: " . $row["full_name"]. " " ."Gender : " . $row["gender"] . "</li> ";
    }
} else {
    echo "\n0 results";
}
 ?>