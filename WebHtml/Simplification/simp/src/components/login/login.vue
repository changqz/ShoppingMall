<template>
    <div class="login-big">
      <div class="login">
        <div class="home-login-cneter">
          <p class="home-login-one">
            <img src="../../assets/homeBig/account.png" alt="" class="one-img">
            <input type="text" class="login-input one-input" v-model="account" placeholder="账号">
          </p>
          <p class="home-login-two">
            <img src="../../assets/homeBig/password.png" alt="" class="one-img">
            <input type="password" maxlength="12" minlength="6" class="login-input two-input" v-model="password" placeholder="密码">
          </p>
          <p class="home-btn-login" @click="successSignIn()">登录</p>
          <p class="home-btn-login-p"><span class="home-btn-login-p-span" @click="hideS()">免费注册 》</span></p>
          <p class="home-wai">
            <span class="home-wai-span">其他账号登录：</span>
            <img src="../../assets/login/QQ.png" alt="" class="home-login-icon">
            <img src="../../assets/login/weixin.png" alt="" class="home-login-icon">
            <img src="../../assets/login/weibo.png" alt="" class="home-login-icon">
          </p>
          <img class="loginGif" src="https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1554580165815&di=6fa24b029a3e12bff30bb1100d9dc468&imgtype=0&src=http%3A%2F%2Fimg.zcool.cn%2Fcommunity%2F019b74591bc871a801216a3e1caae3.gif" alt="">
        </div>
      </div>
      <div class="register">
        <div class="register-list">
          <ul class="list-title">
            <li>账号:<input type="text" class="register-input" oninput="value=value.replace(/[^\d]/g,'')" maxlength="8" v-model="rAccount" placeholder="由八位数字组成的账号"><span class="mustFill">*</span></li>
            <li>密码:<input type="password" class="register-input" name="pwd" oninput="this.value=this.value.replace(/[\W]{8}/g,'')" maxlength="8" v-model="rPassword" placeholder="由八位数字组成"><span class="mustFill">*</span></li>
            <li>确认密码:<input type="password" class="register-input" name="pwd" v-model="pwd" oninput="value=value.replace(/[\W]{8}/g,'')" maxlength="8" placeholder="确认密码"><span class="mustFill">*</span></li>
            <li>姓名:<input type="text" class="register-input" v-model="userName" placeholder="您账户名称"><span class="mustFill">*</span></li>
            <li>邮箱:<input type="text" class="register-input" v-model="mailbox" placeholder="邮箱"><span class="mustFill-null"> </span></li>
            <li>手机:<input type="text" class="register-input" v-model="phone" oninput="value=value.replace(/[^\d]/g,'')" maxlength="11"  placeholder="手机号"><span class="mustFill">*</span></li>
          </ul>
          <p class="register-btn">立即注册</p>
          <p class="register-back" @click="signIn()">已有账号，返回登录</p>
        </div>

      </div>
      <div class="seizeASeat"></div>
    </div>
</template>

<script>
    export default {
        name: "login",
      data(){
        return{
          account:"",
          password:"",
          rAccount:"",
          rPassword:"",
          pwd:"",
          userName:"",
          phone:"",
          mailbox:"",
          //用于接收数值，判断要跳入那个页面
          lNub:""
        }
      },
      mounted(){
      //

      },
      methods:{
        signIn(){
          $(".register").stop(true).animate({"left":"50%","opacity":"0"},1300);
          $(".login").stop(true).animate({"left":"0","opacity":"1"},1300);
          this.rAccount = "";
          this.rPassword = "";
          this.pwd = "";
          this.userName="";
          this.phone = "";
          this.mailbox = "";
        },
        hideS(){
          $(".register").stop(true).animate({"left":"0","opacity":"1"},1300);
          $(".login").stop(true).animate({"left":"-50%","opacity":"0"},1300);
          this.account = "";
          this.password = "";
        },
        successSignIn(){
          switch(this.lNub){
            case 1:
              this.$router.push("/");
              this.$message.success("XX商城欢迎您！！！");
              break;
            case 2:
              this.$router.push("/member");
              this.$message.success("XX商城欢迎您！！！");
              break;
            case 3:
              this.$router.push("/member");
              this.$message.success("XX商城欢迎您！！！");
              break;
            case 4:
              this.$router.push("/shopping");
              this.$message.success("XX商城欢迎您！！！");
              break;
            default:
              this.$router.push("/");
              this.$message.success("XX商城欢迎您！！！");
          }
          this.$store.state.login = false;
          this.$store.state.status = "2";
        }
      },
      created(){
        var login = sessionStorage.getItem('login');
        var register = sessionStorage.getItem('register');
        //console.log(login+register);
        /*if (this.$store.state.returnNub == 0){
          console.log("我是来注册的");
        }else if(this.$store.state.tRegister == 0){
          console.log("我是来登录的")
        }*/
        this.lNub = this.$store.state.returnNub;
      }
    }
