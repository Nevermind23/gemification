package wx0;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import ay0.C31100a;
import ay0.C31102b;
import by0.C31217a;
import cf1.C40419j;
import dy0.C31622e;
import ed1.C40749p;
import g91.C32290b1;
import g91.C32303f;
import g91.C32343x;
import hd1.C41205b;
import he1.C41217g;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jx0.C36823h;
import jx0.C36837s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37177b;
import lx0.C37179d;
import ox0.C37829b;
import ox0.C37833c;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p547oi.C17199a;
import p547oi.C17201b;
import p603si.C17796a;
import p603si.C17799b;
import p603si.C17809c;
import s31.C38421a;
import s31.C38422b;
import ue1.C43064a;
import ue1.C43075l;
import ux0.C39162n;
import ux0.C39163o;
import vx0.C39491a;
import vx0.C39492b;

/* renamed from: wx0.c */
public final class C39711c extends C39491a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C39163o f94340b;

    /* renamed from: c */
    private C36837s f94341c;

    /* renamed from: d */
    private C37177b f94342d;

    /* renamed from: e */
    private boolean f94343e;

    /* renamed from: f */
    private boolean f94344f = true;

    /* renamed from: g */
    private int f94345g = -1;

    /* renamed from: h */
    private String f94346h;

    /* renamed from: i */
    private boolean f94347i = true;

    /* renamed from: j */
    private String f94348j;

    /* renamed from: k */
    private C41224m f94349k;

    /* renamed from: l */
    private final String f94350l = C32303f.m95198i("GEL", true);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List f94351m = new ArrayList();

    /* renamed from: n */
    private C31100a f94352n;

    /* renamed from: o */
    private final C41217g f94353o = C41219i.m119470b(new C39712a(this));

    /* renamed from: p */
    private final C39716e f94354p = new C39716e(this);

    /* renamed from: q */
    private final C39713b f94355q = new C39713b();

    /* renamed from: wx0.c$a */
    static final class C39712a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39711c f94356d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39712a(C39711c cVar) {
            super(0);
            this.f94356d = cVar;
        }

        /* renamed from: b */
        public final LayerView invoke() {
            return C36823h.m109105d(LayoutInflater.from(this.f94356d.m115325D().mo3946b().getContext()), (ViewGroup) null, false).mo3946b();
        }
    }

    /* renamed from: wx0.c$b */
    public static final class C39713b implements InputFilter {
        C39713b() {
        }

        public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
            CharSequence charSequence2;
            CharSequence charSequence3;
            CharSequence charSequence4;
            if (charSequence != null) {
                charSequence2 = charSequence.subSequence(i, i2);
            } else {
                charSequence2 = null;
            }
            String valueOf = String.valueOf(charSequence2);
            if (spanned != null) {
                charSequence3 = spanned.subSequence(0, i3);
            } else {
                charSequence3 = null;
            }
            if (spanned != null) {
                charSequence4 = spanned.subSequence(i4, spanned.length());
            } else {
                charSequence4 = null;
            }
            if (new C40419j("^[0-9]*(\\.?[0-9]{0,2})?[ ]*₾?$").mo94489f(charSequence3 + valueOf + charSequence4)) {
                return null;
            }
            return "";
        }
    }

    /* renamed from: wx0.c$c */
    static final class C39714c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39711c f94357d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39714c(C39711c cVar) {
            super(1);
            this.f94357d = cVar;
        }

        /* renamed from: a */
        public final void mo93441a(C31217a.C31218a aVar) {
            boolean z;
            this.f94357d.mo93131p();
            C39711c cVar = this.f94357d;
            if (aVar.mo71466a() == 0) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo93137v(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93441a((C31217a.C31218a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wx0.c$d */
    public static final class C39715d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39715d f94358d = new C39715d();

        public C39715d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31217a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31217a.C31218a);
        }
    }

    /* renamed from: wx0.c$e */
    public static final class C39716e implements TextWatcher {

        /* renamed from: d */
        private boolean f94359d;

        /* renamed from: e */
        final /* synthetic */ C39711c f94360e;

        C39716e(C39711c cVar) {
            this.f94360e = cVar;
        }

        /* renamed from: a */
        public final void mo93443a(boolean z) {
            this.f94359d = z;
        }

        public void afterTextChanged(Editable editable) {
            C39162n b;
            if (this.f94360e.mo93124i()) {
                this.f94360e.m115325D().f88901e.mo35919b();
                for (C39492b afterTextChanged : this.f94360e.f94351m) {
                    afterTextChanged.afterTextChanged(editable);
                }
                this.f94360e.m115337R();
                if (this.f94359d && (b = this.f94360e.f94340b.mo92813b()) != null) {
                    b.mo80260o();
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            for (C39492b beforeTextChanged : this.f94360e.f94351m) {
                beforeTextChanged.beforeTextChanged(charSequence, i, i2, i3);
            }
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            for (C39492b onTextChanged : this.f94360e.f94351m) {
                onTextChanged.onTextChanged(charSequence, i, i2, i3);
            }
        }
    }

    public C39711c(C39163o oVar) {
        C41536l.m120489i(oVar, "formContext");
        this.f94340b = oVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final C36837s m115325D() {
        C36837s sVar = this.f94341c;
        C41536l.m120486f(sVar);
        return sVar;
    }

    /* renamed from: F */
    private final View m115326F() {
        Object value = this.f94353o.getValue();
        C41536l.m120488h(value, "<get-fillAmountEndComponent>(...)");
        return (View) value;
    }

    /* renamed from: G */
    private final C17796a m115327G() {
        C17796a aVar = new C17796a((List) null, (C17796a.C17797a) null, 3, (DefaultConstructorMarker) null);
        C17799b.C17805f fVar = C17799b.C17805f.f50686d;
        C37833c cVar = C37833c.f90838a;
        aVar.add(C17809c.m61562a(fVar, C34646b.m101752f(cVar.mo91135U(), (Context) null, 1, (Object) null)));
        BigDecimal bigDecimal = BigDecimal.ZERO;
        C41536l.m120488h(bigDecimal, "ZERO");
        aVar.add(C17809c.m61562a(new C31102b(bigDecimal, this.f94350l), C34646b.m101752f(cVar.mo91136V(), (Context) null, 1, (Object) null)));
        return aVar;
    }

    /* renamed from: H */
    private final boolean m115328H(boolean z) {
        C41224m mVar = this.f94349k;
        if (mVar == null) {
            return true;
        }
        String str = (String) mVar.mo95680f();
        String g = mo93122g();
        if (g == null) {
            g = "";
        }
        boolean f = ((C40419j) mVar.mo95678e()).mo94489f(g);
        if (z && !f) {
            Input input = m115325D().f88901e;
            if (str == null) {
                str = C34646b.m101752f(C37833c.f90838a.mo91138X(), (Context) null, 1, (Object) null);
            }
            input.setInfoText(str);
            m115325D().f88901e.mo35920c();
        }
        return f;
    }

    /* renamed from: I */
    private final void m115329I() {
        C40749p i = this.f94340b.mo92812a().mo94990M(new C39163o.C39164a(C39715d.f94358d)).mo95023i(C31217a.C31218a.class);
        C41536l.m120488h(i, "getElementEventObservabl…s T }.cast(T::class.java)");
        C41205b F0 = i.mo94981F0(new C39710b(new C39714c(this)));
        C41536l.m120488h(F0, "private fun observeEleme…           }.bind()\n    }");
        mo93117b(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final void m115330J(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: L */
    private final void m115331L() {
        m115325D().f88901e.getTextInput().removeTextChangedListener(this.f94354p);
        String str = this.f94346h;
        if (str == null) {
            str = "";
        }
        mo93136u(str);
        m115325D().f88901e.getTextInput().addTextChangedListener(this.f94354p);
    }

    /* renamed from: M */
    private final void m115332M(C33699b bVar) {
        Input input = m115325D().f88901e;
        input.getTextInput().removeTextChangedListener(this.f94354p);
        input.setHintText((CharSequence) C32343x.m95386E(bVar.mo80319g(), bVar.mo80317e(), new Object[0]));
        input.getTextInput().setInputType(8194);
        String str = this.f94350l;
        C41536l.m120488h(str, "amountSuffix");
        input.setSuffix(str);
        input.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
        input.setEndComponentClickListener(new C39709a(this));
        this.f94354p.mo93443a(!bVar.mo80328p());
        mo93135t(bVar.mo80313a());
        this.f94347i = bVar.mo80313a();
        this.f94346h = null;
        String l = bVar.mo80324l();
        if (l != null) {
            mo93136u(C32343x.m95406O(C37829b.m111218e(l), "GEL"));
            this.f94346h = mo93122g();
        }
        input.getTextInput().setFilters((InputFilter[]) new C39713b[]{this.f94355q});
        input.getTextInput().addTextChangedListener(this.f94354p);
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public static final void m115333N(C39711c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        cVar.mo93136u(cVar.f94348j);
    }

    /* renamed from: O */
    private final void m115334O(C33699b bVar) {
        String k = bVar.mo80323k();
        if (k != null) {
            this.f94349k = C41233s.m119492a(new C40419j(k), bVar.mo80315c());
        }
        this.f94352n = new C31100a(m115327G(), (C43075l) null, 2, (DefaultConstructorMarker) null);
        m115325D().f88901e.mo35923e(this.f94352n, false, false, false);
    }

    /* renamed from: P */
    private final void m115335P(CharSequence charSequence) {
        boolean z;
        m115325D().f88901e.mo35919b();
        Input input = m115325D().f88901e;
        String g = mo93122g();
        if (g == null || g.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            charSequence = "";
        }
        input.setInfoText(charSequence);
    }

    /* renamed from: Q */
    static /* synthetic */ void m115336Q(C39711c cVar, CharSequence charSequence, int i, Object obj) {
        if ((i & 1) != 0) {
            charSequence = "";
        }
        cVar.m115335P(charSequence);
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public final void m115337R() {
        boolean z;
        View view;
        Input input = m115325D().f88901e;
        String str = this.f94348j;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || C41536l.m120484d(this.f94348j, mo93122g())) {
            view = null;
        } else {
            view = m115326F();
        }
        input.setEndComponentView(view);
    }

    /* renamed from: E */
    public final C37177b mo93437E() {
        return this.f94342d;
    }

    /* renamed from: K */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94341c = C36837s.m109161d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m115332M(bVar);
        m115329I();
        m115334O(bVar);
        m115336Q(this, (CharSequence) null, 1, (Object) null);
        mo93137v(!bVar.mo80328p());
        LinearLayout c = m115325D().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    /* renamed from: a */
    public void mo93116a(C39492b bVar) {
        boolean z;
        C41536l.m120489i(bVar, "listener");
        this.f94351m.add(bVar);
        String g = mo93122g();
        if (g == null || g.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo93136u(mo93122g());
        }
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94345g;
    }

    /* renamed from: g */
    public String mo93122g() {
        String inputText = m115325D().f88901e.getInputText();
        String str = this.f94350l;
        C41536l.m120488h(str, "amountSuffix");
        return C40439w.m117103B(inputText, str, "", false, 4, (Object) null);
    }

    /* renamed from: h */
    public Object mo93123h() {
        return mo93122g();
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94343e;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        if (!mo93124i()) {
            return true;
        }
        C31100a aVar = this.f94352n;
        return (aVar != null ? aVar.mo71299a() : true) && m115328H(false);
    }

    /* renamed from: k */
    public void mo93126k(C37177b bVar) {
        String str;
        this.f94342d = bVar;
        if (bVar == null || (str = C37829b.m111219f(bVar)) == null) {
            str = "";
        }
        m115335P(str);
    }

    /* renamed from: m */
    public void mo93128m(C37179d dVar, List list, C38421a aVar) {
        BigDecimal h;
        C41536l.m120489i(dVar, "debt");
        C41536l.m120489i(list, "debtInput");
        C41536l.m120489i(aVar, "oldConfig");
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C38422b bVar = (C38422b) it.next();
            if (C41536l.m120484d(bVar.mo91969l(), "debt") && (h = C37829b.m111221h(dVar, bVar)) != null) {
                bigDecimal = h;
            }
        }
        mo93137v(true);
        if (bigDecimal.compareTo(BigDecimal.ZERO) > 0) {
            mo93131p();
            String O = C32343x.m95406O(C37829b.m111218e(bigDecimal.toString()), "GEL");
            String str = this.f94350l;
            C41536l.m120488h(str, "amountSuffix");
            this.f94348j = C40439w.m117103B(O, str, "", false, 4, (Object) null);
            mo93136u(O);
            return;
        }
        mo93136u(mo93122g());
        this.f94348j = null;
    }

    /* renamed from: n */
    public void mo93129n(String str, C31622e eVar) {
        boolean z;
        C41536l.m120489i(eVar, "template");
        String str2 = this.f94346h;
        if (str2 == null || str2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo93136u(str);
        }
    }

    /* renamed from: o */
    public void mo93130o(C39492b bVar) {
        C41536l.m120489i(bVar, "listener");
        this.f94351m.remove(bVar);
    }

    /* renamed from: p */
    public void mo93131p() {
        this.f94348j = null;
        m115325D().f88901e.mo35919b();
        m115331L();
        m115336Q(this, (CharSequence) null, 1, (Object) null);
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
        if (obj == null) {
            obj = "";
        }
        mo93136u(obj.toString());
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94345g = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        Input input;
        this.f94344f = z;
        Input input2 = null;
        if (!z) {
            C36837s sVar = this.f94341c;
            if (!(sVar == null || (input = sVar.f88901e) == null || !input.hasFocus())) {
                C32290b1.m95112b(input);
                input.clearFocus();
            }
            C36837s sVar2 = this.f94341c;
            if (sVar2 != null) {
                input2 = sVar2.f88901e;
            }
            if (input2 != null) {
                input2.setEnabled(false);
                return;
            }
            return;
        }
        C36837s sVar3 = this.f94341c;
        if (sVar3 != null) {
            input2 = sVar3.f88901e;
        }
        if (input2 != null) {
            input2.setEnabled(this.f94347i);
        }
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            String str2 = this.f94350l;
            C41536l.m120488h(str2, "amountSuffix");
            if (!C40439w.m117114r(str, str2, false, 2, (Object) null)) {
                str = str + this.f94350l;
                m115325D().f88901e.setInputText(str);
            }
        }
        if (str == null) {
            str = "";
        }
        m115325D().f88901e.setInputText(str);
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        LinearLayout c;
        this.f94343e = z;
        C36837s sVar = this.f94341c;
        if (sVar != null && (c = sVar.mo3946b()) != null) {
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }
    }

    /* renamed from: w */
    public boolean mo93138w() {
        if (mo93124i()) {
            return m115325D().f88901e.mo35918a() && m115328H(true);
        }
        return true;
    }
}
