/**
 * @param {String} descrizione 
 * @param {Number} scadenza 
 */
function item (descrizione, scadenza) {
        this.descrizione = descrizione;
        this.scadenza = scadenza;
}

let card = document.querySelector("#card");
let btnAdd = document.querySelector("#btnAdd");
let btnSvuota = document.querySelector("#btnSvuota");
let elDescrizione = document.querySelector("#elDescrizione");
let elScadenza = document.querySelector("#elScadenza");

let i = 0;
let ul;
let arrayItems;

let p = document.createElement("p");
card.appendChild(p);
p.setAttribute("class","d-flex justify-content-between p-desc");
p.innerHTML = "<span class='pe-2'>Prodotto</span>" + 
            "<span class='ps-2'>Giorni alla scadenza</span>";

card.setAttribute("class","col mh-100 overflow-auto");

function createList(){
    arrayItems = [];
    ul = document.createElement("ul");
    card.appendChild(ul);
}

window.onload = createList();

btnSvuota.onclick = function(){
    ul.remove(); 
    createList();
}

function createTable(){
    arrayItems.forEach(element => {
        let li = document.createElement("li");
        li.innerHTML = "<span class='desc'>" + element.descrizione + "</span>" 
                       + "<span class='scad'>" + element.scadenza + "</span>";
        ul.appendChild(li);
        ul.setAttribute("class","l-ul");
        li.setAttribute("class","l-li d-flex justify-content-between");
        });
}

btnAdd.onclick = function(){
    const it = new item();
    it.descrizione = elDescrizione.value;
    it.descrizione = it.descrizione.toUpperCase();
    it.scadenza = elScadenza.value;
    arrayItems.push(it);
    arrayItems.sort((a, b) => a.scadenza - b.scadenza);
    ul.innerHTML = "";
    createTable();
    elDescrizione.value = "";
    elScadenza.value = "";
}






