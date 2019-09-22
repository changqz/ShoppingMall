<template>
  <div class="allProduct">
    <div class="allProduct-top">

      <div class="top-seek">
        <input id="seek" name="seek" type="text" class="seek" placeholder="请输入您喜欢的商品名称!">
        <img class="seekBg" src="https://2.ss.faisys.com/image/propfilter/search.png?v=201807251417"/>
      </div>
      <div class="top-searchCriteria">
        <span class="selected">已选择:</span>
      </div>
      <div class="top-condition">
        <ul class="condition">
          <li>
            <ul class="texture">
              <span>材质:</span>
              <li>棉质</li>
              <li>玻璃</li>
              <li>海绵</li>
              <li>实木</li>
              <li>PC塑料</li>
              <li>合金</li>
            </ul>
          </li>
          <li>
            <ul class="price">
              <span>价格:</span>
              <li>0-100</li>
              <li>100-599</li>
              <li>599-1000</li>
            </ul>
          </li>
          <li>
            <ul class="use">
              <span>用途:</span>
              <li>收纳工具</li>
              <li>创意用品</li>
              <li>厨卫清洁</li>
              <li>衣架挂钩</li>
            </ul>
          </li>
        </ul>
      </div>
      <div class="slideShow">
        <span class="slide">幻灯片</span>
      </div>
    </div>
    <div class="allProduct-center">

      <div class="list-product">
        <div class="product-content" v-for="item in productList.slice((currentPage-1)*pagesize,currentPage*pagesize)">
          <div>
            <img :src="item.pImg" alt="" class="content-img" @click="getDetails()">
          </div>
          <div class="font">
            <p class="title">{{item.pTitle}}</p>
            <p class="price">
              <span>￥{{item.pPrice}}</span><s class="money">￥0.00</s>
            </p>
            <p class="purchase" @click="getDetails()">立即购买</p>
          </div>
        </div>
      </div>
      <div class="product-paging">

        <el-pagination
          @current-change="handleCurrentChange"
          :current-page="currentPage"
          layout="prev, pager,next"
          :page-size="pagesize"
          :total="this.productList.length"
          :prev-text="upper"
          :next-text="lower">
        </el-pagination>
      </div>
    </div>
  </div>
</template>

<script>
    export default {
        name: "product",
      data(){
          return{
            currentPage:1,
            pagesize:20,
            productList:[
              {
                  pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                  pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                  pPrice:"15"
                },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              },
              {
                pImg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgntr60gUosub-tgUw1gM41gM!200x200.jpg",
                pTitle:"撒娇的说卡换卡大师傅艰苦和福建安徽大家",
                pPrice:"15"
              }

            ],
            upper:"上一页",
            lower:"下一页"
          }
      },
      methods:{
        handleCurrentChange: function(currentPage){
          this.currentPage = currentPage;
        },
        getDetails(){
          this.$router.push("/details")
        }
      },
      created(){

      }
    }
</script>

<style scoped>
  .allProduct {
    width: 85%;
    margin: 0 auto;
  }

  .allProduct-top {
    width: 100%;
    margin-top: 1rem;
  }

  .top-seek {
    width: 95%;
    margin: 0 auto;
  }

  .seek {
    width: 18rem;
    font-size: 1.2rem;
    height: 2rem;
    padding-left: .6rem;
    line-height: 2rem;
    color: #666;
  }

  .seekBg {
    position: relative;
    right: 2.2rem;
    top: .3rem;
    cursor: pointer;
  }

  .top-searchCriteria {
    width: 100%;
    height: 4rem;
    background-color: #f5f5f5;
    border-top: 2px solid #dfdfdf;
    margin-top: 1rem;
    font-size: 1.6rem;
    color: #000;
    line-height: 4rem;
  }

  .selected {
    margin-left: 2rem;
  }

  .top-condition {
    width: 100%;
  }

  .condition {
    width: 100%;

  }
  .condition li{

  }
  .condition li ul{
    color: #666;
    font-size: 1.5rem;
    display: flex;
    padding: 1.5rem 0 1.5rem 3rem;
    border-bottom: 1px dashed #ececec;
  }
  .condition li ul li{
    margin-left: 2rem;
    cursor: pointer;
  }
  .condition li ul li:hover{
    color: #f00000;
  }

  .slideShow {
    margin-top: 2rem;
    width: 100%;
    text-align: right;
    padding-bottom: 2rem;
    border-bottom: 2px solid #ececec;
  }

  .slide {
    color:#666;
    font-size: 1.5rem;
    cursor: pointer;
  }
  .slide:hover{
    color: #ff8200;
  }
  .allProduct-center {
    width: 100%;
  }
  .list-product{
    width: 98%;
    margin: 1.5rem auto;
    display: flex;
    flex-wrap: wrap;
  }

  .product-content{
    width: 16rem;
    margin-bottom: 2rem;
    margin-left: 2.15rem;
  }
  .content-img {
    width: 100%;
    height: 16rem;
    cursor: pointer;
    transform: scale(1);
    transition: all .5s;
  }
  .content-img:hover {
    transform: scale(1.1);
    transition: all .5s;
  }
  .font {
    width: 100%;
  }
  .title{
    font-size: 1.5rem;
    color: #666;
    padding: 1rem 0;
    border-bottom: 1px dashed #999;
    white-space: nowrap;
    overflow:hidden;text-overflow:ellipsis;
  }
  .price{
    font-size: 1.7rem;
    color: #c40000;
    text-align: center;
    font-weight: bold;
    margin: .5rem 0;
  }
  .money{
    margin-left: .7rem;
    color: #333;
    font-size: 1.2rem;
    font-weight: normal;
  }

  .purchase {
    width: 75%;
    margin: 0 auto;
    padding: .7rem;
    text-align: center;
    color: #fff;
    background-color: #c40000;
    border-radius: .3rem;
    cursor: pointer;
  }

  .product-paging {
    width: 100%;
    text-align: center;

  }
</style>
