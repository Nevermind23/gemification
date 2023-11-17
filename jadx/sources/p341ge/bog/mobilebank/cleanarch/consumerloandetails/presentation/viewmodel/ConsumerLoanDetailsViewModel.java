package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel;

import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import cf1.C40407d;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.C11398b;
import d81.C31549a;
import e41.C31658b;
import ed1.C40749p;
import ed1.C40762x;
import ee1.C40767b;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import hd0.C24978b;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ld0.C25950a;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel;
import p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel;
import p341ge.bog.mobilebank.cleanarch.data.common.entity.StatusEntity;
import p341ge.bog.mobilebank.cleanarch.data.creditinfo.CreditInfoRepositoryImpl;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21484c;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21503d;
import p341ge.bog.mobilebank.model.offers.LimitLoanDecisionDetails;
import p341ge.bog.mobilebank.model.offers.LimitLoanRefinanceInfo;
import p341ge.bog.mobilebank.model.offers.LoanOfferCard;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.ProcessLoanRegistrationParams;
import p341ge.bog.mobilebank.rest.service.IRetrofitService;
import p341ge.bog.mobilebank.shared.tmx_profiling.TMXFlags;
import p341ge.bog.mobilebank.shared2.network.ApiError;
import p380ck.C10464h;
import p710av.C19278a;
import p808kr.C25752a;
import p808kr.C25756e;
import p808kr.C25760f;
import p808kr.C25761g;
import p808kr.C25762h;
import p828mr.C26257a;
import p828mr.C26259c;
import p828mr.C26260d;
import p828mr.C26261e;
import p828mr.C26262f;
import p828mr.C26266i;
import p842nv.C26617h;
import p852ov.C27088c;
import p878rr.C28063a;
import p878rr.C28064b;
import p888sr.C28255a;
import p888sr.C28256b;
import p888sr.C28258d;
import p897tp.C28474a;
import p899tr.C28486a;
import p899tr.C28487b;
import p899tr.C28488c;
import p899tr.C28489d;
import p899tr.C28490e;
import p899tr.C28491f;
import p899tr.C28492g;
import p899tr.C28493h;
import p899tr.C28494i;
import p899tr.C28495j;
import p899tr.C28496k;
import p899tr.C28497l;
import p899tr.C28498m;
import p968zu.C30408a;
import p968zu.C30410c;
import pc0.C27494a;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;
import z10.C30138e;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel */
public final class ConsumerLoanDetailsViewModel extends C21481a {

    /* renamed from: q0 */
    public static final C20941a f56284q0 = new C20941a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C1644x f56285A;

    /* renamed from: B */
    private final LiveData f56286B;

    /* renamed from: C */
    private final C1644x f56287C;

    /* renamed from: D */
    private final LiveData f56288D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C1644x f56289E;

    /* renamed from: F */
    private final LiveData f56290F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final C1644x f56291G;

    /* renamed from: H */
    private final LiveData f56292H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public final C1644x f56293I;

    /* renamed from: J */
    private final LiveData f56294J;

    /* renamed from: K */
    private final C1644x f56295K;

    /* renamed from: L */
    private final LiveData f56296L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public final C1644x f56297M;

    /* renamed from: N */
    private final LiveData f56298N;

    /* renamed from: O */
    private final C1644x f56299O;

    /* renamed from: P */
    private final LiveData f56300P;

    /* renamed from: Q */
    private final C1644x f56301Q;

    /* renamed from: R */
    private final LiveData f56302R;

    /* renamed from: S */
    private final C40767b f56303S;

    /* renamed from: T */
    private final C40749p f56304T;
    /* access modifiers changed from: private */

    /* renamed from: U */
    public final C1644x f56305U;

    /* renamed from: V */
    private final LiveData f56306V;

    /* renamed from: W */
    private final C1644x f56307W;

    /* renamed from: X */
    private final LiveData f56308X;

    /* renamed from: Y */
    private final C1644x f56309Y;

    /* renamed from: Z */
    private final LiveData f56310Z;

    /* renamed from: a0 */
    private final C1644x f56311a0;

    /* renamed from: b0 */
    private final LiveData f56312b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public final C1644x f56313c0;

    /* renamed from: d */
    private final C25752a f56314d;

    /* renamed from: d0 */
    private final LiveData f56315d0;

    /* renamed from: e */
    private final C25761g f56316e;
    /* access modifiers changed from: private */

    /* renamed from: e0 */
    public final C1644x f56317e0;

    /* renamed from: f */
    private final C25760f f56318f;

    /* renamed from: f0 */
    private final LiveData f56319f0;

    /* renamed from: g */
    private final C25762h f56320g;

    /* renamed from: g0 */
    private final HashSet f56321g0;

    /* renamed from: h */
    private final C25756e f56322h;

    /* renamed from: h0 */
    private final HashSet f56323h0;

    /* renamed from: i */
    private final C30410c f56324i;

    /* renamed from: i0 */
    private final HashSet f56325i0;

    /* renamed from: j */
    private final C30408a f56326j;

    /* renamed from: j0 */
    private final HashSet f56327j0;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C26617h f56328k;

    /* renamed from: k0 */
    public LimitLoanDecisionDetails f56329k0;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C28064b f56330l;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public C26260d f56331l0;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C28063a f56332m;

    /* renamed from: m0 */
    private C28256b f56333m0;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C28474a f56334n;
    /* access modifiers changed from: private */

    /* renamed from: n0 */
    public C28258d f56335n0;

    /* renamed from: o */
    private final C31658b f56336o;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public C28258d f56337o0;

    /* renamed from: p */
    private final C27494a f56338p;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public C28258d f56339p0;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public C19278a f56340q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public C20943b f56341r = C20943b.REGISTRATION;

    /* renamed from: s */
    private final C1644x f56342s;

    /* renamed from: t */
    private final LiveData f56343t;

    /* renamed from: u */
    private final C1644x f56344u;

    /* renamed from: v */
    private final LiveData f56345v;

    /* renamed from: w */
    private final C1644x f56346w;

    /* renamed from: x */
    private final LiveData f56347x;

    /* renamed from: y */
    private final C1644x f56348y;

    /* renamed from: z */
    private final LiveData f56349z;

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$a */
    public static final class C20941a {
        private C20941a() {
        }

