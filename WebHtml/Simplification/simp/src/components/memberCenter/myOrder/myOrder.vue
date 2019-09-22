<template>
    <div class="order">
      <el-menu :default-active="this.$router.path" router class="el-menu-demo" mode="horizontal" @select="handleSelect">
        <el-menu-item index="/allorder">全部订单</el-menu-item>
        <el-menu-item index="/payment">待付款</el-menu-item>
        <el-menu-item index="/toshipeed">待发货</el-menu-item>
        <el-menu-item index="/shipeeed">已发货</el-menu-item>
        <el-menu-item index="/completed">交易完成</el-menu-item>
      </el-menu>

      <div class="order-content">

        <router-view/>

      </div>

    </div>
</template>

<script>
    export default {
        name: "my-order",
      data(){
          return{
            activeIndex: '/allorder',
          }
      },
      methods:{
        handleSelect(key, keyPath) {
          console.log(key, keyPath);
        }
      },
      created(){

      }
    }
</script>

<style scoped>
  .order {
    width: 90%;
    margin: 0 auto;
  }
  .is-active{
    border-bottom: 2px solid #c40000 !important;
  }
  .el-menu--horizontal{
    display: flex;
    justify-content: space-between;
  }
  .el-menu--horizontal .el-menu-item{
    font-size: 1.7rem;
  }

  .order-content {
    margin-top: 1rem;
    width: 100%;
  }
</style>
