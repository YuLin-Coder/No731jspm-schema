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
								<a href="#">
									<i class="flaticon-home"></i>
								</a>
							</li>
							<li class="separator">
								<i class="flaticon-right-arrow"></i>
							</li>
							<li class="nav-item">
								<a href="#">英雄联盟</a>
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
																								
																								<input id="maijiazhanghao" v-model="ruleForm.maijiazhanghao" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>卖家姓名</label>
																								
																								<input id="maijiaxingming" v-model="ruleForm.maijiaxingming" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>商品编号</label>
																								
																								<input id="shangpinbianhao" v-model="ruleForm.shangpinbianhao" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>账号标题</label>
																								
																								<input id="zhanghaobiaoti" v-model="ruleForm.zhanghaobiaoti" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>网络大区</label>
																								
																								<input id="wangluodaqu" v-model="ruleForm.wangluodaqu" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>游戏区服</label>
																								
																								<input id="youxiqufu" v-model="ruleForm.youxiqufu" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>其他</label>
																								
																								<input id="qita" v-model="ruleForm.qita" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>限定皮肤</label>
																								
																								<input id="xiandingpifu" v-model="ruleForm.xiandingpifu" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>游戏等级</label>
																								
																								<input id="youxidengji" v-model="ruleForm.youxidengji" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>最高段位</label>
																								
																								<input id="zuigaoduanwei" v-model="ruleForm.zuigaoduanwei" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>当前段位</label>
																								
																								<input id="dangqianduanwei" v-model="ruleForm.dangqianduanwei" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>英雄数量</label>
																								
																								<input id="yingxiongshuliang" v-model="ruleForm.yingxiongshuliang" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>皮肤数量</label>
																								
																								<input id="pifushuliang" v-model="ruleForm.pifushuliang" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>qq等级</label>
																								
																								<input id="qqdengji" v-model="ruleForm.qqdengji" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>qq好友</label>
																								
																								<input id="qqhaoyou" v-model="ruleForm.qqhaoyou" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>封面图片</label>
																								
																																						<img id="fengmiantupianImg" src="" width="100" height="100">
																																				</div>
											
																					<div class="form-group">
																								<label>账号价格</label>
																								
																								<input id="zhanghaojiage" v-model="ruleForm.zhanghaojiage" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>价格区间</label>
																								
																								<input id="jiagequjian" v-model="ruleForm.jiagequjian" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>手续费</label>
																								
																								<input id="shouxufei" v-model="ruleForm.shouxufei" readonly>
																							</div>
											
																					<div class="form-group">
																								<label>平台保障</label>
																								
																								<input id="pingtaibaozhang" v-model="ruleForm.pingtaibaozhang" readonly>
																							</div>
											
																					<div class="form-group">
												
																																				
																								
																							</div>
											
																					<div class="form-group">
																								<label>发布日期</label>
																								
																								<input id="faburiqi" v-model="ruleForm.faburiqi" readonly>
																							</div>
											
																					<div class="form-group">
												
																																				
																								
																							</div>
											
																					<div class="form-group">
												
																								
												
																							</div>
											
																					<div class="form-group">
												
																								
												
																							</div>
											
										
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																					<div class="form-group">
												<label>账号简介</label>
												<script id="zhanghaojianjieEditor" type="text/plain" style="width:800px;height:230px;"></script>
												<script type="text/javascript">
												    //建议使用工厂方法getEditor创建和引用编辑器实例，如果在某个闭包下引用该编辑器，直接调用UE.getEditor('editor')就能拿到相关的实例
												   //相见文档配置属于你自己的编译器
												 var zhanghaojianjieUe = UE.getEditor('zhanghaojianjieEditor', {
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
												<input type="hidden" id="zhanghaojianjie-input">
											</div>
																																																																																																					<div class="form-group">
												<label>账号详情</label>
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
												<input type="hidden" id="zhanghaoxiangqing-input">
											</div>
																																																																																																																								</form>
										</div>
									</div>
								</div>
								<div class="card-action">
									<button id="exitBtn" type="button">返回</button>
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
		var pageType = "info";
		var updateId = "";


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


		// 填充富文本框
		function setContent(){
																																																																																																																																		if(ruleForm.zhanghaojianjie != null && ruleForm.zhanghaojianjie != 'null' && ruleForm.zhanghaojianjie != ''){
					var zhanghaojianjieMes = '' + ruleForm.zhanghaojianjie;
					var zhanghaojianjieUeditor = UE.getEditor('zhanghaojianjieEditor');
					zhanghaojianjieUeditor.ready(function() {
						zhanghaojianjieUeditor.setContent(zhanghaojianjieMes);
						zhanghaojianjieUeditor.setDisabled('fullscreen');
					});
				}
																			if(ruleForm.zhanghaoxiangqing != null && ruleForm.zhanghaoxiangqing != 'null' && ruleForm.zhanghaoxiangqing != ''){
					var zhanghaoxiangqingMes = '' + ruleForm.zhanghaoxiangqing;
					var zhanghaoxiangqingUeditor = UE.getEditor('zhanghaoxiangqingEditor');
					zhanghaoxiangqingUeditor.ready(function() {
						zhanghaoxiangqingUeditor.setContent(zhanghaoxiangqingMes);
						zhanghaoxiangqingUeditor.setDisabled('fullscreen');
					});
				}
																				}  

		// 获取当前详情
		function getDetails() {
			var id = window.sessionStorage.getItem("id");
			if(id != null && id != "" && id != "null"){
				$("#submitBtn").addClass("修改");
				$.ajax({ 
	                type: "GET",
	                url: baseUrl + "yingxionglianmeng/info/" + id,
	                beforeSend: function(xhr) {xhr.setRequestHeader("token", window.sessionStorage.getItem('token'));},
	                success: function(res){           
	                	if(res.code == 0){
	                		ruleForm = res.data
							showImg();
							setContent();	
							setMediaUrl();		
							setDownloadBtn();
			    		}else if(res.code ==401){
			    			 <%@ include file="../../static/toLogin.jsp"%>	
			    		}else{
							 alert(res.msg);
						}
	                },
	            });
			}else{
				$("#submitBtn").addClass("新增");
			}
		}
		//图片显示
		function showImg(){
																																																																																																																					var fengmiantupianFileName = "\"" + ruleForm.fengmiantupian + "\"";
					$("#fengmiantupianImg").attr("src",ruleForm.fengmiantupian);
																																																																								}		
		function exit(){
			window.sessionStorage.removeItem("id");
			window.location.href = "list.jsp";
		}		
		// 下载
		function download(fileName){
			var url = baseUrl+'file/download?fileName='+fileName;
			window.open(url);
		}		
		//设置下载
		function setDownloadBtn(){
																																																																																																																																																																																				}		
		//设置音视频播放链接
		function setMediaUrl(){
																																																																																																																																																																																				}
		//打开新窗口播放媒体
		function mediaPlay(url){
			//var url = baseUrl + "upload/" + fileName;
			window.open(url);
		}
		// 用户登出
        <%@ include file="../../static/logout.jsp"%>
		$(document).ready(function() { 
			$('#projectName').html(projectName)
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
			$('#exitBtn').on('click', function(e) {
			    e.preventDefault();
				exit();
			});
			getDetails();
			<%@ include file="../../static/myInfo.js"%>
		});
	</script>
</body>
</html>