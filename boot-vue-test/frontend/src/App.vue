<template>
  <div id="app">
    <left></left>
    <main></main>
    <router-view/>
  </div>
</template>

<script>
import Left from '@/components/Left'
import Main from '@/components/Main'
export default {
    name: 'App',
  components: {
    Left,
    Main
  }
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
