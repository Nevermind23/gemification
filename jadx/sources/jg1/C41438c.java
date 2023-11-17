package jg1;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.logging.Level;
import kg1.C41513b;
import org.greenrobot.eventbus.EventBusException;
import p342j$.util.concurrent.ConcurrentHashMap;

/* renamed from: jg1.c */
public class C41438c {

    /* renamed from: s */
    static volatile C41438c f97511s;

    /* renamed from: t */
    private static final C41442d f97512t = new C41442d();

    /* renamed from: u */
    private static final Map f97513u = new HashMap();

    /* renamed from: a */
    private final Map f97514a;

    /* renamed from: b */
    private final Map f97515b;

    /* renamed from: c */
    private final Map f97516c;

    /* renamed from: d */
    private final ThreadLocal f97517d;

    /* renamed from: e */
    private final C41447g f97518e;

    /* renamed from: f */
    private final C41451k f97519f;

    /* renamed from: g */
    private final C41437b f97520g;

    /* renamed from: h */
    private final C41436a f97521h;

    /* renamed from: i */
    private final C41455o f97522i;

    /* renamed from: j */
    private final ExecutorService f97523j;

    /* renamed from: k */
    private final boolean f97524k;

    /* renamed from: l */
    private final boolean f97525l;

    /* renamed from: m */
    private final boolean f97526m;

    /* renamed from: n */
    private final boolean f97527n;

    /* renamed from: o */
    private final boolean f97528o;

    /* renamed from: p */
    private final boolean f97529p;

    /* renamed from: q */
    private final int f97530q;

    /* renamed from: r */
    private final C41444f f97531r;

    /* renamed from: jg1.c$a */
    class C41439a extends ThreadLocal {
        C41439a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C41441c initialValue() {
            return new C41441c();
        }
    }

