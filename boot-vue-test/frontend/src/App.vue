<template>
  <div id="app">
    <left></left>
    <router-view/>
  </div>
</template>

<script>
import Left from '@/components/Left'
export default {
    name: 'App',
  components: {
    Left
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
