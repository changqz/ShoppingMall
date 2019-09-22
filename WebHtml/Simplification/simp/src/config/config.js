import axios from "axios";

export default {
  install(Vue,option){
    Vue.prototype.axios = axios;
    //httpUrl地址是会改变如果程序出错请看笔记
    Vue.prototype.httpUrl = "http://192.168.31.104:8080/Simplification";
  }
}
