package p878rr;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.RateTypeUiModel;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.Summary;
import p828mr.C26258b;
import p828mr.C26259c;
import p828mr.C26263g;
import p828mr.C26264h;
import p888sr.C28256b;

/* renamed from: rr.b */
public final class C28064b {

    /* renamed from: rr.b$a */
    public /* synthetic */ class C28065a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f71412a;

        static {
            int[] iArr = new int[C26264h.values().length];
            try {
                iArr[C26264h.PERCENTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f71412a = iArr;
        }
    }

    /* renamed from: a */
    private final InsuranceInfoUiModel m86489a(C26258b bVar) {
        return new InsuranceInfoUiModel(bVar.mo65365a(), bVar.mo65366b(), m86490c(bVar.mo65367c()));
    }

    /* renamed from: c */
    private final RateTypeUiModel m86490c(C26264h hVar) {
        if (C28065a.f71412a[hVar.ordinal()] == 1) {
            return RateTypeUiModel.PERCENTAGE;
        }
        return RateTypeUiModel.AMOUNT;
    }

    /* renamed from: b */
    public final ProviderInfoUiModel mo67615b(C26263g gVar) {
        InsuranceInfoUiModel insuranceInfoUiModel;
        InsuranceInfoUiModel insuranceInfoUiModel2;
        String str;
        C41536l.m120489i(gVar, "info");
        C26258b a = gVar.mo65414a();
        if (a != null) {
            insuranceInfoUiModel = m86489a(a);
        } else {
            insuranceInfoUiModel = null;
        }
        C26258b b = gVar.mo65415b();
        if (b != null) {
            insuranceInfoUiModel2 = m86489a(b);
        } else {
            insuranceInfoUiModel2 = null;
        }
        String c = gVar.mo65416c();
        String language = Locale.getDefault().getLanguage();
        C41536l.m120488h(language, "getDefault().language");
        if (C40440x.m117139M(language, "ka", false, 2, (Object) null)) {
            str = gVar.mo65417d();
        } else {
            str = gVar.mo65418e();
        }
        return new ProviderInfoUiModel(insuranceInfoUiModel, insuranceInfoUiModel2, c, str);
    }

    /* renamed from: d */
    public final C28256b mo67616d(C26259c cVar) {
        C41536l.m120489i(cVar, "entity");
        LimitLoanDecisionDetails a = cVar.mo65371a();
        Summary h = cVar.mo65379h();
        List b = cVar.mo65372b();
        List e = cVar.mo65375e();
        List c = cVar.mo65373c();
        List g = cVar.mo65378g();
        int f = cVar.mo65377f();
        List<C26263g> d = cVar.mo65374d();
        ArrayList arrayList = new ArrayList(C41343r.m119925u(d, 10));
        for (C26263g b2 : d) {
            arrayList.add(mo67615b(b2));
        }
        return new C28256b(a, h, b, e, c, g, f, arrayList);
    }
}
