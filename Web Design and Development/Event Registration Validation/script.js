$(document).ready(function () {
  $("#registrationForm").submit(function (event) {
    event.preventDefault();

    $(".error").remove();

    let isValid = true;
    $("#registrationForm input").each(function () {
      if (!$(this).val()) {
        isValid = false;
        $(this).after("<span class='error'>This field is required</span>");
      }
    });
    const zipCode = $("#zipCode").val();
    if (zipCode.length !== 5 || isNaN(zipCode)) {
      isValid = false;
      $("#zipCode").after("<span class='error'>Zip code should be exactly five digits</span>");
    }

    const email = $("#email").val();
    const emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailRegex.test(email)) {
      isValid = false;
      $("#email").after("<span class='error'>Invalid email address</span>");
    }
    if (isValid) {
      alert("Form submitted successfully!");
    }
  });
});
