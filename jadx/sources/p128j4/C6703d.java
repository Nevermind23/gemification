package p128j4;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p115i4.C6564m;
import p193o4.C7438b;
import p334z4.C9207a;

/* renamed from: j4.d */
final class C6703d implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: h */
    private static final Map f20236h = new HashMap();

    /* renamed from: d */
    private final Set f20237d = new HashSet();

    /* renamed from: e */
    private final Handler f20238e;

    /* renamed from: f */
    private WeakReference f20239f;

    /* renamed from: g */
    private AtomicBoolean f20240g;

    /* renamed from: j4.d$a */
    class C6704a implements Runnable {

        /* renamed from: d */
        final /* synthetic */ View f20241d;

        C6704a(View view) {
            this.f20241d = view;
        }

        public void run() {
            if (!C9207a.m34024c(this)) {
                try {
                    View view = this.f20241d;
                    if (view instanceof EditText) {
                        C6703d.m26149a(C6703d.this, view);
                    }
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                }
            }
        }
    }

    private C6703d(Activity activity) {
        this.f20239f = new WeakReference(activity);
        this.f20238e = new Handler(Looper.getMainLooper());
        this.f20240g = new AtomicBoolean(false);
    }

    /* renamed from: a */
    static /* synthetic */ void m26149a(C6703d dVar, View view) {
        Class<C6703d> cls = C6703d.class;
        if (!C9207a.m34024c(cls)) {
            try {
                dVar.m26152d(view);
            } catch (Throwable th) {
                C9207a.m34023b(th, cls);
            }
        }
    }

    /* renamed from: b */
    private static String m26150b(String str, String str2) {
        Class<C6703d> cls = C6703d.class;
        if (C9207a.m34024c(cls)) {
            return null;
        }
        try {
            if ("r2".equals(str)) {
                return str2.replaceAll("[^\\d.]", "");
            }
            return str2;
        } catch (Throwable th) {
            C9207a.m34023b(th, cls);
            return null;
        }
    }

    /* renamed from: c */
    private void m26151c(View view) {
        if (!C9207a.m34024c(this)) {
            try {
                m26154f(new C6704a(view));
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: d */
    private void m26152d(View view) {
        if (!C9207a.m34024c(this)) {
            try {
                String lowerCase = ((EditText) view).getText().toString().trim().toLowerCase();
                if (!lowerCase.isEmpty() && !this.f20237d.contains(lowerCase)) {
                    if (lowerCase.length() <= 100) {
                        this.f20237d.add(lowerCase);
                        HashMap hashMap = new HashMap();
                        List b = C6701b.m26137b(view);
                        List list = null;
                        for (C6702c cVar : C6702c.m26144e()) {
                            String b2 = m26150b(cVar.mo20685d(), lowerCase);
                            if (cVar.mo20686f().isEmpty() || C6701b.m26141f(b2, cVar.mo20686f())) {
                                if (C6701b.m26140e(b, cVar.mo20684c())) {
                                    m26153e(hashMap, cVar.mo20685d(), b2);
                                } else {
                                    if (list == null) {
                                        list = C6701b.m26136a(view);
                                    }
                                    if (C6701b.m26140e(list, cVar.mo20684c())) {
                                        m26153e(hashMap, cVar.mo20685d(), b2);
                                    }
                                }
                            }
                        }
                        C6564m.m25886n(hashMap);
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m26153e(java.util.Map r8, java.lang.String r9, java.lang.String r10) {
        /*
            java.lang.String r0 = "-"
            java.lang.String r1 = "m"
            java.lang.Class<j4.d> r2 = p128j4.C6703d.class
            boolean r3 = p334z4.C9207a.m34024c(r2)
            if (r3 == 0) goto L_0x000d
            return
        L_0x000d:
            int r3 = r9.hashCode()     // Catch:{ all -> 0x0080 }
            r4 = 0
            r5 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case 3585: goto L_0x0037;
                case 3586: goto L_0x002d;
                case 3587: goto L_0x0023;
                case 3588: goto L_0x0019;
                default: goto L_0x0018;
            }     // Catch:{ all -> 0x0080 }
        L_0x0018:
            goto L_0x0041
        L_0x0019:
            java.lang.String r3 = "r6"
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0041
            r3 = r5
            goto L_0x0042
        L_0x0023:
            java.lang.String r3 = "r5"
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0041
            r3 = r6
            goto L_0x0042
        L_0x002d:
            java.lang.String r3 = "r4"
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0041
            r3 = r7
            goto L_0x0042
        L_0x0037:
            java.lang.String r3 = "r3"
            boolean r3 = r9.equals(r3)     // Catch:{ all -> 0x0080 }
            if (r3 == 0) goto L_0x0041
            r3 = r4
            goto L_0x0042
        L_0x0041:
            r3 = -1
        L_0x0042:
            if (r3 == 0) goto L_0x0061
            if (r3 == r7) goto L_0x0058
            if (r3 == r6) goto L_0x0058
            if (r3 == r5) goto L_0x004b
            goto L_0x007c
        L_0x004b:
            boolean r1 = r10.contains(r0)     // Catch:{ all -> 0x0080 }
            if (r1 == 0) goto L_0x007c
            java.lang.String[] r10 = r10.split(r0)     // Catch:{ all -> 0x0080 }
            r10 = r10[r4]     // Catch:{ all -> 0x0080 }
            goto L_0x007c
        L_0x0058:
            java.lang.String r0 = "[^a-z]+"
            java.lang.String r1 = ""
            java.lang.String r10 = r10.replaceAll(r0, r1)     // Catch:{ all -> 0x0080 }
            goto L_0x007c
        L_0x0061:
            boolean r0 = r10.startsWith(r1)     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "b"
            boolean r0 = r10.startsWith(r0)     // Catch:{ all -> 0x0080 }
            if (r0 != 0) goto L_0x007b
            java.lang.String r0 = "ge"
            boolean r10 = r10.startsWith(r0)     // Catch:{ all -> 0x0080 }
            if (r10 == 0) goto L_0x0078
            goto L_0x007b
        L_0x0078:
            java.lang.String r10 = "f"
            goto L_0x007c
        L_0x007b:
            r10 = r1
        L_0x007c:
            r8.put(r9, r10)     // Catch:{ all -> 0x0080 }
            return
        L_0x0080:
            r8 = move-exception
            p334z4.C9207a.m34023b(r8, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p128j4.C6703d.m26153e(java.util.Map, java.lang.String, java.lang.String):void");
    }

    /* renamed from: f */
    private void m26154f(Runnable runnable) {
        if (!C9207a.m34024c(this)) {
            try {
                if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    runnable.run();
                } else {
                    this.f20238e.post(runnable);
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* renamed from: g */
    private void m26155g() {
        View e;
        if (!C9207a.m34024c(this)) {
            try {
                if (!this.f20240g.getAndSet(true) && (e = C7438b.m28296e((Activity) this.f20239f.get())) != null) {
                    ViewTreeObserver viewTreeObserver = e.getViewTreeObserver();
                    if (viewTreeObserver.isAlive()) {
                        viewTreeObserver.addOnGlobalFocusChangeListener(this);
                    }
                }
            } catch (Throwable th) {
                C9207a.m34023b(th, this);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: j4.d} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m26156h(android.app.Activity r4) {
        /*
            java.lang.Class<j4.d> r0 = p128j4.C6703d.class
            boolean r1 = p334z4.C9207a.m34024c(r0)
            if (r1 == 0) goto L_0x0009
            return
        L_0x0009:
            int r1 = r4.hashCode()     // Catch:{ all -> 0x0039 }
            java.util.Map r2 = f20236h     // Catch:{ all -> 0x0039 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0039 }
            boolean r3 = r2.containsKey(r3)     // Catch:{ all -> 0x0039 }
            if (r3 != 0) goto L_0x002a
            j4.d r1 = new j4.d     // Catch:{ all -> 0x0039 }
            r1.<init>(r4)     // Catch:{ all -> 0x0039 }
            int r4 = r4.hashCode()     // Catch:{ all -> 0x0039 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0039 }
            r2.put(r4, r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0035
        L_0x002a:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x0039 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0039 }
            r1 = r4
            j4.d r1 = (p128j4.C6703d) r1     // Catch:{ all -> 0x0039 }
        L_0x0035:
            r1.m26155g()     // Catch:{ all -> 0x0039 }
            return
        L_0x0039:
            r4 = move-exception
            p334z4.C9207a.m34023b(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p128j4.C6703d.m26156h(android.app.Activity):void");
    }

    public void onGlobalFocusChanged(View view, View view2) {
        if (!C9207a.m34024c(this)) {
            if (view != null) {
                try {
                    m26151c(view);
                } catch (Throwable th) {
                    C9207a.m34023b(th, this);
                    return;
                }
            }
            if (view2 != null) {
                m26151c(view2);
            }
        }
    }
}
