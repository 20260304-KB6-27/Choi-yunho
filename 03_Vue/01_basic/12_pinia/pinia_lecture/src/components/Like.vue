<template>
  <h1>좋아요~~~!!!</h1>
  <h3>좋아요 갯수 : {{ like.likeCount }}</h3>
  <h3>좋아요 X5 : {{ like.fiveTime }}</h3>
  <button @click="increment">좋아요</button>
  <button @click="reset">초기화</button>
</template>

<script setup>
import { useLikePersistStore } from '@/stores/persist/persist_like';

// import { useLikeStore } from '@/stores/like';

const like = useLikePersistStore();
// 구조 분해 할당으로 꺼내는 방식
const { increment, reset } = useLikePersistStore();
</script>

<style scoped></style>
