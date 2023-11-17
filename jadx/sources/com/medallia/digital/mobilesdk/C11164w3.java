package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.medallia.digital.mobilesdk.w3 */
final class C11164w3 implements Application.ActivityLifecycleCallbacks, C10769c8 {

    /* renamed from: l */
    private static C11164w3 f32078l;

    /* renamed from: a */
    private int f32079a = 0;

    /* renamed from: b */
    private long f32080b;

    /* renamed from: c */
    private long f32081c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f32082d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ArrayList<C11171g> f32083e = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final ArrayList<C11172h> f32084f = new ArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final ArrayList<C11170f> f32085g = new ArrayList<>();

    /* renamed from: h */
    private Integer f32086h;

    /* renamed from: i */
    private String f32087i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f32088j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final List<Activity> f32089k = new ArrayList();

    /* renamed from: com.medallia.digital.mobilesdk.w3$a */
    class C11165a implements ComponentCallbacks2 {
        C11165a() {
        }

        public void onConfigurationChanged(Configuration configuration) {
            int i = C10884i4.m39721c().mo28483b().getResources().getConfiguration().orientation;
            if ((i == 1 || i == 2) && !C11164w3.this.f32082d && C11164w3.this.f32089k.size() > 0) {
                boolean unused = C11164w3.this.f32088j = true;
            }
        }

        public void onLowMemory() {
        }

