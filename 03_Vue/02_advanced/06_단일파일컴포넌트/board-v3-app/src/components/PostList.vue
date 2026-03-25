<template>
  <ul class="list-unstyled">
    <PostListItem
      v-for="post in sortedPosts"
      :key="post.no"
      :post="post"
      @delete="$emit('delete', $event)"
      @update="$emit('update', $event)"
    />
  </ul>
</template>

<script setup>
import { computed } from 'vue';
import PostListItem from './PostListItem.vue';

const props = defineProps({ posts: Array });
defineEmits(['delete', 'update']);

const sortedPosts = computed(() => {
  return [...props.posts].sort((a, b) => b.no - a.no);
});
</script>
