package p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission;

import af1.C40303i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.activity.result.C0173b;
import androidx.cardview.widget.CardView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import com.salesforce.marketingcloud.UrlHandler;
import da0.C19950d;
import da0.C19954h;
import da0.C19955i;
import eb0.C20194a;
import eb0.C20195b;
import eb0.C20196c;
import eb0.C20197d;
import eb0.C20198e;
import eb0.C20199f;
import eb0.C20200g;
import eb0.C20201h;
import eb0.C20202i;
import eb0.C20203j;
import fb0.C20457a;
import g91.C32319m;
import g91.C32343x;
import gb0.C20789b;
import ha0.C24933j;
import hb0.C24955f;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import ib0.C25143e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import ka0.C25695d;
import kb0.C25702a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import lb0.C25906p;
import lb0.C25911u;
import ld0.C25950a;
import m41.C37223a;
import m41.C37224b;
import o00.C26656a;
import o31.C37588a0;
import ob0.C26920a;
import p00.C27113k;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.Amount;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.OvalIconToggleItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.designsystem.components.toggle.ToggleView;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultArgs;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onpayment.AccumulateOnPaymentModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.fragment.onspecificdate.AccumulateOnSpecificDateModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import p341ge.bog.mobilebank.model.offers.Summary;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p642vh.C18338b0;
import ue1.C43064a;
import ue1.C43075l;
import y11.C39992d;
import ya0.C29967k;
import z11.C40139a;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity */
public final class DepositApplicationSubmissionActivity extends C22973b implements C26656a, C41185v.C41186a, C39992d.C39993a {

    /* renamed from: N */
    public static final C22949a f60377N = new C22949a((DefaultConstructorMarker) null);

