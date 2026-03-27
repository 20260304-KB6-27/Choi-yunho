<template>
  <li ::key="todoitem.id" @click="toggleCompleted(todoitem.id)">
    <span
      class="pointer"
      :style="{ textDecoration: todoitem.completed ? 'line-through' : 'none' }"
    >
      {{ todoitem.todo }} {{ todoitem.completed ? '[완료]' : '' }}
    </span>
    <span @click="deleteTodo(todoitem.id)"> 삭제</span>
  </li>
</template>

<script setup>
const props = defineProps({ todoitem: Object });
const emit = defineEmits(['toggle', 'delete']);

const toggleCompleted = (id) => {
  emit('toggle', id);
};
const deleteTodo = (id) => {
  emit('delete', id);
};
</script>

<style scoped></style>
