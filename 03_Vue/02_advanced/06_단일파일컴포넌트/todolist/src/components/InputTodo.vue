<template>
  <input
    type="text"
    class="form-control"
    @keyup.enter="addTodo"
    @keyup.ctrl.enter.exact="addTodo"
    v-model.trim="todo"
  />
  <button class="btn btn-primary input-group-addon" @click="addTodo">
    추가
  </button>
</template>

<script setup>
import { ref } from 'vue';
const todo = ref('');

const emit = defineEmits(['add']);

// todo 추가
const addTodo = (e) => {
  if (todo.value === '') {
    return;
  }

  emit('add', {
    id: new Date().getTime(),
    todo: todo.value,
    completed: e.ctrlKey ? true : false,
  });

  todo.value = '';
};
</script>

<style lang="scss" scoped></style>
