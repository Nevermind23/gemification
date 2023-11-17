package p202p0;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.C0707i1;
import ie1.C41322h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;

/* renamed from: p0.o */
public final class C7586o {

    /* renamed from: a */
    private final Context f22127a;

    /* renamed from: b */
    private final Intent f22128b;

    /* renamed from: c */
    private C7594s f22129c;

    /* renamed from: d */
    private final List f22130d;

    /* renamed from: e */
    private Bundle f22131e;

    /* renamed from: p0.o$a */
    private static final class C7587a {

        /* renamed from: a */
        private final int f22132a;

        /* renamed from: b */
        private final Bundle f22133b;

        public C7587a(int i, Bundle bundle) {
            this.f22132a = i;
            this.f22133b = bundle;
        }

        /* renamed from: a */
        public final Bundle mo22193a() {
            return this.f22133b;
        }

        /* renamed from: b */
        public final int mo22194b() {
            return this.f22132a;
        }
    }

    public C7586o(Context context) {
        Intent intent;
        C41536l.m120489i(context, "context");
        this.f22127a = context;
        if (context instanceof Activity) {
            intent = new Intent(context, context.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        intent.addFlags(268468224);
        this.f22128b = intent;
        this.f22130d = new ArrayList();
    }

    /* renamed from: c */
    private final void m28827c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        C7589q qVar = null;
        for (C7587a aVar : this.f22130d) {
            int b = aVar.mo22194b();
            Bundle a = aVar.mo22193a();
            C7589q d = m28828d(b);
            if (d != null) {
                for (int valueOf : d.mo22210l(qVar)) {
                    arrayList.add(Integer.valueOf(valueOf));
                    arrayList2.add(a);
                }
                qVar = d;
            } else {
                throw new IllegalArgumentException("Navigation destination " + C7589q.f22137m.mo22218b(this.f22127a, b) + " cannot be found in the navigation graph " + this.f22129c);
            }
        }
        this.f22128b.putExtra("android-support-nav:controller:deepLinkIds", C41358y.m120035y0(arrayList));
        this.f22128b.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
    }

    /* renamed from: d */
    private final C7589q m28828d(int i) {
        C41322h hVar = new C41322h();
        C7594s sVar = this.f22129c;
        C41536l.m120486f(sVar);
        hVar.add(sVar);
        while (!hVar.isEmpty()) {
            C7589q qVar = (C7589q) hVar.mo95920F();
            if (qVar.mo22214w() == i) {
                return qVar;
            }
            if (qVar instanceof C7594s) {
                Iterator it = ((C7594s) qVar).iterator();
                while (it.hasNext()) {
                    hVar.add((C7589q) it.next());
                }
            }
        }
        return null;
    }

    /* renamed from: g */
    public static /* synthetic */ C7586o m28829g(C7586o oVar, int i, Bundle bundle, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            bundle = null;
        }
        return oVar.mo22192f(i, bundle);
    }

    /* renamed from: h */
    private final void m28830h() {
        for (C7587a b : this.f22130d) {
            int b2 = b.mo22194b();
            if (m28828d(b2) == null) {
                String b3 = C7589q.f22137m.mo22218b(this.f22127a, b2);
                throw new IllegalArgumentException("Navigation destination " + b3 + " cannot be found in the navigation graph " + this.f22129c);
            }
        }
    }

    /* renamed from: a */
    public final C7586o mo22189a(int i, Bundle bundle) {
        this.f22130d.add(new C7587a(i, bundle));
        if (this.f22129c != null) {
            m28830h();
        }
        return this;
    }

    /* renamed from: b */
    public final C0707i1 mo22190b() {
        if (this.f22129c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        } else if (!this.f22130d.isEmpty()) {
            m28827c();
            C0707i1 c = C0707i1.m2731j(this.f22127a).mo3143c(new Intent(this.f22128b));
            C41536l.m120488h(c, "create(context)\n        …rentStack(Intent(intent))");
            int l = c.mo3148l();
            for (int i = 0; i < l; i++) {
                Intent k = c.mo3147k(i);
                if (k != null) {
                    k.putExtra("android-support-nav:controller:deepLinkIntent", this.f22128b);
                }
            }
            return c;
        } else {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
    }

    /* renamed from: e */
    public final C7586o mo22191e(Bundle bundle) {
        this.f22131e = bundle;
        this.f22128b.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    /* renamed from: f */
    public final C7586o mo22192f(int i, Bundle bundle) {
        this.f22130d.clear();
        this.f22130d.add(new C7587a(i, bundle));
        if (this.f22129c != null) {
            m28830h();
        }
        return this;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C7586o(C7556l lVar) {
        this(lVar.mo22145z());
        C41536l.m120489i(lVar, "navController");
        this.f22129c = lVar.mo22112D();
    }
}
