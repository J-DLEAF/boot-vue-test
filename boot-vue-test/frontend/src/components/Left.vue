<template>
  <div>
    <!-- 상단메뉴 S -->
    <div class="top">
      <transition name="state" mode="out-in">
        <button v-if="fade == false" @click="enter" id="open">Menu ></button>
      </transition>

      <transition name="state" mode>
        <button v-if="fade == true" @click="enter" id="close">&lt; Close</button>
      </transition>
      <div id="login"></div>
    </div>
    <!-- 상단메뉴 E -->
    <transition name="toggle">
      <div class="left" v-if="fade">
        <ul>
          <li id="logo">
            <div>Menu</div>
          </li>
          <li v-for="list in linklist" :key="list.index">
            <router-link :to="list.link">{{ list.content }}</router-link>
          </li>
          <li>
            <a href="/test">socket test</a>
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
  </div>
</template>

<script>
export default {
  name: "left",
  data() {
    return {
      fade: false,
      linklist: [
        { content: "HOME", link: "/" },
        { content: "TODO APP", link: "/todoapp" },
        { content: "BOARD", link: "/read" },
        { content: "UP & DOWN", link: "/updown" }
      ]
    };
  },
  methods: {
    enter: function() {
      this.fade = !this.fade;
    }
  },
  components: {
  },
  created() {}
};
</script>

<style>
a {
  color: #000000;
}

.top {
  width: 100%;
  min-width: 1200px;
  height: 50px;
  position: relative;
  background: #ffffff;
  border-bottom: 4px solid #ffffff;
  z-index: 99;
  float: left;
  text-align: left;
  font-size: 18px;
}
.top button {
  font-family: "Passion One";
  font-size: 20px;
  border: 0;
  height: 50px;
  position: absolute;
  width: 100px;
  outline: 0;
}

.top #open {
  background: #ffffdc;
  color: #000000;
  border: 3px solid #fffddc;
}
.top #close {
  background: #ffffdc;
  color: #000000;
  border: 3px solid #fffddc;
}
.state-enter-active,
.state-leave-active {
  transition: all 0.5s;
  /* transition: opacity .5s; */
}

.state-enter,
.state-leave-to {
  left: -100px;
  opacity: 0;
}

.state-enter-to,
.state-leave {
  left: 0px;
  opacity: 1;
}

.left {
  float: left;
  position: relative;
  width: 300px;
  height: 850px;
  background: #ffffdc;
  padding: 40px 0;
  border-bottom-right-radius: 25px;
  z-index: 9;
}

.toggle-enter-active,
.toggle-leave-active {
  transition: all 1s;
}

.toggle-enter,
.toggle-leave-to {
  left: -300px;
  opacity: 0;
}

.toggle-enter-to,
.toggle-leave {
  left: 0px;
  opacity: 1;
}

.left ul {
  padding: 0 30px;
  position: fixed;
  width: 250px;
}
.left ul li {
  font-size: 25px;
  height: 75px;
}
.left ul li a {
  font-weight: 500;
  text-shadow: 1px 2px 2px #202020;
  transition: all 0.3s;
}
.left ul li a:hover {
  color: #ff284c;
  text-shadow: 4px 6px 3px #cf455c;
  letter-spacing: 5px;
}
.left ul li#logo {
  font-family: "Passion One", cursive;
  font-size: 50px;
  height: 142px;
}
.left ul li#logo div {
  line-height: 0.8;
}
.left ul li#company {
  font-size: 16px;
  margin-top: 150px;
  font-weight: bold;
}

@keyframes leftbtn {
  100% {
    left: 0px;
  }
  50% {
    left: 25px;
  }
  0% {
    left: -100px;
  }
}
</style>



