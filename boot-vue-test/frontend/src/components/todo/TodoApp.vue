<template>
  <div id="todo-app">
    <h1>할 일</h1>
    <todo-input />
    <todo-list />
    <todo-clear />
    <todo-dclear />
  </div>
</template>

<script>
import TodoInput from './TodoInput'
import TodoList from './TodoList'
import TodoClear from './TodoClear'
import TodoDclear from './TodoDclear'
export default {
  name: 'todo-app',
  components: {
    TodoInput,
    TodoList,
    TodoClear,
    TodoDclear
  }
}
</script>

<style scoped>
  #todo-app {
    margin: 15;
    position: relative;
  }
  h1 {
    color: #484848;
    text-align: center;
    padding-top: 2.5rem;
  }
</style>
