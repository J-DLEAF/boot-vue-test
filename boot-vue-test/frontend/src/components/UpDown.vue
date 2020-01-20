<template>
  <div id="app">
    <h1>숫자 업 다운 (1~100)</h1>
    <p>10번의 기회안에 맞추어 보세요!</p>
    <br />
    <transition name="state" mode="out-in">
      <button v-if="seen == false" @click="start()">시작하기</button>
    </transition>

    <transition name="state" mode="in-out">
      <button v-if="seen == true" @click="start()">그만하기</button>
    </transition>

    <transition name="toggle">
      <div class="updown" v-if="seen">
        <input type="Text" v-model.trim="msg" />
        <button @click="updown(msg)" v-bind:disabled="able">확인</button>
        <br />
        <div>횟수 : {{guess}}</div>
        <br />
        <div>최근 입력한 값 : {{lastResult}}</div>
        <br />
        <div>업/다운 : {{lowOrHi}}</div>
        <br />
      </div>
    </transition>
  </div>
</template>

<script>
import Constant from "../constant";
var randomNumber = Math.floor(Math.random() * 100) + 1;
export default {
  name: "updown",
  data() {
    return {
      seen: false,
      status: false,
      guesscount: 1,
      guess: 0,
      lastResult: "",
      lowOrHi: "",
      able: false
    };
  },
  components: {},
  methods: {
    start: function() {
      this.seen = !this.seen;
    },
    close: function() {
      this.seen = !this.seen;
    },
    updown(msg) {
      if (this.guess < 10) {
        if (msg < randomNumber) {
          this.guess += 1;
          this.lastResult += this.msg + " ";
          this.lowOrHi = "up";
        } else if (msg > randomNumber) {
          this.guess += 1;
          this.lastResult += this.msg + " ";
          this.lowOrHi = "down";
        } else if (msg == randomNumber) {
          alert("정답입니다.처음부터 재시작 합니다.!");
          this.setGameover();
        }
      } else if (this.guess == 10) {
        alert("횟수를 초과하였습니다. 처음부터 재시작합니다.!");
        this.setGameover();
      } else {
        console.log(randomNumber);
        console.log(msg);
        app.guess++;
        this.lowOrHi = "오류발생!";
      }
    },
    setGameover: function() {
      this.guess = 0;
      this.lastResult = "";
      this.lowOrHi = "";
      this.close();
      randomNumber = Math.floor(Math.random() * 100) + 1;
    }
  }
};
</script>


<style scoped>
.alert-danger p {
  color: red;
}
.state-enter-active,
.state-leave-active {
  transition: all 0.5s;
  /* transition: opacity .5s; */
}

.state-enter,
.state-leave-to {
  opacity: 0;
}

.state-enter-to,
.state-leave {
  opacity: 1;
}
.toggle-enter-active,
.toggle-leave-active {
  transition: all 0.5s;
}

.toggle-enter,
.toggle-leave-to {
  opacity: 0;
}

.toggle-enter-to,
.toggle-leave {
  opacity: 1;
}
</style>