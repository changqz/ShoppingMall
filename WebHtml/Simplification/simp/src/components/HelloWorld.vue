<template>
  <div class="home-box">
    <div class="home-box-top wow bounceInDown bg-green">
      <div class="home-box-top-none" v-if="this.$store.state.login">
        <div class="home-box-top-div">
          <ul class="home-top-div-list">
            <li><span class="home-div-li-all" @click="tLogin(2)">个人中心</span></li>
            <li><span class="home-div-li-all" @click="tLogin(3)">我的资料</span></li>
            <li><div class="home-div-li-all home-div-li-all-er" @click="tLogin(4)"><img src="../assets/big/cart.png"  class="home-list-li-img">
              <span class="home-list-li-span">我的购物车&nbsp;<span class="home-box-number">({{cartNumber}})</span></span>
              </div></li>
          </ul>
          <ul class="home-top-div-list-er">
          <li><span class="home-div-list-er-span home-div-list-er-span-er" @click="tLogin(1)">亲,请登录</span></li>
          <li><span class="home-div-list-er-span-er" @click="tLogin(1)">免费注册</span></li>
          <li><span class="home-div-list-er-span-er">联系客服</span></li>
        </ul>
        </div>
      </div>
      <div class="home-box-top-xian" v-if="!this.$store.state.login">
        <div class="home-div-xian-div">
          <ul class="home-xian-user-list">
            <li><span class="home-span-userList"><img src="../assets/userAccount/user.png" alt="" class="home-div-xian-img"></span></li>
            <li><span class="home-span-userList home-div-user">{{userHomeName}}</span></li>
            <li><span class="home-span-userList btnTui" @click="SignOut()">[<span class="btnTui-chu">退出</span>]</span></li>
          </ul>
          <ul class="home-top-div-list-er">
          <li><span class="home-user-all" @click="member()">个人中心</span></li>
          <li><span class="home-user-all" @click="member()">我的资料</span></li>
          <li><span class="home-user-all" @click="shoppingCar()"><div class="home-div-li-all home-div-li-all-er"><img src="../assets/big/cart.png"  class="home-list-li-img">
              <span class="home-list-li-span">我的购物车&nbsp;<span class="home-box-number">({{cartNumber}})</span></span>
              </div></span></li>
          <li><span class="home-user-all">联系客服</span></li>
        </ul>
        </div>
      </div>
    </div>



    <div class="home-box-home">
      <div class="home-box-div">
        <router-view></router-view>
      </div>
    </div>

    <div class="home-box-right wow bounceInRight">
      <div class="home-box-right-div">
        <ul class="home-box-right-list">
          <li class="homeMy-div home-login-fadeIn"><div><i class="iconfont icon-wode homeMy"></i>
          <div class="homeMy-div-er ">我的资料</div></div></li>
          <li class="homeMy-div home-login-fadeIn"><div><i class="iconfont icon-shoucang homeMy"></i>
            <div class="homeMy-div-er">我的收藏</div></div></li>
          <li class="right-homeCart home-login-fadeIn"><div><i class="iconfont icon-gouwuche homeMy"></i>
            <p class="right-homeCart-p right-homeCart-p-er">购</p>
            <p class="right-homeCart-p">物</p>
            <p class="right-homeCart-p">车</p>
            <p class="right-homeCart-number">{{cartNumber}}</p>
          </div></li>
        </ul>
        <div class="home-box-right-liu">
          <ul class="home-box-right-list">
            <li class="homeMy-div"><div><i class="iconfont icon-liuyanpinglun homeMy"></i>
              <div class="homeMy-div-er">留言</div></div></li>
            <li class="homeMy-div" @click="dingbu()"><div><i class="iconfont icon-shangjiantou homeMy"></i><p class="right-list-top-p">TOP</p>
              <div class="homeMy-div-er">回到顶部</div></div></li>
          </ul>
        </div>
        <div class="home-box-right-login-mi">
        <div class="home-login-mi-div">
          <p class="home-login-mi-div-p home-login-mi-div-p-er">会员登录</p>
          <p class="home-login-mi-div-p"></p>
        </div>
        <div class="home-login-cneter">
          <p class="home-login-one">
            <img src="../assets/homeBig/account.png" alt="" class="one-img">
            <input type="text" class="login-input one-input" v-model="account" placeholder="账号">
          </p>
          <p class="home-login-two">
            <img src="../assets/homeBig/password.png" alt="" class="one-img">
            <input type="password"maxlength="12" minlength="6" class="login-input two-input" v-model="password" placeholder="密码">
          </p>
          <p class="home-btn-login" @click="HomeSignIn()">登录</p>
          <p class="home-btn-login-p"><span class="home-btn-login-p-span" @click="tLogin(7)">免费注册 》</span></p>
          <p class="home-wai">
            <span class="home-wai-span">其他账号登录：</span>
            <img src="../assets/login/QQ.png" alt="" class="home-login-icon">
            <img src="../assets/login/weixin.png" alt="" class="home-login-icon">
            <img src="../assets/login/weibo.png" alt="" class="home-login-icon">
          </p>
        </div>
      </div>
      </div>
      <div class="home-box-right-right">
        <div class="home-box-right-big">
          <div class="home-box-big-top">
            <div class="home-top-div">
              <p class="home-top-p">{{title}}</p>
              <span class="home-top-span" @click="hideRight()">>></span>
            </div>
          </div>
          <div class="home-box-big-bottom">
            <div class="home-box-bottom-one home-bottom-div wow bounceInRight" >
              <div class="home-one-div">
                <div class="home-one-div-big">
                  <div class="home-one-big-one">
                    <div class="home-one-big-one-left">
                      <img src="../assets/userAccount/user.png" alt="" class="home-one-left-img">
                    </div>
                    <div class="home-one-big-one-right">
                      <p class="home-one-right-p">{{accountName}}</p>
                      <p class="home-one-right-p-er">{{huiyuan}}</p>
                    </div>
                  </div>
                  <div class="home-one-big-two">
                    <p class="home-two-p">姓名</p>
                    <p class="home-two-p-er">{{userAccount}}</p>
                  </div>
                  <div class="home-one-big-two">
                    <p class="home-two-p">邮箱</p>
                    <p class="home-two-p-er">{{userEamil}}</p>
                  </div>
                  <div class="home-one-big-two">
                    <p class="home-two-p">手机</p>
                    <p class="home-two-p-er">{{userPhone}}</p>
                  </div>
                </div>

              </div>
              <p class="Logout">退出登录</p>
            </div>
            <div class="home-box-bottom-two home-bottom-div wow bounceInRight" >

              <div class="hide" v-if="showShou">
                <div class="hide-div">
                  <img src="../assets/weishou.png" alt="" class="hide-div-img">
                  <p class="hide-div-p">亲，还没有如您法眼得商品呦!</p>
                </div>
              </div>
              <div class="show" v-if="!showShou">
                <div class="show-cat-div">
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                </div>
              </div>
              <p class="Logout" @click="Tiao()">查看更多</p>
            </div>
            <div class="home-box-bottom-theer home-bottom-div wow bounceInRight" >
              <div class="hide" v-if="isShow">
                <div class="hide-div">
                  <img src="../assets/weishou.png" alt="" class="hide-div-img">
                  <p class="hide-div-p">亲，您的购物车空空的呦!</p>
                </div>
              </div>
              <div class="show" v-if="!isShow">
                <div class="show-cat-div">
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                  <div class="show-cat-div-one">
                    <div class="show-cat-div-one-img">
                      <img class="image-one" src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgodr60gUoqpXGwQUw1gM41gM!60x60.jpg" alt="">
                    </div>
                    <div class="show-cat-one-title">
                      <p class="show-one-title">啊实打实的阿斯顿撒旦阿斯顿撒旦</p>
                    </div>
                    <div class="show-cat-one-operation">
                      <p class="show-one-operation">删除</p>
                      <p class="show-one-operation-er">
                        <span>
                          <span class="show-one-price">￥{{unitPrice}}</span>&nbsp;&nbsp;&nbsp;×{{unitNumber}}</span>
                      </p>
                    </div>
                  </div>
                </div>
              </div>
              <div class="bottom-cat">
                <p class="bottom-cat-p-font"><span>共<span class="color-font">{{cartNumber}}</span>件商品</span>
                  <span class="right-cat">共计: <span class="color-font-er">￥{{price}}</span>元</span></p>
                <p class="Logout-therr">去购物车结算</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'HelloWorld',
  data () {
    return {
      cartNumber:"3",
      userHomeName:"哈哈哈",
      account:"",
      password:"",
      title:"",
      One:false,
      Two:false,
      Theer:false,
      accountName:"hahahah",
      huiyuan:"普通会员",
      userEamil:"1123123@163.com",
      userPhone:"12312323564",
      showShou:true,
      isShow:false,
      unitPrice:"30",
      price:"98.23",
      unitNumber:"3"
    }
  },
  mounted(){
    new WOW().init();

    setInterval(function () {
      $(".home-box-right").css("height",window.innerHeight);
    });

    let oA = document.getElementsByClassName("homeMy-div");
    let oB = document.getElementsByClassName("homeMy-div-er");
    for (let i = 0; i < oA.length; i++) {
      $(oA[i]).hover(function () {
        $(oB[i]).stop(true).fadeIn(900);
      },function () {
        $(oB[i]).stop(true).fadeOut(400);
      })
    }
    let oC = document.getElementsByClassName("home-login-fadeIn");
    let oD = document.getElementsByClassName("home-bottom-div");
    let _this = this;
      for (let i = 0; i < oC.length; i++) {
        $(oC[i]).click(function () {
          if (i == 0){
            _this.title = "我的资料";
            _this.$store.state.miniLogin = 1;
          }else if(i == 1){
            _this.title = "我的收藏"
            _this.$store.state.miniLogin = 2;
          }else if (i == 2){
            _this.title = "我的购物车"
            _this.$store.state.miniLogin = 3;
          }
          if(_this.$store.state.status == 1){
            if ($(".home-box-right-login-mi").offset().top == $(oC[i]).offset().top){
              $(".home-box-right-login-mi").stop(true).fadeOut(900);
            }else {
              $(".home-box-right-login-mi").stop(true).css("top",$(oC[i]).offset().top);
              $(".home-box-right-login-mi").stop(true).fadeIn(900);
            }
          }else {
            $(".home-box-right-right").show(1000);
            $(oD).hide(0);
            $(oD[i]).show(0);
          }
        });
      }

    //$(".show").css("height",$(".home-box-bottom-theer").outerHeight(true) - $(".bottom-cat").outerHeight(true));
  },
  methods:{
    tLogin(returnNub){
      /**
       * returnNub 为1登录成功返回首页，2返回我的资料，3我的收藏，4我的订单，5我的购物车
       */
      $(".big-list-ul").hide();
      this.homeStatus = 2;
      this.$store.state.returnNub = returnNub;
      this.$router.push("/login");
    },
    hideRight(){
      //首页右侧的隐藏
      $(".home-box-right-right").hide(1000);
    },
    Tiao(){
      //收藏栏里的查看更多
      this.showShou = false
    },
    dingbu(){
      //回到顶部
      $('body,html').animate({scrollTop:0},1000);
    },
    member(){
      $(".big-list-ul").hide();
      this.$router.push("/member");
    },
    shoppingCar(){
      $(".big-list-ul").hide();
      this.$router.push("/shopping");
    },
    SignOut(){
      this.$router.push("/login");
      $(".home-box-right-right").hide(1000);
      this.$store.state.login = true;
      this.$store.state.status = "1";
      this.$message.success("退出账号！！！");
    },
    HomeSignIn(){
      $(".home-box-right-login-mi").stop(true).fadeOut(900);
      $(".home-box-right-right").show(1000);
      let states = this.$store.state.miniLogin;
      if(states == 1){
        $(".home-box-bottom-one").show(0);
      }else if(states == 2){
        $(".home-box-bottom-two").show(0);
      }else if(states == 3){
        $(".home-box-bottom-theer").show(0);
      }
      this.$store.state.login = false;
      this.$store.state.status = "2";
      this.$message.success("XX商城欢迎您！！！");
    }
  },
  created(){

  }
}
</script>

