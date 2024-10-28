<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
	<%@ include file="../../static/head.jsp"%>
</head>
<body>
	<div class="wrapper compact-wrapper">
		<%@ include file="../../static/mainHeader.jsp"%>
		<!-- Sidebar -->
		<%@ include file="../../static/sidebar.jsp"%>
		<!--面包屑-->
		<div class="main-panel">
			<div class="content">
				<div class="page-inner" style="padding-left: 10px; padding-right: 10px;">
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
								<a href="#">英雄联盟</a>
							</li>
						</ul>
					</div>

					<div class="col-md-12">
						<div class="col-md-12" style="padding-left: 0; padding-right: 0;">
						<div class="card">
							<div class="card-header">
								<div class="d-flex align-items-center">
									<h4 class="card-title">英雄联盟</h4>
									<button id="add-btn" onclick="add()" class="btn btn-primary btn-round ml-auto 新增" data-toggle="modal" data-target="#addRowModal">
										<i class="fa fa-plus"></i>
										添加
									</button>
									<button id="delete-btn" onclick="deleteMore()" class="btn btn-danger btn-round 删除">批量删除</button>
																	</div>
							</div>
							<div class="card-body" style="padding-left: 0; padding-right: 0;">
																<div class="table-responsive">
									<div id="add-row_wrapper" class="dataTables_wrapper container-fluid dt-bootstrap4 no-footer">
										<div class="row">
											<div class="col-sm-12 col-md-6" id="pageSizeSetting">
												<div class="dataTables_length" id="add-row_length">
													<label>
														<select name="add-row_length" id="selectPageSize" onchange="changePageSize()" aria-controls="add-row" class="form-control form-control-sm" >
															<option value="5">5</option>
															<option value="10">10</option>
															<option value="25">25</option>
															<option value="50">50</option>
														</select> 
													条每页</label>
												</div>
											</div>
										<div class="col-sm-12">
											<div id="add-row_filter" class="dataTables_filter">
																																																																																																								<label>商品编号 <input type="text" id="shangpinbianhaoSearch" class="form-control form-control-sm" placeholder="" aria-controls="add-row"></label>
																																																																																																										<label>网络大区</label>
																<select name="wangluodaqu" id="wangluodaquSelect">
																																	<option value=" "> </option>
																																																						<option value="电信">电信</option>
																																					<option value="网通">网通</option>
																																					<option value="体验服">体验服</option>
																																																		</select>
																																																																																	<label>游戏区服</label>
																<select name="youxiqufu" id="youxiqufuSelect">
																																	<option value=" "> </option>
																																																						<option value="艾欧尼亚">艾欧尼亚</option>
																																					<option value="征服之海">征服之海</option>
																																					<option value="战争学院">战争学院</option>
																																					<option value="影流">影流</option>
																																					<option value="水晶之痕迹">水晶之痕迹</option>
																																					<option value="皮尔特沃夫">皮尔特沃夫</option>
																																					<option value="守望之海">守望之海</option>
																																					<option value="皮城警备">皮城警备</option>
																																					<option value="诺斯萨科">诺斯萨科</option>
																																					<option value="雷瑟守备">雷瑟守备</option>
																																					<option value="卡拉曼达">卡拉曼达</option>
																																					<option value="均衡教派">均衡教派</option>
																																					<option value="巨神峰">巨神峰</option>
																																					<option value="黑色玫瑰">黑色玫瑰</option>
																																					<option value="钢铁烈阳">钢铁烈阳</option>
																																					<option value="裁决之地">裁决之地</option>
																																					<option value="班德尔城">班德尔城</option>
																																					<option value="暗影岛">暗影岛</option>
																																					<option value="祖安">祖安</option>
																																					<option value="男爵领域">男爵领域</option>
																																					<option value="比尔吉沃特">比尔吉沃特</option>
																																					<option value="德玛西亚">德玛西亚</option>
																																					<option value="弗雷尔卓德">弗雷尔卓德</option>
																																					<option value="无畏先锋">无畏先锋</option>
																																					<option value="怒瑞玛">怒瑞玛</option>
																																					<option value="扭曲丛林">扭曲丛林</option>
																																					<option value="巨龙巢穴">巨龙巢穴</option>
																																																		</select>
																																																																																	<label>其他</label>
																<select name="qita" id="qitaSelect">
																																	<option value=" "> </option>
																																																						<option value="峡谷巅峰">峡谷巅峰</option>
																																					<option value="教育网专区">教育网专区</option>
																																																		</select>
																																																																																	<label>限定皮肤</label>
																<select name="xiandingpifu" id="xiandingpifuSelect">
																																	<option value=" "> </option>
																																																						<option value="全部">全部</option>
																																					<option value="龙的传人">龙的传人</option>
																																					<option value="恐惧新星">恐惧新星</option>
																																					<option value="亚托克斯至臻">亚托克斯至臻</option>
																																					<option value="万夫莫开">万夫莫开</option>
																																					<option value="勇敢的心">勇敢的心</option>
																																					<option value="海克斯科技">海克斯科技</option>
																																					<option value="卡沙至臻">卡沙至臻</option>
																																					<option value="地底世界">地底世界</option>
																																					<option value="庆典女皇">庆典女皇</option>
																																					<option value="冰原核弹">冰原核弹</option>
																																					<option value="御星魔矢">御星魔矢</option>
																																					<option value="阿卡丽至臻">阿卡丽至臻</option>
																																					<option value="至死不渝">至死不渝</option>
																																					<option value="烈焰美人薇恩">烈焰美人薇恩</option>
																																					<option value="奥斯曼大帝">奥斯曼大帝</option>
																																																		</select>
																																																																																																																																																																																																																																																																																																																		<label>价格区间 <input type="text" id="jiagequjianSearch" class="form-control form-control-sm" placeholder="" aria-controls="add-row"></label>
																																																																																																										<label>平台保障 <input type="text" id="pingtaibaozhangSearch" class="form-control form-control-sm" placeholder="" aria-controls="add-row"></label>
																																																																																																																																																																																<button onclick="search()">查询</button>
											</div>
										</div>
									</div>
										<div class="row"><div class="col-sm-12"><table id="add-row" class="display table table-striped table-hover dataTable no-footer" role="grid" aria-describedby="add-row_info">
										<thead>
											<!-- 升序图标class="sorting_asc" 降序改为desc -->
											<tr role="row">
													<th style="width: 10px;"><input type="checkbox" onclick="chooseAll()"></th>
																																						<th id="maijiazhanghaoTh" class="sorting" onclick="sort('maijiazhanghao')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">卖家账号</th>
																																																			<th id="maijiaxingmingTh" class="sorting" onclick="sort('maijiaxingming')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">卖家姓名</th>
																																																			<th id="shangpinbianhaoTh" class="sorting" onclick="sort('shangpinbianhao')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">商品编号</th>
																																																			<th id="zhanghaobiaotiTh" class="sorting" onclick="sort('zhanghaobiaoti')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">账号标题</th>
																																																			<th id="wangluodaquTh" class="sorting" onclick="sort('wangluodaqu')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">网络大区</th>
																																																			<th id="youxiqufuTh" class="sorting" onclick="sort('youxiqufu')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">游戏区服</th>
																																																			<th id="qitaTh" class="sorting" onclick="sort('qita')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">其他</th>
																																																			<th id="xiandingpifuTh" class="sorting" onclick="sort('xiandingpifu')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">限定皮肤</th>
																																																			<th id="youxidengjiTh" class="sorting" onclick="sort('youxidengji')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">游戏等级</th>
																																																			<th id="zuigaoduanweiTh" class="sorting" onclick="sort('zuigaoduanwei')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">最高段位</th>
																																																			<th id="dangqianduanweiTh" class="sorting" onclick="sort('dangqianduanwei')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">当前段位</th>
																																																			<th id="yingxiongshuliangTh" class="sorting" onclick="sort('yingxiongshuliang')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">英雄数量</th>
																																																			<th id="pifushuliangTh" class="sorting" onclick="sort('pifushuliang')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">皮肤数量</th>
																																																			<th id="qqdengjiTh" class="sorting" onclick="sort('qqdengji')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">qq等级</th>
																																																			<th id="qqhaoyouTh" class="sorting" onclick="sort('qqhaoyou')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">qq好友</th>
																																																			
																													<th tabindex="0" aria-controls="add-row" rowspan="1" colspan="1" style="min-width: 100px;">封面图片</th>
																																																																	<th id="zhanghaojiageTh" class="sorting" onclick="sort('zhanghaojiage')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">账号价格</th>
																																																			<th id="jiagequjianTh" class="sorting" onclick="sort('jiagequjian')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">价格区间</th>
																																																			<th id="shouxufeiTh" class="sorting" onclick="sort('shouxufei')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">手续费</th>
																																																			<th id="pingtaibaozhangTh" class="sorting" onclick="sort('pingtaibaozhang')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">平台保障</th>
																																																			
																													<th tabindex="0" aria-controls="add-row" rowspan="1" colspan="1" style="min-width: 100px;">账号简介</th>
																																																																	<th id="faburiqiTh" class="sorting" onclick="sort('faburiqi')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">发布日期</th>
																																																			<th id="zhanghaoxiangqingTh" class="sorting" onclick="sort('zhanghaoxiangqing')" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">账号详情</th>
																																						
																																						
																																					<th style="width: 100px;" tabindex="0" aria-controls="add-row" rowspan="1" colspan="1">
													操作
												</th>
											</tr>
										</thead>
										<tbody>							
											
										</tbody>
									</table>
								</div>
							</div>
							<div class="row">
								<div class="col-sm-12 col-md-5">
									<div class="dataTables_info" id="add-row_info" role="status" aria-live="polite">当前第 1 页，共 1 页</div>
								</div>
								<div class="col-sm-12 col-md-7">
									<div class="dataTables_paginate paging_simple_numbers" id="add-row_paginate">
										<ul class="pagination">
											<li class="paginate_button page-item previous disabled" id="add-row_previous">
												<a href="#" onclick="pageNumChange('pre')" aria-controls="add-row" data-dt-idx="0" tabindex="0" class="page-link">上一页</a>
											</li>
											<li class="paginate_button page-item next disabled" id="add-row_next">
												<a href="#" onclick="pageNumChange('next')" aria-controls="add-row" data-dt-idx="" tabindex="0" class="page-link">下一页</a>
											</li>
										</ul>
									</div>
								</div>
							</div>
								</div>
								</div>
							</div>
						</div>
					</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		
		<!-- End Custom template -->
	
	<!--   Core JS Files   -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/core/jquery.3.2.1.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/core/popper.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/core/bootstrap.min.js"></script>
	<!-- jQuery UI -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/plugin/jquery-ui-1.12.1.custom/jquery-ui.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/assets/js/plugin/jquery-ui-touch-punch/jquery.ui.touch-punch.min.js"></script>
	
	<!-- jQuery Scrollbar -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/plugin/jquery-scrollbar/jquery.scrollbar.min.js"></script>
	<!-- Datatables -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/plugin/datatables/datatables.min.js"></script>
	<!-- Atlantis JS -->
	<script src="${pageContext.request.contextPath}/resources/assets/js/atlantis.min.js"></script>
	<!-- Atlantis DEMO methods, don't include it in your project! -->
	<!--<script src="${pageContext.request.contextPath}/resources/assets/js/setting-demo2.js"></script> -->
	<script language="javascript" type="text/javascript" src="${pageContext.request.contextPath}/resources/My97DatePicker/WdatePicker.js"></script>
	<script >
		<%@ include file="../../utils/menu.jsp"%>
		<%@ include file="../../static/setMenu.js"%>
		<%@ include file="../../utils/baseUrl.jsp"%>
		<%@ include file="../../static/getRoleButtons.js"%>
		<%@ include file="../../static/crossBtnControl.js"%>
		var tableName = "yingxionglianmeng";
		var pageType = "list";
	  	var searchForm = { key: ""};
		var pageIndex = 1;
		var pageSize = 10;
		var totalPage = 0;
		var dataList = [];
		var sortColumn = '';
		var sortOrder= '';
		var ids = [];
		var checkAll = false;
		
					      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      				      			  
		function init() {
			// 满足条件渲染提醒接口
																																																																																																																																																																																				}
		// 改变每页记录条数
		function changePageSize() {
		    var selection = document.getElementById('selectPageSize');
		    var index = selection.selectedIndex;
			pageSize = selection.options[index].value;
			getDataList();
        }
		//排序
		function sort(columnName){
			var iconId = '#'+columnName+'Th'
			$('.sorting_asc').attr('class','sorting')
			$('.sorting_desc').attr('class','sorting')
			if(sortColumn == '' || sortColumn != columnName){
				sortColumn = columnName;
				sortOrder = 'asc';
				$(iconId).attr('class','sorting_asc');
			}
			if(sortColumn == columnName){
				if(sortOrder == 'asc'){
					sortOrder = 'desc';
					$(iconId).attr('class','sorting_desc');
				}else{
					sortOrder = 'asc';
					$(iconId).attr('class','sorting_asc');
				}
			}
			pageIndex = 1;
			getDataList();
		}
			
		// 查询
		function search(){
			searchForm = { key: ""};
																															if($('#shangpinbianhaoSearch').val() != null && $('#shangpinbianhaoSearch').val() != ''){
						searchForm.shangpinbianhao ="%" +  $('#shangpinbianhaoSearch').val() + "%";
					}				
																																	var wangluodaquIndex = document.getElementById("wangluodaquSelect").selectedIndex;
					var wangluodaquOptions = document.getElementById("wangluodaquSelect").options;
					var wangluodaquSelectedOption = wangluodaquOptions[wangluodaquIndex]
					if(wangluodaquSelectedOption.text != null &&  wangluodaquSelectedOption.text != ''){
						searchForm.wangluodaqu = "%" + wangluodaquSelectedOption.text + "%";
					}		
																										var youxiqufuIndex = document.getElementById("youxiqufuSelect").selectedIndex;
					var youxiqufuOptions = document.getElementById("youxiqufuSelect").options;
					var youxiqufuSelectedOption = youxiqufuOptions[youxiqufuIndex]
					if(youxiqufuSelectedOption.text != null &&  youxiqufuSelectedOption.text != ''){
						searchForm.youxiqufu = "%" + youxiqufuSelectedOption.text + "%";
					}		
																										var qitaIndex = document.getElementById("qitaSelect").selectedIndex;
					var qitaOptions = document.getElementById("qitaSelect").options;
					var qitaSelectedOption = qitaOptions[qitaIndex]
					if(qitaSelectedOption.text != null &&  qitaSelectedOption.text != ''){
						searchForm.qita = "%" + qitaSelectedOption.text + "%";
					}		
																										var xiandingpifuIndex = document.getElementById("xiandingpifuSelect").selectedIndex;
					var xiandingpifuOptions = document.getElementById("xiandingpifuSelect").options;
					var xiandingpifuSelectedOption = xiandingpifuOptions[xiandingpifuIndex]
					if(xiandingpifuSelectedOption.text != null &&  xiandingpifuSelectedOption.text != ''){
						searchForm.xiandingpifu = "%" + xiandingpifuSelectedOption.text + "%";
					}		
																																																																																									if($('#jiagequjianSearch').val() != null && $('#jiagequjianSearch').val() != ''){
						searchForm.jiagequjian ="%" +  $('#jiagequjianSearch').val() + "%";
					}				
																																	if($('#pingtaibaozhangSearch').val() != null && $('#pingtaibaozhangSearch').val() != ''){
						searchForm.pingtaibaozhang ="%" +  $('#pingtaibaozhangSearch').val() + "%";
					}				
																																																		getDataList();
		}
		// 获取数据列表
        function getDataList() {
			http("yingxionglianmeng/page","GET",{
				page: pageIndex,
				limit: pageSize,
				sort: sortColumn,
				order: sortOrder,
																																								shangpinbianhao : searchForm.shangpinbianhao,	
																																										wangluodaqu : searchForm.wangluodaqu,	
																																	youxiqufu : searchForm.youxiqufu,	
																																	qita : searchForm.qita,	
																																	xiandingpifu : searchForm.xiandingpifu,	
																																																																																																																		jiagequjian : searchForm.jiagequjian,	
																																										pingtaibaozhang : searchForm.pingtaibaozhang,	
																																																															},(res)=>{
				if(res.code == 0){
					clear();
					dataList = res.data.list;
					totalPage = res.data.totalPage;
					//var tbody = document.getElementById('tbMain');
					for(var i = 0;i < dataList.length; i++){ //遍历一下表格数据  
						var trow = setDataRow(dataList[i]); //定义一个方法,返回tr数据 
						$('tbody').append(trow); 
					}
					pagination(); //渲染翻页组件
					getRoleButtons();//按钮权限控制
				}
			});
        }
		// 渲染表格数据
		function setDataRow(item){
			//创建行 
			var row = document.createElement('tr'); 
			row.setAttribute('class','useOnce');
			row.setAttribute('role','row');
			// 创建 勾选框 列
			var checkbox = document.createElement('td');
			checkbox.innerHTML = "<input type='checkbox' name='chk' value=" + item.id +">";
			row.appendChild(checkbox);

							var maijiazhanghaoCell  = document.createElement('td');

												 maijiazhanghaoCell.innerHTML = item.maijiazhanghao;

                
													row.appendChild(maijiazhanghaoCell);
				
            				var maijiaxingmingCell  = document.createElement('td');

												 maijiaxingmingCell.innerHTML = item.maijiaxingming;

                
													row.appendChild(maijiaxingmingCell);
				
            				var shangpinbianhaoCell  = document.createElement('td');

												 shangpinbianhaoCell.innerHTML = item.shangpinbianhao;

                
													row.appendChild(shangpinbianhaoCell);
				
            				var zhanghaobiaotiCell  = document.createElement('td');

												 zhanghaobiaotiCell.innerHTML = item.zhanghaobiaoti;

                
													row.appendChild(zhanghaobiaotiCell);
				
            				var wangluodaquCell  = document.createElement('td');

												  wangluodaquCell.innerHTML = item.wangluodaqu; 
				  
                
													row.appendChild(wangluodaquCell);
				
            				var youxiqufuCell  = document.createElement('td');

												  youxiqufuCell.innerHTML = item.youxiqufu; 
				  
                
													row.appendChild(youxiqufuCell);
				
            				var qitaCell  = document.createElement('td');

												  qitaCell.innerHTML = item.qita; 
				  
                
													row.appendChild(qitaCell);
				
            				var xiandingpifuCell  = document.createElement('td');

												  xiandingpifuCell.innerHTML = item.xiandingpifu; 
				  
                
													row.appendChild(xiandingpifuCell);
				
            				var youxidengjiCell  = document.createElement('td');

												 youxidengjiCell.innerHTML = item.youxidengji;

                
													row.appendChild(youxidengjiCell);
				
            				var zuigaoduanweiCell  = document.createElement('td');

												  zuigaoduanweiCell.innerHTML = item.zuigaoduanwei; 
				  
                
													row.appendChild(zuigaoduanweiCell);
				
            				var dangqianduanweiCell  = document.createElement('td');

												  dangqianduanweiCell.innerHTML = item.dangqianduanwei; 
				  
                
													row.appendChild(dangqianduanweiCell);
				
            				var yingxiongshuliangCell  = document.createElement('td');

												 yingxiongshuliangCell.innerHTML = item.yingxiongshuliang;

                
													row.appendChild(yingxiongshuliangCell);
				
            				var pifushuliangCell  = document.createElement('td');

												 pifushuliangCell.innerHTML = item.pifushuliang;

                
													row.appendChild(pifushuliangCell);
				
            				var qqdengjiCell  = document.createElement('td');

												 qqdengjiCell.innerHTML = item.qqdengji;

                
													row.appendChild(qqdengjiCell);
				
            				var qqhaoyouCell  = document.createElement('td');

												  qqhaoyouCell.innerHTML = item.qqhaoyou; 
				  
                
													row.appendChild(qqhaoyouCell);
				
            				var fengmiantupianCell  = document.createElement('td');

								                  var fengmiantupianImg = document.createElement('img');
				  fengmiantupianImg.setAttribute('src',item.fengmiantupian);
				  fengmiantupianImg.setAttribute('height','100px');
				  fengmiantupianImg.setAttribute('width','100px');
				  fengmiantupianCell.appendChild(fengmiantupianImg);

				
													row.appendChild(fengmiantupianCell);
				
            				var zhanghaojiageCell  = document.createElement('td');

												 zhanghaojiageCell.innerHTML = item.zhanghaojiage;

                
													row.appendChild(zhanghaojiageCell);
				
            				var jiagequjianCell  = document.createElement('td');

												  jiagequjianCell.innerHTML = item.jiagequjian; 
				  
                
													row.appendChild(jiagequjianCell);
				
            				var shouxufeiCell  = document.createElement('td');

												  shouxufeiCell.innerHTML = item.shouxufei; 
				  
                
													row.appendChild(shouxufeiCell);
				
            				var pingtaibaozhangCell  = document.createElement('td');

												  pingtaibaozhangCell.innerHTML = item.pingtaibaozhang; 
				  
                
													row.appendChild(pingtaibaozhangCell);
				
            				var zhanghaojianjieCell  = document.createElement('td');

												  if(item.zhanghaojianjie != null && item.zhanghaojianjie != "" && item.zhanghaojianjie.length >= 11){
				  	zhanghaojianjieCell.innerHTML = item.zhanghaojianjie.substring(0, 10) + "..."; 
				  }else{
				  	zhanghaojianjieCell.innerHTML = item.zhanghaojianjie;
				  }

				
													row.appendChild(zhanghaojianjieCell);
				
            				var faburiqiCell  = document.createElement('td');

												  faburiqiCell.innerHTML = item.faburiqi;

				
													row.appendChild(faburiqiCell);
				
            				var zhanghaoxiangqingCell  = document.createElement('td');

												  //如果图文详情包含图片
				  if(item.zhanghaoxiangqing && item.zhanghaoxiangqing.indexOf('img') != -1){
					//暂时只考虑图片+文字 和 文字+图片的情况
					var beginIndex = item.zhanghaoxiangqing.indexOf('<img');
					var endIndex = item.zhanghaoxiangqing.indexOf('>');				
					zhanghaoxiangqingCell.innerHTML = item.zhanghaoxiangqing.substring(beginIndex, endIndex+1).replace("img","img width='100' height='100'");				
				  }else{
				  	 if(item.zhanghaoxiangqing != null && item.zhanghaoxiangqing != "" && item.zhanghaoxiangqing.length >= 11){
				  		zhanghaoxiangqingCell.innerHTML = item.zhanghaoxiangqing.substring(0, 10) + "..."; 
				  	}else{
				  		zhanghaoxiangqingCell.innerHTML = item.zhanghaoxiangqing;
				 	}
				  }

                
													row.appendChild(zhanghaoxiangqingCell);
				
            				var thumbsupnumCell  = document.createElement('td');

								
                
								
				
            				var crazilynumCell  = document.createElement('td');

								
                
								
				
            			// 每行 按钮
			var btnGroup = document.createElement('div');
			btnGroup.setAttribute("class","form-button-action");
			
			
				//跨表按钮
				var crossBtn = document.createElement('button');
				crossBtn.innerHTML = "购买"
				crossBtn.setAttribute("type","button")
				crossBtn.setAttribute("class","btn btn-secondary btn-xs");
				crossBtn.setAttribute("data-original-title","购买");
				crossBtn.setAttribute("onclick","crossTable(" + item.id +",\"yingxionglianmenggoumai\")");
				if(crossBtnControl('购买') == true){
					btnGroup.appendChild(crossBtn);
				}   
				var crossBtn = document.createElement('button');
				crossBtn.innerHTML = "私信"
				crossBtn.setAttribute("type","button")
				crossBtn.setAttribute("class","btn btn-secondary btn-xs");
				crossBtn.setAttribute("data-original-title","私信");
				crossBtn.setAttribute("onclick","crossTable(" + item.id +",\"yingxionglianmengsixin\")");
				if(crossBtnControl('私信') == true){
					btnGroup.appendChild(crossBtn);
				}   

			//编辑按钮
			var editBtn = document.createElement('button');
			var editAttr = 'edit(' +  item.id + ')';
			editBtn.setAttribute('onclick',editAttr);
			editBtn.setAttribute("type","button");
			editBtn.setAttribute("class","btn btn-warning btn-xs 修改");
			editBtn.innerHTML = "修改";
			btnGroup.appendChild(editBtn);
			//删除按钮
			var deleteBtn = document.createElement('button');
			var deleteAttr = 'remove(' +  item.id + ')';
			deleteBtn.setAttribute('onclick',deleteAttr);
			deleteBtn.setAttribute("type","button");
			deleteBtn.setAttribute("class","btn btn-danger btn-xs 删除");
			deleteBtn.innerHTML = "删除";
			btnGroup.appendChild(deleteBtn);
			var btnsTd = document.createElement('td');
			btnsTd.appendChild(btnGroup);
			row.appendChild(btnsTd);
			return row;
		}
		// 翻页
        function pageNumChange(val) {
            if(val == 'pre') {
                pageIndex--;
            }else if(val == 'next'){
                pageIndex++;
            }else{
                pageIndex = val;
            }
			getDataList();
        }
		// 下载
		function download(url){
			window.open(url);
		}
		// 打开新窗口播放媒体
		function mediaPlay(url){
			window.open(url);
		}
		// 渲染翻页组件
		function pagination() {
			var beginIndex = pageIndex;
			var endIndex = pageIndex;
			var point = 4;
			//计算页码
			for(var i=0;i<3;i++){
				if(endIndex==totalPage){ break;}
				endIndex++;
				point--;
			}
			for(var i=0;i<3;i++){
				if(beginIndex==1){break;}
				beginIndex--;
				point--;
			}
			if(point>0){
				while (point>0){
					if(endIndex==totalPage){ break;}
					endIndex++;
					point--;
				}
				while (point>0){
					if(beginIndex==1){ break;}
					beginIndex--;
					point--
				}
			}
			// 是否显示 前一页 按钮
			if(pageIndex>1){
				$('#add-row_previous').show();
			}else{
				$('#add-row_previous').hide();
			}
			// 渲染页码按钮
			for(var i=beginIndex;i<=endIndex;i++){
				var pageNum = document.createElement('li');
				pageNum.setAttribute('onclick',"pageNumChange("+i+")");
				if(pageIndex == i){
					pageNum.setAttribute('class','paginate_button page-item active useOnce');
				}else{
					pageNum.setAttribute('class','paginate_button page-item useOnce');
				}
				var pageHref = document.createElement('a');
				pageHref.setAttribute('href','#');
				pageHref.setAttribute('aria-controls','add-row');
				pageHref.setAttribute("data-dt-idx",i);
				pageHref.setAttribute("tabindex","0");
				pageHref.setAttribute("class","page-link");
				pageHref.innerHTML = i;
				pageNum.appendChild(pageHref);
				$("#add-row_next").before(pageNum);
			}
			// 是否显示 下一页 按钮
			if(pageIndex < totalPage){
				$('#add-row_next').show();
			}else{
				$('#add-row_next').hide();
			}
			var pageNumInfo = "当前第 "+ pageIndex + " 页，共 "+ totalPage + " 页";
			document.getElementById("add-row_info").innerHTML = pageNumInfo;
		}
		// 跳转到指定页
		function toThatPage(){
			//var index = document.getElementById('pageIndexInput').value;
			if(index<0 || index>totalPage){
				alert('请输入正确的页码');
			}else {
				pageNumChange(index);
			}
		}
		// 全选/全不选
		function chooseAll(){
			checkAll = !checkAll;
			var boxs = document.getElementsByName("chk");
			for(var i=0;i<boxs.length;i++){
				boxs[i].checked= checkAll;
			}
		}
		// 批量删除
		function deleteMore(){
			ids = []
			var boxs = document.getElementsByName("chk");
			for(var i=0;i<boxs.length;i++){
				if(boxs[i].checked){
					ids.push(boxs[i].value)
				}
			}
			if(ids.length == 0){
				alert('请勾选要删除的记录');
			}else{
				remove(ids);
			}
		}
		// 删除
        function remove(id) { 
            var mymessage = confirm("真的要删除吗？");
            if (mymessage == true) {
				var paramArray = [];
				if (id == ids){
					paramArray = id;
				}else{
					paramArray.push(id);
				}             
				httpJson("yingxionglianmeng/delete","POST",paramArray,(res)=>{
					if(res.code == 0){
						alert('删除成功');
						getDataList();		
					}
				});
            }
            else {
                alert("已取消操作");
            }
        }
		// 用户登出
        <%@ include file="../../static/logout.jsp"%>

		//修改
        function edit(id) {
            window.sessionStorage.setItem('id', id)
            window.location.href = "add-or-update.jsp"
        }

		//清除会重复渲染的节点
        function clear(){
        	var elements = document.getElementsByClassName('useOnce');
        	for(var i = elements.length - 1; i >= 0; i--) { 
        	  elements[i].parentNode.removeChild(elements[i]); 
        	}
        }
		//添加
		function add(){
			window.location.href = "add-or-update.jsp"
		}
		//单列求和
		function getSum(colName){
			http("yingxionglianmeng" + colName,"GET",{
				tableName: "yingxionglianmeng",
				columnName: colName
			},(res)=>{
				if(res.code == 0){
					return res.data.sum;
				}
			});
		}
																																																																																																																															
		// 查看详情
		function detail(id){
			window.sessionStorage.setItem("id", id);
			//window.sessionStorage.setItem("ifView", true);
			window.location.href = "info.jsp";
		}

																																																																																																																															
		function crossTable(id,crossTabName){
			window.sessionStorage.setItem('crossTableId',id);
			window.sessionStorage.setItem('crossTableName',"yingxionglianmeng");
			var url = "../"+crossTabName+"/add-or-update.jsp";
			window.location.href = url;
        }

        
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
			init();
            getDataList();
																																																																																																																																																												<%@ include file="../../static/myInfo.js"%>
		});
	</script>
</body>
</html>