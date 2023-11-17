package p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep;

import af1.C40303i;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1505h;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.viewpager2.widget.ViewPager2;
import b41.C31128a;
import com.salesforce.marketingcloud.UrlHandler;
import da0.C19954h;
import da0.C19955i;
import fb0.C20457a;
import g91.C32319m;
import g91.C32343x;
import gb0.C20789b;
import ha0.C24936m;
import hc1.C41143c;
import hc1.C41185v;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
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
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import ld0.C25950a;
import m41.C37223a;
import m41.C37224b;
import o00.C26656a;
import o31.C37588a0;
import ob0.C26920a;
import p00.C27113k;
import p163m0.C7047a;
import p202p0.C7542g;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonCardSelectorView;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.cleanarch.domain.transferaccounts.model.TransferAccountItem;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.depositapplication.presentation.application.model.DepositPurposeUiModel;
import p341ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultActivity;
import p341ge.bog.mobilebank.depositapplication.presentation.applicationresult.DepositApplicationResultArgs;
import p341ge.bog.mobilebank.depositapplication.presentation.depositsubmission.model.DepositSubmissionNavData;
import p341ge.bog.mobilebank.model.offers.Summary;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p380ck.C10464h;
import p420fh.C12902d;
import p420fh.C12910e;
import p642vh.C18338b0;
import ue1.C43064a;
import ue1.C43075l;
import wa0.C29249a;
import wa0.C29250b;
import wa0.C29251c;
import wa0.C29252d;
import wa0.C29253e;
import wa0.C29254f;
import wa0.C29255g;
import wa0.C29259j;
import wa0.C29263n;
import y11.C39992d;
import ya0.C29967k;
import z11.C40139a;

/* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment */
public final class CombinedOfferSecondStepFragment extends C22920b implements C26656a, C41185v.C41186a, C39992d.C39993a {

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f60293n = {C41520a0.m120439e(new C41539o(CombinedOfferSecondStepFragment.class, "slider", "getSlider()Lge/bog/designsystem/components/common/Slider;", 0))};

    /* renamed from: g */
    private C24936m f60294g;

    /* renamed from: h */
    private final C7542g f60295h = new C7542g(C41520a0.m120436b(C29255g.class), new C22911l(this));

    /* renamed from: i */
    public C29259j f60296i;

    /* renamed from: j */
    private final C41217g f60297j;

    /* renamed from: k */
    private final C41217g f60298k;

    /* renamed from: l */
    private final C41555e f60299l;

    /* renamed from: m */
    private final C22901b f60300m;

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$a */
    static final class C22900a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C22900a f60301d = new C22900a();

        C22900a() {
            super(0);
        }

