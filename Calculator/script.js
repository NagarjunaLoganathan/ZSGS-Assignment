let outputScreen = document.getElementById("output-screen");
function display(num){
    outputScreen.value += num;
}
function calculate(){
    try{
        outputScreen.value = eval(outputScreen.value);
        if(outputScreen.value == "undefined"){
            outputScreen.value = "";
        }
    } catch(err){
        alert("Invalid input");
    }
}
function clean(){
    outputScreen.value = "";
}
function del(){
    outputScreen.value = outputScreen.value.slice(0, -1);
}