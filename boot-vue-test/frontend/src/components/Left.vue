<template>
  <div>
    <transition name="toggle">
      <div class="left" v-if="fade">
        <ul>
          <li id="logo">
            <div>Inventory</div>
          </li>
          <li v-for="list in linklist" :key="list">
            <router-link :to="list.link">{{ list.content }}</router-link>
          </li>
          <li id="company">
            <div>Welcomt to Inventory</div>
            <div>
              Seoul Gangnam
              <br />...
            </div>
            <div>@copyright demnodey</div>
          </li>
        </ul>
      </div>
    </transition>

    <img id="left_btn" @click="enter" src="../assets/logo.png" />
  </div>
</template>
<script>
export default {
  name: "left",
  data() {
    return {
      fade: false,
      linklist: [
        { content: "HOME", link: "/main" },
        { content: "TODO APP", link: "/todoapp" },
        { content: "BOARD", link: "/read" }
      ]
    };
  },
  methods: {
    enter: function() {
      this.fade = !this.fade;
    },
    resize: function() {
      $(window).resize(function() {
        var height = window.innerHeight / 2 + "px";
        $("#left_btn").css({ top: height });
      });
    }
  },
  created() {
    this.resize();
  }
};
</script>
<style>
a {
  color: black;
}
a:hover {
  color: rgb(176, 133, 220);
}
.left {
  position: fixed;
  top: 0px;
  left: 0px;
  width: 350px;
  height: 1000px;
  background: rgba(176, 133, 220, 0.6);
  padding: 40px 0;
  float: left;
}
.toggle-enter-active,
.toggle-leave-active {
  transition: all 1s;
}
.toggle-enter,
.toggle-leave-to {
  left: -350px;
  width: 0px;
}
.toggle-enter-to,
.toggle-leave {
  left: 0px;
  width: 350px;
}
.left ul {
  padding: 0 30px;
  position: fixed;
}
.left ul li {
  font-size: 25px;
  height: 75px;
}
.left ul li#logo {
  font-family: "Passion One", cursive;
  font-size: 50px;
  height: 170px;
}
.left ul li#logo div {
  line-height: 0.8;
}
.left ul li#company {
  font-size: 16px;
  margin-top: 150px;
}
#left_btn {
  position: fixed;
  height: 150px;
  top: 430px;
  left: -130px;
  cursor: pointer;
}
</style>
 