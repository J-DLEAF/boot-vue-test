<template>
    <div>
        <input v-model="writer" placeholder="글쓴이"/><Br/>
        <input v-model="title" placeholder="제목"/><Br/>
        <textarea v-model="content" placeholder="내용"/><Br/>
        <!--작성 버튼을 누르면 write함수 실행-->
        <button @click="index !== undefined ? update() : write()">{{index !== undefined ? '수정' : '작성'}}</button>
    </div>
</template>
<script>
import data from '@/data' // data불러옴

export default {
    name: 'Create',
    data() { 
        const index = this.$route.params.contentId;
        return {
            // v-model로 양방향 통신을 하도록
            data: data,
            // index를 삼항연산자를 이용하여 data값을 가져옴( 수정기능을 위함 )
            index: index,
            writer: index !== undefined ? data[index].writer : "", 
            title: index !== undefined ? data[index].title : "",
            content: index !== undefined ? data[index].content :"" 
        }
    },
    methods: {
        write() {  // write 함수
            this.data.push({ // 데이터의 배열에 객체를 push
                writer: this.writer,
                title: this.title,
                content: this.content 
            })
            this.$router.push({ // 작성되면 read(메인)화면으로 돌아감
                path: '/read'
            })
        },
        update() {
            data[this.index].writer = this.writer
            data[this.index].title = this.title
            data[this.index].content = this.content
            this.$router.push({
                path: '/read'
            })
        }
    }
}
</script>