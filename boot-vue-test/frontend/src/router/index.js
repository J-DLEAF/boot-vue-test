import Vue from 'vue'
import Router from 'vue-router'
import TodoApp from '@/components/todo/TodoApp'
import Main from '@/components/Main'
import Join from '@/components/join'
import Read from '@/components/board/Read'
import Create from '@/components/board/Create'
import Detail from '@/components/board/Detail'
import UpDown from '@/components/UpDown'

Vue.use(Router)

export default new Router({
  mode: 'history',
  routes: [
    {
      path: '/',
      name: 'main',
      component: Main
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
    {
      path: '/updown',
      name: 'updown',
      component: UpDown
    },
  ]
})
