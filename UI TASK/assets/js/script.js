document.addEventListener("DOMContentLoaded", () => {
    const slides = document.querySelector(".slides");
    let index = 0;

    function moveSlide(step) {
        index += step;
        if (index < 0) index = 0;
        if (index > slides.children.length - 1) index = slides.children.length - 1;
        slides.style.transform = `translateX(-${index * 270}px)`;
    }

    document.querySelector(".prev").addEventListener("click", () => moveSlide(-1));
    document.querySelector(".next").addEventListener("click", () => moveSlide(1));
});
