<template>
	
		<div  class="beijing">
			<el-header class="header">
				<el-popover
    placement="top-start"
    title="点一下就行"
    width="60"
    trigger="hover"
	background-color="#d3dce6">
    <el-button slot="reference"><router-link to="/" class="tocomic">进入动漫世界</router-link></el-button>
  </el-popover>
				
			</el-header>
		<div class="top">
			<!-- 头像 -->
			<div><img :src="url" class="img01" v-if="user.avatra==null"><img :src="user.avatra" class="img01" v-if="user.avatra!=null"></div>
			<!-- 文本 -->
			<div class="wenben">
				<h1  class="wenben01">{{user.userName}}</h1>
				<h2  class="wenben02">普通用户</h2>
				<h3  class="wenben03">{{user.createTime}}</h3>
			</div>
			<!-- 点赞和浏览记录 -->
			<div class="like">
				<p>点赞</p>
				<p>3</p>
			</div>
			<div class="jilu">
				<p>浏览记录</p>
				<p>355</p>
			</div>
		</div>
		<div class="kuan">
		<el-container>
  <el-container>
	<div class="sidebar">
		<el-aside width="200px"><Sidebar :menus="menus" /></el-aside>
	</div>
    
    <el-container>
		<div class="main">
			<el-main><router-view/></el-main>
		</div>
      
    </el-container>
  </el-container>
</el-container>
		</div>
	</div>

</template>
<script>
import Sidebar from "@/components/fragements/Usersidebar.vue";
import BreadCrumb from "@/components/fragements/BreadCrumb.vue";
export default {
	name: "User",
	components: {
		Sidebar,
		BreadCrumb,
	},
	data() {
		return {
			menus: this.$TestData.user,
			url:"https://tse1-mm.cn.bing.net/th/id/OIP-C.l9T-NQJt5y8YF4iMTcbuSgAAAA?w=148&h=150&c=7&r=0&o=5&dpr=1.3&pid=1.7",
			user:this.$TestData.yonghu
		};
	},
	methods: {
		mei: function () {
			console.log(this.$TestData.user);
		}
	}
};
</script>
<style scoped>

.tocomic{
	font-weight: 1000;
	text-decoration: none;
}
.like{
	font-weight: 1000;
	margin-top: 5%;
	margin-left: 50%;
}
.jilu{
	font-weight: 1000;
	margin-left: 1%;
	margin-top: 5%;
}
.wenben{
	margin-left: 10px;
	margin-top: 30px;
}
.wenben01{
	margin-left: 10px;
	font-weight: 1000;
	font-size: 24px;
}
.wenben02{
	font-size: 15px;
	color: #51c5ef;
}
.wenben03{
	font-size: 12px;
}
.beijing{
	height: 800px;
	z-index: 999;
  right: 0px;
	width: 1450px;
	background-color: #d3dce6;
}
.img01{
	border-radius: 2%;
	margin-top: 50px;
	margin-left: 20px;
	width: 100px;
	height: 100px;
}
.kuan{
	width: 90%;
}
.top{
	display: flex;
	flex-direction: row;
	border-radius: 1%;
	width: 60%;
	height: 200px;
	margin-left: 300px;
	background-color: rgb(255, 255, 255);
}


.sidebar{
	margin-left: 320px;
	margin-top: 20px;
	background-color: #d3dce6;
	color: #333;
	text-align: center;
	line-height: 500px;
	border: 2px;
}

.main{
	margin-left: 20px;
	margin-top: 20px;
	background-color: rgb(255, 255, 255);
	color: #333;
	height: 400px;
	width: 620px;
	border: 2px;
	/* text-align: center; */
	/* line-height: 160px; */
}




</style>
