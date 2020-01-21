<template>
  <div align="center">
    <!-- 테이블 형태로 구현-->
    <div>
      <b-table striped hover :items="items" fields="field in fields" width="50%"></b-table>
    </div>
    <!--글쓰기 버튼을 클릭하면 write함 수 실행-->
    <button @click="write">글쓰기</button>
  </div>
</template>
<script>
import data from "@/data";
let items = data.Content.sort((a, b) => {
  return b.content_id - a.content_id;
});
export default {
  name: "Read",
  props: {
    fields: [
      {
        key: "content_id",
        label: "글번호"
      },
      {
        key: "title",
        label: "제목"
      },
      {
        key: "created_at",
        label: "작성일"
      }
    ]
  },
  data() {
    return {
      items: items
    };
  },
  methods: {
    // create 경로로 이동
    write() {
      this.$router.push({
        path: "create"
      });
    },
    detail(index) {
      this.$router.push({
        name: "detail",
        path: "detail",
        params: {
          contentId: index
        }
      });
    }
  }
};
</script>
