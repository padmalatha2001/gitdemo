<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<style>
body {
	background-image:url('one.jpg');
	background-size:cover;

}
table, th, td {
	border: 1px solid rgb(12, 218, 232);
	text-align: center; body { background-image : url('one.png');
	background-size: cover;
}
}
</style>
<body>
	<br>
	<br>
	<br>
	<br>
	<!-- <body style="background-color:rgb(247, 239, 220);"> -->

	<h2 style="text-align: center">Welcome to Result Portal</h2>
	<h4 style="text-align: center">SAGI RAMA KRISHNAM RAJU ENGINEERING
		COLLEGE</h4>
	<br>
	<div>
		<h4 style="margin-left: 25%; margin-right: auto;">REGISTRATION
			NUMBER : ${student.regno}</h4>
		<h4 style="margin-left: 25%; margin-right: auto;">STUDENT NAME :
			${student.studentname}</h4>
		<h4 style="margin-left: 25%; margin-right: auto;">PROGRAMME :
			${student.programme} < ${student.branch} ></h4>
		<h4 style="margin-left: 25%; margin-right: auto;color:green;">STATUS :
			${student.resultdetails.resultstatus}</h4>


	</div>

	<table style="width: 50%; margin-left: auto; margin-right: auto;">
		<tr>
			<th>Subject Code</th>
			<th>Subject Name</th>
			<th>Grade</th>
			<th>Status</th>
		</tr>
		<tr>
			<td>B17BS1102</td>
			<td>Maths I</td>
			<td>${student.resultdetails.maths1}</td>
			<td>${student.resultdetails.resultstatus}</td>
		</tr>
		<tr>
			<td>B17BS1103</td>
			<td>Maths II</td>
			<td>${student.resultdetails.maths2}</td>
			<td>${student.resultdetails.resultstatus}</td>
		</tr>
		<tr>
			<td>B17BS1106</td>
			<td>Operating Systems</td>
			<td>${student.resultdetails.operatingsystems}</td>
			<td>${student.resultdetails.resultstatus}</td>
		</tr>
		<tr>
			<td>B17BS1107</td>
			<td>Data Structures</td>
			<td>${student.resultdetails.datastructures}</td>
			<td>${student.resultdetails.resultstatus}</td>
		</tr>
		<tr>
			<td>B17BS1115</td>
			<td>Personality Development</td>
			<td>${student.resultdetails.personalitydevelopment}</td>
			<td>${student.resultdetails.resultstatus}</td>
		</tr>

		<tr >
			<td>
			<td>
			<th>SGPA :</th>
			<th>${student.resultdetails.sgpa}</th>
		</tr>

		<tr>
			<td>
			<td>
			<th>CGPA :</th>
			<th>${student.resultdetails.cgpa}</th>
		</tr>

	</table>

</body>
</html>