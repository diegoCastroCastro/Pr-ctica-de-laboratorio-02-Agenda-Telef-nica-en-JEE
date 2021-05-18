function validar(){
	cedula = document.getElementById(cedula).value;
	nombres = document.getElementById(cedula).value;
	apellidos = document.getElementById(cedula).value;
	correo = document.getElementById(cedula).value;
	contrasenia = document.getElementById(cedula).value;
	
	console.log(cedula);
	console.log(nombres);
	console.log(apellidos);
	console.log(correo);
	console.log(contrasenia);
	
	if (cedula.lenght==0) {
		alert("vacio");
	}
	
}




function validarCamposObligatorios() {
    var bandera = true
    for (var i = 0; i < document.forms[0].elements.length; i++) {
        var elemento = document.forms[0].elements[i]
        if (elemento.value == '' && elemento.type == 'text') {
            if (elemento.id == 'cedula') {
                document.getElementById('mensajeCedula').innerHTML = '<br> La cedula no esta ingresada'
            }
            elemento.style.border = '1px red solid'
            bandera = false
        }
    }
    if (!bandera) {
        alert('Ingrese todo los datos')
    }
    return bandera
}

function validarCedula() {
    var cad = document.getElementById("cedula").value;
    var total = 0;
    var longitud = cad.length;
    if (cad !== "" && longitud === 10) {
        for (i = 0; i < longitud - 1; i++) {
            if (i % 2 === 0) {
                var aux = cad.charAt(i) * 2;
                if (aux > 9) aux -= 9;
                total += aux;
            } else {
                total += parseInt(cad.charAt(i));
            }
        }
        total = total % 10 ? 10 - total % 10 : 0;
        var aux = cad.charAt(9);
        if (cad.charAt(9) == total) {
            document.getElementById("mensajeCedula").innerText = 'La cedula es correcta';
            cedula.style.borderColor = "blue";
        } else {
            document.getElementById("mensajeCedula").innerHTML = 'La cedula es incorrecta';
            cedula.style.borderColor = "red";
        }

    } else {
        document.getElementById("mensajeCedula").innerHTML = 'Ingrese solo numeros';
    }
}


function soloNumeros(e, c) {
    var key = window.Event ? e.which : e.keyCode
    return ((key >= 48) && (key <= 57) && (c.length + 1 <= 10) || (key == 8))
}

function soloLetras(e) {
    key = e.keyCode || e.which;
    tecla = String.fromCharCode(key).toLowerCase();
    letras = " áéíóúabcdefghijklmnñopqrstuvwxyz";
    especiales = "8-37-39-46";

    tecla_especial = false
    for (var i in especiales) {
        if (key == especiales[i]) {
            tecla_especial = true;
            break;
        }
    }
    if (letras.indexOf(tecla) == -1 && !tecla_especial) {
        return false;
    }
}

