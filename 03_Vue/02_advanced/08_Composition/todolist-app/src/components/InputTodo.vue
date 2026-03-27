<template>
  <div>
    <input type="text" @keyup.enter="addTodo" v-model="todo" />
    <button @click="addTodo">추가</button>
  </div>
</template>

<script setup>
import { ref } from 'vue';

const props = defineProps({ todolist: Array });
const emit = defineEmits(['add']);
const todo = ref('');

const addTodo = (e) => {
  if (todo.value === '') {
    return;
  }

  emit('add', {
    id: new Date().getTime(),
    todo: todo.value,
    completed: false,
  });

  todo.value = '';
};
</script>

<style scoped></style>
