package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import org.webrtc.Logging;
import org.webrtc.audio.JavaAudioDeviceModule;
import xh1.C43303e0;

class WebRtcAudioTrack {

    /* renamed from: a */
    private final Context f98947a;

    /* renamed from: b */
    private final AudioManager f98948b;

    /* renamed from: c */
    private final C43303e0.C43310g f98949c;

    /* renamed from: d */
    private final AudioAttributes f98950d;

    /* renamed from: e */
    private final C42070a f98951e;

    /* renamed from: f */
    private boolean f98952f;

    WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.C42065d dVar, JavaAudioDeviceModule.C42066e eVar, boolean z) {
        C43303e0.C43310g gVar = new C43303e0.C43310g();
        this.f98949c = gVar;
        gVar.mo102001a();
        this.f98947a = context;
        this.f98948b = audioManager;
        this.f98950d = audioAttributes;
        this.f98951e = new C42070a(audioManager);
        this.f98952f = z;
        Logging.m122183b("WebRtcAudioTrackExternal", "ctor" + C42073d.m122224a());
    }
}