        public /* synthetic */ C20941a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$a0 */
    static final class C20942a0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20942a0(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56350d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49905a(C28255a aVar) {
            C1644x Cw = this.f56350d.f56291G;
            C41536l.m120488h(aVar, "it");
            C21484c.m69418j(Cw, aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49905a((C28255a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$b */
    public enum C20943b {
        REGISTRATION,
        CREDIT_INFO
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$b0 */
    static final class C20944b0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20944b0(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56354d = consumerLoanDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C20945c cVar;
            C21484c.m69415g(this.f56354d.f56291G, th, (Object) null, 2, (Object) null);
            C1644x Fw = this.f56354d.f56293I;
            if (!(th instanceof ApiError) || !C41536l.m120484d(((ApiError) th).mo84685a().getCode(), "-110")) {
                cVar = C20945c.NETWORK;
            } else {
                cVar = C20945c.NO_CREDIT_INFO;
            }
            Fw.mo4826r(C32343x.m95466m(cVar));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$c */
    public enum C20945c {
        NONE,
        NETWORK,
        NO_CREDIT_INFO
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$c0 */
    static final class C20946c0 extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56359d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20946c0(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(0);
            this.f56359d = consumerLoanDetailsViewModel;
        }

        public final void invoke() {
            C21484c.m69417i(this.f56359d.f56317e0, (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$d */
    public enum C20947d {
        AMOUNT,
        SELECTION,
        TERM,
        NONE,
        INCOME_INSURANCE,
        LIFE_INSURANCE,
        INSURANCE_PROVIDER
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$d0 */
    static final class C20948d0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56368d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20948d0(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56368d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49907a(StatusEntity statusEntity) {
            C41536l.m120489i(statusEntity, "it");
            C21484c.m69418j(this.f56368d.f56317e0, statusEntity);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49907a((StatusEntity) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$e0 */
    static final class C20950e0 extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56372d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20950e0(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56372d = consumerLoanDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C21484c.m69415g(this.f56372d.f56317e0, th, (Object) null, 2, (Object) null);
            this.f56372d.f56293I.mo4826r(C32343x.m95466m(C20945c.NO_CREDIT_INFO));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$f */
    static final class C20951f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56373d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20951f(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(0);
            this.f56373d = consumerLoanDetailsViewModel;
        }

        public final void invoke() {
            C21484c.m69417i(this.f56373d.f56313c0, (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$g */
    static final class C20952g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56374d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20952g(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56374d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49914a(C19278a aVar) {
            C41536l.m120489i(aVar, "it");
            this.f56374d.f56341r = C20943b.CREDIT_INFO;
            this.f56374d.f56340q = aVar;
            C1644x yw = this.f56374d.f56313c0;
            C19278a qw = this.f56374d.f56340q;
            C41536l.m120486f(qw);
            C21484c.m69418j(yw, qw);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49914a((C19278a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$h */
    static final class C20953h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56375d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20953h(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56375d = consumerLoanDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C21484c.m69415g(this.f56375d.f56313c0, th, (Object) null, 2, (Object) null);
            this.f56375d.f56293I.mo4826r(C32343x.m95466m(C20945c.NO_CREDIT_INFO));
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$i */
    static final class C20954i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56376d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20954i(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56376d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49916a(C41205b bVar) {
            this.f56376d.f56341r = C20943b.REGISTRATION;
            C21484c.m69417i(this.f56376d.f56289E, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49916a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$j */
    static final class C20955j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56377d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20955j(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56377d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49917a(C25950a aVar) {
            C1644x Ew = this.f56377d.f56289E;
            C41536l.m120488h(aVar, "it");
            C21484c.m69418j(Ew, aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49917a((C25950a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$k */
    static final class C20956k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56378d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20956k(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56378d = consumerLoanDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C21484c.m69415g(this.f56378d.f56289E, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$l */
    static final class C20957l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56379d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f56380e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20957l(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel, ArrayList arrayList) {
            super(1);
            this.f56379d = consumerLoanDetailsViewModel;
            this.f56380e = arrayList;
        }

        /* renamed from: a */
        public final void mo49919a(String str) {
            boolean z;
            C41536l.m120489i(str, "it");
            int parseInt = Integer.parseInt(str);
            if (parseInt != this.f56379d.f56337o0.mo67840i()) {
                z = true;
            } else {
                z = false;
            }
            ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel = this.f56379d;
            consumerLoanDetailsViewModel.f56339p0 = C28258d.m86853b(consumerLoanDetailsViewModel.f56339p0, parseInt, 0, 0, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, 126, (Object) null);
            if (z) {
                this.f56380e.add(new C20949e(true, C20947d.TERM, false, 4, (DefaultConstructorMarker) null));
            } else {
                this.f56380e.add(new C20949e(false, C20947d.TERM, false, 4, (DefaultConstructorMarker) null));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49919a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$m */
    static final class C20958m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56381d;

        /* renamed from: e */
        final /* synthetic */ ArrayList f56382e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20958m(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel, ArrayList arrayList) {
            super(1);
            this.f56381d = consumerLoanDetailsViewModel;
            this.f56382e = arrayList;
        }

        /* renamed from: a */
        public final void mo49920a(String str) {
            BigDecimal bigDecimal;
            boolean z;
            C41536l.m120489i(str, "it");
            try {
                bigDecimal = new BigDecimal(str);
            } catch (NumberFormatException unused) {
                bigDecimal = BigDecimal.ZERO;
                C41536l.m120488h(bigDecimal, "{\n                BigDecimal.ZERO\n            }");
            }
            BigDecimal bigDecimal2 = bigDecimal;
            if (bigDecimal2.compareTo(BigDecimal.ZERO) > 0) {
                if (C41536l.m120484d(bigDecimal2, this.f56381d.f56337o0.mo67832c()) || C41536l.m120484d(bigDecimal2, this.f56381d.f56339p0.mo67832c())) {
                    z = false;
                } else {
                    z = true;
                }
                ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel = this.f56381d;
                consumerLoanDetailsViewModel.f56339p0 = C28258d.m86853b(consumerLoanDetailsViewModel.f56339p0, 0, 0, 0, bigDecimal2, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, 119, (Object) null);
                if (z) {
                    this.f56382e.add(new C20949e(true, C20947d.AMOUNT, true));
                } else {
                    this.f56382e.add(new C20949e(false, C20947d.AMOUNT, false, 4, (DefaultConstructorMarker) null));
                }
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49920a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$n */
    static final class C20959n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56383d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20959n(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56383d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49921a(String str) {
            C41536l.m120489i(str, "it");
            ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel = this.f56383d;
            consumerLoanDetailsViewModel.f56339p0 = C28258d.m86853b(consumerLoanDetailsViewModel.f56339p0, 0, Integer.parseInt(str), 0, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, 125, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49921a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$o */
    static final class C20960o extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56384d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20960o(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56384d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49922a(String str) {
            int i;
            C41536l.m120489i(str, "it");
            ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel = this.f56384d;
            C28258d uw = consumerLoanDetailsViewModel.f56339p0;
            Integer j = C40438v.m117098j(str);
            int i2 = -1;
            if (j != null) {
                i = j.intValue();
            } else {
                i = -1;
            }
            consumerLoanDetailsViewModel.f56339p0 = C28258d.m86853b(uw, 0, 0, i, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, 123, (Object) null);
            ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel2 = this.f56384d;
            C28258d tw = consumerLoanDetailsViewModel2.f56335n0;
            Integer j2 = C40438v.m117098j(str);
            if (j2 != null) {
                i2 = j2.intValue();
            }
            consumerLoanDetailsViewModel2.f56335n0 = C28258d.m86853b(tw, 0, 0, i2, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, 123, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49922a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$p */
    static final class C20961p extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56385d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20961p(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56385d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49923a(C41205b bVar) {
            C21484c.m69417i(this.f56385d.f56285A, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49923a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$q */
    static final class C20962q extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56386d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20962q(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56386d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final C28256b invoke(C26259c cVar) {
            C41536l.m120489i(cVar, "it");
            return this.f56386d.f56330l.mo67616d(cVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$r */
    static final class C20963r extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56387d;

        /* renamed from: e */
        final /* synthetic */ C26257a f56388e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20963r(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel, C26257a aVar) {
            super(1);
            this.f56387d = consumerLoanDetailsViewModel;
            this.f56388e = aVar;
        }

        /* renamed from: a */
        public final void mo49925a(C28256b bVar) {
            ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel = this.f56387d;
            C41536l.m120488h(bVar, "it");
            consumerLoanDetailsViewModel.m67784Ix(bVar, this.f56388e);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49925a((C28256b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$s */
    static final class C20964s extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56389d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20964s(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56389d = consumerLoanDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            if (!(th instanceof ApiError) || !C41536l.m120484d(((ApiError) th).mo84685a().getError(), "text.offers.pop.up.return.to.initial.parameters")) {
                C21484c.m69415g(this.f56389d.f56285A, th, (Object) null, 2, (Object) null);
            } else {
                this.f56389d.f56305U.mo4826r(C32343x.m95466m(Boolean.TRUE));
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$t */
    static final class C20965t extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56390d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20965t(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(0);
            this.f56390d = consumerLoanDetailsViewModel;
        }

        public final void invoke() {
            C21484c.m69417i(this.f56390d.f56297M, (Object) null, 1, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$u */
    static final class C20966u extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56391d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20966u(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(0);
            this.f56391d = consumerLoanDetailsViewModel;
        }

        public final void invoke() {
            this.f56391d.f56328k.mo65871a();
            this.f56391d.f56334n.mo68096b();
            C21484c.m69418j(this.f56391d.f56297M, Boolean.TRUE);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$v */
    static final class C20967v extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56392d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20967v(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56392d = consumerLoanDetailsViewModel;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C41238w.f97225a;
        }

        public final void invoke(Throwable th) {
            C41536l.m120489i(th, "it");
            C21484c.m69415g(this.f56392d.f56297M, th, (Object) null, 2, (Object) null);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$w */
    static final class C20968w extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56393d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20968w(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56393d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49928a(C41205b bVar) {
            C21484c.m69417i(this.f56393d.f56291G, (Object) null, 1, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49928a((C41205b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$x */
    static final class C20969x extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56394d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20969x(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56394d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49929a(C26260d dVar) {
            this.f56394d.f56331l0 = dVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49929a((C26260d) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$y */
    static final class C20970y extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56395d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20970y(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56395d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final C28255a invoke(C26260d dVar) {
            C41536l.m120489i(dVar, "it");
            return this.f56395d.f56332m.mo67614a(dVar);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$z */
    static final class C20971z extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ConsumerLoanDetailsViewModel f56396d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C20971z(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel) {
            super(1);
            this.f56396d = consumerLoanDetailsViewModel;
        }

        /* renamed from: a */
        public final void mo49931a(C28255a aVar) {
            ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel = this.f56396d;
            C41536l.m120488h(aVar, "it");
            consumerLoanDetailsViewModel.m67822ky(aVar);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo49931a((C28255a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConsumerLoanDetailsViewModel(C25752a aVar, C25761g gVar, C25760f fVar, C25762h hVar, C25756e eVar, C30410c cVar, C30408a aVar2, C26617h hVar2, C28064b bVar, C28063a aVar3, C28474a aVar4, C31658b bVar2, C27494a aVar5) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C25752a aVar6 = aVar;
        C25761g gVar2 = gVar;
        C25760f fVar2 = fVar;
        C25762h hVar3 = hVar;
        C25756e eVar2 = eVar;
        C30410c cVar2 = cVar;
        C30408a aVar7 = aVar2;
        C26617h hVar4 = hVar2;
        C28064b bVar3 = bVar;
        C28063a aVar8 = aVar3;
        C28474a aVar9 = aVar4;
        C31658b bVar4 = bVar2;
        C27494a aVar10 = aVar5;
        C41536l.m120489i(aVar6, "checkConsumerLoan");
        C41536l.m120489i(gVar2, "identifyCreditor");
        C41536l.m120489i(fVar2, "getConsumerLoanGetPreContract");
        C41536l.m120489i(hVar3, "registerConsumerLoan");
        C41536l.m120489i(eVar2, "getLoanDecision");
        C41536l.m120489i(cVar2, "getCreditInfoContract");
        C41536l.m120489i(aVar7, "confirmCreditInfo");
        C41536l.m120489i(hVar4, "refreshOffers");
        C41536l.m120489i(bVar3, "limitLoanDecisionUiMapper");
        C41536l.m120489i(aVar8, "limitLoanDecisionDataUiMapper");
        C41536l.m120489i(aVar9, "applicationEventPoster");
        C41536l.m120489i(bVar4, "startTMXProfilingUseCase");
        C41536l.m120489i(aVar10, "otpBuilder");
        this.f56314d = aVar6;
        this.f56316e = gVar2;
        this.f56318f = fVar2;
        this.f56320g = hVar3;
        this.f56322h = eVar2;
        this.f56324i = cVar2;
        this.f56326j = aVar7;
        this.f56328k = hVar4;
        this.f56330l = bVar3;
        this.f56332m = aVar8;
        this.f56334n = aVar9;
        this.f56336o = bVar4;
        this.f56338p = aVar10;
        C1644x xVar = new C1644x();
        this.f56342s = xVar;
        this.f56343t = xVar;
        C1644x xVar2 = new C1644x();
        this.f56344u = xVar2;
        this.f56345v = xVar2;
        C1644x xVar3 = new C1644x();
        this.f56346w = xVar3;
        this.f56347x = xVar3;
        C1644x xVar4 = new C1644x();
        this.f56348y = xVar4;
        this.f56349z = xVar4;
        C1644x xVar5 = new C1644x();
        this.f56285A = xVar5;
        this.f56286B = xVar5;
        C1644x xVar6 = new C1644x();
        this.f56287C = xVar6;
        this.f56288D = xVar6;
        C1644x xVar7 = new C1644x();
        this.f56289E = xVar7;
        this.f56290F = xVar7;
        C1644x xVar8 = new C1644x();
        this.f56291G = xVar8;
        this.f56292H = xVar8;
        C1644x xVar9 = new C1644x();
        this.f56293I = xVar9;
        this.f56294J = xVar9;
        C1644x xVar10 = new C1644x();
        this.f56295K = xVar10;
        this.f56296L = xVar10;
        C1644x xVar11 = new C1644x();
        this.f56297M = xVar11;
        this.f56298N = xVar11;
        C1644x xVar12 = new C1644x();
        this.f56299O = xVar12;
        this.f56300P = xVar12;
        C1644x xVar13 = new C1644x();
        this.f56301Q = xVar13;
        this.f56302R = xVar13;
        C40767b h1 = C40767b.m118210h1();
        C41536l.m120488h(h1, "create<LoanDecisionInputData>()");
        this.f56303S = h1;
        this.f56304T = h1;
        C1644x xVar14 = new C1644x();
        this.f56305U = xVar14;
        this.f56306V = xVar14;
        C1644x xVar15 = new C1644x();
        this.f56307W = xVar15;
        this.f56308X = xVar15;
        C1644x xVar16 = new C1644x();
        this.f56309Y = xVar16;
        this.f56310Z = xVar16;
        C1644x xVar17 = new C1644x();
        this.f56311a0 = xVar17;
        this.f56312b0 = xVar17;
        C1644x xVar18 = new C1644x();
        this.f56313c0 = xVar18;
        this.f56315d0 = xVar18;
        C1644x xVar19 = new C1644x();
        this.f56317e0 = xVar19;
        this.f56319f0 = xVar19;
        this.f56321g0 = new HashSet();
        this.f56323h0 = new HashSet();
        this.f56325i0 = new HashSet();
        this.f56327j0 = new HashSet();
        this.f56335n0 = new C28258d(-1, -1, -1, new BigDecimal(String.valueOf(Utils.DOUBLE_EPSILON)), (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null);
        this.f56337o0 = new C28258d(-1, -1, -1, new BigDecimal(String.valueOf(Utils.DOUBLE_EPSILON)), (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null);
        this.f56339p0 = new C28258d(-1, -1, -1, new BigDecimal(String.valueOf(Utils.DOUBLE_EPSILON)), (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ax */
    public static final void m67773Ax(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ex */
    private final void m67778Ex(Intent intent) {
        ArrayList<C20949e> arrayList = new ArrayList<>();
        C32343x.m95461k0(intent, "LOAN_TERM_WIZARD_FIELD_ID", new C20957l(this, arrayList));
        C32343x.m95461k0(intent, "LOAN_AMOUNT_WIZARD_FIELD_ID", new C20958m(this, arrayList));
        C32343x.m95461k0(intent, "LOAN_PAYMENT_DATE_WIZARD_FIELD_ID", new C20959n(this));
        C32343x.m95461k0(intent, "LOAN_CARD_WIZARD_FIELD_ID", new C20960o(this));
        this.f56303S.onNext(C28258d.m86853b(this.f56339p0, 0, 0, 0, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, C11051p3.f31760d, (Object) null));
        for (C20949e ly : arrayList) {
            m67824ly(ly);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: Fx */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m67780Fx() {
        /*
            r6 = this;
            sr.d r0 = r6.f56339p0
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceProviderUiModel r0 = r0.mo67833d()
            r1 = 1
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = r0.mo49826b()
            if (r0 == 0) goto L_0x0064
            sr.b r2 = r6.f56333m0
            r3 = 0
            if (r2 == 0) goto L_0x0038
            java.util.List r2 = r2.mo67821d()
            if (r2 == 0) goto L_0x0038
            java.util.Iterator r2 = r2.iterator()
        L_0x001e:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0036
            java.lang.Object r4 = r2.next()
            r5 = r4
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel r5 = (p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel) r5
            java.lang.String r5 = r5.mo49845d()
            boolean r5 = kotlin.jvm.internal.C41536l.m120484d(r5, r0)
            if (r5 == 0) goto L_0x001e
            r3 = r4
        L_0x0036:
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel r3 = (p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.ProviderInfoUiModel) r3
        L_0x0038:
            if (r3 != 0) goto L_0x003b
            goto L_0x0064
        L_0x003b:
            sr.d r0 = r6.f56339p0
            java.lang.Boolean r0 = r0.mo67836f()
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r2)
            r4 = 0
            if (r0 == 0) goto L_0x0051
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel r0 = r3.mo49844b()
            if (r0 != 0) goto L_0x0051
            return r4
        L_0x0051:
            sr.d r0 = r6.f56339p0
            java.lang.Boolean r0 = r0.mo67834e()
            boolean r0 = kotlin.jvm.internal.C41536l.m120484d(r0, r2)
            if (r0 == 0) goto L_0x0064
            ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.model.InsuranceInfoUiModel r0 = r3.mo49843a()
            if (r0 != 0) goto L_0x0064
            return r4
        L_0x0064:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel.m67780Fx():boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: Ix */
    public final void m67784Ix(C28256b bVar, C26257a aVar) {
        boolean z;
        m67799Sw(this.f56323h0, this.f56321g0);
        m67814ey(C28258d.m86853b(this.f56339p0, 0, 0, 0, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, C11051p3.f31760d, (Object) null));
        this.f56327j0.clear();
        this.f56333m0 = bVar;
        C1644x xVar = this.f56285A;
        LoanOfferCard b = aVar.mo65354b();
        if (!aVar.mo65360g() || aVar.mo65359f()) {
            z = false;
        } else {
            z = true;
        }
        C21484c.m69418j(xVar, new C26261e(bVar, b, z));
    }

    /* renamed from: Kx */
    private final void m67787Kx(C26257a aVar) {
        C25761g gVar = this.f56316e;
        HashSet hashSet = this.f56321g0;
        boolean z = false;
        if (!(hashSet instanceof Collection) || !hashSet.isEmpty()) {
            Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((LimitLoanRefinanceInfo) it.next()).isCreditorIdentified().mo63390c()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        C41205b I = gVar.mo64344a(z).mo94898g(this.f56314d.mo64338a(mo49881ex(), aVar)).mo95063B(C40992a.m118827a()).mo95083l(new C28486a(new C20961p(this))).mo95062A(new C28490e(new C20962q(this))).mo95070I(new C28491f(new C20963r(this, aVar)), new C28492g(new C20964s(this)));
        C41536l.m120488h(I, "private fun recalculateL…       })\n        )\n    }");
        addDisposable(I);
    }

    /* access modifiers changed from: private */
    /* renamed from: Lx */
    public static final void m67789Lx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Mx */
    public static final C28256b m67791Mx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28256b) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Nx */
    public static final void m67792Nx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Ow */
    private final void m67793Ow() {
        if (!m67780Fx()) {
            mo49879ay((InsuranceProviderUiModel) null);
        } else {
            mo49879ay(this.f56339p0.mo67833d());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Ox */
    public static final void m67794Ox(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Pw */
    private final void m67795Pw(LimitLoanRefinanceInfo limitLoanRefinanceInfo, boolean z) {
        Object obj;
        boolean z2;
        if (z) {
            this.f56321g0.add(limitLoanRefinanceInfo);
        } else {
            this.f56321g0.remove(limitLoanRefinanceInfo);
        }
        Iterator it = this.f56321g0.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            LimitLoanRefinanceInfo limitLoanRefinanceInfo2 = (LimitLoanRefinanceInfo) obj;
            if (!C41536l.m120484d(limitLoanRefinanceInfo2.getProductSource(), "CRI") || C24978b.YES == limitLoanRefinanceInfo2.isCreditorIdentified()) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        LimitLoanRefinanceInfo limitLoanRefinanceInfo3 = (LimitLoanRefinanceInfo) obj;
        m67824ly(new C20949e(!C41536l.m120484d(this.f56321g0, this.f56323h0), C20947d.SELECTION, true));
    }

    /* renamed from: Qw */
    private final void m67796Qw(boolean z, List list) {
        boolean z2;
        Object obj;
        boolean z3;
        C1644x xVar = this.f56344u;
        Iterator it = list.iterator();
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            LimitLoanRefinanceInfo limitLoanRefinanceInfo = (LimitLoanRefinanceInfo) obj;
            if (!limitLoanRefinanceInfo.isSelected() || !C41536l.m120484d(limitLoanRefinanceInfo.getProductSource(), "CRI")) {
                z3 = false;
                continue;
            } else {
                z3 = true;
                continue;
            }
            if (z3) {
                break;
            }
        }
        if (obj == null) {
            z2 = false;
        }
        xVar.mo4826r(new C30138e(z2, z));
    }

    /* renamed from: Rw */
    static /* synthetic */ void m67797Rw(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0 && (list = (List) consumerLoanDetailsViewModel.f56343t.mo4814f()) == null) {
            list = C41341q.m119907j();
        }
        consumerLoanDetailsViewModel.m67796Qw(z, list);
    }

    /* access modifiers changed from: private */
    /* renamed from: Rx */
    public static final void m67798Rx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Sw */
    private final void m67799Sw(Collection collection, Collection collection2) {
        collection.clear();
        collection.addAll(collection2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Sx */
    public static final void m67800Sx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Tx */
    public static final C28255a m67801Tx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C28255a) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Ux */
    public static final void m67802Ux(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Vw */
    private final List m67803Vw() {
        List<LimitLoanRefinanceInfo> list;
        C26259c b;
        C26260d dVar = this.f56331l0;
        if (dVar == null || (b = dVar.mo65383b()) == null || (list = b.mo65375e()) == null) {
            list = C41341q.m119907j();
        }
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (LimitLoanRefinanceInfo limitLoanRefinanceInfo : list) {
            HashSet<LimitLoanRefinanceInfo> hashSet = this.f56321g0;
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(hashSet, 10));
            for (LimitLoanRefinanceInfo productKey : hashSet) {
                arrayList2.add(productKey.getProductKey());
            }
            arrayList.add(LimitLoanRefinanceInfo.copy$default(limitLoanRefinanceInfo, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, Utils.DOUBLE_EPSILON, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, arrayList2.contains(limitLoanRefinanceInfo.getProductKey()), (C24978b) null, 196607, (Object) null));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: Vx */
    public static final void m67804Vx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: Wx */
    public static final void m67805Wx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Xw */
    private final List m67806Xw(C27088c cVar, List list) {
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LimitLoanRefinanceInfo limitLoanRefinanceInfo = (LimitLoanRefinanceInfo) it.next();
            arrayList.add(LimitLoanRefinanceInfo.copy$default(limitLoanRefinanceInfo, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, Utils.DOUBLE_EPSILON, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, C41536l.m120484d(limitLoanRefinanceInfo.getProductRefFlag(), "Y"), (C24978b) null, 196607, (Object) null));
        }
        return arrayList;
    }

    /* renamed from: Yx */
    public static /* synthetic */ void m67807Yx(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        consumerLoanDetailsViewModel.mo49874Xx(z);
    }

    /* renamed from: bx */
    private final String m67808bx() {
        C25950a aVar;
        String a;
        C21503d dVar = (C21503d) this.f56289E.mo4814f();
        if (dVar != null) {
            aVar = (C25950a) dVar.mo53701a();
        } else {
            aVar = null;
        }
        if (aVar == null || (a = aVar.mo64864a()) == null) {
            return null;
        }
        byte[] bytes = a.getBytes(C40407d.f95989b);
        C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
        if (bytes != null) {
            return C32359z0.m95597y(bytes);
        }
        return null;
    }

    /* renamed from: cx */
    private final String m67809cx() {
        C24978b bVar;
        if (mo49881ex().isInsuranceAvailable()) {
            if (C41536l.m120484d(this.f56339p0.mo67834e(), Boolean.TRUE)) {
                bVar = C24978b.YES;
            } else {
                bVar = C24978b.NO;
            }
            String e = bVar.mo63391e();
            C41536l.m120488h(e, "if (inputData.hasIncomeI….YES else YesNo.NO).value");
            return e;
        }
        String str = mo49881ex().insIncFlag;
        C41536l.m120488h(str, "offerDetails.insIncFlag");
        return str;
    }

    /* renamed from: dx */
    private final C40762x m67811dx(String str, String str2) {
        C26260d dVar = this.f56331l0;
        if (dVar == null) {
            return this.f56322h.mo64339d(str, str2);
        }
        C40762x z = C40762x.m118162z(dVar);
        C41536l.m120488h(z, "just(decision)");
        return z;
    }

    /* renamed from: dy */
    public static /* synthetic */ void m67812dy(ConsumerLoanDetailsViewModel consumerLoanDetailsViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        consumerLoanDetailsViewModel.mo49880cy(str, str2, str3);
    }

    /* renamed from: ey */
    private final void m67814ey(C28258d dVar) {
        this.f56337o0 = dVar;
        this.f56339p0 = C28258d.m86853b(dVar, 0, 0, 0, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, C11051p3.f31760d, (Object) null);
    }

    /* renamed from: hy */
    private final boolean m67818hy(String str, String str2) {
        return str == null || str2 == null;
    }

    /* access modifiers changed from: private */
    /* renamed from: ky */
    public final void m67822ky(C28255a aVar) {
        int i;
        Boolean bool;
        boolean z;
        int i2;
        LimitLoanDecisionDetails a = aVar.mo67814b().mo67818a();
        int i3 = a.loanTerm;
        Integer num = a.minTerm;
        C41536l.m120488h(num, "minTerm");
        int intValue = i3 - num.intValue();
        Integer num2 = a.payDay;
        boolean z2 = true;
        if (num2 != null) {
            C41536l.m120488h(num2, "payDay");
            int intValue2 = num2.intValue();
            if (1 > intValue2 || intValue2 >= 27) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i2 = intValue2 - 1;
            } else {
                i2 = 0;
            }
            i = i2;
        } else {
            i = 0;
        }
        BigDecimal bigDecimal = a.loanAmount;
        if (bigDecimal == null) {
            bigDecimal = BigDecimal.ZERO;
        }
        BigDecimal bigDecimal2 = bigDecimal;
        C41536l.m120488h(bigDecimal2, "loanAmount ?: BigDecimal.ZERO");
        if (a.insLifeAmount.compareTo(BigDecimal.ZERO) <= 0) {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        String str = a.insIncFlag;
        if (C41536l.m120484d(str, "Y")) {
            bool = Boolean.TRUE;
        } else if (C41536l.m120484d(str, "N")) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        m67814ey(new C28258d(intValue, i, -1, bigDecimal2, (InsuranceProviderUiModel) null, valueOf, bool));
        this.f56335n0 = C28258d.m86853b(this.f56337o0, 0, 0, 0, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, (Boolean) null, C11051p3.f31760d, (Object) null);
        HashSet hashSet = this.f56325i0;
        List e = aVar.mo67814b().mo67822e();
        ArrayList arrayList = new ArrayList();
        for (Object next : e) {
            if (C41536l.m120484d(((LimitLoanRefinanceInfo) next).getProductRefFlag(), "Y")) {
                arrayList.add(next);
            }
        }
        m67799Sw(hashSet, arrayList);
    }

    /* renamed from: ly */
    private final void m67824ly(C20949e eVar) {
        if (eVar.mo49909b()) {
            this.f56327j0.add(eVar.mo49908a());
        } else {
            this.f56327j0.remove(eVar.mo49908a());
        }
        C1644x xVar = this.f56299O;
        if (this.f56327j0.isEmpty()) {
            eVar = new C20949e(false, C20947d.NONE, false);
        } else if (this.f56327j0.contains(C20947d.AMOUNT)) {
            C20947d a = eVar.mo49908a();
            C20947d dVar = C20947d.SELECTION;
        }
        xVar.mo4826r(C32343x.m95466m(eVar));
    }

    /* renamed from: my */
    private final boolean m67826my(BigDecimal bigDecimal) {
        HashSet<LimitLoanRefinanceInfo> hashSet = this.f56321g0;
        BigDecimal bigDecimal2 = BigDecimal.ZERO;
        for (LimitLoanRefinanceInfo productAmount : hashSet) {
            C41536l.m120488h(bigDecimal2, "acc");
            bigDecimal2 = bigDecimal2.add(new BigDecimal(String.valueOf(productAmount.getProductAmount())));
            C41536l.m120488h(bigDecimal2, "this.add(other)");
        }
        C41536l.m120488h(bigDecimal2, "sum");
        BigDecimal add = bigDecimal2.add(bigDecimal);
        C41536l.m120488h(add, "this.add(other)");
        if (add.compareTo(this.f56339p0.mo67832c()) <= 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: yx */
    public static final void m67839yx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: zx */
    public static final void m67841zx(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: Bx */
    public final CreditInfoRepositoryImpl.ConfirmCriParams mo49862Bx(String str, String str2, String str3, boolean z) {
        String str4;
        String str5;
        String str6;
        String b;
        String a;
        C19278a aVar = this.f56340q;
        if (aVar == null || (a = aVar.mo47499a()) == null) {
            str4 = null;
        } else {
            byte[] bytes = a.getBytes(C40407d.f95989b);
            C41536l.m120488h(bytes, "this as java.lang.String).getBytes(charset)");
            str4 = C32359z0.m95597y(bytes);
        }
        if (z) {
            C41536l.m120486f(str4);
            str5 = str4;
        } else {
            str5 = "";
        }
        String value = StatusEntity.ACTIVE.getValue();
        C19278a aVar2 = this.f56340q;
        if (aVar2 == null || (b = aVar2.mo47500b()) == null) {
            str6 = "";
        } else {
            str6 = b;
        }
        return new CreditInfoRepositoryImpl.ConfirmCriParams(str5, value, "CREDIT_INFO_GET_CUSTOMER_INFO", "", str6, str, str2, str3, (String) null, C11398b.f33139r, (DefaultConstructorMarker) null);
    }

    /* renamed from: Cx */
    public final ProcessLoanRegistrationParams mo49863Cx(String str, String str2, String str3, String str4, String str5) {
        String str6;
        C41536l.m120489i(str, "offerNo");
        C41536l.m120489i(str2, "cardPan");
        String valueOf = String.valueOf(mo49881ex().decisionNo);
        String str7 = mo49881ex().decisionScheme;
        C41536l.m120486f(str7);
        InsuranceProviderUiModel d = this.f56339p0.mo67833d();
        if (d != null) {
            str6 = d.mo49826b();
        } else {
            str6 = null;
        }
        return new ProcessLoanRegistrationParams(str, valueOf, str7, "123123", str2, "", str6, C10146d0.C10177h.m37232a(), m67808bx(), BankApi.OFFERS_PROCESS_LOAN_REGISTRATION, str3, str4, str5);
    }

    /* renamed from: Dx */
    public final void mo49864Dx(String str, String str2, String str3) {
        C41536l.m120489i(str, "operationId");
        C41536l.m120489i(str2, "operationReference");
        C41536l.m120489i(str3, "scaAuthCode");
        this.f56309Y.mo4826r(C32343x.m95466m(new C31549a(str, str2, str3, this.f56341r)));
    }

    /* renamed from: Gx */
    public final void mo49865Gx(int i, int i2, Intent intent) {
        if (i2 == -1 && i == 10001 && intent != null) {
            m67778Ex(intent);
        }
    }

    /* renamed from: Hx */
    public final void mo49866Hx() {
        this.f56301Q.mo4826r(C32343x.m95466m(this.f56341r));
        C32343x.m95397J0(this, "applications_cl", "cl_pre_contract_accept", "on_cl_pre_contract_accept", C10464h.C10465a.FIREBASE, (Bundle) null, 16, (Object) null);
    }

    /* renamed from: Jx */
    public final void mo49867Jx(C26257a aVar) {
        C41536l.m120489i(aVar, "options");
        LoanOfferCard b = aVar.mo65354b();
        String h = aVar.mo65361h();
        String cx = m67809cx();
        String e = aVar.mo65357e();
        BigDecimal a = aVar.mo65353a();
        boolean g = aVar.mo65360g();
        List list = (List) this.f56343t.mo4814f();
        if (list == null) {
            list = C41341q.m119907j();
        }
        m67787Kx(new C26257a(b, h, cx, e, a, g, list, aVar.mo65359f(), this.f56339p0.mo67833d()));
    }

    /* renamed from: Nw */
    public final boolean mo49868Nw(int i, boolean z) {
        LimitLoanRefinanceInfo limitLoanRefinanceInfo;
        List list = (List) this.f56343t.mo4814f();
        if (list == null || (limitLoanRefinanceInfo = (LimitLoanRefinanceInfo) C41358y.m120010Z(list, i)) == null) {
            return false;
        }
        if (!z || m67826my(new BigDecimal(String.valueOf(limitLoanRefinanceInfo.getProductAmount())))) {
            limitLoanRefinanceInfo.setSelected(z);
            m67797Rw(this, false, (List) null, 3, (Object) null);
            m67795Pw(limitLoanRefinanceInfo, z);
            return true;
        }
        this.f56348y.mo4826r(C32343x.m95466m(C27950a.m86287d("text.offers.ref.amout.should.be.less.then.loan.amount", false, 2, (Object) null)));
        return false;
    }

    /* renamed from: Px */
    public final void mo49869Px(C26266i iVar) {
        C41536l.m120489i(iVar, "options");
        if (m67818hy(iVar.mo65423a().getOperationReference(), iVar.mo65423a().getScaAuthCode())) {
            this.f56307W.mo4826r(C32343x.m95466m(Boolean.TRUE));
        } else {
            addDisposable(C32343x.m95478q(this.f56320g.mo64345a(iVar), new C20965t(this), new C20966u(this), new C20967v(this)));
        }
    }

    /* renamed from: Qx */
    public final void mo49870Qx(String str, String str2) {
        C41536l.m120489i(str, "offerNo");
        C41536l.m120489i(str2, "operationType");
        C41205b I = m67811dx(str, str2).mo95063B(C40992a.m118827a()).mo95083l(new C28493h(new C20968w(this))).mo95084m(new C28494i(new C20969x(this))).mo95062A(new C28495j(new C20970y(this))).mo95084m(new C28496k(new C20971z(this))).mo95070I(new C28497l(new C20942a0(this)), new C28498m(new C20944b0(this)));
        C41536l.m120488h(I, "fun requestLoanDecision(…       })\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: Tw */
    public final void mo49871Tw() {
        this.f56311a0.mo4826r(C32343x.m95466m(mo49901ux(mo49862Bx((String) null, (String) null, (String) null, false))));
    }

    /* renamed from: Uw */
    public final void mo49872Uw() {
        addDisposable(C32343x.m95484s(this.f56324i.mo70752a("CREDIT_INFO_CHECK_PERMISSION_APPL_CL"), new C20951f(this), new C20952g(this), new C20953h(this)));
    }

    /* renamed from: Ww */
    public final void mo49873Ww(C27088c cVar, List list) {
        C41536l.m120489i(cVar, "operationType");
        C41536l.m120489i(list, "refinanceInfo");
        List Xw = m67806Xw(cVar, list);
        this.f56342s.mo4826r(Xw);
        HashSet hashSet = this.f56323h0;
        ArrayList arrayList = new ArrayList();
        for (Object next : Xw) {
            if (((LimitLoanRefinanceInfo) next).isSelected()) {
                arrayList.add(next);
            }
        }
        m67799Sw(hashSet, arrayList);
        m67799Sw(this.f56321g0, this.f56323h0);
        m67797Rw(this, false, (List) null, 2, (Object) null);
    }

    /* renamed from: Xx */
    public final void mo49874Xx(boolean z) {
        C28258d dVar;
        HashSet hashSet;
        if (z) {
            dVar = this.f56335n0;
        } else {
            dVar = this.f56337o0;
        }
        m67814ey(dVar);
        this.f56303S.onNext(this.f56337o0);
        HashSet hashSet2 = this.f56321g0;
        if (z) {
            hashSet = this.f56325i0;
        } else {
            hashSet = this.f56323h0;
        }
        m67799Sw(hashSet2, hashSet);
        this.f56342s.mo4823o(m67803Vw());
        this.f56327j0.clear();
        this.f56299O.mo4826r(C32343x.m95466m(new C20949e(false, C20947d.NONE, false)));
    }

    /* renamed from: Yw */
    public final LiveData mo49875Yw() {
        return this.f56312b0;
    }

    /* renamed from: Zw */
    public final LiveData mo49876Zw() {
        return this.f56315d0;
    }

    /* renamed from: Zx */
    public final void mo49877Zx(boolean z) {
        this.f56339p0 = C28258d.m86853b(this.f56339p0, 0, 0, 0, (BigDecimal) null, (InsuranceProviderUiModel) null, (Boolean) null, Boolean.valueOf(z), 63, (Object) null);
        m67824ly(new C20949e(!C41536l.m120484d(this.f56337o0.mo67834e(), Boolean.valueOf(z)), C20947d.INCOME_INSURANCE, false, 4, (DefaultConstructorMarker) null));
        this.f56303S.onNext(this.f56339p0);
        m67793Ow();
    }

    /* renamed from: ax */
    public final LiveData mo49878ax() {
        return this.f56319f0;
    }

    /* renamed from: ay */
    public final void mo49879ay(InsuranceProviderUiModel insuranceProviderUiModel) {
        String str;
        this.f56339p0 = C28258d.m86853b(this.f56339p0, 0, 0, 0, (BigDecimal) null, insuranceProviderUiModel, (Boolean) null, (Boolean) null, 111, (Object) null);
        InsuranceProviderUiModel d = this.f56337o0.mo67833d();
        String str2 = null;
        if (d != null) {
            str = d.mo49826b();
        } else {
            str = null;
        }
        if (insuranceProviderUiModel != null) {
            str2 = insuranceProviderUiModel.mo49826b();
        }
        m67824ly(new C20949e(!C41536l.m120484d(str, str2), C20947d.INSURANCE_PROVIDER, false, 4, (DefaultConstructorMarker) null));
        this.f56303S.onNext(this.f56339p0);
    }

    /* renamed from: cy */
    public final void mo49880cy(String str, String str2, String str3) {
        bindToLifecycle(C32343x.m95484s(this.f56326j.mo70750a(mo49901ux(mo49862Bx(str, str2, str3, true))), new C20946c0(this), new C20948d0(this), new C20950e0(this)));
    }

    /* renamed from: ex */
    public final LimitLoanDecisionDetails mo49881ex() {
        LimitLoanDecisionDetails limitLoanDecisionDetails = this.f56329k0;
        if (limitLoanDecisionDetails != null) {
            return limitLoanDecisionDetails;
        }
        C41536l.m120506z("offerDetails");
        return null;
    }

    /* renamed from: fx */
    public final LiveData mo49882fx() {
        return this.f56286B;
    }

    /* renamed from: fy */
    public final void mo49883fy(boolean z) {
        this.f56287C.mo4826r(C32343x.m95466m(Boolean.valueOf(z)));
    }

    /* renamed from: gx */
    public final LiveData mo49884gx() {
        return this.f56306V;
    }

    /* renamed from: gy */
    public final void mo49885gy(LimitLoanDecisionDetails limitLoanDecisionDetails) {
        C41536l.m120489i(limitLoanDecisionDetails, "<set-?>");
        this.f56329k0 = limitLoanDecisionDetails;
    }

    /* renamed from: hx */
    public final LiveData mo49886hx() {
        return this.f56349z;
    }

    /* renamed from: ix */
    public final LiveData mo49887ix() {
        return this.f56343t;
    }

    /* renamed from: iy */
    public final void mo49888iy() {
        this.f56295K.mo4826r(C32343x.m95466m(Boolean.TRUE));
        bindToLifecycle(this.f56336o.mo72084b(TMXFlags.TMX_FLAG_LOAN_ACTIVATE_KEY));
        this.f56295K.mo4826r(C32343x.m95466m(Boolean.FALSE));
    }

    /* renamed from: jx */
    public final LiveData mo49889jx() {
        return this.f56292H;
    }

    /* renamed from: jy */
    public final InsuranceProviderUiModel mo49890jy(ProviderInfoUiModel providerInfoUiModel) {
        String str;
        String str2;
        InsuranceInfoUiModel a;
        InsuranceInfoUiModel b;
        C41536l.m120489i(providerInfoUiModel, "info");
        Boolean f = this.f56339p0.mo67836f();
        Boolean bool = Boolean.TRUE;
        boolean d = C41536l.m120484d(f, bool);
        boolean d2 = C41536l.m120484d(this.f56339p0.mo67834e(), bool);
        String d3 = providerInfoUiModel.mo49845d();
        String e = providerInfoUiModel.mo49847e();
        String str3 = null;
        if (!d || (b = providerInfoUiModel.mo49844b()) == null) {
            str = null;
        } else {
            str = b.mo49815a();
        }
        if (!d2 || (a = providerInfoUiModel.mo49843a()) == null) {
            str2 = null;
        } else {
            str2 = a.mo49815a();
        }
        String d4 = providerInfoUiModel.mo49845d();
        InsuranceProviderUiModel d5 = this.f56339p0.mo67833d();
        if (d5 != null) {
            str3 = d5.mo49826b();
        }
        return new InsuranceProviderUiModel(d3, e, str, str2, d, d2, C41536l.m120484d(d4, str3));
    }

    /* renamed from: kx */
    public final LiveData mo49891kx() {
        return this.f56288D;
    }

    /* renamed from: lx */
    public final C40749p mo49892lx() {
        return this.f56304T;
    }

    /* renamed from: mx */
    public final LiveData mo49893mx() {
        return this.f56347x;
    }

    /* renamed from: nx */
    public final LiveData mo49894nx() {
        return this.f56298N;
    }

    /* renamed from: ox */
    public final LiveData mo49895ox() {
        return this.f56302R;
    }

    /* renamed from: px */
    public final LiveData mo49896px() {
        return this.f56290F;
    }

    /* renamed from: qx */
    public final LiveData mo49897qx() {
        return this.f56296L;
    }

    /* renamed from: rx */
    public final LiveData mo49898rx() {
        return this.f56294J;
    }

    /* renamed from: sx */
    public final LiveData mo49899sx() {
        return this.f56300P;
    }

    /* renamed from: tx */
    public final LiveData mo49900tx() {
        return this.f56345v;
    }

    /* renamed from: ux */
    public final HashMap mo49901ux(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f56338p.mo66809a(otpParams);
    }

    /* renamed from: vx */
    public final LiveData mo49902vx() {
        return this.f56308X;
    }

    /* renamed from: wx */
    public final LiveData mo49903wx() {
        return this.f56310Z;
    }

    /* renamed from: xx */
    public final void mo49904xx(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, BigDecimal bigDecimal, String str9, String str10, int i, double d, double d2) {
        String str11;
        C41536l.m120489i(str, IRetrofitService.TERMINAL);
        C41536l.m120489i(str2, "decNo");
        C41536l.m120489i(str3, "decisionScheme");
        C41536l.m120489i(str4, "cardPan");
        C41536l.m120489i(str5, "operationType");
        C41536l.m120489i(str6, "loanCcy");
        C41536l.m120489i(str7, "loanTerm");
        C41536l.m120489i(str8, "payDay");
        C41536l.m120489i(bigDecimal, "loanAmount");
        C41536l.m120489i(str9, "prodType");
        C41536l.m120489i(str10, "limitCategory");
        String cx = m67809cx();
        List list = (List) this.f56343t.mo4814f();
        if (list == null) {
            list = C41341q.m119907j();
        }
        List list2 = list;
        InsuranceProviderUiModel d3 = this.f56339p0.mo67833d();
        if (d3 != null) {
            str11 = d3.mo49826b();
        } else {
            str11 = null;
        }
        C41205b I = this.f56318f.mo64343a(new C26262f(str, str2, str3, str4, str5, str6, str7, str8, cx, list2, bigDecimal, (BigDecimal) null, str9, str10, i, d, d2, str11)).mo95063B(C40992a.m118827a()).mo95083l(new C28487b(new C20954i(this))).mo95070I(new C28488c(new C20955j(this)), new C28489d(new C20956k(this)));
        C41536l.m120488h(I, "fun getPreContract(\n    …        )\n        )\n    }");
        addDisposable(I);
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.viewmodel.ConsumerLoanDetailsViewModel$e */
    public static final class C20949e {

        /* renamed from: a */
        private final boolean f56369a;

        /* renamed from: b */
        private final C20947d f56370b;

        /* renamed from: c */
        private final boolean f56371c;

        public C20949e(boolean z, C20947d dVar, boolean z2) {
            C41536l.m120489i(dVar, "field");
            this.f56369a = z;
            this.f56370b = dVar;
            this.f56371c = z2;
        }

        /* renamed from: a */
        public final C20947d mo49908a() {
            return this.f56370b;
        }

        /* renamed from: b */
        public final boolean mo49909b() {
            return this.f56369a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C20949e)) {
                return false;
            }
            C20949e eVar = (C20949e) obj;
            return this.f56369a == eVar.f56369a && this.f56370b == eVar.f56370b && this.f56371c == eVar.f56371c;
        }

        public int hashCode() {
            boolean z = this.f56369a;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int hashCode = (((z ? 1 : 0) * true) + this.f56370b.hashCode()) * 31;
            boolean z3 = this.f56371c;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public String toString() {
            boolean z = this.f56369a;
            C20947d dVar = this.f56370b;
            boolean z2 = this.f56371c;
            return "ValueUpdate(updated=" + z + ", field=" + dVar + ", checkUpdates=" + z2 + ")";
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ C20949e(boolean z, C20947d dVar, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, dVar, (i & 4) != 0 ? false : z2);
        }
    }
}