        public void onTrimMemory(int i) {
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w3$b */
    class C11166b extends C11033o4 {

        /* renamed from: a */
        final /* synthetic */ long f32091a;

        C11166b(long j) {
            this.f32091a = j;
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C11164w3.this.f32083e != null) {
                Iterator it = C11164w3.this.f32083e.iterator();
                while (it.hasNext()) {
                    C11171g gVar = (C11171g) it.next();
                    if (gVar != null) {
                        gVar.mo28658a(this.f32091a);
                    }
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w3$c */
    class C11167c extends C11033o4 {
        C11167c() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C11164w3.this.f32084f != null) {
                Iterator it = C11164w3.this.f32084f.iterator();
                while (it.hasNext()) {
                    C11172h hVar = (C11172h) it.next();
                    if (hVar != null) {
                        hVar.onBackground();
                    }
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w3$d */
    class C11168d extends C11033o4 {
        C11168d() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C11164w3.this.f32084f != null) {
                Iterator it = C11164w3.this.f32084f.iterator();
                while (it.hasNext()) {
                    C11172h hVar = (C11172h) it.next();
                    if (hVar != null) {
                        hVar.onForeground();
                    }
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w3$e */
    class C11169e extends C11033o4 {
        C11169e() {
        }

        /* renamed from: a */
        public void mo27617a() {
            if (C11164w3.this.f32085g != null) {
                Iterator it = C11164w3.this.f32085g.iterator();
                while (it.hasNext()) {
                    C11170f fVar = (C11170f) it.next();
                    if (fVar != null) {
                        fVar.mo28344b();
                    }
                }
            }
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.w3$f */
    protected interface C11170f {
        /* renamed from: a */
        void mo28341a();

        /* renamed from: b */
        void mo28344b();
    }

    /* renamed from: com.medallia.digital.mobilesdk.w3$g */
    protected interface C11171g {
        /* renamed from: a */
        void mo28658a(long j);
    }

    /* renamed from: com.medallia.digital.mobilesdk.w3$h */
    protected interface C11172h {
        void onBackground();

        void onForeground();
    }

    private C11164w3() {
        m40948j();
    }

    /* renamed from: a */
    private String m40935a() {
        return this.f32087i;
    }

    /* renamed from: b */
    public static C11164w3 m40939b() {
        if (f32078l == null) {
            f32078l = new C11164w3();
        }
        return f32078l;
    }

    /* renamed from: g */
    private void m40945g() {
        C11004m7.m40304b().mo28763a().execute(new C11169e());
    }

    /* renamed from: h */
    private void m40946h() {
        C11004m7.m40304b().mo28763a().execute(new C11167c());
    }

    /* renamed from: i */
    private void m40947i() {
        C11004m7.m40304b().mo28763a().execute(new C11168d());
    }

    /* renamed from: j */
    private void m40948j() {
        try {
            C10884i4.m39721c().mo28481a().registerActivityLifecycleCallbacks(this);
            m40949k();
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: k */
    private void m40949k() {
        C10884i4.m39721c().mo28483b().registerComponentCallbacks(new C11165a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Long mo29118c() {
        if (this.f32080b == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f32080b);
    }

    public void clearAndDisconnect() {
        ArrayList<C11172h> arrayList = this.f32084f;
        if (arrayList != null) {
            arrayList.clear();
        }
        ArrayList<C11171g> arrayList2 = this.f32083e;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        mo29122l();
        f32078l = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Long mo29119d() {
        if (this.f32081c == 0) {
            return 0L;
        }
        return Long.valueOf(System.currentTimeMillis() - this.f32081c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo29121f() {
        return this.f32082d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo29122l() {
        try {
            C10884i4.m39721c().mo28481a().unregisterActivityLifecycleCallbacks(this);
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
        this.f32087i = activity.getClass().getName();
        this.f32086h = Integer.valueOf(activity.hashCode());
        int i = this.f32079a + 1;
        this.f32079a = i;
        if (i == 1) {
            m40941b(activity);
        }
        C10884i4.m39721c().mo28482a((Context) activity);
        this.f32088j = false;
    }

    public void onActivityDestroyed(Activity activity) {
    }

    public void onActivityPaused(Activity activity) {
        this.f32089k.remove(activity);
        if (!this.f32089k.isEmpty()) {
            C10884i4.m39721c().mo28482a((Context) this.f32089k.get(0));
            m40945g();
        }
    }

    public void onActivityResumed(Activity activity) {
        try {
            this.f32089k.add(activity);
            m40945g();
            this.f32087i = activity.getClass().getName();
            this.f32086h = Integer.valueOf(activity.hashCode());
            Context baseContext = C10884i4.m39721c().mo28484d().getBaseContext();
            if (baseContext != null && !baseContext.getClass().getName().equals(this.f32087i)) {
                C10884i4.m39721c().mo28482a((Context) activity);
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        Integer num = this.f32086h;
        if (num == null || num.intValue() != activity.hashCode() || this.f32079a < 1) {
            this.f32087i = activity.getClass().getName();
            this.f32086h = Integer.valueOf(activity.hashCode());
            int i = this.f32079a + 1;
            this.f32079a = i;
            if (i == 1 && (!this.f32088j || !activity.isChangingConfigurations())) {
                m40941b(activity);
            }
            this.f32088j = false;
            C10884i4.m39721c().mo28482a((Context) activity);
        }
    }

    public void onActivityStopped(Activity activity) {
        try {
            int i = this.f32079a - 1;
            this.f32079a = i;
            if (i == 0) {
                this.f32082d = true;
            }
            if (this.f32082d && (!this.f32088j || !activity.isChangingConfigurations())) {
                C10884i4.m39721c().mo28482a((Context) null);
                m40946h();
                this.f32080b = System.currentTimeMillis();
                this.f32081c = 0;
                this.f32086h = null;
                C10735b4.m39109b("Application is in background");
            }
            if (this.f32085g != null && this.f32089k.isEmpty()) {
                Iterator<C11170f> it = this.f32085g.iterator();
                while (it.hasNext()) {
                    C11170f next = it.next();
                    if (next != null) {
                        next.mo28341a();
                    }
                }
            }
        } catch (Exception e) {
            C10735b4.m39111c(e.getMessage());
        }
    }

    /* renamed from: a */
    private void m40936a(long j) {
        C11004m7.m40304b().mo28763a().execute(new C11166b(j));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo29120e() {
        return mo29114a("com.medallia.digital.mobilesdk.MedalliaFullFormActivity") || mo29114a("com.medallia.digital.mobilesdk.MedalliaModalFormActivity");
    }

    /* renamed from: b */
    private void m40941b(Activity activity) {
        if (this.f32082d) {
            this.f32082d = false;
            C10884i4.m39719a(activity.getApplication());
            m40936a(mo29118c().longValue());
            m40947i();
            this.f32081c = System.currentTimeMillis();
            this.f32080b = 0;
            C10735b4.m39109b("Application is in foreground");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29110a(Activity activity) {
        if (activity != null && this.f32086h == null) {
            this.f32079a++;
            this.f32087i = activity.getClass().getName();
            this.f32086h = Integer.valueOf(activity.hashCode());
            this.f32089k.add(activity);
            this.f32082d = false;
        }
    }

    /* renamed from: a */
    public void mo29111a(C11170f fVar) {
        ArrayList<C11170f> arrayList = this.f32085g;
        if (arrayList != null && fVar != null) {
            arrayList.add(fVar);
        }
    }

    /* renamed from: b */
    public void mo29115b(C11170f fVar) {
        ArrayList<C11170f> arrayList = this.f32085g;
        if (arrayList != null && fVar != null) {
            arrayList.remove(fVar);
        }
    }

    /* renamed from: a */
    public void mo29112a(C11171g gVar) {
        ArrayList<C11171g> arrayList = this.f32083e;
        if (arrayList != null && gVar != null) {
            arrayList.add(gVar);
        }
    }

    /* renamed from: b */
    public void mo29116b(C11171g gVar) {
        ArrayList<C11171g> arrayList = this.f32083e;
        if (arrayList != null && gVar != null) {
            arrayList.remove(gVar);
        }
    }

    /* renamed from: a */
    public void mo29113a(C11172h hVar) {
        if (hVar != null) {
            try {
                ArrayList<C11172h> arrayList = this.f32084f;
                if (arrayList != null) {
                    if (!arrayList.contains(hVar)) {
                        this.f32084f.add(hVar);
                    }
                }
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public void mo29117b(C11172h hVar) {
        if (hVar != null) {
            try {
                ArrayList<C11172h> arrayList = this.f32084f;
                if (arrayList != null) {
                    arrayList.remove(hVar);
                }
            } catch (Exception e) {
                C10735b4.m39111c(e.getMessage());
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo29114a(String str) {
        String a = m40935a();
        List<Activity> list = this.f32089k;
        if (list != null && !list.isEmpty()) {
            a = this.f32089k.get(0).getClass().getName();
        }
        return a != null && a.equals(str);
    }
}
