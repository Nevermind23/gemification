package jg1;

import android.support.p013v4.media.session.C0125b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import lg1.C41701a;
import org.greenrobot.eventbus.EventBusException;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: jg1.o */
class C41455o {

    /* renamed from: d */
    private static final Map f97575d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final C41456a[] f97576e = new C41456a[4];

    /* renamed from: a */
    private List f97577a;

    /* renamed from: b */
    private final boolean f97578b;

    /* renamed from: c */
    private final boolean f97579c;

    /* renamed from: jg1.o$a */
    static class C41456a {

        /* renamed from: a */
        final List f97580a = new ArrayList();

        /* renamed from: b */
        final Map f97581b = new HashMap();

        /* renamed from: c */
        final Map f97582c = new HashMap();

        /* renamed from: d */
        final StringBuilder f97583d = new StringBuilder(128);

        /* renamed from: e */
        Class f97584e;

        /* renamed from: f */
        Class f97585f;

        /* renamed from: g */
        boolean f97586g;

        C41456a() {
        }

        /* renamed from: b */
        private boolean m120280b(Method method, Class cls) {
            this.f97583d.setLength(0);
            this.f97583d.append(method.getName());
            StringBuilder sb = this.f97583d;
            sb.append('>');
            sb.append(cls.getName());
            String sb2 = this.f97583d.toString();
            Class<?> declaringClass = method.getDeclaringClass();
            Class cls2 = (Class) this.f97582c.put(sb2, declaringClass);
            if (cls2 == null || cls2.isAssignableFrom(declaringClass)) {
                return true;
            }
            this.f97582c.put(sb2, cls2);
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo96206a(Method method, Class cls) {
            Object put = this.f97581b.put(cls, method);
            if (put == null) {
                return true;
            }
            if (put instanceof Method) {
                if (m120280b((Method) put, cls)) {
                    this.f97581b.put(cls, this);
                } else {
                    throw new IllegalStateException();
                }
            }
            return m120280b(method, cls);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo96207c(Class cls) {
            this.f97585f = cls;
            this.f97584e = cls;
            this.f97586g = false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo96208d() {
            if (this.f97586g) {
                this.f97585f = null;
                return;
            }
            Class superclass = this.f97585f.getSuperclass();
            this.f97585f = superclass;
            String name = superclass.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.") || name.startsWith("androidx.")) {
                this.f97585f = null;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo96209e() {
            this.f97580a.clear();
            this.f97581b.clear();
            this.f97582c.clear();
            this.f97583d.setLength(0);
            this.f97584e = null;
            this.f97585f = null;
            this.f97586g = false;
        }
    }

    C41455o(List list, boolean z, boolean z2) {
        this.f97577a = list;
        this.f97578b = z;
        this.f97579c = z2;
    }

    /* renamed from: b */
    private List m120273b(Class cls) {
        C41456a g = m120278g();
        g.mo96207c(cls);
        while (g.f97585f != null) {
            m120277f(g);
            m120275d(g);
            g.mo96208d();
        }
        return m120276e(g);
    }

    /* renamed from: c */
    private List m120274c(Class cls) {
        C41456a g = m120278g();
        g.mo96207c(cls);
        while (g.f97585f != null) {
            m120275d(g);
            g.mo96208d();
        }
        return m120276e(g);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ea, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00eb, code lost:
        r15 = "Could not inspect methods of " + r15.f97585f.getName();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0104, code lost:
        if (r14.f97579c != false) goto L_0x0106;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0106, code lost:
        r15 = r15 + ". Please consider using EventBus annotation processor to avoid reflection.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0118, code lost:
        r15 = r15 + ". Please make this class visible to EventBus annotation processor to avoid reflection.";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x012e, code lost:
        throw new org.greenrobot.eventbus.EventBusException(r15, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:?, code lost:
        r1 = r15.f97585f.getMethods();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r15.f97586g = true;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0008 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m120275d(jg1.C41455o.C41456a r15) {
        /*
            r14 = this;
            r0 = 1
            java.lang.Class r1 = r15.f97585f     // Catch:{ all -> 0x0008 }
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()     // Catch:{ all -> 0x0008 }
            goto L_0x0010
        L_0x0008:
            java.lang.Class r1 = r15.f97585f     // Catch:{ LinkageError -> 0x00ea }
            java.lang.reflect.Method[] r1 = r1.getMethods()     // Catch:{ LinkageError -> 0x00ea }
            r15.f97586g = r0
        L_0x0010:
            int r2 = r1.length
            r3 = 0
            r4 = r3
        L_0x0013:
            if (r4 >= r2) goto L_0x00e9
            r6 = r1[r4]
            int r5 = r6.getModifiers()
            r7 = r5 & 1
            java.lang.String r8 = "."
            java.lang.Class<jg1.l> r9 = jg1.C41452l.class
            if (r7 == 0) goto L_0x00a5
            r5 = r5 & 5192(0x1448, float:7.276E-42)
            if (r5 != 0) goto L_0x00a5
            java.lang.Class[] r5 = r6.getParameterTypes()
            int r7 = r5.length
            if (r7 != r0) goto L_0x005b
            java.lang.annotation.Annotation r7 = r6.getAnnotation(r9)
            jg1.l r7 = (jg1.C41452l) r7
            if (r7 == 0) goto L_0x00e5
            r8 = r5[r3]
            boolean r5 = r15.mo96206a(r6, r8)
            if (r5 == 0) goto L_0x00e5
            org.greenrobot.eventbus.ThreadMode r9 = r7.threadMode()
            java.util.List r11 = r15.f97580a
            jg1.n r12 = new jg1.n
            int r10 = r7.priority()
            boolean r13 = r7.sticky()
            r5 = r12
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            r11.add(r12)
            goto L_0x00e5
        L_0x005b:
            boolean r7 = r14.f97578b
            if (r7 == 0) goto L_0x00e5
            boolean r7 = r6.isAnnotationPresent(r9)
            if (r7 != 0) goto L_0x0067
            goto L_0x00e5
        L_0x0067:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            org.greenrobot.eventbus.EventBusException r0 = new org.greenrobot.eventbus.EventBusException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "@Subscribe method "
            r1.append(r2)
            r1.append(r15)
            java.lang.String r15 = "must have exactly 1 parameter but has "
            r1.append(r15)
            int r15 = r5.length
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x00a5:
            boolean r5 = r14.f97578b
            if (r5 == 0) goto L_0x00e5
            boolean r5 = r6.isAnnotationPresent(r9)
            if (r5 != 0) goto L_0x00b0
            goto L_0x00e5
        L_0x00b0:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.Class r0 = r6.getDeclaringClass()
            java.lang.String r0 = r0.getName()
            r15.append(r0)
            r15.append(r8)
            java.lang.String r0 = r6.getName()
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            org.greenrobot.eventbus.EventBusException r0 = new org.greenrobot.eventbus.EventBusException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = " is a illegal @Subscribe method: must be public, non-static, and non-abstract"
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            r0.<init>(r15)
            throw r0
        L_0x00e5:
            int r4 = r4 + 1
            goto L_0x0013
        L_0x00e9:
            return
        L_0x00ea:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Could not inspect methods of "
            r1.append(r2)
            java.lang.Class r15 = r15.f97585f
            java.lang.String r15 = r15.getName()
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            boolean r1 = r14.f97579c
            if (r1 == 0) goto L_0x0118
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please consider using EventBus annotation processor to avoid reflection."
            r1.append(r15)
            java.lang.String r15 = r1.toString()
            goto L_0x0129
        L_0x0118:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r15)
            java.lang.String r15 = ". Please make this class visible to EventBus annotation processor to avoid reflection."
            r1.append(r15)
            java.lang.String r15 = r1.toString()
        L_0x0129:
            org.greenrobot.eventbus.EventBusException r1 = new org.greenrobot.eventbus.EventBusException
            r1.<init>(r15, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: jg1.C41455o.m120275d(jg1.o$a):void");
    }

    /* renamed from: e */
    private List m120276e(C41456a aVar) {
        ArrayList arrayList = new ArrayList(aVar.f97580a);
        aVar.mo96209e();
        synchronized (f97576e) {
            int i = 0;
            while (true) {
                if (i >= 4) {
                    break;
                }
                C41456a[] aVarArr = f97576e;
                if (aVarArr[i] == null) {
                    aVarArr[i] = aVar;
                    break;
                }
                i++;
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    private C41701a m120277f(C41456a aVar) {
        aVar.getClass();
        List list = this.f97577a;
        if (list != null) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                throw null;
            }
        }
        return null;
    }

    /* renamed from: g */
    private C41456a m120278g() {
        synchronized (f97576e) {
            for (int i = 0; i < 4; i++) {
                C41456a[] aVarArr = f97576e;
                C41456a aVar = aVarArr[i];
                if (aVar != null) {
                    aVarArr[i] = null;
                    return aVar;
                }
            }
            return new C41456a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List mo96205a(Class cls) {
        List list;
        Map map = f97575d;
        List list2 = (List) map.get(cls);
        if (list2 != null) {
            return list2;
        }
        if (this.f97579c) {
            list = m120274c(cls);
        } else {
            list = m120273b(cls);
        }
        if (!list.isEmpty()) {
            map.put(cls, list);
            return list;
        }
        throw new EventBusException("Subscriber " + cls + " and its super classes have no public methods with the @Subscribe annotation");
    }
}
