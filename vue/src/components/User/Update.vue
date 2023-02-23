<template>
    <div class="hello">
      <el-collapse v-model="activeName" accordion>
  <el-collapse-item title="用户名" name="1">
    <div><el-input v-model="username" placeholder="username"></el-input></div>
  </el-collapse-item>
  <el-collapse-item title="邮箱" name="2">
    <div><el-input v-model="email" placeholder="email"></el-input></div>
  </el-collapse-item>
  <el-collapse-item title="密码" name="3">
    <div><el-input placeholder="password" v-model="password" show-password></el-input></div>
  </el-collapse-item>
  <el-collapse-item title="电话号码" name="4">
    <div><el-input v-model="phonenumber" placeholder="phonenumber"></el-input></div>
  </el-collapse-item>
</el-collapse>
<el-button type="submit" @click="update" round class="ti">提交修改</el-button>

    </div>
  </template>
  
  <script>
  export default {
    name: 'Setting',
    props: {
      msg: String
    },
    data() {
      return {
        phonenumber:'18783451844',
        activeName: '1',
        username:'1792208603',
        password:'123',
        email:'1792208603@qq.com',
        imgurl:''
      };
    },
    methods: {
      update(){
        console.log(this.username)
      }
    }
  }
  </script>
  
  <!-- Add "scoped" attribute to limit CSS to this component only -->
  <style scoped>
  .ti{
    margin-top: 10px;
  }
  input{
    width: 200px;
  }
  </style>
  