package com.facetec.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.facetec.sdk.ai */
abstract class C2780ai {

    /* renamed from: a */
    protected static C2784ak f8825a = null;

    /* renamed from: c */
    static C2784ak f8826c = null;

    /* renamed from: d */
    static String f8827d = "";

    /* renamed from: e */
    static boolean f8828e = false;

    /* renamed from: f */
    static float f8829f = -1.0f;

    /* renamed from: g */
    static float f8830g = -1.0f;

    /* renamed from: h */
    private static C2784ak f8831h = null;

    /* renamed from: j */
    static int f8832j = 0;

    /* renamed from: o */
    private static /* synthetic */ boolean f8833o = true;

    /* renamed from: b */
    protected boolean f8834b = false;

    /* renamed from: i */
    protected boolean f8835i = true;

    /* renamed from: com.facetec.sdk.ai$c */
    static final class C2782c {

        /* renamed from: d */
        static final String[] f8840d = {"SM-J", "SM-G570", "SM-G611", "SM-C710", "SM-G615", "SM-G532", "SM-G610", "LM-G900", "SM-S767VL", "SM-A23", "23026RN54G", "23028RN4DG", "220733SG", "220733SI", "220733SL", "220743FI", "220733SH"};

        C2782c() {
        }
    }

    C2780ai() {
    }

    /* renamed from: a */
    static C2780ai m10759a(ViewGroup viewGroup, Activity activity, boolean z) {
        C2780ai aiVar;
        f8828e = z;
        if (!z) {
            C2808av.m10976b(activity);
        }
        if (!C2827ba.f9071d) {
            m10761b((Context) activity);
            if (!f8833o && f8825a == null) {
                throw new AssertionError();
            }
        } else {
            m10764c(activity);
            if (!f8833o && f8831h == null) {
                throw new AssertionError();
            }
        }
        if (mo8834i().booleanValue()) {
            aiVar = new C2771ae();
        } else if (z) {
            aiVar = C2783aj.m10785c(activity, true);
        } else if (m10766e((Context) activity).booleanValue()) {
            C2773ag agVar = new C2773ag(activity);
            C3280k.f10768d = 2;
            aiVar = agVar;
        } else {
            aiVar = C2783aj.m10785c(activity, false);
            C3280k.f10768d = 1;
        }
        View b = aiVar.mo8813b();
        viewGroup.addView(b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13, -1);
        b.setLayoutParams(layoutParams);
        if (Build.VERSION.SDK_INT < 24) {
            b.setBackgroundColor(0);
        }
        return aiVar;
    }

    /* renamed from: c */
    static synchronized void m10764c(Context context) {
        synchronized (C2780ai.class) {
            if (f8831h == null) {
                try {
                    f8831h = m10766e(context).booleanValue() ? C2773ag.m10740f(context) : C2783aj.m10797j();
                } catch (Exception e) {
                    C3555s.m13898c(context, C2867c.CAMERA_ERROR, e.toString());
                }
            }
        }
    }

    /* renamed from: d */
    static float m10765d() {
        C2784ak akVar = f8825a;
        if (akVar != null) {
            return ((float) akVar.f8862b) / ((float) akVar.f8861a);
        }
        return 1.7777778f;
    }

    /* renamed from: e */
    static Boolean m10766e(Context context) {
        for (String contains : C2782c.f8840d) {
            if (Build.MODEL.contains(contains)) {
                return Boolean.FALSE;
            }
        }
        if (!C2827ba.f9071d) {
            return Boolean.valueOf(C2773ag.m10729a(context));
        }
        return Boolean.valueOf(C2773ag.m10737d(context));
    }

    /* renamed from: f */
    static synchronized C2784ak m10767f() {
        C2784ak akVar;
        synchronized (C2780ai.class) {
            akVar = f8831h;
        }
        return akVar;
    }

    /* renamed from: i */
    private static Boolean mo8834i() {
        try {
            return Boolean.FALSE;
        } catch (Throwable unused) {
            return Boolean.FALSE;
        }
    }

    /* renamed from: a */
    public abstract void mo8811a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo8812a(boolean z, ViewGroup viewGroup);

    /* renamed from: b */
    public abstract View mo8813b();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo8814b(boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo8815d(ViewGroup viewGroup);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract void mo8816d(boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract void mo8817e();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized void m10761b(Context context) {
        synchronized (C2780ai.class) {
            if (f8825a == null) {
                try {
                    f8825a = m10766e(context).booleanValue() ? C2773ag.m10746j(context) : C2783aj.m10796h();
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: c */
    static synchronized C2784ak m10763c() {
        C2784ak akVar;
        synchronized (C2780ai.class) {
            akVar = f8825a;
        }
        return akVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo8831e(final Runnable runnable) {
        final Timer timer = new Timer();
        final Handler handler = new Handler(Looper.getMainLooper());
        C27814 r8 = new TimerTask() {
            public final void run() {
                if (C2780ai.this.f8834b) {
                    synchronized (timer) {
                        cancel();
                        handler.removeCallbacksAndMessages((Object) null);
                        handler.post(runnable);
                    }
                }
            }
        };
        timer.scheduleAtFixedRate(r8, 0, 100);
        handler.postDelayed(new C3449n0(timer, r8, runnable), 8000);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ void m10760a(Timer timer, TimerTask timerTask, Runnable runnable) {
        synchronized (timer) {
            timerTask.cancel();
            runnable.run();
        }
    }
}
