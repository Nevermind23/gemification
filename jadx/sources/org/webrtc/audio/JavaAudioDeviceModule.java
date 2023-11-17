package org.webrtc.audio;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.os.Build;
import java.util.concurrent.ScheduledExecutorService;
import org.webrtc.Logging;
import yh1.C43403a;

public class JavaAudioDeviceModule implements C43403a {

    /* renamed from: a */
    private final Context f98913a;

    /* renamed from: b */
    private final AudioManager f98914b;

    /* renamed from: c */
    private final WebRtcAudioRecord f98915c;

    /* renamed from: d */
    private final WebRtcAudioTrack f98916d;

    /* renamed from: e */
    private final int f98917e;

    /* renamed from: f */
    private final int f98918f;

    /* renamed from: g */
    private final boolean f98919g;

    /* renamed from: h */
    private final boolean f98920h;

    /* renamed from: i */
    private final Object f98921i;

    /* renamed from: j */
    private long f98922j;

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$b */
    public interface C42063b {
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$c */
    public interface C42064c {
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$d */
    public interface C42065d {
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$e */
    public interface C42066e {
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$f */
    public static class C42067f {

        /* renamed from: a */
        private final Context f98923a;

        /* renamed from: b */
        private ScheduledExecutorService f98924b;

        /* renamed from: c */
        private final AudioManager f98925c;

        /* renamed from: d */
        private int f98926d;

        /* renamed from: e */
        private int f98927e;

        /* renamed from: f */
        private int f98928f;

        /* renamed from: g */
        private int f98929g;

        /* renamed from: h */
        private boolean f98930h;

        /* renamed from: i */
        private boolean f98931i;

        /* renamed from: j */
        private boolean f98932j;

        /* renamed from: k */
        private boolean f98933k;

        /* renamed from: l */
        private AudioAttributes f98934l;

        /* renamed from: m */
        private boolean f98935m;

        /* renamed from: a */
        public JavaAudioDeviceModule mo97587a() {
            Logging.m122183b("JavaAudioDeviceModule", "createAudioDeviceModule");
            if (this.f98931i) {
                Logging.m122183b("JavaAudioDeviceModule", "HW NS will be used.");
            } else {
                if (JavaAudioDeviceModule.m122213d()) {
                    Logging.m122183b("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC NS!");
                }
                Logging.m122183b("JavaAudioDeviceModule", "HW NS will not be used.");
            }
            if (this.f98930h) {
                Logging.m122183b("JavaAudioDeviceModule", "HW AEC will be used.");
            } else {
                if (JavaAudioDeviceModule.m122212c()) {
                    Logging.m122183b("JavaAudioDeviceModule", "Overriding default behavior; now using WebRTC AEC!");
                }
                Logging.m122183b("JavaAudioDeviceModule", "HW AEC will not be used.");
            }
            if (this.f98935m && Build.VERSION.SDK_INT >= 26) {
                Logging.m122183b("JavaAudioDeviceModule", "Low latency mode will be used.");
            }
            ScheduledExecutorService scheduledExecutorService = this.f98924b;
            if (scheduledExecutorService == null) {
                scheduledExecutorService = WebRtcAudioRecord.m122217b();
            }
            WebRtcAudioRecord webRtcAudioRecord = new WebRtcAudioRecord(this.f98923a, scheduledExecutorService, this.f98925c, this.f98928f, this.f98929g, (C42063b) null, (C42064c) null, (C42068g) null, this.f98930h, this.f98931i);
            return new JavaAudioDeviceModule(this.f98923a, this.f98925c, webRtcAudioRecord, new WebRtcAudioTrack(this.f98923a, this.f98925c, this.f98934l, (C42065d) null, (C42066e) null, this.f98935m), this.f98926d, this.f98927e, this.f98932j, this.f98933k);
        }

        private C42067f(Context context) {
            this.f98928f = 7;
            this.f98929g = 2;
            this.f98930h = JavaAudioDeviceModule.m122212c();
            this.f98931i = JavaAudioDeviceModule.m122213d();
            this.f98923a = context;
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            this.f98925c = audioManager;
            this.f98926d = C42072c.m122222a(audioManager);
            this.f98927e = C42072c.m122222a(audioManager);
            this.f98935m = false;
        }
    }

    /* renamed from: org.webrtc.audio.JavaAudioDeviceModule$g */
    public interface C42068g {
    }

    /* renamed from: b */
    public static C42067f m122211b(Context context) {
        return new C42067f(context);
    }

    /* renamed from: c */
    public static boolean m122212c() {
        return C42071b.m122219b();
    }

    /* renamed from: d */
    public static boolean m122213d() {
        return C42071b.m122221d();
    }

    private static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);

    /* renamed from: a */
    public long mo97586a() {
        long j;
        synchronized (this.f98921i) {
            if (this.f98922j == 0) {
                this.f98922j = nativeCreateAudioDeviceModule(this.f98913a, this.f98914b, this.f98915c, this.f98916d, this.f98917e, this.f98918f, this.f98919g, this.f98920h);
            }
            j = this.f98922j;
        }
        return j;
    }

    private JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2) {
        this.f98921i = new Object();
        this.f98913a = context;
        this.f98914b = audioManager;
        this.f98915c = webRtcAudioRecord;
        this.f98916d = webRtcAudioTrack;
        this.f98917e = i;
        this.f98918f = i2;
        this.f98919g = z;
        this.f98920h = z2;
    }
}
