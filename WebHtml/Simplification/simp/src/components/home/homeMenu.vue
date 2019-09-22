<template>
  <div class="menu">
    <!--轮播-->
    <div class="menu-top">
      <div class="top-left"></div>
      <div class="top-center">
        <div class="center-top">
          <div class="swiper-left">
            <div class="swiper-container">
              <div class="swiper-wrapper">
                <!--<div class="swiper-slide">
                  <img src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgpYaA0wUorqeY_AEwjAY4ygI!800x800.jpg" alt="" class="slide-image">
                </div>
                <div class="swiper-slide">
                  <img src="https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgo4aA0wUo0Y6A6gEwjAY4ygI!800x800.jpg" alt="" class="slide-image">
                </div>-->
              </div>
              <div class="swiper-pagination slide-image"></div>
            </div>
          </div>
          <div class="swiper-right">
            <div class="swiper-right-div">
              <div class="right-div-big">
                <span>四种下单方式</span>
              </div>
              <div class="right-div-bottom">
                <ul class="div-bottom-list">
                  <li><span class="list-number">1</span><span class="list-font">支持访问网站直接下单</span></li>
                  <li><span class="list-number">2</span><span class="list-font">支持联系电话客服</span>
                  <p class="list-service">020-00000000</p></li>
                  <li><span class="list-number">3</span><span class="list-font">支持手机客户端下单</span></li>
                  <li><span class="list-number">4</span><span class="list-font">支持微商城下单</span></li>
                </ul>
              </div>
              <div class="right-div-footer">
                <img src="../../assets/homeMenu/qrCode.png" alt="" class="div-footer-image">
                <span class="footer-erweima">扫描二维码关注<br/><br/>微商城公众号</span>
              </div>
            </div>
          </div>
        </div>
        <div class="center-bottom">
          <div class="center-bottom-div">
            <div class="center-div-div" v-for="item in mainp">
              <div class="center-div-left">
                <img :src="item.pImage" alt="" class="center-div-image homeMenu-image">
                <img src="../../assets/sousuo.png" alt="" class="sousuo homeMenu-sousuo">
              </div>
              <div class="center-div-right">
                <p class="center-right-p">{{item.pTitle}}</p>
                <p class="center-right-p-two">￥{{item.pPrice}}.00</p>
                <p class="center-right-p-therr">{{item.pBrief}}</p>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div class="menu-bottom">
      <!--Activity精选活动-->
      <div class="activity">
        <p class="title"><span class="title-span">精选活动</span></p>
        <div class="activity-content">
          <div class="activity-div" v-for="item in activity">
            <img :src="item.pImage" alt="" class="activity-image homeMenu-image">
            <img src="../../assets/sousuo.png" alt="" class="activity-sousuo homeMenu-sousuo">
            <div class="activity-title">
              <p class="activity-brief">{{item.pTitle}}</p>
              <p class="activity-price">￥<span class="activity-money">{{item.pPrice}}.00</span></p>
            </div>
          </div>
        </div>
      </div>
      <!--New Products 新品上市-->
      <div class="newProduct">
        <ul class="newProduct-list">
          <li class="list-li newProduct-before">新品上市</li>
          <li class="list-li">热销产品</li>
          <li class="list-li">商城推荐</li>
        </ul>
        <div class="newProduct-content">
          <div class="content-big">
            <div class="content-div" v-for="item in newProduct">
              <img :src="item.pImage" alt="" class="newProduct-image homeMenu-image">
              <img src="../../assets/sousuo.png" alt="" class="newProduct-sousuo homeMenu-sousuo">
              <p class="content-div-title">{{item.pTitle}}</p>
              <p class="content-price">￥<span class="content-money">{{item.pPrice}}.00</span></p>
            </div>
          </div>
        </div>
      </div>
      <!--product 4层商品-->
      <div class="product">
        <router-view/>
      </div>
    </div>
  </div>
</template>

