<template>
    <div class="hello">

 
          <ul
 class="pagelist"
  v-infinite-scroll="loadMore"
  infinite-scroll-disabled="loading"
  infinite-scroll-distance="5" >
  <li v-for="item in list" style="list-style:none">
    <!-- 动漫展示 -->
    <div class="one" @click="todetail">        
            <img :src="url" class="comicimg">
              <div class="fudong">
                <p class="name">小丑合集</p>
                <p class="miaoshu">这是以书法家和放数据奥会发生ssssssssssssssss</p>
              </div>
           
              <div class="you">
                <p class="label">热血</p>
                <p class="time">2023/22/13-11-40</p>
              </div>
          </div>
        </li>
</ul>
    </div>  
  </template>
  
  <script>
  export default {
    name: 'Detail',
    props: {
      msg: String
    },
    data(){
      return{
        url:"",
        loading:false,
        list:[1,2,3,4,5,6]
      };
    },
    computed: {
      
    },
    methods: {
        loadMore() {
          this.loading = true
        },
        todetail:function(){
          
        }
    }
  }
  </script>
  
  <!-- Add "scoped" attribute to limit CSS to this component only -->
  <style scoped>
  .you{
    margin-left: 20px;
  }
  .label{
    font-weight: 1000;
    margin-top: 10px;
    color: #3c3a3a;
    background-image: linear-gradient(to top, #fbc2eb 0%, #a6c1ee 100%);
  }
  .time{
    margin-top: 50px;
    font-size: 10px;
    color: #1d8ccc;
  }
  .fudong{
    display: flex;
    flex-direction: column;
    text-align: left;
    margin-left: 10px;
  }
  .name{
    font-weight: 1000;
  }
  .pagelist{
    height: 300px;
    overflow-y: auto;
}
.miaoshu{
  width: 300px;
  font-size: 15px;
  font-weight: 500;
  overflow: hidden;

text-overflow: ellipsis;

white-space: nowrap;
}

  .zong{
    display: flex;
    flex-direction: column;
  }
  .one{
    
    border: 1px solid rgb(202, 200, 200);
    display: flex;
    flex-direction: row;
  }
  .comicimg{
    margin-top: 3px;
    margin-left: 3px;
    width: 80px;
    height: 98px;
    border-radius: 2%;
  }
  </style>
  