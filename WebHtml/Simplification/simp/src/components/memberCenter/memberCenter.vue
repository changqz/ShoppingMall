<template>
    <div class="memBer">

      <div class="memBer-big">

        <div class="memBer-left">

          <p class="memBer-title">会员中心</p>
          <ul class="memBer-list">
            <li class="memBerLi" @click="information()">我的资料</li>
            <li class="memBerLi" @click="myOrder()">我的订单</li>
            <li class="memBerLi" @click="consignee()">收货人信息</li>
            <li class="memBerLi" @click="collection()">我的收藏</li>
          </ul>

        </div>
        <div class="memBer-right">
          <router-view/>
        </div>

      </div>

    </div>
</template>

<script>
    export default {
        name: "member-center",
      data(){
          return{

          }
      },
      mounted(){
        let oList = document.getElementsByClassName("memBerLi");
        for (let i = 0; i < oList.length; i++) {
          $(oList[i]).click(function () {
            $(oList).css({"background-color":"white","color":"#666","border-left":"none"});
            $(oList[i]).css({"background-color":"#f8f8f8","color":"#e4393c","border-left":"4px solid #e4393c"});
          })
        }
      },
      methods:{
        information(){
          this.$router.push("/information")
        },
        myOrder(){
          this.$router.push("/order")
        },
        consignee(){
          this.$router.push("/consignee")
        },
        collection(){
          this.$router.push("/collection")
        }
      }
    }
</script>

<style scoped>
  .memBer {
    width: 100%;
  }

  .memBer-big {
    width: 85%;
    display: flex;
    margin: 0 auto;

  }

  .memBer-left {
    flex: .2;
    border: 1px solid #eee;
  }

  .memBer-right {
    flex: 1;
  }

  .memBer-title {
    width: 90%;
    font-size: 1.7rem;
    color: #333;
    text-align: center;
    padding: 1rem 0;
    margin: 0 auto;
    border-bottom: 1px solid #eee;
  }

  .memBer-list {
    width: 100%;
    margin-top: .5rem;
  }

  .memBer-list li{
    font-size: 1.5rem;
    color: #666;
    text-align: center;
    padding: .5rem 0;
    margin: .5rem 0;
    cursor: pointer;
    background-color: white;
  }

  .memBer-list li:first-child{
    background-color:#f8f8f8;
    color:#e4393c;
    border-left:4px solid #e4393c;
  }
</style>
