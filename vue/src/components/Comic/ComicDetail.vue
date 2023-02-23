<template>
    <div class="hello">
		<!-- 动漫展示 -->
		<div class="zong">
			<div class="zuo">
				<img :src="imgurl" class="img">
				<div class="you">
					 <p>昵称:肿么</p>
					 <p>地区:</p>
					 <p>标签:</p>
					 <p>年份:</p>
					 <p>热度:</p>
					 <p>最近更新:</p>
					 <p>总集数:</p>
					 <p>更新到多少集:</p>
					 <div  class="anniu"> 
						<el-button @click="show3 = !show3">详情</el-button>
						<div style="margin-top: 20px; height: 200px;">
      <el-collapse-transition>
        <div v-show="show3">
          <div class="transition-box">介绍详情的</div>
        </div>
      </el-collapse-transition>
    		</div>
				</div>
   			</div>
			   

			
  			</div>
			<div class="bianjie"></div>
			<!-- 评论 -->
				<div>
					评论的
				</div>
		</div>
   
   <!-- 评论显示 -->
   <div>
		
   </div>

    </div>
  </template>
  
  <script>
  export default {
    name: 'HelloWorld',
    props: {
      msg: String
    },
	data(){
			return {
				imgurl:"https://tse1-mm.cn.bing.net/th/id/OIP-C.l9T-NQJt5y8YF4iMTcbuSgAAAA?w=148&h=150&c=7&r=0&o=5&dpr=1.3&pid=1.7",
				show3: false
			}
		},
  }
  </script>
  
  <!-- Add "scoped" attribute to limit CSS to this component only -->
  <style scoped>
  
  .anniu{

  }
  .you{
	border:1px solid #e7edec;
	margin-left: 10px;
	width: 300px;
	height: 380px;
	background-color: #ffffff;
  }
  .transition-box {
    margin-left: 35px;
    width: 200px;
    height: 200px;
    border-radius: 4px;
	background-image: linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%);
    text-align: center;
    color: #fff;
    padding: 40px 20px;
    box-sizing: border-box;
    margin-right: 20px;
  }
  .bianjie{
	width: 100%;
	border:1px solid #000;
  }
  .zong{
	
	display: flex;
	flex-direction: column;
	width: 100%;
	height: 100%;
	justify-content: center; /*水平居中*/
    align-items: Center; /*垂直居中*/
  }
 .zuo{
	margin-top: 30px;
	width: 500px;
	height: 600px;
	display: flex;
	flex-direction: row;
 }
.img{
	margin-top: 30px;
	width: 250px;
	height: 350px;
	border-radius: 2%;
}
  </style>
  