<template>
    <div class="floor">
      <div class="product-big">
        <div class="oneF" v-for="item in list">
          <p class="oneF-title" :style="{'border-bottom':'1px solid'+item.borderBottom}">{{item.title}}<span class="oneF-move">更多>></span></p>
          <div class="oneF-div">
            <div class="oneF-div-top">
              <div class="top-brief" :style="{'background-color':item.color}">
                <div class="top-brief-big">
                  <img :src="item.titleImage" alt="">
                  <p class="top-brief-big-title" >{{item.smallTitle}}</p>
                </div>
              </div>
              <div class="top-brief-right">
                <div class="top-center-content" v-for="items in item.data">
                  <img :src="items.pImage" alt="" class="top-image fourFloor-image">
                  <img src="../../assets/sousuo.png" alt="" class="top-sousuo fourFloor-sousuo">
                  <p class="top-title">{{items.pTitle}}</p>
                  <p class="top-price">￥<span class="top-money">{{items.pPrice}}.00</span>
                    <span class="del-money">{{items.pOp}}.00</span>
                    <img src="../../assets/homeMenu/soopingCar.png" alt="" class="top-car"></p>
                </div>
              </div>
            </div>
            <div class="oneF-bottom">
              <img :src="item.bottomBg" alt="" class="oneF-bottom-image">
              <p class="bottom-title">{{item.bottomTitle}}</p>
            </div>
          </div>
        </div>
      </div>
    </div>
</template>

<script>
  import qs from 'qs'
    export default {
        name: "four-floor",
      data(){
          return{
            list:[
              {
                title:"1F 收纳工具",
                borderBottom:"#c40000",
                color:"#c40000",
                titleImage:"https://15965632.s61i.faiusr.com/4/AD0IwLvOBxAEGAAgioaA0wUoyLS0tgQwPDg8.png",
                smallTitle:"收纳工具",
                bottomBg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgj4aA0wUogP3xdzCwCThQ.jpg",
                bottomTitle:"收纳 · 好帮手",
                data:[
                ]
              },
              {
                title:"2F 创意用品",
                borderBottom:"#ff9229",
                color:"#ff9229",
                titleImage:"https://15965632.s61i.faiusr.com/4/AD0IwLvOBxAEGAAgm4aA0wUo9enB6gEwPDg8.png",
                smallTitle:"创意用品",
                bottomBg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgkoaA0wUourzVOjCwCThQ.jpg",
                bottomTitle:"创意 · 好生活",
                data:[
                ]
              },
              {
                title:"3F 厨卫清洁",
                borderBottom:"#2abff7",
                color:"#2abff7",
                titleImage:"https://15965632.s61i.faiusr.com/4/AD0IwLvOBxAEGAAgnoaA0wUojKLvaDA8ODw.png",
                smallTitle:"厨卫清洁",
                bottomBg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgloaA0wUogPmj_wYwsAk4UA.jpg",
                bottomTitle:"厨卫 · 好工具",
                data:[
                ]
              },
              {
                title:"4F 衣架挂钩",
                borderBottom:"#fe7a65",
                color:"#fe7a65",
                titleImage:"https://15965632.s61i.faiusr.com/4/AD0IwLvOBxAEGAAgooaA0wUoy-mghwEwPjg8.png",
                smallTitle:"衣架挂钩",
                bottomBg:"https://15965632.s61i.faiusr.com/2/AD0IwLvOBxACGAAgmYaA0wUou8mDvwUwsAk4UA.jpg",
                bottomTitle:"衣架 · 好品味",
                data:[
                ]
              },
            ]
          }
      },
      mounted(){

      },
      methods:{
        dataS(){

        }
      },
      created(){

        this.axios.get(this.httpUrl+"/mainp.success").then((data2)=>{
            this.list[0].data = data2.data.slice(11,21);
            this.list[1].data = data2.data.slice(21,31);
            this.list[2].data = data2.data.slice(31,41);
            this.list[3].data = data2.data.slice(41,51);

        }).catch((err)=>{

        })
      }
    }
</script>

<style scoped>
  .floor {
    width: 100%;
  }
  .product-big {
    width: 100%;
    margin: 0 auto;
  }

  .oneF {
    width: 100%;
    margin-top: 3rem;
  }

  .oneF-title {
    width: 100%;
    color: #333;
    font-size: 2.5rem;
    position: relative;
    padding: 1rem 0;

  }
  .oneF-move{
    position: absolute;
    right: .8rem;
    font-size: 1rem;
    bottom: 1.3rem;
    cursor: pointer;
  }
  .oneF-div {
    width: 100%;

  }

  .oneF-div-top {
    width: 100%;
    display: flex;
  }

  .top-brief {
    width: 40rem;
    display: flex;
    align-items: center;
    justify-content: center;
  }

  .top-brief-big {
    text-align: center;
  }

  .top-brief-big-title {
    font-size: 2rem;
    font-weight: bolder;
    color: #fff;
  }
  .top-brief-right{
    display: flex;
    flex-wrap: wrap;
  }
  .top-center-content {
    position: relative;
    padding: 1.2rem;
    border-bottom: 1px solid #e7e7e7;
    border-right: 1px solid #e7e7e7;
  }

  .top-image {
    width: 12rem;
    height: 12rem;
    cursor: pointer;
  }

  .top-sousuo {
    position: absolute;
    top: 23%;
    left: 30%;
    cursor: pointer;
    display: none;
  }

  .top-title {
    width: 12rem;
    white-space: nowrap;
    overflow: hidden;
    text-overflow: ellipsis;
    font-size: 1.4rem;
    color: #666;
    margin-top: 1rem;
    cursor: pointer;
  }

  .top-price {
    margin-top: .5rem;
    color: #c40000;
    font-size: 1.2rem;
    position: relative;
  }

  .top-money {
    font-size: 2rem;
  }

  .del-money {
    color: #999;
    margin-left: .4rem;
    margin-right: .7rem;
    text-decoration: line-through;
  }
  .top-car{
    cursor: pointer;
    position: absolute;
    right: 0;
  }

  .oneF-bottom {
    width: 100%;
    position: relative;
    margin-top: 3.5rem;
    display: flex;
    align-items: center;
    justify-content: center;
  }

  .oneF-bottom-image {
    width: 100%;
    height: 7rem;
  }

  .bottom-title {
    font-size: 3rem;
    color: #fff;
    position: absolute;

  }
</style>
