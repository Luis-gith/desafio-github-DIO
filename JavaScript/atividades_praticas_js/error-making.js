function verify (array, number) {
    try {
        if(!array && !number) 
              throw new ReferenceError("Envie os parâmetros necessários");

        if(typeof array !== 'object') 
              throw new TypeError("Array deve ser type object");
    
        if(typeof number !== 'number') 
              throw new TypeError("Valor deve ser type number");
    
        if(array.length !== number) 
              throw new RangeError("Tamanho inválido");
        
        return array;
    }   catch(e) {
          if(e instanceof RangeError) {
              console.log("Este erro é do tipo RangeError");
              console.log(e.message);  
          } else if (e instanceof ReferenceError) {
              console.log("Este erro é do tipo ReferenceError");
              console.log(e.message);
          } else if(e instanceof TypeError){
            console.log("Esse erro é do tipo TypeError");
            console.log(e.message);
          } else {
              console.log("Erro não esperado:")
              console.log(e.message);
          }
        }
}  

console.log(verify([1, 2, 3, 4, 5], 5)); //insert values for verification

