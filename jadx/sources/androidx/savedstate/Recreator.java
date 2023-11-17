package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import androidx.savedstate.C1846a;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p306x0.C8933d;

public final class Recreator implements C1606m {

    /* renamed from: e */
    public static final C1844a f5520e = new C1844a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C8933d f5521d;

    /* renamed from: androidx.savedstate.Recreator$a */
    public static final class C1844a {
        private C1844a() {
        }

        public /* synthetic */ C1844a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: androidx.savedstate.Recreator$b */
    public static final class C1845b implements C1846a.C1849c {

        /* renamed from: a */
        private final Set f5522a = new LinkedHashSet();

        public C1845b(C1846a aVar) {
            C41536l.m120489i(aVar, "registry");
            aVar.mo6116h("androidx.savedstate.Restarter", this);
        }

        /* renamed from: a */
        public Bundle mo350a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList(this.f5522a));
            return bundle;
        }

        /* renamed from: b */
        public final void mo6110b(String str) {
            C41536l.m120489i(str, "className");
            this.f5522a.add(str);
        }
    }

    public Recreator(C8933d dVar) {
        C41536l.m120489i(dVar, "owner");
        this.f5521d = dVar;
    }

    /* renamed from: c */
    private final void m7206c(String str) {
        try {
            Class<? extends U> asSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(C1846a.C1847a.class);
            C41536l.m120488h(asSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor<? extends U> declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object newInstance = declaredConstructor.newInstance(new Object[0]);
                    C41536l.m120488h(newInstance, "{\n                constr…wInstance()\n            }");
                    ((C1846a.C1847a) newInstance).mo4807a(this.f5521d);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    /* renamed from: b */
    public void mo336b(C1619q qVar, C1593j.C1594a aVar) {
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        if (aVar == C1593j.C1594a.ON_CREATE) {
            qVar.getLifecycle().mo4909d(this);
            Bundle b = this.f5521d.getSavedStateRegistry().mo6111b("androidx.savedstate.Restarter");
            if (b != null) {
                ArrayList<String> stringArrayList = b.getStringArrayList("classes_to_restore");
                if (stringArrayList != null) {
                    for (String c : stringArrayList) {
                        m7206c(c);
                    }
                    return;
                }
                throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
