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
			<h3>英雄联盟填写</h3>
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
					<label class="layui-form-label">请选择网络大区</label>
					<div class="layui-input-block">
						<select id="wangluodaqu" name="interest" lay-filter="wangluodaqu">
							<option :value="item" v-for="(item,index) in wangluodaquOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择游戏区服</label>
					<div class="layui-input-block">
						<select id="youxiqufu" name="interest" lay-filter="youxiqufu">
							<option :value="item" v-for="(item,index) in youxiqufuOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择其他</label>
					<div class="layui-input-block">
						<select id="qita" name="interest" lay-filter="qita">
							<option :value="item" v-for="(item,index) in qitaOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择限定皮肤</label>
					<div class="layui-input-block">
						<select id="xiandingpifu" name="interest" lay-filter="xiandingpifu">
							<option :value="item" v-for="(item,index) in xiandingpifuOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">游戏等级</label>
					<div class="layui-input-block">
						<input v-model="detail.youxidengji" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入游戏等级" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择最高段位</label>
					<div class="layui-input-block">
						<select id="zuigaoduanwei" name="interest" lay-filter="zuigaoduanwei">
							<option :value="item" v-for="(item,index) in zuigaoduanweiOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择当前段位</label>
					<div class="layui-input-block">
						<select id="dangqianduanwei" name="interest" lay-filter="dangqianduanwei">
							<option :value="item" v-for="(item,index) in dangqianduanweiOptions">{{item}}</option>
						</select>
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">英雄数量</label>
					<div class="layui-input-block">
						<input v-model="detail.yingxiongshuliang" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入英雄数量" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">皮肤数量</label>
					<div class="layui-input-block">
						<input v-model="detail.pifushuliang" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入皮肤数量" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">qq等级</label>
					<div class="layui-input-block">
						<input v-model="detail.qqdengji" type="text" name="title" lay-verify="title" autocomplete="off" placeholder="请输入qq等级" class="layui-input">
					</div>
				</div>
				<div class="layui-form-item">
					<label class="layui-form-label">请选择qq好友</label>
					<div class="layui-input-block">
						<select id="qqhaoyou" name="interest" lay-filter="qqhaoyou">
							<option :value="item" v-for="(item,index) in qqhaoyouOptions">{{item}}</option>
						</select>
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
				wangluodaqu: "",
				youxiqufu: "",
				qita: "",
				xiandingpifu: "",
				youxidengji: "",
				zuigaoduanwei: "",
				dangqianduanwei: "",
				yingxiongshuliang: "",
				pifushuliang: "",
				qqdengji: "",
				qqhaoyou: "",
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
			wangluodaquOptions: [],
			youxiqufuOptions: [],
			qitaOptions: [],
			xiandingpifuOptions: [],
			zuigaoduanweiOptions: [],
			dangqianduanweiOptions: [],
			qqhaoyouOptions: [],
			jiagequjianOptions: [],
		},
		computed: {
		},
		updated() {
			layui.form.render('select','layform');
			layui.form.render('select','layform');
			layui.form.render('select','layform');
			layui.form.render('select','layform');
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
					if("wangluodaqu" == key){
						this.detail[key] = cross[key]
					}
					if("youxiqufu" == key){
						this.detail[key] = cross[key]
					}
					if("qita" == key){
						this.detail[key] = cross[key]
					}
					if("xiandingpifu" == key){
						this.detail[key] = cross[key]
					}
					if("youxidengji" == key){
						this.detail[key] = cross[key]
					}
					if("zuigaoduanwei" == key){
						this.detail[key] = cross[key]
					}
					if("dangqianduanwei" == key){
						this.detail[key] = cross[key]
					}
					if("yingxiongshuliang" == key){
						this.detail[key] = cross[key]
					}
					if("pifushuliang" == key){
						this.detail[key] = cross[key]
					}
					if("qqdengji" == key){
						this.detail[key] = cross[key]
					}
					if("qqhaoyou" == key){
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

			this.wangluodaquOptions = "电信,网通,体验服".split(',')
			this.youxiqufuOptions = "艾欧尼亚,征服之海,战争学院,影流,水晶之痕迹,皮尔特沃夫,守望之海,皮城警备,诺斯萨科,雷瑟守备,卡拉曼达,均衡教派,巨神峰,黑色玫瑰,钢铁烈阳,裁决之地,班德尔城,暗影岛,祖安,男爵领域,比尔吉沃特,德玛西亚,弗雷尔卓德,无畏先锋,怒瑞玛,扭曲丛林,巨龙巢穴".split(',')
			this.qitaOptions = "峡谷巅峰,教育网专区".split(',')
			this.xiandingpifuOptions = "全部,龙的传人,恐惧新星,亚托克斯至臻,万夫莫开,勇敢的心,海克斯科技,卡沙至臻,地底世界,庆典女皇,冰原核弹,御星魔矢,阿卡丽至臻,至死不渝,烈焰美人薇恩,奥斯曼大帝".split(',')
			this.zuigaoduanweiOptions = "黑铁I,黑铁II,黑铁III,黑铁IV,黑体V,黄铜I,黄铜II,黄铜III,黄铜IV,黄铜V,白银I,白银II,白银III,白银IV,白银V,黄金I,黄金II,黄金III,黄金IV,黄金V,铂金I,铂金II,铂金III,铂金IV,铂金V,钻石I,钻石II,钻石III,钻石IV,钻石V,超凡大师,最强王者".split(',')
			this.dangqianduanweiOptions = "黑铁I,黑铁II,黑铁III,黑铁IV,黑体V,黄铜I,黄铜II,黄铜III,黄铜IV,黄铜V,白银I,白银II,白银III,白银IV,白银V,黄金I,黄金II,黄金III,黄金IV,黄金V,铂金I,铂金II,铂金III,铂金IV,铂金V,钻石I,钻石II,钻石III,钻石IV,钻石V,超凡大师,最强王者".split(',')
			this.qqhaoyouOptions = "无QQ好友,有QQ好友".split(',')
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
			if(!isIntNumer(this.detail.yingxiongshuliang)){
				alert(`英雄数量应输入整数`);
				return
			}
			if(!isIntNumer(this.detail.pifushuliang)){
				alert(`皮肤数量应输入整数`);
				return
			}
			if(!isIntNumer(this.detail.zhanghaojiage)){
				alert(`账号价格应输入整数`);
				return
			}
				addFun("yingxionglianmeng", this.detail, (res) => {
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
				
			form.on('select(wangluodaqu)', function(data){
				app.detail.wangluodaqu = data.value
			});
			form.on('select(youxiqufu)', function(data){
				app.detail.youxiqufu = data.value
			});
			form.on('select(qita)', function(data){
				app.detail.qita = data.value
			});
			form.on('select(xiandingpifu)', function(data){
				app.detail.xiandingpifu = data.value
			});
			form.on('select(zuigaoduanwei)', function(data){
				app.detail.zuigaoduanwei = data.value
			});
			form.on('select(dangqianduanwei)', function(data){
				app.detail.dangqianduanwei = data.value
			});
			form.on('select(qqhaoyou)', function(data){
				app.detail.qqhaoyou = data.value
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
