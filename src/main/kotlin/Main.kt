import kotlinx.coroutines.*


fun main() {
    runBlocking {
        launch {
            playBeats("x-x-x-x-x-x-x-x", "C:\\My Work\\kotlin\\DrumMachine\\audio\\toms.aiff")
        }
        playBeats("x-x-x-x-x-x", "C:\\My Work\\kotlin\\DrumMachine\\audio\\snare.aiff")
        playBeats("x-----x-----x", "C:\\My Work\\kotlin\\DrumMachine\\audio\\crash_cymbal.aiff")

        playBeats("x--x---x---x--x", "C:\\My Work\\kotlin\\DrumMachine\\audio\\kick_drum.aiff")
        playBeats("x-----x-----x", "C:\\My Work\\kotlin\\DrumMachine\\audio\\high_hat.aiff")

    }

}

