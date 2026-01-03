<h1 id="hora"></h1>

<script>
setInterval(() => {
    let agora = new Date();
    hora.innerText =
        agora.getHours() + ":" +
        agora.getMinutes() + ":" +
        agora.getSeconds();
}, 1000);
</script>
