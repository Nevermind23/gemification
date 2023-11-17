package xx0;

import af1.C40303i;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0218d;
import fx0.C32023c;
import g91.C32289b0;
import g91.C32343x;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import jx0.C36838t;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import lx0.C37179d;
import ox0.C37833c;
import p341ge.bog.designsystem.components.creditcardsmallpicker.CreditCardSmallPickerView;
import p341ge.bog.mobilebank.payments.domain.model.CardImage;
import p341ge.bog.mobilebank.payments.domain.model.PaymentCard;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import s31.C38421a;
import vx0.C39491a;

/* renamed from: xx0.b */
public final class C39921b extends C39491a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C36838t f94699b;

    /* renamed from: c */
    private boolean f94700c;

    /* renamed from: d */
    private boolean f94701d = true;

    /* renamed from: e */
    private int f94702e = -1;

    /* renamed from: f */
    private C39922a f94703f;

    /* renamed from: g */
    private String f94704g;

    /* renamed from: h */
    private List f94705h;

    /* renamed from: i */
    private boolean f94706i = true;

    /* renamed from: xx0.b$a */
    private final class C39922a implements View.OnClickListener {

        /* renamed from: i */
        static final /* synthetic */ C40303i[] f94707i = {C41520a0.m120439e(new C41539o(C39922a.class, "selectedCard", "getSelectedCard()Lge/bog/mobilebank/payments/domain/model/PaymentCard;", 0))};

        /* renamed from: d */
        private final List f94708d;

        /* renamed from: e */
        private boolean f94709e;

        /* renamed from: f */
        private final long f94710f = 500;

        /* renamed from: g */
        private final C41555e f94711g;

        /* renamed from: h */
        final /* synthetic */ C39921b f94712h;

        /* renamed from: xx0.b$a$a */
        public static final class C39923a extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C39921b f94713a;

            /* renamed from: b */
            final /* synthetic */ C39922a f94714b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C39923a(Object obj, C39921b bVar, C39922a aVar) {
                super(obj);
                this.f94713a = bVar;
                this.f94714b = aVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41238w wVar;
                String str;
                String str2;
                String a;
                C41536l.m120489i(iVar, "property");
                PaymentCard paymentCard = (PaymentCard) obj2;
                PaymentCard paymentCard2 = (PaymentCard) obj;
                CreditCardSmallPickerView creditCardSmallPickerView = this.f94713a.m115738A().f88903e;
                if (paymentCard != null) {
                    CardImage h = paymentCard.mo80153h();
                    if (h == null || (a = h.mo80115a()) == null) {
                        str = null;
                    } else {
                        str = C32289b0.m95091c(a);
                    }
                    Integer valueOf = Integer.valueOf(C32023c.f78829b);
                    BigDecimal a2 = paymentCard.mo80145a();
                    if (a2 != null) {
                        str2 = C32343x.m95408P(a2, "GEL");
                    } else {
                        str2 = null;
                    }
                    creditCardSmallPickerView.setCreditCard(new CreditCardSmallPickerView.C13279b.C13281b(str, valueOf, str2, paymentCard.mo80158l(), String.valueOf(paymentCard.mo80147d())));
                    C39922a aVar = this.f94714b;
                    String f = paymentCard.mo80151f();
                    if (f == null) {
                        f = C32343x.m95388F(paymentCard.mo80152g(), new Object[0]);
                    }
                    creditCardSmallPickerView.mo35468h(aVar.m115764c(f));
                    wVar = C41238w.f97225a;
                } else {
                    wVar = null;
                }
                if (wVar == null) {
                    creditCardSmallPickerView.setCreditCard(CreditCardSmallPickerView.C13279b.C13280a.f39265a);
                    creditCardSmallPickerView.mo35468h(C39922a.m115765d(this.f94714b, (String) null, 1, (Object) null));
                }
            }
        }

        public C39922a(C39921b bVar, List list) {
            C41536l.m120489i(list, "cards");
            this.f94712h = bVar;
            this.f94708d = list;
            C41551a aVar = C41551a.f97718a;
            this.f94711g = new C39923a((Object) null, bVar, this);
            bVar.m115738A().f88903e.setOnClickListener(this);
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final CreditCardSmallPickerView.C13282c m115764c(String str) {
            return new CreditCardSmallPickerView.C13282c(C34646b.m101752f(C37833c.f90838a.mo91156r(), (Context) null, 1, (Object) null), str);
        }

        /* renamed from: d */
        static /* synthetic */ CreditCardSmallPickerView.C13282c m115765d(C39922a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = "";
            }
            return aVar.m115764c(str);
        }

        /* renamed from: e */
        private final PaymentCard m115766e() {
            return (PaymentCard) this.f94711g.getValue(this, f94707i[0]);
        }

        /* renamed from: h */
        public static /* synthetic */ void m115767h(C39922a aVar, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            aVar.mo93652g(str);
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m115768i(C39922a aVar) {
            C41536l.m120489i(aVar, "this$0");
            aVar.f94709e = false;
        }

        /* renamed from: j */
        private final void m115769j(PaymentCard paymentCard) {
            this.f94711g.setValue(this, f94707i[0], paymentCard);
        }

        /* renamed from: f */
        public final Long mo93651f() {
            PaymentCard e = m115766e();
            if (e != null) {
                return Long.valueOf(e.mo80147d());
            }
            return null;
        }

        /* renamed from: g */
        public final void mo93652g(String str) {
            LinearLayout c;
            if (!this.f94709e) {
                this.f94709e = true;
                C39927f a = C39927f.f94720I.mo93661a(this.f94708d, mo93651f(), this.f94712h.mo93645B(), str);
                Context context = this.f94712h.m115738A().mo3946b().getContext();
                C41536l.m120487g(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                a.mo4576A1(((C0218d) context).getSupportFragmentManager(), (String) null);
            }
            C36838t y = this.f94712h.f94699b;
            if (y == null || (c = y.mo3946b()) == null) {
                this.f94709e = false;
            } else {
                c.postDelayed(new C39920a(this), this.f94710f);
            }
        }

        /* renamed from: k */
        public final void mo93653k(Long l) {
            Object obj;
            boolean z;
            Iterator it = this.f94708d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                long d = ((PaymentCard) obj).mo80147d();
                if (l != null && d == l.longValue()) {
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
            m115769j((PaymentCard) obj);
        }

        public void onClick(View view) {
            C41536l.m120489i(view, "v");
            if (this.f94712h.mo93646C()) {
                m115767h(this, (String) null, 1, (Object) null);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final C36838t m115738A() {
        C36838t tVar = this.f94699b;
        C41536l.m120486f(tVar);
        return tVar;
    }

    /* renamed from: z */
    private final List m115741z() {
        List list = this.f94705h;
        if (list == null) {
            list = C41341q.m119907j();
        }
        this.f94703f = new C39922a(this, list);
        return list;
    }

    /* renamed from: B */
    public final boolean mo93645B() {
        return this.f94706i;
    }

    /* renamed from: C */
    public boolean mo93646C() {
        return this.f94701d;
    }

    /* renamed from: D */
    public final List mo93647D() {
        return this.f94705h;
    }

    /* renamed from: E */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94699b = C36838t.m109165d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        this.f94704g = mo93122g();
        mo93137v(!bVar.mo80328p());
        LinearLayout c = m115738A().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    /* renamed from: F */
    public final void mo93649F(boolean z) {
        this.f94706i = z;
    }

    /* renamed from: G */
    public final void mo93650G(List list) {
        Object obj;
        String l;
        this.f94705h = list;
        m115741z();
        String str = null;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((PaymentCard) obj).mo80158l()) {
                    break;
                }
            }
            PaymentCard paymentCard = (PaymentCard) obj;
            if (!(paymentCard == null || (l = Long.valueOf(paymentCard.mo80147d()).toString()) == null)) {
                str = l;
                this.f94704g = str;
                mo93136u(str);
            }
        }
        boolean z = false;
        if (list != null && list.size() == 1) {
            z = true;
        }
        if (z) {
            str = String.valueOf(((PaymentCard) C41358y.m120007W(list)).mo80147d());
        }
        this.f94704g = str;
        mo93136u(str);
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94702e;
    }

    /* renamed from: g */
    public String mo93122g() {
        C39922a aVar = this.f94703f;
        return String.valueOf(aVar != null ? aVar.mo93651f() : null);
    }

    /* renamed from: h */
    public Object mo93123h() {
        C39922a aVar = this.f94703f;
        if (aVar != null) {
            return aVar.mo93651f();
        }
        return null;
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94700c;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        if (mo93124i()) {
            C39922a aVar = this.f94703f;
            return (aVar != null ? aVar.mo93651f() : null) != null;
        }
    }

    /* renamed from: m */
    public void mo93128m(C37179d dVar, List list, C38421a aVar) {
        C41536l.m120489i(dVar, "debt");
        C41536l.m120489i(list, "debtInput");
        C41536l.m120489i(aVar, "oldConfig");
        mo93137v(true);
        mo93131p();
    }

    /* renamed from: p */
    public void mo93131p() {
        String str;
        try {
            str = this.f94704g;
        } catch (Exception unused) {
            str = null;
        }
        mo93136u(str);
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
        try {
            C39922a aVar = this.f94703f;
            if (aVar != null) {
                aVar.mo93653k(Long.valueOf(Long.parseLong(String.valueOf(obj))));
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94702e = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        CreditCardSmallPickerView creditCardSmallPickerView;
        float f;
        this.f94701d = z;
        C36838t tVar = this.f94699b;
        if (tVar != null) {
            creditCardSmallPickerView = tVar.f88903e;
        } else {
            creditCardSmallPickerView = null;
        }
        if (creditCardSmallPickerView != null) {
            if (z) {
                f = 1.0f;
            } else {
                f = 0.6f;
            }
            creditCardSmallPickerView.setAlpha(f);
        }
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        C39922a aVar = this.f94703f;
        if (aVar != null) {
            aVar.mo93653k(str != null ? Long.valueOf(Long.parseLong(str)) : null);
        }
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        LinearLayout c;
        this.f94700c = z;
        C36838t tVar = this.f94699b;
        if (tVar != null && (c = tVar.mo3946b()) != null) {
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }
    }

    /* renamed from: w */
    public boolean mo93138w() {
        Long l;
        boolean z;
        C39922a aVar;
        if (!mo93124i()) {
            return true;
        }
        C39922a aVar2 = this.f94703f;
        if (aVar2 != null) {
            l = aVar2.mo93651f();
        } else {
            l = null;
        }
        if (l != null) {
            z = true;
        } else {
            z = false;
        }
        if (mo93124i() && !z && (aVar = this.f94703f) != null) {
            aVar.mo93652g(C34646b.m101752f(C37833c.f90838a.mo91152n(), (Context) null, 1, (Object) null));
        }
        if (z) {
            return true;
        }
        return false;
    }
}
