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
						<label>商品编号:</label>
						<input v-model="shangpinbianhao" type="text" name="" placeholder="请输入商品编号">
					</div>
					<div class="input-wrapper">
						<label>游戏分类:</label>
						<input v-model="youxifenlei" type="text" name="" placeholder="请输入游戏分类">
					</div>
					<div class="input-wrapper">
						<label>卖家账号:</label>
						<input v-model="maijiazhanghao" type="text" name="" placeholder="请输入卖家账号">
					</div>
					<div class="input-wrapper">
						<label>用户名:</label>
						<input v-model="yonghuming" type="text" name="" placeholder="请输入用户名">
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
					"shangpinbianhao": "",
					"youxifenlei": "",
					"maijiazhanghao": "",
					"yonghuming": "",
				},
				methods: {
					userRegister(){
						var data = {
							"shangpinbianhao": this.shangpinbianhao,
							"youxifenlei": this.youxifenlei,
							"maijiazhanghao": this.maijiazhanghao,
							"yonghuming": this.yonghuming,
						}
						register('sixinliaotianhuifu', data, function(res){
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
