package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints;

import android.os.Bundle;
import androidx.lifecycle.C1644x;
import b41.C31128a;
import c41.C31270e;
import com.github.mikephil.charting.utils.Utils;
import ed1.C40749p;
import ed1.C40754t;
import ed1.C40762x;
import et0.C31803f;
import et0.C31804g;
import et0.C31805h;
import et0.C31806i;
import et0.C31807j;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41238w;
import java.math.BigDecimal;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37223a;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.C32936b;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.C32944c;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.ExchangePointsData;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p380ck.C10464h;
import ue1.C43075l;
import ue1.C43079p;
import xs0.C39851e;
import xs0.C39890z;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel */
public final class ExchangeMrPointsToPlusViewModel$ViewModel extends C21481a implements C31803f, C31804g {

    /* renamed from: k */
    public static final C32923c f80779k = new C32923c((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C39851e f80780d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C1644x f80781e = new C1644x();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C1644x f80782f = new C1644x();

    /* renamed from: g */
    private final C1644x f80783g = new C1644x();

    /* renamed from: h */
    private final C1644x f80784h = new C1644x(new C37223a(Boolean.FALSE));
    /* access modifiers changed from: private */

    /* renamed from: i */
    public BigDecimal f80785i = new BigDecimal(Utils.DOUBLE_EPSILON);
    /* access modifiers changed from: private */

    /* renamed from: j */
    public BigDecimal f80786j = new BigDecimal(Utils.DOUBLE_EPSILON);

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel$a */
    static final class C32920a extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39890z f80787d;

        /* renamed from: e */
        final /* synthetic */ ExchangeMrPointsToPlusViewModel$ViewModel f80788e;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel$a$a */
        static final class C32921a extends C41537m implements C43079p {

            /* renamed from: d */
            final /* synthetic */ ExchangeMrPointsToPlusViewModel$ViewModel f80789d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C32921a(ExchangeMrPointsToPlusViewModel$ViewModel exchangeMrPointsToPlusViewModel$ViewModel) {
                super(2);
                this.f80789d = exchangeMrPointsToPlusViewModel$ViewModel;
            }

            /* renamed from: a */
            public final C32924d invoke(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
                C41536l.m120489i(bigDecimal, "amex");
                C41536l.m120489i(bigDecimal2, "plus");
                this.f80789d.f80785i = bigDecimal;
                this.f80789d.f80786j = bigDecimal2;
                return this.f80789d.m97162pw(bigDecimal, bigDecimal2);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32920a(C39890z zVar, ExchangeMrPointsToPlusViewModel$ViewModel exchangeMrPointsToPlusViewModel$ViewModel) {
            super(1);
            this.f80787d = zVar;
            this.f80788e = exchangeMrPointsToPlusViewModel$ViewModel;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final C32924d m97181c(C43079p pVar, Object obj, Object obj2) {
            C41536l.m120489i(pVar, "$tmp0");
            return (C32924d) pVar.invoke(obj, obj2);
        }

        /* renamed from: b */
        public final C40754t invoke(Integer num) {
            C41536l.m120489i(num, "requestCode");
            C40762x T = C40762x.m118154T(this.f80787d.mo93589a("AMEX"), this.f80787d.mo93589a("PLUS"), new C32935a(new C32921a(this.f80788e)));
            C41536l.m120488h(T, "@HiltViewModel\n    class… = \"PLUS\"\n        }\n    }");
            return C32343x.m95462k1(C31270e.m92880i(T, num.intValue()));
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel$b */
    static final class C32922b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusViewModel$ViewModel f80790d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32922b(ExchangeMrPointsToPlusViewModel$ViewModel exchangeMrPointsToPlusViewModel$ViewModel) {
            super(1);
            this.f80790d = exchangeMrPointsToPlusViewModel$ViewModel;
        }

        /* renamed from: a */
        public final void mo74803a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                C32343x.m95397J0(this.f80790d, "mr", (String) null, "mr_to_plus_page", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
                this.f80790d.f80781e.mo4823o(new C32936b.C32937a((C32924d) aVar.mo71340a()));
            } else if (aVar instanceof C31128a.C31130b) {
                this.f80790d.f80781e.mo4823o(C32936b.C32941e.f80815a);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f80790d.f80781e.mo4823o(C32936b.C32938b.f80810a);
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74803a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel$c */
    public static final class C32923c {
        private C32923c() {
        }

        public /* synthetic */ C32923c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel$d */
    public static final class C32924d {

        /* renamed from: a */
        private final BigDecimal f80791a;

        /* renamed from: b */
        private final BigDecimal f80792b;

        public C32924d(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
            this.f80791a = bigDecimal;
            this.f80792b = bigDecimal2;
        }

        /* renamed from: a */
        public final String mo74804a() {
            BigDecimal bigDecimal = this.f80791a;
            String F = C32343x.m95388F("text.MR.to.PLUS.exchange.points", new Object[0]);
            BigDecimal bigDecimal2 = this.f80792b;
            String F2 = C32343x.m95388F("text.MR.to.PLUS.exchange.points", new Object[0]);
            return "1₾ = " + bigDecimal + " MR " + F + " <br> 1₾ = " + bigDecimal2 + " PLUS " + F2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C32924d)) {
                return false;
            }
            C32924d dVar = (C32924d) obj;
            return C41536l.m120484d(this.f80791a, dVar.f80791a) && C41536l.m120484d(this.f80792b, dVar.f80792b);
        }

        public int hashCode() {
            BigDecimal bigDecimal = this.f80791a;
            int i = 0;
            int hashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
            BigDecimal bigDecimal2 = this.f80792b;
            if (bigDecimal2 != null) {
                i = bigDecimal2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            BigDecimal bigDecimal = this.f80791a;
            BigDecimal bigDecimal2 = this.f80792b;
            return "Points(amex=" + bigDecimal + ", plus=" + bigDecimal2 + ")";
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.activity.exchangePlusPoints.ExchangeMrPointsToPlusViewModel$ViewModel$e */
    static final class C32925e extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ ExchangeMrPointsToPlusViewModel$ViewModel f80793d;

        /* renamed from: e */
        final /* synthetic */ String f80794e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C32925e(ExchangeMrPointsToPlusViewModel$ViewModel exchangeMrPointsToPlusViewModel$ViewModel, String str) {
            super(1);
            this.f80793d = exchangeMrPointsToPlusViewModel$ViewModel;
            this.f80794e = str;
        }

        /* renamed from: a */
        public final void mo74808a(C31128a aVar) {
            if (aVar instanceof C31128a.C31131c) {
                this.f80793d.f80781e.mo4823o(new C32936b.C32939c(false));
                C37224b.m109965d(this.f80793d.f80782f, new C32944c.C32946b(ExchangeMrPointsToPlusViewModel$ViewModel.m97164uw(this.f80793d, this.f80794e, 0, (BigDecimal) null, 6, (Object) null)));
                C32343x.m95397J0(this.f80793d, "mr", (String) null, "conversion_mr_to_plus", C10464h.C10465a.FACEBOOKANDFIREBASE, (Bundle) null, 18, (Object) null);
            } else if (aVar instanceof C31128a.C31129a) {
                this.f80793d.f80781e.mo4823o(new C32936b.C32939c(false));
                this.f80793d.f80781e.mo4823o(new C32936b.C32937a(new C32924d(this.f80793d.f80785i, this.f80793d.f80786j)));
                C37224b.m109965d(this.f80793d.f80782f, new C32944c.C32945a(((C31128a.C31129a) aVar).mo71342c()));
            } else if (aVar instanceof C31128a.C31130b) {
                this.f80793d.f80781e.mo4823o(new C32936b.C32939c(true));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74808a((C31128a) obj);
            return C41238w.f97225a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExchangeMrPointsToPlusViewModel$ViewModel(C39890z zVar, C39851e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(zVar, "getMrAndPlusPointsRateUseCase");
        C41536l.m120489i(eVar, "convertMrPointsUseCase");
        this.f80780d = eVar;
        C41205b F0 = C40749p.m118047l0(onInit(), onRefresh()).mo94989L0(new C31806i(new C32920a(zVar, this))).mo94981F0(new C31807j(new C32922b(this)));
        C41536l.m120488h(F0, "merge(onInit(), onRefres…          }\n            }");
        bindToLifecycle(F0);
    }

    /* renamed from: Aw */
    private final void m97149Aw(ExchangePointsData exchangePointsData) {
        this.f80781e.mo4823o(new C32936b.C32940d(exchangePointsData.mo74980d(), exchangePointsData.mo74982e(), exchangePointsData.mo74979b()));
    }

    /* access modifiers changed from: private */
    /* renamed from: gw */
    public static final C40754t m97153gw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        return (C40754t) lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: hw */
    public static final void m97154hw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: pw */
    public final C32924d m97162pw(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        return new C32924d(bigDecimal, bigDecimal2);
    }

    /* renamed from: tw */
    private final ExchangePointsData m97163tw(String str, int i, BigDecimal bigDecimal) {
        BigDecimal bigDecimal2 = new BigDecimal(str);
        BigDecimal multiply = bigDecimal2.multiply(bigDecimal);
        C41536l.m120488h(multiply, "this.multiply(other)");
        BigDecimal divide = multiply.divide(this.f80786j, i, 1);
        BigDecimal divide2 = bigDecimal2.divide(this.f80785i, i, 1);
        String bigDecimal3 = bigDecimal2.toString();
        C41536l.m120488h(bigDecimal3, "inputMrDecimal.toString()");
        String bigDecimal4 = divide2.toString();
        C41536l.m120488h(bigDecimal4, "mrPointsInGel.toString()");
        String bigDecimal5 = multiply.toString();
        C41536l.m120488h(bigDecimal5, "plusPoints.toString()");
        String bigDecimal6 = divide.toString();
        C41536l.m120488h(bigDecimal6, "plusPointsInGel.toString()");
        return new ExchangePointsData(bigDecimal3, bigDecimal4, bigDecimal5, bigDecimal6);
    }

    /* renamed from: uw */
    static /* synthetic */ ExchangePointsData m97164uw(ExchangeMrPointsToPlusViewModel$ViewModel exchangeMrPointsToPlusViewModel$ViewModel, String str, int i, BigDecimal bigDecimal, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 2;
        }
        if ((i2 & 4) != 0) {
            bigDecimal = new BigDecimal(C32343x.m95388F("text.MR.to.PLUS.exchange.rate", new Object[0]));
        }
        return exchangeMrPointsToPlusViewModel$ViewModel.m97163tw(str, i, bigDecimal);
    }

    /* access modifiers changed from: private */
    /* renamed from: zw */
    public static final void m97165zw(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: l */
    public void mo72243l() {
        if (!(this.f80781e.mo4814f() instanceof C32936b.C32939c)) {
            C37224b.m109962a(this.f80783g);
        }
    }

    /* renamed from: qw */
    public C1644x mo72246X() {
        return this.f80783g;
    }

    /* renamed from: rw */
    public C1644x mo72247na() {
        return this.f80782f;
    }

    /* renamed from: sw */
    public C1644x mo72249u5() {
        return this.f80781e;
    }

    /* renamed from: uq */
    public void mo72244uq(String str) {
        boolean z;
        C41536l.m120489i(str, "inputMr");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C32343x.m95397J0(this, "mr", (String) null, "mr_to_plus_page_exchange_button_click", C10464h.C10465a.FIREBASE, (Bundle) null, 18, (Object) null);
            C41205b F0 = C31270e.m92880i(C32343x.m95465l1(this.f80780d.mo93560a(Double.parseDouble(str))), -1).mo94981F0(new C31805h(new C32925e(this, str)));
            C41536l.m120488h(F0, "override fun onExchangeB…)\n            }\n        }");
            bindToLifecycle(F0);
            return;
        }
        this.f80781e.mo4823o(C32936b.C32942f.f80816a);
    }

    /* renamed from: vw */
    public final C31803f mo74797vw() {
        return this;
    }

    /* renamed from: wg */
    public void mo72245wg(String str) {
        boolean z;
        String str2;
        C41536l.m120489i(str, "text");
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.f80781e.mo4823o(new C32936b.C32940d((String) null, (String) null, (String) null, 7, (DefaultConstructorMarker) null));
        } else if (str.length() == 2) {
            if (str.charAt(0) != '0' || str.charAt(1) == '0' || C40440x.m117137L(str, '.', false, 2, (Object) null)) {
                str2 = str;
            } else {
                String substring = str.substring(1);
                C41536l.m120488h(substring, "this as java.lang.String).substring(startIndex)");
                this.f80781e.mo4826r(new C32936b.C32943g(substring));
                str2 = substring;
                m97149Aw(m97164uw(this, str2, 0, (BigDecimal) null, 6, (Object) null));
            }
            if (str2.charAt(0) == '0' && str.charAt(1) == '0') {
                this.f80781e.mo4826r(new C32936b.C32943g(BankApiResponse.SUCCESSFUL_RESPONSE_CODE));
                m97149Aw(m97164uw(this, BankApiResponse.SUCCESSFUL_RESPONSE_CODE, 0, (BigDecimal) null, 6, (Object) null));
                return;
            }
            m97149Aw(m97164uw(this, str2, 0, (BigDecimal) null, 6, (Object) null));
        } else {
            m97149Aw(m97164uw(this, str, 0, (BigDecimal) null, 6, (Object) null));
        }
    }

    /* renamed from: ww */
    public final C31804g mo74798ww() {
        return this;
    }

    /* renamed from: xw */
    public C1644x mo72248rd() {
        return this.f80784h;
    }

    /* renamed from: yw */
    public void mo74800yw(boolean z) {
        C37224b.m109966e(this.f80784h, Boolean.valueOf(z));
    }
}
