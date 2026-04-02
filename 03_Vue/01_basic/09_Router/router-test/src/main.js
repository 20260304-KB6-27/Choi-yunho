import { createApp } from 'vue';
import App from './App.vue';
import router from './router';
import 'bootstrap/dist/css/bootstrap.css';

const app = createApp(App);

// vue 어플리케이션에 router 등록
app.use(router);

app.mount('#app');
