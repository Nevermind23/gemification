package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C1593j;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import p098h0.C6415b;

/* renamed from: androidx.fragment.app.e0 */
public abstract class C1493e0 {

    /* renamed from: a */
    private final C1519l f4360a;

    /* renamed from: b */
    private final ClassLoader f4361b;

    /* renamed from: c */
    ArrayList f4362c;

    /* renamed from: d */
    int f4363d;

    /* renamed from: e */
    int f4364e;

    /* renamed from: f */
    int f4365f;

    /* renamed from: g */
    int f4366g;

    /* renamed from: h */
    int f4367h;

    /* renamed from: i */
    boolean f4368i;

    /* renamed from: j */
    boolean f4369j;

    /* renamed from: k */
    String f4370k;

    /* renamed from: l */
    int f4371l;

    /* renamed from: m */
    CharSequence f4372m;

    /* renamed from: n */
    int f4373n;

    /* renamed from: o */
    CharSequence f4374o;

    /* renamed from: p */
    ArrayList f4375p;

    /* renamed from: q */
    ArrayList f4376q;

    /* renamed from: r */
    boolean f4377r;

    /* renamed from: s */
    ArrayList f4378s;

    /* renamed from: androidx.fragment.app.e0$a */
    static final class C1494a {

        /* renamed from: a */
        int f4379a;

        /* renamed from: b */
        Fragment f4380b;

        /* renamed from: c */
        boolean f4381c;

        /* renamed from: d */
        int f4382d;

        /* renamed from: e */
        int f4383e;

        /* renamed from: f */
        int f4384f;

        /* renamed from: g */
        int f4385g;

        /* renamed from: h */
        C1593j.C1598b f4386h;

        /* renamed from: i */
        C1593j.C1598b f4387i;

        C1494a() {
        }

        C1494a(int i, Fragment fragment) {
            this.f4379a = i;
            this.f4380b = fragment;
            this.f4381c = false;
            C1593j.C1598b bVar = C1593j.C1598b.RESUMED;
            this.f4386h = bVar;
            this.f4387i = bVar;
        }

        C1494a(int i, Fragment fragment, boolean z) {
            this.f4379a = i;
            this.f4380b = fragment;
            this.f4381c = z;
            C1593j.C1598b bVar = C1593j.C1598b.RESUMED;
            this.f4386h = bVar;
            this.f4387i = bVar;
        }

        C1494a(int i, Fragment fragment, C1593j.C1598b bVar) {
            this.f4379a = i;
            this.f4380b = fragment;
            this.f4381c = false;
            this.f4386h = fragment.mMaxState;
            this.f4387i = bVar;
        }

        C1494a(C1494a aVar) {
            this.f4379a = aVar.f4379a;
            this.f4380b = aVar.f4380b;
            this.f4381c = aVar.f4381c;
            this.f4382d = aVar.f4382d;
            this.f4383e = aVar.f4383e;
            this.f4384f = aVar.f4384f;
            this.f4385g = aVar.f4385g;
            this.f4386h = aVar.f4386h;
            this.f4387i = aVar.f4387i;
        }
    }

    C1493e0(C1519l lVar, ClassLoader classLoader) {
        this.f4362c = new ArrayList();
        this.f4369j = true;
        this.f4377r = false;
        this.f4360a = lVar;
        this.f4361b = classLoader;
    }

