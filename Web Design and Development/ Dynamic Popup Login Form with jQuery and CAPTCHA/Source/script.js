$(document).ready(function () {
    const showLoginFormAfter = 5000; // 5 seconds
    setTimeout(function () {
        $('#loginPopup').fadeIn();
    }, showLoginFormAfter);

    // Update the CAPTCHA text
    function generateCaptcha() {
        const captchaText = Math.random().toString(36).substring(2, 8).toUpperCase();
        $('#captchaText').text(captchaText);
    }
    generateCaptcha();

    $('#loginForm').submit(function (e) {
        e.preventDefault();
        generateCaptcha();
    });
});
