<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<title>注册</title>
		<link rel="stylesheet" href="../../assets/css/relys/login.css">
	</head>
	<body>
		<div class="container" id="app">
			<div class="loginBox">
				<h3>注册</h3>
				<form id="loginForm">
					<div class="input-wrapper">
						<label>卖家账号:</label>
						<input v-model="maijiazhanghao" type="text" name="" placeholder="请输入卖家账号">
					</div>
					<div class="input-wrapper">
						<label>卖家姓名:</label>
						<input v-model="maijiaxingming" type="text" name="" placeholder="请输入卖家姓名">
					</div>
					<div class="input-wrapper">
						<label>用户名:</label>
						<input v-model="yonghuming" type="text" name="" placeholder="请输入用户名">
					</div>
					<div class="input-wrapper">
						<label>姓名:</label>
						<input v-model="xingming" type="text" name="" placeholder="请输入姓名">
					</div>
					<div class="input-wrapper">
						<label>商品编号:</label>
						<input v-model="shangpinbianhao" type="text" name="" placeholder="请输入商品编号">
					</div>
					<div class="input-wrapper">
						<label>账号标题:</label>
						<input v-model="zhanghaobiaoti" type="text" name="" placeholder="请输入账号标题">
					</div>
					<div class="input-wrapper">
						<label>平台保障:</label>
						<input v-model="pingtaibaozhang" type="text" name="" placeholder="请输入平台保障">
					</div>
					<div class="input-wrapper">
						<label>实付金额:</label>
						<input v-model="shifujine" type="text" name="" placeholder="请输入实付金额">
					</div>
					<div class="input-wrapper">
						<label>购买日期:</label>
						<input v-model="goumairiqi" type="text" name="" placeholder="请输入购买日期">
					</div>
				</form>
				<a href="../login/login.jsp">已有账号？去登录</a>
				<button type="button" @click="userRegister">注册</button>
			</div>
		</div>
		<script src="../../assets/js/relys/jquery.js"></script>
		<script src="../../assets/js/relys/vue.js"></script>
		<script src="../../assets/js/api/api.js"></script>
		<script src="../../assets/js/api/defaultuser.js"></script>
			<script src="../../assets/js/validate.js"></script>
		<script type="text/javascript">
			var app = new Vue({
				el: "#app",
				data: {
					"maijiazhanghao": "",
					"maijiaxingming": "",
					"yonghuming": "",
					"xingming": "",
					"shangpinbianhao": "",
					"zhanghaobiaoti": "",
					"pingtaibaozhang": "",
					"shifujine": "",
					"goumairiqi": "",
				},
				methods: {
					userRegister(){
						var data = {
							"maijiazhanghao": this.maijiazhanghao,
							"maijiaxingming": this.maijiaxingming,
							"yonghuming": this.yonghuming,
							"xingming": this.xingming,
							"shangpinbianhao": this.shangpinbianhao,
							"zhanghaobiaoti": this.zhanghaobiaoti,
							"pingtaibaozhang": this.pingtaibaozhang,
							"shifujine": this.shifujine,
							"goumairiqi": this.goumairiqi,
						}
						register('dixiachengzhanghaoshensu', data, function(res){
							if(res.code==0){
								alert('注册成功')
								window.parent.location.href = '../login/login.jsp'
							}
						})
					}
				}
			})
		</script>
	</body>
</html>
