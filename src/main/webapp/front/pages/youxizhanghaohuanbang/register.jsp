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
						<label>游戏分类:</label>
						<input v-model="youxifenlei" type="text" name="" placeholder="请输入游戏分类">
					</div>
					<div class="input-wrapper">
						<label>游戏区服:</label>
						<input v-model="youxiqufu" type="text" name="" placeholder="请输入游戏区服">
					</div>
					<div class="input-wrapper">
						<label>登录账号:</label>
						<input v-model="dengluzhanghao" type="text" name="" placeholder="请输入登录账号">
					</div>
					<div class="input-wrapper">
						<label>登录密码:</label>
						<input v-model="denglumima" type="text" name="" placeholder="请输入登录密码">
					</div>
					<div class="input-wrapper">
						<label>绑定手机:</label>
						<input v-model="bangdingshouji" type="text" name="" placeholder="请输入绑定手机">
					</div>
					<div class="input-wrapper">
						<label>换绑手机:</label>
						<input v-model="huanbangshouji" type="text" name="" placeholder="请输入换绑手机">
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
					"youxifenlei": "",
					"youxiqufu": "",
					"dengluzhanghao": "",
					"denglumima": "",
					"bangdingshouji": "",
					"huanbangshouji": "",
				},
				methods: {
					userRegister(){
					if(!isMobile(this.bangdingshouji)){
						alert(`绑定手机应输入电话格式`);
						return
					}
					if(!isMobile(this.huanbangshouji)){
						alert(`换绑手机应输入电话格式`);
						return
					}
						var data = {
							"maijiazhanghao": this.maijiazhanghao,
							"maijiaxingming": this.maijiaxingming,
							"yonghuming": this.yonghuming,
							"xingming": this.xingming,
							"shangpinbianhao": this.shangpinbianhao,
							"zhanghaobiaoti": this.zhanghaobiaoti,
							"pingtaibaozhang": this.pingtaibaozhang,
							"shifujine": this.shifujine,
							"youxifenlei": this.youxifenlei,
							"youxiqufu": this.youxiqufu,
							"dengluzhanghao": this.dengluzhanghao,
							"denglumima": this.denglumima,
							"bangdingshouji": this.bangdingshouji,
							"huanbangshouji": this.huanbangshouji,
						}
						register('youxizhanghaohuanbang', data, function(res){
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
