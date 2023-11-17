package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.collection.ArrayMap;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.C1505h;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2381c;
import com.bumptech.glide.C2387e;
import com.bumptech.glide.C2396k;
import com.bumptech.glide.load.resource.bitmap.C2489a0;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p089g4.C6223k;
import p089g4.C6224l;

/* renamed from: com.bumptech.glide.manager.r */
public class C2578r implements Handler.Callback {

    /* renamed from: k */
    private static final C2580b f8034k = new C2579a();

    /* renamed from: a */
    private volatile C2396k f8035a;

    /* renamed from: b */
    final Map f8036b = new HashMap();

    /* renamed from: c */
    final Map f8037c = new HashMap();

    /* renamed from: d */
    private final Handler f8038d;

    /* renamed from: e */
    private final C2580b f8039e;

    /* renamed from: f */
    private final ArrayMap f8040f = new ArrayMap();

    /* renamed from: g */
    private final ArrayMap f8041g = new ArrayMap();

    /* renamed from: h */
    private final Bundle f8042h = new Bundle();

    /* renamed from: i */
    private final C2568k f8043i;

    /* renamed from: j */
    private final C2571n f8044j;

    /* renamed from: com.bumptech.glide.manager.r$a */
    class C2579a implements C2580b {
        C2579a() {
        }

        /* renamed from: a */
        public C2396k mo8087a(C2379b bVar, C2569l lVar, C2581s sVar, Context context) {
            return new C2396k(bVar, lVar, sVar, context);
        }
    }

    /* renamed from: com.bumptech.glide.manager.r$b */
    public interface C2580b {
        /* renamed from: a */
        C2396k mo8087a(C2379b bVar, C2569l lVar, C2581s sVar, Context context);
    }

    public C2578r(C2580b bVar, C2387e eVar) {
        bVar = bVar == null ? f8034k : bVar;
        this.f8039e = bVar;
        this.f8038d = new Handler(Looper.getMainLooper(), this);
        this.f8044j = new C2571n(bVar);
        this.f8043i = m9898b(eVar);
    }

    /* renamed from: a */
    private static void m9897a(Activity activity) {
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    /* renamed from: b */
    private static C2568k m9898b(C2387e eVar) {
        if (!C2489a0.f7907h || !C2489a0.f7906g) {
            return new C2564g();
        }
        if (eVar.mo7710a(C2381c.C2385d.class)) {
            return new C2566i();
        }
        return new C2567j();
    }

    /* renamed from: c */
    private static Activity m9899c(Context context) {
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return m9899c(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    /* renamed from: d */
    private void m9900d(FragmentManager fragmentManager, ArrayMap arrayMap) {
        if (Build.VERSION.SDK_INT >= 26) {
            for (Fragment fragment : fragmentManager.getFragments()) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    m9900d(fragment.getChildFragmentManager(), arrayMap);
                }
            }
            return;
        }
        m9901e(fragmentManager, arrayMap);
    }

    /* renamed from: e */
    private void m9901e(FragmentManager fragmentManager, ArrayMap arrayMap) {
        Fragment fragment;
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.f8042h.putInt("key", i);
            try {
                fragment = fragmentManager.getFragment(this.f8042h, "key");
            } catch (Exception unused) {
                fragment = null;
            }
            if (fragment != null) {
                if (fragment.getView() != null) {
                    arrayMap.put(fragment.getView(), fragment);
                    m9900d(fragment.getChildFragmentManager(), arrayMap);
                }
                i = i2;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private static void m9902f(Collection collection, Map map) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                androidx.fragment.app.Fragment fragment = (androidx.fragment.app.Fragment) it.next();
                if (!(fragment == null || fragment.getView() == null)) {
                    map.put(fragment.getView(), fragment);
                    m9902f(fragment.getChildFragmentManager().mo4446y0(), map);
                }
            }
        }
    }

