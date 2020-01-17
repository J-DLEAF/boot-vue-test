<template>
  <div id="login">
    <h1>회원가입 페이지 입니다!.</h1>
    <!-- <button @click="todo()">click?</button>
    <router-link :to="'todoapp'">router-link</router-link>-->
    <form class="join" action="/join" method="POST">
      <input placeholder="Enter your ID" name="userId" id="userId" />
      <br />
      <input type="password" Enter your password name="userPwd" id="userPwd" />
      <br />
	  <input placeholder="Enter your name" name="name" id="name" />
	  <br />
	  <input placeholder="Enter your address" name="address" id="address" />
	  <br />
      <!-- <p>여기! [[${msg}]] ${msg}</p> -->
      <button type="submit">가입하기</button>
    </form>
  </div>
</template>

<script>
export default {
  name: "join",
  components: {}
};
</script>


<style scoped>
.alert-danger p {
  color: red;
}
</style>