<template>
    <div align="center">
        <!-- 테이블 형태로 구현-->
        <table>
            <tr>
                <td>글쓴이</td> 
                <td>제목</td>
                <td>내용</td>
            </tr>
            <!-- 리스트 렌더링으로 데이터를 가져옴-->
             <tr :key="index" v-for="(value, index) in data" @click="detail(index)">
                <td>{{value.writer}}</td>
                <td>{{value.title}}</td>
                <td>{{value.content}}</td>
            </tr>
        </table>
        <!--글쓰기 버튼을 클릭하면 write함 수 실행-->
        <button @click="write">글쓰기</button>
    </div>
</template>
<script>
import data from "@/data"

export default {
    name: 'Read',
    data() {
        return {
            data: data
        }
    },
    methods: {
        // create 경로로 이동
        write() { 
            this.$router.push({
                path: 'create'
            })
        },
        detail(index) {
            this.$router.push({
				name: 'detail',
				path: 'detail',
                params: {
                    contentId: index
                }
            })
        }
    }
}
</script>