    /* renamed from: jg1.c$b */
    static /* synthetic */ class C41440b {

        /* renamed from: a */
        static final /* synthetic */ int[] f97533a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                org.greenrobot.eventbus.ThreadMode[] r0 = org.greenrobot.eventbus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f97533a = r0
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.POSTING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f97533a     // Catch:{ NoSuchFieldError -> 0x001d }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f97533a     // Catch:{ NoSuchFieldError -> 0x0028 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.MAIN_ORDERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f97533a     // Catch:{ NoSuchFieldError -> 0x0033 }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.BACKGROUND     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f97533a     // Catch:{ NoSuchFieldError -> 0x003e }
                org.greenrobot.eventbus.ThreadMode r1 = org.greenrobot.eventbus.ThreadMode.ASYNC     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: jg1.C41438c.C41440b.<clinit>():void");
        }
    }

    /* renamed from: jg1.c$c */
    static final class C41441c {

        /* renamed from: a */
        final List f97534a = new ArrayList();

        /* renamed from: b */
        boolean f97535b;

        /* renamed from: c */
        boolean f97536c;

        /* renamed from: d */
        C41457p f97537d;

        /* renamed from: e */
        Object f97538e;

        /* renamed from: f */
        boolean f97539f;

        C41441c() {
        }
    }

    public C41438c() {
        this(f97512t);
    }

    /* renamed from: a */
    static void m120235a(List list, Class[] clsArr) {
        for (Class cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m120235a(list, cls.getInterfaces());
            }
        }
    }

    /* renamed from: b */
    private void m120236b(C41457p pVar, Object obj) {
        if (obj != null) {
            m120243p(pVar, obj, m120239j());
        }
    }

    /* renamed from: c */
    public static C41438c m120237c() {
        C41438c cVar = f97511s;
        if (cVar == null) {
            synchronized (C41438c.class) {
                cVar = f97511s;
                if (cVar == null) {
                    cVar = new C41438c();
                    f97511s = cVar;
                }
            }
        }
        return cVar;
    }

    /* renamed from: g */
    private void m120238g(C41457p pVar, Object obj, Throwable th) {
        if (obj instanceof C41453m) {
            if (this.f97525l) {
                C41444f fVar = this.f97531r;
                Level level = Level.SEVERE;
                fVar.mo96193a(level, "SubscriberExceptionEvent subscriber " + pVar.f97587a.getClass() + " threw an exception", th);
                C41453m mVar = (C41453m) obj;
                C41444f fVar2 = this.f97531r;
                fVar2.mo96193a(level, "Initial event " + mVar.f97567c + " caused exception in " + mVar.f97568d, mVar.f97566b);
            }
        } else if (!this.f97524k) {
            if (this.f97525l) {
                C41444f fVar3 = this.f97531r;
                Level level2 = Level.SEVERE;
                fVar3.mo96193a(level2, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + pVar.f97587a.getClass(), th);
            }
            if (this.f97527n) {
                mo96184m(new C41453m(this, th, obj, pVar.f97587a));
            }
        } else {
            throw new EventBusException("Invoking subscriber failed", th);
        }
    }

    /* renamed from: j */
    private boolean m120239j() {
        C41447g gVar = this.f97518e;
        return gVar == null || gVar.mo96196b();
    }

    /* renamed from: l */
    private static List m120240l(Class cls) {
        List list;
        Map map = f97513u;
        synchronized (map) {
            list = (List) map.get(cls);
            if (list == null) {
                list = new ArrayList();
                for (Class cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m120235a(list, cls2.getInterfaces());
                }
                f97513u.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: n */
    private void m120241n(Object obj, C41441c cVar) {
        boolean z;
        Class<?> cls = obj.getClass();
        if (this.f97529p) {
            List l = m120240l(cls);
            int size = l.size();
            z = false;
            for (int i = 0; i < size; i++) {
                z |= m120242o(obj, cVar, (Class) l.get(i));
            }
        } else {
            z = m120242o(obj, cVar, cls);
        }
        if (!z) {
            if (this.f97526m) {
                this.f97531r.mo96194b(Level.FINE, "No subscribers registered for event " + cls);
            }
            if (this.f97528o && cls != C41448h.class && cls != C41453m.class) {
                mo96184m(new C41448h(this, obj));
            }
        }
    }

    /* renamed from: o */
    private boolean m120242o(Object obj, C41441c cVar, Class cls) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        synchronized (this) {
            copyOnWriteArrayList = (CopyOnWriteArrayList) this.f97514a.get(cls);
        }
        if (copyOnWriteArrayList == null || copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C41457p pVar = (C41457p) it.next();
            cVar.f97538e = obj;
            cVar.f97537d = pVar;
            try {
                m120243p(pVar, obj, cVar.f97536c);
                if (cVar.f97539f) {
                    return true;
                }
            } finally {
                cVar.f97538e = null;
                cVar.f97537d = null;
                cVar.f97539f = false;
            }
        }
        return true;
    }

    /* renamed from: p */
    private void m120243p(C41457p pVar, Object obj, boolean z) {
        int i = C41440b.f97533a[pVar.f97588b.f97570b.ordinal()];
        if (i == 1) {
            mo96182i(pVar, obj);
        } else if (i != 2) {
            if (i == 3) {
                C41451k kVar = this.f97519f;
                if (kVar != null) {
                    kVar.mo96175a(pVar, obj);
                } else {
                    mo96182i(pVar, obj);
                }
            } else if (i != 4) {
                if (i == 5) {
                    this.f97521h.mo96175a(pVar, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + pVar.f97588b.f97570b);
            } else if (z) {
                this.f97520g.mo96175a(pVar, obj);
            } else {
                mo96182i(pVar, obj);
            }
        } else if (z) {
            mo96182i(pVar, obj);
        } else {
            this.f97519f.mo96175a(pVar, obj);
        }
    }

    /* renamed from: r */
    private void m120244r(Object obj, C41454n nVar) {
        Class cls = nVar.f97571c;
        C41457p pVar = new C41457p(obj, nVar);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) this.f97514a.get(cls);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f97514a.put(cls, copyOnWriteArrayList);
        } else if (copyOnWriteArrayList.contains(pVar)) {
            throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
        }
        int size = copyOnWriteArrayList.size();
        int i = 0;
        while (true) {
            if (i > size) {
                break;
            } else if (i == size || nVar.f97572d > ((C41457p) copyOnWriteArrayList.get(i)).f97588b.f97572d) {
                copyOnWriteArrayList.add(i, pVar);
            } else {
                i++;
            }
        }
        copyOnWriteArrayList.add(i, pVar);
        List list = (List) this.f97515b.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f97515b.put(obj, list);
        }
        list.add(cls);
        if (!nVar.f97573e) {
            return;
        }
        if (this.f97529p) {
            for (Map.Entry entry : this.f97516c.entrySet()) {
                if (cls.isAssignableFrom((Class) entry.getKey())) {
                    m120236b(pVar, entry.getValue());
                }
            }
            return;
        }
        m120236b(pVar, this.f97516c.get(cls));
    }

    /* renamed from: t */
    private void m120245t(Object obj, Class cls) {
        List list = (List) this.f97514a.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                C41457p pVar = (C41457p) list.get(i);
                if (pVar.f97587a == obj) {
                    pVar.f97589c = false;
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ExecutorService mo96178d() {
        return this.f97523j;
    }

    /* renamed from: e */
    public C41444f mo96179e() {
        return this.f97531r;
    }

    /* renamed from: f */
    public Object mo96180f(Class cls) {
        Object cast;
        synchronized (this.f97516c) {
            cast = cls.cast(this.f97516c.get(cls));
        }
        return cast;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo96181h(C41449i iVar) {
        Object obj = iVar.f97560a;
        C41457p pVar = iVar.f97561b;
        C41449i.m120267b(iVar);
        if (pVar.f97589c) {
            mo96182i(pVar, obj);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo96182i(C41457p pVar, Object obj) {
        try {
            pVar.f97588b.f97569a.invoke(pVar.f97587a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            m120238g(pVar, obj, e.getCause());
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    /* renamed from: k */
    public synchronized boolean mo96183k(Object obj) {
        return this.f97515b.containsKey(obj);
    }

    /* renamed from: m */
    public void mo96184m(Object obj) {
        C41441c cVar = (C41441c) this.f97517d.get();
        List list = cVar.f97534a;
        list.add(obj);
        if (!cVar.f97535b) {
            cVar.f97536c = m120239j();
            cVar.f97535b = true;
            if (!cVar.f97539f) {
                while (!list.isEmpty()) {
                    try {
                        m120241n(list.remove(0), cVar);
                    } finally {
                        cVar.f97535b = false;
                        cVar.f97536c = false;
                    }
                }
                return;
            }
            throw new EventBusException("Internal error. Abort state was not reset");
        }
    }

    /* renamed from: q */
    public void mo96185q(Object obj) {
        if (!C41513b.m120419c() || C41513b.m120417a()) {
            List<C41454n> a = this.f97522i.mo96205a(obj.getClass());
            synchronized (this) {
                for (C41454n r : a) {
                    m120244r(obj, r);
                }
            }
            return;
        }
        throw new RuntimeException("It looks like you are using EventBus on Android, make sure to add the \"eventbus\" Android library to your dependencies.");
    }

    /* renamed from: s */
    public synchronized void mo96186s(Object obj) {
        List<Class> list = (List) this.f97515b.get(obj);
        if (list != null) {
            for (Class t : list) {
                m120245t(obj, t);
            }
            this.f97515b.remove(obj);
        } else {
            C41444f fVar = this.f97531r;
            Level level = Level.WARNING;
            fVar.mo96194b(level, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public String toString() {
        return "EventBus[indexCount=" + this.f97530q + ", eventInheritance=" + this.f97529p + "]";
    }

    C41438c(C41442d dVar) {
        this.f97517d = new C41439a();
        this.f97531r = dVar.mo96190a();
        this.f97514a = new HashMap();
        this.f97515b = new HashMap();
        this.f97516c = new ConcurrentHashMap();
        C41447g b = dVar.mo96191b();
        this.f97518e = b;
        this.f97519f = b != null ? b.mo96195a(this) : null;
        this.f97520g = new C41437b(this);
        this.f97521h = new C41436a(this);
        List list = dVar.f97550j;
        this.f97530q = list != null ? list.size() : 0;
        this.f97522i = new C41455o(dVar.f97550j, dVar.f97548h, dVar.f97547g);
        this.f97525l = dVar.f97541a;
        this.f97526m = dVar.f97542b;
        this.f97527n = dVar.f97543c;
        this.f97528o = dVar.f97544d;
        this.f97524k = dVar.f97545e;
        this.f97529p = dVar.f97546f;
        this.f97523j = dVar.f97549i;
    }
}
