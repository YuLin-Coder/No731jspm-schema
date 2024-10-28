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
								<a href="${pageContext.request.contextPath}/jsp/modules/yingxionglianmenggoumai/list.jsp">英雄联盟购买</a>
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
												
												<input id="shangpinbianhao" name="shangpinbianhao" class="form-control" placeholder="商品编号">
												</div>	
											<div class="form-group">
												<label>账号标题</label>
												
												<input id="zhanghaobiaoti" name="zhanghaobiaoti" class="form-control" placeholder="账号标题">
												</div>	
											<div class="form-group">
												<label>网络大区</label>
												
												<input id="wangluodaqu" name="wangluodaqu" class="form-control" placeholder="网络大区">
												</div>	
											<div class="form-group">
												<label>游戏区服</label>
												
												<input id="youxiqufu" name="youxiqufu" class="form-control" placeholder="游戏区服">
												</div>	
											<div class="form-group">
												<label>游戏等级</label>
												
												<input id="youxidengji" name="youxidengji" class="form-control" placeholder="游戏等级">
												</div>	
											<div class="form-group">
												<label>当前段位</label>
												
												<input id="dangqianduanwei" name="dangqianduanwei" class="form-control" placeholder="当前段位">
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
												<label>账号价格</label>
												
												<input id="zhanghaojiage" name="zhanghaojiage" class="form-control" onchange="calculation()">
												</div>	
											<div class="form-group">
												<label>手续费</label>
												
												<input id="shouxufei" name="shouxufei" class="form-control" onchange="calculation()">
												</div>	
											<div class="form-group">
												<label>平台保障</label>
												
												<input id="pingtaibaozhang" name="pingtaibaozhang" class="form-control" placeholder="平台保障">
												</div>	
											<div class="form-group">
												<label>实付金额</label>
												
												<input id="shifujine" name="shifujine" class="form-control" placeholder="实付金额">
												</div>	
											<div class="form-group">
												<label>用户名</label>
												
												<input id="yonghuming" name="yonghuming" class="form-control" placeholder="用户名">
												</div>	
											<div class="form-group">
												<label>姓名</label>
												
												<input id="xingming" name="xingming" class="form-control" placeholder="姓名">
												</div>	
											<div class="form-group">
												<label>购买日期</label>
												
												<div id="goumairiqiDate" class="input-append date form_datetime">
													<input id="goumairiqi-input" name="goumairiqi" size="20" type="text" readonly>
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

		var tableName = "yingxionglianmenggoumai";
		var pageType = "add-or-update";
		var updateId = "";
		var crossTableId = -1;
		var crossTableName = '';
		var ruleForm = {};
		var crossRuleForm = {};
																																																																																																						
					      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      	
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
		                url: baseUrl + "yingxionglianmenggoumai/info/" + id,
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
				httpJson("yingxionglianmenggoumai/"+urlParam,"POST",data,(res)=>{
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
																																																																																																																													}  
		// 获取富文本框内容
		function getContent(){
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
						       			 	           										    youxidengji: {
														},
						       			 	           										    dangqianduanwei: {
														},
						       			 	           										    yingxiongshuliang: {
														},
						       			 	           										    pifushuliang: {
														},
						       			 	           										    zhanghaojiage: {
														},
						       			 	           										    shouxufei: {
														},
						       			 	           										    pingtaibaozhang: {
														},
						       			 	           										    shifujine: {
														},
						       			 	           										    yonghuming: {
														},
						       			 	           										    xingming: {
														},
						       			 	           										    goumairiqi: {
														},
						       			 	           										    sfsh: {
														},
						       			 	           										    shhf: {
														},
						       			 	           										    ispay: {
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
																								youxidengji: {
														},
																								dangqianduanwei: {
														},
																								yingxiongshuliang: {
														},
																								pifushuliang: {
														},
																								zhanghaojiage: {
														},
																								shouxufei: {
														},
																								pingtaibaozhang: {
														},
																								shifujine: {
														},
																								yonghuming: {
														},
																								xingming: {
														},
																								goumairiqi: {
														},
																								sfsh: {
														},
																								shhf: {
														},
																								ispay: {
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
				http("yingxionglianmenggoumai/info/" + id,"GET",{},(res)=>{
					if(res.code == 0){
						ruleForm = res.data
						setSelectOption();
						// 设置图片src
						showImg();
						// 数据填充
						dataBind();
						// 富文本框回显	
						setContent();
																																																																																																																																																																																																																																																																																						//注册表单验证
						$(validform());
					}
				});
			}else{
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
																																																																																																																											$("#goumairiqiDate").datetimepicker({ 
					autoclose: true,
					format:'yyyy-mm-dd hh:ii:ss',
					minuteStep:1,
					language:'zh-CN',
				});
																												
		}

		function calculation(){
			//积
			var x = 0;
			//和
			var y = 0;
			var flag = 0;
																																																																																																																																																																																																																																		if($("#zhanghaojiage").val() != null && $("#zhanghaojiage").val() != ""){
								y = y + parseFloat($("#zhanghaojiage").val());
							}
																								if($("#shouxufei").val() != null && $("#shouxufei").val() != ""){
								y = y + parseFloat($("#shouxufei").val());
							}
																																																																																																								$("#shifujine").val(y);
																																																			}
		function calculationSE(colName){
			//单列求和接口
			http("yingxionglianmenggoumai"+colName,"GET",{
				tableName: "yingxionglianmenggoumai",
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
																					if(res.data !=null && res.data.yonghuming != null && res.data.yonghuming != ''){
							$('#yonghuming').val(res.data.yonghuming)
						}
								if(res.data !=null && res.data.xingming != null && res.data.xingming != ''){
							$('#xingming').val(res.data.xingming)
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
																$("#wangluodaqu").val(ruleForm.wangluodaqu);	
																$("#youxiqufu").val(ruleForm.youxiqufu);	
																$("#youxidengji").val(ruleForm.youxidengji);	
																$("#dangqianduanwei").val(ruleForm.dangqianduanwei);	
																$("#yingxiongshuliang").val(ruleForm.yingxiongshuliang);	
																$("#pifushuliang").val(ruleForm.pifushuliang);	
																$("#zhanghaojiage").val(ruleForm.zhanghaojiage);	
																$("#shouxufei").val(ruleForm.shouxufei);	
																$("#pingtaibaozhang").val(ruleForm.pingtaibaozhang);	
																$("#shifujine").val(ruleForm.shifujine);	
																$("#yonghuming").val(ruleForm.yonghuming);	
																$("#xingming").val(ruleForm.xingming);	
																$("#goumairiqi-input").val(ruleForm.goumairiqi);
											
																				$("#shhf").val(ruleForm.shhf);	
																$("#ispay").val(ruleForm.ispay);	
									}
		//图片显示
		function showImg(){
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

															$("#wangluodaqu").val(res.data.wangluodaqu);
													}
												if(res.data != null && res.data != '' && res.data.youxiqufu != null && res.data.youxiqufu != ''){

															$("#youxiqufu").val(res.data.youxiqufu);
													}
												if(res.data != null && res.data != '' && res.data.youxidengji != null && res.data.youxidengji != ''){

															$("#youxidengji").val(res.data.youxidengji);
													}
												if(res.data != null && res.data != '' && res.data.dangqianduanwei != null && res.data.dangqianduanwei != ''){

															$("#dangqianduanwei").val(res.data.dangqianduanwei);
													}
												if(res.data != null && res.data != '' && res.data.yingxiongshuliang != null && res.data.yingxiongshuliang != ''){

															$("#yingxiongshuliang").val(res.data.yingxiongshuliang);
													}
												if(res.data != null && res.data != '' && res.data.pifushuliang != null && res.data.pifushuliang != ''){

															$("#pifushuliang").val(res.data.pifushuliang);
													}
												if(res.data != null && res.data != '' && res.data.zhanghaojiage != null && res.data.zhanghaojiage != ''){

															$("#zhanghaojiage").val(res.data.zhanghaojiage);
													}
												if(res.data != null && res.data != '' && res.data.shouxufei != null && res.data.shouxufei != ''){

															$("#shouxufei").val(res.data.shouxufei);
													}
												if(res.data != null && res.data != '' && res.data.pingtaibaozhang != null && res.data.pingtaibaozhang != ''){

															$("#pingtaibaozhang").val(res.data.pingtaibaozhang);
													}
												if(res.data != null && res.data != '' && res.data.shifujine != null && res.data.shifujine != ''){

															$("#shifujine").val(res.data.shifujine);
													}
												if(res.data != null && res.data != '' && res.data.yonghuming != null && res.data.yonghuming != ''){

															$("#yonghuming").val(res.data.yonghuming);
													}
												if(res.data != null && res.data != '' && res.data.xingming != null && res.data.xingming != ''){

															$("#xingming").val(res.data.xingming);
													}
												if(res.data != null && res.data != '' && res.data.goumairiqi != null && res.data.goumairiqi != ''){

															$("#goumairiqi-input").val(res.data.goumairiqi);
								$('#goumairiqiFileName').val(res.data.goumairiqi)
													}
												if(res.data != null && res.data != '' && res.data.sfsh != null && res.data.sfsh != ''){

							
																				}
												if(res.data != null && res.data != '' && res.data.shhf != null && res.data.shhf != ''){

															$("#shhf").val(res.data.shhf);
													}
												if(res.data != null && res.data != '' && res.data.ispay != null && res.data.ispay != ''){

															$("#ispay").val(res.data.ispay);
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