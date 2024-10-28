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
						<label>密码:</label>
						<input v-model="mima" type="text" name="" placeholder="请输入密码">
					</div>
					<div class="input-wrapper">
						<label>卖家姓名:</label>
						<input v-model="maijiaxingming" type="text" name="" placeholder="请输入卖家姓名">
					</div>
					<div class="input-wrapper">
						<label>qq账号:</label>
						<input v-model="qqzhanghao" type="text" name="" placeholder="请输入qq账号">
					</div>
					<div class="input-wrapper">
						<label>联系电话:</label>
						<input v-model="lianxidianhua" type="text" name="" placeholder="请输入联系电话">
					</div>
					<div class="input-wrapper">
						<label>电子邮箱:</label>
						<input v-model="dianziyouxiang" type="text" name="" placeholder="请输入电子邮箱">
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
					"maijiazhanghao": "",
					"mima": "",
					"maijiaxingming": "",
					"qqzhanghao": "",
					"lianxidianhua": "",
					"dianziyouxiang": "",
					"shenfenzhenghao": "",
					"jiatingdizhi": "",
				},
				methods: {
					userRegister(){
					if(!isIntNumer(this.qqzhanghao)){
						alert(`qq账号应输入整数`);
						return
					}
					if(!isMobile(this.lianxidianhua)){
						alert(`联系电话应输入电话格式`);
						return
					}
					if(!isEmail(this.dianziyouxiang)){
						alert(`电子邮箱应输入邮件格式`);
						return
					}
					if(!checkIdCard(this.shenfenzhenghao)){
						alert(`身份证号应输入身份证格式`);
						return
					}
						var data = {
							"maijiazhanghao": this.maijiazhanghao,
							"mima": this.mima,
							"maijiaxingming": this.maijiaxingming,
							"qqzhanghao": this.qqzhanghao,
							"lianxidianhua": this.lianxidianhua,
							"dianziyouxiang": this.dianziyouxiang,
							"shenfenzhenghao": this.shenfenzhenghao,
							"jiatingdizhi": this.jiatingdizhi,
						}
						register('maijia', data, function(res){
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
