$(document).ready(function () {
    $('.aBtn, .table .eBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');
        var text = $(this).text();

        if (text == 'Edit') {
            $.get(href, function (customer, status) {
                $('.updateForm #id').val(customer.id);
                $('.updateForm #firstName').val(customer.firstName);
                $('.updateForm #lastName').val(customer.lastName);
                $('.updateForm #phoneNumber').val(customer.phoneNumber);
                $('.updateForm #email').val(customer.email);
            });


            $('.updateForm #exampleModal').modal();
        } else {
            $('.updateForm #id').val('');
            $('.updateForm #firstName').val('');
            $('.updateForm #lastName').val('');
            $('.updateForm #phoneNumber').val('');
            $('.updateForm #email').val('');
            $('.updateForm #exampleModal').modal();
        }

    })

    $('.table .dBtn').on('click', function (event) {
        event.preventDefault();
        var href = $(this).attr('href');

        $(' #delRef').attr('href', href);
        $('#deleteModal').modal();

    })
})