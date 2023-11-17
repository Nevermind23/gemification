package org.webrtc;

import android.content.Context;
import org.webrtc.C42103o;
import org.webrtc.Logging;
import org.webrtc.audio.JavaAudioDeviceModule;
import xh1.C43293a;
import xh1.C43295b;
import xh1.C43300d;
import xh1.C43319m;
import yh1.C43403a;

public abstract class PeerConnectionFactory {

    /* renamed from: a */
    private static volatile boolean f98875a;

    public static class Options {
    }

    /* renamed from: org.webrtc.PeerConnectionFactory$b */
    public static class C42057b {

        /* renamed from: a */
        private Options f98876a;

        /* renamed from: b */
        private C43403a f98877b;

        /* renamed from: c */
        private C43295b f98878c;

        /* renamed from: d */
        private C43293a f98879d;

        /* renamed from: e */
        private VideoEncoderFactory f98880e;

        /* renamed from: f */
        private VideoDecoderFactory f98881f;

        /* renamed from: a */
        public PeerConnectionFactory mo97565a() {
            PeerConnectionFactory.m122193d();
            if (this.f98877b == null) {
                this.f98877b = JavaAudioDeviceModule.m122211b(C43300d.m124330a()).mo97587a();
            }
            PeerConnectionFactory unused = PeerConnectionFactory.nativeCreatePeerConnectionFactory(C43300d.m124330a(), this.f98876a, this.f98877b.mo97586a(), this.f98878c.mo97535a(), this.f98879d.mo97534a(), this.f98880e, this.f98881f, 0, 0, 0, 0, 0);
            return null;
        }

        /* renamed from: b */
        public C42057b mo97566b(Options options) {
            this.f98876a = options;
            return this;
        }

        /* renamed from: c */
        public C42057b mo97567c(VideoDecoderFactory videoDecoderFactory) {
            this.f98881f = videoDecoderFactory;
            return this;
        }

        /* renamed from: d */
        public C42057b mo97568d(VideoEncoderFactory videoEncoderFactory) {
            this.f98880e = videoEncoderFactory;
            return this;
        }

        private C42057b() {
            this.f98878c = new BuiltinAudioEncoderFactoryFactory();
            this.f98879d = new BuiltinAudioDecoderFactoryFactory();
        }
    }

    /* renamed from: org.webrtc.PeerConnectionFactory$c */
    public static class C42058c {

        /* renamed from: a */
        final Context f98882a;

        /* renamed from: b */
        final String f98883b;

        /* renamed from: c */
        final boolean f98884c;

        /* renamed from: d */
        final C43319m f98885d;

        /* renamed from: e */
        final String f98886e;

        /* renamed from: f */
        Logging.C42054b f98887f;

        /* renamed from: org.webrtc.PeerConnectionFactory$c$a */
        public static class C42059a {

            /* renamed from: a */
            private final Context f98888a;

            /* renamed from: b */
            private String f98889b = "";

            /* renamed from: c */
            private boolean f98890c;

            /* renamed from: d */
            private C43319m f98891d = new C42103o.C42104a();

            /* renamed from: e */
            private String f98892e = "jingle_peerconnection_so";

            /* renamed from: f */
            private Logging.C42054b f98893f;

            C42059a(Context context) {
                this.f98888a = context;
            }

            /* renamed from: a */
            public C42058c mo97569a() {
                return new C42058c(this.f98888a, this.f98889b, this.f98890c, this.f98891d, this.f98892e, (C42101m) null, this.f98893f);
            }
        }

        /* renamed from: a */
        public static C42059a m122200a(Context context) {
            return new C42059a(context);
        }

        private C42058c(Context context, String str, boolean z, C43319m mVar, String str2, C42101m mVar2, Logging.C42054b bVar) {
            this.f98882a = context;
            this.f98883b = str;
            this.f98884c = z;
            this.f98885d = mVar;
            this.f98886e = str2;
            this.f98887f = bVar;
        }
    }

    /* renamed from: c */
    public static C42057b m122192c() {
        return new C42057b();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static void m122193d() {
        if (!C42103o.m122305c() || C43300d.m124330a() == null) {
            throw new IllegalStateException("PeerConnectionFactory.initialize was not called before creating a PeerConnectionFactory.");
        }
    }

    /* renamed from: e */
    public static void m122194e(C42058c cVar) {
        C43300d.m124331b(cVar.f98882a);
        C42103o.m122304b(cVar.f98885d, cVar.f98886e);
        nativeInitializeAndroidGlobals();
        nativeInitializeFieldTrials(cVar.f98883b);
        if (cVar.f98884c && !f98875a) {
            m122195f();
        }
        Logging.m122183b("PeerConnectionFactory", "PeerConnectionFactory was initialized without an injected Loggable. Any existing Loggable will be deleted.");
        Logging.m122184c();
        nativeDeleteLoggable();
    }

    /* renamed from: f */
    private static void m122195f() {
        f98875a = true;
        nativeInitializeInternalTracer();
    }

    /* access modifiers changed from: private */
    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6, long j7, long j8);

    private static native void nativeDeleteLoggable();

    private static native void nativeInitializeAndroidGlobals();

    private static native void nativeInitializeFieldTrials(String str);

    private static native void nativeInitializeInternalTracer();
}
