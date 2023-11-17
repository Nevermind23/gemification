package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation;

import android.content.Context;
import android.content.Intent;
import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32343x;
import hd1.C41205b;
import he1.C41217g;
import he1.C41238w;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.mobilebank.p975ui.model.offer.ConsumerLoanActivationResult;
import p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p848or.C27059a;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity */
public final class ConsumerLoanActivationResultActivity extends C20934c {

    /* renamed from: I */
    public static final C20875a f56181I = new C20875a((DefaultConstructorMarker) null);

    /* renamed from: G */
    public C29742a f56182G;

    /* renamed from: H */
    private final C41217g f56183H = C41219i.m119470b(new C20877c(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity$a */
    public static final class C20875a {
        private C20875a() {
        }

        public /* synthetic */ C20875a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m67564b(C20875a aVar, Context context, ConsumerLoanActivationResult consumerLoanActivationResult, boolean z, int i, Object obj) {
            if ((i & 4) != 0) {
                z = false;
            }
            aVar.mo49764a(context, consumerLoanActivationResult, z);
        }

        /* renamed from: a */
        public final void mo49764a(Context context, ConsumerLoanActivationResult consumerLoanActivationResult, boolean z) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(consumerLoanActivationResult, "result");
            Intent intent = new Intent(context, ConsumerLoanActivationResultActivity.class);
            intent.putExtra("LOAN_DECISION_RESULT", consumerLoanActivationResult);
            intent.putExtra("EXPRESS_LOAN_FLAG", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity$b */
    static final class C20876b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanActivationResultActivity f56184d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20876b(ConsumerLoanActivationResultActivity consumerLoanActivationResultActivity) {
            super(1);
            this.f56184d = consumerLoanActivationResultActivity;
        }

        /* renamed from: a */
        public final void mo49765a(C30003b bVar) {
            if (bVar.mo70300c()) {
                ConsumerLoanActivationResultActivity consumerLoanActivationResultActivity = this.f56184d;
                C41536l.m120488h(bVar, "info");
                consumerLoanActivationResultActivity.m67560L2(bVar);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49765a((C30003b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity$c */
    static final class C20877c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanActivationResultActivity f56185d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20877c(ConsumerLoanActivationResultActivity consumerLoanActivationResultActivity) {
            super(0);
            this.f56185d = consumerLoanActivationResultActivity;
        }

        /* renamed from: b */
        public final SuccessScreenView invoke() {
            return (SuccessScreenView) this.f56185d.findViewById(C10322k.successScreen);
        }
    }

    /* renamed from: G2 */
    private final void m67556G2(ConsumerLoanActivationResult consumerLoanActivationResult) {
        String str;
        String str2;
        boolean z;
        boolean z2 = true;
        List m = C41341q.m119910m(consumerLoanActivationResult.mo86840l(), consumerLoanActivationResult.mo86833f(), consumerLoanActivationResult.mo86831e(), consumerLoanActivationResult.mo86842p());
        if (!(m instanceof Collection) || !m.isEmpty()) {
            Iterator it = m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (it.next() != null) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    break;
                }
            }
        }
        z2 = false;
        if (z2) {
            m67559K2().addHeader(C32343x.m95388F("offers.loan.details.insurance.block.header", new Object[0]));
        }
        Boolean e = consumerLoanActivationResult.mo86831e();
        if (C41536l.m120484d(e, Boolean.TRUE)) {
            str = C32343x.m95388F("offers.loan.details.insurance.block.field.label.payment.insurance.Y", new Object[0]);
        } else if (C41536l.m120484d(e, Boolean.FALSE)) {
            str = C32343x.m95388F("offers.loan.details.insurance.block.field.label.payment.insurance.N", new Object[0]);
        } else {
            String l = consumerLoanActivationResult.mo86840l();
            if (C41536l.m120484d(l, "Y")) {
                str = getString(C10328q.f28966r2);
            } else if (C41536l.m120484d(l, "N")) {
                str = getString(C10328q.f28951b2);
            } else {
                str = null;
            }
        }
        String str3 = str;
        if (str3 != null) {
            SuccessScreenView K2 = m67559K2();
            String string = getString(C10328q.loan_offer_credit_insurance);
            C41536l.m120488h(string, "getString(R.string.loan_offer_credit_insurance)");
            SuccessScreenView.addDetailsItem$default(K2, string, str3, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        }
        Boolean f = consumerLoanActivationResult.mo86833f();
        if (f != null) {
            if (f.booleanValue()) {
                str2 = "offers.loan.details.insurance.block.field.label.life.insurance.Y";
            } else {
                str2 = "offers.loan.details.insurance.block.field.label.life.insurance.N";
            }
            SuccessScreenView.addDetailsItem$default(m67559K2(), C32343x.m95388F("offers.loan.details.insurance.block.field.label.life.insurance", new Object[0]), C32343x.m95388F(str2, new Object[0]), (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        }
        String p = consumerLoanActivationResult.mo86842p();
        if (p != null) {
            SuccessScreenView.addDetailsItem$default(m67559K2(), C32343x.m95388F("offers.loan.details.insurance.block.field.label.insurance.provider", new Object[0]), p, (Integer) null, 0, Utils.FLOAT_EPSILON, 0, (Integer) null, (Integer) null, (Image) null, 508, (Object) null);
        }
    }

    /* renamed from: H2 */
    private final void m67557H2() {
        C41205b H = C32343x.m95465l1(mo49763J2().mo47470a(C29991a.C29994c.C29999e.f75811e)).mo95069H(new C27059a(new C20876b(this)));
        C41536l.m120488h(H, "private fun checkEndYear…  }\n            })\n\n    }");
        mo86438k1(H);
    }

    /* access modifiers changed from: private */
    /* renamed from: I2 */
    public static final void m67558I2(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: K2 */
    private final SuccessScreenView m67559K2() {
        Object value = this.f56183H.getValue();
        C41536l.m120488h(value, "<get-successScreen>(...)");
        return (SuccessScreenView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public final void m67560L2(C30003b bVar) {
        C38125h.m112238c(this).mo91620o(bVar).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: J2 */
    public final C29742a mo49763J2() {
        C29742a aVar = this.f56182G;
        if (aVar != null) {
            return aVar;
        }
        C41536l.m120506z("getClientCampaignInfo");
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_operation_result;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: ge.bog.designsystem.components.common.Image$Url} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v4, resolved type: ge.bog.designsystem.components.common.Image$Resource} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: O1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37451O1(android.os.Bundle r33) {
        /*
            r32 = this;
            r0 = r32
            super.mo37451O1(r33)
            android.content.Intent r1 = r32.getIntent()
            java.lang.String r2 = "LOAN_DECISION_RESULT"
            android.os.Parcelable r1 = r1.getParcelableExtra(r2)
            kotlin.jvm.internal.C41536l.m120486f(r1)
            ge.bog.mobilebank.ui.model.offer.ConsumerLoanActivationResult r1 = (p341ge.bog.mobilebank.p975ui.model.offer.ConsumerLoanActivationResult) r1
            android.content.Intent r2 = r32.getIntent()
            java.lang.String r3 = "EXPRESS_LOAN_FLAG"
            r4 = 0
            boolean r2 = r2.getBooleanExtra(r3, r4)
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r3 = r32.m67559K2()
            int r5 = p366bk.C10328q.loan_is_activated
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r6 = "getString(R.string.loan_is_activated)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            r6 = 2
            r7 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.setTitle$default(r3, r5, r4, r6, r7)
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r3 = r32.m67559K2()
            int r5 = p366bk.C10320i.ic_result_success
            r3.setIcon(r5)
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r3 = r32.m67559K2()
            int r5 = p366bk.C10328q.f28936Q1
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r8 = "getString(R.string.common_text_details)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r8)
            r3.addHeader(r5)
            java.lang.String r3 = "getString(R.string.loan_type)"
            if (r2 == 0) goto L_0x007c
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r8 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_type
            java.lang.String r9 = r0.getString(r2)
            kotlin.jvm.internal.C41536l.m120488h(r9, r3)
            int r2 = p366bk.C10328q.express_loan
            java.lang.String r10 = r0.getString(r2)
            java.lang.String r2 = "getString(R.string.express_loan)"
            kotlin.jvm.internal.C41536l.m120488h(r10, r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0144
        L_0x007c:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode r2 = r1.mo86841m()
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$CL r5 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21008CL.f56471f
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r2, r5)
            if (r5 == 0) goto L_0x00b2
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r8 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_type
            java.lang.String r9 = r0.getString(r2)
            kotlin.jvm.internal.C41536l.m120488h(r9, r3)
            int r2 = p366bk.C10328q.consumer_loan
            java.lang.String r10 = r0.getString(r2)
            java.lang.String r2 = "getString(R.string.consumer_loan)"
            kotlin.jvm.internal.C41536l.m120488h(r10, r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0144
        L_0x00b2:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BA r5 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21002BA.f56468f
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r2, r5)
            if (r5 == 0) goto L_0x00e3
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r8 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_type
            java.lang.String r9 = r0.getString(r2)
            kotlin.jvm.internal.C41536l.m120488h(r9, r3)
            int r2 = p366bk.C10328q.agro_express_loan
            java.lang.String r10 = r0.getString(r2)
            java.lang.String r2 = "getString(R.string.agro_express_loan)"
            kotlin.jvm.internal.C41536l.m120488h(r10, r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0144
        L_0x00e3:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$BE r5 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21004BE.f56469f
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r2, r5)
            if (r5 == 0) goto L_0x0114
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r8 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_type
            java.lang.String r9 = r0.getString(r2)
            kotlin.jvm.internal.C41536l.m120488h(r9, r3)
            int r2 = p366bk.C10328q.express_business_loan
            java.lang.String r10 = r0.getString(r2)
            java.lang.String r2 = "getString(R.string.express_business_loan)"
            kotlin.jvm.internal.C41536l.m120488h(r10, r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0144
        L_0x0114:
            ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode$RL r5 = p341ge.bog.mobilebank.cleanarch.domain.offer.model.OfferProductCode.C21023RL.f56479f
            boolean r2 = kotlin.jvm.internal.C41536l.m120484d(r2, r5)
            if (r2 == 0) goto L_0x0144
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r8 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_type
            java.lang.String r9 = r0.getString(r2)
            kotlin.jvm.internal.C41536l.m120488h(r9, r3)
            int r2 = p366bk.C10328q.restructure_loan
            java.lang.String r10 = r0.getString(r2)
            java.lang.String r2 = "getString(R.string.restructure_loan)"
            kotlin.jvm.internal.C41536l.m120488h(r10, r2)
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
        L_0x0144:
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r20 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_amount
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "getString(R.string.loan_amount)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            java.math.BigDecimal r3 = r1.mo86837i()
            java.lang.String r5 = r1.mo86838j()
            java.lang.String r3 = g91.C32303f.m95203n(r3, r5)
            java.lang.String r5 = "getFormattedAmount(res.loanAmount, res.loanCcy)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r5)
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 508(0x1fc, float:7.12E-43)
            r31 = 0
            r21 = r2
            r22 = r3
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r8 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_term
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r2 = "getString(R.string.loan_term)"
            kotlin.jvm.internal.C41536l.m120488h(r9, r2)
            int r2 = r1.mo86839k()
            int r3 = p366bk.C10328q.f28967t7
            java.lang.String r3 = r0.getString(r3)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r2)
            java.lang.String r2 = " "
            r5.append(r2)
            r5.append(r3)
            java.lang.String r10 = r5.toString()
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 508(0x1fc, float:7.12E-43)
            r19 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r20 = r32.m67559K2()
            int r2 = p366bk.C10328q.first_payment_date
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r3 = "getString(R.string.first_payment_date)"
            kotlin.jvm.internal.C41536l.m120488h(r2, r3)
            long r8 = r1.mo86829d()
            java.lang.String r3 = g91.C32319m.m95296c(r8, r0)
            java.lang.String r5 = "formatDate(res.firstPaymentDate, this)"
            kotlin.jvm.internal.C41536l.m120488h(r3, r5)
            r21 = r2
            r22 = r3
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r8 = r32.m67559K2()
            int r2 = p366bk.C10328q.loan_linked_account
            java.lang.String r9 = r0.getString(r2)
            java.lang.String r2 = r1.mo86835h()
            if (r2 != 0) goto L_0x01ef
            java.lang.String r2 = ""
        L_0x01ef:
            r10 = r2
            android.content.res.Resources r2 = r32.getResources()
            int r3 = p366bk.C10319h.credit_card_image_height_small
            int r2 = r2.getDimensionPixelSize(r3)
            android.content.res.Resources r3 = r32.getResources()
            int r5 = p366bk.C10319h.credit_card_image_width_small
            int r3 = r3.getDimensionPixelSize(r5)
            ge.bog.mobilebank.cleanarch.domain.products.model.CardExternalFile r5 = r1.mo86827a()
            if (r5 == 0) goto L_0x022f
            java.lang.String r5 = r5.getFileUrl()
            if (r5 == 0) goto L_0x022f
            ge.bog.designsystem.components.common.Image$Url r7 = new ge.bog.designsystem.components.common.Image$Url
            java.lang.String r12 = g91.C32289b0.m95091c(r5)
            java.lang.String r5 = "generateImageUrl(it)"
            kotlin.jvm.internal.C41536l.m120488h(r12, r5)
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 126(0x7e, float:1.77E-43)
            r20 = 0
            r11 = r7
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r17 = r7
            goto L_0x023e
        L_0x022f:
            java.lang.String r5 = r1.mo86828b()
            int r5 = g91.C32307h.m95224a(r5)
            ge.bog.designsystem.components.common.Image$Resource r11 = new ge.bog.designsystem.components.common.Image$Resource
            r11.<init>(r5, r7, r6, r7)
            r17 = r11
        L_0x023e:
            java.lang.String r5 = "getString(R.string.loan_linked_account)"
            kotlin.jvm.internal.C41536l.m120488h(r9, r5)
            r11 = 0
            r12 = 1
            r13 = 0
            r14 = 0
            java.lang.Integer r15 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r2)
            r18 = 52
            r19 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.m67556G2(r1)
            java.math.BigDecimal[] r2 = new java.math.BigDecimal[r6]
            java.math.BigDecimal r3 = r1.mo86843q()
            r2[r4] = r3
            java.math.BigDecimal r3 = r1.mo86834g()
            r5 = 1
            r2[r5] = r3
            java.util.List r2 = ie1.C41341q.m119910m(r2)
            boolean r3 = r2 instanceof java.util.Collection
            if (r3 == 0) goto L_0x0277
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L_0x0277
            goto L_0x028f
        L_0x0277:
            java.util.Iterator r2 = r2.iterator()
        L_0x027b:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x028f
            java.lang.Object r3 = r2.next()
            java.math.BigDecimal r3 = (java.math.BigDecimal) r3
            if (r3 == 0) goto L_0x028b
            r3 = r5
            goto L_0x028c
        L_0x028b:
            r3 = r4
        L_0x028c:
            if (r3 == 0) goto L_0x027b
            r4 = r5
        L_0x028f:
            if (r4 == 0) goto L_0x02a7
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r5 = r32.m67559K2()
            java.lang.String r6 = ""
            java.lang.String r7 = ""
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 508(0x1fc, float:7.12E-43)
            r16 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
        L_0x02a7:
            java.math.BigDecimal r2 = r1.mo86843q()
            java.lang.String r3 = "getFormattedAmount(it, res.loanCcy)"
            if (r2 == 0) goto L_0x02d6
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r4 = r32.m67559K2()
            int r5 = p366bk.C10328q.total_repayment_amount
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r6 = "getString(R.string.total_repayment_amount)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            java.lang.String r6 = r1.mo86838j()
            java.lang.String r6 = g91.C32303f.m95203n(r2, r6)
            kotlin.jvm.internal.C41536l.m120488h(r6, r3)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 508(0x1fc, float:7.12E-43)
            r15 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x02d6:
            java.math.BigDecimal r2 = r1.mo86834g()
            if (r2 == 0) goto L_0x0303
            ge.bog.mobilebank.ui.views.widgets.SuccessScreenView r4 = r32.m67559K2()
            int r5 = p366bk.C10328q.usable_amount
            java.lang.String r5 = r0.getString(r5)
            java.lang.String r6 = "getString(R.string.usable_amount)"
            kotlin.jvm.internal.C41536l.m120488h(r5, r6)
            java.lang.String r1 = r1.mo86838j()
            java.lang.String r6 = g91.C32303f.m95203n(r2, r1)
            kotlin.jvm.internal.C41536l.m120488h(r6, r3)
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 508(0x1fc, float:7.12E-43)
            r15 = 0
            p341ge.bog.mobilebank.p975ui.views.widgets.SuccessScreenView.addDetailsItem$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0303:
            r32.m67557H2()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.ConsumerLoanActivationResultActivity.mo37451O1(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.enableIntercept();
    }
}
