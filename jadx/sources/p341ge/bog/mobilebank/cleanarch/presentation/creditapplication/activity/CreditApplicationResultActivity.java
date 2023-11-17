package p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32303f;
import g91.C32307h;
import he1.C41217g;
import java.math.BigDecimal;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditOfferRefinanceUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.model.CreditResultData;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27469y;
import r90.C27950a;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditApplicationResultActivity */
public final class CreditApplicationResultActivity extends C30772sa {

    /* renamed from: H */
    public static final C21648a f57802H = new C21648a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f57803F = C41219i.m119470b(new C21650c(this));

    /* renamed from: G */
    private C27469y f57804G;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditApplicationResultActivity$a */
    public static final class C21648a {
        private C21648a() {
        }

        public /* synthetic */ C21648a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo54009a(Context context, CreditResultData creditResultData) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(creditResultData, "data");
            Intent intent = new Intent(context, CreditApplicationResultActivity.class);
            intent.putExtra("RESULT", creditResultData);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditApplicationResultActivity$b */
    public /* synthetic */ class C21649b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f57805a;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|1|2|3|4|5|6|7|8|9|10|11|12|13|15) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                uu.h[] r0 = p913uu.C28942h.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                uu.h r1 = p913uu.C28942h.NEW_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                uu.h r1 = p913uu.C28942h.NEW_CREDIT_CARD_WITH_REFINANCE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                uu.h r1 = p913uu.C28942h.REPLACE_CREDIT_CARD     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                uu.h r1 = p913uu.C28942h.REPLACE_CREDIT_CARD_WITH_REFINANCE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                uu.h r1 = p913uu.C28942h.INCREASE_CREDIT_CARD_LIMIT     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                uu.h r1 = p913uu.C28942h.INCREASE_CREDIT_CARD_LIMIT_WITH_REFINANCE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f57805a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditApplicationResultActivity.C21649b.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.creditapplication.activity.CreditApplicationResultActivity$c */
    static final class C21650c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CreditApplicationResultActivity f57806d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21650c(CreditApplicationResultActivity creditApplicationResultActivity) {
            super(0);
            this.f57806d = creditApplicationResultActivity;
        }

