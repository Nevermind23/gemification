package zn0;

import ao0.C10121b;
import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p748eu.C20292b;
import p758fu.C20557a;
import p842nv.C26611d;
import p852ov.C27090d;
import ue1.C43079p;
import uo0.C18270b;
import vo0.C18489a;

/* renamed from: zn0.f */
public final class C19091f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C18489a f53261a;

    /* renamed from: b */
    private final C26611d f53262b;

    /* renamed from: c */
    private final C19088c f53263c;

    /* renamed from: d */
    private final C20292b f53264d;

    /* renamed from: zn0.f$a */
    static final class C19092a extends C41537m implements C43079p {

        /* renamed from: d */
        final /* synthetic */ C19091f f53265d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19092a(C19091f fVar) {
            super(2);
            this.f53265d = fVar;
        }

        /* renamed from: a */
        public final C18270b invoke(C27090d dVar, C10121b bVar) {
            C41536l.m120489i(dVar, "offerInfo");
            C41536l.m120489i(bVar, "logoList");
            return this.f53265d.f53261a.mo46277a(dVar, bVar);
        }
    }

    public C19091f(C18489a aVar, C26611d dVar, C19088c cVar, C20292b bVar) {
        C41536l.m120489i(aVar, "bnplUiMapper");
        C41536l.m120489i(dVar, "getBnplOfferInfo");
        C41536l.m120489i(cVar, "getBnplMerchantLogoList");
        C41536l.m120489i(bVar, "getAppSettingByNameUseCase");
        this.f53261a = aVar;
        this.f53262b = dVar;
        this.f53263c = cVar;
        this.f53264d = bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final C18270b m64442e(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (C18270b) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static final C18270b m64443f(C18270b bVar, Throwable th) {
        C41536l.m120489i(bVar, "$hiddenBnplUiModel");
        C41536l.m120489i(th, "it");
        return bVar;
    }

    /* renamed from: d */
    public final C40762x mo47294d() {
        boolean z;
        Boolean a;
        C20557a b = this.f53264d.mo48775b("BNPL_FEATURES_ENABLE");
        if (b == null || (a = b.mo49084a()) == null) {
            z = false;
        } else {
            z = a.booleanValue();
        }
        C18270b bVar = new C18270b(C41341q.m119907j(), C41341q.m119907j(), (String) null, (String) null, false, false);
        if (!z) {
            C40762x z2 = C40762x.m118162z(bVar);
            C41536l.m120488h(z2, "just(\n                hi…BnplUiModel\n            )");
            return z2;
        }
        C40762x D = C40762x.m118154T(this.f53262b.mo65866b(), this.f53263c.mo47293a(), new C19089d(new C19092a(this))).mo95065D(new C19090e(bVar));
        C41536l.m120488h(D, "operator fun invoke(): S…plUiModel\n        }\n    }");
        return D;
    }
}
