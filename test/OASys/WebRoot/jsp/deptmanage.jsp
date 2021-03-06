<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'deptmanage.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" />
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
	<link rel="stylesheet" type="text/css" href="css/common/box.css" />
	<link rel="stylesheet" type="text/css" href="css/common/checkbox.css" />
	<style type="text/css">
	#thismodal .modal-dialog {
		width: 500px;
		top:20%;
	}
	
	#thismodal .modal-body .icon {
		height: 80px;
		width: 80px;
		margin: 20px auto;
		border-radius: 50%;
		color: #aad6aa;
		border: 3px solid #d9ead9;
		text-align: center;
		font-size: 44px;
	}
	
	#thismodal .modal-body .icon .glyphicon {
		font-size: 46px;
		top: 14px;
	}
	
	#thismodal .modal-p {
		margin: 20px auto;
	}
	
	#thismodal .modal-body .modal-p h2 {
		text-align: center;
	}
	
	#thismodal .modal-body .modal-p p {
		text-align: center;
		color: #666;
		font-size: 16px;
		padding-top: 8px;
		font-weight: 300;
	}
	
	#thismodal .modal-p .btn {
		margin-left: 40%;
		width: 100px;
		height: 40px;
	}
	
	#thismodal .modal-error .icon {
		color: #f27474;
		border: 3px solid #f27474;
	}
	</style>

  </head>
  
  <body>
    


<div class="modal fade in" id="thismodal" data-backdrop="static">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-body modal-success" style="display: none;">
				<div class="icon">
					<span class="glyphicon glyphicon-ok"></span>
				</div>
				<div class="modal-p">
					<h2>操作成功</h2>
					<!--<p style="">已回复</p>-->
					<div class="modal-p">
						<button type="button" class="btn btn-primary successToUrl" data-dismiss="modal">确定</button>
					</div>
				</div>
			</div>
			<div class="modal-body modal-error" style="display: none;">
				<div class="icon">
					<span class="glyphicon glyphicon-remove"></span>
				</div>
				<div class="modal-p">
					<h2 style="text-align: center;">错误信息</h2>
					<p class="modal-error-mess">此处将显示弹出框的错误提示信息</p>
					<div class="modal-p">
						<button type="button" class="btn btn-primary" data-dismiss="modal">确定</button>
					</div>
				</div>
			</div>

		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>

<!-- /.modal -->
<script type="text/javascript" src="js/modalTip.js" ></script>


<!-- 这里是执行返回失败的参数，并显示详细的信息； -->
<style type="text/css">
a {
	color: black;
}

a:hover {
	text-decoration: none;
}

.bgc-w {
	background-color: #fff;
}
</style>
<div class="row" style="padding-top: 10px;">
	<div class="col-md-2">
		<h1 style="font-size: 24px; margin: 0;" class="">部门管理</h1>
	</div>
	<div class="col-md-10 text-right">
		<a href="##"><span class="glyphicon glyphicon-home"></span> 首页</a> > <a
			disabled="disabled">部门管理</a>
	</div>
</div>
<div class="row" style="padding-top: 15px;">
	<div class="col-md-12">
		<!--id="container"-->
		<div class="bgc-w box box-primary">
			<!--盒子头-->
			<div class="box-header">
				<h3 class="box-title">
					<a href="jsp/deptadd.jsp" class="label label-success" style="padding: 5px;">
						<span class="glyphicon glyphicon-plus"></span> 新增
					</a>
				</h3>
				<!-- <div class="box-tools">
					<div class="input-group" style="width: 150px;">
						<input type="text" class="form-control input-sm"
							placeholder="查找..." />
						<div class="input-group-btn">
							<a class="btn btn-sm btn-default"><span
								class="glyphicon glyphicon-search"></span></a>
						</div>
					</div>
				</div> -->
			</div>
			<!--盒子身体-->
			<div class="box-body no-padding">
				<div class="table-responsive">
					<table class="table table-hover table-striped">
						<tr>
							<th scope="col">名称</th>
							<th scope="col">电话</th>
							<th scope="col">邮箱</th>
							<th scope="col">地址</th>
							<th scope="col">操作</th>
						</tr>
						<c:forEach items="${deptList}" var="dept">
							<tr>
								<td><span>${dept.deptName}</span></td>
								<td><span>${dept.deptTel}</span></td>
								<td><span>${dept.email}</span></td>
								<td><span>${dept.deptAddr}</span></td>
								<td>
									<a href="deptController/findById.action?id=${dept.deptId}" class="label xiugai">
									<span class="glyphicon glyphicon-edit"></span> 修改</a> 
									<a href="userController/findByIdList.action?id=${dept.deptId}&manager=${dept.deptmanager}&name=${dept.deptName}" class="label xiugai">
										<span class="glyphicon glyphicon-search"></span> 人事调动
									</a>
									<a href="jsp/deptread.jsp?deptid=1" class="label shanchu"><span
										class="glyphicon glyphicon-remove"></span> 删除</a></td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</div>

  </body>
</html>
