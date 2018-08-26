

/*
*	Nombre:		acceptNumLet
*	Descripcion:	Funcion para validar que solo se ingresen solo  numeros y letras en un campo de texto
*	Parametros:	Evento del teclado
*/


var nav4 = window.Event ? true : false;
function acceptNumLet(evt)
{
        var key = nav4 ? evt.which : evt.keyCode;
        return ((key >= 48 && key <= 57) || (key >= 97 && key <= 122));
}


/*
*	Nombre:		acceptLet
*	Descripcion:	Funcion para validar que solo se ingresen solo letras mayusculas en un campo de texto
*	Paramtros:	Evento del teclado
*/

var nav5 = window.Event ? true : false;
function acceptLet(evt)
{
        var key = nav5 ? evt.which : evt.keyCode;
        return ((key >= 65 && key <= 90)  || ( key == 32 ) );
}


/*
*	Nombre:		acceptNum
*	Descripcion:	Funcion para validar que solo se ingresen solo numeros en un campo de texto
*	Paramtros:	Evento del teclado
*/


var nav6 = window.Event ? true : false;
function acceptNum(evt)
{
        var key = nav6 ? evt.which : evt.keyCode;
        return ((key >= 48 && key <= 57));
}




