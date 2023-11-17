package p637vc;

import android.graphics.Bitmap;
import android.util.Base64;
import androidx.lifecycle.C1613n0;
import androidx.lifecycle.C1615o0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ef1.C40814h0;
import ef1.C40822j0;
import ef1.C40845o1;
import gf1.C41097e;
import he1.C41228o;
import he1.C41238w;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C41558c;
import kotlinx.coroutines.flow.C41567j;
import kotlinx.coroutines.flow.C41568k;
import kotlinx.coroutines.flow.C41571n;
import kotlinx.coroutines.flow.C41576p;
import kotlinx.coroutines.flow.C41578r;
import kotlinx.coroutines.flow.C41581t;
import me1.C41752f;
import oe1.C41851b;
import oe1.C41862l;
import org.json.JSONObject;
import p345ad.C9793g;
import p345ad.C9799i;
import p388dd.C12074b;
import p485kc.C16346d;
import ue1.C43064a;
import ue1.C43079p;

/* renamed from: vc.k */
public final class C18294k extends C1613n0 implements C9799i {

    /* renamed from: q */
    public static final C18295a f51680q = new C18295a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C9793g f51681d;

    /* renamed from: e */
    private final C1644x f51682e = new C1644x("Get ready for liveness check");

    /* renamed from: f */
    private final C1644x f51683f = new C1644x(Integer.valueOf(C16346d.identomat_cascading_mark));

    /* renamed from: g */
    private final C1644x f51684g = new C1644x(-1);

    /* renamed from: h */
    private final C1644x f51685h = new C1644x(-1);

    /* renamed from: i */
    private boolean f51686i;

    /* renamed from: j */
    private C1644x f51687j;

    /* renamed from: k */
    private final C1644x f51688k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C41567j f51689l;

    /* renamed from: m */
    private final C41571n f51690m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C41568k f51691n;

    /* renamed from: o */
    private final C41578r f51692o;

    /* renamed from: p */
    private LiveData f51693p;

    /* renamed from: vc.k$a */
    public static final class C18295a {
        private C18295a() {
        }

        public /* synthetic */ C18295a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: vc.k$b */
    static final class C18296b extends C41862l implements C43079p {

        /* renamed from: h */
        int f51694h;

