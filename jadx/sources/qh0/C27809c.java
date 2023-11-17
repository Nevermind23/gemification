package qh0;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p748eu.C20292b;
import p748eu.C20294d;
import ue1.C43075l;
import wh0.C29418y;

/* renamed from: qh0.c */
public final class C27809c implements C29418y {

    /* renamed from: c */
    public static final C27810a f70938c = new C27810a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C20292b f70939a;

    /* renamed from: b */
    private final C20294d f70940b;

    /* renamed from: qh0.c$a */
    public static final class C27810a {
        private C27810a() {
        }

        public /* synthetic */ C27810a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: qh0.c$b */
    static final class C27811b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C27811b f70941d = new C27811b();

        C27811b() {
            super(1);
        }

        public final Boolean invoke(Boolean bool) {
            C41536l.m120489i(bool, "it");
            return bool;
        }
    }

    /* renamed from: qh0.c$c */
    static final class C27812c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C27809c f70942d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C27812c(C27809c cVar) {
            super(1);
            this.f70942d = cVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x0013, code lost:
            r2 = r2.mo49084a();
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.Boolean invoke(java.lang.Boolean r2) {
            /*
                r1 = this;
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C41536l.m120489i(r2, r0)
                qh0.c r2 = r1.f70942d
                eu.b r2 = r2.f70939a
                java.lang.String r0 = "SHOW_GIFTCARD"
                fu.a r2 = r2.mo48775b(r0)
                if (r2 == 0) goto L_0x001e
                java.lang.Boolean r2 = r2.mo49084a()
                if (r2 == 0) goto L_0x001e
                boolean r2 = r2.booleanValue()
                goto L_0x001f
            L_0x001e:
                r2 = 0
            L_0x001f:
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: qh0.C27809c.C27812c.invoke(java.lang.Boolean):java.lang.Boolean");
        }
    }

    public C27809c(C20292b bVar, C20294d dVar) {
        C41536l.m120489i(bVar, "getAppSettingByName");
        C41536l.m120489i(dVar, "settingsLoaded");
        this.f70939a = bVar;
        this.f70940b = dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final boolean m85986d(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return ((Boolean) lVar.invoke(obj)).booleanValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final Boolean m85987e(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Boolean) lVar.invoke(obj);
    }

    public C40762x invoke() {
        C40762x A = this.f70940b.mo48777a().mo94990M(new C27807a(C27811b.f70941d)).mo94996P().mo95062A(new C27808b(new C27812c(this)));
        C41536l.m120488h(A, "override fun invoke(): S…false\n            }\n    }");
        return A;
    }
}
