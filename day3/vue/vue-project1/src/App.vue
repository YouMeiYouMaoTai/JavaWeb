<template>
  <div>
    <!-- <h1>{{ message }}</h1> -->
    <!-- <element-view></element-view> -->

    <!-- 员工原理组件 -->
    <!-- <emp-view></emp-view> -->

    <router-view></router-view>
  </div>
</template>

<script>
// import EmpView from './views/tilas/EmpView.vue'
// import ElementView from './views/element/ElementView.vue'
export default {
  components: {/* EmpView */ /* ElementView */ },
  data() {
    return {
      message: "Hello Vue222"
    }
  },
  methods: {

  }
}
</script>

<style></style>
