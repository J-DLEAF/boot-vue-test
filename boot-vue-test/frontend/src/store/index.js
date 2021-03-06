import Vue from 'vue'
import Vuex from 'vuex'
import Constant from '../constant'

Vue.use(Vuex);

const store = new Vuex.Store({
  state: {
    todoList: []
  },
  mutations: {
    [Constant.ADD_TODO]: (state, payload) => {
      if (payload.todo !== '') {
        localStorage.setItem(payload.todo, JSON.stringify({
          todo: payload.todo,
          done: false
        }));

        state.todoList.push({
          todo: payload.todo,
          done: false
        });
      } else {
        alert('할 일을 입력해주세요!');
      }
    },

    [Constant.DONE_TOGGLE]: (state, payload) => {
      localStorage[payload.todo] = JSON.stringify({
        todo: payload.todo,
        done: state.todoList[payload.index].done
      });
      state.todoList[payload.index].done = !state.todoList[payload.index].done;
    },

    [Constant.DELETE_ALL]: (state, payload) => {
      localStorage.clear();
      state.todoList = [];
    },

    [Constant.DELETE_TODO]: (state, payload) => {
      localStorage.removeItem(payload.todo);
      console.log(payload.todo);
      state.todoList.splice(payload.index, 1);
    },

    [Constant.SHOW_LIST]: (state, payload) => {
      for (let i = 0; i < localStorage.length; i++) {
        let localKey = localStorage.key(i);
        if (localKey === 'loglevel:webpack-dev-server') continue;

        state.todoList.push({
          todo: localKey,
          done: JSON.parse(localStorage[localKey]).done
        });
      }
    }
    ,
    [Constant.DONE_ALL]: (state, payload) => {
      for (let i = 0; i < state.todoList.length ; i++){
        if(state.todoList[i].done == true){
          console.log(state.todoList[i].todo);
          localStorage.removeItem(state.todoList[i].todo);
          state.todoList.splice(i, 1);
        }
      }
    }
  }
});

export default store;