<template>
    <div class="shopping">

      <div class="shopping-hide" v-if="this.$store.state.statusShopping">
        <div class="shopping-img"></div>
        <span class="shopping-font">亲，您的购物车空空的哟~<span class="home" @click="backHome()">继续购物``</span></span>
      </div>
      <div class="shopping-show" v-if="!this.$store.state.statusShopping">
        <div class="carHeader">
          <div class="carRadio"></div>
          <div class="carImage">图片</div>
          <div class="carTitle">名称</div>
          <div class="carPrice">价格</div>
          <div class="carNumber">数量</div>
          <div class="carTotal">小计</div>
          <div class="carState">操作</div>
        </div>
        <div class="carShopping" v-for="item in shoppingCar">
          <div class="shoppingCar carRadio">
            <el-checkbox v-model="item.carChecked" class="checked" @change="handleCheckedCitiesChange"></el-checkbox>
          </div>
          <div class="shoppingCar carImage">
            <img :src="item.carImage" alt="" class="shopping-Image">
          </div>
          <div class="shoppingCar carTitle">
            <p class="shopping-title shopping-currency">{{item.carTitle}}</p>
          </div>
          <div class="shoppingCar carPrice">
            <span class="shopping-price shopping-currency">￥{{item.carPrice}}</span>
          </div>
          <div class="shoppingCar carNumber">
            <span class="shopping-event event-reduce" @click="reduce(item)">-</span>
            <span class="shopping-number">{{item.carNumber}}</span>
            <span class="shopping-event event-add" @click="add(item)">+</span>
          </div>
          <div class="shoppingCar carTotal">
            <span class="shopping-total shopping-currency">￥{{item.carTotal}}</span>
          </div>
          <div class="shoppingCar carState">
            <img src="../../assets/menber/del.png" alt="" class="shopping-del">
          </div>
        </div>
        <div class="carFooter">
          <div class="carFooter-left">
            <el-checkbox :indeterminate="isIndeterminate" v-model="checkAll" @change="handleCheckAllChange">全选</el-checkbox>
          </div>
          <div class="carFooter-right">

            <p class="prodTotal currency-prod">商品总金额：<span class="currency-price prodTotal-price">￥{{prodTotalPrice}}</span></p>
            <p class="discount currency-prod"> 优惠金额：<span class="currency-price discount-price">￥{{discountPrice}}</span></p>
            <p class="copeWith currency-prod">应付金额：<span class="copeWith-money">￥</span><span class="copeWith-price">{{copeWithPrice}}</span></p>
            <p class="continue">
              <span class="continueProd">继续购物</span>
              <span class="settlement">结算订单</span>
            </p>
          </div>
        </div>
      </div>
    </div>
</template>

<script>
    export default {
        name: "shopping-car",
      data(){
          return{
            checkAll: false,
            isIndeterminate: true,
            checkAllRadio:"aaa",
            carNumber:1,
            carTotal:15,
            shoppingCar:[
              {
                carChecked:true,
                carImage:"../../assets/homeMenu/junshi.jpg",
                carTitle:"啊的课件课件莱佛士国际考虑收购废旧回收时间的",
                carPrice:15,
                carNumber:1,
                carTotal:15,
              },
              {
                carChecked:false,
                carImage:"../../assets/homeMenu/junshi.jpg",
                carTitle:"啊的课件课件莱佛士国际考虑收购废旧回收时间的",
                carPrice:15,
                carNumber:1,
                carTotal:15,
              },
            ],
            prodTotalPrice:"0",
            discountPrice:"0",
            copeWithPrice:"0"
          }
      },
      methods:{
        backHome(){
          this.homeStatus = 1;
          if (this.homeStatus == 1) {
            $(".big-list-ul").show();
          }
          this.$router.push('/');
        },
        handleCheckAllChange(val) {
          for (let i = 0; i < this.shoppingCar.length; i++) {
            this.shoppingCar[i].carChecked = val ? true:false;
            this.isIndeterminate = false;
          }
        },
        handleCheckedCitiesChange(value,item) {
          //console.log(value)
          //this.isIndeterminate = value ? false:true;
          console.log(item);
         if (value == false){
            this.isIndeterminate = false
          }else {
           for (let i = 0; i < this.shoppingCar.length; i++) {
             if (this.shoppingCar[i].carChecked == false || this.shoppingCar[i].carChecked != true) {
               this.isIndeterminate = false;
             } else {
               this.isIndeterminate = true;
             }
           }
          }
        },
        reduce(val){
          if (val.carNumber==1){
            val.carNumber = 1;
            val.carTotal = val.carPrice;
          }else {
            val.carNumber--;
            val.carTotal = val.carTotal-val.carPrice;
          }
        },
        add(val){
          console.log(val);
          val.carNumber++;
          val.carTotal = val.carTotal+val.carPrice;
        }
      },
      created(){

      }
    }