        /* renamed from: b */
        public final C20457a invoke() {
            return new C20457a();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$b */
    public static final class C22901b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60302d;

        C22901b(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            this.f60302d = combinedOfferSecondStepFragment;
        }

        public void afterTextChanged(Editable editable) {
            this.f60302d.m74256E1().mo64765rq(editable != null ? editable.toString() : null);
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$c */
    /* synthetic */ class C22902c extends C41535k implements C43075l {
        C22902c(Object obj) {
            super(1, obj, CombinedOfferSecondStepFragment.class, "setupForm", "setupForm(Lge/bog/mobilebank/depositapplication/presentation/depositsubmission/model/DepositSubmissionData;)V", 0);
        }

        /* renamed from: b */
        public final void mo57036b(C25702a aVar) {
            C41536l.m120489i(aVar, "p0");
            ((CombinedOfferSecondStepFragment) this.receiver).m74264M1(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57036b((C25702a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$d */
    static final class C22903d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60303d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22903d(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(1);
            this.f60303d = combinedOfferSecondStepFragment;
        }

        /* renamed from: a */
        public final void mo57037a(C37223a aVar) {
            Boolean bool = (Boolean) aVar.mo90296a();
            if (bool != null) {
                CombinedOfferSecondStepFragment combinedOfferSecondStepFragment = this.f60303d;
                combinedOfferSecondStepFragment.m74253A1().f64202e.getMainButton().setEnabled(bool.booleanValue());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57037a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$e */
    static final class C22904e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60304d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22904e(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(1);
            this.f60304d = combinedOfferSecondStepFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final boolean m74299c(String str, TransferAccountItem transferAccountItem) {
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
        public final void mo57038b(C37223a aVar) {
            Long l;
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                CombinedOfferSecondStepFragment combinedOfferSecondStepFragment = this.f60304d;
                long longValue = ((Number) mVar.mo95675a()).longValue();
                String str = (String) mVar.mo95676b();
                if (longValue == -1) {
                    l = null;
                } else {
                    l = Long.valueOf(longValue);
                }
                C39992d.f94982Q.mo93826a(C40139a.SRC, str, l, new C22919a(str)).mo4576A1(combinedOfferSecondStepFragment.getChildFragmentManager(), (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57038b((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$f */
    static final class C22905f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60305d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22905f(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(1);
            this.f60305d = combinedOfferSecondStepFragment;
        }

        /* renamed from: a */
        public final void mo57039a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f60305d.m74260I1(true);
            } else if (aVar instanceof C31128a.C31131c) {
                this.f60305d.m74260I1(false);
                C27113k.C27114a aVar2 = C27113k.f68083P;
                String a = ((C25950a) ((C31128a.C31131c) aVar).mo71340a()).mo64864a();
                String string = this.f60305d.getString(C19954h.common_text_terms);
                C41536l.m120488h(string, "getString(R.string.common_text_terms)");
                C27113k c = C27113k.C27114a.m84066c(aVar2, a, false, (String) null, (ArrayList) null, (Summary) null, string, 30, (Object) null);
                FragmentManager childFragmentManager = this.f60305d.getChildFragmentManager();
                C41536l.m120488h(childFragmentManager, "childFragmentManager");
                c.mo4576A1(childFragmentManager, (String) null);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f60305d.m74260I1(false);
                this.f60305d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57039a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$g */
    static final class C22906g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60306d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22906g(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(1);
            this.f60306d = combinedOfferSecondStepFragment;
        }

        /* renamed from: a */
        public final void mo57040a(C37223a aVar) {
            C41224m mVar = (C41224m) aVar.mo90296a();
            if (mVar != null) {
                CombinedOfferSecondStepFragment combinedOfferSecondStepFragment = this.f60306d;
                C41185v e = C41185v.C41187b.m119423e(C41185v.f97155C, (String) mVar.mo95675a(), (HashMap) mVar.mo95676b(), (C41143c) null, 4, (Object) null);
                FragmentManager childFragmentManager = combinedOfferSecondStepFragment.getChildFragmentManager();
                C41536l.m120488h(childFragmentManager, "childFragmentManager");
                e.mo4576A1(childFragmentManager, (String) null);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57040a((C37223a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$h */
    static final class C22907h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60307d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22907h(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(1);
            this.f60307d = combinedOfferSecondStepFragment;
        }

        /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Throwable] */
        /* JADX WARNING: type inference failed for: r1v9, types: [he1.w] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo57041a(b41.C31128a r6) {
            /*
                r5 = this;
                boolean r0 = r6 instanceof b41.C31128a.C31130b
                r1 = 0
                r2 = 1
                if (r0 == 0) goto L_0x001c
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r6 = r5.f60307d
                hc1.v r6 = r6.m74255D1()
                if (r6 == 0) goto L_0x0013
                r6.mo95635L2(r2)
                he1.w r1 = he1.C41238w.f97225a
            L_0x0013:
                if (r1 != 0) goto L_0x00a8
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r6 = r5.f60307d
                r6.m74260I1(r2)
                goto L_0x00a8
            L_0x001c:
                boolean r0 = r6 instanceof b41.C31128a.C31131c
                if (r0 == 0) goto L_0x0040
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r6 = r5.f60307d
                android.content.Context r6 = r6.requireContext()
                o0.a r6 = p189o0.C7357a.m28044b(r6)
                android.content.Intent r0 = new android.content.Intent
                java.lang.String r1 = "ge.bog.mobilebank.products.presentation.products.refresh_products"
                r0.<init>(r1)
                r6.mo21731d(r0)
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r6 = r5.f60307d
                hc1.v r6 = r6.m74255D1()
                if (r6 == 0) goto L_0x00a8
                r6.mo4577k1()
                goto L_0x00a8
            L_0x0040:
                boolean r0 = r6 instanceof b41.C31128a.C31129a
                if (r0 == 0) goto L_0x00a8
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r0 = r5.f60307d
                hc1.v r0 = r0.m74255D1()
                r3 = 0
                if (r0 == 0) goto L_0x0053
                r0.mo95635L2(r3)
                he1.w r0 = he1.C41238w.f97225a
                goto L_0x0054
            L_0x0053:
                r0 = r1
            L_0x0054:
                if (r0 != 0) goto L_0x005b
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r0 = r5.f60307d
                r0.m74260I1(r3)
            L_0x005b:
                b41.a$a r6 = (b41.C31128a.C31129a) r6
                java.lang.Throwable r0 = r6.mo71342c()
                boolean r4 = r0 instanceof p341ge.bog.mobilebank.shared2.network.ApiError
                if (r4 == 0) goto L_0x0068
                r1 = r0
                ge.bog.mobilebank.shared2.network.ApiError r1 = (p341ge.bog.mobilebank.shared2.network.ApiError) r1
            L_0x0068:
                if (r1 == 0) goto L_0x0077
                ge.bog.mobilebank.shared2.network.BankApiResponse r0 = r1.mo84685a()
                if (r0 == 0) goto L_0x0077
                boolean r0 = r0.isScaError()
                if (r0 != r2) goto L_0x0077
                goto L_0x0078
            L_0x0077:
                r2 = r3
            L_0x0078:
                if (r2 == 0) goto L_0x0094
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r0 = r5.f60307d
                hc1.v r0 = r0.m74255D1()
                if (r0 == 0) goto L_0x009f
                ge.bog.mobilebank.shared2.network.BankApiResponse r1 = r1.mo84685a()
                java.lang.String r1 = r1.getKey()
                java.lang.Object[] r2 = new java.lang.Object[r3]
                java.lang.String r1 = g91.C32343x.m95388F(r1, r2)
                r0.mo95634K2(r1)
                goto L_0x009f
            L_0x0094:
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r0 = r5.f60307d
                hc1.v r0 = r0.m74255D1()
                if (r0 == 0) goto L_0x009f
                r0.mo4577k1()
            L_0x009f:
                ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment r0 = r5.f60307d
                java.lang.Throwable r6 = r6.mo71342c()
                r0.handleError((java.lang.Throwable) r6)
            L_0x00a8:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment.C22907h.mo57041a(b41.a):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57041a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$i */
    static final class C22908i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60308d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22908i(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(1);
            this.f60308d = combinedOfferSecondStepFragment;
        }

        /* renamed from: a */
        public final void mo57042a(C29967k.C29969b bVar) {
            C41536l.m120489i(bVar, "it");
            this.f60308d.m74271T1(bVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57042a((C29967k.C29969b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$j */
    static final class C22909j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60309d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22909j(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(1);
            this.f60309d = combinedOfferSecondStepFragment;
        }

        /* renamed from: a */
        public final void mo57043a(C31128a aVar) {
            if (aVar instanceof C31128a.C31130b) {
                this.f60309d.m74260I1(true);
            } else if (aVar instanceof C31128a.C31131c) {
                C31128a.C31131c cVar = (C31128a.C31131c) aVar;
                if (((List) cVar.mo71340a()).size() != this.f60309d.m74287y1().getItemCount()) {
                    CombinedOfferSecondStepFragment combinedOfferSecondStepFragment = this.f60309d;
                    C18338b0 b = C18338b0.C18340b.m62692b(C18338b0.f51787c, ((List) cVar.mo71340a()).size(), C19955i.f54547a, false, false, 12, (Object) null);
                    ViewPager2 viewPager2 = this.f60309d.m74253A1().f64221x;
                    C41536l.m120488h(viewPager2, "binding.viewPager");
                    FrameLayout frameLayout = this.f60309d.m74253A1().f64216s;
                    C41536l.m120488h(frameLayout, "binding.pagerIndicatorContainer");
                    combinedOfferSecondStepFragment.m74263L1(b.mo46116a(viewPager2, frameLayout));
                }
                this.f60309d.m74287y1().mo48988n((List) cVar.mo71340a());
                this.f60309d.m74260I1(false);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f60309d.m74260I1(false);
                CardView cardView = this.f60309d.m74253A1().f64219v;
                C41536l.m120488h(cardView, "binding.retryButtonContainer");
                C32343x.m95447f1(cardView);
                this.f60309d.handleError(((C31128a.C31129a) aVar).mo71342c());
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57043a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$k */
    static final class C22910k implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f60310a;

        C22910k(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f60310a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f60310a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f60310a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$l */
    public static final class C22911l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60311d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22911l(Fragment fragment) {
            super(0);
            this.f60311d = fragment;
        }

        /* renamed from: b */
        public final Bundle invoke() {
            Bundle arguments = this.f60311d.getArguments();
            if (arguments != null) {
                return arguments;
            }
            throw new IllegalStateException("Fragment " + this.f60311d + " has null arguments");
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$m */
    public static final class C22912m extends C41553c {

        /* renamed from: a */
        final /* synthetic */ CombinedOfferSecondStepFragment f60312a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22912m(Object obj, CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(obj);
            this.f60312a = combinedOfferSecondStepFragment;
        }

        /* access modifiers changed from: protected */
        public void afterChange(C40303i iVar, Object obj, Object obj2) {
            C41536l.m120489i(iVar, "property");
            C18338b0 b0Var = (C18338b0) obj2;
            C18338b0 b0Var2 = (C18338b0) obj;
            this.f60312a.m74287y1().mo48987m(b0Var);
            this.f60312a.m74253A1().f64221x.mo6606l(b0Var.mo46118c().mo46123a(this.f60312a.m74256E1().mo64747gs()), false);
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$n */
    public static final class C22913n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f60313d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22913n(Fragment fragment) {
            super(0);
            this.f60313d = fragment;
        }

        public final Fragment invoke() {
            return this.f60313d;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$o */
    public static final class C22914o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60314d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22914o(C43064a aVar) {
            super(0);
            this.f60314d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f60314d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$p */
    public static final class C22915p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f60315d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22915p(C41217g gVar) {
            super(0);
            this.f60315d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f60315d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$q */
    public static final class C22916q extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f60316d;

        /* renamed from: e */
        final /* synthetic */ C41217g f60317e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C22916q(C43064a aVar, C41217g gVar) {
            super(0);
            this.f60316d = aVar;
            this.f60317e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f60316d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f60317e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$r */
    static final class C22917r extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ CombinedOfferSecondStepFragment f60318d;

        /* renamed from: ge.bog.mobilebank.depositapplication.presentation.combinedoffer.fragments.secondstep.CombinedOfferSecondStepFragment$r$a */
        static final class C22918a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ CombinedOfferSecondStepFragment f60319d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C22918a(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
                super(0);
                this.f60319d = combinedOfferSecondStepFragment;
            }

            /* renamed from: b */
            public final C29263n invoke() {
                return this.f60319d.mo57030B1().mo32807a(this.f60319d.m74288z1());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C22917r(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment) {
            super(0);
            this.f60318d = combinedOfferSecondStepFragment;
        }

        public final C1620q0.C1624b invoke() {
            return C37588a0.f90326a.mo90779a(new C22918a(this.f60318d));
        }
    }

    public CombinedOfferSecondStepFragment() {
        C22917r rVar = new C22917r(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C22914o(new C22913n(this)));
        this.f60297j = C1514j0.m5374c(this, C41520a0.m120436b(C29263n.class), new C22915p(a), new C22916q((C43064a) null, a), rVar);
        this.f60298k = C41219i.m119470b(C22900a.f60301d);
        C41551a aVar = C41551a.f97718a;
        this.f60299l = new C22912m(C18338b0.C18346e.f51796d, this);
        this.f60300m = new C22901b(this);
    }

    /* access modifiers changed from: private */
    /* renamed from: A1 */
    public final C24936m m74253A1() {
        C24936m mVar = this.f60294g;
        C41536l.m120486f(mVar);
        return mVar;
    }

    /* renamed from: C1 */
    private final C27113k m74254C1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        return C32343x.m95443e0(childFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: D1 */
    public final C41185v m74255D1() {
        FragmentManager childFragmentManager = getChildFragmentManager();
        C41536l.m120488h(childFragmentManager, "childFragmentManager");
        return C32343x.m95449g0(childFragmentManager, (String) null, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: E1 */
    public final C29263n m74256E1() {
        return (C29263n) this.f60297j.getValue();
    }

    /* renamed from: F1 */
    private final void m74257F1(DepositSubmissionNavData depositSubmissionNavData, String str) {
        String str2;
        C25695d g;
        C41224m[] mVarArr = new C41224m[4];
        mVarArr[0] = C41233s.m119492a("event_name", "deposit_application");
        mVarArr[1] = C41233s.m119492a(UrlHandler.ACTION, "open_deposit_precontract");
        if (depositSubmissionNavData == null || (g = depositSubmissionNavData.mo57172g()) == null || (str2 = g.name()) == null) {
            str2 = "";
        }
        mVarArr[2] = C41233s.m119492a("label", str2);
        mVarArr[3] = C41233s.m119492a("event_label_2", str);
        Bundle b = C0908e.m3336b(mVarArr);
        if (str == null) {
            b.remove("event_label_2");
        }
        m74258G1(depositSubmissionNavData, b);
    }

    /* renamed from: G1 */
    private final void m74258G1(DepositSubmissionNavData depositSubmissionNavData, Bundle bundle) {
        String str;
        C25695d g;
        if (depositSubmissionNavData == null || (g = depositSubmissionNavData.mo57172g()) == null || (str = g.name()) == null) {
            str = "";
        }
        C32343x.m95387E0(this, "deposit_application", str, "open_deposit_precontract", C10464h.C10465a.FIREBASE, bundle);
    }

    /* renamed from: H1 */
    private final void m74259H1() {
        m74256E1().mo64744Yv().mo4819k(getViewLifecycleOwner(), new C22910k(new C22902c(this)));
        m74256E1().mo64761m().mo4819k(getViewLifecycleOwner(), new C22910k(new C22903d(this)));
        m74256E1().mo64756ki().mo4819k(getViewLifecycleOwner(), new C22910k(new C22904e(this)));
        m74256E1().mo64739P2().mo4819k(getViewLifecycleOwner(), new C22910k(new C22905f(this)));
        m74256E1().mo64750i3().mo4819k(getViewLifecycleOwner(), new C22910k(new C22906g(this)));
        m74256E1().mo64733F0().mo4819k(getViewLifecycleOwner(), new C22910k(new C22907h(this)));
        C37224b.m109963b(m74256E1().mo64752j3(), this, new C22908i(this));
        m74256E1().mo64741Uo().mo4819k(getViewLifecycleOwner(), new C22910k(new C22909j(this)));
    }

    /* access modifiers changed from: private */
    /* renamed from: I1 */
    public final void m74260I1(boolean z) {
        CardView cardView = m74253A1().f64219v;
        C41536l.m120488h(cardView, "binding.retryButtonContainer");
        C32343x.m95455i0(cardView);
        FrameLayout frameLayout = m74253A1().f64217t;
        C41536l.m120488h(frameLayout, "binding.progressBar");
        C32343x.m95483r1(frameLayout, z, false, 2, (Object) null);
    }

    /* renamed from: J1 */
    private final void m74261J1() {
        getChildFragmentManager().mo4367F1("DepositNameActionSheet_REQUEST_KEY", this, new C29254f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: K1 */
    public static final void m74262K1(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment, String str, Bundle bundle) {
        C41536l.m120489i(combinedOfferSecondStepFragment, "this$0");
        C41536l.m120489i(str, "<anonymous parameter 0>");
        C41536l.m120489i(bundle, "bundle");
        combinedOfferSecondStepFragment.m74256E1().mo64765rq(bundle.getString("ARGS_DEPOSIT_NAME"));
    }

    /* access modifiers changed from: private */
    /* renamed from: L1 */
    public final void m74263L1(C18338b0 b0Var) {
        this.f60299l.setValue(this, f60293n[0], b0Var);
    }

    /* access modifiers changed from: private */
    /* renamed from: M1 */
    public final void m74264M1(C25702a aVar) {
        String str;
        boolean z;
        boolean z2;
        String str2;
        boolean z3;
        String str3;
        boolean z4;
        C24936m A1 = m74253A1();
        DepositSubmissionNavData g = aVar.mo64270g();
        C20457a y1 = m74287y1();
        DepositPurposeUiModel h = aVar.mo64271h();
        Integer num = null;
        if (h != null) {
            str = h.mo56803e();
        } else {
            str = null;
        }
        y1.mo48985k(str);
        int h2 = m74287y1().mo48982h();
        ViewPager2 viewPager2 = m74253A1().f64221x;
        if (h2 == -1) {
            h2 = 0;
        }
        viewPager2.mo6606l(h2, false);
        ConstraintLayout c = m74253A1().mo3946b();
        AutoTransition autoTransition = new AutoTransition();
        autoTransition.setDuration(150);
        TransitionManager.beginDelayedTransition(c, autoTransition);
        boolean k = aVar.mo64275k();
        Input input = A1.f64205h;
        C41536l.m120488h(input, "depositNameInput");
        C32343x.m95483r1(input, k, false, 2, (Object) null);
        ListItem listItem = A1.f64206i;
        C41536l.m120488h(listItem, "depositNameListItem");
        C32343x.m95483r1(listItem, !k, false, 2, (Object) null);
        View view = A1.f64207j;
        C41536l.m120488h(view, "depositNameListItemDivider");
        C32343x.m95483r1(view, !k, false, 2, (Object) null);
        boolean z5 = true;
        if (!k) {
            if (A1.f64205h.getInputText().length() > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                Input input2 = A1.f64205h;
                input2.getTextInput().removeTextChangedListener(this.f60300m);
                input2.setInputText("");
                input2.getTextInput().addTextChangedListener(this.f60300m);
            }
        }
        A1.f64208k.setText(aVar.mo64266d());
        A1.f64203f.setText(C32343x.m95408P(g.mo57167d(), g.mo57165a()));
        A1.f64222y.setText(C32343x.m95388F(g.mo57179m().mo56826a(), new Object[0]));
        TwoLineTextItem twoLineTextItem = A1.f64211n;
        twoLineTextItem.setText(aVar.mo64267e() + " " + getString(C19954h.f54546c));
        C41536l.m120488h(twoLineTextItem, "setupForm$lambda$15$lambda$12");
        if (g.mo57166b() != null) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(twoLineTextItem, z, false, 2, (Object) null);
        View view2 = A1.f64210m;
        C41536l.m120488h(view2, "depositTermDivider");
        if (g.mo57166b() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        C32343x.m95483r1(view2, z2, false, 2, (Object) null);
        A1.f64209l.setText(C32319m.m95314u(g.mo57171f()));
        TwoLineTextItem twoLineTextItem2 = A1.f64204g;
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
        A1.f64215r.f64244f.setText(g.mo57173h().mo56813d() + "%");
        A1.f64215r.f64246h.setText(g.mo57173h().mo56812b() + "%");
        TextView textView = A1.f64215r.f64249k;
        Double e = g.mo57173h().mo56815e();
        if (e != null) {
            str3 = C32343x.m95410Q(e.doubleValue(), g.mo57165a(), false, 2, (Object) null);
        } else {
            str3 = null;
        }
        textView.setText(str3);
        TextView textView2 = A1.f64215r.f64243e;
        C26920a aVar2 = C26920a.f67675a;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        textView2.setText(aVar2.mo66213a(requireContext, g.mo57173h().mo56817f()));
        LinearLayout linearLayout = A1.f64215r.f64247i;
        C41536l.m120488h(linearLayout, "interestRateLayout.expectedInterestContainer");
        if (g.mo57173h().mo56815e() == null) {
            z5 = false;
        }
        C32343x.m95483r1(linearLayout, z5, false, 2, (Object) null);
        if (aVar.mo64265c() != null) {
            CreditCardSmallPickerView picker = A1.f64202e.getPicker();
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
        A1.f64202e.getPicker().setCreditCard(CreditCardSmallPickerView.C13279b.C13280a.f39265a);
    }

    /* renamed from: N1 */
    private final void m74265N1(DepositSubmissionNavData depositSubmissionNavData) {
        C35388f2 f2Var;
        C24936m A1 = m74253A1();
        C1505h requireActivity = requireActivity();
        if (requireActivity instanceof C35388f2) {
            f2Var = (C35388f2) requireActivity;
        } else {
            f2Var = null;
        }
        if (f2Var != null) {
            f2Var.mo86429X1(C32343x.m95388F("applications.deposits.fields.deposit.purpose.header", new Object[0]));
        }
        CreditCardSmallPickerView.C13282c cVar = new CreditCardSmallPickerView.C13282c(C32343x.m95388F("applications.deposits.fields.deposit.source.acc", new Object[0]), C32343x.m95388F("applications.deposits.overview.account", new Object[0]));
        PageDescriptionView pageDescriptionView = A1.f64214q;
        pageDescriptionView.setTitle(C32343x.m95388F("applications.deposits.fields.deposit.purpose.header", new Object[0]));
        pageDescriptionView.setText(C32343x.m95388F("applications.deposits.fields.deposit.purpose.main.text", new Object[0]));
        A1.f64212o.setText(C32343x.m95388F("applications.deposits.overview.header", new Object[0]));
        A1.f64205h.setHintText((CharSequence) C32343x.m95388F("applications.deposits.fields.deposit.name", new Object[0]));
        A1.f64208k.setTitle(C32343x.m95388F("applications.deposits.fields.deposit.name", new Object[0]));
        A1.f64203f.setTitle(C32343x.m95388F("applications.deposits.deposit.amount", new Object[0]));
        A1.f64222y.setTitle(C32343x.m95388F("applications.deposits.fields.deposit.int.accrual.period", new Object[0]));
        A1.f64211n.setTitle(C32343x.m95388F("applications.deposits.deposit.term", new Object[0]));
        A1.f64209l.setTitle(C32343x.m95388F("applications.deposits.overview.date", new Object[0]));
        A1.f64204g.setTitle(C32343x.m95388F("applications.deposits.overview.end.date", new Object[0]));
        A1.f64215r.f64245g.setText(C32343x.m95388F("applications.deposits.fields.deposit.effective.int.rate", new Object[0]));
        A1.f64215r.f64248j.setText(C32343x.m95388F("applications.deposits.fields.deposit.planned.int.amount", new Object[0]));
        A1.f64205h.getTextInput().addTextChangedListener(this.f60300m);
        A1.f64221x.setAdapter(m74287y1());
        m74287y1().mo48986l(new C29249a(this));
        A1.f64206i.setOnClickListener(new C29250b(this));
        FixedButtonCardSelectorView fixedButtonCardSelectorView = A1.f64202e;
        fixedButtonCardSelectorView.getMainButton().setButtonText(C32343x.m95388F("applications.deposits.I.main.button.label", new Object[0]));
        fixedButtonCardSelectorView.getPicker().mo35468h(cVar);
        fixedButtonCardSelectorView.getMainButton().setOnClickListener(new C29251c(this, depositSubmissionNavData));
        fixedButtonCardSelectorView.getPicker().setOnClickListener(new C29252d(this));
        A1.f64218u.mo3946b().setOnClickListener(new C29253e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: O1 */
    public static final void m74266O1(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment, long j) {
        C41536l.m120489i(combinedOfferSecondStepFragment, "this$0");
        combinedOfferSecondStepFragment.m74256E1().mo64743Ve(Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: P1 */
    public static final void m74267P1(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment, View view) {
        C41536l.m120489i(combinedOfferSecondStepFragment, "this$0");
        C20789b.f56024J.mo49379a().mo4576A1(combinedOfferSecondStepFragment.getChildFragmentManager(), (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q1 */
    public static final void m74268Q1(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment, DepositSubmissionNavData depositSubmissionNavData, View view) {
        String str;
        DepositPurposeUiModel h;
        C41536l.m120489i(combinedOfferSecondStepFragment, "this$0");
        C41536l.m120489i(depositSubmissionNavData, "$depositNavData");
        C25702a aVar = (C25702a) combinedOfferSecondStepFragment.m74256E1().mo64744Yv().mo4814f();
        if (aVar == null || (h = aVar.mo64271h()) == null) {
            str = null;
        } else {
            str = h.mo56803e();
        }
        combinedOfferSecondStepFragment.m74257F1(depositSubmissionNavData, str);
        combinedOfferSecondStepFragment.m74256E1().mo64755k0();
    }

    /* access modifiers changed from: private */
    /* renamed from: R1 */
    public static final void m74269R1(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment, View view) {
        C41536l.m120489i(combinedOfferSecondStepFragment, "this$0");
        combinedOfferSecondStepFragment.m74256E1().mo64736Ma();
    }

    /* access modifiers changed from: private */
    /* renamed from: S1 */
    public static final void m74270S1(CombinedOfferSecondStepFragment combinedOfferSecondStepFragment, View view) {
        C41536l.m120489i(combinedOfferSecondStepFragment, "this$0");
        C21481a.onRefresh$default(combinedOfferSecondStepFragment.m74256E1(), 0, 1, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: T1 */
    public final void m74271T1(C29967k.C29969b bVar) {
        DepositApplicationResultArgs depositApplicationResultArgs = new DepositApplicationResultArgs("applications.deposits.success.main.text", "applications.deposits.success.redirect.to.home.button", bVar.mo70269a(), bVar.mo70270b(), bVar.mo70271c());
        DepositApplicationResultActivity.C22826a aVar = DepositApplicationResultActivity.f60170K;
        Context requireContext = requireContext();
        C41536l.m120488h(requireContext, "requireContext()");
        aVar.mo56884a(requireContext, depositApplicationResultArgs);
        requireActivity().finish();
    }

    /* access modifiers changed from: private */
    /* renamed from: y1 */
    public final C20457a m74287y1() {
        return (C20457a) this.f60298k.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: z1 */
    public final C29255g m74288z1() {
        return (C29255g) this.f60295h.getValue();
    }

    /* renamed from: B1 */
    public final C29259j mo57030B1() {
        C29259j jVar = this.f60296i;
        if (jVar != null) {
            return jVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        m74256E1().mo64737O(str, str2, str3, str4);
    }

    /* renamed from: P */
    public void mo57031P(TransferAccountItem transferAccountItem) {
        C41536l.m120489i(transferAccountItem, "account");
        m74256E1().mo64738P(transferAccountItem);
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C41536l.m120489i(str, "message");
        C1505h requireActivity = requireActivity();
        C41536l.m120488h(requireActivity, "requireActivity()");
        C12910e.m48790h(requireActivity, str, (C12902d.C12905b) null, false, 6, (Object) null);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        m74260I1(z);
    }

    /* renamed from: m */
    public void mo39137m() {
        C27113k C1 = m74254C1();
        if (C1 != null) {
            C1.mo4577k1();
        }
        m74256E1().mo64745Z();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f60294g = C24936m.m79729d(layoutInflater, viewGroup, false);
        ConstraintLayout c = m74253A1().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    public void onDestroyView() {
        this.f60294g = null;
        super.onDestroyView();
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m74265N1(m74288z1().mo69097b());
        m74259H1();
        m74261J1();
    }
}
