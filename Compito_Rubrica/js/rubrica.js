const URLEndpoint = "http://localhost:3000/rubrica";
let add = document.querySelector("#add");
let show = document.querySelector("#show");
let cardBody = document.querySelector("#cardBody");
let btnShow = document.querySelector("#btnShow");
let btnEl = document.querySelector("#btnEl");

var page = 1;

add.addEventListener("click",function(){
    
    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let email = document.querySelector("#email").value;
    let tel = document.querySelector("#tel").value;
    
    
    if(nome != "" && cognome != ""  && email != ""  && tel != ""){ 
        var nuovoRubrica = new Rubrica(nome, cognome, email, tel);
    
    

    fetch(URLEndpoint, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(nuovoRubrica)
    })
    }else{
        console.log("non hai inserito niente");
    }

})

class Rubrica {
    constructor(nome, cognome, email, tel) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.tel = tel;
    }
}

function displayPosts() {
    fetch(URLEndpoint + `?_page=${page}&_per_page=10`)
    .then(data => data.json())
    .then(data => {
        const dataArray = data.data;
        const limit = data.pages;
        console.log(limit);
        dataArray.forEach(rubricaEl => {
            
            var card = document.createElement("div");
            var btnRemove = document.createElement("button");
            btnRemove.innerHTML = `<svg xmlns='http://www.w3.org/2000/svg' width='16' height='16' fill='currentColor' class='bi bi-trash' viewBox='0 0 16 16'>
        <path d='M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5m3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0z'/>
        <path d='M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1zM4.118 4 4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4zM2.5 3h11V2h-11z'/>
        </svg> Elimina`;

            btnRemove.setAttribute("class","btn btn-outline-danger mt-3");
            
            card.innerHTML +=`<div class="card col mt-3">
            <div class="card-body">
            <h5 class="card-title">${rubricaEl.nome} ${rubricaEl.cognome}</h5>
            <h6 class="card-subtitle mb-2 text-muted">${rubricaEl.email}</h6>
            <h6 class="card-subtitle mb-2 text-muted">${rubricaEl.tel}</h6>
            </div>
            </div>`;
            
            card.append(btnRemove);

            btnRemove.addEventListener("click",function(){
                fetch(URLEndpoint + `/${rubricaEl.id}`, {
                    method: 'DELETE'
                })
            });
            
            cardBody.appendChild(card);
        })
        
        btnShow.appendChild(show);
        if (page < limit) {
            show.disabled = false;
            page++;
        } else {
            show.disabled = true;
        }
    })

}

show.addEventListener("click",displayPosts);