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
			NUMBER : ${mv.studentId}</h4>
		<h4 style="margin-left: 25%; margin-right: auto;">STUDENT NAME :
			${mv.personName}</h4>
		<h4 style="margin-left: 25%; margin-right: auto;">PROGRAMME :
			BACHELOR OF TECHNOLOGY
		<h4 style="margin-left: 25%; margin-right: auto;">PROGRAMME :
			COMPUTER SCIENCE AND ENGINEERING
		<h4 style="margin-left: 25%; margin-right: auto;color:green;">STATUS :
			${mv.status}</h4>


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
			<td>MATHS I</td>
			<td>${mv.maths}</td>
			<td>${mv.status}</td>
		</tr>
		<tr>
			<td>B17BS1103</td>
			<td>EDC</td>
			<td>${mv.edc}</td>
			<td>${mv.status}</td>
		</tr>
		<tr>
			<td>B17BS1106</td>
			<td>DSP</td>
			<td>${mv.dsp}</td>
			<td>${mv.status}</td>
		</tr>
		<tr>
			<td>B17BS1107</td>
			<td>JAVA</td>
			<td>${mv.java}</td>
			<td>${mv.status}</td>
		</tr>
		<tr>
			<td>B17BS1115</td>
			<td>VLSI</td>
			<td>${mv.vlsi}</td>
			<td>${mv.status}</td>
		</tr>
		<tr>
			<td>B17BS1116</td>
			<td>ENLISH</td>
			<td>${mv.english}</td>
			<td>${mv.status}</td>
		</tr>

		<tr >
			<td>
			<td>
			<th>SGPA :</th>
			<th>${mv.sgpa}</th>
		</tr>

		<tr>
			<td>
			<td>
			<th>CGPA :</th>
			<th>${mv.cgpa}</th>
		</tr>

	</table>

</body>
</html>