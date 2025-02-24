$(document).ready(function(){
    
    //VALIDAR CAMPO BUSCA NO INDEX.HTML
    $('#campoBuscaProcesso').submit(function(event){
        event.preventDefault();
        let busca = $('#buscaProcesso').val();
        
        if(busca === ''){
            alert("Preencha o Campo para Busca");
        }
    });
    
});//FIM DO DOCUMENT READY FUNCTION