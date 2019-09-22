<template>
    <div class="collection">
      <div class="collection-big">
        <p class="inform-title">{{title}}</p>

        <div class="collection-no" v-if="state">
          <div class="nothing-bg"></div>
          <span class="nothing-font">亲,还没有入您法眼的商品哦!</span>
        </div>
        <div class="collection-yes" v-if="!state">
          <div class="collection-title">
            <div class="title-left">商品名称</div>
            <div class="title-center">商品单价</div>
            <div class="title-right"></div>
          </div>
          <div class="collection-product" v-for="item in collectionProd.slice((currentPage-1)*pagesize,currentPage*pagesize)">
            <div class="prod-left">
              <div class="left-big-img"><img :src="item.collectionImg" alt="" class="left-img"></div>
              <div class="left-font">{{item.collectionTitle}}</div>
            </div>
            <div class="prod-center">
              <span class="right-font">￥{{item.collectionPrice}}</span>
            </div>
            <div class="prod-right">
              <p class="see">查看商品</p>
            </div>
          </div>

          <div class="product-paging">
            <el-pagination
              @current-change="handleCurrentChange"
              :current-page="currentPage"
              layout="prev, pager,next"
              :page-size="pagesize"
              :total="this.collectionProd.length"
              :prev-text="upper"
              :next-text="lower">
            </el-pagination>
          </div>
        </div>

      </div>
    </div>
</template>

<script>
    export default {
        name: "my-collection",
      data(){
          return{
            title:"我的收藏",
            state:false,
            collectionProd:[
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
              {
                collectionImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                collectionTitle:"撒打撒打撒阿萨大大是的啊实打实大苏打啊阿萨大啊实打实",
                collectionPrice:"15.00"
              },
            ],
            upper:"上一页",
            lower:"下一页",
            currentPage:1,
            pagesize:5,
          }
      },
      methods:{
        handleCurrentChange: function(currentPage){
          this.currentPage = currentPage;
        }
      },
      created(){
          if (this.$store.state.statusCollection == 1){
            this.state = false
          }else {
            this.state = true
          }
      }
    }
</script>

<style scoped>
  .collection {
    width: 100%;
  }

  .collection-big {
    width: 90%;
    margin: 0 auto;
  }
  .inform-title{
    width: 100%;
    padding: 1.5rem 0;
    font-size: 1.7rem;
    color: #666;
    text-align: center;
    border-bottom: 1px solid #eee;
  }

  /*没有订单*/
  .collection-no{
    width: 100%;
    height: 35rem;
    display: flex;
    align-items: center;
    justify-content: center;
    position: relative;
  }
  .nothing-bg {
    width: 12rem;
    height: 17rem;
    background-position: -30% 42%;
    background-image: url("https://2.ss.faisys.com/image/v2/defaultIcon.png?v=201807251417");
  }

  .nothing-font {
    font-size: 1.5rem;
    color:#999;
    position: absolute;
    top: 70%;
  }
  /*end*/
  .collection-yes{
    width: 100%;
  }

  .collection-title {
    width: 100%;
    height: 3rem;
    background-color: #F2F2F2;
    display: flex;
    font-size: 1.6rem;
    color: #666;
    line-height: 3rem;

    text-align: center;
  }

  .title-left {
    flex: 1;
    border-right: 1px dashed #9e9e9e;
  }

  .title-center {
    flex: 1;
    border-right: 1px dashed #9e9e9e;
  }

  .title-right {
    flex: 1;
  }

  .collection-product {
    width: 100%;
    display: flex;
    border-bottom: 1px dashed #cbcbcb;
    padding-bottom: 1rem;
    margin-top: 1rem;
  }

  .prod-left {
    flex: 1;
    overflow: hidden;
    display: flex;
    align-items: center;
  }

  .prod-center {
    flex: 1;
    display: flex;
    align-items: center;
    justify-content: center;
  }

  .prod-right {
    flex: 1;
    display: flex;
    align-items: center;
    justify-content: center;
  }
  .left-big-img{
  }
  .left-img {
    width: 9rem;
    height: 8rem;
  }

  .left-font {
    margin-left: .6rem;
    color: #666;
    margin-right: .6rem;
    cursor: pointer;
  }
  .left-font:hover{
    color: #c40000;
  }
  .right-font {
    font-size: 1.7rem;
    color: #c40000;
    font-weight: bold;
  }

  .see {
    width: 36%;
    padding: .7rem;
    font-size: 1.6rem;
    text-align: center;
    color: #c40000;
    border: 1px solid #c40000;
    border-radius: 2rem;
    cursor: pointer;
    background-color: white;
    transition: background-color .3s,color .3s,border .3s;
  }
  .see:hover{
    background-color: #c40000;
    color: #fff;
    border:none;
    transition: background-color .3s,color .3s;
  }
  .product-paging{
    width: 100%;
    text-align: center;
  }
</style>
