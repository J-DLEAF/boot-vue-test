import Vue from 'vue'
import Router from 'vue-router'
import TodoApp from '@/components/todo/TodoApp'
import Main from '@/components/Main'
import Login from '@/components/Login'
import Join from '@/components/join'
import DataGrid from '@/components/DataGrid'
import Read from '@/components/board/Read'
import Create from '@/components/board/Create'
import Detail from '@/components/board/Detail'

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
    },
    {
      path: '/join',
      name: 'join',
      component: Join
    },
    {
      path: '/datagrid',
      name: 'datagrid',
      component: DataGrid
    },
    {
      path: '/read',
      name: 'Read',
      component: Read
    },
    {
      path: '/create',
      name: 'create',
      component: Create
    },
    {
      path: '/detail',
      name: 'detail',
      component: Detail
    },
  ]
})
