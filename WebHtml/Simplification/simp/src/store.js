import Vue from "vue"
import Vuex from "vuex"

Vue.use(Vuex);

export default new Vuex.Store({
  //定义临时数据
  state:{
    //是否登录状态
    login:true,
    //首页右侧栏状态
    status:"1",
    //右侧栏迷你登录状态
    miniLogin: "",
    //首页全部商品悬浮效果的状态
    homeStatus:1,
    //banner下的三个产品
    mainp:[],
    //精品活动
    activity:[],
    //首页banner图
    banner:[],
    /**
     * returnNub 为1登录成功返回首页，2返回我的资料，3我的收藏，4我的订单，5我的购物车
     */
    returnNub:0,
    //跳转注册页面的状态
    tRegister:0,
    //收藏状态
    statusCollection:1,
    //我的订单-全部订单状态
    stateAllOrder:2,
    //购物车-订单状态
    statusShopping:false
  },
  //定义方法，用于改变state里面的值
  mutations: {
    add() {

    },
  }
})
