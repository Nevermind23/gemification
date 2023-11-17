package com.facetec.sdk;

import android.content.Context;
import android.os.Process;
import com.facetec.sdk.C2848bl;
import com.facetec.sdk.C3268ju;
import com.facetec.sdk.C3293kb;
import com.facetec.sdk.C3555s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facetec.sdk.m */
final class C3401m {

    /* renamed from: d */
    private static C3268ju f11206d;

    /* renamed from: e */
    private final Semaphore f11207e = new Semaphore(1);

    C3401m() {
    }

    /* renamed from: d */
    private static synchronized C3268ju m13557d() {
        C3268ju juVar;
        synchronized (C3401m.class) {
            if (f11206d == null) {
                f11206d = m13554c();
            }
            juVar = f11206d;
        }
        return juVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public /* synthetic */ void m13560e(Context context, C2784ak akVar) {
        Process.setThreadPriority(19);
        C3555s.m13897c((C2831bd) context, akVar, true, C2848bl.C2850d.FRONT, C2888cg.f9550b);
        this.f11207e.release();
    }

    /* renamed from: c */
    private static C3268ju m13554c() {
        C3268ju.C3270e eVar = new C3268ju.C3270e();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        eVar.f10719x = C3303ki.m13272e("timeout", timeUnit);
        eVar.f10694B = C3303ki.m13272e("timeout", timeUnit);
        eVar.f10695C = C3303ki.m13272e("timeout", timeUnit);
        return eVar.mo9534c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo9785a(Context context, C3555s.C3562d dVar) {
        C2831bd bdVar = (C2831bd) context;
        C3555s.m13906d(context, dVar);
        ArrayList<String> e = m13559e(dVar, true);
        if (dVar != C3555s.C3562d.USER_WAS_SUCCESSFUL) {
            Iterator<String> it = e.iterator();
            while (it.hasNext()) {
                C2885cd.m11770F(it.next());
            }
        }
        if (C3555s.m13894b()) {
            try {
                this.f11207e.acquire();
                C2920cv.m12196e(new C3647vj(this, dVar, context, (String) null, e));
            } catch (InterruptedException e2) {
                C3330l.m13346d(e2);
            }
        }
        m13555c(context);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo9786b() {
        Semaphore semaphore = this.f11207e;
        if (semaphore != null) {
            try {
                if (semaphore.tryAcquire(5, TimeUnit.SECONDS)) {
                    this.f11207e.release();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public /* synthetic */ void m13558d(C3555s.C3562d dVar, Context context, String str, ArrayList arrayList) {
        if (dVar != C3555s.C3562d.USER_CANCELLED) {
            Process.setThreadPriority(19);
        }
        C3555s.m13887a(context, str, arrayList, "", C3583t.FACE_SCAN, "");
        this.f11207e.release();
    }

    /* renamed from: e */
    private static ArrayList<String> m13559e(C3555s.C3562d dVar, boolean z) {
        boolean n = C2885cd.m11850n();
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(C2790am.f8908e);
        C2884cc ccVar = C2884cc.ZOOM_FAR;
        if (z) {
            ccVar = C2885cd.m11836f();
        }
        if (ccVar == C2884cc.PROCESSING_COMPLETE_SUCCESS) {
            arrayList.add(C2790am.f8906c);
        } else if (ccVar == C2884cc.PROCESSING_COMPLETE_RETRY) {
            arrayList.add(C2790am.f8904a);
        } else if (dVar == C3555s.C3562d.USER_CANCELLED) {
            arrayList.add(C2790am.f8905b);
            arrayList.add(C3555s.f11477c);
        } else if (dVar == C3555s.C3562d.SESSION_CONTEXT_SWITCH) {
            arrayList.add(C2790am.f8907d);
            arrayList.add(C3555s.f11477c);
        } else if (dVar == C3555s.C3562d.PRE_SESSION_PHASE_1_TIMEOUT) {
            arrayList.add(C2790am.f8919p);
            arrayList.add(C3555s.f11477c);
        } else if (dVar == C3555s.C3562d.PRE_SESSION_PHASE_2_TIMEOUT) {
            arrayList.add(C2790am.f8923t);
            arrayList.add(C3555s.f11477c);
        } else if (dVar == C3555s.C3562d.SESSION_TIMEOUT) {
            arrayList.add(C2790am.f8910g);
            arrayList.add(C3555s.f11477c);
        } else if (dVar == C3555s.C3562d.USER_WAS_SUCCESSFUL) {
            arrayList.add(C2790am.f8906c);
        } else {
            arrayList.add(C2790am.f8904a);
        }
        if (n) {
            arrayList.add(C2790am.f8911h);
        } else {
            arrayList.add(C2790am.f8912i);
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m13555c(Context context) {
        C2784ak akVar;
        if (C2750a.m10683b(context)) {
            try {
                if (C2780ai.m10766e(context).booleanValue()) {
                    akVar = C2780ai.f8826c;
                } else {
                    akVar = C2780ai.m10763c();
                }
                this.f11207e.acquire();
                C2920cv.m12196e(new C3689xj(this, context, akVar));
            } catch (InterruptedException e) {
                C3330l.m13346d(e);
            } catch (C2778ah e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo9788d(Context context, C3555s.C3562d dVar, String str, boolean z) {
        C2831bd bdVar = (C2831bd) context;
        C3555s.m13906d(context, dVar);
        ArrayList<String> e = m13559e(dVar, false);
        if (dVar != C3555s.C3562d.USER_WAS_SUCCESSFUL) {
            Iterator<String> it = e.iterator();
            while (it.hasNext()) {
                C2885cd.m11770F(it.next());
            }
        }
        if (C3555s.m13894b()) {
            try {
                this.f11207e.acquire();
                C2920cv.m12196e(new C3668wj(this, dVar, z, context, (String) null, e, str));
            } catch (InterruptedException e2) {
                C3330l.m13346d(e2);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m13552a(C3555s.C3562d dVar, boolean z, Context context, String str, ArrayList arrayList, String str2) {
        if (dVar != C3555s.C3562d.USER_CANCELLED) {
            Process.setThreadPriority(19);
        }
        C3555s.m13887a(context, str, arrayList, "", z ? C3583t.ID_SCAN_ONLY : C3583t.ID_SCAN_MATCH, str2);
        this.f11207e.release();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo9787c(Context context, FaceTecSessionResult faceTecSessionResult, String str) {
        C2999ed edVar = new C2999ed();
        edVar.mo9175e("faceScan", faceTecSessionResult.getFaceScanBase64());
        edVar.mo9175e("auditTrailImage", faceTecSessionResult.getAuditTrailCompressedBase64()[0]);
        edVar.mo9175e("lowQualityAuditTrailImage", faceTecSessionResult.getLowQualityAuditTrailCompressedBase64()[0]);
        if (C3555s.m13894b()) {
            m13557d().mo9507b(new C3293kb.C3294e().mo9597a("https://api.facetec.com/api/v3.1/biometrics/liveness-3d").mo9598a("Content-Type", "application/json").mo9598a("X-Device-Key", str).mo9598a("User-Agent", FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).mo9598a("X-User-Agent", FaceTecSDK.createFaceTecAPIUserAgentString(faceTecSessionResult.getSessionId())).mo9604e(C3297kd.m13213c(C3276jy.m13148c("application/json; charset=utf-8"), edVar.toString())).mo9599b()).mo9460b(new C3248jj() {
                /* renamed from: a */
                public final void mo8841a(C3295kc kcVar) {
                }

                /* renamed from: b */
                public final void mo8842b() {
                }
            });
        }
        m13555c(context);
    }
}
