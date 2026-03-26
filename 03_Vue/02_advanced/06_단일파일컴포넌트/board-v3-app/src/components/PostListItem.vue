<template>
  <li class="post-item border-bottom p-3" @click="isView = !isView">
    <div class="d-flex justify-content-between">
      <div>{{ post.no }}. {{ post.title }}</div>
    </div>
    <span class="ms-auto">{{ isView ? '▲' : '▼' }}</span>
    <br />
    <div class="post-content" v-if="isView" @click.stop>
      <div v-if="isEdit">
        <input v-model="editTitle" class="form-control mb-2" />
        <textarea v-model="editContent" class="form-control mb-2"></textarea>
        <button @click="save">저장</button>
        <button @click="isEdit = false" style="background-color: #888">
          취소
        </button>
      </div>
      <div v-else>
        <p>{{ post.content }}</p>
        <button @click="$emit('delete', post.no)">삭제</button>
        <button @click="goEdit">수정</button>
        <button @click="isView = false">닫기</button>
      </div>
    </div>
  </li>
</template>

<script setup>
import { ref } from 'vue';
const props = defineProps({ post: Object });
const emit = defineEmits(['delete', 'update']);

const isView = ref(false);
const isEdit = ref(false);
const editTitle = ref('');
const editContent = ref('');

const goEdit = () => {
  isEdit.value = true;
  editTitle.value = props.post.title;
  editContent.value = props.post.content;
};

const save = () => {
  emit('update', {
    no: props.post.no,
    title: editTitle.value,
    content: editContent.value,
  });
  isEdit.value = false;
};
</script>