    /* renamed from: b */
    public C1493e0 mo4631b(int i, Fragment fragment) {
        mo4520o(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: c */
    public C1493e0 mo4632c(int i, Fragment fragment, String str) {
        mo4520o(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C1493e0 mo4633d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.mContainer = viewGroup;
        return mo4632c(viewGroup.getId(), fragment, str);
    }

    /* renamed from: e */
    public C1493e0 mo4634e(Fragment fragment, String str) {
        mo4520o(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4635f(C1494a aVar) {
        this.f4362c.add(aVar);
        aVar.f4382d = this.f4363d;
        aVar.f4383e = this.f4364e;
        aVar.f4384f = this.f4365f;
        aVar.f4385g = this.f4366g;
    }

    /* renamed from: g */
    public C1493e0 mo4636g(String str) {
        if (this.f4369j) {
            this.f4368i = true;
            this.f4370k = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: h */
    public C1493e0 mo4637h(Fragment fragment) {
        mo4635f(new C1494a(7, fragment));
        return this;
    }

    /* renamed from: i */
    public abstract int mo4515i();

    /* renamed from: j */
    public abstract int mo4516j();

    /* renamed from: k */
    public abstract void mo4517k();

    /* renamed from: l */
    public abstract void mo4518l();

    /* renamed from: m */
    public C1493e0 mo4519m(Fragment fragment) {
        mo4635f(new C1494a(6, fragment));
        return this;
    }

    /* renamed from: n */
    public C1493e0 mo4638n() {
        if (!this.f4368i) {
            this.f4369j = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo4520o(int i, Fragment fragment, String str, int i2) {
        String str2 = fragment.mPreviousWho;
        if (str2 != null) {
            C6415b.m25483f(fragment, str2);
        }
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = fragment.mTag;
            if (str3 == null || str.equals(str3)) {
                fragment.mTag = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.mFragmentId;
                if (i3 == 0 || i3 == i) {
                    fragment.mFragmentId = i;
                    fragment.mContainerId = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo4635f(new C1494a(i2, fragment));
    }

    /* renamed from: p */
    public abstract boolean mo4521p();

    /* renamed from: q */
    public C1493e0 mo4522q(Fragment fragment) {
        mo4635f(new C1494a(3, fragment));
        return this;
    }

    /* renamed from: r */
    public C1493e0 mo4639r(int i, Fragment fragment) {
        return mo4640s(i, fragment, (String) null);
    }

    /* renamed from: s */
    public C1493e0 mo4640s(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo4520o(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: t */
    public C1493e0 mo4641t(int i, int i2) {
        return mo4642u(i, i2, 0, 0);
    }

    /* renamed from: u */
    public C1493e0 mo4642u(int i, int i2, int i3, int i4) {
        this.f4363d = i;
        this.f4364e = i2;
        this.f4365f = i3;
        this.f4366g = i4;
        return this;
    }

    /* renamed from: v */
    public C1493e0 mo4524v(Fragment fragment, C1593j.C1598b bVar) {
        mo4635f(new C1494a(10, fragment, bVar));
        return this;
    }

    /* renamed from: w */
    public C1493e0 mo4525w(Fragment fragment) {
        mo4635f(new C1494a(8, fragment));
        return this;
    }

    /* renamed from: x */
    public C1493e0 mo4643x(boolean z) {
        this.f4377r = z;
        return this;
    }

    C1493e0(C1519l lVar, ClassLoader classLoader, C1493e0 e0Var) {
        this(lVar, classLoader);
        Iterator it = e0Var.f4362c.iterator();
        while (it.hasNext()) {
            this.f4362c.add(new C1494a((C1494a) it.next()));
        }
        this.f4363d = e0Var.f4363d;
        this.f4364e = e0Var.f4364e;
        this.f4365f = e0Var.f4365f;
        this.f4366g = e0Var.f4366g;
        this.f4367h = e0Var.f4367h;
        this.f4368i = e0Var.f4368i;
        this.f4369j = e0Var.f4369j;
        this.f4370k = e0Var.f4370k;
        this.f4373n = e0Var.f4373n;
        this.f4374o = e0Var.f4374o;
        this.f4371l = e0Var.f4371l;
        this.f4372m = e0Var.f4372m;
        if (e0Var.f4375p != null) {
            ArrayList arrayList = new ArrayList();
            this.f4375p = arrayList;
            arrayList.addAll(e0Var.f4375p);
        }
        if (e0Var.f4376q != null) {
            ArrayList arrayList2 = new ArrayList();
            this.f4376q = arrayList2;
            arrayList2.addAll(e0Var.f4376q);
        }
        this.f4377r = e0Var.f4377r;
    }
}