</script>

<style scoped>
  .login-big {
    width: 100%;
    margin-top: 3rem;
    display: flex;
    position: relative;
  }
  .login{
    position: absolute;
    width: 20%;
    margin: 0 auto;
    left: 0;
    right: 0;
    z-index: 1;
  }
  .register{
    position: absolute;
    left: 50%;
    right: 0;
    width: 30%;
    margin: 0 auto;
    opacity: 0;
  }
  /**
  登录
   */
  .home-login-cneter {
    width: 100%;
    margin-top: .7rem;
  }
  .home-login-one {
    width: 100%;
    height: 2.8rem;
    position: relative;
    display: flex;
    align-items: center;
  }
  .home-login-two {
    width: 100%;
    height: 2.8rem;
    position: relative;
    margin-top: 1.3rem;
    display: flex;
    align-items: center;
  }
  .one-img{
    position: absolute;
    left: .5rem;
  }

  .login-input {
    width: 100%;
    height: 100%;
    background-color: #f7f7f7;
    font-size: 1.2rem;
    border: 1px solid #e9e9e9;
    outline: none;
    padding-left: 2rem;
    color: #3a3a3a;
  }

  .home-btn-login {
    width: 100%;
    height: 3.5rem;
    background-color: #f54f4f;
    color: #fff;
    text-align: center;
    line-height: 3.5rem;
    font-size: 1.4rem;
    cursor: pointer;
    margin-top: 1rem;
  }

  .home-btn-login-p {
    width: 100%;
    height: 2rem;
    line-height: 2rem;
    text-align: right;
    font-size: 1.2rem;
    cursor: pointer;
    color: #5a5a5a;
    margin-top: .5rem;
    padding-bottom: .5rem;
    border-bottom: 1px solid #d3d3d3;
  }
  .home-btn-login-p-span:hover{
    color: #ff4400;
  }
  .home-wai{
    width: 100%;
    height: 3rem;
    display: flex;
    align-items: center;
  }
  .home-wai-span{
    color: #6d6d6d;
  }
  .home-login-icon {
    width: 2rem;
    height: 2rem;
    margin-left: .5rem;
    cursor: pointer;
    opacity: 0.6;
  }
  .home-login-icon:hover{
    opacity: 1;
  }
  .loginGif{
    width: 100%;
    margin-top: 3.1rem;
    height: 6rem;
  }
  /**end*/
  /**注册*/

  .register-list {
    width: 100%;
  }
  .list-title{
    width: 94%;
  }
  .list-title li{
    width: 100%;
    text-align: right;
    font-size: 1.5rem;
    height: 2.2rem;
    color: #666;
    margin-top: 1rem;
  }

  .register-input {
    width: 70%;
    height: 100%;
    margin-left: .5rem;
    outline: none;
    border: 1px solid #dadada;
    background-color: #f7f7f7;
    padding-left: .6rem;
    font-size: 1.2rem;
    color: #666;
  }
  .mustFill{
    color: #f54f4f;
    margin-left: .7rem;
  }

  .mustFill-null {
    margin-left: 1.27rem;
  }

  .register-btn {
    width: 90%;
    margin:  2rem auto 0;
    height: 4rem;
    color: white;
    background-color: #f54f4f;
    cursor: pointer;
    border-radius: .2rem;
    line-height: 4rem;
    text-align: center;
    font-size: 1.6rem;
  }

  .register-back {
    text-align: right;
    margin-right: 1.6rem;
    margin-top: 1rem;
    color: #666;
    cursor:pointer;
  }
  .register-back:hover{
    color: #ff4501;
    text-decoration: underline;
  }

  .seizeASeat {
    width: 8rem;
    height: 30rem;
  }
</style>
