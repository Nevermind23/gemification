package p203p1;

import android.os.Build;
import androidx.work.C1949a;
import androidx.work.C1954c;
import androidx.work.C1959e;
import androidx.work.C2085q;
import androidx.work.C2093w;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p190o1.C7399v;

/* renamed from: p1.e */
public abstract class C7638e {
    /* renamed from: a */
    public static final C7399v m29069a(C7399v vVar) {
        C7399v vVar2 = vVar;
        C41536l.m120489i(vVar2, "workSpec");
        C1954c cVar = vVar2.f21639j;
        String str = vVar2.f21632c;
        Class<ConstraintTrackingWorker> cls = ConstraintTrackingWorker.class;
        if (C41536l.m120484d(str, cls.getName())) {
            return vVar2;
        }
        if (!cVar.mo6715f() && !cVar.mo6719i()) {
            return vVar2;
        }
        C1959e a = new C1959e.C1960a().mo6735c(vVar2.f21634e).mo6738f("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str).mo6733a();
        C41536l.m120488h(a, "Builder().putAll(workSpe…ame)\n            .build()");
        String name = cls.getName();
        String str2 = name;
        C41536l.m120488h(name, "name");
        return C7399v.m28151e(vVar, (String) null, (C2093w) null, str2, (String) null, a, (C1959e) null, 0, 0, 0, (C1954c) null, 0, (C1949a) null, 0, 0, 0, 0, false, (C2085q) null, 0, 0, 1048555, (Object) null);
    }

    /* renamed from: b */
    public static final C7399v m29070b(List list, C7399v vVar) {
        boolean z;
        C41536l.m120489i(list, "schedulers");
        C41536l.m120489i(vVar, "workSpec");
        if (Build.VERSION.SDK_INT < 26) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return m29069a(vVar);
        }
        return vVar;
    }
}
