package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel;

import android.content.Intent;
import androidx.lifecycle.C1607m0;
import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import b41.C31128a;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40749p;
import ed1.C40754t;
import ee1.C40765a;
import g91.C32300e0;
import g91.C32343x;
import g91.C32359z0;
import hd1.C41204a;
import he1.C41238w;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nt0.C37459a;
import nt0.C37460b;
import nt0.C37461c;
import ot0.C37761j0;
import ot0.C37763k0;
import ot0.C37765l0;
import ot0.C37767m0;
import ot0.C37769n0;
import ot0.C37771o0;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusPlusUiModel;
import p341ge.bog.mobilebank.cleanarch.loyaltyprograms.presentation.model.BonusWrapperUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.data.entity.PlusPointTransferParams;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.C33154e;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p341ge.bog.mobilebank.rest.model.otpparameter.OtpParams;
import p366bk.C10328q;
import p716br.C19400a;
import p895sy.C28290a;
import p895sy.C28291b;
import p906ty.C28530h;
import p961yy.C30123a;
import pc0.C27494a;
import ue1.C43075l;
import ue1.C43079p;
import xs0.C39873m0;
import xs0.C39881t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel */
public final class PlusPointsTransferViewModel$ViewModel extends C21481a implements C33154e, C37761j0 {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C28290a f81170d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C39873m0 f81171e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C28291b f81172f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final C39881t f81173g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C30123a f81174h;

    /* renamed from: i */
    private final C27494a f81175i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C37460b f81176j = new C37460b((String) null, (String) null, (Integer) null, (String) null, 15, (DefaultConstructorMarker) null);

    /* renamed from: k */
    private final C33154e f81177k = this;

    /* renamed from: l */
    private final C37761j0 f81178l = this;

    /* renamed from: m */
    private final C1644x f81179m;

    /* renamed from: n */
    private final LiveData f81180n;

    /* renamed from: o */
    private final C1644x f81181o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1644x f81182p;

    /* renamed from: q */
    private final C1644x f81183q;

    /* renamed from: r */
    private final C1644x f81184r;

    /* renamed from: s */
    private final C1644x f81185s;

    /* renamed from: t */
    private final C40765a f81186t;

    /* renamed from: u */
    private final C40765a f81187u;

    /* renamed from: v */
    private final C40765a f81188v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public BonusWrapperUiModel f81189w;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$a */
    static final class C33135a extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C33135a f81190d = new C33135a();

        C33135a() {
            super(1);
        }

