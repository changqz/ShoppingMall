<template>
    <div class="allOrder">
      <div class="nothing" v-if="state">
        <div class="nothing-bg"></div>
        <span class="nothing-font">亲,您还没有相关的订单!</span>
      </div>
      <div class="allOrder-yes" v-if="!state">
        <div class="allOrder-title">
          <div class="prodName">产品名称</div>
          <div class="prodPrice">单价/数量</div>
          <div class="prodTotalPrice">总价</div>
          <div class="prodStatus">状态</div>
          <div class="prodOperation">操作</div>
        </div>
        <div class="order" v-for="item in order.slice((currentPage-1)*pagesize,currentPage*pagesize)">
          <div class="order-number">
            <span class="number">订单编号:&nbsp;&nbsp;{{item.orderNumber}}</span>
            <span class="order-data">订单时间:&nbsp;&nbsp;{{item.orderData}}</span>
          </div>
          <div class="allProd">
            <div class="prodName">
              <div class="image"><img :src="item.orderImage" alt="" class="prod-image"> </div>
              <div class="title">{{item.orderTitle}}</div>
            </div>
            <div class="prodPrice">
              <span class="price">￥{{item.orderPrice}}&nbsp;/&nbsp;{{item.orderNum}}</span>
            </div>
            <div class="prodTotalPrice">
              <span class="price">￥{{item.orderTotalPrice}}</span>
            </div>
            <div class="prodStatus">
              <span class="price">{{item.orderStatus}}</span>
            </div>
            <div class="prodOperation">
              <span class="operation">查看订单</span>
            </div>
          </div>
        </div>
        <div class="product-paging">
          <el-pagination
            @current-change="handleCurrentChange"
            :current-page="currentPage"
            layout="prev, pager,next"
            :page-size="pagesize"
            :total="this.order.length"
            :prev-text="upper"
            :next-text="lower">
          </el-pagination>
        </div>
      </div>
    </div>
</template>

<script>
    export default {
        name: "all-order",
      data(){
          return{
            state:false,
            order:[
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
              },
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
              },
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
              },
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
              },
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
              },
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
              },
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
              },
              {
                orderNumber:"12312312321",
                orderData:"2019-05-10 10:10:10",
                orderImage:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmtr60gUo8POwnQEw1gM41gM.jpg",
                orderTitle:"阿三打撒萨达萨达萨达是阿三打撒萨达萨达萨达是",
                orderPrice:"15.00",
                orderNum:"1",
                orderStatus:"待付款",
                orderTotalPrice:"15.00"
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
          if (this.$store.state.stateAllOrder == 1){
            this.state = true
          }else {
            this.state = false
          }
      }
    }
</script>

<style scoped>
  .allOrder{
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

  .allOrder-title {
    width: 100%;
    margin: 2rem auto;
    height: 3rem;
    background-color: #f2f2f2;
    line-height: 3rem;
    display: flex;
    justify-content: space-between;
    font-size: 1.5rem;
    color: #666;
  }

  .allProd {
    width: 100%;
    display: flex;
    padding: 2rem 0;
  }
  .order{
    border: 1px solid #f2f2f2;
    margin-top: 1rem;
  }
  .prodName {
    flex: .8;
    margin-left: .5rem;
    display: flex;
  }
  .prodPrice{
    flex: .4;
    display: flex;
  }

  .prodTotalPrice {
    flex: .4;
    display: flex;
  }

  .prodStatus {
    flex: .5;
    display: flex;
  }
  .prodOperation {
    flex: .4 ;
    display: flex;
  }


  .image {
    display: flex;
  }

  .prod-image {
    width: 5rem;
    height: 5rem;
  }
  .title{
    color: #666;
    font-size: 1.3rem;
    margin: 0 1rem;
  }
  .title:hover{
    color: #c40000;
    cursor: pointer;
  }
  .price{
    font-size: 1.5rem;
    color: #666;
  }
  .operation {
    font-size: 1.5rem;
    color: #666;
    cursor: pointer;
  }
  .operation:hover{
    color: #c40000;
  }

  .order-number {
    width: 100%;
    height: 3rem;
    background-color: #f2f2f2;
    line-height: 3rem;

  }

  .number {
    font-size: 1.4rem;
    color: #8e8e8e;
    margin-left: .8rem;
  }

  .order-data {
    font-size: 1.4rem;
    color: #8e8e8e;
    margin-left: .8rem;
  }

  .product-paging{
    width: 100%;
    text-align: center;
  }
</style>
