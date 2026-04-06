<template>
  <h3>반응형으로 꺼내기 : {{ counter.count }}</h3>
  <!-- 구조 분해 할당 시 값만 복사하기 때문에 반응형이 깨진다 -->
  <h3>값만 꺼내기 : {{ count }}</h3>
  <button @click="increment">+ 증가</button>
  <button @click="reset">초기화</button>
</template>

<script setup>
import { useCounterPersistStore } from '@/stores/persist/persist_counter';
// import { useCounterStore } from '@/stores/counter';

// State를 꺼낼때는 구조분해 할당을 하게 되면, 반응형이 깨짐
// 객체 자체를 꺼내서 쓰는 방식
const counter = useCounterPersistStore();
// 구조 분해 할당으로 꺼내는 방식
const { count, increment, reset } = useCounterPersistStore();
</script>

<style scoped></style>
