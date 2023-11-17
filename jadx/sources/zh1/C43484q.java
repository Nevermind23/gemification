package zh1;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import of1.C41872c0;
import of1.C41928u;
import of1.C41939y;

/* renamed from: zh1.q */
abstract class C43484q {

    /* renamed from: zh1.q$a */
    class C43485a extends C43484q {
        C43485a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo102183a(C43506t tVar, Iterable iterable) {
            if (iterable != null) {
                for (Object a : iterable) {
                    C43484q.this.mo102183a(tVar, a);
                }
            }
        }
    }

    /* renamed from: zh1.q$b */
    class C43486b extends C43484q {
        C43486b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            if (obj != null) {
                int length = Array.getLength(obj);
                for (int i = 0; i < length; i++) {
                    C43484q.this.mo102183a(tVar, Array.get(obj, i));
                }
            }
        }
    }

    /* renamed from: zh1.q$c */
    static final class C43487c extends C43484q {

        /* renamed from: a */
        private final Method f101371a;

        /* renamed from: b */
        private final int f101372b;

        /* renamed from: c */
        private final C43455h f101373c;

        C43487c(Method method, int i, C43455h hVar) {
            this.f101371a = method;
            this.f101372b = i;
            this.f101373c = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            if (obj != null) {
                try {
                    tVar.mo102210l((C41872c0) this.f101373c.mo94450a(obj));
                } catch (IOException e) {
                    Method method = this.f101371a;
                    int i = this.f101372b;
                    throw C43439a0.m124628p(method, e, i, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                }
            } else {
                throw C43439a0.m124627o(this.f101371a, this.f101372b, "Body parameter value must not be null.", new Object[0]);
            }
        }
    }

    /* renamed from: zh1.q$d */
    static final class C43488d extends C43484q {

        /* renamed from: a */
        private final String f101374a;

        /* renamed from: b */
        private final C43455h f101375b;

        /* renamed from: c */
        private final boolean f101376c;

        C43488d(String str, C43455h hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f101374a = str;
            this.f101375b = hVar;
            this.f101376c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f101375b.mo94450a(obj)) != null) {
                tVar.mo102201a(this.f101374a, str, this.f101376c);
            }
        }
    }

    /* renamed from: zh1.q$e */
    static final class C43489e extends C43484q {

        /* renamed from: a */
        private final Method f101377a;

        /* renamed from: b */
        private final int f101378b;

        /* renamed from: c */
        private final C43455h f101379c;

        /* renamed from: d */
        private final boolean f101380d;

        C43489e(Method method, int i, C43455h hVar, boolean z) {
            this.f101377a = method;
            this.f101378b = i;
            this.f101379c = hVar;
            this.f101380d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo102183a(C43506t tVar, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f101379c.mo94450a(value);
                            if (str2 != null) {
                                tVar.mo102201a(str, str2, this.f101380d);
                            } else {
                                Method method = this.f101377a;
                                int i = this.f101378b;
                                throw C43439a0.m124627o(method, i, "Field map value '" + value + "' converted to null by " + this.f101379c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f101377a;
                            int i2 = this.f101378b;
                            throw C43439a0.m124627o(method2, i2, "Field map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C43439a0.m124627o(this.f101377a, this.f101378b, "Field map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C43439a0.m124627o(this.f101377a, this.f101378b, "Field map was null.", new Object[0]);
        }
    }

    /* renamed from: zh1.q$f */
    static final class C43490f extends C43484q {

        /* renamed from: a */
        private final String f101381a;

        /* renamed from: b */
        private final C43455h f101382b;

        C43490f(String str, C43455h hVar) {
            Objects.requireNonNull(str, "name == null");
            this.f101381a = str;
            this.f101382b = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f101382b.mo94450a(obj)) != null) {
                tVar.mo102202b(this.f101381a, str);
            }
        }
    }

    /* renamed from: zh1.q$g */
    static final class C43491g extends C43484q {

        /* renamed from: a */
        private final Method f101383a;

        /* renamed from: b */
        private final int f101384b;

        /* renamed from: c */
        private final C43455h f101385c;

        C43491g(Method method, int i, C43455h hVar) {
            this.f101383a = method;
            this.f101384b = i;
            this.f101385c = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo102183a(C43506t tVar, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            tVar.mo102202b(str, (String) this.f101385c.mo94450a(value));
                        } else {
                            Method method = this.f101383a;
                            int i = this.f101384b;
                            throw C43439a0.m124627o(method, i, "Header map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C43439a0.m124627o(this.f101383a, this.f101384b, "Header map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C43439a0.m124627o(this.f101383a, this.f101384b, "Header map was null.", new Object[0]);
        }
    }

    /* renamed from: zh1.q$h */
    static final class C43492h extends C43484q {

        /* renamed from: a */
        private final Method f101386a;

        /* renamed from: b */
        private final int f101387b;

        C43492h(Method method, int i) {
            this.f101386a = method;
            this.f101387b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo102183a(C43506t tVar, C41928u uVar) {
            if (uVar != null) {
                tVar.mo102203c(uVar);
                return;
            }
            throw C43439a0.m124627o(this.f101386a, this.f101387b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* renamed from: zh1.q$i */
    static final class C43493i extends C43484q {

        /* renamed from: a */
        private final Method f101388a;

        /* renamed from: b */
        private final int f101389b;

        /* renamed from: c */
        private final C41928u f101390c;

        /* renamed from: d */
        private final C43455h f101391d;

        C43493i(Method method, int i, C41928u uVar, C43455h hVar) {
            this.f101388a = method;
            this.f101389b = i;
            this.f101390c = uVar;
            this.f101391d = hVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            if (obj != null) {
                try {
                    tVar.mo102204d(this.f101390c, (C41872c0) this.f101391d.mo94450a(obj));
                } catch (IOException e) {
                    Method method = this.f101388a;
                    int i = this.f101389b;
                    throw C43439a0.m124627o(method, i, "Unable to convert " + obj + " to RequestBody", e);
                }
            }
        }
    }

    /* renamed from: zh1.q$j */
    static final class C43494j extends C43484q {

        /* renamed from: a */
        private final Method f101392a;

        /* renamed from: b */
        private final int f101393b;

        /* renamed from: c */
        private final C43455h f101394c;

        /* renamed from: d */
        private final String f101395d;

        C43494j(Method method, int i, C43455h hVar, String str) {
            this.f101392a = method;
            this.f101393b = i;
            this.f101394c = hVar;
            this.f101395d = str;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo102183a(C43506t tVar, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            tVar.mo102204d(C41928u.m121597l("Content-Disposition", "form-data; name=\"" + str + "\"", "Content-Transfer-Encoding", this.f101395d), (C41872c0) this.f101394c.mo94450a(value));
                        } else {
                            Method method = this.f101392a;
                            int i = this.f101393b;
                            throw C43439a0.m124627o(method, i, "Part map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C43439a0.m124627o(this.f101392a, this.f101393b, "Part map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C43439a0.m124627o(this.f101392a, this.f101393b, "Part map was null.", new Object[0]);
        }
    }

    /* renamed from: zh1.q$k */
    static final class C43495k extends C43484q {

        /* renamed from: a */
        private final Method f101396a;

        /* renamed from: b */
        private final int f101397b;

        /* renamed from: c */
        private final String f101398c;

        /* renamed from: d */
        private final C43455h f101399d;

        /* renamed from: e */
        private final boolean f101400e;

        C43495k(Method method, int i, String str, C43455h hVar, boolean z) {
            this.f101396a = method;
            this.f101397b = i;
            Objects.requireNonNull(str, "name == null");
            this.f101398c = str;
            this.f101399d = hVar;
            this.f101400e = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            if (obj != null) {
                tVar.mo102206f(this.f101398c, (String) this.f101399d.mo94450a(obj), this.f101400e);
                return;
            }
            Method method = this.f101396a;
            int i = this.f101397b;
            throw C43439a0.m124627o(method, i, "Path parameter \"" + this.f101398c + "\" value must not be null.", new Object[0]);
        }
    }

    /* renamed from: zh1.q$l */
    static final class C43496l extends C43484q {

        /* renamed from: a */
        private final String f101401a;

        /* renamed from: b */
        private final C43455h f101402b;

        /* renamed from: c */
        private final boolean f101403c;

        C43496l(String str, C43455h hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f101401a = str;
            this.f101402b = hVar;
            this.f101403c = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            String str;
            if (obj != null && (str = (String) this.f101402b.mo94450a(obj)) != null) {
                tVar.mo102207g(this.f101401a, str, this.f101403c);
            }
        }
    }

    /* renamed from: zh1.q$m */
    static final class C43497m extends C43484q {

        /* renamed from: a */
        private final Method f101404a;

        /* renamed from: b */
        private final int f101405b;

        /* renamed from: c */
        private final C43455h f101406c;

        /* renamed from: d */
        private final boolean f101407d;

        C43497m(Method method, int i, C43455h hVar, boolean z) {
            this.f101404a = method;
            this.f101405b = i;
            this.f101406c = hVar;
            this.f101407d = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo102183a(C43506t tVar, Map map) {
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str != null) {
                        Object value = entry.getValue();
                        if (value != null) {
                            String str2 = (String) this.f101406c.mo94450a(value);
                            if (str2 != null) {
                                tVar.mo102207g(str, str2, this.f101407d);
                            } else {
                                Method method = this.f101404a;
                                int i = this.f101405b;
                                throw C43439a0.m124627o(method, i, "Query map value '" + value + "' converted to null by " + this.f101406c.getClass().getName() + " for key '" + str + "'.", new Object[0]);
                            }
                        } else {
                            Method method2 = this.f101404a;
                            int i2 = this.f101405b;
                            throw C43439a0.m124627o(method2, i2, "Query map contained null value for key '" + str + "'.", new Object[0]);
                        }
                    } else {
                        throw C43439a0.m124627o(this.f101404a, this.f101405b, "Query map contained null key.", new Object[0]);
                    }
                }
                return;
            }
            throw C43439a0.m124627o(this.f101404a, this.f101405b, "Query map was null", new Object[0]);
        }
    }

    /* renamed from: zh1.q$n */
    static final class C43498n extends C43484q {

        /* renamed from: a */
        private final C43455h f101408a;

        /* renamed from: b */
        private final boolean f101409b;

        C43498n(C43455h hVar, boolean z) {
            this.f101408a = hVar;
            this.f101409b = z;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            if (obj != null) {
                tVar.mo102207g((String) this.f101408a.mo94450a(obj), (String) null, this.f101409b);
            }
        }
    }

    /* renamed from: zh1.q$o */
    static final class C43499o extends C43484q {

        /* renamed from: a */
        static final C43499o f101410a = new C43499o();

        private C43499o() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo102183a(C43506t tVar, C41939y.C41942c cVar) {
            if (cVar != null) {
                tVar.mo102205e(cVar);
            }
        }
    }

    /* renamed from: zh1.q$p */
    static final class C43500p extends C43484q {

        /* renamed from: a */
        private final Method f101411a;

        /* renamed from: b */
        private final int f101412b;

        C43500p(Method method, int i) {
            this.f101411a = method;
            this.f101412b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            if (obj != null) {
                tVar.mo102211m(obj);
                return;
            }
            throw C43439a0.m124627o(this.f101411a, this.f101412b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* renamed from: zh1.q$q */
    static final class C43501q extends C43484q {

        /* renamed from: a */
        final Class f101413a;

        C43501q(Class cls) {
            this.f101413a = cls;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo102183a(C43506t tVar, Object obj) {
            tVar.mo102208h(this.f101413a, obj);
        }
    }

    C43484q() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo102183a(C43506t tVar, Object obj);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C43484q mo102184b() {
        return new C43486b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C43484q mo102185c() {
        return new C43485a();
    }
}
