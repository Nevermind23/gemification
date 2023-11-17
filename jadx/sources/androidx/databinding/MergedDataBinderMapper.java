package androidx.databinding;

import android.util.Log;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public class MergedDataBinderMapper extends C1358e {

    /* renamed from: a */
    private Set f3881a = new HashSet();

    /* renamed from: b */
    private List f3882b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private List f3883c = new CopyOnWriteArrayList();

    /* renamed from: e */
    private boolean m4634e() {
        boolean z = false;
        for (String str : this.f3883c) {
            try {
                Class<?> cls = Class.forName(str);
                if (C1358e.class.isAssignableFrom(cls)) {
                    mo3890d((C1358e) cls.newInstance());
                    this.f3883c.remove(str);
                    z = true;
                }
            } catch (ClassNotFoundException unused) {
            } catch (IllegalAccessException e) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e);
            } catch (InstantiationException e2) {
                Log.e("MergedDataBinderMapper", "unable to add feature mapper for " + str, e2);
            }
        }
        return z;
    }

    /* renamed from: b */
    public ViewDataBinding mo3888b(C1359f fVar, View view, int i) {
        for (C1358e b : this.f3882b) {
            ViewDataBinding b2 = b.mo3888b(fVar, view, i);
            if (b2 != null) {
                return b2;
            }
        }
        if (m4634e()) {
            return mo3888b(fVar, view, i);
        }
        return null;
    }

    /* renamed from: c */
    public ViewDataBinding mo3889c(C1359f fVar, View[] viewArr, int i) {
        for (C1358e c : this.f3882b) {
            ViewDataBinding c2 = c.mo3889c(fVar, viewArr, i);
            if (c2 != null) {
                return c2;
            }
        }
        if (m4634e()) {
            return mo3889c(fVar, viewArr, i);
        }
        return null;
    }

    /* renamed from: d */
    public void mo3890d(C1358e eVar) {
        if (this.f3881a.add(eVar.getClass())) {
            this.f3882b.add(eVar);
            for (C1358e d : eVar.mo3957a()) {
                mo3890d(d);
            }
        }
    }
}
