package p527nc;

import android.content.Context;
import android.media.AudioManager;
import android.util.Log;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;
import org.webrtc.C42061a;
import org.webrtc.C42074b;
import org.webrtc.C42075c;
import org.webrtc.C42076d;
import org.webrtc.IceCandidate;
import org.webrtc.MediaConstraints;
import org.webrtc.PeerConnection$RTCConfiguration;
import org.webrtc.PeerConnectionFactory;
import org.webrtc.SessionDescription;
import org.webrtc.VideoSink;
import ue1.C43075l;
import xh1.C43297c;
import xh1.C43312f0;
import xh1.C43324r;
import xh1.C43325s;
import xh1.C43330w;

/* renamed from: nc.a */
public final class C16910a {

    /* renamed from: k */
    public static final C16911a f47239k = new C16911a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f47240a;

    /* renamed from: b */
    private C43312f0 f47241b;

    /* renamed from: c */
    private final List f47242c = C41341q.m119910m(m59485k("turn:18.157.162.68:3478", "identomat", "2fb0ef988e0b244b6ee99bcac7b4b6ace55a3e67bf7d88b2"), m59485k("stun:18.157.162.68:3478", "identomat", "2fb0ef988e0b244b6ee99bcac7b4b6ace55a3e67bf7d88b2"));

    /* renamed from: d */
    private final String f47243d = "stream-0";

    /* renamed from: e */
    private boolean f47244e;

    /* renamed from: f */
    private List f47245f = new ArrayList();

    /* renamed from: g */
    private List f47246g = new ArrayList();

    /* renamed from: h */
    private final MediaConstraints f47247h;

    /* renamed from: i */
    private C42076d f47248i;

    /* renamed from: j */
    private final C16912b f47249j;

    /* renamed from: nc.a$a */
    public static final class C16911a {
        private C16911a() {
        }

        public /* synthetic */ C16911a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: nc.a$b */
    public static final class C16912b {

        /* renamed from: a */
        final /* synthetic */ C16910a f47250a;

        C16912b(C16910a aVar) {
            this.f47250a = aVar;
        }
    }

    /* renamed from: nc.a$c */
    public static final class C16913c implements C43297c.C43298a {
        C16913c() {
        }
    }

    public C16910a(Context context) {
        C41536l.m120489i(context, "context");
        this.f47240a = context;
        MediaConstraints mediaConstraints = new MediaConstraints();
        mediaConstraints.f98829a.add(new MediaConstraints.C42055a("OfferToReceiveVideo", "true"));
        mediaConstraints.f98829a.add(new MediaConstraints.C42055a("OfferToReceiveAudio", "true"));
        mediaConstraints.f98830b.add(new MediaConstraints.C42055a("DtlsSrtpKeyAgreement", "true"));
        C41238w wVar = C41238w.f97225a;
        this.f47247h = mediaConstraints;
        this.f47249j = new C16912b(this);
    }

    /* renamed from: k */
    private final C43325s m59485k(String str, String str2, String str3) {
        return C43325s.m124344a(str).mo102016c(str2).mo102015b(str3).mo102014a();
    }

    /* renamed from: a */
    public final void mo44064a(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "json");
        try {
            String string = jSONObject.getString("candidate");
            IceCandidate iceCandidate = new IceCandidate(jSONObject.getString("sdpMid"), jSONObject.getInt("sdpMLineIndex"), string);
            if (!this.f47244e) {
                this.f47245f.add(iceCandidate);
            }
        } catch (Exception e) {
            Log.i("identomat_", C41536l.m120497q("failed to add candidate: ", e.getMessage()));
        }
    }

    /* renamed from: b */
    public final void mo44065b(VideoSink videoSink) {
        C41536l.m120489i(videoSink, "sink");
    }

    /* renamed from: c */
    public final void mo44066c() {
        try {
            C43312f0 f0Var = this.f47241b;
            if (f0Var != null) {
                f0Var.mo102003b();
            }
            C43312f0 f0Var2 = this.f47241b;
            if (f0Var2 != null) {
                f0Var2.dispose();
            }
            C41536l.m120506z("factory");
            throw null;
        } catch (Exception e) {
            Log.i("identomat_", C41536l.m120497q("disconnect: ", e.getMessage()));
        }
    }

    /* renamed from: d */
    public final List mo44067d() {
        return this.f47246g;
    }

    /* renamed from: e */
    public final boolean mo44068e() {
        Object systemService = this.f47240a.getSystemService("audio");
        if (systemService != null) {
            return ((AudioManager) systemService).isMicrophoneMute();
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }

    /* renamed from: f */
    public final C42076d mo44069f() {
        return this.f47248i;
    }

    /* renamed from: g */
    public final void mo44070g() {
        C42076d.C42078b bVar;
        C42076d.C42078b bVar2;
        C42076d b = C42075c.m122227b();
        this.f47248i = b;
        if (b == null) {
            bVar = null;
        } else {
            bVar = b.mo97538c();
        }
        C42074b bVar3 = new C42074b(bVar, true, true);
        C42076d dVar = this.f47248i;
        if (dVar == null) {
            bVar2 = null;
        } else {
            bVar2 = dVar.mo97538c();
        }
        C42061a aVar = new C42061a(bVar2);
        PeerConnectionFactory.Options options = new PeerConnectionFactory.Options();
        PeerConnectionFactory.m122194e(PeerConnectionFactory.C42058c.m122200a(this.f47240a).mo97569a());
        PeerConnectionFactory.m122192c().mo97566b(options).mo97568d(bVar3).mo97567c(aVar).mo97565a();
        C41536l.m120488h((Object) null, "builder()\n            .setOptions(options)\n            .setVideoEncoderFactory(defaultVideoEncoderFactory)\n            .setVideoDecoderFactory(defaultVideoDecoderFactory)\n            .createPeerConnectionFactory()");
        PeerConnection$RTCConfiguration peerConnection$RTCConfiguration = new PeerConnection$RTCConfiguration(this.f47242c);
        peerConnection$RTCConfiguration.f98843H = C43330w.UNIFIED_PLAN;
        peerConnection$RTCConfiguration.f98860l = C43324r.GATHER_ONCE;
        peerConnection$RTCConfiguration.f98838C = false;
        C41536l.m120506z("factory");
        throw null;
    }

    /* renamed from: h */
    public final void mo44071h(C43075l lVar) {
        C41536l.m120489i(lVar, "callback");
    }

    /* renamed from: i */
    public final void mo44072i(String str, C43075l lVar) {
        C41536l.m120489i(str, "sdpString");
        C41536l.m120489i(lVar, "callback");
        new SessionDescription(SessionDescription.C42060a.ANSWER, str);
    }

    /* renamed from: j */
    public final void mo44073j() {
        C43312f0 f0Var = this.f47241b;
        if (f0Var != null) {
            ((C43297c) f0Var).mo101994a(new C16913c());
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type org.webrtc.CameraVideoCapturer");
    }

    /* renamed from: l */
    public final boolean mo44074l() {
        Object systemService = this.f47240a.getSystemService("audio");
        if (systemService != null) {
            AudioManager audioManager = (AudioManager) systemService;
            boolean isMicrophoneMute = audioManager.isMicrophoneMute();
            audioManager.setMicrophoneMute(!isMicrophoneMute);
            return !isMicrophoneMute;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
    }
}
