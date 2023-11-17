package org.webrtc.audio;

import android.media.AudioManager;
import org.webrtc.Logging;

/* renamed from: org.webrtc.audio.c */
abstract class C42072c {
    /* renamed from: a */
    static int m122222a(AudioManager audioManager) {
        if (C42073d.m122225b()) {
            Logging.m122183b("WebRtcAudioManagerExternal", "Running emulator, overriding sample rate to 8 kHz.");
            return 8000;
        }
        int b = m122223b(audioManager);
        Logging.m122183b("WebRtcAudioManagerExternal", "Sample rate is set to " + b + " Hz");
        return b;
    }

    /* renamed from: b */
    private static int m122223b(AudioManager audioManager) {
        String property = audioManager.getProperty("android.media.property.OUTPUT_SAMPLE_RATE");
        if (property == null) {
            return 16000;
        }
        return Integer.parseInt(property);
    }
}
