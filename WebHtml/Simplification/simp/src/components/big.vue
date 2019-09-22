<template>
  <div class="big-box">

    <div class="big-box-top">
      <div class="big-box-shou">
        <div class="big-top-title">
          <div class="big-title-one">
            <p class="big-one-logo">General Merchandise Design</p>
          </div>
          <div class="big-title-two">
            <div class="big-title-two-div">
              <input type="text" class="big-two-sousuo" placeholder="搜索喜欢的商品">
              <p class="big-two-btn">搜索</p>
            </div>
            <p class="big-two-ren">
              <span @click="getDatails()">餐具</span>
              <span>杯子</span>
              <span>收纳袋</span>
              <span>保鲜袋</span>
            </p>
          </div>
          <div class="big-title-three">
            <p class="big-two-service">
              <img src="../assets/big/service.png" alt="">
            </p>
          </div>
        </div>
        <div class="big-top-navigation">
          <div class="big-navigation">
            <ul class="big-navigation-list">
              <li class="product">商品全部分类</li>
              <li @click="getHome()">首页</li>
              <li @click="getAllProduct()">全部商品</li>
              <li @click="getTool()">收纳工具</li>
              <li @click="getOriginality()">创意用品</li>
              <li @click="getClean()">厨卫清洁</li>
              <li @click="getHanger()">衣架挂钩</li>
            </ul>
          </div>
          <ul class="big-list-ul">
            <li>创意用品</li>
            <li>居家收纳</li>
            <li>卫浴用品</li>
            <li>厨房用具</li>
            <li>衣架挂钩</li>
            <li>茶具套装</li>
            <li>碗筷套装</li>
            <li>置物架</li>
          </ul>
        </div>
      </div>

      <div class="big-box-center">
        <router-view/>
      </div>

      <div class="big-box-bottom">
        <div class="big-bottom-top">
          <div class="big-bottom-top-one">
            <img src="../assets/bottom/fahuo.png" alt="" class="big-top-one-img">
            <span class="big-top-one-font">24小时快速发货</span>
          </div>
          <div class="big-bottom-top-one">
            <img src="../assets/bottom/tuihuo.png" alt="" class="big-top-one-img">
            <span class="big-top-one-font">7天无理由退货</span>
          </div>
          <div class="big-bottom-top-one">
            <img src="../assets/bottom/huanhuo.png" alt="" class="big-top-one-img">
            <span class="big-top-one-font">15天免费换货</span>
          </div>
          <div class="big-bottom-top-one">
            <img src="../assets/bottom/baoyou.png" alt="" class="big-top-one-img">
            <span class="big-top-one-font">满39元包邮</span>
          </div>
          <div class="big-bottom-top-one">
            <img src="../assets/bottom/wangdian.png" alt="" class="big-top-one-img">
            <span class="big-top-one-font">百余家售后网点</span>
          </div>
        </div>
        <div class="big-bottom-center">
          <div class="big-center-left">
            <ul class="big-center-left-list big-center-left-list-one">
              <li>服务保障</li>
              <li>正品保证</li>
              <li>7天无理由退换</li>
            </ul>
            <ul class="big-center-left-list">
              <li>支付方式</li>
              <li>货到付款</li>
              <li>在线支付</li>
            </ul>
            <ul class="big-center-left-list">
              <li>物流配送</li>
              <li>免运费</li>
              <li>海外配送</li>
            </ul>
          </div>
          <div class="big-center-right">
            <p class="big-right-phone">020-00000000</p>
            <p class="big-right-rest">周一至周五 9:00-17:00</p>
            <p class="big-right-service">24小时在线客服</p>
          </div>
        </div>
        <div class="big-bottom-bottom">
          <p class="big-bottom-banquan">© 2018  ChangQingZhu  版权所有 京ICP证030173号</p>
        </div>
      </div>

    </div>

  </div>
</template>

<script>
    export default {
        name: "big",
      data(){
          return{
            homeStatus:1
          }
      },
      mounted(){
          //悬浮效果
        let _this = this;

          if (_this.homeStatus == 1){
            $(".big-list-ul").show();
          }else {
            $(".product").hover(function () {
              $(".big-list-ul").stop(true).slideDown(1000);
            },function () {
              $(".big-list-ul").hide();
              $(".big-list-ul").hover(function () {
                $(".big-list-ul").show();
              },function () {
                $(".big-list-ul").stop(true).slideUp(1000);
              })
            })
          }
      },
      methods:{
          //首页
        getHome(){
          this.homeStatus = 1;
          if (this.homeStatus == 1) {
            $(".big-list-ul").show();
          }
          this.$router.push('/');
        },
        //全部商品
        getAllProduct(){
          $(".big-list-ul").hide();
          this.homeStatus = 2;
          this.$router.push('/allProduct');
        },
        getTool(){
          $(".big-list-ul").hide();
          this.homeStatus = 2;
          this.$router.push('/tool');
        },
        getOriginality(){
          $(".big-list-ul").hide();
          this.homeStatus = 2;
          this.$router.push('/originality');
        },
        getClean(){
          $(".big-list-ul").hide();
          this.homeStatus = 2;
          this.$router.push('/clean');
        },
        getHanger(){
          $(".big-list-ul").hide();
          this.homeStatus = 2;
          this.$router.push('/hanger');
        },
        getDatails(){
          $(".big-list-ul").hide();
          this.homeStatus = 2;
          this.$router.push('/details');
        }
      }
    }
