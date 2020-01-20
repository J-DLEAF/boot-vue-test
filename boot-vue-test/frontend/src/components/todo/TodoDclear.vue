<template>
  <div>
    <button id="dclear-all" @click="DoneClear">
      <span>체크 된것만 삭제!</span>
    </button>
  </div>
</template>
<script>
import Constant from "../../constant";
export default {
  name: "todo-dclear",
  methods: {
    DoneClear() {
      this.$store.commit(Constant.DONE_ALL);
    }
  }
};
</script>

<style scoped>
#dclear-all {
  width: 30%;
  margin: 0 auto 0.5rem auto;
  height: 2.5rem;
  background-color: #fff;
  border-radius: 5px;
  box-shadow: 5px 10px 10px rgba(0, 0, 0, 0.03);
  display: flex;
  justify-content: center;
  align-items: center;
}
span {
  font-size: 1.1rem;
  color: #de4343;
  font-weight: 700;
}
</style>