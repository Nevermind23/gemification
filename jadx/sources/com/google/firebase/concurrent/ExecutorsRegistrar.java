package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import p314x8.C8976a;
import p314x8.C8977b;
import p314x8.C8978c;
import p314x8.C8979d;
import p326y8.C9102b0;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9134u;
import p338z8.C9251b;
import p338z8.C9252c;
import p338z8.C9253d;
import p338z8.C9254e;
import p338z8.C9255f;
import p338z8.C9256g;
import p338z8.C9257h;
import p338z8.C9258i;

@SuppressLint({"ThreadPoolCreation"})
public class ExecutorsRegistrar implements ComponentRegistrar {

    /* renamed from: a */
    static final C9134u f16810a = new C9134u(new C9251b());

    /* renamed from: b */
    static final C9134u f16811b = new C9134u(new C9252c());

    /* renamed from: c */
    static final C9134u f16812c = new C9134u(new C9253d());

    /* renamed from: d */
    static final C9134u f16813d = new C9134u(new C9254e());

    /* renamed from: i */
    private static StrictMode.ThreadPolicy m20714i() {
        StrictMode.ThreadPolicy.Builder detectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i = Build.VERSION.SDK_INT;
        detectNetwork.detectResourceMismatches();
        if (i >= 26) {
            StrictMode.ThreadPolicy.Builder unused = detectNetwork.detectUnbufferedIo();
        }
        return detectNetwork.penaltyLog().build();
    }

    /* renamed from: j */
    private static ThreadFactory m20715j(String str, int i) {
        return new C5245b(str, i, (StrictMode.ThreadPolicy) null);
    }

    /* renamed from: k */
    private static ThreadFactory m20716k(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        return new C5245b(str, i, threadPolicy);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static /* synthetic */ ScheduledExecutorService m20717l(C9110e eVar) {
        return (ScheduledExecutorService) f16810a.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static /* synthetic */ ScheduledExecutorService m20718m(C9110e eVar) {
        return (ScheduledExecutorService) f16812c.get();
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static /* synthetic */ ScheduledExecutorService m20719n(C9110e eVar) {
        return (ScheduledExecutorService) f16811b.get();
    }

    /* renamed from: t */
    private static StrictMode.ThreadPolicy m20725t() {
        return new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build();
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static ScheduledExecutorService m20726u(ExecutorService executorService) {
        return new C5258o(executorService, (ScheduledExecutorService) f16813d.get());
    }

    public List getComponents() {
        Class<C8976a> cls = C8976a.class;
        Class<ScheduledExecutorService> cls2 = ScheduledExecutorService.class;
        C9102b0 a = C9102b0.m33557a(cls, cls2);
        Class<ExecutorService> cls3 = ExecutorService.class;
        Class<Executor> cls4 = Executor.class;
        C9102b0[] b0VarArr = {C9102b0.m33557a(cls, cls3), C9102b0.m33557a(cls, cls4)};
        Class<C8977b> cls5 = C8977b.class;
        C9102b0 a2 = C9102b0.m33557a(cls5, cls2);
        C9102b0[] b0VarArr2 = {C9102b0.m33557a(cls5, cls3), C9102b0.m33557a(cls5, cls4)};
        Class<C8978c> cls6 = C8978c.class;
        return Arrays.asList(new C9104c[]{C9104c.m33564f(a, b0VarArr).mo24666f(new C9255f()).mo24664d(), C9104c.m33564f(a2, b0VarArr2).mo24666f(new C9256g()).mo24664d(), C9104c.m33564f(C9102b0.m33557a(cls6, cls2), C9102b0.m33557a(cls6, cls3), C9102b0.m33557a(cls6, cls4)).mo24666f(new C9257h()).mo24664d(), C9104c.m33563e(C9102b0.m33557a(C8979d.class, cls4)).mo24666f(new C9258i()).mo24664d()});
    }
}
