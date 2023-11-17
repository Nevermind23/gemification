package com.google.firebase.ktx;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import ef1.C40793d0;
import ef1.C40811g1;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.C41536l;
import p238ra.C8085h;
import p314x8.C8976a;
import p314x8.C8977b;
import p314x8.C8978c;
import p314x8.C8979d;
import p326y8.C9102b0;
import p326y8.C9104c;
import p326y8.C9110e;
import p326y8.C9116h;
import p326y8.C9131r;

@Keep
public final class FirebaseCommonKtxRegistrar implements ComponentRegistrar {

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$a */
    public static final class C5294a implements C9116h {

        /* renamed from: a */
        public static final C5294a f16937a = new C5294a();

        /* renamed from: b */
        public final C40793d0 mo129a(C9110e eVar) {
            Object c = eVar.mo24670c(C9102b0.m33557a(C8976a.class, Executor.class));
            C41536l.m120488h(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C40811g1.m118297a((Executor) c);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$b */
    public static final class C5295b implements C9116h {

        /* renamed from: a */
        public static final C5295b f16938a = new C5295b();

        /* renamed from: b */
        public final C40793d0 mo129a(C9110e eVar) {
            Object c = eVar.mo24670c(C9102b0.m33557a(C8978c.class, Executor.class));
            C41536l.m120488h(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C40811g1.m118297a((Executor) c);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$c */
    public static final class C5296c implements C9116h {

        /* renamed from: a */
        public static final C5296c f16939a = new C5296c();

        /* renamed from: b */
        public final C40793d0 mo129a(C9110e eVar) {
            Object c = eVar.mo24670c(C9102b0.m33557a(C8977b.class, Executor.class));
            C41536l.m120488h(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C40811g1.m118297a((Executor) c);
        }
    }

    /* renamed from: com.google.firebase.ktx.FirebaseCommonKtxRegistrar$d */
    public static final class C5297d implements C9116h {

        /* renamed from: a */
        public static final C5297d f16940a = new C5297d();

        /* renamed from: b */
        public final C40793d0 mo129a(C9110e eVar) {
            Object c = eVar.mo24670c(C9102b0.m33557a(C8979d.class, Executor.class));
            C41536l.m120488h(c, "c.get(Qualified.qualifie…a, Executor::class.java))");
            return C40811g1.m118297a((Executor) c);
        }
    }

    public List<C9104c> getComponents() {
        Class<C8976a> cls = C8976a.class;
        Class<C40793d0> cls2 = C40793d0.class;
        Class<Executor> cls3 = Executor.class;
        C9104c d = C9104c.m33563e(C9102b0.m33557a(cls, cls2)).mo24662b(C9131r.m33672k(C9102b0.m33557a(cls, cls3))).mo24666f(C5294a.f16937a).mo24664d();
        C41536l.m120488h(d, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<C8978c> cls4 = C8978c.class;
        C9104c d2 = C9104c.m33563e(C9102b0.m33557a(cls4, cls2)).mo24662b(C9131r.m33672k(C9102b0.m33557a(cls4, cls3))).mo24666f(C5295b.f16938a).mo24664d();
        C41536l.m120488h(d2, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<C8977b> cls5 = C8977b.class;
        C9104c d3 = C9104c.m33563e(C9102b0.m33557a(cls5, cls2)).mo24662b(C9131r.m33672k(C9102b0.m33557a(cls5, cls3))).mo24666f(C5296c.f16939a).mo24664d();
        C41536l.m120488h(d3, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        Class<C8979d> cls6 = C8979d.class;
        C9104c d4 = C9104c.m33563e(C9102b0.m33557a(cls6, cls2)).mo24662b(C9131r.m33672k(C9102b0.m33557a(cls6, cls3))).mo24666f(C5297d.f16940a).mo24664d();
        C41536l.m120488h(d4, "builder(Qualified.qualif…cher()\n    }\n    .build()");
        return C41341q.m119910m(C8085h.m30616b("fire-core-ktx", "20.3.2"), d, d2, d3, d4);
    }
}
