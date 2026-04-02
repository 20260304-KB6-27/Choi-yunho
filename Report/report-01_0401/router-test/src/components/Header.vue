<template>
  <nav class="navbar navbar-expand-md bg-dark navbar-dark mt-2">
    <span class="navbar-brand px-2">이날치(LeeNalChi)</span>
    <button class="navbar-toggler" type="button" @click="changeIsNavShow">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div :class="navClass">
      <ul class="navbar-nav">
        <li class="nav-item">
          <RouterLink class="nav-link" to="/">홈</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/about">소개</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/members">멤버</RouterLink>
        </li>
        <li class="nav-item">
          <RouterLink class="nav-link" to="/videos">영상</RouterLink>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script setup>
import { ref, computed } from 'vue';

const isNavShow = ref(false);
const navClass = computed(() =>
  isNavShow.value
    ? 'collapse navbar-collapse show'
    : 'collapse navbar-collapse',
);

const changeIsNavShow = (e) => {
  isNavShow.value = !isNavShow.value;
};
</script>

<style scoped></style>
