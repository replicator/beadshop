$(document).ready(function() {
    app.validate("#contactDetails");
});

var app = {
    loadPageContent : function(contentName, id) {
        $.get('/' + contentName + '/' + id + '.do', function(data) {
            $('#pageContent').html(data);
        })
    },
    validate : function(formId) {
        $(formId).validate({
           name : "required"
       });
    },
    post : function(controller, data) {
        $.post(controller, data);
    }
};