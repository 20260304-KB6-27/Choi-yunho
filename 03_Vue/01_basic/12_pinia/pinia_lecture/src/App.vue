<template>
  <Counter></Counter>
  <Like></Like>
</template>

<script setup>
import Counter from './components/Counter.vue';
import Like from './components/Like.vue';
import { useCounterPersistStore } from './stores/persist/persist_counter';
import { useLikePersistStore } from './stores/persist/persist_like';
// import { useCounterStore } from './stores/counter';
// import { useLikeStore } from './stores/like';

const counter = useCounterPersistStore();
const like = useLikePersistStore();
</script>

<style scoped></style>
