<template>
  <li
    @click="toggleCompleted(todoitem.id)"
    ::key="todoitem.id"
    class="list-group-item"
    :class="{ 'list-group-item-success': todoitem.completed }"
  >
    <span
      class="pointer"
      :style="{ textDecoration: todoitem.completed ? 'line-through' : 'none' }"
    >
      {{ todoitem.todo }} {{ todoitem.completed ? '[완료]' : '' }}</span
    >

    <!-- 삭제하기 -->
    <span
      class="float-end badge bg-secondary pointer"
      @click="deleteTodo(todoitem.id)"
      >삭제</span
    >
  </li>
</template>

<script setup>
const props = defineProps({
  todoitem: Object,
});

const emit = defineEmits(['toggle', 'delete']);
const toggleCompleted = (id) => {
  emit('toggle', id);
};
const deleteTodo = (id) => {
  emit('delete', id);
};
</script>
<a href=""></a>
<style lang="scss" scoped></style>
