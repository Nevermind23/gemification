package p345ad;

import android.util.Log;
import he1.C41233s;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le1.C41694a;
import ng1.C41803c;
import org.json.JSONObject;
import org.webrtc.IceCandidate;
import org.webrtc.SessionDescription;
import sg1.C42574h;
import ue1.C43075l;
import xe1.C43263c;

/* renamed from: ad.f */
public final class C9789f {

    /* renamed from: f */
    public static final C9790a f26588f = new C9790a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static String f26589g = "wss://call.identomat.com/";

    /* renamed from: a */
    private final C43075l f26590a;

    /* renamed from: b */
    private C41803c f26591b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f26592c;

    /* renamed from: d */
    private String f26593d = "";
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Timer f26594e;

    /* renamed from: ad.f$a */
    public static final class C9790a {
        private C9790a() {
        }

        public /* synthetic */ C9790a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo26274a(JSONObject jSONObject) {
            C41536l.m120489i(jSONObject, "result");
            if (jSONObject.has("operator_url")) {
                Object obj = jSONObject.get("operator_url");
                if (obj != null) {
                    String str = (String) obj;
                    if (!C40439w.m117118v(str)) {
                        C9789f.f26588f.mo26275b(str);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        /* renamed from: b */
        public final void mo26275b(String str) {
            C41536l.m120489i(str, "<set-?>");
            C9789f.f26589g = str;
        }
    }

    /* renamed from: ad.f$b */
    public static final class C9791b extends C41803c {

        /* renamed from: A */
        final /* synthetic */ C9789f f26595A;

        /* renamed from: B */
        final /* synthetic */ URI f26596B;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9791b(C9789f fVar, URI uri) {
            super(uri);
            this.f26595A = fVar;
            this.f26596B = uri;
        }

        /* renamed from: N */
        public void mo26276N(int i, String str, boolean z) {
            Log.i("identomat_", "onClose socket");
            JSONObject jSONObject = new JSONObject("{id : closed}");
            Timer b = this.f26595A.f26594e;
            if (b != null) {
                b.cancel();
                this.f26595A.mo26267h().invoke(jSONObject);
                this.f26595A.f26592c = false;
                return;
            }
            C41536l.m120506z("timer");
            throw null;
        }

        /* renamed from: Q */
        public void mo26277Q(Exception exc) {
            Log.i("identomat_", C41536l.m120497q("onError: ", exc == null ? null : exc.getMessage()));
        }

        /* renamed from: R */
        public void mo26278R(String str) {
            Log.i("identomat_", C41536l.m120497q("onMessage: ", str));
            this.f26595A.mo26268i(new JSONObject(str));
        }

        /* renamed from: T */
        public void mo26279T(C42574h hVar) {
            Log.i("identomat_", "connected");
            this.f26595A.f26592c = true;
            this.f26595A.mo26270k();
            this.f26595A.mo26269j(10000, 30000);
        }
    }

    /* renamed from: ad.f$c */
    public static final class C9792c extends TimerTask {

        /* renamed from: d */
        final /* synthetic */ C9789f f26597d;

        public C9792c(C9789f fVar) {
            this.f26597d = fVar;
        }

        public void run() {
            if (this.f26597d.f26592c) {
                Map m = C41344r0.m119931m(C41233s.m119492a("id", "ping"), C41233s.m119492a("check", "ok"));
                Log.i("identomat_", "sending ping to the call server");
                JSONObject jSONObject = new JSONObject(m);
                C9789f fVar = this.f26597d;
                String jSONObject2 = jSONObject.toString();
                C41536l.m120488h(jSONObject2, "json.toString()");
                fVar.m36017l(jSONObject2);
            }
        }
    }

    public C9789f(C43075l lVar) {
        C41536l.m120489i(lVar, "callback");
        this.f26590a = lVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final void m36017l(String str) {
        if (this.f26592c) {
            try {
                C41803c cVar = this.f26591b;
                if (cVar != null) {
                    cVar.mo96627W(str);
                } else {
                    C41536l.m120506z("webSocketClient");
                    throw null;
                }
            } catch (Exception e) {
                Log.i("identomat_", C41536l.m120497q("send: ", e.getMessage()));
            }
        }
    }

    /* renamed from: o */
    public static /* synthetic */ void m36018o(C9789f fVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = "";
        }
        if ((i & 8) != 0) {
            str4 = "";
        }
        fVar.mo26272n(str, str2, str3, str4);
    }

    /* renamed from: f */
    public final void mo26265f() {
        Log.i("identomat_", C41536l.m120497q("connecting ", f26589g));
        C9791b bVar = new C9791b(this, new URI(f26589g));
        this.f26591b = bVar;
        bVar.mo96620I();
    }

    /* renamed from: g */
    public final void mo26266g(String str) {
        C41536l.m120489i(str, "message");
        Log.i("identomat_", "disconnect");
        JSONObject jSONObject = new JSONObject(C41344r0.m119931m(C41233s.m119492a("id", "stop"), C41233s.m119492a("message", str)));
        Log.i("identomat_", jSONObject.toString());
        String jSONObject2 = jSONObject.toString();
        C41536l.m120488h(jSONObject2, "json.toString()");
        m36017l(jSONObject2);
        C41803c cVar = this.f26591b;
        if (cVar != null) {
            cVar.mo96619H();
        } else {
            C41536l.m120506z("webSocketClient");
            throw null;
        }
    }

    /* renamed from: h */
    public final C43075l mo26267h() {
        return this.f26590a;
    }

    /* renamed from: i */
    public final void mo26268i(JSONObject jSONObject) {
        C41536l.m120489i(jSONObject, "jsonObject");
        this.f26590a.invoke(jSONObject);
    }

    /* renamed from: j */
    public final void mo26269j(long j, long j2) {
        Timer a = C41694a.m120937a("callSocketTimer", true);
        a.scheduleAtFixedRate(new C9792c(this), j, j2);
        this.f26594e = a;
    }

    /* renamed from: k */
    public final void mo26270k() {
        this.f26593d = C9786e.f26584a.mo26262a() + '.' + C43263c.f101019d.mo101946b();
        JSONObject jSONObject = new JSONObject(C41344r0.m119931m(C41233s.m119492a("id", "register"), C41233s.m119492a("type", "client"), C41233s.m119492a("name", this.f26593d)));
        Log.i("identomat_", jSONObject.toString());
        String jSONObject2 = jSONObject.toString();
        C41536l.m120488h(jSONObject2, "json.toString()");
        m36017l(jSONObject2);
    }

    /* renamed from: m */
    public final void mo26271m(SessionDescription sessionDescription) {
        C41536l.m120489i(sessionDescription, "sdp");
        String jSONObject = new JSONObject(C41344r0.m119931m(C41233s.m119492a("id", "call"), C41233s.m119492a("from", this.f26593d), C41233s.m119492a("to", "operator"), C41233s.m119492a("sdpOffer", sessionDescription.f98895b))).toString();
        C41536l.m120488h(jSONObject, "json.toString()");
        m36017l(jSONObject);
    }

    /* renamed from: n */
    public final void mo26272n(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "id");
        C41536l.m120489i(str2, "type");
        C41536l.m120489i(str3, "guide");
        C41536l.m120489i(str4, "suggestion");
        Map m = C41344r0.m119931m(C41233s.m119492a("id", str), C41233s.m119492a("message", C41344r0.m119931m(C41233s.m119492a("type", str2), C41233s.m119492a("guide", str3), C41233s.m119492a("text", str4))));
        Log.i("identomat_", C41536l.m120497q("sendVisualGuide: ", m));
        String jSONObject = new JSONObject(m).toString();
        C41536l.m120488h(jSONObject, "json.toString()");
        m36017l(jSONObject);
    }

    /* renamed from: p */
    public final void mo26273p(List list) {
        C41536l.m120489i(list, "candidates");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IceCandidate iceCandidate = (IceCandidate) it.next();
            JSONObject jSONObject = new JSONObject(C41344r0.m119931m(C41233s.m119492a("id", "onIceCandidate"), C41233s.m119492a("candidate", C41344r0.m119931m(C41233s.m119492a("candidate", iceCandidate.f98817c), C41233s.m119492a("sdpMid", iceCandidate.f98815a), C41233s.m119492a("sdpMLineIndex", Integer.valueOf(iceCandidate.f98816b))))));
            Log.i("identomat_", C41536l.m120497q("my candidate ", jSONObject));
            String jSONObject2 = jSONObject.toString();
            C41536l.m120488h(jSONObject2, "json.toString()");
            m36017l(jSONObject2);
        }
    }
}