<script>
    import Swiper from '../../../static/swiper/swiper'
    export default {
        name: "home-menu",
      data(){
          return{
            //banner图
            banner:[],
            //banner图下的三个产品
            mainp:[],
            //精选活动
            activity:[],
            //新品上市
            newProduct:[]
          }
      },
      mounted(){
          //轮播图
        let _this = this;
        let swiper = new Swiper('.swiper-container',{
          autoplay: {
            delay: 2000,
          },
          effect : 'fade',
          pagination: {
            el: '.swiper-pagination',
            clickable :true,
          },
        })

        //li悬浮加before
        let oC = document.getElementsByClassName("list-li");
        for (let i = 0; i < oC.length; i++) {
          $(oC[i]).hover(function () {
            //先删除所拥有的属性 然后再给当前的加上该拥有的属性
            $(oC).css("color","#666");
            $(oC).removeClass("newProduct-before");
            $(oC[i]).css("color","#c40000");
            $(oC[i]).addClass("newProduct-before");
            let sum = i+1;
            _this.axios.get(_this.httpUrl+"/newprod.success",{
              params:{
                pNewprod:sum
              }
            }).then((data)=>{
              _this.newProduct = data.data;
            }).catch((err)=>{
              console.log(err)
            })
          })
        }
      },
      methods:{
        homeBanner(){

        },
        homeMainp(){

        }
      },
      created(){
        //banner图下的三个产品
        this.axios.get(this.httpUrl+"/mainp.success",).then((data2)=>{
          this.mainp = data2.data.slice(0,3);
          this.activity = data2.data.slice(11,15);
          this.newProduct = data2.data.slice(5,11);
        });

      }
    }
</script>