        /* renamed from: b */
        public final CreditResultData invoke() {
            Parcelable parcelableExtra = this.f57806d.getIntent().getParcelableExtra("RESULT");
            C41536l.m120486f(parcelableExtra);
            return (CreditResultData) parcelableExtra;
        }
    }

    /* renamed from: E2 */
    private final CreditResultData m70030E2() {
        return (CreditResultData) this.f57803F.getValue();
    }

    /* renamed from: F2 */
    private final String m70031F2() {
        String str;
        if (C41536l.m120484d(m70030E2().mo54124f(), OfferProductCode.C21017LC.f56476f)) {
            String string = getString(C10328q.credit_line_success_text);
            C41536l.m120488h(string, "{\n            getString(…e_success_text)\n        }");
            return string;
        }
        switch (C21649b.f57805a[m70030E2().mo54125g().ordinal()]) {
            case 1:
            case 2:
                str = getString(C10328q.offer_credit_card_order_completed);
                break;
            case 3:
            case 4:
                str = getString(C10328q.offer_increase_credit_card_limit_completed);
                break;
            case 5:
            case 6:
                str = getString(C10328q.offer_credit_card_order_completed);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        C41536l.m120488h(str, "{\n            when (resu…)\n            }\n        }");
        return str;
    }

    /* renamed from: G2 */
    private final void m70032G2(String str, String str2, String str3, int i) {
        String str4;
        C27469y yVar = this.f57804G;
        if (yVar == null) {
            C41536l.m120506z("binding");
            yVar = null;
        }
        SuccessScreenView successScreenView = yVar.f70243f;
        String string = getString(C10328q.f28926G1);
        if (str3 == null) {
            str4 = C27950a.m86287d(str2, false, 2, (Object) null);
        } else {
            str4 = str3;
        }
        int k = C32307h.m95234k(str);
        int dimensionPixelSize = getResources().getDimensionPixelSize(C10319h.credit_card_image_height_small);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(C10319h.credit_card_image_width_small);
        C41536l.m120488h(successScreenView, "successScreenView");
        C41536l.m120488h(string, "getString(R.string.common_text_card)");
        SuccessScreenView.addDetailsItem$default(successScreenView, string, str4, Integer.valueOf(k), i, Utils.FLOAT_EPSILON, 0, Integer.valueOf(dimensionPixelSize2), Integer.valueOf(dimensionPixelSize), (Image) null, BogInputLayout.INPUT_TYPE_TEXT_NO_SUGGESTIONS, (Object) null);
    }

    /* renamed from: H2 */
    static /* synthetic */ void m70033H2(CreditApplicationResultActivity creditApplicationResultActivity, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 4) != 0) {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            i = 1;
        }
        creditApplicationResultActivity.m70032G2(str, str2, str3, i);
    }

    /* renamed from: I2 */
    private final void m70034I2() {
        C27469y yVar = this.f57804G;
        if (yVar == null) {
            C41536l.m120506z("binding");
            yVar = null;
        }
        SuccessScreenView successScreenView = yVar.f70243f;
        successScreenView.setIcon(C10320i.ic_result_success);
        C41536l.m120488h(successScreenView, "setupSuccessScreen$lambda$2");
        SuccessScreenView.setTitle$default(successScreenView, m70031F2(), 0, 2, (Object) null);
        String string = getString(C10328q.f28936Q1);
        C41536l.m120488h(string, "getString(R.string.common_text_details)");
        successScreenView.addHeader(string);
        if (!(m70030E2().mo54120d() == null || m70030E2().mo54122e() == null)) {
            m70033H2(this, m70030E2().mo54120d(), m70030E2().mo54122e(), (String) null, 0, 12, (Object) null);
        }
        String string2 = getString(C10328q.credit_limit);
        C41536l.m120488h(string2, "getString(R.string.credit_limit)");
        String n = C32303f.m95203n(new BigDecimal(m70030E2().mo54119b()), m70030E2().mo54118a());
        C41536l.m120488h(n, "getFormattedAmount(resul…ecimal(), result.cardCcy)");
        SuccessScreenView.addDetailsItem$default(successScreenView, string2, n, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        List<CreditOfferRefinanceUiModel> h = m70030E2().mo54126h();
        if (h != null) {
            String string3 = getString(C10328q.offer_details_credit_card_refinance_title);
            C41536l.m120488h(string3, "getString(R.string.offer…dit_card_refinance_title)");
            successScreenView.addHeader(string3);
            for (CreditOfferRefinanceUiModel creditOfferRefinanceUiModel : h) {
                m70033H2(this, creditOfferRefinanceUiModel.mo54095u(), (String) null, creditOfferRefinanceUiModel.mo54089p(), 0, 2, (Object) null);
                String string4 = getString(C10328q.credit_limit);
                C41536l.m120488h(string4, "getString(R.string.credit_limit)");
                String n2 = C32303f.m95203n(new BigDecimal(creditOfferRefinanceUiModel.mo54080f()), creditOfferRefinanceUiModel.mo54081g());
                C41536l.m120488h(n2, "getFormattedAmount(\n    …                        )");
                SuccessScreenView.addDetailsItem$default(successScreenView, string4, n2, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
            }
        }
        String i = m70030E2().mo54128i();
        if (i != null) {
            String string5 = getString(C10328q.service_center);
            C41536l.m120488h(string5, "getString(R.string.service_center)");
            SuccessScreenView.addDetailsItem$default(successScreenView, string5, i, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_credit_application_result;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo37451O1(bundle);
        C27469y a = C27469y.m85182a(findViewById(C10322k.f28864lt));
        C41536l.m120488h(a, "bind(findViewById(R.id.root))");
        this.f57804G = a;
        m70034I2();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.enableIntercept();
    }
}
