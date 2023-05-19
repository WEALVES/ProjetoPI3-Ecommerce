const butPerfil = document.getElementById("perfil")
const butHist = document.getElementById("historico")
const divPerfil = document.getElementById("pb")
const divHistorico = document.getElementById("hb")


function mostrarPerfil(){
    divPerfil.style.display = "flex";
    divHistorico.style.display = "none";
    butPerfil.style.color = "rgb(41, 41, 41)";
    butHist.style.color = "rgb(59, 59, 59)";
    }
function mostrarHist(){
    divPerfil.style.display = "none";
    divHistorico.style.display = "flex";
    butHist.style.color = "rgb(41, 41, 41)";
    butPerfil.style.color = "rgb(59, 59, 59)";
    }
    
