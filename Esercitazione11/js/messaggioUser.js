let benvenuto = document.querySelector("#benvenuto");
let username = document.querySelector("#username");
let btnInvia = document.querySelector("#btnInvia");
let btnLogout = document.querySelector("#btnLogout");
let messaggio = document.querySelector("#messaggio");
let feed = document.querySelector("#feed");
let demo = document.querySelector("#demo");

let msgColor = ["msg-utenti-lilac", "msg-utenti-green", "msg-utenti-rose"];
let msgColorLngth;

let utentiJSON;
let utenteConnessoJSON;

window.addEventListener("DOMContentLoaded",function(){
    if(this.localStorage.length !== 0){
        utenteConnessoJSON = JSON.parse(this.localStorage.getItem("userConnesso"));
        utentiJSON = JSON.parse(this.localStorage.getItem("tuttiUser"));

        const index = utentiJSON.findIndex(utente => utente.username == utenteConnessoJSON.username);

        feed.innerHTML += `<p class="p-0 mb-1 mt-usrnm">${utenteConnessoJSON.username}:</p>`;
        utenteConnessoJSON.contenuto.forEach((element) => feed.innerHTML += `<p class="msg-m-bg">${element}</p>`);
        msgColorLngth = msgColor.length;
        for (let i = 0; i < utentiJSON.length; i++) {
            msgColorLngth--;
            if (i === index) {
                continue; 
            }
        demo.innerHTML += `<p class="p-0 mt-5 mb-1 allUsers-usrnm">${utentiJSON[i].username}:</p>`;

        utentiJSON[i].contenuto.forEach(element => {
            demo.innerHTML += `<p class="msg-bg msg-utenti ${msgColor[msgColorLngth]} text-wrap">${element}</p>`;
        });
         
        if(msgColorLngth <= 0) {
            msgColorLngth = msgColor.length;
        }
    }
        benvenuto.innerHTML = "Benvenut*, ";
        benvenuto.innerHTML += `<span class="usrnm">${utenteConnessoJSON.username}</span>`;
    
        username.setAttribute("value",utenteConnessoJSON.username);
    } else{
         feed.innerHTML += "<p mb-3>Non c'e un utente connesso</p>";
         feed.innerHTML += '<button type="submit" onclick = "login()" class="lbtn">Login</button>';
     }
 });

function login() {
    window.location.href = "./login.html";
}

function logoutUser(){
      localStorage.removeItem("userConnesso");
      location.reload();
}

btnLogout.addEventListener("click", function() {
    if(localStorage.length !== 0){
        localStorage.setItem("users",JSON.stringify(utentiJSON));
        logoutUser();
    }
    window.location.href = "./login.html";
});

function inviaMessaggio(event){
    if(messaggio.value.length === 0){
        event.preventDefault();
        event.stopImmediatePropagation();
    }else{

    feed.innerHTML = "";

    utenteConnessoJSON.contenuto.push(messaggio.value);

    for (let i = 0; i < utentiJSON.length; i++) {
        if (utenteConnessoJSON.username === utentiJSON[i].username) {
            utentiJSON[i].contenuto = utenteConnessoJSON.contenuto;
            localStorage.setItem("userConnesso",JSON.stringify(utenteConnessoJSON));
            localStorage.setItem("tuttiUser",JSON.stringify(utentiJSON));
            utentiJSON = JSON.parse(localStorage.getItem("tuttiUser"));
            utenteConnessoJSON = JSON.parse(localStorage.getItem("userConnesso"));
            localStorage.setItem("users",JSON.stringify(utentiJSON));
            feed.innerHTML += `<p class="p-0 mb-1 mt-usrnm">${utentiJSON[i].username}:</p>`;
            utentiJSON[i].contenuto.forEach((element) => feed.innerHTML += `<p class="msg-m-bg text-wrap">${element}</p>`);
            break;
        } 
    }
    let contenutoMsg = document.querySelector("#messaggio");
    contenutoMsg.value = "";
    document.querySelector("#caratteriRestanti").textContent = 100;
    }
}

btnInvia.addEventListener("click",inviaMessaggio);

let charRes = document.querySelector("#caratteriRestanti");

function controllaCaratteri(){
    let carRestanti = 100 - messaggio.value.length;
    charRes.textContent = carRestanti;
    if(carRestanti <= 0){
        let contenutoMsg = document.querySelector("#messaggio").value.substring(0,100);
        messaggio.value = contenutoMsg;
        document.querySelector("#caratteriRestanti").textContent = 0;
    }
}

messaggio.addEventListener("input",controllaCaratteri);
