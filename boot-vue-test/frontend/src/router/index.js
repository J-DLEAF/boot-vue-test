import Vue from 'vue'
import Router from 'vue-router'
import TodoApp from '@/components/todo/TodoApp'
import Main from '@/components/Main'
import Login from '@/components/Login'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/main',
      name: 'main',
      component: Main
    },
    {
      path: '/',
      name: 'login',
      component: Login
    },
    {
      path: '/todoapp',
      name: 'todo-app',
      component: TodoApp
    }
  ]
})
