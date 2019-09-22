<template>
    <div class="consignee">

      <div class="consignee-big">
        <p class="inform-title">{{title}}</p>

        <div class="complete">
          <div class="msg">
            <span class="hover-img">
              <img src="../../../assets/menber/upd.png" alt="" @click="upd()" title="修改">&nbsp;&nbsp;&nbsp;&nbsp;
              <img src="../../../assets/menber/del.png" alt="" @click="del()" title="删除">
            </span>
            <p class="upd-del"></p>
            <p class="bg"></p>
            <p class="msg-name">姓名 : {{name}}</p>
            <p class="msg-name">电话 : {{phone}}</p>
            <p class="msg-address">地址 : {{address}}</p>
          </div>
          <div class="msg">
            <span class="hover-img">
              <img src="../../../assets/menber/upd.png" alt="" title="修改">&nbsp;&nbsp;&nbsp;&nbsp;
              <img src="../../../assets/menber/del.png" alt="" title="删除">
            </span>
            <p class="upd-del"></p>
            <p class="bg"></p>
            <p class="msg-name">姓名 : {{name}}</p>
            <p class="msg-name">电话 : {{phone}}</p>
            <p class="msg-address">地址 : {{address}}</p>
          </div>
          <div class="msg">
            <span class="hover-img">
              <img src="../../../assets/menber/upd.png" alt="" title="修改">&nbsp;&nbsp;&nbsp;&nbsp;
              <img src="../../../assets/menber/del.png" alt="" title="删除">
            </span>
            <p class="upd-del"></p>
            <p class="bg"></p>
            <p class="msg-name">姓名 : {{name}}</p>
            <p class="msg-name">电话 : {{phone}}</p>
            <p class="msg-address">地址 : {{address}}</p>
          </div>
          <div class="insert-msg" @click="dialogTableVisible = true">
            <div class="bg-insert"></div>
            <span class="insert-font">添加信息</span>
          </div>

          <el-dialog title="收货地址" :visible.sync="dialogTableVisible">
            <div class="modelFrame">
              <div class="model-left">
                <ul class="left-list">
                  <li>姓名:<span class="star">*</span></li>
                  <li>详细地址:<span class="star">*</span></li>
                  <li>手机:<span class="star">*</span></li>
                </ul>
              </div>
              <div class="model-right">
                <ul class="right-list">
                  <li><input type="text" class="listName"></li>
                  <li><input type="text" class="listAddress" placeholder="地址"></li>
                  <li><input type="text" class="listName"></li>
                </ul>
              </div>

            </div>
            <div class="modelFrame-btn">
              <p class="btn-p btn-error" @click="error()">取消</p>
              <p class="btn-p btn-success" @click="success()">确定</p>
            </div>
          </el-dialog>


        </div>

      </div>

    </div>
</template>

<script>
    import ElButton from "element-ui/packages/button/src/button";
    import {getCascaderObj} from '../../../js/consignee/consignee'
    export default {
      components: {ElButton},
      name: "consignee",
      data(){
          return{
            title:"收货人信息",
            name:"撒打算",
            phone:"12345668523",
            address:"大厦附近活动经费火箭的实力复活节哈记得发货哈就是",
            dialogTableVisible:false,
          }
      },
      mounted(){

      },
      methods:{
        del(){
          this.$confirm('此操作将永久删除该地址, 是否继续?', '提示', {
            confirmButtonText: '确定',
            cancelButtonText: '取消',
            type: 'warning',
            center: true
          }).then(() => {
            this.$message({
              type: 'success',
              message: '删除成功!'
            });
          }).catch(() => {
            this.$message({
              type: 'info',
              message: '已取消删除'
            });
          });
        },
        upd(){
          this.dialogTableVisible = true;
        },
        error(){
          this.dialogTableVisible = false;
          this.$message.error("已取消");
        },
        success(){
          this.dialogTableVisible = false;
          this.$message.success("成功")
        }
      }
    }
</script>

<style scoped>
  .consignee {
    width: 100%;
  }

  .consignee-big {
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

  .complete {
    width: 100%;
    display: flex;
    flex-wrap: wrap;
  }

  .msg {
    width: 29rem;
    border: 1px solid red;
    border-radius: 1rem;
    position: relative;
    margin-left: 2rem;
    margin-top: 2rem;
    cursor: pointer;
    overflow: hidden;
  }

  .upd-del{
    width: 100%;
  }

  .hover-img{
    position: absolute;
    right: 2rem;
    transform: translate(0,-1.6rem);
    transition: transform .7s;
  }

  .msg:hover .hover-img{
    transform: translate(0,1.6rem);
    transition: transform .7s;
  }

  .bg {
    width: 100%;
    height: 1.6rem;
    background-position: 119.5% 0;
    background-image: url("https://2.ss.faisys.com/image/v2/vbg01.png?v=201902201454");
    border-radius: 10px 10px 0 0;
  }

  .msg-name {
    width: 90%;
    margin: 0 auto;
    padding: 1rem 0;
    font-size: 1.4rem;
    color: #666;
    border-bottom: 1px dashed #ededed;
  }

  .msg-address {
    width: 90%;
    height: 5rem;
    padding: 1rem;
    font-size: 1.4rem;
    color: #666;
    margin: 0 auto;
  }

  .insert-msg {
    width: 29rem;
    cursor: pointer;
    border: 1px solid red;
    border-radius: 1rem;
    margin-left: 2rem;
    position: relative;
    margin-top: 2rem;
    display: flex;
    justify-content: center;
    align-items: center;
  }

  .bg-insert {
    width: 10rem;
    height: 5.5rem;
    background-position: 3.8% 8.5%;
    background-image: url("https://2.ss.faisys.com/image/v2/vbg01.png?v=201902201454");
  }

  .insert-font {
    position: absolute;
    font-size: 1.8rem;
    color: #999;
    top: 60%;
  }

  .modelFrame {
    width: 100%;
    display: flex;
  }

  .model-left {
    flex: .4;
  }

  .model-right {
    flex: 1;
  }

  .left-list {
    width: 100%;
  }
  .left-list li{
    text-align: right;
    font-size: 1.5rem;
    color: #666;
    height: 3.5rem;
    line-height: 3.5rem;
    padding: 0 0 1.6rem 0;
  }

  .star {
    font-size: 1.3rem;
    color: red;
    margin: 0 1rem;
  }

  .right-list {
    width: 100%;
  }
  .right-list li{
    text-align: left;
    padding: 0 0 1.6rem 0;
  }

  .listName {
    width: 26rem;
    height: 3.5rem;
    border: 1px solid #e9e9e9;
    padding-left: .6rem;
    font-size: 1.5rem;
    color: #666;
  }
  .listAddress{
    width: 26rem;
    height: 3.5rem;
    border: 1px solid #e9e9e9;
    padding-left: .6rem;
    font-size: 1.5rem;
    color: #666;
  }

  .modelFrame-btn {
    width: 60%;
    display: flex;
    margin:0 auto;
    justify-content: center;
  }

  .btn-p {
    width: 8rem;
    height: 3rem;
    border-radius: .5rem;
    line-height: 3rem;
    text-align: center;
    color: #fff;
    font-size: 1.5rem;
    cursor: pointer;
  }

  .btn-error {
    background-color: #4483ff;
  }

  .btn-success {
    background-color: #c40000;
    margin-left: 1rem;
  }
</style>
