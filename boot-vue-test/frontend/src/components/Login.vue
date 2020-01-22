<template>
  <div id="login">
    <h1>로그인 페이지 입니다!.</h1>
    <!-- <button @click="todo()">click?</button>
    <router-link :to="'todoapp'">router-link</router-link>-->
    <form class="login" method="POST" name = "loginform">
      <input placeholder="Enter your ID" name="userId" id="userId" />
      <br />
      <input placeholder="Enter your password" name="userPwd" id="userPwd" />
      <br />
      <!-- <p>여기! [[${msg}]] ${msg}</p> -->
      <button @click="join()">회원가입!</button>
      <button @click="login()">Login</button>
    </form>
    <a href="/test">socket test</a>
    <button @click="todo()">click here</button>
  </div>
</template>

<script>
export default {
  name: "login",
  methods: {
    login() {
      document.loginform.action = "login";
      document.loginform.submit();
      todo();
    },
    join() {
      this.$router.push({
        name: "join"
      });
    },
    todo() {
      this.$router.push({
        name: "/"
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