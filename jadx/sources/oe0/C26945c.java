package oe0;

import bf0.C19377b;
import cf0.C19736a;
import ed1.C40762x;
import he1.C41238w;
import java.util.concurrent.atomic.AtomicReference;
import je0.C25429w0;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import n41.C37353c;
import ne0.C26456a;
import p341ge.bog.mobilebank.galtandtaggart.data.onboarding.termsandconditions.model.DisclosureTypesApiModel;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import ue1.C43075l;

/* renamed from: oe0.c */
public final class C26945c implements C19736a {

    /* renamed from: d */
    private final C25429w0 f67719d;

    /* renamed from: e */
    private final C26456a f67720e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final PreferencesApiManager f67721f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final AtomicReference f67722g = new AtomicReference((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final AtomicReference f67723h = new AtomicReference((Object) null);

    /* renamed from: oe0.c$a */
    /* synthetic */ class C26946a extends C41535k implements C43075l {
        C26946a(Object obj) {
            super(1, obj, C26456a.class, "convert", "convert(Lge/bog/mobilebank/galtandtaggart/data/onboarding/termsandconditions/model/DisclosureTypesApiModel;)Lge/bog/mobilebank/galtandtaggart/domain/onboarding/termsandconditions/model/DisclosureTypesModel;", 0);
        }

        /* renamed from: b */
        public final C19377b invoke(DisclosureTypesApiModel disclosureTypesApiModel) {
            C41536l.m120489i(disclosureTypesApiModel, "p0");
            return ((C26456a) this.receiver).mo65754a(disclosureTypesApiModel);
        }
    }

    /* renamed from: oe0.c$b */
    static final class C26947b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C26945c f67724d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C26947b(C26945c cVar) {
            super(1);
            this.f67724d = cVar;
        }

        /* renamed from: a */
        public final void mo66229a(C19377b bVar) {
            this.f67724d.f67723h.set(this.f67724d.f67721f.getLanguage());
            this.f67724d.f67722g.set(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo66229a((C19377b) obj);
            return C41238w.f97225a;
        }
    }

    public C26945c(C25429w0 w0Var, C26456a aVar, PreferencesApiManager preferencesApiManager) {
        C41536l.m120489i(w0Var, "service");
        C41536l.m120489i(aVar, "disclosureTypeMapper");
        C41536l.m120489i(preferencesApiManager, "preferencesApiManager");
        this.f67719d = w0Var;
        this.f67720e = aVar;
        this.f67721f = preferencesApiManager;
    }

    /* access modifiers changed from: private */
    /* renamed from: e4 */
    public static final C19377b m83778e4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C19377b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f4 */
    public static final void m83779f4(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    public void clean() {
        this.f67722g.set((Object) null);
        this.f67723h.set((Object) null);
    }

    /* renamed from: n */
    public C40762x mo47940n() {
        C19377b bVar = (C19377b) this.f67722g.get();
        if (bVar != null && (!bVar.mo47596d().isEmpty())) {
            C37353c cVar = (C37353c) this.f67723h.get();
            if (cVar == null || cVar == this.f67721f.getLanguage()) {
                C40762x z = C40762x.m118162z(bVar);
                C41536l.m120488h(z, "just(disclosureTypes)");
                return z;
            }
            clean();
        }
        C40762x m = this.f67719d.mo64002n().mo95062A(new C26943a(new C26946a(this.f67720e))).mo95084m(new C26944b(new C26947b(this)));
        C41536l.m120488h(m, "override fun getDisclosu…t(it)\n            }\n    }");
        return m;
    }
}
