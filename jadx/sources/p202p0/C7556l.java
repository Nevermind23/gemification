package p202p0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.C0152h;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.p016os.C0908e;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1636t0;
import androidx.navigation.NavBackStackEntryState;
import bf1.C40342g;
import gf1.C41097e;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import ie1.C41322h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.C41523c;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41547w;
import kotlin.jvm.internal.C41548x;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.C41556a;
import kotlinx.coroutines.flow.C41558c;
import kotlinx.coroutines.flow.C41567j;
import kotlinx.coroutines.flow.C41568k;
import kotlinx.coroutines.flow.C41576p;
import kotlinx.coroutines.flow.C41578r;
import kotlinx.coroutines.flow.C41581t;
import p202p0.C7530c0;
import p202p0.C7549j;
import p202p0.C7575m;
import p202p0.C7589q;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: p0.l */
public abstract class C7556l {

    /* renamed from: G */
    public static final C7557a f22035G = new C7557a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: H */
    public static boolean f22036H = true;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final Map f22037A;

    /* renamed from: B */
    private int f22038B;

    /* renamed from: C */
    private final List f22039C;

    /* renamed from: D */
    private final C41217g f22040D;

    /* renamed from: E */
    private final C41567j f22041E;

    /* renamed from: F */
    private final C41556a f22042F;

    /* renamed from: a */
    private final Context f22043a;

    /* renamed from: b */
    private Activity f22044b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C7600v f22045c;

    /* renamed from: d */
    private C7594s f22046d;

    /* renamed from: e */
    private Bundle f22047e;

    /* renamed from: f */
    private Parcelable[] f22048f;

    /* renamed from: g */
    private boolean f22049g;

    /* renamed from: h */
    private final C41322h f22050h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C41568k f22051i;

    /* renamed from: j */
    private final C41578r f22052j;

    /* renamed from: k */
    private final Map f22053k;

    /* renamed from: l */
    private final Map f22054l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Map f22055m;

    /* renamed from: n */
    private final Map f22056n;

    /* renamed from: o */
    private C1619q f22057o;

    /* renamed from: p */
    private OnBackPressedDispatcher f22058p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C7575m f22059q;

    /* renamed from: r */
    private final CopyOnWriteArrayList f22060r;

    /* renamed from: s */
    private C1593j.C1598b f22061s;

    /* renamed from: t */
    private final C1616p f22062t;

    /* renamed from: u */
    private final C0152h f22063u;

    /* renamed from: v */
    private boolean f22064v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public C7536d0 f22065w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public final Map f22066x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public C43075l f22067y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C43075l f22068z;

    /* renamed from: p0.l$a */
    public static final class C7557a {
        private C7557a() {
        }

        public /* synthetic */ C7557a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: p0.l$b */
    private final class C7558b extends C7539e0 {

        /* renamed from: g */
        private final C7530c0 f22069g;

        /* renamed from: h */
        final /* synthetic */ C7556l f22070h;

        /* renamed from: p0.l$b$a */
        static final class C7559a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ C7558b f22071d;

            /* renamed from: e */
            final /* synthetic */ C7549j f22072e;

            /* renamed from: f */
            final /* synthetic */ boolean f22073f;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7559a(C7558b bVar, C7549j jVar, boolean z) {
                super(0);
                this.f22071d = bVar;
                this.f22072e = jVar;
                this.f22073f = z;
            }

            public final void invoke() {
                C7558b.super.mo22076g(this.f22072e, this.f22073f);
            }
        }

        public C7558b(C7556l lVar, C7530c0 c0Var) {
            C41536l.m120489i(c0Var, "navigator");
            this.f22070h = lVar;
            this.f22069g = c0Var;
        }

        /* renamed from: a */
        public C7549j mo22070a(C7589q qVar, Bundle bundle) {
            C41536l.m120489i(qVar, "destination");
            return C7549j.C7550a.m28694b(C7549j.f22017q, this.f22070h.mo22145z(), qVar, bundle, this.f22070h.mo22113E(), this.f22070h.f22059q, (String) null, (Bundle) null, 96, (Object) null);
        }

        /* renamed from: e */
        public void mo22074e(C7549j jVar) {
            C7575m j;
            C41536l.m120489i(jVar, "entry");
            boolean d = C41536l.m120484d(this.f22070h.f22037A.get(jVar), Boolean.TRUE);
            super.mo22074e(jVar);
            this.f22070h.f22037A.remove(jVar);
            if (!this.f22070h.mo22143x().contains(jVar)) {
                this.f22070h.mo22138q0(jVar);
                if (jVar.getLifecycle().mo4907b().mo4914b(C1593j.C1598b.CREATED)) {
                    jVar.mo22104l(C1593j.C1598b.DESTROYED);
                }
                C41322h x = this.f22070h.mo22143x();
                boolean z = true;
                if (!(x instanceof Collection) || !x.isEmpty()) {
                    Iterator it = x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (C41536l.m120484d(((C7549j) it.next()).mo22098g(), jVar.mo22098g())) {
                                z = false;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (z && !d && (j = this.f22070h.f22059q) != null) {
                    j.mo22161ew(jVar.mo22098g());
                }
                this.f22070h.mo22140r0();
                this.f22070h.f22051i.mo96335c(this.f22070h.mo22127d0());
            } else if (!mo22073d()) {
                this.f22070h.mo22140r0();
                this.f22070h.f22051i.mo96335c(this.f22070h.mo22127d0());
            }
        }

        /* renamed from: g */
        public void mo22076g(C7549j jVar, boolean z) {
            C41536l.m120489i(jVar, "popUpTo");
            C7530c0 d = this.f22070h.f22065w.mo22061d(jVar.mo22097f().mo22216z());
            if (C41536l.m120484d(d, this.f22069g)) {
                C43075l i = this.f22070h.f22068z;
                if (i != null) {
                    i.invoke(jVar);
                    super.mo22076g(jVar, z);
                    return;
                }
                this.f22070h.mo22126X(jVar, new C7559a(this, jVar, z));
                return;
            }
            Object obj = this.f22070h.f22066x.get(d);
            C41536l.m120486f(obj);
            ((C7558b) obj).mo22076g(jVar, z);
        }

        /* renamed from: h */
        public void mo22077h(C7549j jVar) {
            C41536l.m120489i(jVar, "backStackEntry");
            C7530c0 d = this.f22070h.f22065w.mo22061d(jVar.mo22097f().mo22216z());
            if (C41536l.m120484d(d, this.f22069g)) {
                C43075l c = this.f22070h.f22067y;
                if (c != null) {
                    c.invoke(jVar);
                    mo22146k(jVar);
                    return;
                }
                Log.i("NavController", "Ignoring add of destination " + jVar.mo22097f() + " outside of the call to navigate(). ");
                return;
            }
            Object obj = this.f22070h.f22066x.get(d);
            if (obj != null) {
                ((C7558b) obj).mo22077h(jVar);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + jVar.mo22097f().mo22216z() + " should already be created").toString());
        }

        /* renamed from: k */
        public final void mo22146k(C7549j jVar) {
            C41536l.m120489i(jVar, "backStackEntry");
            super.mo22077h(jVar);
        }
    }

    /* renamed from: p0.l$c */
    public interface C7560c {
        /* renamed from: a */
        void mo22147a(C7556l lVar, C7589q qVar, Bundle bundle);
    }

    /* renamed from: p0.l$d */
    static final class C7561d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7561d f22074d = new C7561d();

        C7561d() {
            super(1);
        }

        /* renamed from: a */
        public final Context invoke(Context context) {
            C41536l.m120489i(context, "it");
            if (context instanceof ContextWrapper) {
                return ((ContextWrapper) context).getBaseContext();
            }
            return null;
        }
    }

    /* renamed from: p0.l$e */
    static final class C7562e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C7589q f22075d;

        /* renamed from: e */
        final /* synthetic */ C7556l f22076e;

        /* renamed from: p0.l$e$a */
        static final class C7563a extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C7563a f22077d = new C7563a();

            C7563a() {
                super(1);
            }

