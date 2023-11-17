package p326y8;

import com.google.firebase.components.DependencyException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import p289v9.C8716c;
import p327y9.C9140a;
import p327y9.C9142b;

/* renamed from: y8.c0 */
final class C9107c0 implements C9110e {

    /* renamed from: a */
    private final Set f25281a;

    /* renamed from: b */
    private final Set f25282b;

    /* renamed from: c */
    private final Set f25283c;

    /* renamed from: d */
    private final Set f25284d;

    /* renamed from: e */
    private final Set f25285e;

    /* renamed from: f */
    private final Set f25286f;

    /* renamed from: g */
    private final C9110e f25287g;

    /* renamed from: y8.c0$a */
    private static class C9108a implements C8716c {

        /* renamed from: a */
        private final Set f25288a;

        /* renamed from: b */
        private final C8716c f25289b;

        public C9108a(Set set, C8716c cVar) {
            this.f25288a = set;
            this.f25289b = cVar;
        }
    }

    C9107c0(C9104c cVar, C9110e eVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (C9131r rVar : cVar.mo24652g()) {
            if (rVar.mo24699e()) {
                if (rVar.mo24702g()) {
                    hashSet4.add(rVar.mo24697c());
                } else {
                    hashSet.add(rVar.mo24697c());
                }
            } else if (rVar.mo24698d()) {
                hashSet3.add(rVar.mo24697c());
            } else if (rVar.mo24702g()) {
                hashSet5.add(rVar.mo24697c());
            } else {
                hashSet2.add(rVar.mo24697c());
            }
        }
        if (!cVar.mo24656k().isEmpty()) {
            hashSet.add(C9102b0.m33558b(C8716c.class));
        }
        this.f25281a = Collections.unmodifiableSet(hashSet);
        this.f25282b = Collections.unmodifiableSet(hashSet2);
        this.f25283c = Collections.unmodifiableSet(hashSet3);
        this.f25284d = Collections.unmodifiableSet(hashSet4);
        this.f25285e = Collections.unmodifiableSet(hashSet5);
        this.f25286f = cVar.mo24656k();
        this.f25287g = eVar;
    }

    /* renamed from: a */
    public Object mo24668a(Class cls) {
        if (this.f25281a.contains(C9102b0.m33558b(cls))) {
            Object a = this.f25287g.mo24668a(cls);
            if (!cls.equals(C8716c.class)) {
                return a;
            }
            return new C9108a(this.f25286f, (C8716c) a);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    /* renamed from: b */
    public C9142b mo24669b(C9102b0 b0Var) {
        if (this.f25285e.contains(b0Var)) {
            return this.f25287g.mo24669b(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{b0Var}));
    }

    /* renamed from: c */
    public Object mo24670c(C9102b0 b0Var) {
        if (this.f25281a.contains(b0Var)) {
            return this.f25287g.mo24670c(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency %s.", new Object[]{b0Var}));
    }

    /* renamed from: d */
    public /* synthetic */ Set mo24671d(Class cls) {
        return C9109d.m33602e(this, cls);
    }

    /* renamed from: e */
    public C9142b mo24672e(C9102b0 b0Var) {
        if (this.f25282b.contains(b0Var)) {
            return this.f25287g.mo24672e(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{b0Var}));
    }

    /* renamed from: f */
    public Set mo24673f(C9102b0 b0Var) {
        if (this.f25284d.contains(b0Var)) {
            return this.f25287g.mo24673f(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{b0Var}));
    }

    /* renamed from: g */
    public C9142b mo24674g(Class cls) {
        return mo24672e(C9102b0.m33558b(cls));
    }

    /* renamed from: h */
    public C9140a mo24675h(C9102b0 b0Var) {
        if (this.f25283c.contains(b0Var)) {
            return this.f25287g.mo24675h(b0Var);
        }
        throw new DependencyException(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{b0Var}));
    }

    /* renamed from: i */
    public C9140a mo24676i(Class cls) {
        return mo24675h(C9102b0.m33558b(cls));
    }
}
