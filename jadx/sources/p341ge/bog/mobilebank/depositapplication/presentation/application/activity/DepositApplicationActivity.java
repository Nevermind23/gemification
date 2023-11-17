package p341ge.bog.mobilebank.depositapplication.presentation.application.activity;

import a81.C30772sa;
import af1.C40303i;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.activity.ComponentActivity;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.C0173b;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.core.view.C1152f3;
import androidx.lifecycle.C1617p0;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1645y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import com.google.android.flexbox.FlexboxLayout;
import da0.C19949c;
import da0.C19955i;
import g91.C32314k;
import g91.C32343x;
import ha0.C24931h;
import he1.C41212c;
import he1.C41217g;
import he1.C41224m;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import ka0.C25695d;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import m41.C37223a;
import ma0.C26162a;
import ma0.C26163b;
import ma0.C26164c;
import ma0.C26165d;
import ma0.C26166e;
import ma0.C26167f;
import ma0.C26168g;
import ma0.C26169h;
import ma0.C26170i;
import na0.C26391a;
import oa0.C26916a;
import p017b.C2106d;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.carousel.monthcarousel.MonthCarouselView;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.inlinefeedback.InlineFeedback;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.WithdrawalTypeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.DepositApplicationSubmissionActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p380ck.C10464h;
import p642vh.C18338b0;
import pa0.C27487a;
import ra0.C27955a;
import ue1.C43064a;
import ue1.C43075l;
import xa0.C29665b;
import ze1.C43420e;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity */
public final class DepositApplicationActivity extends C30772sa {

    /* renamed from: K */
    public static final C22794a f60098K = new C22794a((DefaultConstructorMarker) null);

    /* renamed from: L */
    static final /* synthetic */ C40303i[] f60099L = {C41520a0.m120439e(new C41539o(DepositApplicationActivity.class, "slider", "getSlider()Lge/bog/designsystem/components/common/Slider;", 0))};
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C24931h f60100F;

    /* renamed from: G */
    private final C41217g f60101G = new C1617p0(C41520a0.m120436b(DepositApplicationViewModel$ViewModel.class), new C22808o(this), new C22807n(this), new C22809p((C43064a) null, this));
    /* access modifiers changed from: private */

    /* renamed from: H */
    public final C26391a f60102H = new C26391a();
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C0173b f60103I;

    /* renamed from: J */
    private final C41555e f60104J;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$a */
    public static final class C22794a {
        private C22794a() {
        }

        public /* synthetic */ C22794a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ void m73981b(C22794a aVar, Context context, ArrayList arrayList, C25695d dVar, Long l, int i, Object obj) {
            if ((i & 8) != 0) {
                l = null;
            }
            aVar.mo56778a(context, arrayList, dVar, l);
        }

        /* renamed from: a */
        public final void mo56778a(Context context, ArrayList arrayList, C25695d dVar, Long l) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(arrayList, "deposits");
            C41536l.m120489i(dVar, "selectedDepositType");
            Intent intent = new Intent(context, DepositApplicationActivity.class);
            intent.putExtra("EXTRA_DEPOSITS", arrayList);
            intent.putExtra("EXTRA_SELECTED_DEPOSIT_TYPE", dVar);
            intent.putExtra("EXTRA_SELECTED_DEPOSIT_PURPOSE", l);
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$b */
    public static final class C22795b extends ViewPager2.C1928i {

        /* renamed from: a */
        final /* synthetic */ DepositApplicationActivity f60105a;

        /* renamed from: b */
        final /* synthetic */ ViewPager2 f60106b;

