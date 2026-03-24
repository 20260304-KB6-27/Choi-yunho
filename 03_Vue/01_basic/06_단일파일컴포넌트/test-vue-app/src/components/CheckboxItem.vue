<template>
  <li><input type="checkbox" v-model="checked" /> 옵션</li>
</template>

<!-- setup을 사용하지 않았을 때 -->
<!-- <script>
import { ref } from 'vue';

const checked = ref(false);

export default {
  name: 'CheckboxItem',
  setup() {
    const checked = ref(false);

    return {
      checked,
    };
  },
};
</script> -->

<script scoped>
import { ref } from 'vue';

const checked = ref(false);
</script>

<style scoped></style>