    /* renamed from: g */
    private Fragment m9903g(View view, Activity activity) {
        this.f8041g.clear();
        m9900d(activity.getFragmentManager(), this.f8041g);
        View findViewById = activity.findViewById(16908290);
        Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (Fragment) this.f8041g.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f8041g.clear();
        return fragment;
    }

    /* renamed from: h */
    private androidx.fragment.app.Fragment m9904h(View view, C1505h hVar) {
        this.f8040f.clear();
        m9902f(hVar.getSupportFragmentManager().mo4446y0(), this.f8040f);
        View findViewById = hVar.findViewById(16908290);
        androidx.fragment.app.Fragment fragment = null;
        while (!view.equals(findViewById) && (fragment = (androidx.fragment.app.Fragment) this.f8040f.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        this.f8040f.clear();
        return fragment;
    }

    /* renamed from: i */
    private C2396k m9905i(Context context, FragmentManager fragmentManager, Fragment fragment, boolean z) {
        C2575p r = m9907r(fragmentManager, fragment);
        C2396k e = r.mo8067e();
        if (e == null) {
            e = this.f8039e.mo8087a(C2379b.m9204c(context), r.mo8066c(), r.mo8068f(), context);
            if (z) {
                e.mo7289o();
            }
            r.mo8070k(e);
        }
        return e;
    }

    /* renamed from: p */
    private C2396k m9906p(Context context) {
        if (this.f8035a == null) {
            synchronized (this) {
                if (this.f8035a == null) {
                    this.f8035a = this.f8039e.mo8087a(C2379b.m9204c(context.getApplicationContext()), new C2558b(), new C2565h(), context.getApplicationContext());
                }
            }
        }
        return this.f8035a;
    }

    /* renamed from: r */
    private C2575p m9907r(FragmentManager fragmentManager, Fragment fragment) {
        C2575p pVar = (C2575p) this.f8036b.get(fragmentManager);
        if (pVar != null) {
            return pVar;
        }
        C2575p pVar2 = (C2575p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (pVar2 == null) {
            pVar2 = new C2575p();
            pVar2.mo8069j(fragment);
            this.f8036b.put(fragmentManager, pVar2);
            fragmentManager.beginTransaction().add(pVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
            this.f8038d.obtainMessage(1, fragmentManager).sendToTarget();
        }
        return pVar2;
    }

    /* renamed from: t */
    private C2596v m9908t(androidx.fragment.app.FragmentManager fragmentManager, androidx.fragment.app.Fragment fragment) {
        C2596v vVar = (C2596v) this.f8037c.get(fragmentManager);
        if (vVar != null) {
            return vVar;
        }
        C2596v vVar2 = (C2596v) fragmentManager.mo4418k0("com.bumptech.glide.manager");
        if (vVar2 == null) {
            vVar2 = new C2596v();
            vVar2.mo8116q1(fragment);
            this.f8037c.put(fragmentManager, vVar2);
            fragmentManager.mo4428p().mo4634e(vVar2, "com.bumptech.glide.manager").mo4516j();
            this.f8038d.obtainMessage(2, fragmentManager).sendToTarget();
        }
        return vVar2;
    }

    /* renamed from: u */
    private static boolean m9909u(Context context) {
        Activity c = m9899c(context);
        if (c == null || !c.isFinishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: v */
    private boolean m9910v(FragmentManager fragmentManager, boolean z) {
        C2575p pVar = (C2575p) this.f8036b.get(fragmentManager);
        C2575p pVar2 = (C2575p) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (pVar2 == pVar) {
            return true;
        }
        if (pVar2 != null && pVar2.mo8067e() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + pVar2 + " New: " + pVar);
        } else if (z || fragmentManager.isDestroyed()) {
            if (Log.isLoggable("RMRetriever", 5)) {
                if (fragmentManager.isDestroyed()) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added");
                } else {
                    Log.w("RMRetriever", "Tried adding Fragment twice and failed twice, giving up!");
                }
            }
            pVar.mo8066c().mo8054a();
            return true;
        } else {
            FragmentTransaction add = fragmentManager.beginTransaction().add(pVar, "com.bumptech.glide.manager");
            if (pVar2 != null) {
                add.remove(pVar2);
            }
            add.commitAllowingStateLoss();
            this.f8038d.obtainMessage(1, 1, 0, fragmentManager).sendToTarget();
            if (Log.isLoggable("RMRetriever", 3)) {
                Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
            }
            return false;
        }
    }

    /* renamed from: w */
    private boolean m9911w(androidx.fragment.app.FragmentManager fragmentManager, boolean z) {
        C2596v vVar = (C2596v) this.f8037c.get(fragmentManager);
        C2596v vVar2 = (C2596v) fragmentManager.mo4418k0("com.bumptech.glide.manager");
        if (vVar2 == vVar) {
            return true;
        }
        if (vVar2 != null && vVar2.mo8115l1() != null) {
            throw new IllegalStateException("We've added two fragments with requests! Old: " + vVar2 + " New: " + vVar);
        } else if (z || fragmentManager.mo4381L0()) {
            if (fragmentManager.mo4381L0()) {
                if (Log.isLoggable("RMRetriever", 5)) {
                    Log.w("RMRetriever", "Parent was destroyed before our Fragment could be added, all requests for the destroyed parent are cancelled");
                }
            } else if (Log.isLoggable("RMRetriever", 6)) {
                Log.e("RMRetriever", "ERROR: Tried adding Fragment twice and failed twice, giving up and cancelling all associated requests! This probably means you're starting loads in a unit test with an Activity that you haven't created and never create. If you're using Robolectric, create the Activity as part of your test setup");
            }
            vVar.mo8114j1().mo8054a();
            return true;
        } else {
            C1493e0 e = fragmentManager.mo4428p().mo4634e(vVar, "com.bumptech.glide.manager");
            if (vVar2 != null) {
                e.mo4522q(vVar2);
            }
            e.mo4518l();
            this.f8038d.obtainMessage(2, 1, 0, fragmentManager).sendToTarget();
            if (Log.isLoggable("RMRetriever", 3)) {
                Log.d("RMRetriever", "We failed to add our Fragment the first time around, trying again...");
            }
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: androidx.fragment.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v11, resolved type: android.app.FragmentManager} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v12, resolved type: android.app.FragmentManager} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r8.arg1
            r1 = 1
            r2 = 0
            if (r0 != r1) goto L_0x0008
            r0 = r1
            goto L_0x0009
        L_0x0008:
            r0 = r2
        L_0x0009:
            int r3 = r8.what
            r4 = 0
            if (r3 == r1) goto L_0x0025
            r5 = 2
            if (r3 == r5) goto L_0x0014
            r1 = r2
            r8 = r4
            goto L_0x003b
        L_0x0014:
            java.lang.Object r8 = r8.obj
            androidx.fragment.app.FragmentManager r8 = (androidx.fragment.app.FragmentManager) r8
            boolean r0 = r7.m9911w(r8, r0)
            if (r0 == 0) goto L_0x0037
            java.util.Map r0 = r7.f8037c
            java.lang.Object r4 = r0.remove(r8)
            goto L_0x0035
        L_0x0025:
            java.lang.Object r8 = r8.obj
            android.app.FragmentManager r8 = (android.app.FragmentManager) r8
            boolean r0 = r7.m9910v(r8, r0)
            if (r0 == 0) goto L_0x0037
            java.util.Map r0 = r7.f8036b
            java.lang.Object r4 = r0.remove(r8)
        L_0x0035:
            r2 = r1
            goto L_0x003b
        L_0x0037:
            r8 = r4
            r6 = r2
            r2 = r1
            r1 = r6
        L_0x003b:
            r0 = 5
            java.lang.String r3 = "RMRetriever"
            boolean r0 = android.util.Log.isLoggable(r3, r0)
            if (r0 == 0) goto L_0x005c
            if (r1 == 0) goto L_0x005c
            if (r4 != 0) goto L_0x005c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Failed to remove expected request manager fragment, manager: "
            r0.append(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            android.util.Log.w(r3, r8)
        L_0x005c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.manager.C2578r.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: j */
    public C2396k mo8079j(Activity activity) {
        if (C6224l.m24749r()) {
            return mo8081l(activity.getApplicationContext());
        }
        if (activity instanceof C1505h) {
            return mo8084o((C1505h) activity);
        }
        m9897a(activity);
        this.f8043i.mo8058a(activity);
        return m9905i(activity, activity.getFragmentManager(), (Fragment) null, m9909u(activity));
    }

    /* renamed from: k */
    public C2396k mo8080k(Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (C6224l.m24749r()) {
            return mo8081l(fragment.getActivity().getApplicationContext());
        } else {
            if (fragment.getActivity() != null) {
                this.f8043i.mo8058a(fragment.getActivity());
            }
            return m9905i(fragment.getActivity(), fragment.getChildFragmentManager(), fragment, fragment.isVisible());
        }
    }

    /* renamed from: l */
    public C2396k mo8081l(Context context) {
        if (context != null) {
            if (C6224l.m24750s() && !(context instanceof Application)) {
                if (context instanceof C1505h) {
                    return mo8084o((C1505h) context);
                }
                if (context instanceof Activity) {
                    return mo8079j((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    ContextWrapper contextWrapper = (ContextWrapper) context;
                    if (contextWrapper.getBaseContext().getApplicationContext() != null) {
                        return mo8081l(contextWrapper.getBaseContext());
                    }
                }
            }
            return m9906p(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    /* renamed from: m */
    public C2396k mo8082m(View view) {
        if (C6224l.m24749r()) {
            return mo8081l(view.getContext().getApplicationContext());
        }
        C6223k.m24730d(view);
        C6223k.m24731e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity c = m9899c(view.getContext());
        if (c == null) {
            return mo8081l(view.getContext().getApplicationContext());
        }
        if (c instanceof C1505h) {
            C1505h hVar = (C1505h) c;
            androidx.fragment.app.Fragment h = m9904h(view, hVar);
            if (h != null) {
                return mo8083n(h);
            }
            return mo8084o(hVar);
        }
        Fragment g = m9903g(view, c);
        if (g == null) {
            return mo8079j(c);
        }
        return mo8080k(g);
    }

    /* renamed from: n */
    public C2396k mo8083n(androidx.fragment.app.Fragment fragment) {
        C6223k.m24731e(fragment.getContext(), "You cannot start a load on a fragment before it is attached or after it is destroyed");
        if (C6224l.m24749r()) {
            return mo8081l(fragment.getContext().getApplicationContext());
        }
        if (fragment.getActivity() != null) {
            this.f8043i.mo8058a(fragment.getActivity());
        }
        androidx.fragment.app.FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        Context context = fragment.getContext();
        return this.f8044j.mo8064b(context, C2379b.m9204c(context.getApplicationContext()), fragment.getLifecycle(), childFragmentManager, fragment.isVisible());
    }

    /* renamed from: o */
    public C2396k mo8084o(C1505h hVar) {
        if (C6224l.m24749r()) {
            return mo8081l(hVar.getApplicationContext());
        }
        m9897a(hVar);
        this.f8043i.mo8058a(hVar);
        boolean u = m9909u(hVar);
        return this.f8044j.mo8064b(hVar, C2379b.m9204c(hVar.getApplicationContext()), hVar.getLifecycle(), hVar.getSupportFragmentManager(), u);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C2575p mo8085q(Activity activity) {
        return m9907r(activity.getFragmentManager(), (Fragment) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C2596v mo8086s(androidx.fragment.app.FragmentManager fragmentManager) {
        return m9908t(fragmentManager, (androidx.fragment.app.Fragment) null);
    }
}
