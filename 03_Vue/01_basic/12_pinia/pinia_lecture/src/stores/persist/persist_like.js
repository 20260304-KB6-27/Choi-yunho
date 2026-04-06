import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

export const useLikePersistStore = defineStore(
  'like-persist',
  () => {
    const likeCount = ref(0);

    const fiveTime = computed(() => likeCount.value * 5);

    function increment() {
      likeCount.value++;
    }

    return { likeCount, fiveTime, increment };
  },
  {
    persist: {
      key: 'like-p', // storage에 저장될 key 이름 (기본값 store ID)
      storage: sessionStorage, // 기본값 : localStorage
      pick: ['like'], // 저장하고 싶은 상태값 지정 가능
    },
  },
);
