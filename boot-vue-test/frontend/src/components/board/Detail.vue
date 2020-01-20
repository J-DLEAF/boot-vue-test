<template>
    <div>
        <div>{{data.writer}}</div> 
        <div>{{data.title}}</div>
        <div>{{data.content}}</div>
        <button @click="updateData">수정</button>
        <button @click="deleteData">삭제</button>
    </div>
</template>

<script>
import data from '@/data'
export default {
    name: 'Detail',
    data() { // index는 현재 route의 param속성에 있는 contentId를 가져옴
        const index = this.$route.params.contentId
        return {
            data: data[index], // data배열에서 가지고 있는 객체를 각각 띄우기 위함
            index: index,
        }
    },
    methods: {
        // splice함수는 배열.splice(인덱스,1); 이렇게 사용함
        deleteData() {
             data.splice(this.index, 1)
             this.$router.push({
                 path: '/read'
             })
        },
        updateData() {
            this.$router.push({
				name: 'create',
				path: 'create',
                params: {
                    contentId: this.index
                }
            })
        }
    }
}
</script>


