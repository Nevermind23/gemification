package p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity;

import a81.C30772sa;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0125b;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.core.content.C0767a;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import com.google.android.material.checkbox.MaterialCheckBox;
import g91.C32289b0;
import g91.C32303f;
import g91.C32343x;
import he1.C41217g;
import he1.C41238w;
import iu0.C36546y;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.MoneyTransferDetailsViewModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferWizardActivity;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferCurrenciesUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.TransferCurrencyUiItem;
import p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.remittancecreditinfocontract.RemittanceCreditInfoContractActivity;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10463g;
import p777gz.C24840c;
import p806jz.C25530a;
import p806jz.C25531b;
import p806jz.C25532c;
import p806jz.C25533d;
import p806jz.C25534e;
import p806jz.C25535f;
import p806jz.C25536g;
import p806jz.C25537h;
import p806jz.C25538i;
import p806jz.C25539j;
import p806jz.C25540k;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity */
public final class MoneyTransferDetailsActivity extends C30772sa {

    /* renamed from: b0 */
    public static final C21185a f56897b0 = new C21185a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f56898F = C41219i.m119470b(new C21205u(this));

    /* renamed from: G */
    private final C41217g f56899G = C41219i.m119470b(new C21206v(this));

    /* renamed from: H */
    private final C41217g f56900H = C41219i.m119470b(new C21189e(this));

    /* renamed from: I */
    private final C41217g f56901I = C41219i.m119470b(new C21199o(this));

    /* renamed from: J */
    private final C41217g f56902J = C41219i.m119470b(new C21191g(this));

    /* renamed from: K */
    private final C41217g f56903K = C41219i.m119470b(new C21192h(this));

    /* renamed from: L */
    private final C41217g f56904L = C41219i.m119470b(new C21188d(this));

    /* renamed from: M */
    private final C41217g f56905M = C41219i.m119470b(new C21190f(this));

    /* renamed from: N */
    private final C41217g f56906N = C41219i.m119470b(new C21198n(this));

    /* renamed from: O */
    private final C41217g f56907O = C41219i.m119470b(new C21197m(this));

    /* renamed from: P */
    private final C41217g f56908P = C41219i.m119470b(new C21196l(this));

    /* renamed from: Q */
    private final C41217g f56909Q = C41219i.m119470b(new C21203s(this));

    /* renamed from: R */
    private final C41217g f56910R = C41219i.m119470b(new C21204t(this));

    /* renamed from: S */
    private final C41217g f56911S = C41219i.m119470b(new C21186b(this));

    /* renamed from: T */
    private final C41217g f56912T = C41219i.m119470b(new C21187c(this));

