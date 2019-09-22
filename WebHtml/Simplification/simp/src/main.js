// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import $ from 'jquery'
import router from './router'
import store from './store'
import Config from './config/config'
import elementUi from 'element-ui'
import 'swiper/dist/css/swiper.min.css'
import 'element-ui/lib/theme-chalk/index.css'
import './assets/font/iconfont.css'
Vue.config.productionTip = false

Vue.use(elementUi)
Vue.use(Config)

/* eslint-disable no-new */
new Vue({
  el: '#app',
  router,
  store,
  components: { App },
  template: '<App/>'
});

