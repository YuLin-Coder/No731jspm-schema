<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!doctype html>
<html class="no-js" lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="x-ua-compatible" content="ie=edge">
<title>boo02</title>
<meta name="description" content="">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="shortcut icon" type="image/x-icon" href="../../assetsimages/x-icon/agricul.png">
<link rel="stylesheet" href="../../assets/css/relys/animate.css">
<link rel="stylesheet" href="../../assets/css/relys/bootstrap.min.css">
<link rel="stylesheet" href="../../assets/css/relys/all.min.css">
<link rel="stylesheet" href="../../assets/css/relys/icofont.min.css">
<link rel="stylesheet" href="../../assets/css/relys/lightcase.css">
<link rel="stylesheet" href="../../assets/css/relys/swiper.min.css">
<link rel="stylesheet" href="../../assets/css/relys/style.css">
<!--
<link rel="stylesheet" href="http://code.jquery.com/ui/1.10.4/themes/smoothness/jquery-ui.css">
-->
<link rel="stylesheet" href="../../layui/css/layui.css">
<style type="text/css">
	.layui-form-label{
		width: 100px;
	}
	.form-box{
		padding-top: 90px;
		padding-bottom: 20px;
		width: 100%;
		background-color: #f8f8f8;
		display: flex;
		justify-content: center;
		align-items: center;
	}
	.form-box .form-content{
		width: 80%;
		height: auto;
		background: #FFF;
		padding: 40px 10%;
		position: relative;
		box-sizing: border-box;
	}
	.form-box .form-content .close-btn{
		position: absolute;
		width: auto!important;
		padding: 10px;
		background: #CCCCCC!important;
		color: #444;
		top: 40px;
		right: 10%;
	}
	.form-box .form-content .close-btn:hover{
		width: auto!important;
		padding: 10px;
		background: #CCCCCC!important;
	}
	.form-box .form-content h3{
		width: 100%;
		text-align: center;
		margin-bottom: 40px;
	}
	.form-box .form-content .input-item{
		margin-bottom: 20px;
		display: flex;
	}
	.form-box .form-content .input-item input{
		height: 50px;
		line-height: 50px;
		flex: 1;
	}
	.form-box .form-content .input-item .input-name{
		padding: 0;
		width: 100px;
		height: 50px;
		line-height: 50px;
	}
	.form-box .form-content .input-item img{
		width: 150px;
		height: 150px;
		border-radius: 10px;
		margin-left: 20px;
		object-fit: cover;
	}
	.form-box .form-content button{
		background: #FE4847;
		color: #fff;
		border: 0;
		width: 100%;
	}
	.form-box .form-content button:hover {
		background: #292929;
		color: #fff;
	}
	.layui-upload-img{
		width: 100px;
		height: 100px;
		object-fit: cover;
	}
</style>
</head>
<body>
<div id="app">
	<div class="form-box layui-form" lay-filter="layform">
		<div class="form-control form-content">
			<h3>英雄联盟私信填写</h3>
			<div>
				<div class="layui-form-item">
					<label class="layui-form-label">卖家账号</label>
					<div class="layui-input-block">
						<input v-model="detail.maijiazhanghao" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入卖家账号" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">卖家姓名</label>
					<div class="layui-input-block">
						<input v-model="detail.maijiaxingming" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入卖家姓名" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">商品编号</label>
					<div class="layui-input-block">
						<input v-model="detail.shangpinbianhao" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入商品编号" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">账号标题</label>
					<div class="layui-input-block">
						<input v-model="detail.zhanghaobiaoti" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入账号标题" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">账号价格</label>
					<div class="layui-input-block">
						<input v-model="detail.zhanghaojiage" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入账号价格" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">用户名</label>
					<div class="layui-input-block">
						<input v-model="detail.yonghuming" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入用户名" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">姓名</label>
					<div class="layui-input-block">
						<input v-model="detail.xingming" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入姓名" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">私信时间</label>
					<div class="layui-input-block">
						<input type="text" name="" placeholder="请输入私信时间" autocomplete="off" class="layui-input" id="sixinshijian">
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">私信内容</label>
					<div class="layui-input-block">
						<textarea v-model="detail.sixinneirong" placeholder="请输入私信内容" class="layui-textarea"></textarea>
					</div>
				</div>
			</div>
			<button style="margin-bottom: 20px;" type="button" class="btn btn-default" @click="onConfirmTap">提交</button>
		</div>
	</div>
