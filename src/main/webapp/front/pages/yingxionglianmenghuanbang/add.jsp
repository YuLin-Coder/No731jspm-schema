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
			<h3>英雄联盟换绑填写</h3>
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
					<label class="layui-form-label">平台保障</label>
					<div class="layui-input-block">
						<input v-model="detail.pingtaibaozhang" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入平台保障" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">实付金额</label>
					<div class="layui-input-block">
						<input v-model="detail.shifujine" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入实付金额" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">网络大区</label>
					<div class="layui-input-block">
						<input v-model="detail.wangluodaqu" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入网络大区" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">游戏区服</label>
					<div class="layui-input-block">
						<input v-model="detail.youxiqufu" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入游戏区服" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">登录账号</label>
					<div class="layui-input-block">
						<input v-model="detail.dengluzhanghao" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入登录账号" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">登录密码</label>
					<div class="layui-input-block">
						<input v-model="detail.denglumima" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入登录密码" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">绑定手机</label>
					<div class="layui-input-block">
						<input v-model="detail.bangdingshouji" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入绑定手机" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">换绑手机</label>
					<div class="layui-input-block">
						<input v-model="detail.huanbangshouji" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入换绑手机" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">换绑截图</label>
					<div class="layui-input-block">
						<button type="button" class="layui-btn" id="huanbangjietuupload-img" v-if="!detail.huanbangjietu">上传图片</button>
						<div class="layui-upload-list" v-if="detail.huanbangjietu">
							<img class="layui-upload-img" id="huanbangjietuimg-temp" :src="detail.huanbangjietu?detail.huanbangjietu.split(',')[0]:''">
							<p id="demoText"></p>
						</div>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">换绑时间</label>
					<div class="layui-input-block">
						<input type="text" name="" placeholder="请输入换绑时间" autocomplete="off" class="layui-input" id="huanbangshijian">
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
				yonghuming: "",
				xingming: "",
				shangpinbianhao: "",
				zhanghaobiaoti: "",
				pingtaibaozhang: "",
				shifujine: "",
				wangluodaqu: "",
				youxiqufu: "",
				dengluzhanghao: "",
				denglumima: "",
				bangdingshouji: "",
				huanbangshouji: "",
				huanbangjietu: "",
				huanbangshijian: "",
				sfsh: "",
				shhf: "",
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
					if("yonghuming" == key){
						this.detail[key] = cross[key]
					}
					if("xingming" == key){
						this.detail[key] = cross[key]
					}
					if("shangpinbianhao" == key){
						this.detail[key] = cross[key]
					}
					if("zhanghaobiaoti" == key){
						this.detail[key] = cross[key]
					}
					if("pingtaibaozhang" == key){
						this.detail[key] = cross[key]
					}
					if("shifujine" == key){
						this.detail[key] = cross[key]
					}
					if("wangluodaqu" == key){
						this.detail[key] = cross[key]
					}
					if("youxiqufu" == key){
						this.detail[key] = cross[key]
					}
					if("dengluzhanghao" == key){
						this.detail[key] = cross[key]
					}
					if("denglumima" == key){
						this.detail[key] = cross[key]
					}
					if("bangdingshouji" == key){
						this.detail[key] = cross[key]
					}
					if("huanbangshouji" == key){
						this.detail[key] = cross[key]
					}
					if("huanbangjietu" == key){
						this.detail[key] = cross[key]
					}
					if("huanbangshijian" == key){
						this.detail[key] = cross[key]
					}
					if("sfsh" == key){
						this.detail[key] = cross[key]
					}
					if("shhf" == key){
						this.detail[key] = cross[key]
					}
				}
			}else if(id){
				await this.getDetail(id, tablename)
			}
			

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
			if(!isIntNumer(this.detail.dengluzhanghao)){
				alert(`登录账号应输入整数`);
				return
			}
			if(!isMobile(this.detail.bangdingshouji)){
				alert(`绑定手机应输入电话格式`);
				return
			}
			if(!isMobile(this.detail.huanbangshouji)){
				alert(`换绑手机应输入电话格式`);
				return
			}
				addFun("yingxionglianmenghuanbang", this.detail, (res) => {
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















		layui.use('upload', function(){
			var $ = layui.jquery
			,upload = layui.upload;
			//普通图片上传
			var uploadInst = upload.render({
				elem: '#huanbangjietuupload-img'
				,url: baseurl+"file/upload" //改成您自己的上传接口
				,headers: {
					Token: getStorage("Token")
				}
				,before: function(obj){
					//预读本地文件示例，不支持ie8
					obj.preview(function(index, file, result){
					$('#huanbangjietuimg-temp').attr('src', result); //图片链接（base64）
					});
				}
				,done: function(res){
					//如果上传失败
					if(res.code > 0){
					return layer.msg('上传失败');
					}else{
						app.detail.huanbangjietu = baseurl+"/upload/"+res.file
						return layer.msg('上传成功');
					}
					//上传成功
				}
			})
		});
		layui.use('laydate', function(){
			var laydate = layui.laydate;
			//日期时间选择器
			laydate.render({ 
				elem: '#huanbangshijian',
				type: 'datetime',
				done: function(value, date, endDate){
					console.log(value); //得到日期生成的值，如：2017-08-18
					app.detail.huanbangshijian = value
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