            /* renamed from: a */
            public final void mo22150a(C7529c cVar) {
                C41536l.m120489i(cVar, "$this$anim");
                cVar.mo22046e(0);
                cVar.mo22047f(0);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo22150a((C7529c) obj);
                return C41238w.f97225a;
            }
        }

        /* renamed from: p0.l$e$b */
        static final class C7564b extends C41537m implements C43075l {

            /* renamed from: d */
            public static final C7564b f22078d = new C7564b();

            C7564b() {
                super(1);
            }

            /* renamed from: a */
            public final void mo22151a(C7541f0 f0Var) {
                C41536l.m120489i(f0Var, "$this$popUpTo");
                f0Var.mo22081c(true);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                mo22151a((C7541f0) obj);
                return C41238w.f97225a;
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7562e(C7589q qVar, C7556l lVar) {
            super(1);
            this.f22075d = qVar;
            this.f22076e = lVar;
        }

        /* renamed from: a */
        public final void mo22149a(C7604x xVar) {
            boolean z;
            C7594s sVar;
            C41536l.m120489i(xVar, "$this$navOptions");
            xVar.mo22265a(C7563a.f22077d);
            C7589q qVar = this.f22075d;
            boolean z2 = false;
            if (qVar instanceof C7594s) {
                C40342g c = C7589q.f22137m.mo22219c(qVar);
                C7556l lVar = this.f22076e;
                Iterator it = c.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    C7589q qVar2 = (C7589q) it.next();
                    C7589q B = lVar.mo22111B();
                    if (B != null) {
                        sVar = B.mo22199A();
                    } else {
                        sVar = null;
                    }
                    if (C41536l.m120484d(qVar2, sVar)) {
                        z = false;
                        break;
                    }
                }
                if (z) {
                    z2 = true;
                }
            }
            if (z2 && C7556l.f22036H) {
                xVar.mo22267c(C7594s.f22154s.mo22236a(this.f22076e.mo22112D()).mo22214w(), C7564b.f22078d);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo22149a((C7604x) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p0.l$f */
    static final class C7565f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C7556l f22079d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7565f(C7556l lVar) {
            super(0);
            this.f22079d = lVar;
        }

        /* renamed from: b */
        public final C7600v invoke() {
            C7600v g = this.f22079d.f22045c;
            return g == null ? new C7600v(this.f22079d.mo22145z(), this.f22079d.f22065w) : g;
        }
    }

    /* renamed from: p0.l$g */
    static final class C7566g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41547w f22080d;

        /* renamed from: e */
        final /* synthetic */ C7556l f22081e;

        /* renamed from: f */
        final /* synthetic */ C7589q f22082f;

        /* renamed from: g */
        final /* synthetic */ Bundle f22083g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7566g(C41547w wVar, C7556l lVar, C7589q qVar, Bundle bundle) {
            super(1);
            this.f22080d = wVar;
            this.f22081e = lVar;
            this.f22082f = qVar;
            this.f22083g = bundle;
        }

        /* renamed from: a */
        public final void mo22153a(C7549j jVar) {
            C41536l.m120489i(jVar, "it");
            this.f22080d.f97714d = true;
            C7556l.m28728o(this.f22081e, this.f22082f, this.f22083g, jVar, (List) null, 8, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo22153a((C7549j) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p0.l$h */
    public static final class C7567h extends C0152h {

        /* renamed from: d */
        final /* synthetic */ C7556l f22084d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7567h(C7556l lVar) {
            super(false);
            this.f22084d = lVar;
        }

        /* renamed from: b */
        public void mo361b() {
            this.f22084d.mo22123U();
        }
    }

    /* renamed from: p0.l$i */
    static final class C7568i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41547w f22085d;

        /* renamed from: e */
        final /* synthetic */ C41547w f22086e;

        /* renamed from: f */
        final /* synthetic */ C7556l f22087f;

        /* renamed from: g */
        final /* synthetic */ boolean f22088g;

        /* renamed from: h */
        final /* synthetic */ C41322h f22089h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7568i(C41547w wVar, C41547w wVar2, C7556l lVar, boolean z, C41322h hVar) {
            super(1);
            this.f22085d = wVar;
            this.f22086e = wVar2;
            this.f22087f = lVar;
            this.f22088g = z;
            this.f22089h = hVar;
        }

        /* renamed from: a */
        public final void mo22154a(C7549j jVar) {
            C41536l.m120489i(jVar, "entry");
            this.f22085d.f97714d = true;
            this.f22086e.f97714d = true;
            this.f22087f.m28713b0(jVar, this.f22088g, this.f22089h);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo22154a((C7549j) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: p0.l$j */
    static final class C7569j extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7569j f22090d = new C7569j();

        C7569j() {
            super(1);
        }

        /* renamed from: a */
        public final C7589q invoke(C7589q qVar) {
            C41536l.m120489i(qVar, "destination");
            C7594s A = qVar.mo22199A();
            boolean z = false;
            if (A != null && A.mo22232R() == qVar.mo22214w()) {
                z = true;
            }
            if (z) {
                return qVar.mo22199A();
            }
            return null;
        }
    }

    /* renamed from: p0.l$k */
    static final class C7570k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C7556l f22091d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7570k(C7556l lVar) {
            super(1);
            this.f22091d = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C7589q qVar) {
            C41536l.m120489i(qVar, "destination");
            return Boolean.valueOf(!this.f22091d.f22055m.containsKey(Integer.valueOf(qVar.mo22214w())));
        }
    }

    /* renamed from: p0.l$l */
    static final class C7571l extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C7571l f22092d = new C7571l();

        C7571l() {
            super(1);
        }

        /* renamed from: a */
        public final C7589q invoke(C7589q qVar) {
            C41536l.m120489i(qVar, "destination");
            C7594s A = qVar.mo22199A();
            boolean z = false;
            if (A != null && A.mo22232R() == qVar.mo22214w()) {
                z = true;
            }
            if (z) {
                return qVar.mo22199A();
            }
            return null;
        }
    }

    /* renamed from: p0.l$m */
    static final class C7572m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C7556l f22093d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7572m(C7556l lVar) {
            super(1);
            this.f22093d = lVar;
        }

        /* renamed from: a */
        public final Boolean invoke(C7589q qVar) {
            C41536l.m120489i(qVar, "destination");
            return Boolean.valueOf(!this.f22093d.f22055m.containsKey(Integer.valueOf(qVar.mo22214w())));
        }
    }

    /* renamed from: p0.l$n */
    static final class C7573n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ String f22094d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7573n(String str) {
            super(1);
            this.f22094d = str;
        }

        /* renamed from: a */
        public final Boolean invoke(String str) {
            return Boolean.valueOf(C41536l.m120484d(str, this.f22094d));
        }
    }

    /* renamed from: p0.l$o */
    static final class C7574o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C41547w f22095d;

        /* renamed from: e */
        final /* synthetic */ List f22096e;

        /* renamed from: f */
        final /* synthetic */ C41548x f22097f;

        /* renamed from: g */
        final /* synthetic */ C7556l f22098g;

        /* renamed from: h */
        final /* synthetic */ Bundle f22099h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7574o(C41547w wVar, List list, C41548x xVar, C7556l lVar, Bundle bundle) {
            super(1);
            this.f22095d = wVar;
            this.f22096e = list;
            this.f22097f = xVar;
            this.f22098g = lVar;
            this.f22099h = bundle;
        }

        /* renamed from: a */
        public final void mo22160a(C7549j jVar) {
            List list;
            C41536l.m120489i(jVar, "entry");
            this.f22095d.f97714d = true;
            int indexOf = this.f22096e.indexOf(jVar);
            if (indexOf != -1) {
                int i = indexOf + 1;
                list = this.f22096e.subList(this.f22097f.f97715d, i);
                this.f22097f.f97715d = i;
            } else {
                list = C41341q.m119907j();
            }
            this.f22098g.m28727n(jVar.mo22097f(), this.f22099h, jVar, list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo22160a((C7549j) obj);
            return C41238w.f97225a;
        }
    }

    public C7556l(Context context) {
        Object obj;
        C41536l.m120489i(context, "context");
        this.f22043a = context;
        Iterator it = C40349m.m116845f(context, C7561d.f22074d).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.f22044b = (Activity) obj;
        this.f22050h = new C41322h();
        C41568k a = C41581t.m120610a(C41341q.m119907j());
        this.f22051i = a;
        this.f22052j = C41558c.m120515b(a);
        this.f22053k = new LinkedHashMap();
        this.f22054l = new LinkedHashMap();
        this.f22055m = new LinkedHashMap();
        this.f22056n = new LinkedHashMap();
        this.f22060r = new CopyOnWriteArrayList();
        this.f22061s = C1593j.C1598b.INITIALIZED;
        this.f22062t = new C7555k(this);
        this.f22063u = new C7567h(this);
        this.f22064v = true;
        this.f22065w = new C7536d0();
        this.f22066x = new LinkedHashMap();
        this.f22037A = new LinkedHashMap();
        C7536d0 d0Var = this.f22065w;
        d0Var.mo22060c(new C7598t(d0Var));
        this.f22065w.mo22060c(new C7522b(this.f22043a));
        this.f22039C = new ArrayList();
        this.f22040D = C41219i.m119470b(new C7565f(this));
        C41567j b = C41576p.m120590b(1, 0, C41097e.DROP_OLDEST, 2, (Object) null);
        this.f22041E = b;
        this.f22042F = C41558c.m120514a(b);
    }

    /* renamed from: C */
    private final int m28701C() {
        C41322h<C7549j> x = mo22143x();
        int i = 0;
        if (!(x instanceof Collection) || !x.isEmpty()) {
            for (C7549j f : x) {
                if ((!(f.mo22097f() instanceof C7594s)) && (i = i + 1) < 0) {
                    C41341q.m119916s();
                }
            }
        }
        return i;
    }

    /* renamed from: I */
    private final List m28702I(C41322h hVar) {
        C7589q qVar;
        ArrayList arrayList = new ArrayList();
        C7549j jVar = (C7549j) mo22143x().mo95919C();
        if (jVar == null || (qVar = jVar.mo22097f()) == null) {
            qVar = mo22112D();
        }
        if (hVar != null) {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) it.next();
                C7589q v = m28734v(qVar, navBackStackEntryState.mo4999a());
                if (v != null) {
                    arrayList.add(navBackStackEntryState.mo5001d(this.f22043a, v, mo22113E(), this.f22059q));
                    qVar = v;
                } else {
                    String b = C7589q.f22137m.mo22218b(this.f22043a, navBackStackEntryState.mo4999a());
                    throw new IllegalStateException(("Restore State failed: destination " + b + " cannot be found from the current destination " + qVar).toString());
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final void m28703J(C7556l lVar, C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(lVar, "this$0");
        C41536l.m120489i(qVar, "<anonymous parameter 0>");
        C41536l.m120489i(aVar, "event");
        C1593j.C1598b c = aVar.mo4910c();
        C41536l.m120488h(c, "event.targetState");
        lVar.f22061s = c;
        if (lVar.f22046d != null) {
            Iterator it = lVar.mo22143x().iterator();
            while (it.hasNext()) {
                ((C7549j) it.next()).mo22101i(aVar);
            }
        }
    }

    /* renamed from: K */
    private final void m28704K(C7549j jVar, C7549j jVar2) {
        this.f22053k.put(jVar, jVar2);
        if (this.f22054l.get(jVar2) == null) {
            this.f22054l.put(jVar2, new AtomicInteger(0));
        }
        Object obj = this.f22054l.get(jVar2);
        C41536l.m120486f(obj);
        ((AtomicInteger) obj).incrementAndGet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0119 A[LOOP:1: B:42:0x0113->B:44:0x0119, LOOP_END] */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m28705P(p202p0.C7589q r21, android.os.Bundle r22, p202p0.C7602w r23, p202p0.C7530c0.C7531a r24) {
        /*
            r20 = this;
            r6 = r20
            r3 = r23
            java.util.Map r0 = r6.f22066x
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x000e:
            boolean r1 = r0.hasNext()
            r2 = 1
            if (r1 == 0) goto L_0x001f
            java.lang.Object r1 = r0.next()
            p0.l$b r1 = (p202p0.C7556l.C7558b) r1
            r1.mo22078i(r2)
            goto L_0x000e
        L_0x001f:
            kotlin.jvm.internal.w r7 = new kotlin.jvm.internal.w
            r7.<init>()
            r8 = 0
            if (r3 == 0) goto L_0x0040
            int r0 = r23.mo22249e()
            r1 = -1
            if (r0 == r1) goto L_0x0040
            int r0 = r23.mo22249e()
            boolean r1 = r23.mo22251f()
            boolean r4 = r23.mo22253h()
            boolean r0 = r6.m28709Z(r0, r1, r4)
            r9 = r0
            goto L_0x0041
        L_0x0040:
            r9 = r8
        L_0x0041:
            android.os.Bundle r0 = r21.mo22209j(r22)
            if (r3 == 0) goto L_0x004f
            boolean r1 = r23.mo22255i()
            if (r1 != r2) goto L_0x004f
            r1 = r2
            goto L_0x0050
        L_0x004f:
            r1 = r8
        L_0x0050:
            if (r1 == 0) goto L_0x0070
            java.util.Map r1 = r6.f22055m
            int r4 = r21.mo22214w()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L_0x0070
            int r1 = r21.mo22214w()
            r4 = r24
            boolean r0 = r6.m28720g0(r1, r0, r3, r4)
            r7.f97714d = r0
            goto L_0x0105
        L_0x0070:
            r4 = r24
            p0.j r1 = r20.mo22110A()
            p0.d0 r5 = r6.f22065w
            java.lang.String r10 = r21.mo22216z()
            p0.c0 r5 = r5.mo22061d(r10)
            if (r3 == 0) goto L_0x008a
            boolean r10 = r23.mo22252g()
            if (r10 != r2) goto L_0x008a
            r10 = r2
            goto L_0x008b
        L_0x008a:
            r10 = r8
        L_0x008b:
            if (r10 == 0) goto L_0x00d6
            if (r1 == 0) goto L_0x00a1
            p0.q r10 = r1.mo22097f()
            if (r10 == 0) goto L_0x00a1
            int r11 = r21.mo22214w()
            int r10 = r10.mo22214w()
            if (r11 != r10) goto L_0x00a1
            r10 = r2
            goto L_0x00a2
        L_0x00a1:
            r10 = r8
        L_0x00a2:
            if (r10 == 0) goto L_0x00d6
            ie1.h r3 = r20.mo22143x()
            java.lang.Object r3 = r3.mo95921G()
            p0.j r3 = (p202p0.C7549j) r3
            r6.mo22138q0(r3)
            p0.j r3 = new p0.j
            r3.<init>(r1, r0)
            ie1.h r0 = r20.mo22143x()
            r0.mo95932l(r3)
            p0.q r0 = r3.mo22097f()
            p0.s r0 = r0.mo22199A()
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.mo22214w()
            p0.j r0 = r6.mo22144y(r0)
            r6.m28704K(r3, r0)
        L_0x00d2:
            r5.mo22052g(r3)
            goto L_0x0106
        L_0x00d6:
            p0.j$a r10 = p202p0.C7549j.f22017q
            android.content.Context r11 = r6.f22043a
            androidx.lifecycle.j$b r14 = r20.mo22113E()
            p0.m r15 = r6.f22059q
            r16 = 0
            r17 = 0
            r18 = 96
            r19 = 0
            r12 = r21
            r13 = r0
            p0.j r1 = p202p0.C7549j.C7550a.m28694b(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            java.util.List r2 = ie1.C41339p.m119900e(r1)
            p0.l$g r10 = new p0.l$g
            r1 = r21
            r10.<init>(r7, r6, r1, r0)
            r0 = r20
            r1 = r5
            r3 = r23
            r4 = r24
            r5 = r10
            r0.m28706R(r1, r2, r3, r4, r5)
        L_0x0105:
            r2 = r8
        L_0x0106:
            r20.m28733s0()
            java.util.Map r0 = r6.f22066x
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L_0x0113:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0123
            java.lang.Object r1 = r0.next()
            p0.l$b r1 = (p202p0.C7556l.C7558b) r1
            r1.mo22078i(r8)
            goto L_0x0113
        L_0x0123:
            if (r9 != 0) goto L_0x0130
            boolean r0 = r7.f97714d
            if (r0 != 0) goto L_0x0130
            if (r2 == 0) goto L_0x012c
            goto L_0x0130
        L_0x012c:
            r20.mo22140r0()
            goto L_0x0133
        L_0x0130:
            r20.m28732s()
        L_0x0133:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7556l.m28705P(p0.q, android.os.Bundle, p0.w, p0.c0$a):void");
    }

    /* renamed from: R */
    private final void m28706R(C7530c0 c0Var, List list, C7602w wVar, C7530c0.C7531a aVar, C43075l lVar) {
        this.f22067y = lVar;
        c0Var.mo22050e(list, wVar, aVar);
        this.f22067y = null;
    }

    /* renamed from: T */
    private final void m28707T(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f22047e;
        if (!(bundle2 == null || (stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:navigatorState:names")) == null)) {
            Iterator<String> it = stringArrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                C7536d0 d0Var = this.f22065w;
                C41536l.m120488h(next, "name");
                C7530c0 d = d0Var.mo22061d(next);
                Bundle bundle3 = bundle2.getBundle(next);
                if (bundle3 != null) {
                    d.mo22053h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f22048f;
        boolean z = false;
        if (parcelableArr != null) {
            int length = parcelableArr.length;
            int i = 0;
            while (i < length) {
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelableArr[i];
                C7589q u = mo22142u(navBackStackEntryState.mo4999a());
                if (u != null) {
                    C7549j d2 = navBackStackEntryState.mo5001d(this.f22043a, u, mo22113E(), this.f22059q);
                    C7530c0 d3 = this.f22065w.mo22061d(u.mo22216z());
                    Map map = this.f22066x;
                    Object obj = map.get(d3);
                    if (obj == null) {
                        obj = new C7558b(this, d3);
                        map.put(d3, obj);
                    }
                    mo22143x().add(d2);
                    ((C7558b) obj).mo22146k(d2);
                    C7594s A = d2.mo22097f().mo22199A();
                    if (A != null) {
                        m28704K(d2, mo22144y(A.mo22214w()));
                    }
                    i++;
                } else {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + C7589q.f22137m.mo22218b(this.f22043a, navBackStackEntryState.mo4999a()) + " cannot be found from the current destination " + mo22111B());
                }
            }
            m28733s0();
            this.f22048f = null;
        }
        Collection values = this.f22065w.mo22062e().values();
        ArrayList<C7530c0> arrayList = new ArrayList<>();
        for (Object next2 : values) {
            if (!((C7530c0) next2).mo22049c()) {
                arrayList.add(next2);
            }
        }
        for (C7530c0 c0Var : arrayList) {
            Map map2 = this.f22066x;
            Object obj2 = map2.get(c0Var);
            if (obj2 == null) {
                obj2 = new C7558b(this, c0Var);
                map2.put(c0Var, obj2);
            }
            c0Var.mo22051f((C7558b) obj2);
        }
        if (this.f22046d == null || !mo22143x().isEmpty()) {
            m28732s();
            return;
        }
        if (!this.f22049g && (activity = this.f22044b) != null) {
            C41536l.m120486f(activity);
            if (mo22116H(activity.getIntent())) {
                z = true;
            }
        }
        if (!z) {
            C7594s sVar = this.f22046d;
            C41536l.m120486f(sVar);
            m28705P(sVar, bundle, (C7602w) null, (C7530c0.C7531a) null);
        }
    }

    /* renamed from: Y */
    private final void m28708Y(C7530c0 c0Var, C7549j jVar, boolean z, C43075l lVar) {
        this.f22068z = lVar;
        c0Var.mo22055j(jVar, z);
        this.f22068z = null;
    }

    /* renamed from: Z */
    private final boolean m28709Z(int i, boolean z, boolean z2) {
        C7589q qVar;
        String str;
        int i2 = i;
        boolean z3 = z2;
        if (mo22143x().isEmpty()) {
            return false;
        }
        ArrayList<C7530c0> arrayList = new ArrayList<>();
        Iterator it = C41358y.m120025o0(mo22143x()).iterator();
        while (true) {
            if (!it.hasNext()) {
                qVar = null;
                break;
            }
            C7589q f = ((C7549j) it.next()).mo22097f();
            C7530c0 d = this.f22065w.mo22061d(f.mo22216z());
            if (z || f.mo22214w() != i2) {
                arrayList.add(d);
            }
            if (f.mo22214w() == i2) {
                qVar = f;
                break;
            }
        }
        if (qVar == null) {
            String b = C7589q.f22137m.mo22218b(this.f22043a, i2);
            Log.i("NavController", "Ignoring popBackStack to destination " + b + " as it was not found on the current back stack");
            return false;
        }
        C41547w wVar = new C41547w();
        C41322h hVar = new C41322h();
        for (C7530c0 Y : arrayList) {
            C41547w wVar2 = new C41547w();
            C7568i iVar = r0;
            C7568i iVar2 = new C7568i(wVar2, wVar, this, z2, hVar);
            m28708Y(Y, (C7549j) mo22143x().mo95918B(), z3, iVar);
            if (!wVar2.f97714d) {
                break;
            }
        }
        if (z3) {
            if (!z) {
                for (C7589q w : C40355o.m116867y(C40349m.m116845f(qVar, C7569j.f22090d), new C7570k(this))) {
                    Map map = this.f22055m;
                    Integer valueOf = Integer.valueOf(w.mo22214w());
                    NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) hVar.mo95941x();
                    if (navBackStackEntryState != null) {
                        str = navBackStackEntryState.mo5000b();
                    } else {
                        str = null;
                    }
                    map.put(valueOf, str);
                }
            }
            if (!hVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryState2 = (NavBackStackEntryState) hVar.mo95940w();
                for (C7589q w2 : C40355o.m116867y(C40349m.m116845f(mo22142u(navBackStackEntryState2.mo4999a()), C7571l.f22092d), new C7572m(this))) {
                    this.f22055m.put(Integer.valueOf(w2.mo22214w()), navBackStackEntryState2.mo5000b());
                }
                this.f22056n.put(navBackStackEntryState2.mo5000b(), hVar);
            }
        }
        m28733s0();
        return wVar.f97714d;
    }

    /* renamed from: a0 */
    static /* synthetic */ boolean m28711a0(C7556l lVar, int i, boolean z, boolean z2, int i2, Object obj) {
        if (obj == null) {
            if ((i2 & 4) != 0) {
                z2 = false;
            }
            return lVar.m28709Z(i, z, z2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
    }

    /* access modifiers changed from: private */
    /* renamed from: b0 */
    public final void m28713b0(C7549j jVar, boolean z, C41322h hVar) {
        boolean z2;
        C7575m mVar;
        C41578r c;
        Set set;
        C7549j jVar2 = (C7549j) mo22143x().mo95918B();
        if (C41536l.m120484d(jVar2, jVar)) {
            mo22143x().mo95921G();
            C7558b bVar = (C7558b) this.f22066x.get(mo22115G().mo22061d(jVar2.mo22097f().mo22216z()));
            boolean z3 = true;
            if (bVar == null || (c = bVar.mo22072c()) == null || (set = (Set) c.getValue()) == null || !set.contains(jVar2)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!z2 && !this.f22054l.containsKey(jVar2)) {
                z3 = false;
            }
            C1593j.C1598b b = jVar2.getLifecycle().mo4907b();
            C1593j.C1598b bVar2 = C1593j.C1598b.CREATED;
            if (b.mo4914b(bVar2)) {
                if (z) {
                    jVar2.mo22104l(bVar2);
                    hVar.mo95929i(new NavBackStackEntryState(jVar2));
                }
                if (!z3) {
                    jVar2.mo22104l(C1593j.C1598b.DESTROYED);
                    mo22138q0(jVar2);
                } else {
                    jVar2.mo22104l(bVar2);
                }
            }
            if (!z && !z3 && (mVar = this.f22059q) != null) {
                mVar.mo22161ew(jVar2.mo22098g());
                return;
            }
            return;
        }
        throw new IllegalStateException(("Attempted to pop " + jVar.mo22097f() + ", which is not the top of the back stack (" + jVar2.mo22097f() + ')').toString());
    }

    /* renamed from: c0 */
    static /* synthetic */ void m28715c0(C7556l lVar, C7549j jVar, boolean z, C41322h hVar, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                hVar = new C41322h();
            }
            lVar.m28713b0(jVar, z, hVar);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
    }

    /* renamed from: g0 */
    private final boolean m28720g0(int i, Bundle bundle, C7602w wVar, C7530c0.C7531a aVar) {
        String str;
        C7549j jVar;
        C7589q f;
        if (!this.f22055m.containsKey(Integer.valueOf(i))) {
            return false;
        }
        String str2 = (String) this.f22055m.get(Integer.valueOf(i));
        boolean unused = C41352v.m119960E(this.f22055m.values(), new C7573n(str2));
        List I = m28702I((C41322h) C41527d0.m120457d(this.f22056n).remove(str2));
        ArrayList<List> arrayList = new ArrayList<>();
        ArrayList<C7549j> arrayList2 = new ArrayList<>();
        for (Object next : I) {
            if (!(((C7549j) next).mo22097f() instanceof C7594s)) {
                arrayList2.add(next);
            }
        }
        for (C7549j jVar2 : arrayList2) {
            List list = (List) C41358y.m120020j0(arrayList);
            if (list == null || (jVar = (C7549j) C41358y.m120019i0(list)) == null || (f = jVar.mo22097f()) == null) {
                str = null;
            } else {
                str = f.mo22216z();
            }
            if (C41536l.m120484d(str, jVar2.mo22097f().mo22216z())) {
                list.add(jVar2);
            } else {
                arrayList.add(C41341q.m119913p(jVar2));
            }
        }
        C41547w wVar2 = new C41547w();
        for (List list2 : arrayList) {
            m28706R(this.f22065w.mo22061d(((C7549j) C41358y.m120007W(list2)).mo22097f().mo22216z()), list2, wVar, aVar, new C7574o(wVar2, I, new C41548x(), this, bundle));
        }
        return wVar2.f97714d;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: p0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v1, resolved type: p0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v13, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: p0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v5, resolved type: p0.j} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v54, resolved type: p0.s} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m28727n(p202p0.C7589q r31, android.os.Bundle r32, p202p0.C7549j r33, java.util.List r34) {
        /*
            r30 = this;
            r6 = r30
            r7 = r31
            r15 = r32
            r14 = r33
            r13 = r34
            p0.q r12 = r33.mo22097f()
            boolean r0 = r12 instanceof p202p0.C7535d
            if (r0 != 0) goto L_0x004c
        L_0x0012:
            ie1.h r0 = r30.mo22143x()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x004c
            ie1.h r0 = r30.mo22143x()
            java.lang.Object r0 = r0.mo95918B()
            p0.j r0 = (p202p0.C7549j) r0
            p0.q r0 = r0.mo22097f()
            boolean r0 = r0 instanceof p202p0.C7535d
            if (r0 == 0) goto L_0x004c
            ie1.h r0 = r30.mo22143x()
            java.lang.Object r0 = r0.mo95918B()
            p0.j r0 = (p202p0.C7549j) r0
            p0.q r0 = r0.mo22097f()
            int r1 = r0.mo22214w()
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r30
            boolean r0 = m28711a0(r0, r1, r2, r3, r4, r5)
            if (r0 != 0) goto L_0x0012
        L_0x004c:
            ie1.h r5 = new ie1.h
            r5.<init>()
            boolean r0 = r7 instanceof p202p0.C7594s
            r18 = 0
            if (r0 == 0) goto L_0x0104
            r0 = r12
        L_0x0058:
            kotlin.jvm.internal.C41536l.m120486f(r0)
            p0.s r4 = r0.mo22199A()
            if (r4 == 0) goto L_0x00ef
            int r0 = r34.size()
            java.util.ListIterator r0 = r13.listIterator(r0)
        L_0x0069:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0081
            java.lang.Object r1 = r0.previous()
            r2 = r1
            p0.j r2 = (p202p0.C7549j) r2
            p0.q r2 = r2.mo22097f()
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r4)
            if (r2 == 0) goto L_0x0069
            goto L_0x0083
        L_0x0081:
            r1 = r18
        L_0x0083:
            p0.j r1 = (p202p0.C7549j) r1
            if (r1 != 0) goto L_0x00aa
            p0.j$a r8 = p202p0.C7549j.f22017q
            android.content.Context r9 = r6.f22043a
            androidx.lifecycle.j$b r0 = r30.mo22113E()
            p0.m r1 = r6.f22059q
            r2 = 0
            r3 = 0
            r16 = 96
            r17 = 0
            r10 = r4
            r11 = r32
            r19 = r12
            r12 = r0
            r0 = r13
            r13 = r1
            r1 = r14
            r14 = r2
            r2 = r15
            r15 = r3
            p0.j r3 = p202p0.C7549j.C7550a.m28694b(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r8 = r1
            r1 = r3
            goto L_0x00af
        L_0x00aa:
            r19 = r12
            r0 = r13
            r8 = r14
            r2 = r15
        L_0x00af:
            r5.mo95929i(r1)
            ie1.h r1 = r30.mo22143x()
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x00ea
            ie1.h r1 = r30.mo22143x()
            java.lang.Object r1 = r1.mo95918B()
            p0.j r1 = (p202p0.C7549j) r1
            p0.q r1 = r1.mo22097f()
            if (r1 != r4) goto L_0x00ea
            ie1.h r1 = r30.mo22143x()
            java.lang.Object r1 = r1.mo95918B()
            p0.j r1 = (p202p0.C7549j) r1
            r3 = 0
            r9 = 0
            r10 = 6
            r11 = 0
            r12 = r0
            r0 = r30
            r13 = r2
            r2 = r3
            r3 = r9
            r9 = r4
            r4 = r10
            r10 = r5
            r5 = r11
            m28715c0(r0, r1, r2, r3, r4, r5)
            goto L_0x00f6
        L_0x00ea:
            r12 = r0
            r13 = r2
            r9 = r4
            r10 = r5
            goto L_0x00f6
        L_0x00ef:
            r9 = r4
            r10 = r5
            r19 = r12
            r12 = r13
            r8 = r14
            r13 = r15
        L_0x00f6:
            if (r9 == 0) goto L_0x010a
            if (r9 != r7) goto L_0x00fb
            goto L_0x010a
        L_0x00fb:
            r14 = r8
            r0 = r9
            r5 = r10
            r15 = r13
            r13 = r12
            r12 = r19
            goto L_0x0058
        L_0x0104:
            r10 = r5
            r19 = r12
            r12 = r13
            r8 = r14
            r13 = r15
        L_0x010a:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0113
            r0 = r19
            goto L_0x011d
        L_0x0113:
            java.lang.Object r0 = r10.mo95940w()
            p0.j r0 = (p202p0.C7549j) r0
            p0.q r0 = r0.mo22097f()
        L_0x011d:
            if (r0 == 0) goto L_0x0179
            int r1 = r0.mo22214w()
            p0.q r1 = r6.mo22142u(r1)
            if (r1 != 0) goto L_0x0179
            p0.s r0 = r0.mo22199A()
            if (r0 == 0) goto L_0x011d
            int r1 = r34.size()
            java.util.ListIterator r1 = r12.listIterator(r1)
        L_0x0137:
            boolean r2 = r1.hasPrevious()
            if (r2 == 0) goto L_0x014f
            java.lang.Object r2 = r1.previous()
            r3 = r2
            p0.j r3 = (p202p0.C7549j) r3
            p0.q r3 = r3.mo22097f()
            boolean r3 = kotlin.jvm.internal.C41536l.m120484d(r3, r0)
            if (r3 == 0) goto L_0x0137
            goto L_0x0151
        L_0x014f:
            r2 = r18
        L_0x0151:
            p0.j r2 = (p202p0.C7549j) r2
            if (r2 != 0) goto L_0x0175
            p0.j$a r20 = p202p0.C7549j.f22017q
            android.content.Context r1 = r6.f22043a
            android.os.Bundle r23 = r0.mo22209j(r13)
            androidx.lifecycle.j$b r24 = r30.mo22113E()
            p0.m r2 = r6.f22059q
            r26 = 0
            r27 = 0
            r28 = 96
            r29 = 0
            r21 = r1
            r22 = r0
            r25 = r2
            p0.j r2 = p202p0.C7549j.C7550a.m28694b(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
        L_0x0175:
            r10.mo95929i(r2)
            goto L_0x011d
        L_0x0179:
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x0180
            goto L_0x018c
        L_0x0180:
            java.lang.Object r0 = r10.mo95940w()
            p0.j r0 = (p202p0.C7549j) r0
            p0.q r0 = r0.mo22097f()
            r19 = r0
        L_0x018c:
            ie1.h r0 = r30.mo22143x()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01d8
            ie1.h r0 = r30.mo22143x()
            java.lang.Object r0 = r0.mo95918B()
            p0.j r0 = (p202p0.C7549j) r0
            p0.q r0 = r0.mo22097f()
            boolean r0 = r0 instanceof p202p0.C7594s
            if (r0 == 0) goto L_0x01d8
            ie1.h r0 = r30.mo22143x()
            java.lang.Object r0 = r0.mo95918B()
            p0.j r0 = (p202p0.C7549j) r0
            p0.q r0 = r0.mo22097f()
            p0.s r0 = (p202p0.C7594s) r0
            int r1 = r19.mo22214w()
            r2 = 0
            p0.q r0 = r0.mo22227L(r1, r2)
            if (r0 != 0) goto L_0x01d8
            ie1.h r0 = r30.mo22143x()
            java.lang.Object r0 = r0.mo95918B()
            r1 = r0
            p0.j r1 = (p202p0.C7549j) r1
            r2 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            r0 = r30
            m28715c0(r0, r1, r2, r3, r4, r5)
            goto L_0x018c
        L_0x01d8:
            ie1.h r0 = r30.mo22143x()
            java.lang.Object r0 = r0.mo95941x()
            p0.j r0 = (p202p0.C7549j) r0
            if (r0 != 0) goto L_0x01ea
            java.lang.Object r0 = r10.mo95941x()
            p0.j r0 = (p202p0.C7549j) r0
        L_0x01ea:
            if (r0 == 0) goto L_0x01f1
            p0.q r0 = r0.mo22097f()
            goto L_0x01f3
        L_0x01f1:
            r0 = r18
        L_0x01f3:
            p0.s r1 = r6.f22046d
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r1)
            if (r0 != 0) goto L_0x0254
            int r0 = r34.size()
            java.util.ListIterator r0 = r12.listIterator(r0)
        L_0x0203:
            boolean r1 = r0.hasPrevious()
            if (r1 == 0) goto L_0x0221
            java.lang.Object r1 = r0.previous()
            r2 = r1
            p0.j r2 = (p202p0.C7549j) r2
            p0.q r2 = r2.mo22097f()
            p0.s r3 = r6.f22046d
            kotlin.jvm.internal.C41536l.m120486f(r3)
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r3)
            if (r2 == 0) goto L_0x0203
            r18 = r1
        L_0x0221:
            p0.j r18 = (p202p0.C7549j) r18
            if (r18 != 0) goto L_0x024f
            p0.j$a r19 = p202p0.C7549j.f22017q
            android.content.Context r0 = r6.f22043a
            p0.s r1 = r6.f22046d
            kotlin.jvm.internal.C41536l.m120486f(r1)
            p0.s r2 = r6.f22046d
            kotlin.jvm.internal.C41536l.m120486f(r2)
            android.os.Bundle r22 = r2.mo22209j(r13)
            androidx.lifecycle.j$b r23 = r30.mo22113E()
            p0.m r2 = r6.f22059q
            r25 = 0
            r26 = 0
            r27 = 96
            r28 = 0
            r20 = r0
            r21 = r1
            r24 = r2
            p0.j r18 = p202p0.C7549j.C7550a.m28694b(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
        L_0x024f:
            r0 = r18
            r10.mo95929i(r0)
        L_0x0254:
            java.util.Iterator r0 = r10.iterator()
        L_0x0258:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02a4
            java.lang.Object r1 = r0.next()
            p0.j r1 = (p202p0.C7549j) r1
            p0.d0 r2 = r6.f22065w
            p0.q r3 = r1.mo22097f()
            java.lang.String r3 = r3.mo22216z()
            p0.c0 r2 = r2.mo22061d(r3)
            java.util.Map r3 = r6.f22066x
            java.lang.Object r2 = r3.get(r2)
            if (r2 == 0) goto L_0x0280
            p0.l$b r2 = (p202p0.C7556l.C7558b) r2
            r2.mo22146k(r1)
            goto L_0x0258
        L_0x0280:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NavigatorBackStack for "
            r0.append(r1)
            java.lang.String r1 = r31.mo22216z()
            r0.append(r1)
            java.lang.String r1 = " should already be created"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        L_0x02a4:
            ie1.h r0 = r30.mo22143x()
            r0.addAll(r10)
            ie1.h r0 = r30.mo22143x()
            r0.add(r8)
            java.util.List r0 = ie1.C41358y.m120024n0(r10, r8)
            java.util.Iterator r0 = r0.iterator()
        L_0x02ba:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02dc
            java.lang.Object r1 = r0.next()
            p0.j r1 = (p202p0.C7549j) r1
            p0.q r2 = r1.mo22097f()
            p0.s r2 = r2.mo22199A()
            if (r2 == 0) goto L_0x02ba
            int r2 = r2.mo22214w()
            p0.j r2 = r6.mo22144y(r2)
            r6.m28704K(r1, r2)
            goto L_0x02ba
        L_0x02dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7556l.m28727n(p0.q, android.os.Bundle, p0.j, java.util.List):void");
    }

    /* renamed from: o */
    static /* synthetic */ void m28728o(C7556l lVar, C7589q qVar, Bundle bundle, C7549j jVar, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 8) != 0) {
                list = C41341q.m119907j();
            }
            lVar.m28727n(qVar, bundle, jVar, list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
    }

    /* renamed from: o0 */
    private final boolean m28729o0() {
        boolean z;
        Bundle bundle;
        int i = 0;
        if (!this.f22049g) {
            return false;
        }
        Activity activity = this.f22044b;
        C41536l.m120486f(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        C41536l.m120486f(extras);
        int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
        C41536l.m120486f(intArray);
        List P = C41333m.m119789P(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
        int intValue = ((Number) C41352v.m119962G(P)).intValue();
        if (parcelableArrayList != null) {
            Bundle bundle2 = (Bundle) C41352v.m119962G(parcelableArrayList);
        }
        if (P.isEmpty()) {
            return false;
        }
        C7589q v = m28734v(mo22112D(), intValue);
        if (v instanceof C7594s) {
            intValue = C7594s.f22154s.mo22236a((C7594s) v).mo22214w();
        }
        C7589q B = mo22111B();
        if (B == null || intValue != B.mo22214w()) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            return false;
        }
        C7586o r = mo22139r();
        Bundle b = C0908e.m3336b(C41233s.m119492a("android-support-nav:controller:deepLinkIntent", intent));
        Bundle bundle3 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
        if (bundle3 != null) {
            b.putAll(bundle3);
        }
        r.mo22191e(b);
        for (Object next : P) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            int intValue2 = ((Number) next).intValue();
            if (parcelableArrayList != null) {
                bundle = (Bundle) parcelableArrayList.get(i);
            } else {
                bundle = null;
            }
            r.mo22189a(intValue2, bundle);
            i = i2;
        }
        r.mo22190b().mo3149n();
        Activity activity2 = this.f22044b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    /* renamed from: p0 */
    private final boolean m28730p0() {
        C7589q B = mo22111B();
        C41536l.m120486f(B);
        int w = B.mo22214w();
        for (C7594s A = B.mo22199A(); A != null; A = A.mo22199A()) {
            if (A.mo22232R() != w) {
                Bundle bundle = new Bundle();
                Activity activity = this.f22044b;
                if (activity != null) {
                    C41536l.m120486f(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f22044b;
                        C41536l.m120486f(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f22044b;
                            C41536l.m120486f(activity3);
                            bundle.putParcelable("android-support-nav:controller:deepLinkIntent", activity3.getIntent());
                            C7594s sVar = this.f22046d;
                            C41536l.m120486f(sVar);
                            Activity activity4 = this.f22044b;
                            C41536l.m120486f(activity4);
                            Intent intent = activity4.getIntent();
                            C41536l.m120488h(intent, "activity!!.intent");
                            C7589q.C7592b C = sVar.mo22201C(new C7588p(intent));
                            if (C != null) {
                                bundle.putAll(C.mo22222b().mo22209j(C.mo22223c()));
                            }
                        }
                    }
                }
                C7586o.m28829g(new C7586o(this), A.mo22214w(), (Bundle) null, 2, (Object) null).mo22191e(bundle).mo22190b().mo3149n();
                Activity activity5 = this.f22044b;
                if (activity5 == null) {
                    return true;
                }
                activity5.finish();
                return true;
            }
            w = A.mo22214w();
        }
        return false;
    }

    /* renamed from: q */
    private final boolean m28731q(int i) {
        for (C7558b i2 : this.f22066x.values()) {
            i2.mo22078i(true);
        }
        boolean g0 = m28720g0(i, (Bundle) null, (C7602w) null, (C7530c0.C7531a) null);
        for (C7558b i3 : this.f22066x.values()) {
            i3.mo22078i(false);
        }
        if (!g0 || !m28709Z(i, true, false)) {
            return false;
        }
        return true;
    }

    /* renamed from: s */
    private final boolean m28732s() {
        while (!mo22143x().isEmpty() && (((C7549j) mo22143x().mo95918B()).mo22097f() instanceof C7594s)) {
            m28715c0(this, (C7549j) mo22143x().mo95918B(), false, (C41322h) null, 6, (Object) null);
        }
        C7549j jVar = (C7549j) mo22143x().mo95919C();
        if (jVar != null) {
            this.f22039C.add(jVar);
        }
        this.f22038B++;
        mo22140r0();
        int i = this.f22038B - 1;
        this.f22038B = i;
        if (i == 0) {
            List<C7549j> B0 = C41358y.m119991B0(this.f22039C);
            this.f22039C.clear();
            for (C7549j jVar2 : B0) {
                Iterator it = this.f22060r.iterator();
                while (it.hasNext()) {
                    ((C7560c) it.next()).mo22147a(this, jVar2.mo22097f(), jVar2.mo22095d());
                }
                this.f22041E.mo96335c(jVar2);
            }
            this.f22051i.mo96335c(mo22127d0());
        }
        if (jVar != null) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (m28701C() > 1) goto L_0x000f;
     */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m28733s0() {
        /*
            r3 = this;
            androidx.activity.h r0 = r3.f22063u
            boolean r1 = r3.f22064v
            if (r1 == 0) goto L_0x000e
            int r1 = r3.m28701C()
            r2 = 1
            if (r1 <= r2) goto L_0x000e
            goto L_0x000f
        L_0x000e:
            r2 = 0
        L_0x000f:
            r0.mo365f(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7556l.m28733s0():void");
    }

    /* renamed from: v */
    private final C7589q m28734v(C7589q qVar, int i) {
        C7594s sVar;
        if (qVar.mo22214w() == i) {
            return qVar;
        }
        if (qVar instanceof C7594s) {
            sVar = (C7594s) qVar;
        } else {
            sVar = qVar.mo22199A();
            C41536l.m120486f(sVar);
        }
        return sVar.mo22226K(i);
    }

    /* renamed from: w */
    private final String m28735w(int[] iArr) {
        C7594s sVar;
        C7594s sVar2 = this.f22046d;
        int length = iArr.length;
        int i = 0;
        while (true) {
            C7589q qVar = null;
            if (i >= length) {
                return null;
            }
            int i2 = iArr[i];
            if (i == 0) {
                C7594s sVar3 = this.f22046d;
                C41536l.m120486f(sVar3);
                if (sVar3.mo22214w() == i2) {
                    qVar = this.f22046d;
                }
            } else {
                C41536l.m120486f(sVar2);
                qVar = sVar2.mo22226K(i2);
            }
            if (qVar == null) {
                return C7589q.f22137m.mo22218b(this.f22043a, i2);
            }
            if (i != iArr.length - 1 && (qVar instanceof C7594s)) {
                while (true) {
                    sVar = (C7594s) qVar;
                    C41536l.m120486f(sVar);
                    if (!(sVar.mo22226K(sVar.mo22232R()) instanceof C7594s)) {
                        break;
                    }
                    qVar = sVar.mo22226K(sVar.mo22232R());
                }
                sVar2 = sVar;
            }
            i++;
        }
    }

    /* renamed from: A */
    public C7549j mo22110A() {
        return (C7549j) mo22143x().mo95919C();
    }

    /* renamed from: B */
    public C7589q mo22111B() {
        C7549j A = mo22110A();
        if (A != null) {
            return A.mo22097f();
        }
        return null;
    }

    /* renamed from: D */
    public C7594s mo22112D() {
        C7594s sVar = this.f22046d;
        if (sVar == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        } else if (sVar != null) {
            return sVar;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavGraph");
        }
    }

    /* renamed from: E */
    public final C1593j.C1598b mo22113E() {
        if (this.f22057o == null) {
            return C1593j.C1598b.CREATED;
        }
        return this.f22061s;
    }

    /* renamed from: F */
    public C7600v mo22114F() {
        return (C7600v) this.f22040D.getValue();
    }

    /* renamed from: G */
    public C7536d0 mo22115G() {
        return this.f22065w;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003e, code lost:
        if (r1 != false) goto L_0x0040;
     */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x006b  */
    /* renamed from: H */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo22116H(android.content.Intent r20) {
        /*
            r19 = this;
            r6 = r19
            r0 = r20
            r7 = 0
            if (r0 != 0) goto L_0x0008
            return r7
        L_0x0008:
            android.os.Bundle r1 = r20.getExtras()
            r8 = 0
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = "android-support-nav:controller:deepLinkIds"
            int[] r2 = r1.getIntArray(r2)
            goto L_0x0017
        L_0x0016:
            r2 = r8
        L_0x0017:
            if (r1 == 0) goto L_0x0020
            java.lang.String r3 = "android-support-nav:controller:deepLinkArgs"
            java.util.ArrayList r3 = r1.getParcelableArrayList(r3)
            goto L_0x0021
        L_0x0020:
            r3 = r8
        L_0x0021:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            if (r1 == 0) goto L_0x002f
            java.lang.String r5 = "android-support-nav:controller:deepLinkExtras"
            android.os.Bundle r1 = r1.getBundle(r5)
            goto L_0x0030
        L_0x002f:
            r1 = r8
        L_0x0030:
            if (r1 == 0) goto L_0x0035
            r4.putAll(r1)
        L_0x0035:
            r9 = 1
            if (r2 == 0) goto L_0x0040
            int r1 = r2.length
            if (r1 != 0) goto L_0x003d
            r1 = r9
            goto L_0x003e
        L_0x003d:
            r1 = r7
        L_0x003e:
            if (r1 == 0) goto L_0x0068
        L_0x0040:
            p0.s r1 = r6.f22046d
            kotlin.jvm.internal.C41536l.m120486f(r1)
            p0.p r5 = new p0.p
            r5.<init>(r0)
            p0.q$b r1 = r1.mo22201C(r5)
            if (r1 == 0) goto L_0x0068
            p0.q r2 = r1.mo22222b()
            int[] r3 = p202p0.C7589q.m28840n(r2, r8, r9, r8)
            android.os.Bundle r1 = r1.mo22223c()
            android.os.Bundle r1 = r2.mo22209j(r1)
            if (r1 == 0) goto L_0x0065
            r4.putAll(r1)
        L_0x0065:
            r10 = r3
            r3 = r8
            goto L_0x0069
        L_0x0068:
            r10 = r2
        L_0x0069:
            if (r10 == 0) goto L_0x01e7
            int r1 = r10.length
            if (r1 != 0) goto L_0x0070
            r1 = r9
            goto L_0x0071
        L_0x0070:
            r1 = r7
        L_0x0071:
            if (r1 == 0) goto L_0x0075
            goto L_0x01e7
        L_0x0075:
            java.lang.String r1 = r6.m28735w(r10)
            if (r1 == 0) goto L_0x009a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Could not find destination "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " in the navigation graph, ignoring the deep link from "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r1 = "NavController"
            android.util.Log.i(r1, r0)
            return r7
        L_0x009a:
            java.lang.String r1 = "android-support-nav:controller:deepLinkIntent"
            r4.putParcelable(r1, r0)
            int r1 = r10.length
            android.os.Bundle[] r11 = new android.os.Bundle[r1]
            r2 = r7
        L_0x00a3:
            if (r2 >= r1) goto L_0x00bf
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            r5.putAll(r4)
            if (r3 == 0) goto L_0x00ba
            java.lang.Object r12 = r3.get(r2)
            android.os.Bundle r12 = (android.os.Bundle) r12
            if (r12 == 0) goto L_0x00ba
            r5.putAll(r12)
        L_0x00ba:
            r11[r2] = r5
            int r2 = r2 + 1
            goto L_0x00a3
        L_0x00bf:
            int r1 = r20.getFlags()
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00ee
            r3 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r3
            if (r1 != 0) goto L_0x00ee
            r0.addFlags(r3)
            android.content.Context r1 = r6.f22043a
            androidx.core.app.i1 r1 = androidx.core.app.C0707i1.m2731j(r1)
            androidx.core.app.i1 r0 = r1.mo3143c(r0)
            java.lang.String r1 = "create(context)\n        …ntWithParentStack(intent)"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r0.mo3149n()
            android.app.Activity r0 = r6.f22044b
            if (r0 == 0) goto L_0x00ed
            r0.finish()
            r0.overridePendingTransition(r7, r7)
        L_0x00ed:
            return r9
        L_0x00ee:
            java.lang.String r12 = "Deep Linking failed: destination "
            if (r2 == 0) goto L_0x0155
            ie1.h r0 = r19.mo22143x()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x010e
            p0.s r0 = r6.f22046d
            kotlin.jvm.internal.C41536l.m120486f(r0)
            int r1 = r0.mo22214w()
            r2 = 1
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r19
            m28711a0(r0, r1, r2, r3, r4, r5)
        L_0x010e:
            int r0 = r10.length
            if (r7 >= r0) goto L_0x0154
            r0 = r10[r7]
            int r1 = r7 + 1
            r2 = r11[r7]
            p0.q r3 = r6.mo22142u(r0)
            if (r3 == 0) goto L_0x012b
            p0.l$e r0 = new p0.l$e
            r0.<init>(r3, r6)
            p0.w r0 = p202p0.C7605y.m28929a(r0)
            r6.m28705P(r3, r2, r0, r8)
            r7 = r1
            goto L_0x010e
        L_0x012b:
            p0.q$a r1 = p202p0.C7589q.f22137m
            android.content.Context r2 = r6.f22043a
            java.lang.String r0 = r1.mo22218b(r2, r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r12)
            r2.append(r0)
            java.lang.String r0 = " cannot be found from the current destination "
            r2.append(r0)
            p0.q r0 = r19.mo22111B()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L_0x0154:
            return r9
        L_0x0155:
            p0.s r0 = r6.f22046d
            int r1 = r10.length
            r2 = r7
        L_0x0159:
            if (r2 >= r1) goto L_0x01e4
            r3 = r10[r2]
            r4 = r11[r2]
            if (r2 != 0) goto L_0x0164
            p0.s r5 = r6.f22046d
            goto L_0x016b
        L_0x0164:
            kotlin.jvm.internal.C41536l.m120486f(r0)
            p0.q r5 = r0.mo22226K(r3)
        L_0x016b:
            if (r5 == 0) goto L_0x01bf
            int r3 = r10.length
            int r3 = r3 - r9
            if (r2 == r3) goto L_0x0194
            boolean r3 = r5 instanceof p202p0.C7594s
            if (r3 == 0) goto L_0x01bc
            p0.s r5 = (p202p0.C7594s) r5
        L_0x0177:
            kotlin.jvm.internal.C41536l.m120486f(r5)
            int r0 = r5.mo22232R()
            p0.q r0 = r5.mo22226K(r0)
            boolean r0 = r0 instanceof p202p0.C7594s
            if (r0 == 0) goto L_0x0192
            int r0 = r5.mo22232R()
            p0.q r0 = r5.mo22226K(r0)
            r5 = r0
            p0.s r5 = (p202p0.C7594s) r5
            goto L_0x0177
        L_0x0192:
            r0 = r5
            goto L_0x01bc
        L_0x0194:
            p0.w$a r13 = new p0.w$a
            r13.<init>()
            p0.s r3 = r6.f22046d
            kotlin.jvm.internal.C41536l.m120486f(r3)
            int r14 = r3.mo22214w()
            r15 = 1
            r16 = 0
            r17 = 4
            r18 = 0
            p0.w$a r3 = p202p0.C7602w.C7603a.m28913i(r13, r14, r15, r16, r17, r18)
            p0.w$a r3 = r3.mo22257b(r7)
            p0.w$a r3 = r3.mo22258c(r7)
            p0.w r3 = r3.mo22256a()
            r6.m28705P(r5, r4, r3, r8)
        L_0x01bc:
            int r2 = r2 + 1
            goto L_0x0159
        L_0x01bf:
            p0.q$a r1 = p202p0.C7589q.f22137m
            android.content.Context r2 = r6.f22043a
            java.lang.String r1 = r1.mo22218b(r2, r3)
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            r3.append(r1)
            java.lang.String r1 = " cannot be found in graph "
            r3.append(r1)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01e4:
            r6.f22049g = r9
            return r9
        L_0x01e7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7556l.mo22116H(android.content.Intent):boolean");
    }

    /* renamed from: L */
    public void mo22117L(int i) {
        mo22118M(i, (Bundle) null);
    }

    /* renamed from: M */
    public void mo22118M(int i, Bundle bundle) {
        mo22119N(i, bundle, (C7602w) null);
    }

    /* renamed from: N */
    public void mo22119N(int i, Bundle bundle, C7602w wVar) {
        mo22120O(i, bundle, wVar, (C7530c0.C7531a) null);
    }

    /* renamed from: O */
    public void mo22120O(int i, Bundle bundle, C7602w wVar, C7530c0.C7531a aVar) {
        C7589q qVar;
        int i2;
        boolean z;
        if (mo22143x().isEmpty()) {
            qVar = this.f22046d;
        } else {
            qVar = ((C7549j) mo22143x().mo95918B()).mo22097f();
        }
        if (qVar != null) {
            C7538e o = qVar.mo22211o(i);
            Bundle bundle2 = null;
            if (o != null) {
                if (wVar == null) {
                    wVar = o.mo22067c();
                }
                i2 = o.mo22066b();
                Bundle a = o.mo22065a();
                if (a != null) {
                    bundle2 = new Bundle();
                    bundle2.putAll(a);
                }
            } else {
                i2 = i;
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (i2 != 0 || wVar == null || wVar.mo22249e() == -1) {
                boolean z2 = true;
                if (i2 != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    C7589q u = mo22142u(i2);
                    if (u == null) {
                        C7589q.C7590a aVar2 = C7589q.f22137m;
                        String b = aVar2.mo22218b(this.f22043a, i2);
                        if (o != null) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalArgumentException(("Navigation destination " + b + " referenced from action " + aVar2.mo22218b(this.f22043a, i) + " cannot be found from the current destination " + qVar).toString());
                        }
                        throw new IllegalArgumentException("Navigation action/destination " + b + " cannot be found from the current destination " + qVar);
                    }
                    m28705P(u, bundle2, wVar, aVar);
                    return;
                }
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
            mo22124V(wVar.mo22249e(), wVar.mo22251f());
            return;
        }
        throw new IllegalStateException("no current navigation node");
    }

    /* renamed from: Q */
    public void mo22121Q(C7593r rVar) {
        C41536l.m120489i(rVar, "directions");
        mo22119N(rVar.mo22014a(), rVar.mo22015b(), (C7602w) null);
    }

    /* renamed from: S */
    public boolean mo22122S() {
        Bundle bundle;
        Intent intent;
        if (m28701C() != 1) {
            return mo22123U();
        }
        Activity activity = this.f22044b;
        int[] iArr = null;
        if (activity == null || (intent = activity.getIntent()) == null) {
            bundle = null;
        } else {
            bundle = intent.getExtras();
        }
        if (bundle != null) {
            iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
        }
        if (iArr != null) {
            return m28729o0();
        }
        return m28730p0();
    }

    /* renamed from: U */
    public boolean mo22123U() {
        if (mo22143x().isEmpty()) {
            return false;
        }
        C7589q B = mo22111B();
        C41536l.m120486f(B);
        return mo22124V(B.mo22214w(), true);
    }

    /* renamed from: V */
    public boolean mo22124V(int i, boolean z) {
        return mo22125W(i, z, false);
    }

    /* renamed from: W */
    public boolean mo22125W(int i, boolean z, boolean z2) {
        if (!m28709Z(i, z, z2) || !m28732s()) {
            return false;
        }
        return true;
    }

    /* renamed from: X */
    public final void mo22126X(C7549j jVar, C43064a aVar) {
        C41536l.m120489i(jVar, "popUpTo");
        C41536l.m120489i(aVar, "onComplete");
        int indexOf = mo22143x().indexOf(jVar);
        if (indexOf < 0) {
            Log.i("NavController", "Ignoring pop of " + jVar + " as it was not found on the current back stack");
            return;
        }
        int i = indexOf + 1;
        if (i != mo22143x().size()) {
            m28709Z(((C7549j) mo22143x().get(i)).mo22097f().mo22214w(), true, false);
        }
        m28715c0(this, jVar, false, (C41322h) null, 6, (Object) null);
        aVar.invoke();
        m28733s0();
        m28732s();
    }

    /* renamed from: d0 */
    public final List mo22127d0() {
        boolean z;
        boolean z2;
        ArrayList arrayList = new ArrayList();
        for (C7558b c : this.f22066x.values()) {
            ArrayList arrayList2 = new ArrayList();
            for (Object next : (Iterable) c.mo22072c().getValue()) {
                C7549j jVar = (C7549j) next;
                if (arrayList.contains(jVar) || jVar.mo22099h().mo4914b(C1593j.C1598b.STARTED)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (z2) {
                    arrayList2.add(next);
                }
            }
            boolean unused = C41352v.m119965z(arrayList, arrayList2);
        }
        C41322h x = mo22143x();
        ArrayList arrayList3 = new ArrayList();
        for (Object next2 : x) {
            C7549j jVar2 = (C7549j) next2;
            if (arrayList.contains(jVar2) || !jVar2.mo22099h().mo4914b(C1593j.C1598b.STARTED)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList3.add(next2);
            }
        }
        boolean unused2 = C41352v.m119965z(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object next3 : arrayList) {
            if (!(((C7549j) next3).mo22097f() instanceof C7594s)) {
                arrayList4.add(next3);
            }
        }
        return arrayList4;
    }

    /* renamed from: e0 */
    public void mo22128e0(C7560c cVar) {
        C41536l.m120489i(cVar, "listener");
        this.f22060r.remove(cVar);
    }

    /* renamed from: f0 */
    public void mo22129f0(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(this.f22043a.getClassLoader());
            this.f22047e = bundle.getBundle("android-support-nav:controller:navigatorState");
            this.f22048f = bundle.getParcelableArray("android-support-nav:controller:backStack");
            this.f22056n.clear();
            int[] intArray = bundle.getIntArray("android-support-nav:controller:backStackDestIds");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("android-support-nav:controller:backStackIds");
            if (!(intArray == null || stringArrayList == null)) {
                int length = intArray.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    this.f22055m.put(Integer.valueOf(intArray[i]), stringArrayList.get(i2));
                    i++;
                    i2++;
                }
            }
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("android-support-nav:controller:backStackStates");
            if (stringArrayList2 != null) {
                for (String str : stringArrayList2) {
                    Parcelable[] parcelableArray = bundle.getParcelableArray("android-support-nav:controller:backStackStates:" + str);
                    if (parcelableArray != null) {
                        Map map = this.f22056n;
                        C41536l.m120488h(str, "id");
                        C41322h hVar = new C41322h(parcelableArray.length);
                        Iterator a = C41523c.m120452a(parcelableArray);
                        while (a.hasNext()) {
                            Parcelable parcelable = (Parcelable) a.next();
                            if (parcelable != null) {
                                hVar.add((NavBackStackEntryState) parcelable);
                            } else {
                                throw new NullPointerException("null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                            }
                        }
                        map.put(str, hVar);
                    }
                }
            }
            this.f22049g = bundle.getBoolean("android-support-nav:controller:deepLinkHandled");
        }
    }

    /* renamed from: h0 */
    public Bundle mo22130h0() {
        Bundle bundle;
        ArrayList arrayList = new ArrayList();
        Bundle bundle2 = new Bundle();
        for (Map.Entry entry : this.f22065w.mo22062e().entrySet()) {
            String str = (String) entry.getKey();
            Bundle i = ((C7530c0) entry.getValue()).mo22054i();
            if (i != null) {
                arrayList.add(str);
                bundle2.putBundle(str, i);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList("android-support-nav:controller:navigatorState:names", arrayList);
            bundle.putBundle("android-support-nav:controller:navigatorState", bundle2);
        } else {
            bundle = null;
        }
        if (!mo22143x().isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[mo22143x().size()];
            Iterator it = mo22143x().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                parcelableArr[i2] = new NavBackStackEntryState((C7549j) it.next());
                i2++;
            }
            bundle.putParcelableArray("android-support-nav:controller:backStack", parcelableArr);
        }
        if (!this.f22055m.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f22055m.size()];
            ArrayList arrayList2 = new ArrayList();
            int i3 = 0;
            for (Map.Entry entry2 : this.f22055m.entrySet()) {
                iArr[i3] = ((Number) entry2.getKey()).intValue();
                arrayList2.add((String) entry2.getValue());
                i3++;
            }
            bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
            bundle.putStringArrayList("android-support-nav:controller:backStackIds", arrayList2);
        }
        if (!this.f22056n.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList arrayList3 = new ArrayList();
            for (Map.Entry entry3 : this.f22056n.entrySet()) {
                String str2 = (String) entry3.getKey();
                C41322h hVar = (C41322h) entry3.getValue();
                arrayList3.add(str2);
                Parcelable[] parcelableArr2 = new Parcelable[hVar.size()];
                int i4 = 0;
                for (Object next : hVar) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        C41341q.m119917t();
                    }
                    parcelableArr2[i4] = (NavBackStackEntryState) next;
                    i4 = i5;
                }
                bundle.putParcelableArray("android-support-nav:controller:backStackStates:" + str2, parcelableArr2);
            }
            bundle.putStringArrayList("android-support-nav:controller:backStackStates", arrayList3);
        }
        if (this.f22049g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean("android-support-nav:controller:deepLinkHandled", this.f22049g);
        }
        return bundle;
    }

    /* renamed from: i0 */
    public void mo22131i0(int i) {
        mo22133k0(mo22114F().mo22243b(i), (Bundle) null);
    }

    /* renamed from: j0 */
    public void mo22132j0(int i, Bundle bundle) {
        mo22133k0(mo22114F().mo22243b(i), bundle);
    }

    /* renamed from: k0 */
    public void mo22133k0(C7594s sVar, Bundle bundle) {
        boolean z;
        C41536l.m120489i(sVar, "graph");
        if (!C41536l.m120484d(this.f22046d, sVar)) {
            C7594s sVar2 = this.f22046d;
            if (sVar2 != null) {
                for (Integer num : new ArrayList(this.f22055m.keySet())) {
                    C41536l.m120488h(num, "id");
                    m28731q(num.intValue());
                }
                m28711a0(this, sVar2.mo22214w(), true, false, 4, (Object) null);
            }
            this.f22046d = sVar;
            m28707T(bundle);
            return;
        }
        int size = sVar.mo22230O().size();
        for (int i = 0; i < size; i++) {
            C7589q qVar = (C7589q) sVar.mo22230O().valueAt(i);
            C7594s sVar3 = this.f22046d;
            C41536l.m120486f(sVar3);
            sVar3.mo22230O().replace(i, qVar);
            C41322h x = mo22143x();
            ArrayList<C7549j> arrayList = new ArrayList<>();
            for (Object next : x) {
                C7549j jVar = (C7549j) next;
                if (qVar == null || jVar.mo22097f().mo22214w() != qVar.mo22214w()) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            for (C7549j k : arrayList) {
                C41536l.m120488h(qVar, "newDestination");
                k.mo22103k(qVar);
            }
        }
    }

    /* renamed from: l0 */
    public void mo22134l0(C1619q qVar) {
        C1593j lifecycle;
        C41536l.m120489i(qVar, "owner");
        if (!C41536l.m120484d(qVar, this.f22057o)) {
            C1619q qVar2 = this.f22057o;
            if (!(qVar2 == null || (lifecycle = qVar2.getLifecycle()) == null)) {
                lifecycle.mo4909d(this.f22062t);
            }
            this.f22057o = qVar;
            qVar.getLifecycle().mo4906a(this.f22062t);
        }
    }

    /* renamed from: m0 */
    public void mo22135m0(OnBackPressedDispatcher onBackPressedDispatcher) {
        C41536l.m120489i(onBackPressedDispatcher, "dispatcher");
        if (!C41536l.m120484d(onBackPressedDispatcher, this.f22058p)) {
            C1619q qVar = this.f22057o;
            if (qVar != null) {
                this.f22063u.mo363d();
                this.f22058p = onBackPressedDispatcher;
                onBackPressedDispatcher.mo342c(qVar, this.f22063u);
                C1593j lifecycle = qVar.getLifecycle();
                lifecycle.mo4909d(this.f22062t);
                lifecycle.mo4906a(this.f22062t);
                return;
            }
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
    }

    /* renamed from: n0 */
    public void mo22136n0(C1636t0 t0Var) {
        C41536l.m120489i(t0Var, "viewModelStore");
        C7575m mVar = this.f22059q;
        C7575m.C7577b bVar = C7575m.f22100e;
        if (!C41536l.m120484d(mVar, bVar.mo22163a(t0Var))) {
            if (mo22143x().isEmpty()) {
                this.f22059q = bVar.mo22163a(t0Var);
                return;
            }
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
    }

    /* renamed from: p */
    public void mo22137p(C7560c cVar) {
        C41536l.m120489i(cVar, "listener");
        this.f22060r.add(cVar);
        if (!mo22143x().isEmpty()) {
            C7549j jVar = (C7549j) mo22143x().mo95918B();
            cVar.mo22147a(this, jVar.mo22097f(), jVar.mo22095d());
        }
    }

    /* renamed from: q0 */
    public final C7549j mo22138q0(C7549j jVar) {
        C41536l.m120489i(jVar, "child");
        C7549j jVar2 = (C7549j) this.f22053k.remove(jVar);
        Integer num = null;
        if (jVar2 == null) {
            return null;
        }
        AtomicInteger atomicInteger = (AtomicInteger) this.f22054l.get(jVar2);
        if (atomicInteger != null) {
            num = Integer.valueOf(atomicInteger.decrementAndGet());
        }
        if (num != null && num.intValue() == 0) {
            C7558b bVar = (C7558b) this.f22066x.get(this.f22065w.mo22061d(jVar2.mo22097f().mo22216z()));
            if (bVar != null) {
                bVar.mo22074e(jVar2);
            }
            this.f22054l.remove(jVar2);
        }
        return jVar2;
    }

    /* renamed from: r */
    public C7586o mo22139r() {
        return new C7586o(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0101  */
    /* renamed from: r0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22140r0() {
        /*
            r11 = this;
            ie1.h r0 = r11.mo22143x()
            java.util.List r0 = ie1.C41358y.m119991B0(r0)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x000f
            return
        L_0x000f:
            java.lang.Object r1 = ie1.C41358y.m120019i0(r0)
            p0.j r1 = (p202p0.C7549j) r1
            p0.q r1 = r1.mo22097f()
            boolean r2 = r1 instanceof p202p0.C7535d
            r3 = 0
            if (r2 == 0) goto L_0x003f
            java.util.List r2 = ie1.C41358y.m120025o0(r0)
            java.util.Iterator r2 = r2.iterator()
        L_0x0026:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x003f
            java.lang.Object r4 = r2.next()
            p0.j r4 = (p202p0.C7549j) r4
            p0.q r4 = r4.mo22097f()
            boolean r5 = r4 instanceof p202p0.C7594s
            if (r5 != 0) goto L_0x0026
            boolean r5 = r4 instanceof p202p0.C7535d
            if (r5 != 0) goto L_0x0026
            goto L_0x0040
        L_0x003f:
            r4 = r3
        L_0x0040:
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.List r5 = ie1.C41358y.m120025o0(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x004d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x00f7
            java.lang.Object r6 = r5.next()
            p0.j r6 = (p202p0.C7549j) r6
            androidx.lifecycle.j$b r7 = r6.mo22099h()
            p0.q r8 = r6.mo22097f()
            if (r1 == 0) goto L_0x00cd
            int r9 = r8.mo22214w()
            int r10 = r1.mo22214w()
            if (r9 != r10) goto L_0x00cd
            androidx.lifecycle.j$b r8 = androidx.lifecycle.C1593j.C1598b.RESUMED
            if (r7 == r8) goto L_0x00c8
            p0.d0 r7 = r11.mo22115G()
            p0.q r9 = r6.mo22097f()
            java.lang.String r9 = r9.mo22216z()
            p0.c0 r7 = r7.mo22061d(r9)
            java.util.Map r9 = r11.f22066x
            java.lang.Object r7 = r9.get(r7)
            p0.l$b r7 = (p202p0.C7556l.C7558b) r7
            if (r7 == 0) goto L_0x00a2
            kotlinx.coroutines.flow.r r7 = r7.mo22072c()
            if (r7 == 0) goto L_0x00a2
            java.lang.Object r7 = r7.getValue()
            java.util.Set r7 = (java.util.Set) r7
            if (r7 == 0) goto L_0x00a2
            boolean r7 = r7.contains(r6)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            goto L_0x00a3
        L_0x00a2:
            r7 = r3
        L_0x00a3:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            boolean r7 = kotlin.jvm.internal.C41536l.m120484d(r7, r9)
            if (r7 != 0) goto L_0x00c3
            java.util.Map r7 = r11.f22054l
            java.lang.Object r7 = r7.get(r6)
            java.util.concurrent.atomic.AtomicInteger r7 = (java.util.concurrent.atomic.AtomicInteger) r7
            r9 = 0
            if (r7 == 0) goto L_0x00bd
            int r7 = r7.get()
            if (r7 != 0) goto L_0x00bd
            r9 = 1
        L_0x00bd:
            if (r9 != 0) goto L_0x00c3
            r2.put(r6, r8)
            goto L_0x00c8
        L_0x00c3:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C1593j.C1598b.STARTED
            r2.put(r6, r7)
        L_0x00c8:
            p0.s r1 = r1.mo22199A()
            goto L_0x004d
        L_0x00cd:
            if (r4 == 0) goto L_0x00f0
            int r8 = r8.mo22214w()
            int r9 = r4.mo22214w()
            if (r8 != r9) goto L_0x00f0
            androidx.lifecycle.j$b r8 = androidx.lifecycle.C1593j.C1598b.RESUMED
            if (r7 != r8) goto L_0x00e3
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C1593j.C1598b.STARTED
            r6.mo22104l(r7)
            goto L_0x00ea
        L_0x00e3:
            androidx.lifecycle.j$b r8 = androidx.lifecycle.C1593j.C1598b.STARTED
            if (r7 == r8) goto L_0x00ea
            r2.put(r6, r8)
        L_0x00ea:
            p0.s r4 = r4.mo22199A()
            goto L_0x004d
        L_0x00f0:
            androidx.lifecycle.j$b r7 = androidx.lifecycle.C1593j.C1598b.CREATED
            r6.mo22104l(r7)
            goto L_0x004d
        L_0x00f7:
            java.util.Iterator r0 = r0.iterator()
        L_0x00fb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0117
            java.lang.Object r1 = r0.next()
            p0.j r1 = (p202p0.C7549j) r1
            java.lang.Object r3 = r2.get(r1)
            androidx.lifecycle.j$b r3 = (androidx.lifecycle.C1593j.C1598b) r3
            if (r3 == 0) goto L_0x0113
            r1.mo22104l(r3)
            goto L_0x00fb
        L_0x0113:
            r1.mo22105m()
            goto L_0x00fb
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p202p0.C7556l.mo22140r0():void");
    }

    /* renamed from: t */
    public void mo22141t(boolean z) {
        this.f22064v = z;
        m28733s0();
    }

    /* renamed from: u */
    public final C7589q mo22142u(int i) {
        C7589q qVar;
        C7594s sVar = this.f22046d;
        if (sVar == null) {
            return null;
        }
        C41536l.m120486f(sVar);
        if (sVar.mo22214w() == i) {
            return this.f22046d;
        }
        C7549j jVar = (C7549j) mo22143x().mo95919C();
        if (jVar == null || (qVar = jVar.mo22097f()) == null) {
            qVar = this.f22046d;
            C41536l.m120486f(qVar);
        }
        return m28734v(qVar, i);
    }

    /* renamed from: x */
    public C41322h mo22143x() {
        return this.f22050h;
    }

    /* renamed from: y */
    public C7549j mo22144y(int i) {
        Object obj;
        boolean z;
        C41322h x = mo22143x();
        ListIterator listIterator = x.listIterator(x.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj = null;
                break;
            }
            obj = listIterator.previous();
            if (((C7549j) obj).mo22097f().mo22214w() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        C7549j jVar = (C7549j) obj;
        if (jVar != null) {
            return jVar;
        }
        throw new IllegalArgumentException(("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + mo22111B()).toString());
    }

    /* renamed from: z */
    public final Context mo22145z() {
        return this.f22043a;
    }
}
