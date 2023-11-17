package p228r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7530c0;
import p202p0.C7549j;
import p202p0.C7589q;
import p202p0.C7602w;

@C7530c0.C7532b("fragment")
/* renamed from: r0.e */
public class C8035e extends C7530c0 {

    /* renamed from: g */
    private static final C8036a f23175g = new C8036a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final Context f23176c;

    /* renamed from: d */
    private final FragmentManager f23177d;

    /* renamed from: e */
    private final int f23178e;

    /* renamed from: f */
    private final Set f23179f = new LinkedHashSet();

    /* renamed from: r0.e$a */
    private static final class C8036a {
        private C8036a() {
        }

        public /* synthetic */ C8036a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r0.e$b */
    public static class C8037b extends C7589q {

        /* renamed from: o */
        private String f23180o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8037b(C7530c0 c0Var) {
            super(c0Var);
            C41536l.m120489i(c0Var, "fragmentNavigator");
        }

        /* renamed from: D */
        public void mo22025D(Context context, AttributeSet attributeSet) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(attributeSet, "attrs");
            super.mo22025D(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C8039g.f23183c);
            C41536l.m120488h(obtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = obtainAttributes.getString(C8039g.f23184d);
            if (string != null) {
                mo23208K(string);
            }
            C41238w wVar = C41238w.f97225a;
            obtainAttributes.recycle();
        }

        /* renamed from: J */
        public final String mo23207J() {
            String str = this.f23180o;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set".toString());
            } else if (str != null) {
                return str;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        /* renamed from: K */
        public final C8037b mo23208K(String str) {
            C41536l.m120489i(str, "className");
            this.f23180o = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C8037b) || !super.equals(obj) || !C41536l.m120484d(this.f23180o, ((C8037b) obj).f23180o)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            String str = this.f23180o;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.f23180o;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            String sb2 = sb.toString();
            C41536l.m120488h(sb2, "sb.toString()");
            return sb2;
        }
    }

    public C8035e(Context context, FragmentManager fragmentManager, int i) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(fragmentManager, "fragmentManager");
        this.f23176c = context;
        this.f23177d = fragmentManager;
        this.f23178e = i;
    }

    /* renamed from: m */
    private final C1493e0 m30523m(C7549j jVar, C7602w wVar) {
        int i;
        int i2;
        int i3;
        int i4;
        Bundle d = jVar.mo22095d();
        String J = ((C8037b) jVar.mo22097f()).mo23207J();
        int i5 = 0;
        if (J.charAt(0) == '.') {
            J = this.f23176c.getPackageName() + J;
        }
        Fragment a = this.f23177d.mo4441w0().mo4458a(this.f23176c.getClassLoader(), J);
        C41536l.m120488h(a, "fragmentManager.fragment…t.classLoader, className)");
        a.setArguments(d);
        C1493e0 p = this.f23177d.mo4428p();
        C41536l.m120488h(p, "fragmentManager.beginTransaction()");
        if (wVar != null) {
            i = wVar.mo22245a();
        } else {
            i = -1;
        }
        if (wVar != null) {
            i2 = wVar.mo22246b();
        } else {
            i2 = -1;
        }
        if (wVar != null) {
            i3 = wVar.mo22247c();
        } else {
            i3 = -1;
        }
        if (wVar != null) {
            i4 = wVar.mo22248d();
        } else {
            i4 = -1;
        }
        if (!(i == -1 && i2 == -1 && i3 == -1 && i4 == -1)) {
            if (i == -1) {
                i = 0;
            }
            if (i2 == -1) {
                i2 = 0;
            }
            if (i3 == -1) {
                i3 = 0;
            }
            if (i4 != -1) {
                i5 = i4;
            }
            p.mo4642u(i, i2, i3, i5);
        }
        p.mo4639r(this.f23178e, a);
        p.mo4525w(a);
        p.mo4643x(true);
        return p;
    }

    /* renamed from: n */
    private final void m30524n(C7549j jVar, C7602w wVar, C7530c0.C7531a aVar) {
        boolean z;
        boolean isEmpty = ((List) mo22048b().mo22071b().getValue()).isEmpty();
        if (wVar == null || isEmpty || !wVar.mo22255i() || !this.f23179f.remove(jVar.mo22098g())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.f23177d.mo4435t1(jVar.mo22098g());
            mo22048b().mo22077h(jVar);
            return;
        }
        C1493e0 m = m30523m(jVar, wVar);
        if (!isEmpty) {
            m.mo4636g(jVar.mo22098g());
        }
        m.mo4515i();
        mo22048b().mo22077h(jVar);
    }

    /* renamed from: e */
    public void mo22050e(List list, C7602w wVar, C7530c0.C7531a aVar) {
        C41536l.m120489i(list, "entries");
        if (this.f23177d.mo4394T0()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m30524n((C7549j) it.next(), wVar, aVar);
        }
    }

    /* renamed from: g */
    public void mo22052g(C7549j jVar) {
        C41536l.m120489i(jVar, "backStackEntry");
        if (this.f23177d.mo4394T0()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        C1493e0 m = m30523m(jVar, (C7602w) null);
        if (((List) mo22048b().mo22071b().getValue()).size() > 1) {
            this.f23177d.mo4413i1(jVar.mo22098g(), 1);
            m.mo4636g(jVar.mo22098g());
        }
        m.mo4515i();
        mo22048b().mo22075f(jVar);
    }

    /* renamed from: h */
    public void mo22053h(Bundle bundle) {
        C41536l.m120489i(bundle, "savedState");
        ArrayList<String> stringArrayList = bundle.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if (stringArrayList != null) {
            this.f23179f.clear();
            boolean unused = C41352v.m119965z(this.f23179f, stringArrayList);
        }
    }

    /* renamed from: i */
    public Bundle mo22054i() {
        if (this.f23179f.isEmpty()) {
            return null;
        }
        return C0908e.m3336b(C41233s.m119492a("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f23179f)));
    }

    /* renamed from: j */
    public void mo22055j(C7549j jVar, boolean z) {
        C41536l.m120489i(jVar, "popUpTo");
        if (this.f23177d.mo4394T0()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        if (z) {
            List list = (List) mo22048b().mo22071b().getValue();
            C7549j jVar2 = (C7549j) C41358y.m120007W(list);
            for (C7549j jVar3 : C41358y.m120025o0(list.subList(list.indexOf(jVar), list.size()))) {
                if (C41536l.m120484d(jVar3, jVar2)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + jVar3);
                } else {
                    this.f23177d.mo4447y1(jVar3.mo22098g());
                    this.f23179f.add(jVar3.mo22098g());
                }
            }
        } else {
            this.f23177d.mo4413i1(jVar.mo22098g(), 1);
        }
        mo22048b().mo22076g(jVar, z);
    }

    /* renamed from: l */
    public C8037b mo22020a() {
        return new C8037b(this);
    }
}
