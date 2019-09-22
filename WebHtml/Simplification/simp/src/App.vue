<template>
  <div id="app">
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App',
  computed:{
    key(){
      return this.$router.push("/")
    }
  }
}
</script>

<style>
  html{
    font-size: 60.3%;
  }
  * {
    margin: 0;
    padding: 0;
  }
  li{
    list-style-type: none;
  }
  a{
    text-underline: none;
  }
</style>
