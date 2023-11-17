package p345ad;

import android.util.Log;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import he1.C41233s;
import java.net.URI;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import le1.C41694a;
import ng1.C41803c;
import org.json.JSONObject;
import sg1.C42574h;

/* renamed from: ad.h */
public final class C9796h extends C41803c {

    /* renamed from: E */
    public static final C9797a f26607E = new C9797a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: F */
    public static String f26608F = "wss://notifications.identomat.com";

    /* renamed from: A */
    private final C1644x f26609A = new C1644x(new JSONObject());
    /* access modifiers changed from: private */

    /* renamed from: B */
    public boolean f26610B;

    /* renamed from: C */
    private String f26611C = C9786e.f26584a.mo26262a();

    /* renamed from: D */
    private Timer f26612D;

    /* renamed from: ad.h$a */
    public static final class C9797a {
        private C9797a() {
        }

        public /* synthetic */ C9797a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo26289a(JSONObject jSONObject) {
            C41536l.m120489i(jSONObject, "result");
            if (jSONObject.has("notifications_url")) {
                Object obj = jSONObject.get("notifications_url");
                if (obj != null) {
                    String str = (String) obj;
                    if (!C40439w.m117118v(str)) {
                        C9796h.f26607E.mo26290b(str);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        /* renamed from: b */
        public final void mo26290b(String str) {
            C41536l.m120489i(str, "<set-?>");
            C9796h.f26608F = str;
        }
    }

    /* renamed from: ad.h$b */
    public static final class C9798b extends TimerTask {

        /* renamed from: d */
        final /* synthetic */ C9796h f26613d;

        public C9798b(C9796h hVar) {
            this.f26613d = hVar;
        }

        public void run() {
            if (this.f26613d.f26610B) {
                Map m = C41344r0.m119931m(C41233s.m119492a("id", "ping"), C41233s.m119492a("check", "ok"), C41233s.m119492a("sessionId", C9786e.f26584a.mo26262a()));
                Log.i("notification_", C41536l.m120497q("sending ping to the call server ", m));
                JSONObject jSONObject = new JSONObject(m);
                C9796h hVar = this.f26613d;
                String jSONObject2 = jSONObject.toString();
                C41536l.m120488h(jSONObject2, "json.toString()");
                hVar.m36056g0(jSONObject2);
            }
        }
    }

    public C9796h() {
        super(new URI(f26608F));
    }

    /* renamed from: e0 */
    private final void m36054e0(long j, long j2) {
        Timer a = C41694a.m120937a("callSocketTimer", true);
        a.scheduleAtFixedRate(new C9798b(this), j, j2);
        this.f26612D = a;
    }

    /* renamed from: f0 */
    private final void m36055f0() {
        JSONObject jSONObject = new JSONObject(C41342q0.m119922g(C41233s.m119492a("sessionId", this.f26611C)));
        Log.i("notification_", jSONObject.toString());
        String jSONObject2 = jSONObject.toString();
        C41536l.m120488h(jSONObject2, "json.toString()");
        m36056g0(jSONObject2);
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public final void m36056g0(String str) {
        if (this.f26610B) {
            try {
                mo96627W(str);
            } catch (Exception e) {
                Log.i("notification_", C41536l.m120497q("send: ", e.getMessage()));
            }
        }
    }

    /* renamed from: N */
    public void mo26276N(int i, String str, boolean z) {
        Log.i("notification_", "onClose socket");
        JSONObject jSONObject = new JSONObject("{result : closed}");
        Timer timer = this.f26612D;
        if (timer != null) {
            timer.cancel();
            this.f26609A.mo4823o(jSONObject);
            this.f26610B = false;
            return;
        }
        C41536l.m120506z("timer");
        throw null;
    }

    /* renamed from: Q */
    public void mo26277Q(Exception exc) {
        Log.i("notification_", C41536l.m120497q("onError: ", exc == null ? null : exc.getMessage()));
    }

    /* renamed from: R */
    public void mo26278R(String str) {
        Log.i("notification_", C41536l.m120497q("onMessage: ", str));
        if (!C41536l.m120484d(str, "pong")) {
            this.f26609A.mo4823o(new JSONObject(str));
        }
    }

    /* renamed from: T */
    public void mo26279T(C42574h hVar) {
        Log.i("notification_", "connected");
        this.f26610B = true;
        m36055f0();
        m36054e0(5000, 30000);
    }

    /* renamed from: c0 */
    public final void mo26287c0(String str) {
        C41536l.m120489i(str, "message");
        Log.i("notification_", "disconnect");
        String jSONObject = new JSONObject(C41344r0.m119931m(C41233s.m119492a("id", "stop"), C41233s.m119492a("message", str))).toString();
        C41536l.m120488h(jSONObject, "json.toString()");
        m36056g0(jSONObject);
        mo96619H();
    }

    /* renamed from: d0 */
    public final LiveData mo26288d0() {
        return this.f26609A;
    }
}