        C22795b(DepositApplicationActivity depositApplicationActivity, ViewPager2 viewPager2) {
            this.f60105a = depositApplicationActivity;
            this.f60106b = viewPager2;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static final void m73984b(View view, ViewPager2 viewPager2) {
            C41536l.m120489i(viewPager2, "$viewPager");
            view.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            if (viewPager2.getLayoutParams().height != view.getMeasuredHeight()) {
                ViewGroup.LayoutParams layoutParams = viewPager2.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.height = view.getMeasuredHeight();
                    viewPager2.setLayoutParams(layoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }

        public void onPageSelected(int i) {
            RecyclerView.C1747p pVar;
            super.onPageSelected(i);
            int a = this.f60105a.m73964f3().mo46117b().mo46119a(this.f60105a.m73965g3().mo56866mw().mo56838E4(), i);
            RecyclerView R2 = this.f60105a.m73963e3(this.f60106b);
            View view = null;
            if (R2 != null) {
                pVar = R2.getLayoutManager();
            } else {
                pVar = null;
            }
            if (pVar != null) {
                view = pVar.mo5199O(i);
            }
            if (view != null) {
                view.post(new C26170i(view, this.f60106b));
            }
            this.f60105a.m73965g3().mo56863lw().mo56861kh(a);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$c */
    static final class C22796c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60107d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22796c(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60107d = depositApplicationActivity;
        }

        /* renamed from: a */
        public final void mo56779a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                DepositApplicationActivity depositApplicationActivity = this.f60107d;
                boolean booleanValue = bool.booleanValue();
                C24931h Q2 = depositApplicationActivity.f60100F;
                if (Q2 == null) {
                    C41536l.m120506z("binding");
                    Q2 = null;
                }
                FrameLayout frameLayout = Q2.f64129m;
                C41536l.m120488h(frameLayout, "binding.progressBar");
                C32343x.m95483r1(frameLayout, booleanValue, false, 2, (Object) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56779a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$d */
    static final class C22797d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60108d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22797d(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60108d = depositApplicationActivity;
        }

        /* renamed from: a */
        public final void mo56780a(List list) {
            DepositApplicationActivity depositApplicationActivity = this.f60108d;
            C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, depositApplicationActivity.m73965g3().mo56866mw().mo56838E4(), C19955i.f54547a, false, false, 12, (Object) null);
            C24931h Q2 = this.f60108d.f60100F;
            if (Q2 == null) {
                C41536l.m120506z("binding");
                Q2 = null;
            }
            ViewPager2 viewPager2 = Q2.f64133q;
            C41536l.m120488h(viewPager2, "binding.viewPager");
            C24931h Q22 = this.f60108d.f60100F;
            if (Q22 == null) {
                C41536l.m120506z("binding");
                Q22 = null;
            }
            FrameLayout frameLayout = Q22.f64127k;
            C41536l.m120488h(frameLayout, "binding.pagerIndicatorContainer");
            depositApplicationActivity.m73970l3(b.mo46116a(viewPager2, frameLayout));
            C26391a P2 = this.f60108d.f60102H;
            C41536l.m120488h(list, "deposits");
            P2.mo65627i(list);
            C24931h Q23 = this.f60108d.f60100F;
            if (Q23 == null) {
                C41536l.m120506z("binding");
                Q23 = null;
            }
            FrameLayout frameLayout2 = Q23.f64127k;
            C41536l.m120488h(frameLayout2, "binding.pagerIndicatorContainer");
            boolean z = true;
            if (list.size() <= 1) {
                z = false;
            }
            C32343x.m95483r1(frameLayout2, z, false, 2, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56780a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$e */
    static final class C22798e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60109d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22798e(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60109d = depositApplicationActivity;
        }

        /* renamed from: a */
        public final void mo56781a(C31128a aVar) {
            C24931h hVar = null;
            if (aVar instanceof C31128a.C31130b) {
                C24931h Q2 = this.f60109d.f60100F;
                if (Q2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = Q2;
                }
                CardView cardView = hVar.f64131o;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95455i0(cardView);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f60109d.m73958Z2((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                C24931h Q22 = this.f60109d.f60100F;
                if (Q22 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = Q22;
                }
                CardView cardView2 = hVar.f64131o;
                C41536l.m120488h(cardView2, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView2);
                this.f60109d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56781a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$f */
    static final class C22799f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60110d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22799f(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60110d = depositApplicationActivity;
        }

        /* renamed from: a */
        public final void mo56782a(C31128a aVar) {
            C24931h hVar = null;
            if (aVar instanceof C31128a.C31131c) {
                C24931h Q2 = this.f60110d.f60100F;
                if (Q2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = Q2;
                }
                LinearLayout c = hVar.f64135s.mo3946b();
                C41536l.m120488h(c, "binding.withdrawalTypeErrorLayout.root");
                C32343x.m95455i0(c);
                this.f60110d.m73960b3((List) ((C31128a.C31131c) aVar).mo71340a());
            } else if (aVar instanceof C31128a.C31129a) {
                C24931h Q22 = this.f60110d.f60100F;
                if (Q22 == null) {
                    C41536l.m120506z("binding");
                    Q22 = null;
                }
                LinearLayoutCompat c2 = Q22.f64134r.mo3946b();
                C41536l.m120488h(c2, "binding.withdrawalSelectorLayout.root");
                C32343x.m95455i0(c2);
                C24931h Q23 = this.f60110d.f60100F;
                if (Q23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = Q23;
                }
                LinearLayout c3 = hVar.f64135s.mo3946b();
                C41536l.m120488h(c3, "binding.withdrawalTypeErrorLayout.root");
                C32343x.m95447f1(c3);
                this.f60110d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56782a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$g */
    static final class C22800g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60111d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22800g(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60111d = depositApplicationActivity;
        }

        /* renamed from: a */
        public final void mo56783a(C31128a aVar) {
            C24931h hVar = null;
            if (aVar instanceof C31128a.C31131c) {
                C24931h Q2 = this.f60111d.f60100F;
                if (Q2 == null) {
                    C41536l.m120506z("binding");
                    Q2 = null;
                }
                LinearLayout c = Q2.f64125i.mo3946b();
                C41536l.m120488h(c, "binding.interestRateErrorLayout.root");
                C32343x.m95455i0(c);
                C41224m mVar = (C41224m) ((C31128a.C31131c) aVar).mo71340a();
                InterestRateUiModel interestRateUiModel = (InterestRateUiModel) mVar.mo95675a();
                String str = (String) mVar.mo95676b();
                if (!C41536l.m120484d(interestRateUiModel, InterestRateUiModel.f60141i.mo56821a())) {
                    C24931h Q22 = this.f60111d.f60100F;
                    if (Q22 == null) {
                        C41536l.m120506z("binding");
                    } else {
                        hVar = Q22;
                    }
                    LinearLayoutCompat c2 = hVar.f64126j.mo3946b();
                    C41536l.m120488h(c2, "binding.interestRateLayout.root");
                    C32343x.m95447f1(c2);
                    this.f60111d.m73978t3(interestRateUiModel, str);
                    return;
                }
                C24931h Q23 = this.f60111d.f60100F;
                if (Q23 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = Q23;
                }
                LinearLayoutCompat c3 = hVar.f64126j.mo3946b();
                C41536l.m120488h(c3, "binding.interestRateLayout.root");
                C32343x.m95455i0(c3);
            } else if (aVar instanceof C31128a.C31129a) {
                C24931h Q24 = this.f60111d.f60100F;
                if (Q24 == null) {
                    C41536l.m120506z("binding");
                    Q24 = null;
                }
                LinearLayoutCompat c4 = Q24.f64126j.mo3946b();
                C41536l.m120488h(c4, "binding.interestRateLayout.root");
                C32343x.m95455i0(c4);
                C24931h Q25 = this.f60111d.f60100F;
                if (Q25 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = Q25;
                }
                LinearLayout c5 = hVar.f64125i.mo3946b();
                C41536l.m120488h(c5, "binding.interestRateErrorLayout.root");
                C32343x.m95447f1(c5);
                this.f60111d.mo74709H1(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56783a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$h */
    static final class C22801h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60112d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22801h(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60112d = depositApplicationActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public static final Date m73992d(DepositApplicationActivity depositApplicationActivity, int i) {
            C41536l.m120489i(depositApplicationActivity, "this$0");
            return depositApplicationActivity.m73965g3().mo56849Yi(i);
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public static final void m73993e(DepositApplicationActivity depositApplicationActivity, int i) {
            C41536l.m120489i(depositApplicationActivity, "this$0");
            depositApplicationActivity.m73965g3().mo56841K(i);
        }

        /* renamed from: c */
        public final void mo56784c(C41224m mVar) {
            C43420e eVar = (C43420e) mVar.mo95675a();
            Integer num = (Integer) mVar.mo95676b();
            C24931h Q2 = this.f60112d.f60100F;
            if (Q2 == null) {
                C41536l.m120506z("binding");
                Q2 = null;
            }
            MonthCarouselView monthCarouselView = Q2.f64128l.f64235f;
            DepositApplicationActivity depositApplicationActivity = this.f60112d;
            monthCarouselView.mo44794h(eVar, num);
            monthCarouselView.setEndDateCalculator(new C22810a(depositApplicationActivity));
            monthCarouselView.setPeriodSelectionListener(new C22811b(depositApplicationActivity));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56784c((C41224m) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$i */
    static final class C22802i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60113d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22802i(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60113d = depositApplicationActivity;
        }

        /* renamed from: a */
        public final void mo56785a(C27487a aVar) {
            this.f60113d.m73977s3(aVar.mo66796i().mo57218e());
            DepositApplicationActivity depositApplicationActivity = this.f60113d;
            C41536l.m120488h(aVar, "formData");
            depositApplicationActivity.m73967i3(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56785a((C27487a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$j */
    static final class C22803j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60114d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22803j(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60114d = depositApplicationActivity;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Boolean) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Boolean bool) {
            C24931h Q2 = this.f60114d.f60100F;
            if (Q2 == null) {
                C41536l.m120506z("binding");
                Q2 = null;
            }
            Button button = Q2.f64121e;
            C41536l.m120488h(bool, "isEnabled");
            button.setEnabled(bool.booleanValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$k */
    static final class C22804k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositApplicationActivity f60115d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22804k(DepositApplicationActivity depositApplicationActivity) {
            super(1);
            this.f60115d = depositApplicationActivity;
        }

        /* renamed from: a */
        public final void mo56787a(C37223a aVar) {
            DepositSubmissionNavData depositSubmissionNavData = (DepositSubmissionNavData) aVar.mo90296a();
            if (depositSubmissionNavData != null) {
                DepositApplicationActivity depositApplicationActivity = this.f60115d;
                C32343x.m95393H0(depositApplicationActivity, "deposit_application", depositSubmissionNavData.mo57172g().toString(), "chosen_deposit_type_next_button", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
                DepositApplicationSubmissionActivity.C22949a aVar2 = DepositApplicationSubmissionActivity.f60377N;
                C0173b O2 = depositApplicationActivity.f60103I;
                if (O2 == null) {
                    C41536l.m120506z("activityResultLauncher");
                    O2 = null;
                }
                aVar2.mo57095a(depositApplicationActivity, O2, depositSubmissionNavData);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo56787a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$l */
    static final class C22805l implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60116a;

        C22805l(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60116a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60116a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60116a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$m */
    public static final class C22806m extends C41553c {

        /* renamed from: a */
        final /* synthetic */ DepositApplicationActivity f60117a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22806m(Object obj, DepositApplicationActivity depositApplicationActivity) {
            super(obj);
            this.f60117a = depositApplicationActivity;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C18338b0 b0Var = (C18338b0) obj2;
            C18338b0 b0Var2 = (C18338b0) obj;
            this.f60117a.f60102H.mo65626h(b0Var);
            C24931h Q2 = this.f60117a.f60100F;
            if (Q2 == null) {
                C41536l.m120506z("binding");
                Q2 = null;
            }
            ViewPager2 viewPager2 = Q2.f64133q;
            viewPager2.setAdapter(viewPager2.getAdapter());
            viewPager2.mo6606l(b0Var.mo46118c().mo46123a(this.f60117a.m73965g3().mo56866mw().mo56838E4()), false);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$n */
    public static final class C22807n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22807n(ComponentActivity componentActivity) {
            super(0);
            this.f60118d = componentActivity;
        }

        public final C1620q0.C1624b invoke() {
            C1620q0.C1624b defaultViewModelProviderFactory = this.f60118d.getDefaultViewModelProviderFactory();
            C41536l.m120488h(defaultViewModelProviderFactory, "defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$o */
    public static final class C22808o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f60119d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22808o(ComponentActivity componentActivity) {
            super(0);
            this.f60119d = componentActivity;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = this.f60119d.getViewModelStore();
            C41536l.m120488h(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity$p */
    public static final class C22809p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60120d;

        /* renamed from: e */
        final /* synthetic */ ComponentActivity f60121e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22809p(C43064a aVar, ComponentActivity componentActivity) {
            super(0);
            this.f60120d = aVar;
            this.f60121e = componentActivity;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60120d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C7047a defaultViewModelCreationExtras = this.f60121e.getDefaultViewModelCreationExtras();
            C41536l.m120488h(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public DepositApplicationActivity() {
        C41551a aVar = C41551a.f97718a;
        this.f60104J = new C22806m(C18338b0.C18346e.f51796d, this);
    }

    /* renamed from: Y2 */
    private final void m73957Y2() {
        C24931h hVar = this.f60100F;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        ViewPager2 viewPager2 = hVar.f64133q;
        C41536l.m120488h(viewPager2, "binding.viewPager");
        viewPager2.mo6603h(new C22795b(this, viewPager2));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z2 */
    public final void m73958Z2(List list) {
        ViewGroup.MarginLayoutParams c0;
        C24931h hVar = this.f60100F;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        hVar.f64122f.removeAllViews();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            String str = (String) next;
            String a = C32314k.m95245a(str);
            C26916a aVar = new C26916a(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            aVar.setText(a);
            aVar.setTag(str);
            if (i > 0 && (c0 = C32343x.m95437c0(aVar)) != null) {
                c0.setMargins(aVar.getResources().getDimensionPixelSize(C19949c.f54497b), 0, 0, 0);
            }
            aVar.setOnClickListener(new C26162a(this, aVar));
            C24931h hVar2 = this.f60100F;
            if (hVar2 == null) {
                C41536l.m120506z("binding");
                hVar2 = null;
            }
            hVar2.f64122f.addView(aVar);
            i = i2;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a3 */
    public static final void m73959a3(DepositApplicationActivity depositApplicationActivity, C26916a aVar, View view) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        C41536l.m120489i(aVar, "$this_apply");
        C27955a lw = depositApplicationActivity.m73965g3().mo56863lw();
        Object tag = aVar.getTag();
        C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.String");
        lw.mo56854fi((String) tag);
    }

    /* access modifiers changed from: private */
    /* renamed from: b3 */
    public final void m73960b3(List list) {
        C24931h hVar = this.f60100F;
        C24931h hVar2 = null;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        hVar.f64134r.f64238f.removeAllViews();
        if (list.isEmpty()) {
            C24931h hVar3 = this.f60100F;
            if (hVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                hVar2 = hVar3;
            }
            LinearLayoutCompat c = hVar2.f64134r.mo3946b();
            C41536l.m120488h(c, "binding.withdrawalSelectorLayout.root");
            C32343x.m95455i0(c);
        } else if (list.size() == 1) {
            C24931h hVar4 = this.f60100F;
            if (hVar4 == null) {
                C41536l.m120506z("binding");
                hVar4 = null;
            }
            InlineFeedback inlineFeedback = hVar4.f64126j.f64251m;
            C41536l.m120488h(inlineFeedback, "binding.interestRateLayo…hdrawalTypeInlineFeedback");
            C32343x.m95447f1(inlineFeedback);
            C24931h hVar5 = this.f60100F;
            if (hVar5 == null) {
                C41536l.m120506z("binding");
                hVar5 = null;
            }
            hVar5.f64126j.f64251m.setTitleText(C32343x.m95388F("applications.deposits.fields.deposit.info.int.accrual.period", new Object[0]) + " " + C32343x.m95388F(((WithdrawalTypeUiModel) C41358y.m120007W(list)).mo56826a(), new Object[0]));
            C24931h hVar6 = this.f60100F;
            if (hVar6 == null) {
                C41536l.m120506z("binding");
            } else {
                hVar2 = hVar6;
            }
            LinearLayoutCompat c2 = hVar2.f64134r.mo3946b();
            C41536l.m120488h(c2, "binding.withdrawalSelectorLayout.root");
            C32343x.m95455i0(c2);
        } else {
            C24931h hVar7 = this.f60100F;
            if (hVar7 == null) {
                C41536l.m120506z("binding");
                hVar7 = null;
            }
            InlineFeedback inlineFeedback2 = hVar7.f64126j.f64251m;
            C41536l.m120488h(inlineFeedback2, "binding.interestRateLayo…hdrawalTypeInlineFeedback");
            C32343x.m95455i0(inlineFeedback2);
            C24931h hVar8 = this.f60100F;
            if (hVar8 == null) {
                C41536l.m120506z("binding");
                hVar8 = null;
            }
            LinearLayoutCompat c3 = hVar8.f64134r.mo3946b();
            C41536l.m120488h(c3, "binding.withdrawalSelectorLayout.root");
            C32343x.m95447f1(c3);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                WithdrawalTypeUiModel withdrawalTypeUiModel = (WithdrawalTypeUiModel) it.next();
                Chip chip = new Chip(this, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
                chip.setChipTitle(C32343x.m95388F(withdrawalTypeUiModel.mo56826a(), new Object[0]));
                chip.setTag(withdrawalTypeUiModel.mo56827b());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMargins(0, chip.getResources().getDimensionPixelSize(C19949c.f54496a), 0, 0);
                chip.setLayoutParams(marginLayoutParams);
                chip.setOnClickListener(new C26169h(this));
                C24931h hVar9 = this.f60100F;
                if (hVar9 == null) {
                    C41536l.m120506z("binding");
                    hVar9 = null;
                }
                hVar9.f64134r.f64238f.addView(chip);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c3 */
    public static final void m73961c3(DepositApplicationActivity depositApplicationActivity, View view) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        DepositApplicationViewModel$ViewModel g3 = depositApplicationActivity.m73965g3();
        Object tag = view.getTag();
        C41536l.m120487g(tag, "null cannot be cast to non-null type kotlin.String");
        g3.mo56851Z6((String) tag);
    }

    /* renamed from: d3 */
    private final void m73962d3(C27487a aVar) {
        String F = C32343x.m95388F(aVar.mo66796i().mo57226k(), new Object[0]);
        C24931h hVar = null;
        if (C41536l.m120484d(F, BankApiResponse.SUCCESSFUL_RESPONSE_CODE)) {
            if (aVar.mo66792f() == null) {
                C24931h hVar2 = this.f60100F;
                if (hVar2 == null) {
                    C41536l.m120506z("binding");
                } else {
                    hVar = hVar2;
                }
                hVar.f64123g.setText(F);
            }
        } else if (C41536l.m120484d(aVar.mo66792f(), new BigDecimal(0))) {
            C24931h hVar3 = this.f60100F;
            if (hVar3 == null) {
                C41536l.m120506z("binding");
            } else {
                hVar = hVar3;
            }
            hVar.f64123g.setText("");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e3 */
    public final RecyclerView m73963e3(ViewPager2 viewPager2) {
        for (View view : C1152f3.m4215b(viewPager2)) {
            if (view instanceof RecyclerView) {
                return (RecyclerView) view;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: f3 */
    public final C18338b0 m73964f3() {
        return (C18338b0) this.f60104J.getValue(this, f60099L[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public final DepositApplicationViewModel$ViewModel m73965g3() {
        return (DepositApplicationViewModel$ViewModel) this.f60101G.getValue();
    }

    /* renamed from: h3 */
    private final void m73966h3() {
        m73965g3().mo56852e().mo4819k(this, new C22805l(new C22796c(this)));
        m73965g3().mo56866mw().mo56856h0().mo4819k(this, new C22805l(new C22797d(this)));
        m73965g3().mo56866mw().mo56873z().mo4819k(this, new C22805l(new C22798e(this)));
        m73965g3().mo56874z1().mo4819k(this, new C22805l(new C22799f(this)));
        m73965g3().mo56839Hc().mo4819k(this, new C22805l(new C22800g(this)));
        m73965g3().mo56870vi().mo4819k(this, new C22805l(new C22801h(this)));
        m73965g3().mo56850Z3().mo4819k(this, new C22805l(new C22802i(this)));
        m73965g3().mo56864m().mo4819k(this, new C22805l(new C22803j(this)));
        m73965g3().mo56853f5().mo4819k(this, new C22805l(new C22804k(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public final void m73967i3(C27487a aVar) {
        Chip chip;
        boolean z;
        String str;
        C26916a aVar2;
        C24931h hVar = this.f60100F;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        m73962d3(aVar);
        hVar.f64123g.setSuffix(" " + C32314k.m95245a(aVar.mo66794h()));
        InlineFeedback inlineFeedback = hVar.f64124h;
        ViewGroup.LayoutParams layoutParams = inlineFeedback.getChildAt(0).getLayoutParams();
        C41536l.m120487g(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams) layoutParams).gravity = 1;
        inlineFeedback.setTitleText(C32343x.m95388F("applications.deposits.fields.deposit.amount.validation", C32343x.m95388F(aVar.mo66796i().mo57226k(), new Object[0])));
        LinearLayout linearLayout = hVar.f64122f;
        C41536l.m120488h(linearLayout, "currencyContainer");
        int childCount = linearLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            C41536l.m120488h(childAt, "getChildAt(index)");
            if (childAt instanceof C26916a) {
                aVar2 = (C26916a) childAt;
            } else {
                aVar2 = null;
            }
            if (aVar2 != null) {
                aVar2.setActivated(C41536l.m120484d(aVar2.getTag(), aVar.mo66794h()));
            }
        }
        FlexboxLayout flexboxLayout = hVar.f64134r.f64238f;
        C41536l.m120488h(flexboxLayout, "withdrawalSelectorLayout.withdrawalTypesContainer");
        int childCount2 = flexboxLayout.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = flexboxLayout.getChildAt(i2);
            C41536l.m120488h(childAt2, "getChildAt(index)");
            if (childAt2 instanceof Chip) {
                chip = (Chip) childAt2;
            } else {
                chip = null;
            }
            if (chip != null) {
                if (chip.getTag() != null) {
                    Object tag = chip.getTag();
                    WithdrawalTypeUiModel k = aVar.mo66798k();
                    if (k != null) {
                        str = k.mo56827b();
                    } else {
                        str = null;
                    }
                    if (C41536l.m120484d(tag, str)) {
                        z = true;
                        chip.setActivated(z);
                    }
                }
                z = false;
                chip.setActivated(z);
            }
        }
    }

    /* renamed from: j3 */
    private final void m73968j3() {
        C0173b registerForActivityResult = registerForActivityResult(new C2106d(), new C26163b(this));
        C41536l.m120488h(registerForActivityResult, "registerForActivityResul…LT_OK) finish()\n        }");
        this.f60103I = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    /* renamed from: k3 */
    public static final void m73969k3(DepositApplicationActivity depositApplicationActivity, ActivityResult activityResult) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        if (activityResult.mo371b() == -1) {
            depositApplicationActivity.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l3 */
    public final void m73970l3(C18338b0 b0Var) {
        this.f60104J.setValue(this, f60099L[0], b0Var);
    }

    /* renamed from: m3 */
    private final void m73971m3() {
        C24931h hVar = this.f60100F;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        hVar.f64123g.setInfoText(C32343x.m95388F("applications.deposits.fields.deposit.amount", new Object[0]));
        hVar.f64128l.f64234e.setText(C32343x.m95388F("applications.deposits.fields.deposit.term", new Object[0]));
        hVar.f64134r.f64237e.setText(C32343x.m95388F("applications.deposits.fields.deposit.int.accrual.period", new Object[0]));
        hVar.f64126j.f64243e.setText(C32343x.m95388F("applications.deposits.fields.deposit.int.rate", new Object[0]));
        hVar.f64126j.f64245g.setText(C32343x.m95388F("applications.deposits.fields.deposit.effective.int.rate", new Object[0]));
        hVar.f64126j.f64248j.setText(C32343x.m95388F("applications.deposits.fields.deposit.planned.int.amount", new Object[0]));
        hVar.f64135s.f64241f.setText(C32343x.m95388F("applications.deposits.I.error.state.text", new Object[0]));
        hVar.f64125i.f64241f.setText(C32343x.m95388F("applications.deposits.I.error.state.text", new Object[0]));
        hVar.f64135s.f64240e.setButtonText(C32343x.m95388F("applications.deposits.I.error.state.button", new Object[0]));
        hVar.f64125i.f64240e.setButtonText(C32343x.m95388F("applications.deposits.I.error.state.button", new Object[0]));
        hVar.f64121e.setButtonText(C32343x.m95388F("applications.deposits.I.main.button.label", new Object[0]));
        hVar.f64133q.setAdapter(this.f60102H);
        m73957Y2();
        hVar.f64123g.setTextChangeListener(new C26164c(this));
        hVar.f64130n.mo3946b().setOnClickListener(new C26165d(this));
        hVar.f64135s.f64240e.setOnClickListener(new C26166e(this));
        hVar.f64125i.f64240e.setOnClickListener(new C26167f(this));
        hVar.f64121e.setOnClickListener(new C26168g(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n3 */
    public static final void m73972n3(DepositApplicationActivity depositApplicationActivity, String str) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        C29665b.C29666a.m90079b(depositApplicationActivity.m73965g3(), str, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: o3 */
    public static final void m73973o3(DepositApplicationActivity depositApplicationActivity, View view) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        C21481a.onRefresh$default(depositApplicationActivity.m73965g3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: p3 */
    public static final void m73974p3(DepositApplicationActivity depositApplicationActivity, View view) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        depositApplicationActivity.m73965g3().mo56855gv();
    }

    /* access modifiers changed from: private */
    /* renamed from: q3 */
    public static final void m73975q3(DepositApplicationActivity depositApplicationActivity, View view) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        depositApplicationActivity.m73965g3().mo56845Pn();
    }

    /* access modifiers changed from: private */
    /* renamed from: r3 */
    public static final void m73976r3(DepositApplicationActivity depositApplicationActivity, View view) {
        C41536l.m120489i(depositApplicationActivity, "this$0");
        C29665b.C29666a.m90078a(depositApplicationActivity.m73965g3(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: s3 */
    public final void m73977s3(C25695d dVar) {
        C24931h hVar = this.f60100F;
        if (hVar == null) {
            C41536l.m120506z("binding");
            hVar = null;
        }
        LinearLayoutCompat c = hVar.f64128l.mo3946b();
        C41536l.m120488h(c, "periodSelectorLayout.root");
        C32343x.m95483r1(c, C41341q.m119910m(C25695d.TERM, C25695d.ENLARG).contains(dVar), false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        if (r12 != null) goto L_0x007a;
     */
    /* renamed from: t3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m73978t3(p341ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel r11, java.lang.String r12) {
        /*
            r10 = this;
            ha0.h r0 = r10.f60100F
            r1 = 0
            if (r0 != 0) goto L_0x000b
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x000b:
            ha0.t r2 = r0.f64126j
            android.widget.TextView r2 = r2.f64244f
            java.lang.Double r3 = r11.mo56813d()
            java.lang.String r4 = "%"
            if (r3 == 0) goto L_0x002b
            double r5 = r3.doubleValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x002c
        L_0x002b:
            r3 = r1
        L_0x002c:
            r2.setText(r3)
            ha0.t r2 = r0.f64126j
            android.widget.TextView r2 = r2.f64246h
            java.lang.Double r3 = r11.mo56812b()
            if (r3 == 0) goto L_0x004d
            double r5 = r3.doubleValue()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            goto L_0x004e
        L_0x004d:
            r3 = r1
        L_0x004e:
            r2.setText(r3)
            ha0.t r2 = r0.f64126j
            android.widget.TextView r2 = r2.f64249k
            if (r12 == 0) goto L_0x006e
            java.lang.Double r3 = r11.mo56815e()
            if (r3 == 0) goto L_0x006a
            double r4 = r3.doubleValue()
            r7 = 0
            r8 = 2
            r9 = 0
            r6 = r12
            java.lang.String r12 = g91.C32343x.m95410Q(r4, r6, r7, r8, r9)
            goto L_0x006b
        L_0x006a:
            r12 = r1
        L_0x006b:
            if (r12 == 0) goto L_0x006e
            goto L_0x007a
        L_0x006e:
            java.lang.Double r12 = r11.mo56815e()
            if (r12 == 0) goto L_0x0079
            java.lang.String r12 = r12.toString()
            goto L_0x007a
        L_0x0079:
            r12 = r1
        L_0x007a:
            r2.setText(r12)
            ha0.t r12 = r0.f64126j
            android.widget.TextView r12 = r12.f64243e
            ob0.a r2 = ob0.C26920a.f67675a
            java.lang.Double r3 = r11.mo56817f()
            android.text.SpannableStringBuilder r2 = r2.mo66213a(r10, r3)
            r12.setText(r2)
            ha0.t r12 = r0.f64126j
            android.widget.LinearLayout r12 = r12.f64247i
            java.lang.String r0 = "interestRateLayout.expectedInterestContainer"
            kotlin.jvm.internal.C41536l.m120488h(r12, r0)
            java.lang.Double r11 = r11.mo56815e()
            r0 = 0
            if (r11 == 0) goto L_0x00a0
            r11 = 1
            goto L_0x00a1
        L_0x00a0:
            r11 = r0
        L_0x00a1:
            r2 = 2
            g91.C32343x.m95483r1(r12, r11, r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity.m73978t3(ge.bog.mobilebank.depositapplication.presentation.application.model.InterestRateUiModel, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.io.Serializable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: O1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo37451O1(android.os.Bundle r6) {
        /*
            r5 = this;
            android.view.LayoutInflater r0 = r5.getLayoutInflater()
            ha0.h r0 = ha0.C24931h.m79705d(r0)
            java.lang.String r1 = "inflate(layoutInflater)"
            kotlin.jvm.internal.C41536l.m120488h(r0, r1)
            r5.f60100F = r0
            r1 = 0
            if (r0 != 0) goto L_0x0018
            java.lang.String r0 = "binding"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            r0 = r1
        L_0x0018:
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = r0.mo3946b()
            r5.setContentView((android.view.View) r0)
            super.mo37451O1(r6)
            r5.m73966h3()
            android.content.Intent r6 = r5.getIntent()
            java.lang.String r0 = "EXTRA_DEPOSITS"
            java.util.ArrayList r0 = r6.getParcelableArrayListExtra(r0)
            java.lang.String r2 = "EXTRA_SELECTED_DEPOSIT_TYPE"
            java.io.Serializable r2 = r6.getSerializableExtra(r2)
            boolean r3 = r2 instanceof ka0.C25695d
            if (r3 == 0) goto L_0x003c
            r1 = r2
            ka0.d r1 = (ka0.C25695d) r1
        L_0x003c:
            java.lang.String r2 = "EXTRA_SELECTED_DEPOSIT_PURPOSE"
            r3 = -1
            long r2 = r6.getLongExtra(r2, r3)
            if (r0 != 0) goto L_0x004a
            r5.finish()
            return
        L_0x004a:
            ge.bog.mobilebank.depositapplication.presentation.application.viewmodel.DepositApplicationViewModel$ViewModel r6 = r5.m73965g3()
            ra0.a r6 = r6.mo56863lw()
            r6.mo56872y7(r0, r1, r2)
            r5.m73971m3()
            r5.m73968j3()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.application.activity.DepositApplicationActivity.mo37451O1(android.os.Bundle):void");
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("applications.deposits.main.page.header", new Object[0]);
    }
}
