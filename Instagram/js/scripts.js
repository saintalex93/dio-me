
(() => {
    let images = document.querySelectorAll(".carrousel-image");
    let imageIndex = 1;
    setInterval(() => {
        hiddenAll(images)
        if (imageIndex > 3) {
            imageIndex = 0
        }
        images[imageIndex].classList.toggle('hidden');
        imageIndex++

    }, 2000);
})()

function hiddenAll(images) {
    images.forEach(image => {
        image.classList.add('hidden')
    });
}