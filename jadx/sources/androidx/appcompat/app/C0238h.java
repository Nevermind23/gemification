package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.C0260z;
import androidx.appcompat.view.C0264b;
import androidx.appcompat.widget.C0413c2;
import androidx.appcompat.widget.Toolbar;
import androidx.collection.ArraySet;
import androidx.core.p016os.C0904b;
import androidx.core.p016os.C0918j;
import com.salesforce.marketingcloud.storage.p385db.C11772k;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: androidx.appcompat.app.h */
public abstract class C0238h {

    /* renamed from: d */
    static C0260z.C0261a f1362d = new C0260z.C0261a(new C0260z.C0262b());

    /* renamed from: e */
    private static int f1363e = -100;

    /* renamed from: f */
    private static C0918j f1364f = null;

    /* renamed from: g */
    private static C0918j f1365g = null;

    /* renamed from: h */
    private static Boolean f1366h = null;

    /* renamed from: i */
    private static boolean f1367i = false;

    /* renamed from: j */
    private static final ArraySet f1368j = new ArraySet();

    /* renamed from: k */
    private static final Object f1369k = new Object();

    /* renamed from: l */
    private static final Object f1370l = new Object();

    /* renamed from: androidx.appcompat.app.h$a */
    static class C0239a {
        /* renamed from: a */
        static LocaleList m831a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* renamed from: androidx.appcompat.app.h$b */
    static class C0240b {
        /* renamed from: a */
        static LocaleList m832a(Object obj) {
            return C0241i.m834a(obj).getApplicationLocales();
        }

        /* renamed from: b */
        static void m833b(Object obj, LocaleList localeList) {
            C0241i.m834a(obj).setApplicationLocales(localeList);
        }
    }

    C0238h() {
    }

    /* renamed from: H */
    static void m786H(C0238h hVar) {
        synchronized (f1369k) {
            m787I(hVar);
        }
    }

