let username = document.querySelector("#username");
let password = document.querySelector("#password");
let btnLogin = document.querySelector("#btnLogin");

class newUser {
    constructor(username, contenuto = []) {
        this.username = username;
        this.contenuto = contenuto;
    }
}


let utenti = [];
if(localStorage.length != 0){
    utenti = JSON.parse(this.localStorage.getItem("users"));
}

function loginUser(){
    
    let hasUser = utenti.some(utente => utente.username === username.value);
    if(hasUser === true){
        let index = utenti.findIndex(utente => utente.username === username.value);
        localStorage.setItem("userConnesso",JSON.stringify(utenti[index]));
        localStorage.setItem("tuttiUser",JSON.stringify(utenti));
        location.reload();
    } else{
        let utente = new newUser(username.value);
        utenti.push(utente);
        localStorage.setItem("userConnesso",JSON.stringify(utente));
        localStorage.setItem("tuttiUser",JSON.stringify(utenti));
        location.reload();
    }  
}

btnLogin.addEventListener("click", loginUser);