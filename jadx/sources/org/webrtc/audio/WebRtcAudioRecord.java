package org.webrtc.audio;

import android.content.Context;
import android.media.AudioManager;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.webrtc.Logging;
import org.webrtc.audio.JavaAudioDeviceModule;

class WebRtcAudioRecord {
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final AtomicInteger f98936j = new AtomicInteger(0);

    /* renamed from: a */
    private final Context f98937a;

    /* renamed from: b */
    private final AudioManager f98938b;

    /* renamed from: c */
    private final int f98939c;

    /* renamed from: d */
    private final int f98940d;

    /* renamed from: e */
    private final C42071b f98941e = new C42071b();

    /* renamed from: f */
    private final ScheduledExecutorService f98942f;

    /* renamed from: g */
    private final AtomicReference f98943g = new AtomicReference();

    /* renamed from: h */
    private final boolean f98944h;

    /* renamed from: i */
    private final boolean f98945i;

    /* renamed from: org.webrtc.audio.WebRtcAudioRecord$a */
    class C42069a implements ThreadFactory {

        /* renamed from: d */
        final /* synthetic */ AtomicInteger f98946d;

        C42069a(AtomicInteger atomicInteger) {
            this.f98946d = atomicInteger;
        }

        public Thread newThread(Runnable runnable) {
            Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
            newThread.setName(String.format("WebRtcAudioRecordScheduler-%s-%s", new Object[]{Integer.valueOf(WebRtcAudioRecord.f98936j.getAndIncrement()), Integer.valueOf(this.f98946d.getAndIncrement())}));
            return newThread;
        }
    }

    public WebRtcAudioRecord(Context context, ScheduledExecutorService scheduledExecutorService, AudioManager audioManager, int i, int i2, JavaAudioDeviceModule.C42063b bVar, JavaAudioDeviceModule.C42064c cVar, JavaAudioDeviceModule.C42068g gVar, boolean z, boolean z2) {
        if (z && !C42071b.m122219b()) {
            throw new IllegalArgumentException("HW AEC not supported");
        } else if (!z2 || C42071b.m122221d()) {
            this.f98937a = context;
            this.f98942f = scheduledExecutorService;
            this.f98938b = audioManager;
            this.f98939c = i;
            this.f98940d = i2;
            this.f98944h = z;
            this.f98945i = z2;
            Logging.m122183b("WebRtcAudioRecordExternal", "ctor" + C42073d.m122224a());
        } else {
            throw new IllegalArgumentException("HW NS not supported");
        }
    }

    /* renamed from: b */
    static ScheduledExecutorService m122217b() {
        return Executors.newScheduledThreadPool(0, new C42069a(new AtomicInteger(0)));
    }
}
