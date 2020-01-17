<template>
  <div id="login">
    <h1>로그인 페이지 입니다!.</h1>
    <!-- <button @click="todo()">click?</button>
    <router-link :to="'todoapp'">router-link</router-link>-->
    <form class="login" action="/login" method="POST">
      <input placeholder="Enter your ID" name="userId" id="userId" />
      <br />
      <input placeholder="Enter your password" name="userPwd" id="userPwd" />
      <br />
      <!-- <p>여기! [[${msg}]] ${msg}</p> -->
      <button @click="todo()">click!</button>
      <button type="submit">Login</button>
    </form>

  </div>
</template>

<script>
export default {
  name: "login",
  methods: {
    todo() {
      this.$router.push({
        name: "main" //
      });
    }
  },
  components: {}
};
</script>


<style scoped>
.alert-danger p {
  color: red;
}
</style>