</div>
<script src="../../assets/js/relys/jquery.js"></script>
<script src="../../assets/js/relys/vue.min.js"></script>
<script src="../../assets/js/api/api.js"></script>
<script src="../../assets/js/api/tplist.js"></script>
<script src="../../assets/js/api/defaultuser.js"></script>
<script src="../../assets/js/relys/utils.js"></script>
<script src="../../assets/js/relys/storage.js"></script>
<script src="../../layui/layui.js"></script>
<script src="../../assets/js/validate.js"></script>
<script type="text/javascript" src="http://webapi.amap.com/maps?v=1.3&key=ca04cee7ac952691aa67a131e6f0cee0"></script>
<script type="text/javascript" src="../../assets/js/relys/bootstrap.AMapPositionPicker.js"></script>
<div id="script"></div>
<script type="text/javascript">
	var app = new Vue({
		el: "#app",
		data: {
			crosstable: "",
			crosstableobj: {},
			detail: {
				maijiazhanghao: "",
				maijiaxingming: "",
				shangpinbianhao: "",
				zhanghaobiaoti: "",
				zhanghaojiage: "",
				yonghuming: "",
				xingming: "",
				sixinneirong: "",
				sixinshijian: "",
			},
		},
		computed: {
		},
		updated() {
		},
		async created() {
			var id = getParam('id')
			var tablename = getParam('tablename')
			this.crosstable = tablename
			if(tablename){
				var cross = JSON.parse(localStorage.getItem("crossObj"))
				this.crosstableobj = cross
				for(var key in cross){
					if("maijiazhanghao" == key){
						this.detail[key] = cross[key]
					}
					if("maijiaxingming" == key){
						this.detail[key] = cross[key]
					}
					if("shangpinbianhao" == key){
						this.detail[key] = cross[key]
					}
					if("zhanghaobiaoti" == key){
						this.detail[key] = cross[key]
					}
					if("zhanghaojiage" == key){
						this.detail[key] = cross[key]
					}
					if("yonghuming" == key){
						this.detail[key] = cross[key]
					}
					if("xingming" == key){
						this.detail[key] = cross[key]
					}
					if("sixinneirong" == key){
						this.detail[key] = cross[key]
					}
					if("sixinshijian" == key){
						this.detail[key] = cross[key]
					}
				}
			}else if(id){
				await this.getDetail(id, tablename)
			}
			
			// 获取用户信息
			var user = localStorage.getItem("sessionTable")
			session(`${user}`, (data)=>{
				if (data && data.code === 0) {
					var json = data.data;
					this.detail.yonghuming = json.yonghuming
					this.detail.xingming = json.xingming
				}
			})

		},
		methods: {
			onPageTap(url) {
				window.location.href = url
			},
			updateTap(tablename, data){
				return new Promise((resolve) => {
					updateFun(tablename, data, (res) => {
						if(res&&res.code==0){
							console.log("更新成功")
							resolve(res)
						}
					})
				})
				
			},
			onConfirmTap(){
				addFun("yingxionglianmengsixin", this.detail, (res) => {
					if(res&&res.code==0){
						alert("提交成功")
						window.history.go(-1)
					}
				})
			},
			getDetail(tablename, id) {
				return new Promise((resolve) => {
				goodsInfo(tablename, id, (res) => {
					this.detail = res.data
					resolve(res)
				})
				})
			}
		}
	})
 	$(function(){








		layui.use('laydate', function(){
			var laydate = layui.laydate;
			//日期时间选择器
			laydate.render({ 
				elem: '#sixinshijian',
				type: 'datetime',
				done: function(value, date, endDate){
					console.log(value); //得到日期生成的值，如：2017-08-18
					app.detail.sixinshijian = value
					}
			});
		});

		layui.use(['form','layedit'], function(){
			var form = layui.form,
				layedit = layui.layedit,
				$ = layui.jquery,
				layer = layui.layer;
				
		});
	});
</script>
</body>
</html>