    /* renamed from: O */
    static final /* synthetic */ C40303i[] f60378O = {C41520a0.m120439e(new C41539o(DepositApplicationSubmissionActivity.class, "slider", "getSlider()Lge/bog/designsystem/components/common/Slider;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: G */
    public C24933j f60379G;

    /* renamed from: H */
    private final C41217g f60380H = C41219i.m119470b(new C22952d(this));

    /* renamed from: I */
    public C25906p f60381I;

    /* renamed from: J */
    private final C41217g f60382J = new C1617p0(C41520a0.m120436b(C25911u.class), new C22968t(this), new C22970v(this), new C22969u((C43064a) null, this));

    /* renamed from: K */
    private final C41217g f60383K = C41219i.m119470b(C22950b.f60386d);

    /* renamed from: L */
    private final C41555e f60384L;

    /* renamed from: M */
    private final C22951c f60385M;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$a */
    public static final class C22949a {
        private C22949a() {
        }

        public /* synthetic */ C22949a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57095a(Context context, C0173b bVar, DepositSubmissionNavData depositSubmissionNavData) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(bVar, "activityResultLauncher");
            C41536l.m120489i(depositSubmissionNavData, "navData");
            Intent intent = new Intent(context, DepositApplicationSubmissionActivity.class);
            intent.putExtra("DATA_EXTRA", depositSubmissionNavData);
            bVar.mo404a(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$b */
    static final class C22950b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C22950b f60386d = new C22950b();

        C22950b() {
            super(0);
        }

        /* renamed from: b */
        public final C20457a invoke() {
            return new C20457a();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$c */
    public static final class C22951c implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60387d;

        C22951c(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            this.f60387d = depositApplicationSubmissionActivity;
        }

        public void afterTextChanged(Editable editable) {
            this.f60387d.m74423e3().mo64765rq(editable != null ? editable.toString() : null);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$d */
    static final class C22952d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60388d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22952d(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(0);
            this.f60388d = depositApplicationSubmissionActivity;
        }

        /* renamed from: b */
        public final DepositSubmissionNavData invoke() {
            DepositSubmissionNavData depositSubmissionNavData = (DepositSubmissionNavData) this.f60388d.getIntent().getParcelableExtra("DATA_EXTRA");
            if (depositSubmissionNavData != null) {
                return depositSubmissionNavData;
            }
            throw new NullPointerException("NavData cannot be null");
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$e */
    static final class C22953e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22953e(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60389d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57101a(C41224m mVar) {
            double doubleValue = ((Number) mVar.mo95675a()).doubleValue();
            String str = (String) mVar.mo95676b();
            C24933j P2 = this.f60389d.f60379G;
            if (P2 == null) {
                C41536l.m120506z("binding");
                P2 = null;
            }
            OvalIconToggleItem ovalIconToggleItem = P2.f64146C;
            ovalIconToggleItem.setAmountLabel(C32343x.m95388F("applications.deposits.success.accumulate.MB.amount", new Object[0]));
            ovalIconToggleItem.setAmountValue(new Amount(doubleValue, str));
            ovalIconToggleItem.mo35998c(true);
            ToggleView toggleView = (ToggleView) ovalIconToggleItem.getRightItemView();
            if (toggleView != null) {
                toggleView.setEnabled(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57101a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$f */
    static final class C22954f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22954f(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60390d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57102a(C41224m mVar) {
            double doubleValue = ((Number) mVar.mo95675a()).doubleValue();
            String str = (String) mVar.mo95676b();
            C24933j P2 = this.f60390d.f60379G;
            if (P2 == null) {
                C41536l.m120506z("binding");
                P2 = null;
            }
            OvalIconToggleItem ovalIconToggleItem = P2.f64160j;
            ovalIconToggleItem.setAmountLabel(C32343x.m95388F("applications.deposits.success.accumulate.STO.amount", new Object[0]));
            ovalIconToggleItem.setAmountValue(new Amount(doubleValue, str));
            ovalIconToggleItem.setAmountDesc(C32343x.m95388F("applications.deposits.success.accumulate.STO.transfer.day", new Object[0]));
            ovalIconToggleItem.mo35998c(true);
            ToggleView toggleView = (ToggleView) ovalIconToggleItem.getRightItemView();
            if (toggleView != null) {
                toggleView.setEnabled(false);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57102a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$g */
    static final class C22955g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22955g(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60391d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57103a(AccumulateOnPaymentModel accumulateOnPaymentModel) {
            C41536l.m120489i(accumulateOnPaymentModel, "it");
            C24955f.f64277O.mo63365a(accumulateOnPaymentModel).mo4576A1(this.f60391d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57103a((AccumulateOnPaymentModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$h */
    static final class C22956h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60392d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22956h(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60392d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57104a(AccumulateOnSpecificDateModel accumulateOnSpecificDateModel) {
            C41536l.m120489i(accumulateOnSpecificDateModel, "it");
            C25143e.f64597O.mo63693a(accumulateOnSpecificDateModel).mo4576A1(this.f60392d.getSupportFragmentManager(), (String) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57104a((AccumulateOnSpecificDateModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$i */
    /* synthetic */ class C22957i extends C41535k implements C43075l {
        C22957i(Object obj) {
            super(1, obj, DepositApplicationSubmissionActivity.class, "setupForm", "setupForm(Lge/bog/mobilebank/depositapplication/presentation/depositsubmission/model/DepositSubmissionData;)V", 0);
        }

        /* renamed from: b */
        public final void mo57105b(C25702a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((DepositApplicationSubmissionActivity) this.receiver).m74437s3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57105b((C25702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$j */
    static final class C22958j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22958j(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60393d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57106a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                DepositApplicationSubmissionActivity depositApplicationSubmissionActivity = this.f60393d;
                boolean booleanValue = bool.booleanValue();
                C24933j P2 = depositApplicationSubmissionActivity.f60379G;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                P2.f64159i.getMainButton().setEnabled(booleanValue);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57106a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$k */
    static final class C22959k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22959k(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60394d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57107a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f60394d.m74427i3(true);
                return;
            }
            C24933j jVar = null;
            if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                if (((List) cVar.mo71340a()).size() != this.f60394d.m74419Z2().getItemCount()) {
                    DepositApplicationSubmissionActivity depositApplicationSubmissionActivity = this.f60394d;
                    C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, ((List) cVar.mo71340a()).size(), C19955i.f54547a, false, false, 12, (Object) null);
                    C24933j P2 = this.f60394d.f60379G;
                    if (P2 == null) {
                        C41536l.m120506z("binding");
                        P2 = null;
                    }
                    ViewPager2 viewPager2 = P2.f64152I;
                    C41536l.m120488h(viewPager2, "binding.viewPager");
                    C24933j P22 = this.f60394d.f60379G;
                    if (P22 == null) {
                        C41536l.m120506z("binding");
                    } else {
                        jVar = P22;
                    }
                    FrameLayout frameLayout = jVar.f64145B;
                    C41536l.m120488h(frameLayout, "binding.pagerIndicatorContainer");
                    depositApplicationSubmissionActivity.m74432n3(b.mo46116a(viewPager2, frameLayout));
                }
                this.f60394d.m74419Z2().mo48988n((List) cVar.mo71340a());
                this.f60394d.m74427i3(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f60394d.m74427i3(false);
                C24933j P23 = this.f60394d.f60379G;
                if (P23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    jVar = P23;
                }
                CardView cardView = jVar.f64149F;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f60394d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57107a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$l */
    static final class C22960l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22960l(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60395d = depositApplicationSubmissionActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m74464c(String str, TransferAccountItem transferAccountItem) {
            C41536l.m120489i(str, "$currency");
            C41536l.m120489i(transferAccountItem, "account");
            List<TransferAccountItem> t = transferAccountItem.mo52151t();
            if ((t instanceof Collection) && t.isEmpty()) {
                return false;
            }
            for (TransferAccountItem i : t) {
                if (C41536l.m120484d(i.mo52142i(), str)) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: b */
        public final void mo57108b(C37223a aVar) {
            Long l;
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                DepositApplicationSubmissionActivity depositApplicationSubmissionActivity = this.f60395d;
                long longValue = ((Number) mVar.mo95675a()).longValue();
                String str = (String) mVar.mo95676b();
                if (longValue == -1) {
                    l = null;
                } else {
                    l = Long.valueOf(longValue);
                }
                C39992d.f94982Q.mo93826a(C40139a.SRC, str, l, new C22972a(str)).mo4576A1(depositApplicationSubmissionActivity.getSupportFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57108b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$m */
    static final class C22961m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22961m(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60396d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57109a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f60396d.m74427i3(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f60396d.m74427i3(false);
                C27113k.C27114a aVar2 = C27113k.f68083P;
                String a = ((C25950a) ((C31128a.C31131c) aVar).mo71340a()).mo64864a();
                String string = this.f60396d.getString(C19954h.common_text_terms);
                C41536l.m120488h(string, "getString(R.string.common_text_terms)");
                C27113k c = C27113k.C27114a.m84066c(aVar2, a, false, (String) null, (ArrayList) null, (Summary) null, string, 30, (Object) null);
                FragmentManager supportFragmentManager = this.f60396d.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                c.mo4576A1(supportFragmentManager, (String) null);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f60396d.m74427i3(false);
                this.f60396d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57109a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$n */
    static final class C22962n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60397d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22962n(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60397d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57110a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                DepositApplicationSubmissionActivity depositApplicationSubmissionActivity = this.f60397d;
                C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, (String) mVar.mo95675a(), (HashMap) mVar.mo95676b(), (C41143c) null, 4, (Object) null);
                FragmentManager supportFragmentManager = depositApplicationSubmissionActivity.getSupportFragmentManager();
                C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
                e.mo4576A1(supportFragmentManager, (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57110a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$o */
    static final class C22963o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60398d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22963o(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60398d = depositApplicationSubmissionActivity;
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Throwable] */
        /* JADX WARNING: type inference failed for: r1v9, types: [he1.w] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo57111a(b41.C31128a r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof b41.C31128a.C31130b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x001c
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r6 = r5.f60398d
                hc1.v r6 = r6.m74422d3()
                if (r6 == 0) goto L_0x0013
                r6.mo95635L2(r2)
                he1.w r1 = he1.C41238w.f97225a
            L_0x0013:
                if (r1 != 0) goto L_0x00a4
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r6 = r5.f60398d
                r6.m74427i3(r2)
                goto L_0x00a4
            L_0x001c:
                boolean r0 = r6 instanceof b41.C31128a.C31131c
                if (r0 == 0) goto L_0x003c
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r6 = r5.f60398d
                o0.a r6 = p189o0.C7357a.m28044b(r6)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "ge.bog.mobilebank.products.presentation.products.refresh_products"
                r0.<init>(r1)
                r6.mo21731d(r0)
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r6 = r5.f60398d
                hc1.v r6 = r6.m74422d3()
                if (r6 == 0) goto L_0x00a4
                r6.mo4577k1()
                goto L_0x00a4
            L_0x003c:
                boolean r0 = r6 instanceof b41.C31128a.C31129a
                if (r0 == 0) goto L_0x00a4
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r0 = r5.f60398d
                hc1.v r0 = r0.m74422d3()
                r3 = 0
                if (r0 == 0) goto L_0x004f
                r0.mo95635L2(r3)
                he1.w r0 = he1.C41238w.f97225a
                goto L_0x0050
            L_0x004f:
                r0 = r1
            L_0x0050:
                if (r0 != 0) goto L_0x0057
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r0 = r5.f60398d
                r0.m74427i3(r3)
            L_0x0057:
                b41.a$a r6 = (b41.C31128a.C31129a) r6
                java.lang.Throwable r0 = r6.mo71342c()
                boolean r4 = r0 instanceof p341ge.bog.mobilebank.shared2.network.ApiError
                if (r4 == 0) goto L_0x0064
                r1 = r0
                ge.bog.mobilebank.shared2.network.ApiError r1 = (p341ge.bog.mobilebank.shared2.network.ApiError) r1
            L_0x0064:
                if (r1 == 0) goto L_0x0073
                ge.bog.mobilebank.shared2.network.BankApiResponse r0 = r1.mo84685a()
                if (r0 == 0) goto L_0x0073
                boolean r0 = r0.isScaError()
                if (r0 != r2) goto L_0x0073
                goto L_0x0074
            L_0x0073:
                r2 = r3
            L_0x0074:
                if (r2 == 0) goto L_0x0090
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r0 = r5.f60398d
                hc1.v r0 = r0.m74422d3()
                if (r0 == 0) goto L_0x009b
                ge.bog.mobilebank.shared2.network.BankApiResponse r1 = r1.mo84685a()
                java.lang.String r1 = r1.getKey()
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.String r1 = g91.C32343x.m95388F(r1, r2)
                r0.mo95634K2(r1)
                goto L_0x009b
            L_0x0090:
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r0 = r5.f60398d
                hc1.v r0 = r0.m74422d3()
                if (r0 == 0) goto L_0x009b
                r0.mo4577k1()
            L_0x009b:
                ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity r0 = r5.f60398d
                java.lang.Throwable r6 = r6.mo71342c()
                r0.mo74709H1(r6)
            L_0x00a4:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity.C22963o.mo57111a(b41.a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57111a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$p */
    static final class C22964p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60399d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22964p(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60399d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57112a(C29967k.C29969b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f60399d.m74444z3();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57112a((C29967k.C29969b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$q */
    static final class C22965q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60400d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22965q(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(1);
            this.f60400d = depositApplicationSubmissionActivity;
        }

        /* renamed from: a */
        public final void mo57113a(C41224m mVar) {
            boolean booleanValue = ((Boolean) mVar.mo95675a()).booleanValue();
            boolean booleanValue2 = ((Boolean) mVar.mo95676b()).booleanValue();
            if (booleanValue || booleanValue2) {
                C24933j P2 = this.f60400d.f60379G;
                if (P2 == null) {
                    C41536l.m120506z("binding");
                    P2 = null;
                }
                P2.f64155e.setVisibility(0);
                if (booleanValue) {
                    this.f60400d.m74435q3();
                }
                if (booleanValue2) {
                    this.f60400d.m74433o3();
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57113a((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$r */
    static final class C22966r implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60401a;

        C22966r(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60401a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60401a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60401a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$s */
    public static final class C22967s extends C41553c {

        /* renamed from: a */
        final /* synthetic */ DepositApplicationSubmissionActivity f60402a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22967s(Object obj, DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(obj);
            this.f60402a = depositApplicationSubmissionActivity;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C18338b0 b0Var = (C18338b0) obj2;
            C18338b0 b0Var2 = (C18338b0) obj;
            this.f60402a.m74419Z2().mo48987m(b0Var);
            C24933j P2 = this.f60402a.f60379G;
            if (P2 == null) {
                C41536l.m120506z("binding");
                P2 = null;
            }
            P2.f64152I.mo6606l(b0Var.mo46118c().mo46123a(this.f60402a.m74423e3().mo64747gs()), false);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$t */
    public static final class C22968t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60403d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22968t(ComponentActivity componentActivity) {
            super(0);
            this.f60403d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60403d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$u */
    public static final class C22969u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60404d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60405e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22969u(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60404d = aVar;
            this.f60405e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60404d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60405e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$v */
    static final class C22970v extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationSubmissionActivity f60406d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity$v$a */
        static final class C22971a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ DepositApplicationSubmissionActivity f60407d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22971a(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
                super(0);
                this.f60407d = depositApplicationSubmissionActivity;
            }

            /* renamed from: b */
            public final C25911u invoke() {
                return this.f60407d.mo57094a3().mo32548a(this.f60407d.m74420b3());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22970v(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity) {
            super(0);
            this.f60406d = depositApplicationSubmissionActivity;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22971a(this.f60406d));
        }
    }

    public DepositApplicationSubmissionActivity() {
        C41551a aVar = C41551a.f97718a;
        this.f60384L = new C22967s(C18338b0.C18346e.f51796d, this);
        this.f60385M = new C22951c(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final C20457a m74419Z2() {
        return (C20457a) this.f60383K.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final DepositSubmissionNavData m74420b3() {
        return (DepositSubmissionNavData) this.f60380H.getValue();
    }

    /* renamed from: c3 */
    private final C27113k m74421c3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95443e0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: d3 */
    public final C41185v m74422d3() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        C41536l.m120488h(supportFragmentManager, "supportFragmentManager");
        return C32343x.m95449g0(supportFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final C25911u m74423e3() {
        return (C25911u) this.f60382J.getValue();
    }

    /* renamed from: f3 */
    private final void m74424f3(ToggleView toggleView, ToggleView toggleView2, DepositSubmissionNavData depositSubmissionNavData, String str) {
        String str2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C25695d g;
        C41224m[] mVarArr = new C41224m[6];
        boolean z6 = false;
        mVarArr[0] = C41233s.m119492a("event_name", "deposit_application");
        mVarArr[1] = C41233s.m119492a(UrlHandler.ACTION, "open_deposit_precontract");
        if (depositSubmissionNavData == null || (g = depositSubmissionNavData.mo57172g()) == null || (str2 = g.name()) == null) {
            str2 = "";
        }
        mVarArr[2] = C41233s.m119492a("label", str2);
        mVarArr[3] = C41233s.m119492a("event_label_2", str);
        mVarArr[4] = C41233s.m119492a("event_label_3", "piggy_bank");
        mVarArr[5] = C41233s.m119492a("event_label_4", "STO");
        Bundle b = C0908e.m3336b(mVarArr);
        if (str == null) {
            b.remove("event_label_2");
        }
        if (toggleView == null || !toggleView.isChecked()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (toggleView2 == null || !toggleView2.isChecked()) {
                z5 = false;
            } else {
                z5 = true;
            }
            if (z5) {
                m74425g3(depositSubmissionNavData, b);
                return;
            }
        }
        if (toggleView == null || !toggleView.isChecked()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (toggleView2 == null || toggleView2.isChecked()) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                b.remove("event_label_4");
                m74425g3(depositSubmissionNavData, b);
                return;
            }
        }
        if (toggleView == null || toggleView.isChecked()) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            if (toggleView2 != null && toggleView2.isChecked()) {
                z6 = true;
            }
            if (z6) {
                b.remove("event_label_3");
                m74425g3(depositSubmissionNavData, b);
                return;
            }
        }
        b.remove("event_label_3");
        b.remove("event_label_4");
        m74425g3(depositSubmissionNavData, b);
    }

    /* renamed from: g3 */
    private final void m74425g3(DepositSubmissionNavData depositSubmissionNavData, Bundle bundle) {
        String str;
        C25695d g;
        if (depositSubmissionNavData == null || (g = depositSubmissionNavData.mo57172g()) == null || (str = g.name()) == null) {
            str = "";
        }
        C32343x.m95385D0(this, "deposit_application", str, "open_deposit_precontract", C10464h.C10465a.FIREBASE, bundle);
    }

    /* renamed from: h3 */
    private final void m74426h3() {
        m74423e3().mo64744Yv().mo4819k(this, new C22966r(new C22957i(this)));
        m74423e3().mo64761m().mo4819k(this, new C22966r(new C22958j(this)));
        m74423e3().mo64741Uo().mo4819k(this, new C22966r(new C22959k(this)));
        m74423e3().mo64756ki().mo4819k(this, new C22966r(new C22960l(this)));
        m74423e3().mo64739P2().mo4819k(this, new C22966r(new C22961m(this)));
        m74423e3().mo64750i3().mo4819k(this, new C22966r(new C22962n(this)));
        m74423e3().mo64733F0().mo4819k(this, new C22966r(new C22963o(this)));
        C37224b.m109963b(m74423e3().mo64752j3(), this, new C22964p(this));
        m74423e3().mo64760lw().mo64729Ra().mo4819k(this, new C22966r(new C22965q(this)));
        m74423e3().mo64760lw().mo64730X1().mo4819k(this, new C22966r(new C22953e(this)));
        m74423e3().mo64760lw().mo64731e0().mo4819k(this, new C22966r(new C22954f(this)));
        C37224b.m109963b(m74423e3().mo64760lw().mo64732p3(), this, new C22955g(this));
        C37224b.m109963b(m74423e3().mo64760lw().mo64728F2(), this, new C22956h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m74427i3(boolean z) {
        C24933j jVar = this.f60379G;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        CardView cardView = jVar.f64149F;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        C24933j jVar2 = this.f60379G;
        if (jVar2 == null) {
            C41536l.m120506z("binding");
            jVar2 = null;
        }
        FrameLayout frameLayout = jVar2.f64147D;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: j3 */
    private final void m74428j3() {
        getSupportFragmentManager().mo4367F1("DepositNameActionSheet_REQUEST_KEY", this, new C20200g(this));
        getSupportFragmentManager().mo4367F1("AccumulateOnPaymentActionSheet.CAS_DATA", this, new C20201h(this));
        getSupportFragmentManager().mo4367F1("AccumulateONSpecificDateActionSheet.REQUEST", this, new C20202i(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m74429k3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, String str, Bundle bundle) {
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        depositApplicationSubmissionActivity.m74423e3().mo64765rq(bundle.getString("ARGS_DEPOSIT_NAME"));
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public static final void m74430l3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, String str, Bundle bundle) {
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        AccumulateOnPaymentModel accumulateOnPaymentModel = (AccumulateOnPaymentModel) bundle.getParcelable("AccumulateOnPaymentActionSheet.CAS_DATA");
        if (accumulateOnPaymentModel != null) {
            depositApplicationSubmissionActivity.m74423e3().mo64735Kb(accumulateOnPaymentModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m3 */
    public static final void m74431m3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, String str, Bundle bundle) {
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        AccumulateOnSpecificDateModel accumulateOnSpecificDateModel = (AccumulateOnSpecificDateModel) bundle.getParcelable("AccumulateOnSpecificDateActionSheet.STO_DATA");
        if (accumulateOnSpecificDateModel != null) {
            depositApplicationSubmissionActivity.m74423e3().mo64753jk(accumulateOnSpecificDateModel);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public final void m74432n3(C18338b0 b0Var) {
        this.f60384L.setValue(this, f60378O[0], b0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public final void m74433o3() {
        C24933j jVar = this.f60379G;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        OvalIconToggleItem ovalIconToggleItem = jVar.f64160j;
        ovalIconToggleItem.setVisibility(0);
        ovalIconToggleItem.setHeader(C32343x.m95388F("applications.deposits.success.accumulate.STO.header", new Object[0]));
        ovalIconToggleItem.setDescription(C32343x.m95388F("applications.deposits.success.accumulate.STO.text", new Object[0]));
        ovalIconToggleItem.setIcon(new Image.Resource(C19950d.icons_24_system_calendar_outline, (Boolean) null, 2, (DefaultConstructorMarker) null));
        ToggleView toggleView = (ToggleView) ovalIconToggleItem.getRightItemView();
        if (toggleView != null) {
            toggleView.setOnClickListener(new C20203j(ovalIconToggleItem, this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m74434p3(OvalIconToggleItem ovalIconToggleItem, DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, View view) {
        C41536l.m120489i(ovalIconToggleItem, "$this_apply");
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        ovalIconToggleItem.mo35998c(false);
        depositApplicationSubmissionActivity.m74423e3().mo64751iw().mo64727r0();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public final void m74435q3() {
        C24933j jVar = this.f60379G;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        OvalIconToggleItem ovalIconToggleItem = jVar.f64146C;
        ovalIconToggleItem.setVisibility(0);
        ovalIconToggleItem.setHeader(C32343x.m95388F("applications.deposits.success.accumulate.MB.header", new Object[0]));
        ovalIconToggleItem.setDescription(C32343x.m95388F("applications.deposits.success.accumulate.MB.text", new Object[0]));
        ovalIconToggleItem.setIcon(new Image.Resource(C19950d.icons_24_payment_transfer_payment, (Boolean) null, 2, (DefaultConstructorMarker) null));
        ToggleView toggleView = (ToggleView) ovalIconToggleItem.getRightItemView();
        if (toggleView != null) {
            toggleView.setOnClickListener(new C20194a(ovalIconToggleItem, this));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m74436r3(OvalIconToggleItem ovalIconToggleItem, DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, View view) {
        C41536l.m120489i(ovalIconToggleItem, "$this_apply");
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        ovalIconToggleItem.mo35998c(false);
        depositApplicationSubmissionActivity.m74423e3().mo64751iw().mo64726q1();
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m74437s3(C25702a aVar) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        C24933j jVar = this.f60379G;
        Integer num = null;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        DepositSubmissionNavData g = aVar.mo64270g();
        C20457a Z2 = m74419Z2();
        DepositPurposeUiModel h = aVar.mo64271h();
        if (h != null) {
            str = h.mo56803e();
        } else {
            str = null;
        }
        Z2.mo48985k(str);
        int h2 = m74419Z2().mo48982h();
        C24933j jVar2 = this.f60379G;
        if (jVar2 == null) {
            C41536l.m120506z("binding");
            jVar2 = null;
        }
        ViewPager2 viewPager2 = jVar2.f64152I;
        if (h2 == -1) {
            h2 = 0;
        }
        viewPager2.mo6606l(h2, false);
        C24933j jVar3 = this.f60379G;
        if (jVar3 == null) {
            C41536l.m120506z("binding");
            jVar3 = null;
        }
        CoordinatorLayout c = jVar3.mo3946b();
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(150);
        TransitionManager.beginDelayedTransition(c, autoTransition);
        boolean k = aVar.mo64275k();
        Input input = jVar.f64163m;
        C41536l.m120488h(input, "depositNameInput");
        C32343x.m95483r1(input, k, false, 2, (Object) null);
        ListItem listItem = jVar.f64164n;
        C41536l.m120488h(listItem, "depositNameListItem");
        C32343x.m95483r1(listItem, !k, false, 2, (Object) null);
        View view = jVar.f64165o;
        C41536l.m120488h(view, "depositNameListItemDivider");
        C32343x.m95483r1(view, !k, false, 2, (Object) null);
        boolean z5 = true;
        if (!k) {
            if (jVar.f64163m.getInputText().length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                Input input2 = jVar.f64163m;
                input2.getTextInput().removeTextChangedListener(this.f60385M);
                input2.setInputText("");
                input2.getTextInput().addTextChangedListener(this.f60385M);
            }
        }
        jVar.f64166p.setText(aVar.mo64266d());
        jVar.f64161k.setText(C32343x.m95408P(g.mo57167d(), g.mo57165a()));
        jVar.f64153J.setText(C32343x.m95388F(g.mo57179m().mo56826a(), new Object[0]));
        TwoLineTextItem twoLineTextItem = jVar.f64169s;
        twoLineTextItem.setText(aVar.mo64267e() + " " + getString(C19954h.f54546c));
        C41536l.m120488h(twoLineTextItem, "setupForm$lambda$15$lambda$12");
        if (g.mo57166b() != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(twoLineTextItem, z, false, 2, (Object) null);
        View view2 = jVar.f64168r;
        C41536l.m120488h(view2, "depositTermDivider");
        if (g.mo57166b() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32343x.m95483r1(view2, z2, false, 2, (Object) null);
        jVar.f64167q.setText(C32319m.m95314u(g.mo57171f()));
        TwoLineTextItem twoLineTextItem2 = jVar.f64162l;
        Long b = g.mo57166b();
        if (b != null) {
            str2 = C32319m.m95314u(b.longValue());
        } else {
            str2 = null;
        }
        twoLineTextItem2.setText(str2);
        C41536l.m120488h(twoLineTextItem2, "setupForm$lambda$15$lambda$14");
        if (g.mo57166b() != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C32343x.m95483r1(twoLineTextItem2, z3, false, 2, (Object) null);
        jVar.f64158h.setText(g.mo57173h().mo56813d() + "%");
        jVar.f64172v.setText(g.mo57173h().mo56812b() + "%");
        TextView textView = jVar.f64175y;
        Double e = g.mo57173h().mo56815e();
        if (e != null) {
            str3 = C32343x.m95410Q(e.doubleValue(), g.mo57165a(), false, 2, (Object) null);
        } else {
            str3 = null;
        }
        textView.setText(str3);
        jVar.f64157g.setText(C26920a.f67675a.mo66213a(this, g.mo57173h().mo56817f()));
        LinearLayout linearLayout = jVar.f64173w;
        C41536l.m120488h(linearLayout, "expectedInterestContainer");
        if (g.mo57173h().mo56815e() == null) {
            z5 = false;
        }
        C32343x.m95483r1(linearLayout, z5, false, 2, (Object) null);
        if (aVar.mo64265c() != null) {
            CreditCardSmallPickerView picker = jVar.f64159i.getPicker();
            String e2 = aVar.mo64265c().mo52136e();
            if (e2 != null) {
                num = C40438v.m117098j(e2);
            }
            Integer num2 = num;
            String q = aVar.mo64265c().mo52148q();
            if (q == null) {
                q = aVar.mo64265c().mo52134d();
            }
            picker.setCreditCard(new CreditCardSmallPickerView.C13279b.C13281b((String) null, num2, q, aVar.mo64265c().mo52154v(), (String) null));
            return;
        }
        jVar.f64159i.getPicker().setCreditCard(CreditCardSmallPickerView.C13279b.C13280a.f39265a);
    }

    /* renamed from: t3 */
    private final void m74438t3(DepositSubmissionNavData depositSubmissionNavData) {
        C24933j jVar = this.f60379G;
        if (jVar == null) {
            C41536l.m120506z("binding");
            jVar = null;
        }
        CreditCardSmallPickerView.C13282c cVar = new CreditCardSmallPickerView.C13282c(C32343x.m95388F("applications.deposits.fields.deposit.source.acc", new Object[0]), C32343x.m95388F("applications.deposits.overview.account", new Object[0]));
        PageDescriptionView pageDescriptionView = jVar.f64144A;
        pageDescriptionView.setTitle(C32343x.m95388F("applications.deposits.fields.deposit.purpose.header", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("applications.deposits.fields.deposit.purpose.main.text", new Object[0]));
        jVar.f64170t.setText(C32343x.m95388F("applications.deposits.overview.header", new Object[0]));
        jVar.f64163m.setHintText((CharSequence) C32343x.m95388F("applications.deposits.fields.deposit.name", new Object[0]));
        jVar.f64166p.setTitle(C32343x.m95388F("applications.deposits.fields.deposit.name", new Object[0]));
        jVar.f64161k.setTitle(C32343x.m95388F("applications.deposits.deposit.amount", new Object[0]));
        jVar.f64153J.setTitle(C32343x.m95388F("applications.deposits.fields.deposit.int.accrual.period", new Object[0]));
        jVar.f64169s.setTitle(C32343x.m95388F("applications.deposits.deposit.term", new Object[0]));
        jVar.f64167q.setTitle(C32343x.m95388F("applications.deposits.overview.date", new Object[0]));
        jVar.f64162l.setTitle(C32343x.m95388F("applications.deposits.overview.end.date", new Object[0]));
        jVar.f64171u.setText(C32343x.m95388F("applications.deposits.fields.deposit.effective.int.rate", new Object[0]));
        jVar.f64174x.setText(C32343x.m95388F("applications.deposits.fields.deposit.planned.int.amount", new Object[0]));
        jVar.f64156f.setText(C32343x.m95388F("applications.deposits.success.accumulate.main.text", new Object[0]));
        jVar.f64163m.getTextInput().addTextChangedListener(this.f60385M);
        jVar.f64152I.setAdapter(m74419Z2());
        m74419Z2().mo48986l(new C20195b(this));
        jVar.f64164n.setOnClickListener(new C20196c(this));
        FixedButtonCardSelectorView fixedButtonCardSelectorView = jVar.f64159i;
        fixedButtonCardSelectorView.getMainButton().setButtonText(C32343x.m95388F("applications.deposits.I.main.button.label", new Object[0]));
        fixedButtonCardSelectorView.getPicker().mo35468h(cVar);
        fixedButtonCardSelectorView.getMainButton().setOnClickListener(new C20197d(this, depositSubmissionNavData));
        fixedButtonCardSelectorView.getPicker().setOnClickListener(new C20198e(this));
        jVar.f64148E.mo3946b().setOnClickListener(new C20199f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: u3 */
    public static final void m74439u3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, long j) {
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        depositApplicationSubmissionActivity.m74423e3().mo64743Ve(Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: v3 */
    public static final void m74440v3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, View view) {
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        C20789b.f56024J.mo49379a().mo4576A1(depositApplicationSubmissionActivity.getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w3 */
    public static final void m74441w3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, DepositSubmissionNavData depositSubmissionNavData, View view) {
        String str;
        DepositPurposeUiModel h;
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        C25702a aVar = (C25702a) depositApplicationSubmissionActivity.m74423e3().mo64744Yv().mo4814f();
        C24933j jVar = null;
        if (aVar == null || (h = aVar.mo64271h()) == null) {
            str = null;
        } else {
            str = h.mo56803e();
        }
        C24933j jVar2 = depositApplicationSubmissionActivity.f60379G;
        if (jVar2 == null) {
            C41536l.m120506z("binding");
            jVar2 = null;
        }
        ToggleView toggleView = (ToggleView) jVar2.f64146C.getRightItemView();
        C24933j jVar3 = depositApplicationSubmissionActivity.f60379G;
        if (jVar3 == null) {
            C41536l.m120506z("binding");
        } else {
            jVar = jVar3;
        }
        depositApplicationSubmissionActivity.m74424f3(toggleView, (ToggleView) jVar.f64160j.getRightItemView(), depositSubmissionNavData, str);
        depositApplicationSubmissionActivity.m74423e3().mo64755k0();
    }

    /* access modifiers changed from: private */
    /* renamed from: x3 */
    public static final void m74442x3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, View view) {
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        depositApplicationSubmissionActivity.m74423e3().mo64736Ma();
    }

    /* access modifiers changed from: private */
    /* renamed from: y3 */
    public static final void m74443y3(DepositApplicationSubmissionActivity depositApplicationSubmissionActivity, View view) {
        C41536l.m120489i(depositApplicationSubmissionActivity, "this$0");
        C21481a.onRefresh$default(depositApplicationSubmissionActivity.m74423e3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: z3 */
    public final void m74444z3() {
        DepositApplicationResultActivity.C22826a.m74089b(DepositApplicationResultActivity.f60170K, this, (DepositApplicationResultArgs) null, 2, (Object) null);
        setResult(-1);
        finish();
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m74423e3().mo64737O(str, str2, str3, str4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C24933j d = C24933j.m79715d(getLayoutInflater());
        C41536l.m120488h(d, "inflate(layoutInflater)");
        this.f60379G = d;
        if (d == null) {
            C41536l.m120506z("binding");
            d = null;
        }
        setContentView((View) d.mo3946b());
        super.mo37451O1(bundle);
        m74438t3(m74420b3());
        m74426h3();
        m74428j3();
    }

    /* renamed from: P */
    public void mo57031P(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "account");
        m74423e3().mo64738P(transferAccountItem);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C12910e.m48790h(this, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m74427i3(z);
    }

    /* renamed from: a3 */
    public final C25906p mo57094a3() {
        C25906p pVar = this.f60381I;
        if (pVar != null) {
            return pVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: m */
    public void mo39137m() {
        C27113k c3 = m74421c3();
        if (c3 != null) {
            c3.mo4577k1();
        }
        m74423e3().mo64745Z();
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("applications.deposits.fields.deposit.purpose.header", new Object[0]);
    }
}
