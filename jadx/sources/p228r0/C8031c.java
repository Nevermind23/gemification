package p228r0;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.fragment.app.C1483c;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1606m;
import androidx.lifecycle.C1619q;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.jvm.internal.C41527d0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7530c0;
import p202p0.C7535d;
import p202p0.C7539e0;
import p202p0.C7549j;
import p202p0.C7589q;
import p202p0.C7602w;

@C7530c0.C7532b("dialog")
/* renamed from: r0.c */
public final class C8031c extends C7530c0 {

    /* renamed from: g */
    private static final C8032a f23169g = new C8032a((DefaultConstructorMarker) null);

    /* renamed from: c */
    private final Context f23170c;

    /* renamed from: d */
    private final FragmentManager f23171d;

    /* renamed from: e */
    private final Set f23172e = new LinkedHashSet();

    /* renamed from: f */
    private final C1606m f23173f = new C8030b(this);

    /* renamed from: r0.c$a */
    private static final class C8032a {
        private C8032a() {
        }

        public /* synthetic */ C8032a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: r0.c$b */
    public static class C8033b extends C7589q implements C7535d {

        /* renamed from: o */
        private String f23174o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C8033b(C7530c0 c0Var) {
            super(c0Var);
            C41536l.m120489i(c0Var, "fragmentNavigator");
        }

        /* renamed from: D */
        public void mo22025D(Context context, AttributeSet attributeSet) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(attributeSet, "attrs");
            super.mo22025D(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, C8039g.f23181a);
            C41536l.m120488h(obtainAttributes, "context.resources.obtain…ntNavigator\n            )");
            String string = obtainAttributes.getString(C8039g.f23182b);
            if (string != null) {
                mo23205K(string);
            }
            obtainAttributes.recycle();
        }

        /* renamed from: J */
        public final String mo23204J() {
            String str = this.f23174o;
            if (str == null) {
                throw new IllegalStateException("DialogFragment class was not set".toString());
            } else if (str != null) {
                return str;
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
            }
        }

        /* renamed from: K */
        public final C8033b mo23205K(String str) {
            C41536l.m120489i(str, "className");
            this.f23174o = str;
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof C8033b) || !super.equals(obj) || !C41536l.m120484d(this.f23174o, ((C8033b) obj).f23174o)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int i;
            int hashCode = super.hashCode() * 31;
            String str = this.f23174o;
            if (str != null) {
                i = str.hashCode();
            } else {
                i = 0;
            }
            return hashCode + i;
        }
    }

    public C8031c(Context context, FragmentManager fragmentManager) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(fragmentManager, "fragmentManager");
        this.f23170c = context;
        this.f23171d = fragmentManager;
    }

    /* renamed from: o */
    private final void m30511o(C7549j jVar) {
        C8033b bVar = (C8033b) jVar.mo22097f();
        String J = bVar.mo23204J();
        if (J.charAt(0) == '.') {
            J = this.f23170c.getPackageName() + J;
        }
        Fragment a = this.f23171d.mo4441w0().mo4458a(this.f23170c.getClassLoader(), J);
        C41536l.m120488h(a, "fragmentManager.fragment…ader, className\n        )");
        if (C1483c.class.isAssignableFrom(a.getClass())) {
            C1483c cVar = (C1483c) a;
            cVar.setArguments(jVar.mo22095d());
            cVar.getLifecycle().mo4906a(this.f23173f);
            cVar.mo4576A1(this.f23171d, jVar.mo22098g());
            mo22048b().mo22077h(jVar);
            return;
        }
        throw new IllegalArgumentException(("Dialog destination " + bVar.mo23204J() + " is not an instance of DialogFragment").toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m30512p(C8031c cVar, C1619q qVar, C1593j.C1594a aVar) {
        Object obj;
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(qVar, "source");
        C41536l.m120489i(aVar, "event");
        boolean z = false;
        if (aVar == C1593j.C1594a.ON_CREATE) {
            C1483c cVar2 = (C1483c) qVar;
            Iterable iterable = (Iterable) cVar.mo22048b().mo22071b().getValue();
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (C41536l.m120484d(((C7549j) it.next()).mo22098g(), cVar2.getTag())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            if (!z) {
                cVar2.mo4577k1();
            }
        } else if (aVar == C1593j.C1594a.ON_STOP) {
            C1483c cVar3 = (C1483c) qVar;
            if (!cVar3.mo4585u1().isShowing()) {
                List list = (List) cVar.mo22048b().mo22071b().getValue();
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        obj = null;
                        break;
                    }
                    obj = listIterator.previous();
                    if (C41536l.m120484d(((C7549j) obj).mo22098g(), cVar3.getTag())) {
                        break;
                    }
                }
                if (obj != null) {
                    C7549j jVar = (C7549j) obj;
                    if (!C41536l.m120484d(C41358y.m120020j0(list), jVar)) {
                        Log.i("DialogFragmentNavigator", "Dialog " + cVar3 + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                    }
                    cVar.mo22055j(jVar, false);
                    return;
                }
                throw new IllegalStateException(("Dialog " + cVar3 + " has already been popped off of the Navigation back stack").toString());
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m30513q(C8031c cVar, FragmentManager fragmentManager, Fragment fragment) {
        C41536l.m120489i(cVar, "this$0");
        C41536l.m120489i(fragmentManager, "<anonymous parameter 0>");
        C41536l.m120489i(fragment, "childFragment");
        Set set = cVar.f23172e;
        if (C41527d0.m120454a(set).remove(fragment.getTag())) {
            fragment.getLifecycle().mo4906a(cVar.f23173f);
        }
    }

    /* renamed from: e */
    public void mo22050e(List list, C7602w wVar, C7530c0.C7531a aVar) {
        C41536l.m120489i(list, "entries");
        if (this.f23171d.mo4394T0()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m30511o((C7549j) it.next());
        }
    }

    /* renamed from: f */
    public void mo22051f(C7539e0 e0Var) {
        C1593j lifecycle;
        C41536l.m120489i(e0Var, "state");
        super.mo22051f(e0Var);
        for (C7549j jVar : (List) e0Var.mo22071b().getValue()) {
            C1483c cVar = (C1483c) this.f23171d.mo4418k0(jVar.mo22098g());
            if (cVar == null || (lifecycle = cVar.getLifecycle()) == null) {
                this.f23172e.add(jVar.mo22098g());
            } else {
                lifecycle.mo4906a(this.f23173f);
            }
        }
        this.f23171d.mo4417k(new C8029a(this));
    }

    /* renamed from: j */
    public void mo22055j(C7549j jVar, boolean z) {
        C41536l.m120489i(jVar, "popUpTo");
        if (this.f23171d.mo4394T0()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list = (List) mo22048b().mo22071b().getValue();
        for (C7549j g : C41358y.m120025o0(list.subList(list.indexOf(jVar), list.size()))) {
            Fragment k0 = this.f23171d.mo4418k0(g.mo22098g());
            if (k0 != null) {
                k0.getLifecycle().mo4909d(this.f23173f);
                ((C1483c) k0).mo4577k1();
            }
        }
        mo22048b().mo22076g(jVar, z);
    }

    /* renamed from: n */
    public C8033b mo22020a() {
        return new C8033b(this);
    }
}