        /* renamed from: a */
        public final Integer invoke(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            return 1;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$b */
    static final class C33136b extends C41537m implements C43079p {

        /* renamed from: d */
        public static final C33136b f81191d = new C33136b();

        C33136b() {
            super(2);
        }

        /* renamed from: a */
        public final Integer invoke(Integer num, C41238w wVar) {
            C41536l.m120489i(num, "requestCode");
            C41536l.m120489i(wVar, "<anonymous parameter 1>");
            return num;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$c */
    static final class C33137c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81192d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33137c(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81192d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            return C31270e.m92879h(C28290a.m86927b(this.f81192d.f81170d, false, 1, (Object) null), num.intValue());
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$d */
    static final class C33138d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81193d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33138d(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81193d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(String str) {
            C41536l.m120489i(str, "idNumber");
            C40749p O = this.f81193d.f81173g.mo93583a(str).mo95075O();
            C41536l.m120488h(O, "getClientInitials(idNumb…          .toObservable()");
            return C31270e.m92879h(O, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$e */
    static final class C33139e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81194d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33139e(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81194d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C40754t invoke(HashMap hashMap) {
            C41536l.m120489i(hashMap, "it");
            C40749p f = this.f81194d.f81171e.mo93575a(hashMap).mo94897f(C40749p.m118043h0(C41238w.f97225a));
            C41536l.m120488h(f, "transferPlusPoints(it).a…en(Observable.just(Unit))");
            return C31270e.m92879h(f, -1);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$f */
    static final class C33140f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81195d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33140f(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81195d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C31128a.C31129a aVar2;
            C41536l.m120488h(aVar, "it");
            PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel = this.f81195d;
            try {
                if (aVar instanceof C31128a.C31131c) {
                    plusPointsTransferViewModel$ViewModel.f81189w = plusPointsTransferViewModel$ViewModel.f81174h.mo70417h((C28530h) ((C31128a.C31131c) aVar).mo71340a());
                    return new C31128a.C31131c(C41238w.f97225a, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    return aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    return new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$g */
    static final class C33141g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81196d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33141g(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81196d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C31128a.C31129a aVar2;
            if (aVar instanceof C31128a.C31129a) {
                this.f81196d.f81182p.mo4823o(this.f81196d.f81176j);
            }
            C41536l.m120488h(aVar, "it");
            PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel = this.f81196d;
            try {
                if (aVar instanceof C31128a.C31131c) {
                    plusPointsTransferViewModel$ViewModel.f81176j = C37460b.m110361b(plusPointsTransferViewModel$ViewModel.f81176j, (String) null, (String) ((C31128a.C31131c) aVar).mo71340a(), (Integer) null, (String) null, 13, (Object) null);
                    plusPointsTransferViewModel$ViewModel.f81182p.mo4823o(plusPointsTransferViewModel$ViewModel.f81176j);
                    return new C31128a.C31131c(C41238w.f97225a, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    return aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    return new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$h */
    static final class C33142h extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81197d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33142h(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81197d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final C31128a invoke(C31128a aVar) {
            C31128a.C31129a aVar2;
            C41536l.m120488h(aVar, "result");
            PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel = this.f81197d;
            try {
                if (aVar instanceof C31128a.C31131c) {
                    C41238w wVar = (C41238w) ((C31128a.C31131c) aVar).mo71340a();
                    plusPointsTransferViewModel$ViewModel.f81172f.mo67919a();
                    return new C31128a.C31131c(plusPointsTransferViewModel$ViewModel.f81176j, aVar.mo71341b());
                } else if (aVar instanceof C31128a.C31129a) {
                    aVar2 = new C31128a.C31129a(((C31128a.C31129a) aVar).mo71342c(), aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
                    return aVar2;
                } else if (aVar instanceof C31128a.C31130b) {
                    return new C31128a.C31130b(aVar.mo71341b(), (Object) null, 2, (DefaultConstructorMarker) null);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Throwable th) {
                aVar2 = new C31128a.C31129a(th, aVar.mo71341b(), (Object) null, 4, (DefaultConstructorMarker) null);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$i */
    static final class C33143i extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81198d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33143i(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81198d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo75280a(String str) {
            C41536l.m120489i(str, "it");
            PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel = this.f81198d;
            plusPointsTransferViewModel$ViewModel.f81176j = C37460b.m110361b(plusPointsTransferViewModel$ViewModel.f81176j, str, (String) null, (Integer) null, (String) null, 14, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo75280a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$j */
    static final class C33144j extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81199d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33144j(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81199d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo75281a(String str) {
            C41536l.m120489i(str, "it");
            PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel = this.f81199d;
            plusPointsTransferViewModel$ViewModel.f81176j = C37460b.m110361b(plusPointsTransferViewModel$ViewModel.f81176j, (String) null, (String) null, C40438v.m117098j(str), (String) null, 11, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo75281a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.viewmodel.PlusPointsTransferViewModel$ViewModel$k */
    static final class C33145k extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ PlusPointsTransferViewModel$ViewModel f81200d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C33145k(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel) {
            super(1);
            this.f81200d = plusPointsTransferViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo75282a(String str) {
            C41536l.m120489i(str, "it");
            PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel = this.f81200d;
            plusPointsTransferViewModel$ViewModel.f81176j = C37460b.m110361b(plusPointsTransferViewModel$ViewModel.f81176j, (String) null, (String) null, (Integer) null, str, 7, (Object) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo75282a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PlusPointsTransferViewModel$ViewModel(C28290a aVar, C39873m0 m0Var, C28291b bVar, C39881t tVar, C30123a aVar2, C27494a aVar3) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(aVar, "getBonuses");
        C41536l.m120489i(m0Var, "transferPlusPoints");
        C41536l.m120489i(bVar, "refreshBonuses");
        C41536l.m120489i(tVar, "getClientInitials");
        C41536l.m120489i(aVar2, "bonusesMapper");
        C41536l.m120489i(aVar3, "otpParamsMapBuilder");
        this.f81170d = aVar;
        this.f81171e = m0Var;
        this.f81172f = bVar;
        this.f81173g = tVar;
        this.f81174h = aVar2;
        this.f81175i = aVar3;
        C1644x xVar = new C1644x();
        this.f81179m = xVar;
        this.f81180n = C1607m0.m5655c(xVar, new C33140f(this));
        this.f81181o = new C1644x();
        this.f81182p = new C1644x();
        this.f81183q = new C1644x();
        C1644x xVar2 = new C1644x();
        this.f81184r = xVar2;
        C1644x xVar3 = new C1644x();
        this.f81185s = xVar3;
        C40765a h1 = C40765a.m118198h1();
        C41536l.m120488h(h1, "create<Unit>()");
        this.f81186t = h1;
        C40765a h12 = C40765a.m118198h1();
        C41536l.m120488h(h12, "create<String>()");
        this.f81187u = h12;
        C40765a h13 = C40765a.m118198h1();
        C41536l.m120488h(h13, "create<HashMap<String, Any>>()");
        this.f81188v = h13;
        C40749p L0 = C40749p.m118049m0(h1.mo95026k0(new C37763k0(C33135a.f81190d)), onInit(), onRefresh().mo95014Y0(h1, new C37765l0(C33136b.f81191d))).mo94989L0(new C37767m0(new C33137c(this)));
        C41536l.m120488h(L0, "merge(\n                g…equestCode)\n            }");
        bindToLifecycle(C31270e.m92876e(L0, xVar));
        C40749p L02 = h12.mo94989L0(new C37769n0(new C33138d(this)));
        C41536l.m120488h(L02, "getClientInitialsSubject…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(L02, xVar3));
        C40749p L03 = h13.mo94989L0(new C37771o0(new C33139e(this)));
        C41536l.m120488h(L03, "transferPointsSubject.sw…QUEST_CODE)\n            }");
        bindToLifecycle(C31270e.m92876e(L03, xVar2));
    }

    /* renamed from: Bw */
    private final List m97700Bw(double d) {
        String str;
        WizardObject[] wizardObjectArr = new WizardObject[3];
        C19400a aVar = C19400a.f53623a;
        int i = C10328q.f28965q0;
        String h0 = C32343x.m95452h0(i, new Object[0]);
        String h02 = C32343x.m95452h0(i, new Object[0]);
        String e = this.f81176j.mo90595e();
        String str2 = "";
        if (e == null) {
            e = str2;
        }
        WizardObject validatePattern = aVar.mo47627d(h0, h02, "ID_NUMBER", e).setTextLimit(11).setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT).setValidatePattern("\\d{11}");
        C41536l.m120488h(validatePattern, "WizardObjectUtils.getTex…ttern(\"\\\\d{$PIN_LENGTH}\")");
        wizardObjectArr[0] = validatePattern;
        String h03 = C32343x.m95452h0(C10328q.bonus_transfer_amount_to_transfer, new Object[0]);
        int i2 = C10328q.bonus_available_points;
        String A = C32359z0.m95530A((long) d);
        C41536l.m120488h(A, "formatBonusPoint(points.toLong())");
        String h04 = C32343x.m95452h0(i2, A);
        Integer f = this.f81176j.mo90597f();
        if (f == null || (str = f.toString()) == null) {
            str = str2;
        }
        WizardObject inputType = aVar.mo47627d(h03, h04, "POINTS", str).setInputType(BogInputLayout.INPUT_TYPE_NUM_DIGIT);
        C41536l.m120488h(inputType, "WizardObjectUtils.getTex…ype(INPUT_TYPE_NUM_DIGIT)");
        wizardObjectArr[1] = inputType;
        int i3 = C10328q.f28920B0;
        String h05 = C32343x.m95452h0(i3, new Object[0]);
        String h06 = C32343x.m95452h0(i3, new Object[0]);
        String d2 = this.f81176j.mo90594d();
        if (d2 != null) {
            str2 = d2;
        }
        wizardObjectArr[2] = aVar.mo47627d(h05, h06, "COMMENT", str2);
        return C41341q.m119910m(wizardObjectArr);
    }

    /* renamed from: Td */
    private final void m97701Td(String str) {
        if (str == null || str.length() != 11) {
            this.f81182p.mo4823o(C37460b.m110361b(this.f81176j, (String) null, (String) null, (Integer) null, (String) null, 13, (Object) null));
        } else {
            this.f81187u.onNext(str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: iw */
    public static final Integer m97707iw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (Integer) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: jw */
    public static final Integer m97708jw(C43079p pVar, Object obj, Object obj2) {
        C41536l.m120489i(pVar, "$tmp0");
        return (Integer) pVar.invoke(obj, obj2);
    }

    /* access modifiers changed from: private */
    /* renamed from: kw */
    public static final C40754t m97709kw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: lw */
    public static final C40754t m97710lw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: mw */
    public static final C40754t m97711mw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* renamed from: xw */
    private final PlusPointTransferParams m97721xw(String str, String str2, String str3) {
        C37460b bVar = this.f81176j;
        return new PlusPointTransferParams(String.valueOf(bVar.mo90595e()), String.valueOf(bVar.mo90597f()), String.valueOf(bVar.mo90594d()), str, str2, str3, (String) null, 64, (DefaultConstructorMarker) null);
    }

    /* renamed from: yw */
    static /* synthetic */ PlusPointTransferParams m97722yw(PlusPointsTransferViewModel$ViewModel plusPointsTransferViewModel$ViewModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        return plusPointsTransferViewModel$ViewModel.m97721xw(str, str2, str3);
    }

    /* renamed from: Aw */
    public final C37761j0 mo75259Aw() {
        return this.f81178l;
    }

    /* renamed from: Eo */
    public void mo75260Eo(Intent intent) {
        C41536l.m120489i(intent, "data");
        C32343x.m95461k0(intent, "ID_NUMBER", new C33143i(this));
        C32343x.m95461k0(intent, "POINTS", new C33144j(this));
        C32343x.m95461k0(intent, "COMMENT", new C33145k(this));
        m97701Td(this.f81176j.mo90595e());
    }

    /* renamed from: H8 */
    public void mo75261H8(String str, String str2, String str3) {
        if (C32300e0.f79712a.mo72816a(str, str2, str3)) {
            this.f81188v.onNext(mo75271zw(m97721xw(str, str2, str3)));
        } else {
            this.f81183q.mo4823o(C32343x.m95466m(m97722yw(this, (String) null, (String) null, (String) null, 7, (Object) null)));
        }
    }

    /* renamed from: Ni */
    public void mo75262Ni() {
        C33154e.C33155a.m97778a(this);
    }

    /* renamed from: R2 */
    public LiveData mo75263R2() {
        return this.f81183q;
    }

    /* renamed from: Wg */
    public LiveData mo75264Wg() {
        return this.f81180n;
    }

    /* renamed from: Zv */
    public void mo75265Zv(C37459a aVar) {
        double d;
        Double b;
        C41536l.m120489i(aVar, "field");
        C1644x xVar = this.f81181o;
        BonusWrapperUiModel bonusWrapperUiModel = this.f81189w;
        if (bonusWrapperUiModel == null) {
            C41536l.m120506z("bonuses");
            bonusWrapperUiModel = null;
        }
        BonusPlusUiModel g = bonusWrapperUiModel.mo52796g();
        if (g == null || (b = g.mo52760b()) == null) {
            d = Utils.DOUBLE_EPSILON;
        } else {
            d = b.doubleValue();
        }
        xVar.mo4823o(C32343x.m95466m(new C37461c(m97700Bw(d), C41333m.m119776C(C37459a.values(), aVar), this.f81176j.mo90593c())));
    }

    /* renamed from: c5 */
    public LiveData mo75266c5() {
        return this.f81181o;
    }

    /* renamed from: eo */
    public LiveData mo75267eo() {
        return C1607m0.m5655c(this.f81184r, new C33142h(this));
    }

    /* renamed from: f */
    public LiveData mo75268f() {
        return this.f81182p;
    }

    /* renamed from: se */
    public LiveData mo75269se() {
        return C1607m0.m5655c(this.f81185s, new C33141g(this));
    }

    /* renamed from: ww */
    public final C33154e mo75270ww() {
        return this.f81177k;
    }

    /* renamed from: zw */
    public HashMap mo75271zw(OtpParams otpParams) {
        C41536l.m120489i(otpParams, "otpParams");
        return this.f81175i.mo66809a(otpParams);
    }
}
