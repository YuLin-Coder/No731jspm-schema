<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<%@ include file="../../static/head.jsp"%>
	<link href="http://www.bootcss.com/p/bootstrap-datetimepicker/bootstrap-datetimepicker/css/datetimepicker.css" rel="stylesheet">
		<script type="text/javascript" charset="utf-8">
	    window.UEDITOR_HOME_URL = "${pageContext.request.contextPath}/resources/ueditor/"; //UEDITOR_HOME_URL、config、all这三个顺序不能改变
		</script>
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.config.js"></script>
		<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/ueditor.all.min.js"></script>
	  	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/ueditor/lang/zh-cn/zh-cn.js"></script>
		
</head>
<body>
	<div class="wrapper compact-wrapper">
		<%@ include file="../../static/mainHeader.jsp"%>
		<!-- Sidebar -->
		<%@ include file="../../static/sidebar.jsp"%>
		<div class="main-panel">
			<div class="content">
				<div class="page-inner">
					<div class="page-header">
						<ul class="breadcrumbs">
							<li class="nav-home">
								<a href="${pageContext.request.contextPath}/index.jsp">
									<i class="flaticon-home"></i>
								</a>
							</li>
							<li class="separator">
								<i class="flaticon-right-arrow"></i>
							</li>
							<li class="nav-item">
								<a href="${pageContext.request.contextPath}/jsp/modules/yingxionglianmeng/list.jsp">英雄联盟</a>
							</li>
						</ul>
					</div>
					<div class="row">
						<div class="col-md-12">
							<div class="card">
								<div class="card-header">
									<div class="card-title"></div>
								</div>
								<div class="card-body">								
									<div class="row">
										<div class="col-md-6 col-lg-4">
										<form id="addOrUpdateForm" method="post">
											<input id="updateId" name="id" type="hidden">
											<div class="form-group">
												<label>卖家账号</label>
												
												<input id="maijiazhanghao" name="maijiazhanghao" class="form-control" placeholder="卖家账号">
												</div>	
											<div class="form-group">
												<label>卖家姓名</label>
												
												<input id="maijiaxingming" name="maijiaxingming" class="form-control" placeholder="卖家姓名">
												</div>	
											<div class="form-group">
												<label>商品编号</label>
												
												<input id="shangpinbianhao" name="shangpinbianhao" class="form-control" value="" readonly>
												</div>	
											<div class="form-group">
												<label>账号标题</label>
												
												<input id="zhanghaobiaoti" name="zhanghaobiaoti" class="form-control" placeholder="账号标题">
												</div>	
											<div class="form-group">
												<label>网络大区</label>
												
												<select id="wangluodaquSelect" name="wangluodaqu" class="form-control">
															<option value=" "></option>
													 																		<option class="wangluodaquOption" value="电信">
																电信
															</option>
																	<option class="wangluodaquOption" value="网通">
																网通
															</option>
																	<option class="wangluodaquOption" value="体验服">
																体验服
															</option>
															</select>
												</div>	
											<div class="form-group">
												<label>游戏区服</label>
												
												<select id="youxiqufuSelect" name="youxiqufu" class="form-control">
															<option value=" "></option>
													 																		<option class="youxiqufuOption" value="艾欧尼亚">
																艾欧尼亚
															</option>
																	<option class="youxiqufuOption" value="征服之海">
																征服之海
															</option>
																	<option class="youxiqufuOption" value="战争学院">
																战争学院
															</option>
																	<option class="youxiqufuOption" value="影流">
																影流
															</option>
																	<option class="youxiqufuOption" value="水晶之痕迹">
																水晶之痕迹
															</option>
																	<option class="youxiqufuOption" value="皮尔特沃夫">
																皮尔特沃夫
															</option>
																	<option class="youxiqufuOption" value="守望之海">
																守望之海
															</option>
																	<option class="youxiqufuOption" value="皮城警备">
																皮城警备
															</option>
																	<option class="youxiqufuOption" value="诺斯萨科">
																诺斯萨科
															</option>
																	<option class="youxiqufuOption" value="雷瑟守备">
																雷瑟守备
															</option>
																	<option class="youxiqufuOption" value="卡拉曼达">
																卡拉曼达
															</option>
																	<option class="youxiqufuOption" value="均衡教派">
																均衡教派
															</option>
																	<option class="youxiqufuOption" value="巨神峰">
																巨神峰
															</option>
																	<option class="youxiqufuOption" value="黑色玫瑰">
																黑色玫瑰
															</option>
																	<option class="youxiqufuOption" value="钢铁烈阳">
																钢铁烈阳
															</option>
																	<option class="youxiqufuOption" value="裁决之地">
																裁决之地
															</option>
																	<option class="youxiqufuOption" value="班德尔城">
																班德尔城
															</option>
																	<option class="youxiqufuOption" value="暗影岛">
																暗影岛
															</option>
																	<option class="youxiqufuOption" value="祖安">
																祖安
															</option>
																	<option class="youxiqufuOption" value="男爵领域">
																男爵领域
															</option>
																	<option class="youxiqufuOption" value="比尔吉沃特">
																比尔吉沃特
															</option>
																	<option class="youxiqufuOption" value="德玛西亚">
																德玛西亚
															</option>
																	<option class="youxiqufuOption" value="弗雷尔卓德">
																弗雷尔卓德
															</option>
																	<option class="youxiqufuOption" value="无畏先锋">
																无畏先锋
															</option>
																	<option class="youxiqufuOption" value="怒瑞玛">
																怒瑞玛
															</option>
																	<option class="youxiqufuOption" value="扭曲丛林">
																扭曲丛林
															</option>
																	<option class="youxiqufuOption" value="巨龙巢穴">
																巨龙巢穴
															</option>
															</select>
												</div>	
											<div class="form-group">
												<label>其他</label>
												
												<select id="qitaSelect" name="qita" class="form-control">
															<option value=" "></option>
													 																		<option class="qitaOption" value="峡谷巅峰">
																峡谷巅峰
															</option>
																	<option class="qitaOption" value="教育网专区">
																教育网专区
															</option>
															</select>
												</div>	
											<div class="form-group">
												<label>限定皮肤</label>
												
												<select id="xiandingpifuSelect" name="xiandingpifu" class="form-control">
															<option value=" "></option>
													 																		<option class="xiandingpifuOption" value="全部">
																全部
															</option>
																	<option class="xiandingpifuOption" value="龙的传人">
																龙的传人
															</option>
																	<option class="xiandingpifuOption" value="恐惧新星">
																恐惧新星
															</option>
																	<option class="xiandingpifuOption" value="亚托克斯至臻">
																亚托克斯至臻
															</option>
																	<option class="xiandingpifuOption" value="万夫莫开">
																万夫莫开
															</option>
																	<option class="xiandingpifuOption" value="勇敢的心">
																勇敢的心
															</option>
																	<option class="xiandingpifuOption" value="海克斯科技">
																海克斯科技
															</option>
																	<option class="xiandingpifuOption" value="卡沙至臻">
																卡沙至臻
															</option>
																	<option class="xiandingpifuOption" value="地底世界">
																地底世界
															</option>
																	<option class="xiandingpifuOption" value="庆典女皇">
																庆典女皇
															</option>
																	<option class="xiandingpifuOption" value="冰原核弹">
																冰原核弹
															</option>
																	<option class="xiandingpifuOption" value="御星魔矢">
																御星魔矢
															</option>
																	<option class="xiandingpifuOption" value="阿卡丽至臻">
																阿卡丽至臻
															</option>
																	<option class="xiandingpifuOption" value="至死不渝">
																至死不渝
															</option>
																	<option class="xiandingpifuOption" value="烈焰美人薇恩">
																烈焰美人薇恩
															</option>
																	<option class="xiandingpifuOption" value="奥斯曼大帝">
																奥斯曼大帝
															</option>
															</select>
												</div>	
											<div class="form-group">
												<label>游戏等级</label>
												
												<input id="youxidengji" name="youxidengji" class="form-control" placeholder="游戏等级">
												</div>	
											<div class="form-group">
												<label>最高段位</label>
												
												<select id="zuigaoduanweiSelect" name="zuigaoduanwei" class="form-control">
															<option value=" "></option>
													 																		<option class="zuigaoduanweiOption" value="黑铁I">
																黑铁I
															</option>
																	<option class="zuigaoduanweiOption" value="黑铁II">
																黑铁II
															</option>
																	<option class="zuigaoduanweiOption" value="黑铁III">
																黑铁III
															</option>
																	<option class="zuigaoduanweiOption" value="黑铁IV">
																黑铁IV
															</option>
																	<option class="zuigaoduanweiOption" value="黑体V">
																黑体V
															</option>
																	<option class="zuigaoduanweiOption" value="黄铜I">
																黄铜I
															</option>
																	<option class="zuigaoduanweiOption" value="黄铜II">
																黄铜II
															</option>
																	<option class="zuigaoduanweiOption" value="黄铜III">
																黄铜III
															</option>
																	<option class="zuigaoduanweiOption" value="黄铜IV">
																黄铜IV
															</option>
																	<option class="zuigaoduanweiOption" value="黄铜V">
																黄铜V
															</option>
																	<option class="zuigaoduanweiOption" value="白银I">
																白银I
															</option>
																	<option class="zuigaoduanweiOption" value="白银II">
																白银II
															</option>
																	<option class="zuigaoduanweiOption" value="白银III">
																白银III
															</option>
																	<option class="zuigaoduanweiOption" value="白银IV">
																白银IV
															</option>
																	<option class="zuigaoduanweiOption" value="白银V">
																白银V
															</option>
																	<option class="zuigaoduanweiOption" value="黄金I">
																黄金I
															</option>
																	<option class="zuigaoduanweiOption" value="黄金II">
																黄金II
															</option>
																	<option class="zuigaoduanweiOption" value="黄金III">
																黄金III
															</option>
																	<option class="zuigaoduanweiOption" value="黄金IV">
																黄金IV
															</option>
																	<option class="zuigaoduanweiOption" value="黄金V">
																黄金V
															</option>
																	<option class="zuigaoduanweiOption" value="铂金I">
																铂金I
															</option>
																	<option class="zuigaoduanweiOption" value="铂金II">
																铂金II
															</option>
																	<option class="zuigaoduanweiOption" value="铂金III">
																铂金III
															</option>
																	<option class="zuigaoduanweiOption" value="铂金IV">
																铂金IV
															</option>
																	<option class="zuigaoduanweiOption" value="铂金V">
																铂金V
															</option>
																	<option class="zuigaoduanweiOption" value="钻石I">
																钻石I
															</option>
																	<option class="zuigaoduanweiOption" value="钻石II">
																钻石II
															</option>
																	<option class="zuigaoduanweiOption" value="钻石III">
																钻石III
															</option>
																	<option class="zuigaoduanweiOption" value="钻石IV">
																钻石IV
															</option>
																	<option class="zuigaoduanweiOption" value="钻石V">
																钻石V
															</option>
																	<option class="zuigaoduanweiOption" value="超凡大师">
																超凡大师
															</option>
																	<option class="zuigaoduanweiOption" value="最强王者">
																最强王者
															</option>
															</select>
												</div>	
											<div class="form-group">
												<label>当前段位</label>
												
												<select id="dangqianduanweiSelect" name="dangqianduanwei" class="form-control">
															<option value=" "></option>
													 																		<option class="dangqianduanweiOption" value="黑铁I">
																黑铁I
															</option>
																	<option class="dangqianduanweiOption" value="黑铁II">
																黑铁II
															</option>
																	<option class="dangqianduanweiOption" value="黑铁III">
																黑铁III
															</option>
																	<option class="dangqianduanweiOption" value="黑铁IV">
																黑铁IV
															</option>
																	<option class="dangqianduanweiOption" value="黑体V">
																黑体V
															</option>
																	<option class="dangqianduanweiOption" value="黄铜I">
																黄铜I
															</option>
																	<option class="dangqianduanweiOption" value="黄铜II">
																黄铜II
															</option>
																	<option class="dangqianduanweiOption" value="黄铜III">
																黄铜III
															</option>
																	<option class="dangqianduanweiOption" value="黄铜IV">
																黄铜IV
															</option>
																	<option class="dangqianduanweiOption" value="黄铜V">
																黄铜V
															</option>
																	<option class="dangqianduanweiOption" value="白银I">
																白银I
															</option>
																	<option class="dangqianduanweiOption" value="白银II">
																白银II
															</option>
																	<option class="dangqianduanweiOption" value="白银III">
																白银III
															</option>
																	<option class="dangqianduanweiOption" value="白银IV">
																白银IV
															</option>
																	<option class="dangqianduanweiOption" value="白银V">
																白银V
															</option>
																	<option class="dangqianduanweiOption" value="黄金I">
																黄金I
															</option>
																	<option class="dangqianduanweiOption" value="黄金II">
																黄金II
															</option>
																	<option class="dangqianduanweiOption" value="黄金III">
																黄金III
															</option>
																	<option class="dangqianduanweiOption" value="黄金IV">
																黄金IV
															</option>
																	<option class="dangqianduanweiOption" value="黄金V">
																黄金V
															</option>
																	<option class="dangqianduanweiOption" value="铂金I">
																铂金I
															</option>
																	<option class="dangqianduanweiOption" value="铂金II">
																铂金II
															</option>
																	<option class="dangqianduanweiOption" value="铂金III">
																铂金III
															</option>
																	<option class="dangqianduanweiOption" value="铂金IV">
																铂金IV
															</option>
																	<option class="dangqianduanweiOption" value="铂金V">
																铂金V
															</option>
																	<option class="dangqianduanweiOption" value="钻石I">
																钻石I
															</option>
																	<option class="dangqianduanweiOption" value="钻石II">
																钻石II
															</option>
																	<option class="dangqianduanweiOption" value="钻石III">
																钻石III
															</option>
																	<option class="dangqianduanweiOption" value="钻石IV">
																钻石IV
															</option>
																	<option class="dangqianduanweiOption" value="钻石V">
																钻石V
															</option>
																	<option class="dangqianduanweiOption" value="超凡大师">
																超凡大师
															</option>
																	<option class="dangqianduanweiOption" value="最强王者">
																最强王者
															</option>
															</select>
												</div>	
											<div class="form-group">
												<label>英雄数量</label>
												
												<input id="yingxiongshuliang" name="yingxiongshuliang" class="form-control" placeholder="英雄数量">
												</div>	
											<div class="form-group">
												<label>皮肤数量</label>
												
												<input id="pifushuliang" name="pifushuliang" class="form-control" placeholder="皮肤数量">
												</div>	
											<div class="form-group">
												<label>qq等级</label>
												
												<input id="qqdengji" name="qqdengji" class="form-control" placeholder="qq等级">
												</div>	
											<div class="form-group">
												<label>qq好友</label>
												
												<select id="qqhaoyouSelect" name="qqhaoyou" class="form-control">
															<option value=" "></option>
													 																		<option class="qqhaoyouOption" value="无QQ好友">
																无QQ好友
															</option>
																	<option class="qqhaoyouOption" value="有QQ好友">
																有QQ好友
															</option>
															</select>
												</div>	
											<div class="form-group">
												<label>封面图片</label>
												
													<img id="fengmiantupianImg" src="" width="100" height="100">
													<input name="file" type="file" id="fengmiantupianupload" class="form-control-file">
													<input name="fengmiantupian" id="fengmiantupian-input" type="hidden">
												</div>	
											<div class="form-group">
												<label>账号价格</label>
												
												<input id="zhanghaojiage" name="zhanghaojiage" class="form-control" placeholder="账号价格">
												</div>	
											<div class="form-group">
												<label>价格区间</label>
												
												<select  class="form-control"  name="jiagequjian" id="jiagequjianSelect" onchange="jiagequjianSelect2Change()">
												</select>											
												</div>	
											<div class="form-group">
												<label>手续费</label>
												
												<input id="shouxufei" name="shouxufei" class="form-control" value="" readonly>
												</div>	
											<div class="form-group">
												<label>平台保障</label>
												
												<input id="pingtaibaozhang" name="pingtaibaozhang" class="form-control" value="" readonly>
												</div>	
											<div class="form-group">
												<label>账号简介</label>
												
												<textarea id="zhanghaojianjie" name="zhanghaojianjie" class="form-control" rows="5">
												</textarea>
											</div>	
											<div class="form-group">
												<label>发布日期</label>
												
												<div id="faburiqiDate" class="input-append date form_datetime">
													<input id="faburiqi-input" name="faburiqi" size="15" type="text" readonly>
													<span class="add-on"><i class="icon-remove"></i></span>
													<span class="add-on"><i class="icon-calendar"></i></span>
												</div>
											</div>	
											<div class="form-group">
												
											</div>	
											<div class="form-group">
												
											</div>	
											<div class="form-group">
												
											</div>	

																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																												<div class="form-group">
													<label>账号详情</label>
													<input id="zhanghaoxiangqingupload" name="file" type="file">
													<script id="zhanghaoxiangqingEditor" type="text/plain" style="width:800px;height:230px;"></script>
													<script type="text/javascript">
														//建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
													//相见文档配置属于你自己的编译器
													var zhanghaoxiangqingUe = UE.getEditor('zhanghaoxiangqingEditor', {
														toolbars: [
															[
																'undo', //撤销
																'bold', //加粗
																'redo', //重做
																'underline', //下划线
																'horizontal', //分隔线
																'inserttitle', //插入标题
																'cleardoc', //清空文档
																'fontfamily', //字体
																'fontsize', //字号
																'paragraph', //段落格式
																'inserttable', //插入表格
																'justifyleft', //居左对齐
																'justifyright', //居右对齐
																'justifycenter', //居中对
																'justifyjustify', //两端对齐
																'forecolor', //字体颜色
																'fullscreen', //全屏
																'edittip ', //编辑提示
																'customstyle', //自定义标题
																]
															]
														});
													</script>
													<input type="hidden" name="zhanghaoxiangqing" id="zhanghaoxiangqing-input">
												</div>
																																																																																																																											</form>
										</div>
									</div>
								</div>
								<div class="card-action">
									<button id="submitBtn" type="button" class="btn btn-success">提交</button>
									<button class="btn btn-danger">取消</button>
								</div>
								
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!-- Custom template | don't include it in your project! -->
		<!-- End Custom template -->
	</div>
	<!--   Core JS Files   -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/core/jquery.3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/core/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/core/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/vue.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.ui.widget.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.fileupload.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/jquery.form.js"></script>
	<!-- jQuery UI -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>
	
	<!-- jQuery Scrollbar -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>
	<!-- Atlantis JS -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/atlantis.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/assets/js/validate/jquery.validate.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/assets/js/validate/messages_zh.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/assets/js/validate/card.js"></script>
	<script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/resources/assets/datetimepicker/bootstrap-datetimepicker.min.js"></script>
	<!-- Atlantis DEMO methods, don't include it in your project! -->
	<!--<script src="${pageContext.request.contextPath}/resources/assets/js/setting-demo2.js"></script> -->
	
	<script>
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>   

		var tableName = "yingxionglianmeng";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};
																																																																																																																															
					      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      	
																			function shangpinbianhaoUuid(){
					if($("#shangpinbianhao").val() == null || $("#shangpinbianhao").val() == "null" || $("#shangpinbianhao").val() == ""){
						$("#shangpinbianhao").attr("value",Math.round(new Date().getTime()/1000));
					}
				}							
																																																																																		function jiagequjianSelect2(){
					http("option/shouxufeiyong/jiagequjian","GET",{
						tableName: "shouxufeiyong",
						columnName: "jiagequjian"
					},(res)=>{
						if(res.code == 0){
							var options = res.data;
							var option = document.createElement("option");
							$("#jiagequjianSelect").append(option)
							for(var i=0;i<options.length;i++){
								var jiagequjianOption = document.createElement("option");
								jiagequjianOption.setAttribute("value",options[i]);
								jiagequjianOption.setAttribute("class","jiagequjianOption");
								if(ruleForm.jiagequjian == options[i]){
									jiagequjianOption.setAttribute("selected","selected");
								}
								jiagequjianOption.innerHTML = options[i];
								$("#jiagequjianSelect").append(jiagequjianOption);
							}
						}
					});
				}
				function jiagequjianSelect2Change(){
					var options = document.getElementById("jiagequjianSelect").options;
					var index = document.getElementById("jiagequjianSelect").selectedIndex;
					var colVal = options[index].value;
					http("follow/shouxufeiyong/jiagequjian","GET",{
						tableName: "shouxufeiyong",
						columnName: "jiagequjian",
						columnValue: colVal
					},(res)=>{
						if(res.code == 0){
																																																																																																																																																																																																																																																																																																						if(res.data != null && res.data.shouxufei != null){
										$("#shouxufei").val(res.data.shouxufei);
									}
																																if(res.data != null && res.data.pingtaibaozhang != null){
										$("#pingtaibaozhang").val(res.data.pingtaibaozhang);
									}
																																																																																																}
					});
				}	
																																										var ruleForm = {};
		var vm = new Vue({
		  el: '#addOrUpdateForm',
		  data:{
			  ruleForm : {},
			},
		  beforeCreate: function(){
			  var id = window.sessionStorage.getItem("id");
				if(id != null && id != "" && id != "null"){
					$.ajax({ 
		                type: "GET",
		                url: baseUrl + "yingxionglianmeng/info/" + id,
		                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
		                success: function(res){               	
		                	if(res.code == 0){
		                		vm.ruleForm = res.data;
				    		}else if(res.code == 401) {
				    			<%@ include file="../../static/toLogin.jsp"%>    
				    		}else{ alert(res.msg)}
		                },
		            });
				}
			},
			methods: { }
	  	});
		// 文件上传
		function upload(){
																																																																																																																					$('#fengmiantupianupload').fileupload({
						url: baseUrl + 'file/upload',
						headers:{ token: window.sessionStorage.getItem("token")},
						dataType: 'json',
						done: function (e, data) {						
							document.getElementById('fengmiantupian-input').setAttribute('value',baseUrl+"upload/"+data.result.file);
							if(document.getElementById('fengmiantupianFileName') != null){
								document.getElementById('fengmiantupianFileName').innerHTML = data.result.file +"";
							}						
							$("#fengmiantupianImg").attr("src",baseUrl+"upload/"+data.result.file);
						}
					});
																																																										$('#zhanghaoxiangqingupload').fileupload({
						url: baseUrl + 'file/upload',
						headers:{ token: window.sessionStorage.getItem("token")},
						dataType: 'json',
						done: function (e, data) {	
							UE.getEditor('zhanghaoxiangqingEditor').execCommand('insertHtml','<img src=\"'+ baseUrl +'upload/'+ data.result.file + '\" width=900 height=560 >');					
						}
					});
																							}  
		// 表单提交
		function submit() {
			if(validform() ==true && compare() == true){
				let data = {};
				getContent();
				let value = $('#addOrUpdateForm').serializeArray();
				$.each(value, function (index, item) { 
							data[item.name] = item.value;
						});
				let json = JSON.stringify(data);
				//console.log('json : ',json);
				var urlParam;
				var successMes = '';
				if(updateId!=null && updateId!="null" && updateId!=''){
					urlParam = 'update';
					successMes = '修改成功';
				}else{				
					urlParam = 'save';
					successMes = '添加成功';
				}
				httpJson("yingxionglianmeng/"+urlParam,"POST",data,(res)=>{
					if(res.code == 0){
						window.sessionStorage.removeItem('id');	
						let flag = true;
																																																																																																																																																																																																																																																																																																																																																	if(flag){
							alert(successMes);
						}					
						if(window.sessionStorage.getItem('onlyme') != null && window.sessionStorage.getItem('onlyme') == true){
							window.sessionStorage.removeItem('onlyme');
							window.location.href="${pageContext.request.contextPath}/index.jsp";
						}else{
							window.location.href="list.jsp";
						}
					}
				});
			}else{
				alert("表单未填完整或有错误");
			}
		}
		// 填充富文本框
		function setContent(){
																																																																																																																																														if(ruleForm.zhanghaoxiangqing != null && ruleForm.zhanghaoxiangqing != 'null' && ruleForm.zhanghaoxiangqing != ''){
						var zhanghaoxiangqingMes = '' + ruleForm.zhanghaoxiangqing;
						var zhanghaoxiangqingUeditor = UE.getEditor('zhanghaoxiangqingEditor');
						zhanghaoxiangqingUeditor.ready(function() {
							zhanghaoxiangqingUeditor.setContent(zhanghaoxiangqingMes);
						});
				}
																				}  
		// 获取富文本框内容
		function getContent(){
																																																																																																																																														if(UE.getEditor('zhanghaoxiangqingEditor').hasContents()){
					$('#zhanghaoxiangqing-input').attr('value',UE.getEditor('zhanghaoxiangqingEditor').getPlainTxt());
				}
																				}
		// 表单校验
		function validform() {
			return $("#addOrUpdateForm").validate({ 
				rules: {
					           				       			 	           										    maijiaxingming: {
														},
						       			 	           										    shangpinbianhao: {
														},
						       			 	           										    zhanghaobiaoti: {
														},
						       			 	           										    wangluodaqu: {
														},
						       			 	           										    youxiqufu: {
														},
						       			 	           										    qita: {
														},
						       			 	           										    xiandingpifu: {
														},
						       			 	           										    youxidengji: {
														},
						       			 	           										    zuigaoduanwei: {
														},
						       			 	           										    dangqianduanwei: {
														},
						       			 	           										    yingxiongshuliang: {
															digits: true,
														},
						       			 	           										    pifushuliang: {
															digits: true,
														},
						       			 	           										    qqdengji: {
														},
						       			 	           										    qqhaoyou: {
														},
						       			 	           										    fengmiantupian: {
														},
						       			 	           										    zhanghaojiage: {
															digits: true,
														},
						       			 	           										    jiagequjian: {
														},
						       			 	           										    shouxufei: {
														},
						       			 	           										    pingtaibaozhang: {
														},
						       			 	           										    zhanghaojianjie: {
														},
						       			 	           										    faburiqi: {
														},
						       			 	           										    zhanghaoxiangqing: {
														},
						       			 	           										    thumbsupnum: {
															digits: true,
														},
						       			 	           										    crazilynum: {
															digits: true,
														},
						       			 					},
				messages: {
																													maijiaxingming: {
														},
																								shangpinbianhao: {
														},
																								zhanghaobiaoti: {
														},
																								wangluodaqu: {
														},
																								youxiqufu: {
														},
																								qita: {
														},
																								xiandingpifu: {
														},
																								youxidengji: {
														},
																								zuigaoduanwei: {
														},
																								dangqianduanwei: {
														},
																								yingxiongshuliang: {
															digits: "请输入整数",
														},
																								pifushuliang: {
															digits: "请输入整数",
														},
																								qqdengji: {
														},
																								qqhaoyou: {
														},
																								fengmiantupian: {
														},
																								zhanghaojiage: {
															digits: "请输入整数",
														},
																								jiagequjian: {
														},
																								shouxufei: {
														},
																								pingtaibaozhang: {
														},
																								zhanghaojianjie: {
														},
																								faburiqi: {
														},
																								zhanghaoxiangqing: {
														},
																								thumbsupnum: {
															digits: "请输入整数",
														},
																								crazilynum: {
															digits: "请输入整数",
														},
															}
			}).form();
		}
		// 添加表单校验方法
		function addValidation(){
			jQuery.validator.addMethod("isPhone", function(value, element) {
					var length = value.length;
					var mobile = /^(((13[0-9]{1})|(15[0-9]{1})|(18[0-9]{1})|(17[0-9]{1}))+\d{8})$/;
					return this.optional(element) || (length == 11 && mobile.test(value));
			}, "请填写正确的手机号码");
			jQuery.validator.addMethod("isIdCardNo", function(value, element) {
				return this.optional(element) || idCardNoUtil.checkIdCardNo(value);
			}, "请正确输入您的身份证号码");
		}
		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				$("#submitBtn").addClass("修改");
				updateId = id;
				window.sessionStorage.removeItem('id');
				http("yingxionglianmeng/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
																																																																																																																																																																																																																																																								jiagequjianSelect2();
																																																																																																														//注册表单验证
						$(validform());
					}
				});
			}else{
																																	shangpinbianhaoUuid();
																																																																																																																																																		jiagequjianSelect2();	
																																																																															 		fill()
								//注册表单验证
				$(validform());
			}
		}
		// 下拉框选项回显
		function setSelectOption(){
																																																																																																																																																																																				}
		// 关联下拉框改变
		function lvSelectChange(level){
			let data = {};
			let value = $('#addOrUpdateForm').serializeArray();
			$.each(value, function (index, item) { 
			            data[item.name] = item.value;
			        });
							
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
											
										
		}
		// 清除可能会重复渲染的selection
		function clear(className){
			var elements = document.getElementsByClassName(className);
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
		}
		function dateTimePick(){
			$.fn.datetimepicker.dates['zh-CN'] = { 
		            days: ["星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"],
		            daysShort: ["周日", "周一", "周二", "周三", "周四", "周五", "周六", "周日"],
		            daysMin:  ["日", "一", "二", "三", "四", "五", "六", "日"],
		            months: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            monthsShort: ["一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"],
		            today: "今天",
		            suffix: [],
		            meridiem: ["上午", "下午"]
		    };
																																																																																																																																																														$("#faburiqiDate").datetimepicker({ 
					minView: "month",
					autoclose: true,
					format:'yyyy-mm-dd',
					language:'zh-CN',
				});
																												
		}

		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
																																																																																																																																																																																				}
		function calculationSE(colName){
			//单列求和接口
			http("yingxionglianmeng"+colName,"GET",{
				tableName: "yingxionglianmeng",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					$("#"+colName).attr("value",res.data);
				}
			});
		}

		function calculationPre(){
			//进入该页面就填充"单列求和"的列
																																																																																																																																																																																				}
			//新增时填充字段
			function fill(){

				var username = window.sessionStorage.getItem('username');
				var accountTableName = window.sessionStorage.getItem('accountTableName');
				http(accountTableName+'/session','GET',{},(res)=>{
					if(res.code == 0){
						var myId = res.data.id;
							if(res.data !=null && res.data.maijiazhanghao != null && res.data.maijiazhanghao != ''){
							$('#maijiazhanghao').val(res.data.maijiazhanghao)
						}
								if(res.data !=null && res.data.maijiaxingming != null && res.data.maijiaxingming != ''){
							$('#maijiaxingming').val(res.data.maijiaxingming)
						}
																														$(validform());
					}
				});
							
			}	
		function dataBind(){
			$("#updateId").val(ruleForm.id);	
												$("#maijiazhanghao").val(ruleForm.maijiazhanghao);	
																$("#maijiaxingming").val(ruleForm.maijiaxingming);	
																$("#shangpinbianhao").val(ruleForm.shangpinbianhao);	
																$("#zhanghaobiaoti").val(ruleForm.zhanghaobiaoti);	
																var wangluodaquOptions = document.getElementsByClassName("wangluodaquOption");
					for(var wangluodaquCount = 0; wangluodaquCount < wangluodaquOptions.length;wangluodaquCount++){
						if(wangluodaquOptions[wangluodaquCount].getAttribute('value') == ruleForm.wangluodaqu){
							wangluodaquOptions[wangluodaquCount].setAttribute('selected','selected');
						}
					}
																var youxiqufuOptions = document.getElementsByClassName("youxiqufuOption");
					for(var youxiqufuCount = 0; youxiqufuCount < youxiqufuOptions.length;youxiqufuCount++){
						if(youxiqufuOptions[youxiqufuCount].getAttribute('value') == ruleForm.youxiqufu){
							youxiqufuOptions[youxiqufuCount].setAttribute('selected','selected');
						}
					}
																var qitaOptions = document.getElementsByClassName("qitaOption");
					for(var qitaCount = 0; qitaCount < qitaOptions.length;qitaCount++){
						if(qitaOptions[qitaCount].getAttribute('value') == ruleForm.qita){
							qitaOptions[qitaCount].setAttribute('selected','selected');
						}
					}
																var xiandingpifuOptions = document.getElementsByClassName("xiandingpifuOption");
					for(var xiandingpifuCount = 0; xiandingpifuCount < xiandingpifuOptions.length;xiandingpifuCount++){
						if(xiandingpifuOptions[xiandingpifuCount].getAttribute('value') == ruleForm.xiandingpifu){
							xiandingpifuOptions[xiandingpifuCount].setAttribute('selected','selected');
						}
					}
																$("#youxidengji").val(ruleForm.youxidengji);	
																var zuigaoduanweiOptions = document.getElementsByClassName("zuigaoduanweiOption");
					for(var zuigaoduanweiCount = 0; zuigaoduanweiCount < zuigaoduanweiOptions.length;zuigaoduanweiCount++){
						if(zuigaoduanweiOptions[zuigaoduanweiCount].getAttribute('value') == ruleForm.zuigaoduanwei){
							zuigaoduanweiOptions[zuigaoduanweiCount].setAttribute('selected','selected');
						}
					}
																var dangqianduanweiOptions = document.getElementsByClassName("dangqianduanweiOption");
					for(var dangqianduanweiCount = 0; dangqianduanweiCount < dangqianduanweiOptions.length;dangqianduanweiCount++){
						if(dangqianduanweiOptions[dangqianduanweiCount].getAttribute('value') == ruleForm.dangqianduanwei){
							dangqianduanweiOptions[dangqianduanweiCount].setAttribute('selected','selected');
						}
					}
																$("#yingxiongshuliang").val(ruleForm.yingxiongshuliang);	
																$("#pifushuliang").val(ruleForm.pifushuliang);	
																$("#qqdengji").val(ruleForm.qqdengji);	
																var qqhaoyouOptions = document.getElementsByClassName("qqhaoyouOption");
					for(var qqhaoyouCount = 0; qqhaoyouCount < qqhaoyouOptions.length;qqhaoyouCount++){
						if(qqhaoyouOptions[qqhaoyouCount].getAttribute('value') == ruleForm.qqhaoyou){
							qqhaoyouOptions[qqhaoyouCount].setAttribute('selected','selected');
						}
					}
																$("#fengmiantupian-input").val(ruleForm.fengmiantupian);
																$("#zhanghaojiage").val(ruleForm.zhanghaojiage);	
											
																				$("#shouxufei").val(ruleForm.shouxufei);	
																$("#pingtaibaozhang").val(ruleForm.pingtaibaozhang);	
																$("#zhanghaojianjie-input").val(ruleForm.zhanghaojianjie);
																$("#faburiqi-input").val(ruleForm.faburiqi);
																$("#zhanghaoxiangqing").val(ruleForm.zhanghaoxiangqing);	
											
											
									}
		//图片显示
		function showImg(){
																																																																																																																					var fengmiantupianFileName = "\"" + ruleForm.fengmiantupian + "\"";
					$("#fengmiantupianImg").attr("src",ruleForm.fengmiantupian);
																																																																								}		
       //跨表

        //跨表
        function crossTable(){
            crossTableName = window.sessionStorage.getItem('crossTableName');
			crossTableId = window.sessionStorage.getItem('crossTableId');
            if(crossTableName != null && crossTableName != '' && crossTableId != null && crossTableId != '' && crossTableId != -1){
				http(crossTableName + "/info/" + crossTableId,"GET",{},(res)=>{
					if(res.code == 0){
						crossRuleForm = res.data;
						$('#updateId').val(crossTableId);
												if(res.data != null && res.data != '' && res.data.maijiazhanghao != null && res.data.maijiazhanghao != ''){

															$("#maijiazhanghao").val(res.data.maijiazhanghao);
													}
												if(res.data != null && res.data != '' && res.data.maijiaxingming != null && res.data.maijiaxingming != ''){

															$("#maijiaxingming").val(res.data.maijiaxingming);
													}
												if(res.data != null && res.data != '' && res.data.shangpinbianhao != null && res.data.shangpinbianhao != ''){

															$("#shangpinbianhao").val(res.data.shangpinbianhao);
													}
												if(res.data != null && res.data != '' && res.data.zhanghaobiaoti != null && res.data.zhanghaobiaoti != ''){

															$("#zhanghaobiaoti").val(res.data.zhanghaobiaoti);
													}
												if(res.data != null && res.data != '' && res.data.wangluodaqu != null && res.data.wangluodaqu != ''){

															var wangluodaquOptions = document.getElementsByClassName("wangluodaquOption");
								for(var wangluodaquCount = 0; wangluodaquCount < wangluodaquOptions.length;wangluodaquCount++){
									if(wangluodaquOptions[wangluodaquCount].getAttribute('value') == res.data.wangluodaqu){
										wangluodaquOptions[wangluodaquCount].setAttribute('selected','selected');
									}
								}
													}
												if(res.data != null && res.data != '' && res.data.youxiqufu != null && res.data.youxiqufu != ''){

															var youxiqufuOptions = document.getElementsByClassName("youxiqufuOption");
								for(var youxiqufuCount = 0; youxiqufuCount < youxiqufuOptions.length;youxiqufuCount++){
									if(youxiqufuOptions[youxiqufuCount].getAttribute('value') == res.data.youxiqufu){
										youxiqufuOptions[youxiqufuCount].setAttribute('selected','selected');
									}
								}
													}
												if(res.data != null && res.data != '' && res.data.qita != null && res.data.qita != ''){

															var qitaOptions = document.getElementsByClassName("qitaOption");
								for(var qitaCount = 0; qitaCount < qitaOptions.length;qitaCount++){
									if(qitaOptions[qitaCount].getAttribute('value') == res.data.qita){
										qitaOptions[qitaCount].setAttribute('selected','selected');
									}
								}
													}
												if(res.data != null && res.data != '' && res.data.xiandingpifu != null && res.data.xiandingpifu != ''){

															var xiandingpifuOptions = document.getElementsByClassName("xiandingpifuOption");
								for(var xiandingpifuCount = 0; xiandingpifuCount < xiandingpifuOptions.length;xiandingpifuCount++){
									if(xiandingpifuOptions[xiandingpifuCount].getAttribute('value') == res.data.xiandingpifu){
										xiandingpifuOptions[xiandingpifuCount].setAttribute('selected','selected');
									}
								}
													}
												if(res.data != null && res.data != '' && res.data.youxidengji != null && res.data.youxidengji != ''){

															$("#youxidengji").val(res.data.youxidengji);
													}
												if(res.data != null && res.data != '' && res.data.zuigaoduanwei != null && res.data.zuigaoduanwei != ''){

															var zuigaoduanweiOptions = document.getElementsByClassName("zuigaoduanweiOption");
								for(var zuigaoduanweiCount = 0; zuigaoduanweiCount < zuigaoduanweiOptions.length;zuigaoduanweiCount++){
									if(zuigaoduanweiOptions[zuigaoduanweiCount].getAttribute('value') == res.data.zuigaoduanwei){
										zuigaoduanweiOptions[zuigaoduanweiCount].setAttribute('selected','selected');
									}
								}
													}
												if(res.data != null && res.data != '' && res.data.dangqianduanwei != null && res.data.dangqianduanwei != ''){

															var dangqianduanweiOptions = document.getElementsByClassName("dangqianduanweiOption");
								for(var dangqianduanweiCount = 0; dangqianduanweiCount < dangqianduanweiOptions.length;dangqianduanweiCount++){
									if(dangqianduanweiOptions[dangqianduanweiCount].getAttribute('value') == res.data.dangqianduanwei){
										dangqianduanweiOptions[dangqianduanweiCount].setAttribute('selected','selected');
									}
								}
													}
												if(res.data != null && res.data != '' && res.data.yingxiongshuliang != null && res.data.yingxiongshuliang != ''){

															$("#yingxiongshuliang").val(res.data.yingxiongshuliang);
													}
												if(res.data != null && res.data != '' && res.data.pifushuliang != null && res.data.pifushuliang != ''){

															$("#pifushuliang").val(res.data.pifushuliang);
													}
												if(res.data != null && res.data != '' && res.data.qqdengji != null && res.data.qqdengji != ''){

															$("#qqdengji").val(res.data.qqdengji);
													}
												if(res.data != null && res.data != '' && res.data.qqhaoyou != null && res.data.qqhaoyou != ''){

															var qqhaoyouOptions = document.getElementsByClassName("qqhaoyouOption");
								for(var qqhaoyouCount = 0; qqhaoyouCount < qqhaoyouOptions.length;qqhaoyouCount++){
									if(qqhaoyouOptions[qqhaoyouCount].getAttribute('value') == res.data.qqhaoyou){
										qqhaoyouOptions[qqhaoyouCount].setAttribute('selected','selected');
									}
								}
													}
												if(res.data != null && res.data != '' && res.data.fengmiantupian != null && res.data.fengmiantupian != ''){

															$("#fengmiantupianImg").attr("src",res.data.fengmiantupian);
								$("#fengmiantupian-input").val(res.data.fengmiantupian);
													}
												if(res.data != null && res.data != '' && res.data.zhanghaojiage != null && res.data.zhanghaojiage != ''){

															$("#zhanghaojiage").val(res.data.zhanghaojiage);
													}
												if(res.data != null && res.data != '' && res.data.jiagequjian != null && res.data.jiagequjian != ''){

							
																				}
												if(res.data != null && res.data != '' && res.data.shouxufei != null && res.data.shouxufei != ''){

															$("#shouxufei").val(res.data.shouxufei);
													}
												if(res.data != null && res.data != '' && res.data.pingtaibaozhang != null && res.data.pingtaibaozhang != ''){

															$("#pingtaibaozhang").val(res.data.pingtaibaozhang);
													}
												if(res.data != null && res.data != '' && res.data.zhanghaojianjie != null && res.data.zhanghaojianjie != ''){

															$("#zhanghaojianjie-input").val(res.data.zhanghaojianjie);
													}
												if(res.data != null && res.data != '' && res.data.faburiqi != null && res.data.faburiqi != ''){

															$("#faburiqi-input").val(res.data.faburiqi);
								$('#faburiqiFileName').val(res.data.faburiqi)
													}
												if(res.data != null && res.data != '' && res.data.zhanghaoxiangqing != null && res.data.zhanghaoxiangqing != ''){

															$("#zhanghaoxiangqing").val(res.data.zhanghaoxiangqing);
													}
												if(res.data != null && res.data != '' && res.data.thumbsupnum != null && res.data.thumbsupnum != ''){

							
																				}
												if(res.data != null && res.data != '' && res.data.crazilynum != null && res.data.crazilynum != ''){

							
																				}
											}
				});  
            }
            window.sessionStorage.removeItem('crossTableName');
			window.sessionStorage.removeItem('crossTableId');
        }
		
		//跨表更新字段
		function crossTableUpdate(){
			let flag = crossTableUpdateValidation();
			if(flag){
				httpJson(crossTableName + "/update","POST",{
					id: crossTableId,
																																																																																																																																																																																																																																																																																												},(res)=>{
					if(res.code == 0){
						console.log('跨表更新成功');
						return true;
					}
				});   
			}
			return false;
		}

		//跨表更新前验证
		function crossTableUpdateValidation(){
			//防止减法导致库存负值
																																																																																																																																																																																					return true;
		}
		function readonly(){
			if(window.sessionStorage.getItem('role') != '管理员'){
				$('#jifen').attr('readonly','readonly');
				$('#money').attr('readonly','readonly');
			}
		}

		//比较大小
		function compare(){
			var largerVal = null;
			var smallerVal = null;
																																																																																																																																																												if(largerVal !=null && smallerVal != null){
				if(largerVal<=smallerVal){
					alert(smallerName+'不能大于等于'+largerName);
					return false;
				}
			}
			return true;
		}		

		// 用户登出
        <%@ include file="../../static/logout.jsp"%>

		$(document).ready(function() { 
			$('#projectName').html(projectName)
			//设置导航栏菜单
			setMenu();
			//设置左上角系统名
			if(projectName.length >14){
				$('.logo-header h2').html(projectName.substring(0,13)+'..')
			}else{
				$('.logo-header h2').html(projectName)
			}
			//设置右上角用户名
			$('.user-box .u-text h4').html(window.sessionStorage.getItem('username'))
			<%@ include file="../../static/color.js"%>
			<%@ include file="../../static/style.jsp"%>
			//初始化日期插件
			dateTimePick();
			//添加表单校验信息文本
			addValidation();
			getDetails();
			//初始化上传按钮
			upload();
			//单列求和
			calculationPre();
			//跨表
			crossTable();
			$('#submitBtn').on('click', function(e) {
			    e.preventDefault();
			    //console.log("点击了...提交按钮");
			    submit();
			});	
			<%@ include file="../../static/myInfo.js"%>
			readonly();
		});
	</script>
</body>
</html>