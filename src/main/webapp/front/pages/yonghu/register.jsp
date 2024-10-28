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
						<label>用户名:</label>
						<input v-model="yonghuming" type="text" name="" placeholder="请输入用户名">
					</div>
					<div class="input-wrapper">
						<label>密码:</label>
						<input v-model="mima" type="text" name="" placeholder="请输入密码">
					</div>
					<div class="input-wrapper">
						<label>姓名:</label>
						<input v-model="xingming" type="text" name="" placeholder="请输入姓名">
					</div>
					<div class="input-wrapper">
						<label>年龄:</label>
						<input v-model="nianling" type="text" name="" placeholder="请输入年龄">
					</div>
					<div class="input-wrapper">
						<label>qq账号:</label>
						<input v-model="qqzhanghao" type="text" name="" placeholder="请输入qq账号">
					</div>
					<div class="input-wrapper">
						<label>电话号码:</label>
						<input v-model="dianhuahaoma" type="text" name="" placeholder="请输入电话号码">
					</div>
					<div class="input-wrapper">
						<label>邮箱号码:</label>
						<input v-model="youxianghaoma" type="text" name="" placeholder="请输入邮箱号码">
					</div>
					<div class="input-wrapper">
						<label>身份证号:</label>
						<input v-model="shenfenzhenghao" type="text" name="" placeholder="请输入身份证号">
					</div>
					<div class="input-wrapper">
						<label>家庭地址:</label>
						<input v-model="jiatingdizhi" type="text" name="" placeholder="请输入家庭地址">
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
					"yonghuming": "",
					"mima": "",
					"xingming": "",
					"nianling": "",
					"qqzhanghao": "",
					"dianhuahaoma": "",
					"youxianghaoma": "",
					"shenfenzhenghao": "",
					"jiatingdizhi": "",
				},
				methods: {
					userRegister(){
					if(!isIntNumer(this.nianling)){
						alert(`年龄应输入整数`);
						return
					}
					if(!isIntNumer(this.qqzhanghao)){
						alert(`qq账号应输入整数`);
						return
					}
					if(!isMobile(this.dianhuahaoma)){
						alert(`电话号码应输入电话格式`);
						return
					}
					if(!isEmail(this.youxianghaoma)){
						alert(`邮箱号码应输入邮件格式`);
						return
					}
					if(!checkIdCard(this.shenfenzhenghao)){
						alert(`身份证号应输入身份证格式`);
						return
					}
						var data = {
							"yonghuming": this.yonghuming,
							"mima": this.mima,
							"xingming": this.xingming,
							"nianling": this.nianling,
							"qqzhanghao": this.qqzhanghao,
							"dianhuahaoma": this.dianhuahaoma,
							"youxianghaoma": this.youxianghaoma,
							"shenfenzhenghao": this.shenfenzhenghao,
							"jiatingdizhi": this.jiatingdizhi,
						}
						register('yonghu', data, function(res){
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
