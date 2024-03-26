
function jsonArray(){
    var viaggi = document.querySelector("#viaggi");
    var viaggio = JSON.parse(localStorage.getItem("viaggio"));
    var i = 0;
    var viaggiArray = [];
    var btnEliminaList = [];
    viaggio.forEach(v => {
        viaggiArray.push(v);
    });

    console.log(viaggiArray);

    viaggiArray.forEach(v => {
        viaggi.innerHTML += `<div class="card2 row h-100 mt-3">
        <div class="card-body col-10">
        <h5 class="card-title">${v.tratte}</h5>
        <h6 class="card-subtitle mb-2 text-muted">${v.mezzo} - ${v.durata}</h6>
        <h6 class="card-subtitle mb-2 text-muted">${v.data}</h6>
        </div>
        <div class="col-2 card-body"><h6 class="mb-2 text-muted">${v.costo}$</h6>
        <button type="submit" class="btn btn-danger" id="btnElimina${i}">X</button>
        </div>
        </div>`;
        var btnElimina = "#btnElimina" + i;
        btnEliminaList.push(btnElimina);
        i++;
    });


    btnEliminaList.forEach(btnElimina =>{
        let button = document.querySelector(btnElimina);
        button.addEventListener("click",()=>{
            let index = Array.from(btnEliminaList).indexOf(btnElimina);
            console.log(viaggiArray);
            let found = viaggiArray[index];

            console.log(index + "                " + found);

            viaggiArray.splice(index, 1);
            localStorage.setItem("viaggio",JSON.stringify(viaggiArray));
            viaggi.innerHTML = "";
            jsonArray();
        });

    })
}

jsonArray();

class bigliettoAcquistato {
    constructor(nome, cognome,tratte, email,pagamento) {
        this.nome = nome;
        this.cognome = cognome;
        this.tratte = tratte;
        this.email = email;
        this.pagamento = pagamento;
    }
}

let checkout = document.querySelector("#checkout");
let URL = "http://localhost:3001/bigliettiAcquistati";

checkout.addEventListener("click",() =>{
   
    let tratte = [];
    let viaggio = JSON.parse(localStorage.getItem("viaggio"));
    viaggio.forEach(v =>{
        tratte.push(v.id);
    });

    let nome = document.querySelector("#nome").value;
    let cognome = document.querySelector("#cognome").value;
    let email  = document.querySelector("#email").value;
    let paymentMethod = document.querySelector("#paymentMethod");
    var paymentOption = paymentMethod.options[paymentMethod.selectedIndex];

    // Get the text of the selected option
    let pagamento = paymentOption.text;

    let ba = new bigliettoAcquistato(nome,cognome,tratte,email,pagamento);


    
    fetch(URL, {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify(ba)
    });

    localStorage.removeItem("viaggio");
})

