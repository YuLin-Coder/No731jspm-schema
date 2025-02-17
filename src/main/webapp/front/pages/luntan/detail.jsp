<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i&display=swap" rel="stylesheet">
		<link rel="shortcut icon" type="image/x-icon" href="../../assetsimages/x-icon/agricul.png">
		<link rel="stylesheet" href="../../assets/css/relys/animate.css">
		<link rel="stylesheet" href="../../assets/css/relys/bootstrap.min.css">
		<link rel="stylesheet" href="../../assets/css/relys/all.min.css">
		<link rel="stylesheet" href="../../assets/css/relys/icofont.min.css">
		<link rel="stylesheet" href="../../assets/css/relys/lightcase.css">
		<link rel="stylesheet" href="../../assets/css/relys/swiper.min.css">
		<link rel="stylesheet" href="../../assets/css/relys/style.css">
	</head>
	<body>
		<div id="app">
			<!-- Page Header Section Start Here -->
			<section class="page-header bg_img padding-tb">
			    <div class="overlay"></div>
			    <div class="container">
			        <div class="page-header-content-area">
			            <h4 class="ph-title">帖子详情</h4>
			            <ul class="agri-ul">
			                <li><a>首页</a></li>
			                <li><a class="active">帖子详情</a></li>
			            </ul>
			        </div>
			    </div>
			</section>
			<!-- Page Header Section Ending Here -->
			<!-- Blog Section Start Here -->
			<div class="blog-section blog-single padding-tb">
			    <div class="container">
			        <div class="section-wrapper">
			            <div class="row justify-content-center">
			                <div class="col-lg-9 col-12">
			                    <article>
			                        <div class="post-item-2">
			                            <div class="post-inner">
			                                <div class="post-thumb">
			                                    <img src="../../assets/images/author.jpg" alt="blog">
			                                </div>
			                                <div class="post-content">
			                                    <h4>{{detail.title}}</h4>
			                                    <div class="meta-post">
			                                        <p><span class="post-date">发表于<a href="#">{{detail.username}}</a></span></p>
			                                    </div>
			                                    <p>{{detail.content}}</p>
			                                </div>
			                            </div>
			                        </div>
			                        <div id="comments" class="comments">
			                            <h4 class="title-border" v-if="detail.childs">{{detail.childs.length}} 条回复</h4>
			                            <ul class="agri-ul comment-list">
			                                <li class="comment" id="li-comment-1" v-for="(ele, idx) in detail.childs">
			                                    <div class="com-content">
			                                        <div class="com-title">
			                                            <div class="com-title-meta">
			                                                <h6><a href="#" class="url">{{ele.username}}</a></h6>
			                                            </div>
			                                        </div>
			                                        <p>{{ele.content}}</p>
			                                    </div>
			                                </li>
			                            </ul>
			                        </div>
			                    </article>
			                </div>
			            </div>
			        </div>
			    </div>
			</div>
			<!-- Blog Section ENding Here -->
			<!-- newsletters section start here -->
			<div class="newsletter-section">
				<div class="container">
					<div class="row justify-content-lg-between justify-content-center align-items-center">
						<div class="col-lg-6 col-12">
							<div class="newsletter-title">
								<h4>回复主贴</h4>
							</div>
						</div>
						<div class="col-lg-6 col-12">
							<div class="newsletter-form">
								<form @submit.prevent="addFroum" class="d-flex flex-wrap">
									<input v-model="content" type="text" placeholder="您的回复" class="input-email">
									<input type="submit" value="回复" class="subscribe-btn">
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<!-- newsletters section ending here -->
		</div>
		<script src="../../assets/js/relys/jquery.js"></script>
		<script src="../../assets/js/relys/vue.js"></script>
		<script src="../../assets/js/relys/vue.min.js"></script>
		<script src="../../assets/js/api/api.js"></script>
		<script src="../../assets/js/api/tplist.js"></script>
		<script src="../../assets/js/api/defaultuser.js"></script>
		<script src="../../assets/js/relys/utils.js"></script>
		<script type="text/javascript">
			var app = new Vue({
				el: "#app",
				data: {
					detail: {
						childs: []
					},
					id: "",
					content: ""
				},
				created(){
					var id = getParam('id')
					this.id = id
					this.forumDetail(id)
				},
				methods: {
					forumDetail(id){
						httpJson(`forum/list/${id}`, "GET", "", (res) => {
							this.detail = res.data
						})
					},
					addFroum(){
						var usertable = localStorage.getItem("sessionTable")
						session(`${usertable}`, (res) => {
							if(res&&res.code==0){
								var user = res.data
								var data = {
									"title": "",
									"content": this.content,
									"parentid": this.id,
									"isdone": "开放",
									"userid": user.id
								}
								httpJson(`forum/save`, "POST", data, (data) => {
									if(data&&data.code==0){
										alert("回复成功")
										this.postshow = false
										this.forumDetail(this.id)
									}else{
										alert("回复失败")
									}
								})
							}else{
								alert("用户信息获取失败")
							}
						})
					},
				}
			})
		</script>
	</body>
</html>
