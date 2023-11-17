package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1619q;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p110i.C6495b;
import p306x0.C8930b;
import p306x0.C8933d;

/* renamed from: androidx.savedstate.a */
public final class C1846a {

    /* renamed from: g */
    private static final C1848b f5523g = new C1848b((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C6495b f5524a = new C6495b();

    /* renamed from: b */
    private boolean f5525b;

    /* renamed from: c */
    private Bundle f5526c;

    /* renamed from: d */
    private boolean f5527d;

    /* renamed from: e */
    private Recreator.C1845b f5528e;

    /* renamed from: f */
    private boolean f5529f = true;

    /* renamed from: androidx.savedstate.a$a */
    public interface C1847a {
        /* renamed from: a */
        void mo4807a(C8933d dVar);
    }

    /* renamed from: androidx.savedstate.a$b */
    private static final class C1848b {
        private C1848b() {
        }

        public /* synthetic */ C1848b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.a$c */
    public interface C1849c {
        /* renamed from: a */
        Bundle mo350a();
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m7211d(C1846a aVar, C1619q qVar, C1593j.C1594a aVar2) {
        C41536l.m120489i(aVar, "this$0");
        C41536l.m120489i(qVar, "<anonymous parameter 0>");
        C41536l.m120489i(aVar2, "event");
        if (aVar2 == C1593j.C1594a.ON_START) {
            aVar.f5529f = true;
        } else if (aVar2 == C1593j.C1594a.ON_STOP) {
            aVar.f5529f = false;
        }
    }

    /* renamed from: b */
    public final Bundle mo6111b(String str) {
        Bundle bundle;
        C41536l.m120489i(str, "key");
        if (this.f5527d) {
            Bundle bundle2 = this.f5526c;
            if (bundle2 == null) {
                return null;
            }
            if (bundle2 != null) {
                bundle = bundle2.getBundle(str);
            } else {
                bundle = null;
            }
            Bundle bundle3 = this.f5526c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f5526c;
            boolean z = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z = true;
            }
            if (!z) {
                this.f5526c = null;
            }
            return bundle;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* renamed from: c */
    public final C1849c mo6112c(String str) {
        C41536l.m120489i(str, "key");
        Iterator it = this.f5524a.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            C41536l.m120488h(entry, "components");
            C1849c cVar = (C1849c) entry.getValue();
            if (C41536l.m120484d((String) entry.getKey(), str)) {
                return cVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final void mo6113e(C1593j jVar) {
        C41536l.m120489i(jVar, "lifecycle");
        if (!this.f5525b) {
            jVar.mo4906a(new C8930b(this));
            this.f5525b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    /* renamed from: f */
    public final void mo6114f(Bundle bundle) {
        Bundle bundle2;
        if (!this.f5525b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        } else if (!this.f5527d) {
            if (bundle != null) {
                bundle2 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            } else {
                bundle2 = null;
            }
            this.f5526c = bundle2;
            this.f5527d = true;
        } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
    }

    /* renamed from: g */
    public final void mo6115g(Bundle bundle) {
        C41536l.m120489i(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5526c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C6495b.C6499d i = this.f5524a.mo20421i();
        C41536l.m120488h(i, "this.components.iteratorWithAdditions()");
        while (i.hasNext()) {
            Map.Entry entry = (Map.Entry) i.next();
            bundle2.putBundle((String) entry.getKey(), ((C1849c) entry.getValue()).mo350a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    /* renamed from: h */
    public final void mo6116h(String str, C1849c cVar) {
        boolean z;
        C41536l.m120489i(str, "key");
        C41536l.m120489i(cVar, "provider");
        if (((C1849c) this.f5524a.mo20414l(str, cVar)) == null) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* renamed from: i */
    public final void mo6117i(Class cls) {
        C41536l.m120489i(cls, "clazz");
        if (this.f5529f) {
            Recreator.C1845b bVar = this.f5528e;
            if (bVar == null) {
                bVar = new Recreator.C1845b(this);
            }
            this.f5528e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.C1845b bVar2 = this.f5528e;
                if (bVar2 != null) {
                    String name = cls.getName();
                    C41536l.m120488h(name, "clazz.name");
                    bVar2.mo6110b(name);
                }
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
    }
}
