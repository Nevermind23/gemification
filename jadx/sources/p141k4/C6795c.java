package p141k4;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListView;
import com.facebook.C2626d;
import com.facebook.FacebookException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import p141k4.C6786a;
import p141k4.C6799d;
import p154l4.C6880a;
import p154l4.C6883b;
import p154l4.C6884c;
import p154l4.C6888f;
import p193o4.C7438b;
import p297w4.C8769a0;
import p297w4.C8817m;
import p297w4.C8819n;
import p297w4.C8828p;
import p334z4.C9207a;

/* renamed from: k4.c */
class C6795c {

    /* renamed from: f */
    private static final String f20425f = "k4.c";

    /* renamed from: g */
    private static C6795c f20426g;

    /* renamed from: a */
    private final Handler f20427a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    private Set f20428b = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: c */
    private Set f20429c = new HashSet();

    /* renamed from: d */
    private HashSet f20430d = new HashSet();

    /* renamed from: e */
    private HashMap f20431e = new HashMap();

    /* renamed from: k4.c$a */
    class C6796a implements Runnable {
        C6796a() {
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    C6795c.m26497a(C6795c.this);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    /* renamed from: k4.c$b */
    public static class C6797b {

        /* renamed from: a */
        private WeakReference f20433a;

        /* renamed from: b */
        private String f20434b;

        public C6797b(View view, String str) {
            this.f20433a = new WeakReference(view);
            this.f20434b = str;
        }

        /* renamed from: a */
        public View mo20857a() {
            WeakReference weakReference = this.f20433a;
            if (weakReference == null) {
                return null;
            }
            return (View) weakReference.get();
        }

        /* renamed from: b */
        public String mo20858b() {
            return this.f20434b;
        }
    }

    /* renamed from: k4.c$c */
    protected static class C6798c implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Runnable {

        /* renamed from: d */
        private WeakReference f20435d;

        /* renamed from: e */
        private List f20436e;

        /* renamed from: f */
        private final Handler f20437f;

        /* renamed from: g */
        private HashSet f20438g;

        /* renamed from: h */
        private final String f20439h;

        public C6798c(View view, Handler handler, HashSet hashSet, String str) {
            this.f20435d = new WeakReference(view);
            this.f20437f = handler;
            this.f20438g = hashSet;
            this.f20439h = str;
            handler.postDelayed(this, 200);
        }

        /* renamed from: a */
        private void m26508a(C6797b bVar, View view, C6880a aVar) {
            if (aVar != null) {
                try {
                    View a = bVar.mo20857a();
                    if (a != null) {
                        View a2 = C6888f.m26737a(a);
                        if (a2 != null && C6888f.m26752p(a, a2)) {
                            m26511d(bVar, view, aVar);
                        } else if (!a.getClass().getName().startsWith("com.facebook.react")) {
                            if (!(a instanceof AdapterView)) {
                                m26509b(bVar, view, aVar);
                            } else if (a instanceof ListView) {
                                m26510c(bVar, view, aVar);
                            }
                        }
                    }
                } catch (Exception e) {
                    C8769a0.m32648U(C6795c.m26498b(), e);
                }
            }
        }

        /* renamed from: b */
        private void m26509b(C6797b bVar, View view, C6880a aVar) {
            boolean z;
            View a = bVar.mo20857a();
            if (a != null) {
                String b = bVar.mo20858b();
                View.OnClickListener g = C6888f.m26743g(a);
                if (!(g instanceof C6786a.C6788b) || !((C6786a.C6788b) g).mo20846a()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f20438g.contains(b) && !z) {
                    a.setOnClickListener(C6786a.m26473b(aVar, view, a));
                    this.f20438g.add(b);
                }
            }
        }

        /* renamed from: c */
        private void m26510c(C6797b bVar, View view, C6880a aVar) {
            boolean z;
            AdapterView adapterView = (AdapterView) bVar.mo20857a();
            if (adapterView != null) {
                String b = bVar.mo20858b();
                AdapterView.OnItemClickListener onItemClickListener = adapterView.getOnItemClickListener();
                if (!(onItemClickListener instanceof C6786a.C6789c) || !((C6786a.C6789c) onItemClickListener).mo20848a()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f20438g.contains(b) && !z) {
                    adapterView.setOnItemClickListener(C6786a.m26474c(aVar, view, adapterView));
                    this.f20438g.add(b);
                }
            }
        }

        /* renamed from: d */
        private void m26511d(C6797b bVar, View view, C6880a aVar) {
            boolean z;
            View a = bVar.mo20857a();
            if (a != null) {
                String b = bVar.mo20858b();
                View.OnTouchListener h = C6888f.m26744h(a);
                if (!(h instanceof C6799d.C6800a) || !((C6799d.C6800a) h).mo20863a()) {
                    z = false;
                } else {
                    z = true;
                }
                if (!this.f20438g.contains(b) && !z) {
                    a.setOnTouchListener(C6799d.m26517a(aVar, view, a));
                    this.f20438g.add(b);
                }
            }
        }

        /* renamed from: f */
        public static List m26512f(C6880a aVar, View view, List list, int i, int i2, String str) {
            String str2 = str + "." + String.valueOf(i2);
            ArrayList arrayList = new ArrayList();
            if (view == null) {
                return arrayList;
            }
            if (i >= list.size()) {
                arrayList.add(new C6797b(view, str2));
            } else {
                C6884c cVar = (C6884c) list.get(i);
                if (cVar.f20624a.equals("..")) {
                    ViewParent parent = view.getParent();
                    if (parent instanceof ViewGroup) {
                        List g = m26513g((ViewGroup) parent);
                        int size = g.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList.addAll(m26512f(aVar, (View) g.get(i3), list, i + 1, i3, str2));
                        }
                    }
                    return arrayList;
                } else if (cVar.f20624a.equals(".")) {
                    arrayList.add(new C6797b(view, str2));
                    return arrayList;
                } else if (!m26514h(view, cVar, i2)) {
                    return arrayList;
                } else {
                    if (i == list.size() - 1) {
                        arrayList.add(new C6797b(view, str2));
                    }
                }
            }
            if (view instanceof ViewGroup) {
                List g2 = m26513g((ViewGroup) view);
                int size2 = g2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    arrayList.addAll(m26512f(aVar, (View) g2.get(i4), list, i + 1, i4, str2));
                }
            }
            return arrayList;
        }

