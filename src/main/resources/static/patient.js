$(document).ready(function() {

    $.ajax({
        url: "http://localhost:8080/patients/patient"
    }).then(function(data){
        $('.firstName').append(data.fname);
        $('.lastName').append(data.lname);
        $('.age').append(data.age);
    });

});