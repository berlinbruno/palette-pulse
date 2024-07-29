// Box & hue slider
var boxPicker = new iro.ColorPicker("#boxPicker", {
  width: 250,
  color: "rgb(255, 0, 0)",
  borderWidth: 1,
  borderColor: "#fff",
  display: 'flex',
  layoutDirection: 'horizontal',
  layout: [
    {
      component: iro.ui.Box,
    },
    {
      component: iro.ui.Slider,
      options: {
        id: 'hue-slider',
        sliderType: 'hue'
      }
    }
  ]
});

var displayColor = document.getElementById("displayColor");

boxPicker.on('color:change', function(color) {
console.log(color)
    displayColor.style.backgroundColor = color; // Update the background color of the element
    displayColor.textContent = color; // Optionally, display the color value as text
});
