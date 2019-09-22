<template>
  <div class="tool">
    <div class="tool-herder"></div>
    <div class="tool-footer">

      <div class="footer-top">
        <span class="tool-title">衣架挂钩</span>
      </div>

      <div class="tool-product">

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
              <p class="purchase" @click="getDetails()">看看详情<span class="product-go"> ></span></p>
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
  </div>
</template>

<script>
    import {hoverA} from "../../js/homeCurrency";
    export default {
        name: "hanger",
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
      mounted(){
        hoverA("purchase","product-go");
      },
      methods:{
        handleCurrentChange: function(currentPage){
          this.currentPage = currentPage;
        },
        getDetails(){
          this.$router.push("/details")
        }
      }
    }
</script>

<style scoped>
  .tool-herder {
    width: 100%;
    height: 25rem;
    background-position: 10% 71%;
    background-size: 100%;
    background-image: url("http://www.ksygf.com.img.800cdn.com/UpLoad/201707/2017070650578993.jpg");
  }
  .tool-footer {
    width: 85%;
    margin: 0 auto;
  }

  .tool {
    width: 100%;
  }
  .footer-top{
    margin-top: 2rem;
    border-bottom: 1px dashed #fe7a65;
    padding-bottom: 1rem;
  }
  .tool-title {
    font-size: 3rem;
    color: #fe7a65;
  }

  .tool-product{
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
    margin: 1rem 1.15rem;

  }
  .content-img {
    width: 100%;
    height: 16rem;
    cursor: pointer;
    transform: scale(1);
    transition: all .5s;
  }
  .content-img:hover{
    transform: scale(1.1);
    transition: all .5s;
  }

  .font {
    width: 100%;
  }
  .title{
    font-size: 1.5rem;
    color: #dd6f5d;
    padding: 1rem 0;
    border-bottom: 1px dashed #fe7a65;
    white-space: nowrap;
    overflow:hidden;text-overflow:ellipsis;
  }
  .price{
    font-size: 1.7rem;
    color: #fe7a65;
    text-align: center;
    font-weight: bold;
    margin: .5rem 0;
  }
  .money{
    margin-left: .7rem;
    color: #bd5f57;
    font-size: 1.2rem;
    font-weight: normal;
  }

  .purchase {
    width: 75%;
    margin: 0 auto;
    padding: .7rem;
    text-align: center;
    color: #fff;
    background-color: #fe7a65;
    border-radius: .3rem;
    cursor: pointer;
  }
  .product-go{
    position: relative;
  }
  .product-paging {
    width: 100%;
    text-align: center;
  }
</style>
