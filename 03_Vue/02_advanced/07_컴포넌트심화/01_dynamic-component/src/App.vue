<template>
  <h1>동적 컴포넌트</h1>
  <hr />
  <div class="header">
    <h1 class="headerText">태평양 전쟁의 해전</h1>
    <ul class="nav nav-tabs nav-fill">
      <li v-for="tab in tabs" :key="tab.id" class="nav-item">
        <a @click="changeTab(tab.id)" class="nav-link"> {{ tab.label }}</a>
      </li>
    </ul>
    <div class="container">
      <KeepAlive>
        <component :is="currentTab"></component>
      </KeepAlive>
    </div>
  </div>
</template>

<script setup>
import { ref, computed } from 'vue';
import CoralSeaTab from './components/CoralSeaTab.vue';
import LeyteGulfTab from './components/LeyteGulfTab.vue';
import MidwayTab from './components/MidwayTab.vue';
/*
 동적 컴포넌트
 - is 속성을 사용하여 런타임에 렌더링할 컴포넌트를 동적으로 바꿀 수 있다.
 - Tab UI / 스텝 UI 에서 사용
*/
// :is에 컴포넌트 객체 전달
const tabComponents = {
  CoralSeaTab,
  LeyteGulfTab,
  MidwayTab,
};

const currentTab = computed(() => tabComponents[currentTabName.value]);

const tabs = ref([
  { id: 'CoralSeaTab', label: '산호해 해전' },
  { id: 'MidwayTab', label: '미드웨이 해전' },
  { id: 'LeyteGulfTab', label: '레이테만 해전' },
]);

const currentTabName = ref('CoralSeaTab');

// 클릭됐을 때 currentTabName 변경
function changeTab(tabId) {
  currentTabName.value = tabId;
}
</script>

<style scoped>
.header {
  padding: 20px 0px 0px 20px;
}
.headerText {
  padding: 0px 20px 40px 20px;
}
.tab {
  padding: 30px;
}
</style>
