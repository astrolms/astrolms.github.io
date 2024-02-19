/** 
 ***********************************  CONSTRUCTOR  ************************
 * @param {String} username 
 * @param {Array} message 
 */
function userMessage(username, message = []){
    this.username = username;
    this.message = message;
}

let msgForm = document.querySelector("#msgForm");
let msgCompleto = document.querySelector("#msgCompleto");


/*************************************  USERNAME  *****************************/

let username = document.querySelector("#elUsername");
let usernameValidated = false;

function validate(){
    if(username.value.length < 5){
        usernameValidated = false;
        username.classList.add("borderRed");
    } else {
        usernameValidated = true;
        username.classList.replace("borderRed","borderGreen");
    }
}

username.addEventListener("keyup", ()=>{
    if(username.value.length < 5) {
        username.classList.add("borderRed");
    } else{
        username.classList.replace("borderRed","borderGreen");
    }
})

username.addEventListener("blur",validate);

/*******************************  MESSAGE  *****************************************/

let message = document.querySelector("#message");
let contatore = document.querySelector("#contatore");

message.setAttribute("maxlength","100");
const keyCode = ["AltLeft", "AltRight", "CapsLock", "ContextMenu", 
"ControlLeft", "ControlRight", "MetaLeft", "MetaRight", "ShiftLeft",
"ShiftRight", "ArrowDown", "ArrowLeft", "ArrowRight", "ArrowUp","Backspace"];

let cont = 100;
contatore.innerHTML = cont;

message.addEventListener("keydown",(event)=>{
    if(!keyCode.includes(event.code) && cont > 0){
        cont = 99 - message.value.length;
        contatore.innerHTML = cont;
    }
    else if(event.code == "Backspace" && cont < 100){
        cont++;
        contatore.innerHTML = cont;
    }
})

function cutSelection(event) {
    const selection = window.getSelection();
    event.clipboardData.setData("text/plain", selection.toString());
    let sl = selection.toString().length;
    console.log(sl);
    selection.deleteFromDocument();
    cont = parseInt(contatore.innerHTML) + sl;
    contatore.innerHTML = cont;
}

message.addEventListener("cut",cutSelection);

/********************************** SUBMIT BUTTON ************************/

let submit = document.querySelector("btnSubmit");
let users = [];
let msg = new userMessage();

let userP = document.querySelector("#userP");
let messageP = document.querySelector("#messageP");

btnSubmit.addEventListener("click",() =>{
    if (usernameValidated === true) {
        if(!users.some(msg => msg.username === username.value)){
            msg = new userMessage();
            if(message.value != ""){
                msg.message.push(message.value);
            }
            msg.username = username.value;
            users.push(msg);
        } else if(users.some(msg => msg.username === username.value)){
            index = users.findIndex(msg => msg.username === username.value);
            if(message.value != ""){
                users[index].message.push(message.value);
            }
        }

        let postedMessage = users.find(postedMessage => postedMessage.username === username.value);
        userP.innerHTML = `USERNAME: ${postedMessage.username}`;
        messageP.innerHTML = "";
        postedMessage.message.forEach((element) => messageP.innerHTML += `MESSAGE: ${element}<br>`);
        username.value = "";
        message.value = "";
        cont = 100;
        contatore.innerHTML = cont;
    } else {
        userP.innerHTML = "The username doesn't meet the required length. Try again";
        messageP.innerHTML = "";
    }
})
