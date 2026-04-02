<template>
  <div class="card card-body">
    <h2>MemberInfo</h2>
    <div>
      <img :src="member.photo" />
      <h4>{{ member.name }} ({{ member.role }})</h4>
      <p>{{ member.desc }}</p>
      <a
        v-if="member.insta && member.insta !== ''"
        class="fa fa-instagram m-1"
        :href="member.insta"
      ></a>
      <a
        v-if="member.facebook && member.facebook !== ''"
        class="fa fa-facebook m-1"
        :href="member.facebook"
      ></a>
      <a
        v-if="member.youtube && member.youtube !== ''"
        class="fa fa-youtube m-1"
        :href="member.youtube"
      ></a>
    </div>
    <hr />
    <RouterLink class="home" to="/members">멤버 목록으로</RouterLink>
  </div>
</template>

<script setup>
import { useRoute } from 'vue-router';
import members from '@/members.json';

const route = useRoute();
const memberId = Number(route.params.id);

const member = members.find((mem) => mem.id === memberId);
</script>

<style scoped>
.home {
  text-decoration: none;
  color: black;
}
</style>
