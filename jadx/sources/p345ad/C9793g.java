package p345ad;

import android.util.Log;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import com.salesforce.marketingcloud.storage.p385db.C11769i;
import he1.C41238w;
import java.net.URI;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ng1.C41803c;
import org.json.JSONObject;
import sg1.C42574h;
import ue1.C43064a;

/* renamed from: ad.g */
public final class C9793g {

    /* renamed from: e */
    public static final C9794a f26598e = new C9794a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static String f26599f = "wss://cascading.test.identomat.com";

    /* renamed from: a */
    private final C1644x f26600a = new C1644x(new JSONObject());

    /* renamed from: b */
    private C9799i f26601b;

    /* renamed from: c */
    private C41803c f26602c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f26603d;

    /* renamed from: ad.g$a */
    public static final class C9794a {
        private C9794a() {
        }

        public /* synthetic */ C9794a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo26285a(JSONObject jSONObject) {
            C41536l.m120489i(jSONObject, "result");
            if (jSONObject.has("cascading_url")) {
                Object obj = jSONObject.get("cascading_url");
                if (obj != null) {
                    String str = (String) obj;
                    if (!C40439w.m117118v(str)) {
                        Log.e(C11769i.C11770a.f34149l, str);
                        C9793g.f26598e.mo26286b(str);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        /* renamed from: b */
        public final void mo26286b(String str) {
            C41536l.m120489i(str, "<set-?>");
            C9793g.f26599f = str;
        }
    }

    /* renamed from: ad.g$b */
    public static final class C9795b extends C41803c {

        /* renamed from: A */
        final /* synthetic */ C43064a f26604A;

        /* renamed from: B */
        final /* synthetic */ C9793g f26605B;

        /* renamed from: C */
        final /* synthetic */ URI f26606C;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9795b(C43064a aVar, C9793g gVar, URI uri) {
            super(uri);
            this.f26604A = aVar;
            this.f26605B = gVar;
            this.f26606C = uri;
        }

        /* renamed from: N */
        public void mo26276N(int i, String str, boolean z) {
            new JSONObject("{id : closed}");
            Log.e("onClose", "Close");
            this.f26605B.f26603d = false;
        }

        /* renamed from: Q */
        public void mo26277Q(Exception exc) {
            Log.i("identomat_", C41536l.m120497q("onError: ", exc == null ? null : exc.getMessage()));
        }

        /* renamed from: R */
        public void mo26278R(String str) {
            Log.i("identomat_", C41536l.m120497q("message ", str));
            try {
                JSONObject jSONObject = new JSONObject(str);
                this.f26605B.m36039h(jSONObject);
                this.f26605B.m36040i(jSONObject);
            } catch (Exception unused) {
                this.f26605B.m36040i((JSONObject) null);
            }
        }

        /* renamed from: T */
        public void mo26279T(C42574h hVar) {
            Log.i("identomat_", "connected");
            C43064a aVar = this.f26604A;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f26605B.f26603d = true;
        }
    }

    /* renamed from: g */
    private final LiveData m36038g() {
        return this.f26600a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m36039h(JSONObject jSONObject) {
        C9799i iVar;
        if (jSONObject != null && jSONObject.has("instruction") && C41536l.m120484d(jSONObject.getString("instruction"), "face-result-approved") && (iVar = this.f26601b) != null) {
            iVar.mo26292Je();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m36040i(JSONObject jSONObject) {
        Log.i("identomat_", String.valueOf(jSONObject));
        this.f26600a.mo4823o(jSONObject);
    }

    /* renamed from: e */
    public final LiveData mo26281e(C43064a aVar) {
        this.f26600a.mo4826r(new JSONObject());
        Log.i("identomat_", C41536l.m120497q("connecting ", f26599f));
        C9795b bVar = new C9795b(aVar, this, new URI(f26599f));
        this.f26602c = bVar;
        bVar.mo96620I();
        return m36038g();
    }

    /* renamed from: f */
    public final void mo26282f() {
        C41803c cVar = this.f26602c;
        if (cVar != null) {
            cVar.mo96619H();
        }
    }

    /* renamed from: j */
    public final void mo26283j(JSONObject jSONObject) {
        Log.i("identomat_", C41536l.m120497q("sending: ", jSONObject));
        if (jSONObject != null) {
            try {
                C41803c cVar = this.f26602c;
                if (cVar != null) {
                    cVar.mo96627W(jSONObject.toString());
                    C41238w wVar = C41238w.f97225a;
                }
            } catch (Exception e) {
                e.printStackTrace();
                Log.e("identomat_", C41536l.m120497q("sendJson: ", C41238w.f97225a));
            }
        }
    }

    /* renamed from: k */
    public final void mo26284k(C9799i iVar) {
        C41536l.m120489i(iVar, "onApproveListener");
        this.f26601b = iVar;
    }
}
