<template>
    <div class="toShipped">
      <div class="nothing">
        <div class="nothing-bg"></div>
        <span class="nothing-font">亲,您还没有相关的订单!</span>
      </div>
    </div>
</template>

<script>
    export default {
        name: "to-shipped"
    }
</script>

<style scoped>
  .toShipped {
    width: 100%;
  }
  .nothing {
    width: 100%;
    height: 35rem;
    display: flex;
    align-items: center;
    justify-content: center;
    position: relative;
  }

  .nothing-bg {
    width: 13rem;
    height: 12rem;
    background-position: 10% 35%;
    background-image: url("https://2.ss.faisys.com/image/v2/defaultIcon.png?v=201807251417");
  }

  .nothing-font {
    font-size: 1.5rem;
    color:#999;
    position: absolute;
    top: 70%;
  }
</style>