</script>

<style scoped>
  .shopping{
    width: 100%;
  }

  .shopping-hide {
    width: 90%;
    height: 30rem;
    margin: 0 auto;
    display: flex;
    align-items: center;
    justify-content: center;
    position: relative;
  }

  .shopping-img {
    width: 12rem;
    height: 16rem;
    background-position: 10% 48%;
    background-image: url("https://2.ss.faisys.com/image/v2/defaultIcon.png?v=201807251417");
  }

  .shopping-font {
    font-size: 1.5rem;
    color: #999;
    position: absolute;
    top: 80%;
  }

  .home {
    margin-left: 1rem;
    color: #666;
    cursor: pointer;
  }
  .home:hover{
    color: #c40000;
  }

  .shopping-show {
    width: 85%;
    margin: 0 auto;
  }

  .carHeader {
    width: 100%;
    background-color: #f0f0f0;
    display: flex;
    height: 3.5rem;
    align-items: center;
    text-align: center;
    font-size: 1.5rem;
    margin-top: 2rem;
  }
  .carShopping {
    width: 100%;
    display: flex;
    align-items: center;
    padding: 2rem 0;
    border-bottom: 1px solid #eaeaea;
  }

  .carRadio {
    flex: .2;
  }

  .carImage {
    flex: .3;
  }

  .carTitle {
    flex: 1;
  }

  .carPrice {
    flex: .3;
  }

  .carNumber {
    flex: .3;
  }

  .carTotal {
    flex: .3;
  }

  .carState {
    flex: .3;
  }

  .shoppingCar{
    display: flex;
    align-items: center;
    justify-content: center;
  }
  .shopping-Image {
    width: 7.5rem;
    height: 7.5rem;
  }

  .shopping-currency {
    font-size: 1.5rem;
    color: #666;
  }
  .shopping-title{
    width: 95%;
    margin: 0 auto;
    text-align: center;
    cursor: pointer;
  }
  .shopping-title:hover{
    color: #ff6537;
  }
  .shopping-total{
    color: #c40000;
  }
  .shopping-del{
    cursor: pointer;
  }
  .shopping-event{
    display: block;
    width: 1.6rem;
    height: 1.6rem;
    background-color: #838383;
    color: #fff;
    text-align: center;
    font-size: 1.5rem;
    line-height: 1.6rem;
    cursor: pointer;
  }
  .event-reduce{
    margin-right: 1rem;
  }
  .event-add{
    margin-left: 1rem;
  }
  .shopping-number{
    font-size: 1.5rem;
    color: #666;
  }

  .carFooter {
    width: 100%;
    margin-top: 2rem;
    display: flex;
  }

  .carFooter-left {
    flex: 1;
  }

  .carFooter-right {
    flex: 1;
    text-align: right;
  }

  .currency-prod {
    font-size: 1.4rem;
    color: #333;
  }
  .discount{
    margin-top: 1rem;
  }
  .copeWith{
    margin-top: 1rem;
  }

  .currency-price {
    font-size: 1.4rem;
    color: #333;
    margin: 0 1rem 0 3rem;
  }
  .copeWith-money{
    font-size: 2rem;
    color: #c40000;
    margin-left: 3rem;
  }
  .copeWith-price {
    font-size: 3rem;
    color: #c40000;
    margin: 0 1rem 0 0;
  }

  .continue {
    margin-top: 1rem;
  }

  .continueProd {
    font-size: 1.2rem;
    color: #666;
    margin-right: 2.6rem;
    cursor: pointer;
  }
  .continueProd:hover{
    color: #c40000;
  }
  .settlement {
    display: inline-block;
    width: 14rem;
    height: 3.6rem;
    background-color: #c40000;
    font-size: 1.7rem;
    text-align: center;
    line-height: 3.6rem;
    color: #fff;
    border-radius: .3rem;
    cursor: pointer;

  }
</style>