        /* renamed from: g */
        private static List m26513g(ViewGroup viewGroup) {
            ArrayList arrayList = new ArrayList();
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    arrayList.add(childAt);
                }
            }
            return arrayList;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
            if (r5.getClass().getSimpleName().equals(r7[r7.length - 1]) == false) goto L_0x0041;
         */
        /* renamed from: h */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static boolean m26514h(android.view.View r5, p154l4.C6884c r6, int r7) {
            /*
                int r0 = r6.f20625b
                r1 = -1
                r2 = 0
                if (r0 == r1) goto L_0x0009
                if (r7 == r0) goto L_0x0009
                return r2
            L_0x0009:
                java.lang.Class r7 = r5.getClass()
                java.lang.String r7 = r7.getCanonicalName()
                java.lang.String r0 = r6.f20624a
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 != 0) goto L_0x0042
                java.lang.String r7 = r6.f20624a
                java.lang.String r1 = ".*android\\..*"
                boolean r7 = r7.matches(r1)
                if (r7 == 0) goto L_0x0041
                java.lang.String r7 = r6.f20624a
                java.lang.String r1 = "\\."
                java.lang.String[] r7 = r7.split(r1)
                int r1 = r7.length
                if (r1 <= 0) goto L_0x0041
                int r1 = r7.length
                int r1 = r1 - r0
                r7 = r7[r1]
                java.lang.Class r1 = r5.getClass()
                java.lang.String r1 = r1.getSimpleName()
                boolean r7 = r1.equals(r7)
                if (r7 != 0) goto L_0x0042
            L_0x0041:
                return r2
            L_0x0042:
                int r7 = r6.f20631h
                l4.c$a r1 = p154l4.C6884c.C6885a.ID
                int r1 = r1.mo20977a()
                r7 = r7 & r1
                if (r7 <= 0) goto L_0x0056
                int r7 = r6.f20626c
                int r1 = r5.getId()
                if (r7 == r1) goto L_0x0056
                return r2
            L_0x0056:
                int r7 = r6.f20631h
                l4.c$a r1 = p154l4.C6884c.C6885a.TEXT
                int r1 = r1.mo20977a()
                r7 = r7 & r1
                java.lang.String r1 = ""
                if (r7 <= 0) goto L_0x007e
                java.lang.String r7 = r6.f20627d
                java.lang.String r3 = p154l4.C6888f.m26747k(r5)
                java.lang.String r4 = p297w4.C8769a0.m32687q0(r3)
                java.lang.String r4 = p297w4.C8769a0.m32670i(r4, r1)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x007e
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x007e
                return r2
            L_0x007e:
                int r7 = r6.f20631h
                l4.c$a r3 = p154l4.C6884c.C6885a.DESCRIPTION
                int r3 = r3.mo20977a()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00b0
                java.lang.String r7 = r6.f20629f
                java.lang.CharSequence r3 = r5.getContentDescription()
                if (r3 != 0) goto L_0x0093
                r3 = r1
                goto L_0x009b
            L_0x0093:
                java.lang.CharSequence r3 = r5.getContentDescription()
                java.lang.String r3 = java.lang.String.valueOf(r3)
            L_0x009b:
                java.lang.String r4 = p297w4.C8769a0.m32687q0(r3)
                java.lang.String r4 = p297w4.C8769a0.m32670i(r4, r1)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00b0
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00b0
                return r2
            L_0x00b0:
                int r7 = r6.f20631h
                l4.c$a r3 = p154l4.C6884c.C6885a.HINT
                int r3 = r3.mo20977a()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x00d6
                java.lang.String r7 = r6.f20630g
                java.lang.String r3 = p154l4.C6888f.m26745i(r5)
                java.lang.String r4 = p297w4.C8769a0.m32687q0(r3)
                java.lang.String r4 = p297w4.C8769a0.m32670i(r4, r1)
                boolean r3 = r7.equals(r3)
                if (r3 != 0) goto L_0x00d6
                boolean r7 = r7.equals(r4)
                if (r7 != 0) goto L_0x00d6
                return r2
            L_0x00d6:
                int r7 = r6.f20631h
                l4.c$a r3 = p154l4.C6884c.C6885a.TAG
                int r3 = r3.mo20977a()
                r7 = r7 & r3
                if (r7 <= 0) goto L_0x0108
                java.lang.String r6 = r6.f20628e
                java.lang.Object r7 = r5.getTag()
                if (r7 != 0) goto L_0x00eb
                r5 = r1
                goto L_0x00f3
            L_0x00eb:
                java.lang.Object r5 = r5.getTag()
                java.lang.String r5 = java.lang.String.valueOf(r5)
            L_0x00f3:
                java.lang.String r7 = p297w4.C8769a0.m32687q0(r5)
                java.lang.String r7 = p297w4.C8769a0.m32670i(r7, r1)
                boolean r5 = r6.equals(r5)
                if (r5 != 0) goto L_0x0108
                boolean r5 = r6.equals(r7)
                if (r5 != 0) goto L_0x0108
                return r2
            L_0x0108:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p141k4.C6795c.C6798c.m26514h(android.view.View, l4.c, int):boolean");
        }

        /* renamed from: i */
        private void m26515i() {
            if (this.f20436e != null && this.f20435d.get() != null) {
                for (int i = 0; i < this.f20436e.size(); i++) {
                    mo20859e((C6880a) this.f20436e.get(i), (View) this.f20435d.get());
                }
            }
        }

        /* renamed from: e */
        public void mo20859e(C6880a aVar, View view) {
            if (aVar != null && view != null) {
                if (TextUtils.isEmpty(aVar.mo20973a()) || aVar.mo20973a().equals(this.f20439h)) {
                    List e = aVar.mo20976e();
                    if (e.size() <= 25) {
                        for (C6797b a : m26512f(aVar, view, e, 0, -1, this.f20439h)) {
                            m26508a(a, view, aVar);
                        }
                    }
                }
            }
        }

        public void onGlobalLayout() {
            m26515i();
        }

        public void onScrollChanged() {
            m26515i();
        }

        public void run() {
            View view;
            if (!C9207a.m34024c(this)) {
                try {
                    C8817m j = C8819n.m32843j(C2626d.m10135f());
                    if (j == null) {
                        return;
                    }
                    if (j.mo24239b()) {
                        List f = C6880a.m26721f(j.mo24241d());
                        this.f20436e = f;
                        if (f != null && (view = (View) this.f20435d.get()) != null) {
                            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                            if (viewTreeObserver.isAlive()) {
                                viewTreeObserver.addOnGlobalLayoutListener(this);
                                viewTreeObserver.addOnScrollChangedListener(this);
                            }
                            m26515i();
                        }
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    private C6795c() {
    }

    /* renamed from: a */
    static /* synthetic */ void m26497a(C6795c cVar) {
        Class<C6795c> cls = C6795c.class;
        if (!C9207a.m34024c(cls)) {
            try {
                cVar.m26501g();
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    static /* synthetic */ String m26498b() {
        Class<C6795c> cls = C6795c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            return f20425f;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: e */
    public static synchronized C6795c m26499e() {
        synchronized (C6795c.class) {
            if (C9207a.m34024c(C6795c.class)) {
                return null;
            }
            try {
                if (f20426g == null) {
                    f20426g = new C6795c();
                }
                C6795c cVar = f20426g;
                return cVar;
            } catch (Throwable th) {
                C9207a.m34023b(th, C6795c.class);
                return null;
            }
        }
    }

    /* renamed from: f */
    public static Bundle m26500f(C6880a aVar, View view, View view2) {
        List<C6883b> d;
        List list;
        Class<C6795c> cls = C6795c.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            if (!(aVar == null || (d = aVar.mo20975d()) == null)) {
                for (C6883b bVar : d) {
                    String str = bVar.f20621b;
                    if (str == null || str.length() <= 0) {
                        if (bVar.f20622c.size() > 0) {
                            if (bVar.f20623d.equals("relative")) {
                                list = C6798c.m26512f(aVar, view2, bVar.f20622c, 0, -1, view2.getClass().getSimpleName());
                            } else {
                                list = C6798c.m26512f(aVar, view, bVar.f20622c, 0, -1, view.getClass().getSimpleName());
                            }
                            Iterator it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                C6797b bVar2 = (C6797b) it.next();
                                if (bVar2.mo20857a() != null) {
                                    String k = C6888f.m26747k(bVar2.mo20857a());
                                    if (k.length() > 0) {
                                        bundle.putString(bVar.f20620a, k);
                                        break;
                                    }
                                }
                            }
                        }
                    } else {
                        bundle.putString(bVar.f20620a, bVar.f20621b);
                    }
                }
            }
            return bundle;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: g */
    private void m26501g() {
        if (!C9207a.m34024c(this)) {
            try {
                for (Activity activity : this.f20428b) {
                    if (activity != null) {
                        this.f20429c.add(new C6798c(C7438b.m28296e(activity), this.f20427a, this.f20430d, activity.getClass().getSimpleName()));
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: i */
    private void m26502i() {
        if (!C9207a.m34024c(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    m26501g();
                } else {
                    this.f20427a.post(new C6796a());
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: c */
    public void mo20853c(Activity activity) {
        if (!C9207a.m34024c(this)) {
            try {
                if (!C8828p.m32860b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.f20428b.add(activity);
                        this.f20430d.clear();
                        if (this.f20431e.containsKey(Integer.valueOf(activity.hashCode()))) {
                            this.f20430d = (HashSet) this.f20431e.get(Integer.valueOf(activity.hashCode()));
                        }
                        m26502i();
                        return;
                    }
                    throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: d */
    public void mo20854d(Activity activity) {
        if (!C9207a.m34024c(this)) {
            try {
                this.f20431e.remove(Integer.valueOf(activity.hashCode()));
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: h */
    public void mo20855h(Activity activity) {
        if (!C9207a.m34024c(this)) {
            try {
                if (!C8828p.m32860b()) {
                    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                        this.f20428b.remove(activity);
                        this.f20429c.clear();
                        this.f20431e.put(Integer.valueOf(activity.hashCode()), (HashSet) this.f20430d.clone());
                        this.f20430d.clear();
                        return;
                    }
                    throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }
}
