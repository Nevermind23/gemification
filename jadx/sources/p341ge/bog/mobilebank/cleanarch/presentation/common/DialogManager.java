package p341ge.bog.mobilebank.cleanarch.presentation.common;

import androidx.fragment.app.C1483c;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1593j;
import androidx.lifecycle.C1616p;
import androidx.lifecycle.C1646z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.DialogManager */
public final class DialogManager implements C1616p {

    /* renamed from: d */
    private final List f57378d = new ArrayList();

    /* renamed from: e */
    private final List f57379e = new ArrayList();

    /* renamed from: f */
    private boolean f57380f;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.DialogManager$a */
    public static abstract class C21479a {

        /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.DialogManager$a$a */
        public static final class C21480a extends C21479a {

            /* renamed from: a */
            private final String f57381a;

            /* renamed from: b */
            private final FragmentManager f57382b;

            /* renamed from: c */
            private final WeakReference f57383c;

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ C21480a(String str, FragmentManager fragmentManager, WeakReference weakReference, int i, DefaultConstructorMarker defaultConstructorMarker) {
                this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : fragmentManager, weakReference);
            }

            /* renamed from: a */
            public void mo53590a() {
                C1483c cVar = (C1483c) this.f57383c.get();
                if (cVar != null) {
                    cVar.mo4577k1();
                }
            }

            /* renamed from: b */
            public void mo53591b() {
                C1483c cVar;
                if (this.f57382b != null && (cVar = (C1483c) this.f57383c.get()) != null) {
                    cVar.mo4576A1(this.f57382b, this.f57381a);
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C21480a)) {
                    return false;
                }
                C21480a aVar = (C21480a) obj;
                return C41536l.m120484d(this.f57381a, aVar.f57381a) && C41536l.m120484d(this.f57382b, aVar.f57382b) && C41536l.m120484d(this.f57383c, aVar.f57383c);
            }

            public int hashCode() {
                String str = this.f57381a;
                int i = 0;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                FragmentManager fragmentManager = this.f57382b;
                if (fragmentManager != null) {
                    i = fragmentManager.hashCode();
                }
                return ((hashCode + i) * 31) + this.f57383c.hashCode();
            }

            public String toString() {
                String str = this.f57381a;
                FragmentManager fragmentManager = this.f57382b;
                WeakReference weakReference = this.f57383c;
                return "DialogFragmentWrapper(tag=" + str + ", fragmentManager=" + fragmentManager + ", dialogFragment=" + weakReference + ")";
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C21480a(String str, FragmentManager fragmentManager, WeakReference weakReference) {
                super((DefaultConstructorMarker) null);
                C41536l.m120489i(weakReference, "dialogFragment");
                this.f57381a = str;
                this.f57382b = fragmentManager;
                this.f57383c = weakReference;
            }
        }

        private C21479a() {
        }

        public /* synthetic */ C21479a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public abstract void mo53590a();

        /* renamed from: b */
        public abstract void mo53591b();
    }

    /* renamed from: c */
    public final void mo53585c(C1483c cVar) {
        C41536l.m120489i(cVar, "dialog");
        if (this.f57380f) {
            cVar.mo4577k1();
        } else {
            this.f57379e.add(new C21479a.C21480a((String) null, (FragmentManager) null, new WeakReference(cVar), 3, (DefaultConstructorMarker) null));
        }
    }

    /* renamed from: f */
    public final void mo53586f(C1483c cVar, FragmentManager fragmentManager, String str) {
        C41536l.m120489i(cVar, "dialog");
        C41536l.m120489i(fragmentManager, "fragmentManager");
        if (this.f57380f) {
            cVar.mo4576A1(fragmentManager, str);
        } else {
            this.f57378d.add(new C21479a.C21480a(str, fragmentManager, new WeakReference(cVar)));
        }
    }

    @C1646z(C1593j.C1594a.ON_DESTROY)
    public final void onDestroy() {
        this.f57378d.clear();
        this.f57379e.clear();
    }

    @C1646z(C1593j.C1594a.ON_PAUSE)
    public final void onPause() {
        this.f57380f = false;
    }

    @C1646z(C1593j.C1594a.ON_RESUME)
    public final void onResume() {
        this.f57380f = true;
        List<C21479a> list = this.f57378d;
        for (C21479a b : list) {
            b.mo53591b();
        }
        list.clear();
        List<C21479a> list2 = this.f57379e;
        for (C21479a a : list2) {
            a.mo53590a();
        }
        list2.clear();
    }
}