<style scoped>

  .menu {
    width: 100%;
  }

  .menu-top {
    width: 85%;
    margin: 0 auto;
    display: flex;
  }

  .top-left {
    flex: 1;
  }

  .top-center {
    flex: 5.36;
    height: 100%;
  }
  .center-top {
    width: 100%;
    height: 28rem;
    display: flex;
  }
  .center-bottom {
    width: 100%;
    height: 16.92rem;
    border: 1px solid #e6e6e6;
  }

  .swiper-left {
    flex: 4.2;
    height: 100%;
    position: relative;
  }
  .swiper-right {
    flex: 1;
    height: 100%;
  }

   /*swiper轮播*/
 .swiper-container {
   width: 64.4rem;
   height: 100%;
   position: relative;
   left: .5rem;
 }
  .swiper-slide{
    cursor: pointer;
  }
  .swiper-pagination{
    cursor: pointer;
  }
  /*轮播大体结束*/
  .slide-image {
    width: 100%;
  }

  .swiper-right-div {
    width: 100%;
    height: 100%;
    background-color: #fafafa;
  }

  .right-div-big {
    width: 100%;
    padding: .6rem 0;
    border-bottom: 1px solid #e7e7e7;
  }
  .right-div-big span{
    font-size: 1.3rem;
    margin-left: 1.5rem;
  }

  .right-div-bottom {
    width: 100%;
  }

  .div-bottom-list {
    width: 100%;
    padding-bottom: 1.5rem;
    border-bottom: 1px solid #e7e7e7;
  }
  .div-bottom-list li{
    padding: 1.5rem 0 0 1rem;
    font-size: 1.2rem;
  }

  .list-number {
    padding: .2rem .5rem;
    background-color: #c40000;
    color: #fff;
  }

  .list-font {
    color: #666;
    margin-left: 1rem;
  }

  .list-service {
    font-size: 2rem;
    color: #c40000;
    margin-top: 1.5rem;
    margin-left: 1.5rem;
  }
  .right-div-footer {
    width: 100%;
    display: flex;
    justify-content: center;
    margin-top: 2rem;
  }
  .footer-erweima {
    font-size: 1.2rem;
    color: #666;
    margin-left: 1rem;
  }

  .center-bottom-div {
    width: 100%;
    height: 100%;
    padding: 3.5rem 3rem 3.5rem 0;
    display: flex;
  }

  .center-div-div {
    display: flex;
    margin-left: 3rem;
  }
  .center-div-left{

    position: relative;
  }
  .center-div-image {
    width: 10rem;
    height: 10rem;
    cursor: pointer;
  }
  .sousuo{
    position: absolute;
    right: 25%;
    top: 16%;
    display: none;
    cursor: pointer;
  }
  .center-div-right {
    margin-left: 1rem;
    width: 12rem;
  }

  .center-right-p {
    font-size: 1.4rem;
    color: #666;
    cursor: pointer;
  }

  .center-right-p-two {
    font-size: 2rem;
    color: #c40000;
    margin-top: 1rem;
  }

  .center-right-p-therr {
    font-size: 1.4rem;
    color: #666;
    margin-top: 1rem;
  }

  .menu-bottom {
    width: 85%;
    margin: 0 auto;
  }

  .activity {
    width: 100%;
  }

  .title {
    width: 100%;
    color: #c40000;
    padding: 1rem 0 1rem 0;
    border-bottom: 1px solid #e0e0e0;
    font-size: 1.7rem;
  }

  .title-span{
    margin: 1rem;
  }

  .activity-content {
    display: flex;
    justify-content: space-between;
    width: 100%;
    margin: 1rem auto 0;

  }

  .activity-div {
    position: relative;
    cursor: pointer;
  }

  .activity-image {
    width: 22.8rem;
    height: 23rem;
  }

  .activity-sousuo {
    position: absolute;
    top: 35%;
    left: 40%;
    display: none;
  }

  .activity-title {
    position: absolute;
    bottom: -2.6rem;
    z-index: 1;
    width: 80%;
    height: 8rem;
    background-color: white;
    opacity: 0.9;
    border: 1px solid #e0e0e0;
    margin: 0 auto;
    left: 0;
    right: 0;
  }

  .activity-brief {
    font-size: 1.45rem;
    margin: 1.5rem auto 0;
    color: #666;
    width: 80%;
    white-space:nowrap;
    overflow:hidden;
    text-overflow:ellipsis;
  }

  .activity-price {
    margin-top: .6rem;
    text-align: center;
    font-size: 1.5rem;
    color: #c40000;
  }

  .activity-money {
    font-size: 2.3rem;
  }
  .newProduct {
    margin-top: 5rem;
    width: 100%;
  }

  .newProduct-list {
    width: 100%;
    display: flex;
    border-bottom: 2px solid #c40000;
  }
  .newProduct-list li{
    font-size: 1.4rem;
    color: #666;
    margin: 0 3rem ;
    padding: 2rem 0;
    cursor: pointer;
    position: relative;
  }
  .newProduct-list li:first-child{
    color: #c40000;
  }
  .newProduct-before::before{
    content: "";
    position: absolute;
    border-top: 7px solid transparent;
    border-right: 7px solid transparent;
    border-bottom:7px solid #c40000;
    border-left: 7px solid transparent;
    bottom: 0;
    left: 30%;
  }

  .newProduct-content {
    width: 100%;
    margin-top: 3rem;
  }

  .content-big {
    width: 94.5%;
    margin: 0 auto;
    display: flex;
    justify-content: space-between;
  }

  .content-div {
    position: relative;
  }

  .newProduct-image {
    width: 13rem;
    height: 13rem;
    cursor: pointer;
  }

  .newProduct-sousuo {
    position: absolute;
    top: 25%;
    left: 30%;
    display: none;
    cursor: pointer;
  }

  .content-div-title {
    width: 13rem;
    font-size: 1.3rem;
    color: #666;
    margin-top: 1rem;
    white-space:nowrap;
    overflow:hidden;
    text-overflow:ellipsis;
    cursor: pointer;
  }

  .content-price {
    margin-top: 1rem;
    font-size: 1.2rem;
    color: #c40000;
    font-weight: bolder;
    cursor: pointer;
  }

  .content-money {
    font-size: 1.8rem;
  }

  .product {
    width: 100%;
    margin-top: 3rem;
  }
</style>
