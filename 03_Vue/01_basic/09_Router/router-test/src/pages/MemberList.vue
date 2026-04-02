  <template>
    <h1>Members</h1>
    <div v-for="mem in members" :key="mem.id">
      <RouterLink :to="{ name: 'members/id', params: { id: mem.id } }">
        <img :src="mem.photo" alt="" style="width: 90px; height: 110px" />
        <h6>{{ mem.name }}</h6>
      </RouterLink>
    </div>
  </template>

  <script setup>
  import members from '@/members.json';
  </script>

  <style scoped></style>