</script>

<style scoped>
  .big-box {
    width: 100%;
  }

  .big-box-top {
    width: 100%;
  }

  .big-box-shou {
    width: 100%;
    border-bottom: 2px solid #c40000;
  }

  .big-top-title {
    width: 85%;
    padding: 2.5rem 0;
    margin: 0 auto;
    display: flex;
    justify-content: space-around;
    align-items: center;
  }

  .big-one-logo {
    font-weight: bolder;
    font-size: 2.8rem;
    color: #c40000;
  }

  .big-title-two-div{
    display: flex;
  }

  .big-two-sousuo {
    width: 33rem;
    height: 3rem;
    outline: none;
    border: 2px solid #c40000;
    padding-left: 1rem;
  }
  .big-two-btn{
    height: 3rem;
    width: 6rem;
    font-size: 1.6rem;
    line-height: 3rem;
    text-align: center;
    color: #fff;
    cursor: pointer;
    border: 2px solid #c40000;
    background-color: #c40000;
  }

  .big-two-ren {
    font-size: 1.4rem;
    color: #666;
  }
  .big-two-ren span{
    margin-left: .7rem;
    cursor: pointer;
  }
  .big-two-ren span:first-child{
    margin-left: 0;
  }

  .big-top-navigation {
    width: 85%;
    margin: 0 auto;
    position: relative;
  }

  .big-navigation {
    width: 100%;
  }

  .big-navigation-list {
    width: 100%;
    display: flex;
  }
  .big-navigation-list li{
    margin: 0 1.6rem;
    padding: 1.4rem 0;
    font-size: 1.6rem;
    color: #000;
    cursor: pointer;
  }
  .big-navigation-list li:hover{
    color: #c40000;
  }
  .big-navigation-list li:first-child{
    width: 15rem;
    margin-left: 0;
    background-color: #c40000;
    text-align: center;
    color: #fff;
    cursor: pointer;
  }

  .big-list-ul{
    width: 15rem;
    background-color: #f7f7f7;
    position: absolute;
    display: none;
    z-index: 1;
  }
  .big-list-ul li{
    width: 100%;
    padding: 2rem 0;
    border-bottom: 1px solid #f1f1f1;
    font-size: 1.5rem;
    color: #333;
    text-align: center;
    cursor: pointer;
  }
  .big-list-ul li:hover{
    border: 1px solid #c40000;
    background-color: #fff;
    color: #c40000;
  }

  .big-box-bottom {
    width: 100%;
    margin-top: 7rem;
    background-color: #eeeeee;
  }

  .big-bottom-top {
    width: 85%;
    padding: 2rem 0;
    border-bottom: 1px solid #d1d3d0;
    margin: 0 auto;
    display: flex;
    justify-content: space-around;
  }

  .big-bottom-top-one {
    display: flex;
    align-items: center;
  }

  .big-top-one-img {
    width:  3.8rem;
    height: 3.8rem;
  }

  .big-top-one-font {
    font-size: 1.7rem;
    color: #666666;
    margin-left: 1rem;
  }

  .big-bottom-center {
    width: 85%;
    padding: 2rem 0;
    margin: 0 auto;
    display: flex;
    position: relative;
    border-bottom: 1px solid #d1d3d0;
  }

  .big-center-left{
    display: flex;
  }

  .big-center-left-list {
    padding: 0 4rem;
    border-left: 1px solid #d1d3d0;
    text-align: center;
    color: #666;
  }
  .big-center-left-list li{
    padding: .5rem 0;
  }
  .big-center-left-list li:first-child{
    font-size: 1.7rem;
  }
  .big-center-left-list-one{
    border-left: none;
  }

  .big-center-right {
    position: absolute;
    right: 1rem;
    text-align: center;
  }

  .big-right-phone {
    font-size: 2.7rem;
    color: #c40000;
  }

  .big-right-rest {
    font-size: 1.4rem;
    color: #666;
    margin-top: .3rem;
  }

  .big-right-service {
    padding: .5rem .5rem;
    display: inline-block;
    color: #fff;
    font-size: 1.6rem;
    background-color: #c40000;
    margin-top: .3rem;
    cursor: pointer;
  }

  .big-bottom-bottom {
    width: 100%;
    padding: 1rem 0;
    text-align: center;
  }

  .big-bottom-banquan {
    color: #c2c2c2;
  }
  .big-box-center{
    width: 100%;

  }
</style>
