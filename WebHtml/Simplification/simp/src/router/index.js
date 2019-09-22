import Vue from 'vue'
import Router from 'vue-router'

import HelloWorld from '@/components/HelloWorld'
import Big from '@/components/big'
import HomeMenu from '@/components/home/homeMenu'
import FourFloor from '@/components/home/fourFloor'
import Product from '@/components/Product/product'
import StorageTool from '@/components/StorageTool/storageTool'
import CreativeProducts from '@/components/creativeProducts/creativeProducts'
import Clean from '@/components/clean/clean'
import Hanger from '@/components/hanger/hanger'
import Login from '@/components/login/login'
import MemberCenter from '@/components/memberCenter/memberCenter'
import MyInformation from '@/components/memberCenter/myInformation/myInformation'
import MyOrder from '@/components/memberCenter/myOrder/myOrder'
import AllOrder from '@/components/memberCenter/myOrder/allOrder'
import Payment from '@/components/memberCenter/myOrder/payment'
import ToShipped from '@/components/memberCenter/myOrder/toShipped'
import Shipped from '@/components/memberCenter/myOrder/shipped'
import Completed from '@/components/memberCenter/myOrder/completed'
import Consignee from '@/components/memberCenter/consignee/consignee'
import MyCollection from '@/components/memberCenter/myCollection/myCollection'
import ShoppingCar from '@/components/shoppingCar/shoppingCar'
import ProdDetails from '@/components/prodDetails/prodDetails'

Vue.use(Router)

export default new Router({
  routes: [

    {
      path: '/',
      name: 'HelloWorld',
      component: HelloWorld,
      children:[
        {
          path:'/',
          component:Big,
          children:[
            //首页
            {
              path:'/',
              component:HomeMenu,
              children:[
                {
                  path:'/',
                  component:FourFloor
                }
              ]
            },
            //全部商品
            {
              path:'/allProduct',
              component:Product
            },
            //收纳工具
            {
              path:'/tool',
              component:StorageTool
            },
            //创意用品
            {
              path:'/originality',
              component:CreativeProducts
            },
            //厨卫清洁
            {
              path:'/clean',
              component:Clean
            },
            //衣架挂钩
            {
              path:'/hanger',
              component:Hanger
            },
            //登录注册
            {
              path:'/login',
              component:Login
            },
            //会员中心
            {
              path:'/member',
              component:MemberCenter,
              children:[
                //我的资料
                {
                  path:'',
                  component:MyInformation
                },
                //我的资料
                {
                  path:'/information',
                  component:MyInformation
                },
                //我的订单
                {
                  path:'/order',
                  component:MyOrder,
                  children:[
                    //我的订单下的全部订单
                    {
                      path:'',
                      component:AllOrder
                    },
                    //同上
                    {
                      path:'/allorder',
                      component:AllOrder
                    },
                    //待付款
                    {
                      path:'/payment',
                      component:Payment
                    },
                    //待发货
                    {
                      path:'/toshipeed',
                      component:ToShipped
                    },
                    //已发货
                    {
                      path:'/shipeeed',
                      component:Shipped
                    },
                    //交易完成
                    {
                      path:'/completed',
                      component:Completed
                    }
                  ]
                },
                //收货人信息
                {
                  path:"/consignee",
                  component:Consignee
                },
                //我的收藏
                {
                  path:"/collection",
                  component:MyCollection
                }
              ]
            },
            //购物车
            {
              path:'shopping',
              component:ShoppingCar
            },
            //商品详情
            {
              path:'details',
              component:ProdDetails
            }
          ]
        },
      ]
    }
  ]
})
