<template>
    <div class="hello">
    <h1>主页</h1>
      <router-link to="/login">登录</router-link>
      <button @click="loginout()">注销</button>
      <router-link to="/user"></router-link>


      <div class="all-wrapper">
    <!-- 创建外层容器 -->
    <div class="out-wrapper">
        <!-- 创建导航栏容器 -->
        <div class="header-wrapper">
           
            <!-- 创建导航栏 -->
            <div class="nav-bar">
                <ul class="navBar">
                    <li>
                        <a href="index.do">首页</a>
                    </li>
                    <li id="riben">
                        <a href="javascript:void(0);">日本动漫</a>
                    </li>
                    <li id="guo">
                        <a href="javascript:void(0);">国产动漫</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">动漫电影</a>
                    </li>
                    <li>
                        <a href="news/news.do">动漫资讯</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">欧美动漫</a>
                    </li>
                    <li>
                        <a href="javascript:void(0);">专题</a>
                    </li>
                </ul>
            </div>
           
        </div>
        <!-- 创建搜索容器 -->
        <div class="search-wrapper">
            <!-- 创建搜索框 -->
            <div class="search-in">
                <i class="iconfont icon-search"></i>
                <input type="text" id="input" name="keywords" placeholder="请输入关键词">
            </div>
        </div>

        <!-- 创建轮播图容器 -->
        <div class="swiper">
            <div class="swiper-wrapper">
              <el-carousel :interval="4000" type="card">
                      <el-carousel-item v-for="item in comic" :key="item.id">
                                  <div class="medium">
                                    <img :src="item.imgurl" alt="" >
                                  </div>
                        </el-carousel-item>
              </el-carousel>
            </div>
        </div>
           
        </div>
  
    </div>
   <!--主体内容-->
   <div class="zongti" >
             <div v-for="item in comic" :key="item.id">
            <!--每个盒子-->
                  <div class="one">
                    <!--图片-->
                    <img :src="item.imgurl" alt="" class="oneimg">
                    <!--文本-->
                    <h1>内容</h1>
                  </div>
                </div>
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
				comic:[
					{	
                        id:0,
						imgurl:"https://img0.baidu.com/it/u=3156137851,1307209439&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",
					},{
                        id:1,
            imgurl:"https://img0.baidu.com/it/u=2028084904,3939052004&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",
					},{
						id:2,
            imgurl:"https://img0.baidu.com/it/u=1472391233,99561733&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",
					},{
						id:3,
						imgurl:"https://img2.baidu.com/it/u=3304620759,1323144983&fm=253&fmt=auto&app=138&f=JPEG?w=756&h=500",
					},
                    {	id:4,
						imgurl:"https://img0.baidu.com/it/u=3156137851,1307209439&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",
					},{
                        id:5,
            imgurl:"https://img0.baidu.com/it/u=2028084904,3939052004&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",
					},{
						id:6,
            imgurl:"https://img0.baidu.com/it/u=1472391233,99561733&fm=253&fmt=auto&app=138&f=JPEG?w=889&h=500",
					},{
						id:7,
						imgurl:"https://img2.baidu.com/it/u=3304620759,1323144983&fm=253&fmt=auto&app=138&f=JPEG?w=756&h=500",
					},
				]
			}
		},
		methods:{
      logout() {
			// 没有后台方法，由前端清除 token
			this.$VuexStore.commit("setToken", "");
			this.$router.push("/login");
		},
		 
		},
		
	

    
  }
  </script>
  
  <!-- Add "scoped" attribute to limit CSS to this component only -->
  <style scoped>
  .zongti{
    width: 1500px;
    margin-left: 70px;
    margin-top: 500px;
    background-image: linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%);
    display: flex;
    flex-direction: row;
    flex-wrap:wrap;
  }
  .one{
    margin-top: 50px;
    margin-left: 60px;
  }
  .oneimg{
    width:300px;
    height:400px;
  }
  .medium{
    width: 600px;
    height: 300px;
    display: flex;
  justify-content: center;
  align-items: center;
  }
  *{
    margin: 0;
    padding: 0;
}

.all-wrapper{
    width: 100%;
    height: 100%;
    background-image: linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%);
}

/* 设置所有a */
a,
a:hover,
a:active,
a:visited{
    text-decoration: none;
    color: #eeddff;
}

/* 设置外层容器 */
.out-wrapper{
    width: 1200px;
    height: 60px;
    margin: 0 auto; 
}

/* 设置导航栏容器 */
.out-wrapper .header-wrapper{
    height: 60px;
    width: 100%;
    background-image: linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%);
    display: flex;
    justify-content: space-around;
    text-align: center;
}

/* 设置logo */

/* 设置导航栏 */
.nav-bar{
    width: 900px;
    height: 60px;
    background-image: linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%);
}
.nav-bar .navBar{
    height: 60px;
    list-style: none;
    display: flex;
    justify-content: space-around;
    text-align: center;
}
.navBar li{
    line-height: 60px;
    cursor: pointer;
    flex-grow: 1;
}
.navBar li:hover{
    background-image: linear-gradient(to top, #fdcbf1 0%, #fdcbf1 1%, #e6dee9 100%);
}
.navBar li a{
    font-size: 20px;
}


/* 设置搜索框 */
.out-wrapper .search-wrapper{
    width: 1200px;
    height: 50px;
    background-image: linear-gradient(to bottom, #fbc2eb 0%, #a6c1ee 100%);
}

.search-wrapper .search-in{
    width: 300px;
    height: 50px;
}
.search-in i{ 
    width: 50px;
    height: 50px;
    color: #ff9a9e;
    font-size: 30px !important;
    cursor: pointer;
}
.search-in input{
    width: 250px;
    height: 50px;
    border: 0;
    background-image: linear-gradient(to bottom, #fbc2eb 0%, #a6c1ee 100%);
    outline: none; 
}
/* 设置轮播图容器 */
.swiper{
    width: 1200px;
    height: 400px;
    background-color: #a6c1ee;
}
.swiper-slide{
    position: absolute;
}
.swiper-slide img{
    width: 100%;
    height: 300px;
    position: relative;
}
/* 设置轮播图下方的文字信息 */
.swiper-slide .remark{
    position: relative;
    left: 100px;
    top: -20px;
    color: aliceblue;
    font-size: 14px;
    overflow: hidden;
}
.swiper-slide .comicName{
    height: 30px;
    width: 180px;
    position: relative;
    top: 10px;
    color: #FFFFF2;
    font-size: 20px;
    overflow: hidden;
}
.swiper-slide .description{
    height: 30px;
    width: 180px;
    position: relative;
    top: 20px;
    color: #928E90;
    font-size: 14px;
    overflow: hidden;
}


</style>