    /* renamed from: U */
    private final C41217g f56913U = new C1617p0(C41520a0.m120436b(MoneyTransferDetailsViewModel.class), new C21201q(this), new C21200p(this), new C21202r((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: V */
    public MoneyTransferTypeUiModel f56914V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public MoneyTransferWizardData f56915W;

    /* renamed from: X */
    private final C0173b f56916X;

    /* renamed from: Y */
    private int f56917Y;

    /* renamed from: Z */
    private int f56918Z;

    /* renamed from: a0 */
    private int f56919a0;

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$a */
    public static final class C21185a {
        private C21185a() {
        }

        public /* synthetic */ C21185a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m68673b(C21185a aVar, Activity activity, MoneyTransferTypeUiModel moneyTransferTypeUiModel, MoneyTransferWizardData moneyTransferWizardData, int i, Object obj) {
            if ((i & 4) != 0) {
                moneyTransferWizardData = null;
            }
            aVar.mo53092a(activity, moneyTransferTypeUiModel, moneyTransferWizardData);
        }

        /* renamed from: a */
        public final void mo53092a(Activity activity, MoneyTransferTypeUiModel moneyTransferTypeUiModel, MoneyTransferWizardData moneyTransferWizardData) {
            C41536l.m120489i(activity, "activity");
            C41536l.m120489i(moneyTransferTypeUiModel, "transferModel");
            Intent intent = new Intent(activity, MoneyTransferDetailsActivity.class);
            intent.putExtra("MONEY_TRANSFER_TYPE", moneyTransferTypeUiModel);
            intent.putExtra("WIZARD_DATA_KEY", moneyTransferWizardData);
            activity.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$b */
    static final class C21186b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56920d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21186b(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56920d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f56920d.findViewById(C10322k.convert_layout);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$c */
    static final class C21187c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56921d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21187c(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56921d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f56921d.findViewById(C10322k.exchange_rate_value);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$d */
    static final class C21188d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56922d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21188d(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56922d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f56922d.findViewById(C10322k.money_transfer_amount);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$e */
    static final class C21189e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56923d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21189e(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56923d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f56923d.findViewById(C10322k.money_transfer_code);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$f */
    static final class C21190f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56924d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21190f(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56924d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f56924d.findViewById(C10322k.money_transfer_receivable_amount);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$g */
    static final class C21191g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56925d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21191g(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56925d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f56925d.findViewById(C10322k.money_transfer_sender);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$h */
    static final class C21192h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56926d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21192h(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56926d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f56926d.findViewById(C10322k.money_transfer_sender_country);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$i */
    static final class C21193i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56927d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21193i(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(1);
            this.f56927d = moneyTransferDetailsActivity;
        }

        /* JADX WARNING: Removed duplicated region for block: B:48:0x00ca  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00cc  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00d5  */
        /* JADX WARNING: Removed duplicated region for block: B:63:0x011b  */
        /* JADX WARNING: Removed duplicated region for block: B:66:0x0122  */
        /* JADX WARNING: Removed duplicated region for block: B:73:0x0153  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo53100a(p777gz.C24840c r21) {
            /*
                r20 = this;
                r0 = r20
                java.lang.String r1 = "it"
                r2 = r21
                kotlin.jvm.internal.C41536l.m120489i(r2, r1)
                ck.g r1 = iu0.C36546y.m108282F()
                ck.h$a r3 = p380ck.C10464h.C10465a.FACEBOOKANDFIREBASE
                java.lang.String r4 = "receive_remittance"
                r1.mo27157x(r4, r3)
                ck.g r1 = iu0.C36546y.m108282F()
                java.lang.String r3 = r21.mo63263b()
                if (r3 == 0) goto L_0x0029
                java.lang.Double r3 = cf1.C40437u.m117096h(r3)
                if (r3 == 0) goto L_0x0029
                double r5 = r3.doubleValue()
                goto L_0x002b
            L_0x0029:
                r5 = 0
            L_0x002b:
                java.lang.Double r3 = java.lang.Double.valueOf(r5)
                r1.mo27150q(r4, r3)
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity$a r1 = p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity.f56942H
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r3 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity$b r13 = new ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferSuccessActivity$b
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferTypeUiModel r4 = r3.f56914V
                if (r4 != 0) goto L_0x0044
                java.lang.String r4 = "transferType"
                kotlin.jvm.internal.C41536l.m120506z(r4)
                r4 = 0
            L_0x0044:
                java.lang.String r6 = r4.mo53145d()
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r4 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r4 = r4.f56915W
                java.lang.String r7 = ""
                if (r4 == 0) goto L_0x005b
                java.lang.String r4 = r4.mo53183v()
                if (r4 != 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                r8 = r4
                goto L_0x005c
            L_0x005b:
                r8 = r7
            L_0x005c:
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r4 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r4 = r4.f56915W
                if (r4 == 0) goto L_0x006d
                java.lang.String r4 = r4.mo53180t()
                if (r4 != 0) goto L_0x006b
                goto L_0x006d
            L_0x006b:
                r9 = r4
                goto L_0x006e
            L_0x006d:
                r9 = r7
            L_0x006e:
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r4 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r4 = r4.f56915W
                if (r4 == 0) goto L_0x0081
                ge.bog.mobilebank.model.account.AccountLov r4 = r4.mo53173k()
                if (r4 == 0) goto L_0x0081
                java.lang.String r4 = r4.getAcctNo()
                goto L_0x0082
            L_0x0081:
                r4 = 0
            L_0x0082:
                if (r4 != 0) goto L_0x0086
                r10 = r7
                goto L_0x0087
            L_0x0086:
                r10 = r4
            L_0x0087:
                java.lang.String r4 = r21.mo63263b()
                if (r4 == 0) goto L_0x00ba
                java.lang.Double r4 = cf1.C40437u.m117096h(r4)
                if (r4 == 0) goto L_0x00ba
                double r14 = r4.doubleValue()
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r4 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r4 = r4.f56915W
                if (r4 == 0) goto L_0x00a9
                java.lang.String r4 = r4.mo53171i()
                if (r4 != 0) goto L_0x00a6
                goto L_0x00a9
            L_0x00a6:
                r16 = r4
                goto L_0x00ab
            L_0x00a9:
                r16 = r7
            L_0x00ab:
                r17 = 0
                r18 = 2
                r19 = 0
                java.lang.String r4 = g91.C32343x.m95410Q(r14, r16, r17, r18, r19)
                if (r4 != 0) goto L_0x00b8
                goto L_0x00ba
            L_0x00b8:
                r11 = r4
                goto L_0x00bb
            L_0x00ba:
                r11 = r7
            L_0x00bb:
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r4 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r4 = r4.f56915W
                if (r4 == 0) goto L_0x00cc
                java.lang.String r4 = r4.mo53177q()
                if (r4 != 0) goto L_0x00ca
                goto L_0x00cc
            L_0x00ca:
                r12 = r4
                goto L_0x00cd
            L_0x00cc:
                r12 = r7
            L_0x00cd:
                java.lang.String r4 = r21.mo63264c()
                java.lang.String r7 = " "
                if (r4 == 0) goto L_0x011b
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r4 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r4 = r4.f56915W
                if (r4 == 0) goto L_0x00e2
                java.lang.String r4 = r4.mo53171i()
                goto L_0x00e3
            L_0x00e2:
                r4 = 0
            L_0x00e3:
                java.lang.String r14 = r21.mo63264c()
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r15 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r15 = r15.f56915W
                if (r15 == 0) goto L_0x00fa
                ge.bog.mobilebank.model.account.AccountLov r15 = r15.mo53173k()
                if (r15 == 0) goto L_0x00fa
                java.lang.String r15 = r15.getCcy()
                goto L_0x00fb
            L_0x00fa:
                r15 = 0
            L_0x00fb:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder
                r5.<init>()
                java.lang.String r2 = "1 "
                r5.append(r2)
                r5.append(r4)
                java.lang.String r2 = " = "
                r5.append(r2)
                r5.append(r14)
                r5.append(r7)
                r5.append(r15)
                java.lang.String r2 = r5.toString()
                goto L_0x011c
            L_0x011b:
                r2 = 0
            L_0x011c:
                java.lang.String r4 = r21.mo63262a()
                if (r4 == 0) goto L_0x0153
                java.lang.String r4 = r21.mo63262a()
                java.lang.Double r4 = cf1.C40437u.m117096h(r4)
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r5 = r0.f56927d
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.model.MoneyTransferWizardData r5 = r5.f56915W
                if (r5 == 0) goto L_0x013d
                ge.bog.mobilebank.model.account.AccountLov r5 = r5.mo53173k()
                if (r5 == 0) goto L_0x013d
                java.lang.String r5 = r5.getCcy()
                goto L_0x013e
            L_0x013d:
                r5 = 0
            L_0x013e:
                java.lang.StringBuilder r14 = new java.lang.StringBuilder
                r14.<init>()
                r14.append(r4)
                r14.append(r7)
                r14.append(r5)
                java.lang.String r4 = r14.toString()
                r16 = r4
                goto L_0x0155
            L_0x0153:
                r16 = 0
            L_0x0155:
                r4 = r13
                r5 = r6
                r6 = r8
                r7 = r9
                r8 = r10
                r9 = r11
                r10 = r12
                r11 = r2
                r12 = r16
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                r1.mo53111a(r3, r13)
                ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity r1 = r0.f56927d
                r1.finish()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity.C21193i.mo53100a(gz.c):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53100a((C24840c) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$j */
    static final class C21194j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56928d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21194j(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(1);
            this.f56928d = moneyTransferDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53101a(boolean z) {
            this.f56928d.m68644a3().setVisibility(z ? 0 : 8);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53101a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$k */
    static final class C21195k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56929d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21195k(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(1);
            this.f56929d = moneyTransferDetailsActivity;
        }

        /* renamed from: a */
        public final void mo53102a(C21503d.C21504a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f56929d.mo52674G1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo53102a((C21503d.C21504a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$l */
    static final class C21196l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56930d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21196l(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56930d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final View invoke() {
            return this.f56930d.findViewById(C10322k.f28737Gq);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$m */
    static final class C21197m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56931d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21197m(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56931d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final Button invoke() {
            return (Button) this.f56931d.findViewById(C10322k.receive_button);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$n */
    static final class C21198n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56932d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21198n(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56932d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f56932d.findViewById(C10322k.selected_account);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$o */
    static final class C21199o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56933d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21199o(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56933d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextTypeView invoke() {
            return (TextTypeView) this.f56933d.findViewById(C10322k.money_transfer_currency);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$p */
    public static final class C21200p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56934d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21200p(ComponentActivity componentActivity) {
            super(0);
            this.f56934d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f56934d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$q */
    public static final class C21201q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f56935d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21201q(ComponentActivity componentActivity) {
            super(0);
            this.f56935d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f56935d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$r */
    public static final class C21202r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f56936d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f56937e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C21202r(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f56936d = aVar;
            this.f56937e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f56936d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f56937e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$s */
    static final class C21203s extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56938d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21203s(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56938d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final MaterialCheckBox invoke() {
            return (MaterialCheckBox) this.f56938d.findViewById(C10322k.f28835fx);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$t */
    static final class C21204t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56939d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21204t(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56939d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final TextView invoke() {
            return (TextView) this.f56939d.findViewById(C10322k.terms_hyperlink);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$u */
    static final class C21205u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56940d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21205u(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56940d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final ImageView invoke() {
            return (ImageView) this.f56940d.findViewById(C10322k.transfer_icon);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.moneytransfers.presentation.activity.MoneyTransferDetailsActivity$v */
    static final class C21206v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ MoneyTransferDetailsActivity f56941d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21206v(MoneyTransferDetailsActivity moneyTransferDetailsActivity) {
            super(0);
            this.f56941d = moneyTransferDetailsActivity;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f56941d.findViewById(C10322k.transfer_name);
        }
    }

    public MoneyTransferDetailsActivity() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C25530a(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…)\n            }\n        }");
        this.f56916X = registerForActivityResult;
        this.f56917Y = 1;
        this.f56918Z = 2;
        this.f56919a0 = 1;
    }

    /* renamed from: A3 */
    private final void m68619A3(String str) {
        boolean z;
        String str2;
        Button b3 = m68645b3();
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            str2 = getString(C10328q.money_transfer_receive_button_label);
        } else {
            str2 = getString(C10328q.money_transfer_receive_button_label) + " (" + str + ")";
        }
        b3.setButtonText(str2);
    }

    /* renamed from: B3 */
    private final void m68620B3() {
        ImageView g3 = m68650g3();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56914V;
        MoneyTransferTypeUiModel moneyTransferTypeUiModel2 = null;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        String b = moneyTransferTypeUiModel.mo53144b();
        int i = C10320i.f28688dc;
        C32289b0.m95107s(g3, b, Integer.valueOf(i), Integer.valueOf(i), true, false);
        BogTextView h3 = m68651h3();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel3 = this.f56914V;
        if (moneyTransferTypeUiModel3 == null) {
            C41536l.m120506z("transferType");
        } else {
            moneyTransferTypeUiModel2 = moneyTransferTypeUiModel3;
        }
        h3.setText(moneyTransferTypeUiModel2.mo53149f());
    }

    /* renamed from: C3 */
    private final void m68621C3() {
        m68645b3().setEnabled(m68653j3());
    }

    /* renamed from: S2 */
    private final void m68636S2() {
        boolean z;
        int i;
        boolean z2;
        String str;
        List b;
        Object obj;
        BigDecimal bigDecimal;
        BigDecimal bigDecimal2;
        MoneyTransferWizardData moneyTransferWizardData = this.f56915W;
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = null;
        if (moneyTransferWizardData != null) {
            m68640W2().setValueText(moneyTransferWizardData.mo53183v());
            MoneyTransferTypeUiModel moneyTransferTypeUiModel2 = this.f56914V;
            if (moneyTransferTypeUiModel2 == null) {
                C41536l.m120506z("transferType");
                moneyTransferTypeUiModel2 = null;
            }
            List a = moneyTransferTypeUiModel2.mo53143a();
            if (a == null || a.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                m68647d3().setValueText(moneyTransferWizardData.mo53178r());
            }
            m68642Y2().getBogInputLayout().resetValue();
            m68642Y2().setValueText(moneyTransferWizardData.mo53180t());
            m68643Z2().getBogInputLayout().resetValue();
            m68643Z2().setValueText(moneyTransferWizardData.mo53177q());
            m68639V2().getBogInputLayout().resetValue();
            m68639V2().setValueText(moneyTransferWizardData.mo53172j());
            m68641X2().getBogInputLayout().resetValue();
            m68646c3().getBogInputLayout().resetValue();
            TextTypeView c3 = m68646c3();
            AccountLov k = moneyTransferWizardData.mo53173k();
            if (k != null) {
                str = k.getAcctNo();
            } else {
                str = null;
            }
            c3.setValueText(str);
            if (!C41536l.m120484d(moneyTransferWizardData.mo53163d(), moneyTransferWizardData.mo53171i())) {
                C32343x.m95407O0(m68637T2());
                C32343x.m95407O0(m68641X2());
                m68639V2().setClickEnabled(false);
                m68639V2().setAlpha(0.5f);
                MoneyTransferCurrenciesUiModel h = moneyTransferWizardData.mo53169h();
                if (!(h == null || (b = h.mo53132b()) == null)) {
                    Iterator it = b.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it.next();
                        if (C41536l.m120484d(((TransferCurrencyUiItem) obj).mo53201a(), moneyTransferWizardData.mo53163d())) {
                            break;
                        }
                    }
                    TransferCurrencyUiItem transferCurrencyUiItem = (TransferCurrencyUiItem) obj;
                    if (transferCurrencyUiItem != null) {
                        m68641X2().setValueText(C32343x.m95408P(transferCurrencyUiItem.mo53209h(), moneyTransferWizardData.mo53163d()));
                        BigDecimal f = transferCurrencyUiItem.mo53207f();
                        if (f == null) {
                            f = transferCurrencyUiItem.mo53203d();
                        }
                        MoneyTransferWizardData moneyTransferWizardData2 = this.f56915W;
                        if (moneyTransferWizardData2 != null) {
                            moneyTransferWizardData2.mo53157A(C32343x.m95408P(transferCurrencyUiItem.mo53209h(), moneyTransferWizardData.mo53163d()));
                        }
                        MoneyTransferWizardData moneyTransferWizardData3 = this.f56915W;
                        if (moneyTransferWizardData3 != null) {
                            if (f != null) {
                                bigDecimal2 = f.setScale(4, RoundingMode.UP);
                            } else {
                                bigDecimal2 = null;
                            }
                            moneyTransferWizardData3.mo53187z(String.valueOf(bigDecimal2));
                        }
                        BigDecimal g = transferCurrencyUiItem.mo53208g();
                        if (g == null) {
                            g = transferCurrencyUiItem.mo53205e();
                        }
                        BogTextView U2 = m68638U2();
                        String h2 = C32303f.m95197h(moneyTransferWizardData.mo53171i());
                        if (g != null) {
                            bigDecimal = g.setScale(4, RoundingMode.UP);
                        } else {
                            bigDecimal = null;
                        }
                        U2.setText("1 " + h2 + " = " + bigDecimal + C32303f.m95198i(moneyTransferWizardData.mo53163d(), true));
                        String f2 = moneyTransferWizardData.mo53167f();
                        if (f2 == null) {
                            f2 = "";
                        }
                        m68619A3(f2);
                    }
                }
            } else {
                m68639V2().setClickEnabled(true);
                m68639V2().setAlpha(1.0f);
                C32343x.m95401L0(m68641X2());
                m68641X2().setValueText(moneyTransferWizardData.mo53172j());
                String j = moneyTransferWizardData.mo53172j();
                if (j == null) {
                    j = "";
                }
                m68619A3(j);
                C32343x.m95401L0(m68637T2());
            }
        }
        ArrayList<TextTypeView> arrayList = new ArrayList<>();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel3 = this.f56914V;
        if (moneyTransferTypeUiModel3 == null) {
            C41536l.m120506z("transferType");
        } else {
            moneyTransferTypeUiModel = moneyTransferTypeUiModel3;
        }
        List a2 = moneyTransferTypeUiModel.mo53143a();
        if (a2 == null || a2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.add(m68647d3());
        }
        arrayList.add(m68642Y2());
        arrayList.add(m68643Z2());
        arrayList.add(m68639V2());
        arrayList.add(m68646c3());
        for (TextTypeView textTypeView : arrayList) {
            if (this.f56915W == null) {
                textTypeView.setValueText("");
                i = 8;
            } else {
                i = 0;
            }
            textTypeView.setVisibility(i);
        }
        m68621C3();
    }

    /* renamed from: T2 */
    private final View m68637T2() {
        Object value = this.f56911S.getValue();
        C41536l.m120488h(value, "<get-convertLayout>(...)");
        return (View) value;
    }

    /* renamed from: U2 */
    private final BogTextView m68638U2() {
        Object value = this.f56912T.getValue();
        C41536l.m120488h(value, "<get-exchangeRateView>(...)");
        return (BogTextView) value;
    }

    /* renamed from: V2 */
    private final TextTypeView m68639V2() {
        Object value = this.f56904L.getValue();
        C41536l.m120488h(value, "<get-moneyTransferAmount>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: W2 */
    private final TextTypeView m68640W2() {
        Object value = this.f56900H.getValue();
        C41536l.m120488h(value, "<get-moneyTransferCode>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: X2 */
    private final TextTypeView m68641X2() {
        Object value = this.f56905M.getValue();
        C41536l.m120488h(value, "<get-moneyTransferReceivableAmount>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: Y2 */
    private final TextTypeView m68642Y2() {
        Object value = this.f56902J.getValue();
        C41536l.m120488h(value, "<get-moneyTransferSender>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: Z2 */
    private final TextTypeView m68643Z2() {
        Object value = this.f56903K.getValue();
        C41536l.m120488h(value, "<get-moneyTransferSenderCountry>(...)");
        return (TextTypeView) value;
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public final View m68644a3() {
        Object value = this.f56908P.getValue();
        C41536l.m120488h(value, "<get-progressBar>(...)");
        return (View) value;
    }

    /* renamed from: b3 */
    private final Button m68645b3() {
        Object value = this.f56907O.getValue();
        C41536l.m120488h(value, "<get-receiveTransferButton>(...)");
        return (Button) value;
    }

    /* renamed from: c3 */
    private final TextTypeView m68646c3() {
        Object value = this.f56906N.getValue();
        C41536l.m120488h(value, "<get-selectedAccount>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: d3 */
    private final TextTypeView m68647d3() {
        Object value = this.f56901I.getValue();
        C41536l.m120488h(value, "<get-selectedCurrency>(...)");
        return (TextTypeView) value;
    }

    /* renamed from: e3 */
    private final MaterialCheckBox m68648e3() {
        Object value = this.f56909Q.getValue();
        C41536l.m120488h(value, "<get-termsCheckBox>(...)");
        return (MaterialCheckBox) value;
    }

    /* renamed from: f3 */
    private final TextView m68649f3() {
        Object value = this.f56910R.getValue();
        C41536l.m120488h(value, "<get-termsHyperlink>(...)");
        return (TextView) value;
    }

    /* renamed from: g3 */
    private final ImageView m68650g3() {
        Object value = this.f56898F.getValue();
        C41536l.m120488h(value, "<get-transferIcon>(...)");
        return (ImageView) value;
    }

    /* renamed from: h3 */
    private final BogTextView m68651h3() {
        Object value = this.f56899G.getValue();
        C41536l.m120488h(value, "<get-transferName>(...)");
        return (BogTextView) value;
    }

    /* renamed from: i3 */
    private final MoneyTransferDetailsViewModel m68652i3() {
        return (MoneyTransferDetailsViewModel) this.f56913U.getValue();
    }

    /* renamed from: j3 */
    private final boolean m68653j3() {
        MoneyTransferWizardData moneyTransferWizardData = this.f56915W;
        return (moneyTransferWizardData != null && moneyTransferWizardData.mo53185x()) && m68648e3().isChecked();
    }

    /* renamed from: k3 */
    private final void m68654k3() {
        m68652i3().mo53062lw().mo4819k(this, new C25531b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m68655l3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, C21503d dVar) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        if (dVar.mo53703c()) {
            C32343x.m95401L0(moneyTransferDetailsActivity.m68637T2());
        } else if (!dVar.mo53704d() || dVar.mo53701a() == null) {
            MoneyTransferWizardData moneyTransferWizardData = moneyTransferDetailsActivity.f56915W;
            if (moneyTransferWizardData != null) {
                moneyTransferWizardData.mo53157A((String) null);
            }
            MoneyTransferWizardData moneyTransferWizardData2 = moneyTransferDetailsActivity.f56915W;
            if (moneyTransferWizardData2 != null) {
                moneyTransferWizardData2.mo53187z((String) null);
            }
            C32343x.m95401L0(moneyTransferDetailsActivity.m68637T2());
            String valueText = moneyTransferDetailsActivity.m68639V2().getValueText();
            C41536l.m120488h(valueText, "moneyTransferAmount.valueText");
            moneyTransferDetailsActivity.m68619A3(valueText);
        } else {
            MoneyTransferWizardData moneyTransferWizardData3 = moneyTransferDetailsActivity.f56915W;
            if (moneyTransferWizardData3 != null) {
                C0125b.m366a(dVar.mo53701a());
                throw null;
            } else if (moneyTransferWizardData3 == null) {
                C0125b.m366a(dVar.mo53701a());
                throw null;
            } else {
                C0125b.m366a(dVar.mo53701a());
                throw null;
            }
        }
    }

    /* renamed from: m3 */
    private final void m68656m3() {
        m68652i3().mo53064nw().mo4819k(this, new C25540k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m68657n3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, C21503d dVar) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        boolean z = false;
        if (dVar.mo53703c()) {
            moneyTransferDetailsActivity.m68644a3().setVisibility(0);
        } else if (dVar.mo53704d()) {
            moneyTransferDetailsActivity.m68644a3().setVisibility(8);
            RemittanceCreditInfoContract remittanceCreditInfoContract = (RemittanceCreditInfoContract) dVar.mo53701a();
            if (remittanceCreditInfoContract != null && remittanceCreditInfoContract.mo53053f()) {
                z = true;
            }
            if (z) {
                RemittanceCreditInfoContractActivity.C21231a aVar = RemittanceCreditInfoContractActivity.f57015K;
                MoneyTransferTypeUiModel moneyTransferTypeUiModel = moneyTransferDetailsActivity.f56914V;
                if (moneyTransferTypeUiModel == null) {
                    C41536l.m120506z("transferType");
                    moneyTransferTypeUiModel = null;
                }
                MoneyTransferWizardData moneyTransferWizardData = moneyTransferDetailsActivity.f56915W;
                C41536l.m120486f(moneyTransferWizardData);
                aVar.mo53223a(moneyTransferDetailsActivity, moneyTransferTypeUiModel, moneyTransferWizardData, (RemittanceCreditInfoContract) dVar.mo53701a(), moneyTransferDetailsActivity.f56916X);
                return;
            }
            moneyTransferDetailsActivity.m68668y3();
        } else {
            moneyTransferDetailsActivity.m68644a3().setVisibility(8);
            C41536l.m120487g(dVar, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.common.Resource.Error<ge.bog.mobilebank.cleanarch.moneytransfers.domain.model.RemittanceCreditInfoContract>");
            moneyTransferDetailsActivity.mo74709H1(((C21503d.C21504a) dVar).mo53706f());
        }
    }

    /* renamed from: o3 */
    private final void m68658o3() {
        C21484c.m69411c(m68652i3().mo53061I5(), this, new C21193i(this), new C21194j(this), new C21195k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m68659p3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, View view) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        moneyTransferDetailsActivity.m68667x3(0, moneyTransferDetailsActivity.m68640W2());
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m68660q3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, View view) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        moneyTransferDetailsActivity.m68667x3(moneyTransferDetailsActivity.f56919a0, moneyTransferDetailsActivity.m68647d3());
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m68661r3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, View view) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        moneyTransferDetailsActivity.m68667x3(moneyTransferDetailsActivity.f56918Z, moneyTransferDetailsActivity.m68646c3());
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public static final void m68662s3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, View view) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        moneyTransferDetailsActivity.m68667x3(moneyTransferDetailsActivity.f56917Y, moneyTransferDetailsActivity.m68641X2());
    }

    /* access modifiers changed from: private */
    /* renamed from: t3 */
    public static final void m68663t3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, View view) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        moneyTransferDetailsActivity.m68667x3(moneyTransferDetailsActivity.f56917Y, moneyTransferDetailsActivity.m68639V2());
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m68664u3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, View view) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        moneyTransferDetailsActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C27950a.m86287d("link.terms.bank.service.terms", false, 2, (Object) null))));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m68665v3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        if (z) {
            C10463g F = C36546y.m108282F();
            MoneyTransferTypeUiModel moneyTransferTypeUiModel = moneyTransferDetailsActivity.f56914V;
            if (moneyTransferTypeUiModel == null) {
                C41536l.m120506z("transferType");
                moneyTransferTypeUiModel = null;
            }
            F.mo27152s("remittance", moneyTransferTypeUiModel.mo53145d(), "remittance_agreement_click");
        }
        moneyTransferDetailsActivity.m68621C3();
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m68666w3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, View view) {
        MoneyTransferWizardData.Country l;
        String b;
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        if (moneyTransferDetailsActivity.m68653j3()) {
            C10463g F = C36546y.m108282F();
            MoneyTransferTypeUiModel moneyTransferTypeUiModel = moneyTransferDetailsActivity.f56914V;
            String str = null;
            if (moneyTransferTypeUiModel == null) {
                C41536l.m120506z("transferType");
                moneyTransferTypeUiModel = null;
            }
            F.mo27152s("remittance", moneyTransferTypeUiModel.mo53145d(), "remittance_receive_click");
            MoneyTransferDetailsViewModel i3 = moneyTransferDetailsActivity.m68652i3();
            MoneyTransferTypeUiModel moneyTransferTypeUiModel2 = moneyTransferDetailsActivity.f56914V;
            if (moneyTransferTypeUiModel2 == null) {
                C41536l.m120506z("transferType");
                moneyTransferTypeUiModel2 = null;
            }
            String d = moneyTransferTypeUiModel2.mo53145d();
            MoneyTransferWizardData moneyTransferWizardData = moneyTransferDetailsActivity.f56915W;
            if (moneyTransferWizardData == null || (l = moneyTransferWizardData.mo53174l()) == null || (b = l.mo53189b()) == null) {
                MoneyTransferWizardData moneyTransferWizardData2 = moneyTransferDetailsActivity.f56915W;
                if (moneyTransferWizardData2 != null) {
                    str = moneyTransferWizardData2.mo53175m();
                }
            } else {
                str = b;
            }
            i3.mo53065ow(d, str);
        }
    }

    /* renamed from: x3 */
    private final void m68667x3(int i, View view) {
        MoneyTransferWizardActivity.C21209a aVar = MoneyTransferWizardActivity.f56953s0;
        MoneyTransferWizardData moneyTransferWizardData = this.f56915W;
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56914V;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        aVar.mo53123a(this, moneyTransferWizardData, moneyTransferTypeUiModel, i, view);
    }

    /* renamed from: y3 */
    private final void m68668y3() {
        MoneyTransferDetailsViewModel i3 = m68652i3();
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56914V;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        i3.mo53066sw(moneyTransferTypeUiModel.mo53145d(), this.f56915W);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public static final void m68669z3(MoneyTransferDetailsActivity moneyTransferDetailsActivity, ActivityResult activityResult) {
        C41536l.m120489i(moneyTransferDetailsActivity, "this$0");
        if (activityResult.mo371b() == -1) {
            moneyTransferDetailsActivity.finish();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_money_transfer_details;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        boolean z;
        TextTypeView textTypeView;
        super.mo37451O1(bundle);
        Parcelable parcelableExtra = getIntent().getParcelableExtra("MONEY_TRANSFER_TYPE");
        C41536l.m120486f(parcelableExtra);
        this.f56914V = (MoneyTransferTypeUiModel) parcelableExtra;
        this.f56915W = (MoneyTransferWizardData) getIntent().getParcelableExtra("WIZARD_DATA_KEY");
        m68620B3();
        ArrayList arrayList = new ArrayList();
        arrayList.add(m68640W2());
        m68640W2().setOnClickListener(new C25532c(this));
        MoneyTransferTypeUiModel moneyTransferTypeUiModel = this.f56914V;
        MoneyTransferTypeUiModel moneyTransferTypeUiModel2 = null;
        if (moneyTransferTypeUiModel == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel = null;
        }
        List a = moneyTransferTypeUiModel.mo53143a();
        boolean z2 = false;
        if (a == null || a.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            arrayList.add(m68647d3());
            m68647d3().setOnClickListener(new C25533d(this));
            this.f56917Y++;
            this.f56918Z++;
        }
        MoneyTransferTypeUiModel moneyTransferTypeUiModel3 = this.f56914V;
        if (moneyTransferTypeUiModel3 == null) {
            C41536l.m120506z("transferType");
            moneyTransferTypeUiModel3 = null;
        }
        if (moneyTransferTypeUiModel3.mo53147e()) {
            this.f56917Y++;
            this.f56918Z++;
        }
        arrayList.add(m68642Y2());
        arrayList.add(m68643Z2());
        arrayList.add(m68646c3());
        m68646c3().setOnClickListener(new C25534e(this));
        arrayList.add(m68639V2());
        arrayList.add(m68641X2());
        m68641X2().setOnClickListener(new C25535f(this));
        m68639V2().setOnClickListener(new C25536g(this));
        int c = C0767a.m2893c(this, C10318g.f28629P0);
        int i = 0;
        for (Object next : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            ((TextTypeView) next).setUnderLineColor(c);
            i = i2;
        }
        m68649f3().setOnClickListener(new C25537h(this));
        m68648e3().setOnCheckedChangeListener(new C25538i(this));
        m68645b3().setOnClickListener(new C25539j(this));
        m68658o3();
        m68654k3();
        m68656m3();
        if (this.f56915W == null) {
            m68667x3(0, m68640W2());
            return;
        }
        MoneyTransferTypeUiModel moneyTransferTypeUiModel4 = this.f56914V;
        if (moneyTransferTypeUiModel4 == null) {
            C41536l.m120506z("transferType");
        } else {
            moneyTransferTypeUiModel2 = moneyTransferTypeUiModel4;
        }
        List a2 = moneyTransferTypeUiModel2.mo53143a();
        if (a2 == null || a2.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            textTypeView = m68647d3();
        } else {
            textTypeView = m68642Y2();
        }
        m68667x3(1, textTypeView);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        MoneyTransferWizardData moneyTransferWizardData;
        MoneyTransferTypeUiModel moneyTransferTypeUiModel;
        if (i2 != -1) {
            super.onActivityResult(i, i2, intent);
        } else if (i == 10001) {
            if (intent != null) {
                moneyTransferWizardData = (MoneyTransferWizardData) intent.getParcelableExtra("UMTS_TRANSFER_DATA_KEY");
            } else {
                moneyTransferWizardData = null;
            }
            this.f56915W = moneyTransferWizardData;
            if (!(intent == null || (moneyTransferTypeUiModel = (MoneyTransferTypeUiModel) intent.getParcelableExtra("UMTS_TRANSFER_TYPE_KEY")) == null)) {
                this.f56914V = moneyTransferTypeUiModel;
                m68620B3();
            }
            m68636S2();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.money_transfers_header_text);
        C41536l.m120488h(string, "getString(R.string.money_transfers_header_text)");
        return string;
    }
}