    /* renamed from: I */
    private static void m787I(C0238h hVar) {
        synchronized (f1369k) {
            Iterator it = f1368j.iterator();
            while (it.hasNext()) {
                C0238h hVar2 = (C0238h) ((WeakReference) it.next()).get();
                if (hVar2 == hVar || hVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: K */
    public static void m788K(boolean z) {
        C0413c2.m1672c(z);
    }

    /* renamed from: O */
    public static void m789O(int i) {
        if (i != -1 && i != 0 && i != 1 && i != 2 && i != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (f1363e != i) {
            f1363e = i;
            m793g();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* renamed from: U */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void m790U(android.content.Context r3) {
        /*
            boolean r0 = m800x(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            boolean r0 = androidx.core.p016os.C0904b.m3331c()
            if (r0 == 0) goto L_0x001c
            boolean r0 = f1367i
            if (r0 != 0) goto L_0x0054
            androidx.appcompat.app.z$a r0 = f1362d
            androidx.appcompat.app.f r1 = new androidx.appcompat.app.f
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0054
        L_0x001c:
            java.lang.Object r0 = f1370l
            monitor-enter(r0)
            androidx.core.os.j r1 = f1364f     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0040
            androidx.core.os.j r1 = f1365g     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0031
            java.lang.String r3 = androidx.appcompat.app.C0260z.m876b(r3)     // Catch:{ all -> 0x0055 }
            androidx.core.os.j r3 = androidx.core.p016os.C0918j.m3351c(r3)     // Catch:{ all -> 0x0055 }
            f1365g = r3     // Catch:{ all -> 0x0055 }
        L_0x0031:
            androidx.core.os.j r3 = f1365g     // Catch:{ all -> 0x0055 }
            boolean r3 = r3.mo3366f()     // Catch:{ all -> 0x0055 }
            if (r3 == 0) goto L_0x003b
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            return
        L_0x003b:
            androidx.core.os.j r3 = f1365g     // Catch:{ all -> 0x0055 }
            f1364f = r3     // Catch:{ all -> 0x0055 }
            goto L_0x0053
        L_0x0040:
            androidx.core.os.j r2 = f1365g     // Catch:{ all -> 0x0055 }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0053
            androidx.core.os.j r1 = f1364f     // Catch:{ all -> 0x0055 }
            f1365g = r1     // Catch:{ all -> 0x0055 }
            java.lang.String r1 = r1.mo3368h()     // Catch:{ all -> 0x0055 }
            androidx.appcompat.app.C0260z.m875a(r3, r1)     // Catch:{ all -> 0x0055 }
        L_0x0053:
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
        L_0x0054:
            return
        L_0x0055:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0055 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.C0238h.m790U(android.content.Context):void");
    }

    /* renamed from: d */
    static void m792d(C0238h hVar) {
        synchronized (f1369k) {
            m787I(hVar);
            f1368j.add(new WeakReference(hVar));
        }
    }

    /* renamed from: g */
    private static void m793g() {
        synchronized (f1369k) {
            Iterator it = f1368j.iterator();
            while (it.hasNext()) {
                C0238h hVar = (C0238h) ((WeakReference) it.next()).get();
                if (hVar != null) {
                    hVar.mo469f();
                }
            }
        }
    }

    /* renamed from: j */
    public static C0238h m794j(Activity activity, C0227e eVar) {
        return new AppCompatDelegateImpl(activity, eVar);
    }

    /* renamed from: k */
    public static C0238h m795k(Dialog dialog, C0227e eVar) {
        return new AppCompatDelegateImpl(dialog, eVar);
    }

    /* renamed from: m */
    public static C0918j m796m() {
        if (C0904b.m3331c()) {
            Object r = m798r();
            if (r != null) {
                return C0918j.m3353i(C0240b.m832a(r));
            }
        } else {
            C0918j jVar = f1364f;
            if (jVar != null) {
                return jVar;
            }
        }
        return C0918j.m3352e();
    }

    /* renamed from: o */
    public static int m797o() {
        return f1363e;
    }

    /* renamed from: r */
    static Object m798r() {
        Context n;
        Iterator it = f1368j.iterator();
        while (it.hasNext()) {
            C0238h hVar = (C0238h) ((WeakReference) it.next()).get();
            if (hVar != null && (n = hVar.mo480n()) != null) {
                return n.getSystemService(C11772k.C11773a.f34182n);
            }
        }
        return null;
    }

    /* renamed from: t */
    static C0918j m799t() {
        return f1364f;
    }

    /* renamed from: x */
    static boolean m800x(Context context) {
        if (f1366h == null) {
            try {
                Bundle bundle = C0257x.m873a(context).metaData;
                if (bundle != null) {
                    f1366h = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f1366h = Boolean.FALSE;
            }
        }
        return f1366h.booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ void m801y(Context context) {
        C0260z.m877c(context);
        f1367i = true;
    }

    /* renamed from: A */
    public abstract void mo431A(Bundle bundle);

    /* renamed from: B */
    public abstract void mo432B();

    /* renamed from: C */
    public abstract void mo433C(Bundle bundle);

    /* renamed from: D */
    public abstract void mo434D();

    /* renamed from: E */
    public abstract void mo435E(Bundle bundle);

    /* renamed from: F */
    public abstract void mo437F();

    /* renamed from: G */
    public abstract void mo439G();

    /* renamed from: J */
    public abstract boolean mo442J(int i);

    /* renamed from: L */
    public abstract void mo445L(int i);

    /* renamed from: M */
    public abstract void mo446M(View view);

    /* renamed from: N */
    public abstract void mo448N(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: P */
    public void mo451P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    /* renamed from: Q */
    public abstract void mo452Q(Toolbar toolbar);

    /* renamed from: R */
    public abstract void mo454R(int i);

    /* renamed from: S */
    public abstract void mo455S(CharSequence charSequence);

    /* renamed from: T */
    public abstract C0264b mo456T(C0264b.C0265a aVar);

    /* renamed from: e */
    public abstract void mo467e(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: f */
    public abstract boolean mo469f();

    /* renamed from: h */
    public void mo699h(Context context) {
    }

    /* renamed from: i */
    public Context mo473i(Context context) {
        mo699h(context);
        return context;
    }

    /* renamed from: l */
    public abstract View mo477l(int i);

    /* renamed from: n */
    public abstract Context mo480n();

    /* renamed from: p */
    public abstract C0212b mo483p();

    /* renamed from: q */
    public abstract int mo485q();

    /* renamed from: s */
    public abstract MenuInflater mo487s();

    /* renamed from: u */
    public abstract C0209a mo488u();

    /* renamed from: v */
    public abstract void mo489v();

    /* renamed from: w */
    public abstract void mo491w();

    /* renamed from: z */
    public abstract void mo495z(Configuration configuration);
}