        /* renamed from: i */
        final /* synthetic */ C18294k f51695i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18296b(C18294k kVar, Continuation continuation) {
            super(2, continuation);
            this.f51695i = kVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C18296b(this.f51695i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f51694h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41568k ew = this.f51695i.f51691n;
                Boolean a = C41851b.m121254a(true);
                this.f51694h = 1;
                if (ew.mo95721b(a, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C18296b) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    /* renamed from: vc.k$c */
    static final class C18297c extends C41862l implements C43079p {

        /* renamed from: h */
        int f51696h;

        /* renamed from: i */
        final /* synthetic */ C18294k f51697i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C18297c(C18294k kVar, Continuation continuation) {
            super(2, continuation);
            this.f51697i = kVar;
        }

        /* renamed from: a */
        public final Continuation mo3708a(Object obj, Continuation continuation) {
            return new C18297c(this.f51697i, continuation);
        }

        /* renamed from: f */
        public final Object mo3709f(Object obj) {
            Object c = C41793d.m121157c();
            int i = this.f51696h;
            if (i == 0) {
                C41228o.m119483b(obj);
                C41567j dw = this.f51697i.f51689l;
                C41238w wVar = C41238w.f97225a;
                this.f51696h = 1;
                if (dw.mo95721b(wVar, this) == c) {
                    return c;
                }
            } else if (i == 1) {
                C41228o.m119483b(obj);
            } else if (i == 2) {
                C41228o.m119483b(obj);
                return C41238w.f97225a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C41568k ew = this.f51697i.f51691n;
            Boolean a = C41851b.m121254a(false);
            this.f51696h = 2;
            if (ew.mo95721b(a, this) == c) {
                return c;
            }
            return C41238w.f97225a;
        }

        /* renamed from: n */
        public final Object invoke(C40814h0 h0Var, Continuation continuation) {
            return ((C18297c) mo3708a(h0Var, continuation)).mo3709f(C41238w.f97225a);
        }
    }

    public C18294k(C9793g gVar) {
        C41536l.m120489i(gVar, "cascadingSocket");
        this.f51681d = gVar;
        Boolean bool = Boolean.FALSE;
        this.f51687j = new C1644x(bool);
        this.f51688k = new C1644x(bool);
        C41567j b = C41576p.m120590b(0, 0, (C41097e) null, 7, (Object) null);
        this.f51689l = b;
        this.f51690m = C41558c.m120514a(b);
        C41568k a = C41581t.m120610a(Boolean.TRUE);
        this.f51691n = a;
        this.f51692o = C41558c.m120515b(a);
    }

    /* renamed from: Je */
    public void mo26292Je() {
        this.f51687j.mo4823o(Boolean.TRUE);
    }

    /* renamed from: fw */
    public final void mo46014fw(C43064a aVar) {
        this.f51681d.mo26284k(this);
        this.f51693p = this.f51681d.mo26281e(aVar);
    }

    /* renamed from: gw */
    public final void mo46015gw() {
        this.f51681d.mo26282f();
    }

    /* renamed from: hw */
    public final C1644x mo46016hw() {
        return this.f51687j;
    }

    /* renamed from: iw */
    public final C1644x mo46017iw() {
        return this.f51684g;
    }

    /* renamed from: jw */
    public final C1644x mo46018jw() {
        return this.f51683f;
    }

    /* renamed from: kw */
    public final C1644x mo46019kw() {
        return this.f51682e;
    }

    /* renamed from: lw */
    public final LiveData mo46020lw() {
        return this.f51693p;
    }

    /* renamed from: mw */
    public final C1644x mo46021mw() {
        return this.f51685h;
    }

    /* renamed from: nw */
    public final C41571n mo46022nw() {
        return this.f51690m;
    }

    /* renamed from: ow */
    public final C41578r mo46023ow() {
        return this.f51692o;
    }

    /* renamed from: pw */
    public final C1644x mo46024pw() {
        return this.f51688k;
    }

    /* renamed from: qw */
    public final void mo46025qw() {
        if (!this.f51686i && !C41536l.m120484d(this.f51688k.mo4814f(), Boolean.TRUE)) {
            this.f51683f.mo4823o(Integer.valueOf(C16346d.identomat_cascading_mark));
            this.f51688k.mo4823o(Boolean.FALSE);
            mo46030vw();
        }
    }

    /* renamed from: rw */
    public final void mo46026rw(Bitmap bitmap) {
        C41536l.m120489i(bitmap, "bitmap");
        String a = C12074b.f35484a.mo32219a(bitmap, 30);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("image", a);
        this.f51681d.mo26283j(jSONObject);
    }

    /* renamed from: sw */
    public final void mo46027sw(String str) {
        C41536l.m120489i(str, "sessionId");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sessionId", str);
        this.f51681d.mo26283j(jSONObject);
    }

    /* renamed from: tw */
    public final void mo46028tw(File file) {
        C41536l.m120489i(file, "file");
        String encodeToString = Base64.encodeToString(C42554f.m123192a(file), 0);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("file", encodeToString);
        this.f51681d.mo26283j(jSONObject);
    }

    /* renamed from: uw */
    public final void mo46029uw(boolean z) {
        this.f51686i = z;
    }

    /* renamed from: vw */
    public final void mo46030vw() {
        C40845o1 unused = C40821j.m118316b(C1615o0.m5662a(this), (C41752f) null, (C40822j0) null, new C18296b(this, (Continuation) null), 3, (Object) null);
    }

    /* renamed from: ww */
    public final void mo46031ww() {
        C40845o1 unused = C40821j.m118316b(C1615o0.m5662a(this), (C41752f) null, (C40822j0) null, new C18297c(this, (Continuation) null), 3, (Object) null);
    }
}