<style scoped>
  .home-box {
    width: 100%;
  }

  .home-box-top {
    width: 100%;
    height: 3rem;
    background-color: #f5f5f5;
    box-shadow: 0 0 13px -5px #000000;
    position: fixed;
    top: 0;
    z-index: 98;
  }
  .home-box-home {
    width: 100%;
    padding-top: 3rem;
  }
  .home-box-right {
    background-color: #202020;
    position: fixed;
    top: 0;
    right: 0;
    z-index: 99;
    display: flex;
  }
  .home-box-right-div{
    width: 2.8rem;
    height: 100%;
    position: relative;
  }

  .home-box-div {
    width: 100%;
  }

  .home-box-top-div {
    width: 87%;
    height: 100%;
    margin: 0 auto;
    display: flex;
    align-items: center;
  }

  .home-box-top-none{
    width: 100%;
    height: 100%;
  }

  .home-top-div-list {
    flex: 1;
    display: flex;
  }
  .home-top-div-list li{
    color: #7c7c7c;
    font-size: 1.3rem;
    padding: 0 1.8rem;
    border-left: 1px solid #c7c7c7;
  }
  .home-div-li-all:hover{
    cursor: pointer;
    color: #ff8a24;
  }
  .home-top-div-list li:first-child{
    border-left: none;
  }

  .home-list-li-span {
    margin-left: .5rem;
  }

  .home-list-li-img {
    width: 1.3rem;
    height: 1.3rem;
    position: relative;
    top: .2rem;
  }

  .home-box-number {
    color: #ff4400;
  }

  .home-top-div-list-er {
    flex: 1;
    display: flex;
    justify-content: flex-end;
    margin: 0;
  }
  .home-top-div-list-er li{
    display: inline-block;
    font-size: 1.2rem;
    color: #7c7c91;
    padding: 0 1.7rem;
    border-left: 1px solid #c7c7c7;
  }
  .home-top-div-list-er li:first-child{
    border-left: none;
  }
  .home-div-list-er-span{
    color: #ff4400;
  }
  .home-div-list-er-span-er:hover{
    color: #ff8a24;
    cursor: pointer;
  }
  .home-div-list-er-span:hover{
    color: #ff4400;
  }

  .home-box-right-list{
    width: 100%;
    padding-top: 1rem;
    text-align: center;
  }
  .home-box-right-list li{
    padding: .7rem 0;
    margin: 1rem 0;
    background-color: transparent;
    transition: background-color .2s;
  }
  .home-box-right-list li:hover{
    background-color: #c40000;
    transition: background-color .2s;
    cursor: pointer;
  }
  .homeMy-div{
    position: relative;
  }
  .homeMy-div-er{
    display: none;
    width: 9rem;
    height: 3rem;
    background-color: #434343;
    color: #ddd;
    line-height: 3rem;
    text-align: center;
    position: absolute;
    top: 0.2rem;
    right: 2.7rem;
  }
  .homeMy-div-er::before{
    content: "";
    width:1rem;
    border-top:.7rem solid transparent;
    border-bottom:.7rem solid transparent;
    border-left:.7rem solid #434343;
    border-right:.7rem solid transparent;
    position: absolute;
    right: -2.42rem;
    top: .7rem;
    z-index: 100;
  }

  .homeMy {
    font-size: 2rem;
    color: #dddddd;

  }
  .right-homeCart{
    border-top: 1px solid #000;
    border-bottom: 1px solid #000;
  }

  .right-homeCart-p {
    color: #dddddd;
    font-size: 1.5rem;
  }

  .right-homeCart-p-er {
    margin-top: 1rem;
  }

  .right-homeCart-number {
    margin-top: 1rem;
    display: inline-block;
    padding: .2rem .6rem;
    border-radius: 50%;
    background-color: #c40000;
    color: #fff;
    font-size: 1.18rem;
    margin-bottom: 1rem;
  }

  .home-box-right-liu {
    width: 100%;
    position: absolute;
    bottom: 1rem;
    margin: 0 auto;
    text-align: center;
  }
  .right-list-top-p{
    color: #ddd;
    font-size: 1.1rem;
  }

  .home-box-right-login-mi {
    width: 22rem;
    height: 22rem;
    padding: 2rem 2rem;
    background-color: #ffffff;
    box-shadow: 0 0 7px -2px #000;
    position: absolute;
    right: 3.66rem;
    display: none;
  }
  .home-box-right-login-mi::before{
    content: "";
    width:1rem;
    border-top:.7rem solid transparent;
    border-bottom:.7rem solid transparent;
    border-left:.7rem solid #000;
    position: absolute;
    right: -1.8rem;
    top: .7rem;
    z-index: 98;
  }

  .home-login-mi-div {
    width: 100%;
    display: flex;
  }

  .home-login-mi-div-p {
    flex: 1;
    border-bottom: 1px solid #cbcbcb;
  }
  .home-login-mi-div-p-er{
    font-size: 1.57rem;
    color: #666;
    padding-bottom: .3rem;
    border-bottom: 1px solid #f54f4f;
  }

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

  .home-box-top-xian {
    width: 100%;
    height: 100%;
  }

  .home-div-xian-div {
    width: 87%;
    height: 100%;
    margin: 0 auto;
    display: flex;
    align-items: center;
  }
  .home-xian-user-list {
    flex: 1;
    display: flex;
    align-items: center;
  }
  .home-div-xian-img {
    width: 2.3rem;
    height: 2.3rem;
    border-radius: 50%;
  }

  .home-div-user {
    margin-left: .8rem;
    color: #808080;
    font-size: 1.6rem;
  }

  .btnTui {
    margin-left: .8rem;
    color: #1766ff;
    font-size: 1.3rem;
  }
  .btnTui-chu{
    margin:0 .1rem;
  }

  .home-user-all:hover{
    cursor: pointer;
    color: #ff8a24;
  }

  .home-span-userList:hover {
    cursor: pointer;
  }

  .home-box-right-right {
    width: 22rem;
    height: 100%;
    position: relative;
    background-color: transparent;
    display: none;
  }

  .home-box-right-big {
    width: 100%;
    height: 100%;
  }

  .home-box-big-top {
    width: 100%;
    height: 7%;
    background-color: #202020;
  }

  .home-box-big-bottom {
    width: 100%;
    height: 93%;
    background-color: transparent;
  }
  .home-top-div{
    width: 90%;
    height: 100%;
    display: flex;
    align-items: center;
    position: relative;
    justify-content: center;
  }
  .home-top-p {
    font-size: 1.6rem;
    font-family: 微软雅黑;
    color: #eeeeee;
    text-align: center;
  }

  .home-top-span {
    font-size: 1.4rem;
    color: #eeeeee;
    position: absolute;
    left: 1.5rem;
    cursor: pointer;
  }

  .home-box-bottom-one {
    width: 100%;
    height: 100%;
    background-color: #3c3c3c;
    display: none;
  }

  .home-box-bottom-two {
    width: 100%;
    height: 100%;
    background-color: #e5e5e5;
    display: none;
  }
  .home-box-bottom-theer {
    width: 100%;
    height: 100%;
    background-color: #e5e5e5;
    display: none;
  }

  .home-one-div {
    width: 87%;
    margin: 0 auto;
  }

  .home-one-div-big {
    width: 100%;
    padding-top: 1rem;
  }

  .home-one-big-one {
    width: 100%;
    display: flex;
    align-items: center;
    padding-bottom: 1.5rem;
    border-bottom: 1px solid #363636;
  }

  .home-one-big-one-left {
    flex: 1;
    text-align: center;
  }

  .home-one-left-img {
    width: 7rem;
    height: 7rem;
    border-radius: 50%;
  }

  .home-one-big-one-right {
    flex: 1;
    height: 100%;
  }

  .home-one-right-p {
    font-size: 1.4rem;
    color: #eeeeee;
  }

  .home-one-right-p-er {
    font-size: 1.5rem;
    color: #bcbcbc;
    margin-top: .3rem;
  }

  .home-one-big-two {
    padding: 1.5rem 0 1.5rem 1rem;
    border-bottom: 1px solid #363636;
    color: #fff;
  }

  .home-two-p {
    font-size: 1.5rem;
  }
  .home-two-p-er {
    font-size: 1.5rem;
    margin-top: .2rem;
  }

  .Logout {
    width: 93%;
    margin: 0 auto;
    position: absolute;
    bottom: .4rem;
    height: 4rem;
    background-color: #e43a3d;
    left: 0;
    right: 0;
    color: #fff;
    font-size: 1.4rem;
    text-align: center;
    line-height: 4rem;
    cursor: pointer;
    border-radius: .2rem;
  }

  .hide {
    width: 100%;
    height: 100%;
    display: flex;
    align-items: center;
    justify-content: center;
  }

  .show {
    width: 100%;
    height: 511px;
    overflow: auto;
    overflow-x: hidden;
  }

  .hide-div {

  }

  .hide-div-img {
    width: 11rem;
    height: 12.8rem;
    display: block;
    margin: 0 auto;
  }

  .hide-div-p{
    color: #888888;
    font-size: 1.3rem;
    margin-top: .5rem;
    text-align: center;
  }

  .bottom-cat {
    width: 100%;
    position: absolute;
    bottom: 0;
    background-color: #fff;
    padding: 1rem 0 1rem 1rem;
  }
  .bottom-cat-p-font{
    font-size: 1.3rem;
    color: #8d8d8d;
  }
  .color-font{
    color: #fc8055;
  }
  .color-font-er{
    color: #e43a3d;
  }
  .right-cat{
    position: absolute;
    right: 2rem;
  }
  .Logout-therr{
    width: 90.5%;
    height: 3.7rem;
    background-color: #e43a3d;
    color: #fff;
    font-size: 1.4rem;
    cursor: pointer;
    text-align: center;
    line-height: 3.7rem;
    border-radius: .2rem;
    margin-top: .6rem;
  }

  .show-cat-div {
    width: 100%;
    background-color: #fff;
  }

  .show-cat-div-one {
    width: 100%;
    display: flex;
    margin: 0 auto;
    padding: 1rem 0 1rem 1rem;
    border-bottom: 1px solid #f3f3f3;
  }
  .show-cat-div-one-img{

  }
  .image-one {
    width: 5rem;
    height: 5rem;
  }
  .show-cat-one-title{
    width: 40%;
    margin-left: 1rem;
  }

  .show-one-title {
    overflow: hidden;
    text-overflow:ellipsis;
    white-space: nowrap;
  }

  .show-cat-one-operation {
    width: 19%;
    margin-left: .4rem;
    position: relative;
  }

  .show-one-operation {
    text-align: right;
    cursor: pointer;
  }

  .show-one-operation-er {
    position: absolute;
    bottom: 1rem;
  }

  .show-one-price {
    color: #e43a3d;
  }
</style>
