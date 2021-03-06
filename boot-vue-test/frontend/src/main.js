// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue';
import App from './App';
import router from './router';
import store from './store';
import BootstrapVue from 'bootstrap-vue'
import 'bootstrap/dist/css/bootstrap.css'
import 'bootstrap-vue/dist/bootstrap-vue.css'
// import VueRouter from 'vue-rotuer'
// Vue.use(VueRouter);

Vue.use(BootstrapVue)
Vue.config.productionTip = false;

new Vue({
  el: '#app',
  store,
  router,
  components: { App },
  template: '<App/>'
});