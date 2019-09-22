<template>
  <div class="information">

    <div class="inform">
      <p class="inform-title">{{title}}</p>
      <div class="inform-myImg">
        <div class="myImg-left">
          <img src="../../../assets/homeMenu/junshi.jpg" alt="" class="inform-image">
          <p class="editImg">编辑头像</p>
        </div>
        <div class="mtImg-right">
          <p class="userName">{{userName}}(普通会员)</p>
        </div>
      </div>

      <div class="inform-msg">

        <ul class="msg-list">
          <li>账号名:<input type="text" class="msg-input msg-account" v-model="account" disabled></li>
          <li>姓名:<input type="text" class="msg-input " v-model="userName" ></li>
          <li>邮箱:<input type="text" class="msg-input " v-model="email" ></li>
          <li>手机:<input type="text" class="msg-input " v-model="phone" disabled></li>
          <li>登录密码:<p class="msg-span"><span style="cursor: pointer" @click="updatePwd()">[{{pwdX}}]</span></p></li>
          <li class="msg-pwd">旧密码:<input type="text" class="msg-input " v-model="usedPwd"></li>
          <li class="msg-pwd">新密码:<input type="text" class="msg-input " v-model="newPwd"></li>
          <li class="msg-pwd">确认新密码:<input type="text" class="msg-input "></li>
          <p class="save">保&nbsp;&nbsp;&nbsp;&nbsp;存</p>
        </ul>

      </div>


    </div>
  </div>
</template>

<script>
    export default {
        name: "my-information",
      data(){
          return{
            title:"我的资料",
            userName:"常常常常",
            pwdX:"修改密码",
            account:"常常常常",
            email:"15151@qq.com",
            phone:"1321313122",
            usedPwd:"",
            newPwd:"",
            pwdStatue:1
          }
      },
      mounted(){

      },
      methods:{
        updatePwd(){
          if (this.pwdStatue == 1) {
            this.pwdX = "取消修改";
            $(".msg-pwd").stop(true).slideDown(500);
            this.pwdStatue = 2
          } else {
            this.pwdX = "修改密码";
            $(".msg-pwd").stop(true).slideUp(500);
            this.pwdStatue = 1
          }
        }
      }
    }
</script>

<style scoped>
  .information {
    width: 100%;
  }
  .inform {
    width: 90%;
    margin: 0 auto;
  }

  .inform-title {
    width: 100%;
    padding: 1.5rem 0;
    font-size: 1.7rem;
    color: #666;
    text-align: center;
    border-bottom: 1px solid #eee;
  }

  .inform-myImg {
    width: 100%;
    display: flex;
    padding: .5rem 0 1rem 0;
    align-items: center;
    position: relative;
    border-bottom: 1px solid #eee;

  }

  .myImg-left {
    position: relative;
  }

  .mtImg-right {

  }

  .inform-image {
    width: 8rem;
    height: 8rem;
    border: 3px solid #e6e6e6;
    -webkit-border-radius: 50%;
    -moz-border-radius: 50%;
    border-radius: 50%;
    margin: 1rem;
    cursor: pointer;
  }

  .editImg {
    width: 6rem;
    height: 2.5rem;
    position: absolute;
    cursor: pointer;
    font-size: 1.5rem;
    text-align: center;
    background-color: #000;
    opacity: 0.5;
    color: #fff;
    bottom: 1.5rem;
    left: 2.3rem;
    border-radius: 0 0 80px 80px;
    display: none;
  }

  .myImg-left:hover .editImg{
    display: block;
  }

  .userName {
    font-size: 1.6rem;
    color: #666;
    padding-left: 1rem;
  }

  .inform-msg {
    width: 90%;
  }

  .msg-list {
    width: 55%;
    margin: 2rem 0 5rem;
  }
  .msg-list li{
    font-size: 1.5rem;
    color: #666;
    padding: 1rem 0;
    text-align: right;
  }
  .msg-input{
    width: 26rem;
    height: 2.7rem;
    color: #666;
    border: 1px solid #dadada;
    padding-left: .4rem;
    border-radius: .3rem;
    margin-left: 1.6rem;
  }
  .msg-span{
    display: inline-block;
    width: 26rem;
    padding-left: .4rem;
    margin-left: 1.6rem;
    text-align: left;
  }

  .save {
    width: 30%;
    height: 3rem;
    line-height: 3rem;
    text-align: center;
    background-color: #e4393c;
    color: #fff;
    cursor: pointer;
    font-size: 1.5rem;
    border-radius: .3rem;
    margin: 0 auto;
  }
  .msg-pwd{
    display: none;
  }
</style>
