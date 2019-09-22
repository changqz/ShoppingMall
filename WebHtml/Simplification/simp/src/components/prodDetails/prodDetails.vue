<template>
    <div class="details">
      <div class="details-big">

        <div class="details-herder">
          <div class="herder-left">
            <img :src="prodImage" alt="" class="herder-left-image">
          </div>
          <div class="herder-right">
            <p class="herder-right-title">{{prodTitle}}</p>
            <p class="herder-right-price">价格 : <span class="right-price-big">￥{{prodPrice}}</span> <s>￥0.0</s></p>
            <p class="herder-right-number">
              商品数量 :<el-input-number v-model="numberProd" controls-position="right" @change="handleChange" :min="1"></el-input-number>
            </p>
            <div class="right-bottom">
              <p class="commit-btn right-addToCart">
                <img src="../../assets/homeMenu/soopingCar.png" alt="" class="addToCart-image">
                加入购物车
              </p>
              <p class="commit-btn right-purchase">立即购买</p>
            </div>
          </div>
        </div>

        <div class="details-content">
          <span class="content-share">
            <i class="icon iconfont icon-fenxiang details-share"></i>分享</span>
          <span class="content-service">
            <i class="icon iconfont icon-xinxi details-service"></i>在线客服</span>
        </div>

        <div class="details-footer">

          <div class="details-footer-big">
            <div class="footer-big-left">产品详情</div>
          </div>

          <div class="footer-prod">

            <div class="footer-prod-left">
              <div class="left-item">
                <div class="item-name">材质 :</div>
                <div class="item-content"><span class="content-span">{{material}}</span></div>
              </div>
              <div class="left-item2">
                <div class="item-name">分类 :</div>
                <div class="item-content"><span class="content-span">{{classification}}</span></div>
              </div>
            </div>
            <div class="footer-prod-right">
              <div class="left-item">
                <div class="item-name">简介 :</div>
                <div class="item-content"><span class="content-span">{{brief}}</span></div>
              </div>
              <div class="left-item4">
                <div class="item-name">简介 :</div>
                <div class="item-content"><span class="content-span">{{brief}}</span></div>
              </div>
            </div>

          </div>

        </div>
      </div>
    </div>
</template>

<script>
    export default {
        name: "prod-details",
      data(){
          return{
            prodTitle:"保护宝宝防撞角-桌角加厚防护保护套-婴儿防护角4个装",
            prodPrice:"5",
            prodImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
            numberProd:1,
            material:"PC塑料",
            classification:"创意用品",
            brief:"简约生活 便利你我"
          }
      },
      mounted(){
        // chrome
        document.body.scrollTop = 0;
        // firefox
        document.documentElement.scrollTop = 0;
        // safari
        window.pageYOffset = 0;
      },
      methods:{
        handleChange(value) {
          console.log(this.numberProd);
        }
      },
      created(){

    }
    }
</script>

<style scoped>
  .details {
    width: 100%;
  }

  .details-big {
    width: 84%;
    margin: 3.6rem auto 0;
  }

  .details-herder {
    width: 100%;
    display: flex;
  }

  .herder-left {
    flex: 1;
  }

  .herder-right {
    flex: 1;
  }

  .herder-left-image {
    width: 68%;
    height: 33rem;
  }


  .herder-right-title {
    font-size: 2rem;
    color: #585858;
  }

  .herder-right-price {
    font-size: 1.4rem;
    color: #666;
    margin: 1rem 0 1rem 2.2rem;
  }
  .right-price-big{
    font-size: 3.6rem;
    color: #c40000;
    margin: 0 .6rem;
    font-weight: bold;
  }
  .herder-right-number {
    font-size: 1.4rem;
    color: #666;
  }
  .el-input-number{
    width: 8rem;
    margin-left: 1rem;
  }

  .right-bottom {
    width: 68%;
    display: flex;
    justify-content: space-between;
    margin-top: 2rem;
  }

  .commit-btn{
    width: 15rem;
    height: 3.6rem;
    text-align: center;
    font-size: 1.7rem;
    border-radius: .3rem;
    cursor: pointer;
  }

  .right-addToCart {
    display: flex;
    align-items: center;
    justify-content: center;
    color: #c40000;
    border: 1px solid #c40000;
  }

  .addToCart-image {
    margin-right: 1rem;
  }

  .right-purchase {
    line-height: 3.6rem;
    color: #fff;
    background-color: #c40000;
  }

  .details-content {
    width: 100%;
    margin: 2.6rem 0;
  }

  .content-share {
    color: #666;
    font-size: 1.4rem;
    margin-left: 1rem;
    cursor: pointer;
  }



  .content-service {
    color: #666;
    font-size: 1.4rem;
    margin-left: 2.6rem;
    cursor: pointer;
  }

  .details-share {
    color: #8a8a8a;
    font-size: 1.8rem;
    margin-right: .6rem;
  }

  .details-service {
    color: #797979;
    font-size: 1.9rem;
    margin-right: .6rem;
  }
  .content-share:hover{
    color: #c40000;
  }
  .content-service:hover{
    color: #c40000;
  }
  .content-share:hover .details-share{
    color: #c40000;
  }
  .content-service:hover .details-service{
    color: #c40000;
  }

  .details-footer{
    width: 100%;
    margin-bottom: 100px;
  }

  .details-footer-big {
    width: 100%;
    height: 4.6rem;
    border: 1px solid #eaeaea;
    overflow: hidden;
  }

  .footer-big-left {
    width: 13%;
    height: 100%;
    border-right: 1px solid #eaeaea;
    border-top: 6px solid #c40000;
    display: flex;
    align-items: center;
    justify-content: center;
    font-size: 1.5rem;
    color: #c40000;
  }

  .footer-prod {
    width: 100%;
    display: flex;
    margin-top: 3rem;
  }

  .footer-prod-left {
    flex: 1;
  }

  .footer-prod-right {
    flex: 1;
  }

  .left-item {
    width: 100%;
    height: 5rem;
    display: flex;
    border: 1px solid #eaeaea;
  }
  .left-item2{
    width: 100%;
    height: 5rem;
    display: flex;
    border: 1px solid #eaeaea;
    position: relative;
    top: -1px;
  }
  .left-item4{
    width: 100%;
    height: 5rem;
    display: flex;
    border: 1px solid #eaeaea;
    position: relative;
    top: -1px;
  }
  .item-name {
    flex: .3;
    height: 5rem;
    border-right: 1px solid #eaeaea;
    background-color: #f8f8f8;
    padding-right: 1rem;
    text-align: right;
    line-height: 5rem;
    font-size: 1.5rem;
    color: #666;
  }

  .item-content {
    height: 5rem;
    flex: 1;
    line-height: 5rem;
  }
  .content-span{
    margin-left: 1rem;
    color: #666;
    font-size: 1.5rem;
  }
</style>
