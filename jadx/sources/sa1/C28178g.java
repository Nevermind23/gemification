package sa1;

import android.content.Context;
import ba1.C10219x;
import com.google.gson.C5611k;
import com.google.gson.Gson;
import ed1.C40734b;
import ed1.C40735b0;
import ed1.C40762x;
import he1.C41238w;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p316xa.C8982a;
import p341ge.bog.sso_client.database.SsoDatabase;
import p341ge.bog.sso_client.models.C35934b;
import ta1.C28351c;

/* renamed from: sa1.g */
public final class C28178g implements C28172a {

    /* renamed from: d */
    public static final C28179a f71526d = new C28179a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final Context f71527a;

    /* renamed from: b */
    private final SsoDatabase f71528b;

    /* renamed from: c */
    private List f71529c = C41341q.m119907j();

    /* renamed from: sa1.g$a */
    public static final class C28179a {
        private C28179a() {
        }

        public /* synthetic */ C28179a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: sa1.g$b */
    public static final class C28180b extends C8982a<List<? extends C35934b>> {
        C28180b() {
        }
    }

    public C28178g(Context context, SsoDatabase ssoDatabase) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(ssoDatabase, "database");
        this.f71527a = context;
        this.f71528b = ssoDatabase;
    }

    /* renamed from: i */
    private final C40762x m86626i() {
        C40762x v = C40762x.m118160v(new C28177f(this));
        C41536l.m120488h(v, "fromCallable {\n         …gs>>() {}.type)\n        }");
        return v;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final List m86627j(C28178g gVar) {
        C41536l.m120489i(gVar, "this$0");
        InputStream openRawResource = gVar.f71527a.getResources().openRawResource(C10219x.settings);
        C41536l.m120488h(openRawResource, "context.resources.openRawResource(R.raw.settings)");
        return (List) new Gson().mo18166h(C5611k.m22280b(new InputStreamReader(openRawResource, "UTF-8")), new C28180b().getType());
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final C41238w m86628k(C28178g gVar, List list) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(list, "$settings");
        gVar.f71528b.mo63107H().mo67982d(gVar.m86630m(list));
        return C41238w.f97225a;
    }

    /* renamed from: l */
    private final List m86629l(List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C28351c cVar = (C28351c) it.next();
            arrayList.add(new C35934b(cVar.mo67987a(), cVar.mo67988b()));
        }
        return arrayList;
    }

    /* renamed from: m */
    private final List m86630m(List list) {
        boolean z;
        ArrayList<C35934b> arrayList = new ArrayList<>();
        for (Object next : list) {
            if (((C35934b) next).mo88463a() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C35934b bVar : arrayList) {
            String a = bVar.mo88463a();
            C41536l.m120486f(a);
            arrayList2.add(new C28351c(a, bVar.mo88464b()));
        }
        return arrayList2;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final C40735b0 m86631n(C28178g gVar, List list) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(list, "it");
        if (list.isEmpty()) {
            return gVar.m86626i();
        }
        C40762x z = C40762x.m118162z(gVar.m86629l(list));
        C41536l.m120488h(z, "just(it.toAppSettings())");
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final C40735b0 m86632o(C28178g gVar, Throwable th) {
        C41536l.m120489i(gVar, "this$0");
        C41536l.m120489i(th, "it");
        return gVar.m86626i();
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m86633p(C28178g gVar, List list) {
        C41536l.m120489i(gVar, "this$0");
        synchronized (gVar) {
            C41536l.m120488h(list, "it");
            gVar.f71529c = list;
            C41238w wVar = C41238w.f97225a;
        }
    }

    /* renamed from: a */
    public synchronized C35934b mo67676a(String str) {
        Object obj;
        C41536l.m120489i(str, "key");
        Iterator it = this.f71529c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((C35934b) obj).mo88463a(), str)) {
                break;
            }
        }
        return (C35934b) obj;
    }

    /* renamed from: b */
    public C40734b mo67677b() {
        C40734b y = this.f71528b.mo63107H().mo67980b().mo95087r(new C28173b(this)).mo95064C(new C28174c(this)).mo95084m(new C28175d(this)).mo95092y();
        C41536l.m120488h(y, "database.appSettingsDao(…         .ignoreElement()");
        return y;
    }

    /* renamed from: c */
    public synchronized C40734b mo67678c(List list) {
        C41536l.m120489i(list, "settings");
        if (list.isEmpty()) {
            C40734b i = C40734b.m117918i();
            C41536l.m120488h(i, "complete()");
            return i;
        }
        this.f71529c = list;
        C40734b u = C40734b.m117925u(new C28176e(this, list));
        C41536l.m120488h(u, "fromCallable {\n         …ttingsEntity())\n        }");
        return u;
    }
}
