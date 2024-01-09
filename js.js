var audio = document.getElementById('audio');

function playAudio() {
	if (audio.paused) {audio
		audio.play();
		pButton.className = "";
		pButton.className = "pause";
	} else {
		audio.pause();
		pButton.className = "";
		pButton.className = "play";
	}
}
var duration;
var audio = document.getElementById('playhead');
audio.addEventListener("timeupdate", timeUpdate, false);

function timeUpdate() {
	var playPercent = 100 * (audio.currentTime / duration);
	playhead.style.marginLeft = playPercent + "%";
}

// Gets audio file duration
audio.addEventListener("canplaythrough", function () {
	duration = audio.duration;
}, false);
//Makes timeline clickable
timeline.addEventListener("click", function (event) {
	moveplayhead(event);
	audio.currentTime = duration * clickPercent(event);
}, false);

// returns click as decimal (.77) of the total timelineWidth
function clickPercent(event) {
    return (event.clientX - getPosition(timeline)) / timelineWidth;
}

function moveplayhead(event) {
    var newMargLeft = event.clientX - getPosition(timeline);

	if (newMargLeft = 0 amp;amp; newMargLeft = timelineWidth) {
		playhead.style.marginLeft = newMargLeft + "px";
	}
	if (newMargLeft  0) {
		playhead.style.marginLeft = "0px";
	}
	if (newMargLeft  timelineWidth) {
		playhead.style.marginLeft = timelineWidth + "px";
	}
}

// getPosition
// Returns elements left position relative to top-left of viewport
function getPosition(el) {
    return el.getBoundingClientRect().left;
}