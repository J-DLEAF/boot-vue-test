<template>
  <div class="hello">
    <div>
      <h1>메인 페이지</h1>
      <router-link :to="'todoapp'">할일목록 가기</router-link><Br/>
      <router-link :to="'read'">게시판</router-link><br/>
      <router-link :to="'updown'">업다운게임</router-link>
    </div>
  </div>
</template>

<script>
export default {
  name: "main",
  data() {
    return {
    };
  },
  components: {
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h1{
  color: #89b983;
}
h2 {
  font-weight: normal;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>
