import { ref, computed } from 'vue';
import { defineStore } from 'pinia';

// defineStore('고유명', 함수) => 고유 ID는 중복 X
export const useLikeStore = defineStore('like', () => {
  // state
  const likeCount = ref(Number(sessionStorage.getItem('like-session') || 0));

  // getter
  // 여러 컴포넌트에서 사용하는(공유되는) 계산 값
  const fiveTime = computed(() => likeCount.value * 5);

  // actions
  function increment() {
    likeCount.value++;

    /*
    sessionStorage 
    - 현재 '탭'에서만 유지됨 (임시데이터, 일회성 상태 )
    */
    sessionStorage.setItem('like-session', likeCount.value);
  }

  function reset() {
    likeCount.value = 0; // 초기화
  }

  return { likeCount, fiveTime, increment, reset };
});
