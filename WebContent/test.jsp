<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="ccc" uri="http://ccc.cn/common/"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <a href="list">controller</a>
   
    <form action="${pageContext.request.contextPath }/list" method="get">
       <c:forEach items="${pages.rows}" var="row">
		    <tr>
				<td>${row.cust_id}</td>
				<td>${row.cust_name}</td>
				<td>${row.cust_source}</td>
				<td>${row.cust_industry}</td>
				<td>${row.cust_level}</td>
				<td>${row.cust_phone}</td>
				<td>${row.cust_mobile}</td>
			<td>
			<a href="#" class="btn btn-primary btn-xs" data-toggle="modal" data-target="#customerEditDialog" onclick="editCustomer(${row.cust_id})">修改</a>
			<a href="#" class="btn btn-danger btn-xs" onclick="deleteCustomer(${row.cust_id})">删除</a>
			</td>
	    </tr>
	</c:forEach>							
  </form>
</body>
</html>