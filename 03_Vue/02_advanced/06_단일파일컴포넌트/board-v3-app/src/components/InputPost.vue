<template>
  <div class="row mb-3">
    <div class="col d-flex justify-content-center">
      <div class="input-group" style="max-width: 400px">
        <input
          type="text"
          class="form-control"
          v-model="title"
          placeholder="제목 입력"
        />
        <input
          type="text"
          class="form-control"
          v-model="content"
          placeholder="내용 입력"
        />
      </div>
      <button @click="submit">추가</button>
    </div>
  </div>
</template>

<script setup>
import { ref } from 'vue';
const title = ref('');
const content = ref('');
const emit = defineEmits(['add']);

const submit = () => {
  if (title.value.trim() === '' || content.value.trim() === '') return;
  emit('add', { title: title.value, content: content.value });
  title.value = '';
  content.value = '';
};
</script>
