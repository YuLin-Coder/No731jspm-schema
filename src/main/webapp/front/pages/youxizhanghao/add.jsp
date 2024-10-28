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
			<h3>游戏账号填写</h3>
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
						<input v-model="detail.shangpinbianhao" type="text" name="" placeholder="请输入商品编号" autocomplete="off" class="layui-input" readonly="readonly">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">账号标题</label>
					<div class="layui-input-block">
						<input v-model="detail.zhanghaobiaoti" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入账号标题" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择游戏厂商</label>
					<div class="layui-input-block">
						<select id="youxichangshang" name="interest" lay-filter="youxichangshang">
							<option :value="item" v-for="(item,index) in youxichangshangOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择游戏分类</label>
					<div class="layui-input-block">
						<select id="youxifenlei" name="interest" lay-filter="youxifenlei">
							<option :value="item" v-for="(item,index) in youxifenleiOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择网络大区</label>
					<div class="layui-input-block">
						<select id="wangluodaqu" name="interest" lay-filter="wangluodaqu">
							<option :value="item" v-for="(item,index) in wangluodaquOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">游戏区服</label>
					<div class="layui-input-block">
						<input v-model="detail.youxiqufu" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入游戏区服" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">角色等级</label>
					<div class="layui-input-block">
						<input v-model="detail.jiaosedengji" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入角色等级" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">当前段位</label>
					<div class="layui-input-block">
						<input v-model="detail.dangqianduanwei" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入当前段位" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">封面图片</label>
					<div class="layui-input-block">
						<button type="button" class="layui-btn" id="fengmiantupianupload-img" v-if="!detail.fengmiantupian">上传图片</button>
						<div class="layui-upload-list" v-if="detail.fengmiantupian">
							<img class="layui-upload-img" id="fengmiantupianimg-temp" :src="detail.fengmiantupian?detail.fengmiantupian.split(',')[0]:''">
							<p id="demoText"></p>
						</div>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">账号价格</label>
					<div class="layui-input-block">
						<input v-model="detail.zhanghaojiage" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入账号价格" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择价格区间</label>
					<div class="layui-input-block">
						<select name="interest" lay-filter="jiagequjian">
							<option :value="item" v-for="(item,index) in jiagequjianOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">手续费</label>
					<div class="layui-input-block">
						<input v-model="detail.shouxufei" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入手续费" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">平台保障</label>
					<div class="layui-input-block">
						<input v-model="detail.pingtaibaozhang" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入平台保障" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">发布日期</label>
					<div class="layui-input-block">
						<input type="text" name="" placeholder="请输入发布日期" autocomplete="off" class="layui-input" id="faburiqi">
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">账号简介</label>
					<div class="layui-input-block">
						<textarea v-model="detail.zhanghaojianjie" placeholder="请输入账号简介" class="layui-textarea"></textarea>
					</div>
				</div>
				<div class="layui-form-item layui-form-text">
					<label class="layui-form-label">账号详情</label>
					<div class="layui-input-block">
						<textarea id="text-editor"  style="display: none;"></textarea>
					</div>
				</div>
			</div>
			<button style="margin-bottom: 20px;" type="button" id="btn-confirm" class="btn btn-default">确定编辑</button>
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
				shangpinbianhao: (new Date()).getTime()+"",
				zhanghaobiaoti: "",
				youxichangshang: "",
				youxifenlei: "",
				wangluodaqu: "",
				youxiqufu: "",
				jiaosedengji: "",
				dangqianduanwei: "",
				fengmiantupian: "",
				zhanghaojiage: "",
				jiagequjian: "",
				shouxufei: "",
				pingtaibaozhang: "",
				zhanghaojianjie: "",
				faburiqi: "",
				zhanghaoxiangqing: "",
				thumbsupnum: "",
				crazilynum: "",
			},
			youxichangshangOptions: [],
			youxifenleiOptions: [],
			wangluodaquOptions: [],
			jiagequjianOptions: [],
		},
		computed: {
		},
		updated() {
			layui.form.render('select','layform');
			layui.form.render('select','layform');
			layui.form.render('select','layform');
			layui.form.render('select','layform');
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
					if("youxichangshang" == key){
						this.detail[key] = cross[key]
					}
					if("youxifenlei" == key){
						this.detail[key] = cross[key]
					}
					if("wangluodaqu" == key){
						this.detail[key] = cross[key]
					}
					if("youxiqufu" == key){
						this.detail[key] = cross[key]
					}
					if("jiaosedengji" == key){
						this.detail[key] = cross[key]
					}
					if("dangqianduanwei" == key){
						this.detail[key] = cross[key]
					}
					if("fengmiantupian" == key){
						this.detail[key] = cross[key]
					}
					if("zhanghaojiage" == key){
						this.detail[key] = cross[key]
					}
					if("jiagequjian" == key){
						this.detail[key] = cross[key]
					}
					if("shouxufei" == key){
						this.detail[key] = cross[key]
					}
					if("pingtaibaozhang" == key){
						this.detail[key] = cross[key]
					}
					if("zhanghaojianjie" == key){
						this.detail[key] = cross[key]
					}
					if("faburiqi" == key){
						this.detail[key] = cross[key]
					}
					if("zhanghaoxiangqing" == key){
						this.detail[key] = cross[key]
					}
					if("thumbsupnum" == key){
						this.detail[key] = cross[key]
					}
					if("crazilynum" == key){
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
					this.detail.maijiazhanghao = json.maijiazhanghao
					this.detail.maijiaxingming = json.maijiaxingming
				}
			})

			this.youxichangshangOptions = "腾讯,网易,盛大网络,完美世界,巨人网络,搜狐畅游,第九城市,联众世界,蓝洞,网龙,金山".split(',')
			getOption("youxileibie", "youxifenlei", (data) => {
				if (data && data.code === 0) {
					this.youxifenleiOptions = data.data;
					this.detail.youxifenlei = data.data[0]
				}
			})   

			this.wangluodaquOptions = "电信,网通,体验服,其他".split(',')
			getOption("shouxufeiyong", "jiagequjian", (data) => {
				if (data && data.code === 0) {
					this.jiagequjianOptions = data.data;
					this.detail.jiagequjian = data.data[0]
					getFollow("shouxufeiyong", "jiagequjian", this.detail.jiagequjian, (res) => {
						if(res.code==0){
							if(res.data.shouxufei){
								this.detail.shouxufei = res.data.shouxufei
							}
							if(res.data.pingtaibaozhang){
								this.detail.pingtaibaozhang = res.data.pingtaibaozhang
							}
						}
					})
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
			if(!isIntNumer(this.detail.zhanghaojiage)){
				alert(`账号价格应输入整数`);
				return
			}
				addFun("youxizhanghao", this.detail, (res) => {
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
				elem: '#fengmiantupianupload-img'
				,url: baseurl+"file/upload" //改成您自己的上传接口
				,headers: {
					Token: getStorage("Token")
				}
				,before: function(obj){
					//预读本地文件示例，不支持ie8
					obj.preview(function(index, file, result){
					$('#fengmiantupianimg-temp').attr('src', result); //图片链接（base64）
					});
				}
				,done: function(res){
					//如果上传失败
					if(res.code > 0){
					return layer.msg('上传失败');
					}else{
						app.detail.fengmiantupian = baseurl+"/upload/"+res.file
						return layer.msg('上传成功');
					}
					//上传成功
				}
			})
		});





		layui.use('laydate', function(){
			var laydate = layui.laydate;
			// 日期选择器
			laydate.render({
				elem: '#faburiqi',
				type: 'date',
				done: function(value, date, endDate){
					console.log(value); //得到日期生成的值，如：2017-08-18
					app.detail.faburiqi = value
					}
			});
		});




		layui.use('layedit', function(){
			var layedit = layui.layedit;
			layedit.set({
				uploadImage: {
				url: baseurl+"file/upload" //接口url
				,headers: {
					Token: getStorage("Token")
				}
				,type: 'post' //默认post
				}
			});
			var index = layedit.build('text-editor'); //建立编辑器
			$("#btn-confirm").on("click", function(){
				app.detail.zhanghaoxiangqing = layedit.getContent(index)
				alert("编辑成功")
			})
		});
		layui.use(['form','layedit'], function(){
			var form = layui.form,
				layedit = layui.layedit,
				$ = layui.jquery,
				layer = layui.layer;
				
			form.on('select(youxichangshang)', function(data){
				app.detail.youxichangshang = data.value
			});
			form.on('select(youxifenlei)', function(data){
				app.detail.youxifenlei = data.value
			});
			form.on('select(wangluodaqu)', function(data){
				app.detail.wangluodaqu = data.value
			});
			form.on('select(jiagequjian)', function(data){
				app.detail.jiagequjian = data.value
					getFollow("shouxufeiyong", "jiagequjian", app.detail.jiagequjian, (res) => {
						if(res.code==0){
							if(res.data.shouxufei){
								app.detail.shouxufei = res.data.shouxufei
							}
							if(res.data.pingtaibaozhang){
								app.detail.pingtaibaozhang = res.data.pingtaibaozhang
							}
						}
					})
			});
		});
	});
</script>
</body>
</html>
