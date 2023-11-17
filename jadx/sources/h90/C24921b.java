package h90;

import g90.C20781c;
import g90.C20782d;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.FormData;
import p341ge.bog.mobilebank.consumerloanapplication.presentation.model.addincomes.IncomeType;

/* renamed from: h90.b */
public abstract class C24921b {
    /* renamed from: a */
    public static final C20782d m79667a(FormData formData) {
        C41536l.m120489i(formData, "<this>");
        String d = formData.mo56086d();
        String j = formData.mo56095j();
        C20781c f = formData.mo56090f();
        boolean p = formData.mo56099p();
        IncomeType g = formData.mo56091g();
        if (g == null) {
            return null;
        }
        return new C20782d(d, j, f, p, g, formData.mo56092h(), formData.mo56084a(), formData.mo56088e(), formData.mo56098m(), formData.mo56097l(), formData.mo56096k(), formData.mo56094i(), formData.mo56085b());
    }

    /* renamed from: b */
    public static final FormData m79668b(C20782d dVar) {
        C41536l.m120489i(dVar, "<this>");
        return new FormData(dVar.mo49336b(), dVar.mo49345i(), dVar.mo49338d(), dVar.mo49350n(), dVar.mo49341f(), dVar.mo49342g(), dVar.mo49339e(), dVar.mo49337c(), dVar.mo49348l(), dVar.mo49347k(), dVar.mo49346j(), dVar.mo49343h(), dVar.mo49335a());
    }
}
