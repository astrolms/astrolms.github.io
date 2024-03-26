let cart = document.querySelector("#cart");

let display = document.querySelector("#display");

let URL = "http://localhost:3001/viaggi";

class Viaggio {
    constructor(tratte, costo, mezzo, durata, data, postiDisponibili,locandina,disponibilita,tipologia) {
        this.tratte = tratte;
        this.costo = costo;
        this.mezzo = mezzo;
        this.durata = durata;
        this.data = data;
        this.postiDisponibili = postiDisponibili;
        this.tipologia = tipologia;
        this.locandina = locandina;
        this.disponibilita = disponibilita;
    }
}

function displayViaggi() {
    fetch(URL)
    .then(data => data.json())
    .then(data => {
        var arrayViaggi;
        if(localStorage.length === 0){  arrayViaggi = [];}
        else {
            arrayViaggi = JSON.parse(localStorage.getItem("viaggio"));
        }
   
        data.forEach(viaggio => {
            
            var card = document.createElement("div");

            let disponibile = "";

            if(viaggio.disponibilita === true){
                disponibile = "Disponibile";
            }

            else{ disponibile = "Nondisponibile"}
            let card2 = document.createElement("div");
            card2.setAttribute("class", "card h-100 col mt-3");
            card2.innerHTML +=`
            <div class="card-body">
            <h5 class="card-title">${viaggio.tratte}</h5>
            <h6 class="card-subtitle mb-2 text-muted">${viaggio.mezzo} - ${viaggio.durata}</h6>
            <h6 class="card-subtitle mb-2 text-muted">${viaggio.costo}$</h6>
            <h6 class="card-subtitle mb-2 text-muted">${viaggio.data}</h6>
            <h6 class="card-subtitle mb-2 text-muted">Posti disponibili - ${viaggio.postiDisponibili}</h6>
            <h6 class="card-subtitle mb-2 text-muted">${disponibile}</h6>
            <img src=${viaggio.locandina} class="w-100"/>
            </div>`;

            let addToCard = document.createElement("button");
            addToCard.innerHTML = `<svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-cart-check" viewBox="0 0 16 16">
            <path d="M11.354 6.354a.5.5 0 0 0-.708-.708L8 8.293 6.854 7.146a.5.5 0 1 0-.708.708l1.5 1.5a.5.5 0 0 0 .708 0z"/>
            <path d="M.5 1a.5.5 0 0 0 0 1h1.11l.401 1.607 1.498 7.985A.5.5 0 0 0 4 12h1a2 2 0 1 0 0 4 2 2 0 0 0 0-4h7a2 2 0 1 0 0 4 2 2 0 0 0 0-4h1a.5.5 0 0 0 .491-.408l1.5-8A.5.5 0 0 0 14.5 3H2.89l-.405-1.621A.5.5 0 0 0 2 1zm3.915 10L3.102 4h10.796l-1.313 7zM6 14a1 1 0 1 1-2 0 1 1 0 0 1 2 0m7 0a1 1 0 1 1-2 0 1 1 0 0 1 2 0"/>
            </svg>`;


            addToCard.addEventListener("click", () =>{
                arrayViaggi.push(viaggio);

                localStorage.setItem("viaggio",JSON.stringify(arrayViaggi));

            })

            addToCard.setAttribute("class","btn btn-primary mt-3 col-2 m-auto mb-3");
            card2.append(addToCard);
            card.append(card2);

            display.appendChild(card);
            
        })
    })

}

window.addEventListener("load",displayViaggi);

cart.addEventListener("click",()=>{

    let urlDest = "carello.html";

    window.open(urlDest,"_blank");


})