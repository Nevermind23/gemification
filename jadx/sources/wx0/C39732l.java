package wx0;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import ay0.C31100a;
import ay0.C31102b;
import cf1.C40419j;
import dy0.C31622e;
import g91.C32290b1;
import g91.C32343x;
import he1.C41238w;
import java.math.BigDecimal;
import java.util.List;
import jx0.C36843y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lx0.C37179d;
import ox0.C37828a;
import ox0.C37833c;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p547oi.C17199a;
import p547oi.C17201b;
import p589ri.C17617a;
import p603si.C17796a;
import p603si.C17799b;
import p603si.C17809c;
import s31.C38421a;
import ue1.C43075l;
import ux0.C39162n;
import ux0.C39163o;
import vx0.C39491a;

/* renamed from: wx0.l */
public class C39732l extends C39491a {

    /* renamed from: b */
    private final C39163o f94401b;

    /* renamed from: c */
    private C36843y f94402c;

    /* renamed from: d */
    private boolean f94403d = true;

    /* renamed from: e */
    private boolean f94404e = true;

    /* renamed from: f */
    private String f94405f;

    /* renamed from: g */
    private int f94406g = -1;

    /* renamed from: h */
    private C31100a f94407h;

    /* renamed from: i */
    private boolean f94408i;

    /* renamed from: j */
    private final TextWatcher f94409j = new C39733a(this);

    /* renamed from: wx0.l$a */
    public static final class C39733a implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C39732l f94410d;

        C39733a(C39732l lVar) {
            this.f94410d = lVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f94410d.mo93468y().f88918e.mo35919b();
            C39162n b = this.f94410d.mo93469z().mo92813b();
            if (b != null) {
                b.mo80256g0();
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C39732l(C39163o oVar) {
        C41536l.m120489i(oVar, "formContext");
        this.f94401b = oVar;
    }

    /* renamed from: C */
    private final C17796a m115444C(C33699b bVar) {
        boolean z;
        String str;
        C17796a aVar = new C17796a((List) null, (C17796a.C17797a) null, 3, (DefaultConstructorMarker) null);
        if (bVar.mo80314b() == C33702d.C33703a.AMOUNT) {
            BigDecimal bigDecimal = BigDecimal.ZERO;
            C41536l.m120488h(bigDecimal, "ZERO");
            aVar.add(C17809c.m61562a(new C31102b(bigDecimal, (String) null, 2, (DefaultConstructorMarker) null), C34646b.m101752f(C37833c.f90838a.mo91136V(), (Context) null, 1, (Object) null)));
        }
        if (bVar.mo80326n()) {
            aVar.add(C17809c.m61562a(C17799b.C17805f.f50686d, C34646b.m101752f(C37833c.f90838a.mo91135U(), (Context) null, 1, (Object) null)));
        }
        String k = bVar.mo80323k();
        String c = bVar.mo80315c();
        if (k == null || k.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            C17799b.C17807h hVar = new C17799b.C17807h(new C40419j(k));
            if (c == null || (str = C32343x.m95386E(c, true, new Object[0])) == null) {
                str = C34646b.m101752f(C37833c.f90838a.mo91138X(), (Context) null, 1, (Object) null);
            }
            aVar.add(C17809c.m61562a(hVar, str));
        }
        return aVar;
    }

    /* renamed from: F */
    private final void m115445F(String str) {
        boolean z;
        this.f94405f = str;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo93468y().f88918e.mo35919b();
        } else {
            m115450M(str);
        }
    }

    /* renamed from: H */
    private final C41238w m115446H(C33699b bVar) {
        int i;
        String str;
        C36843y y = mo93468y();
        y.f88918e.getTextInput().removeTextChangedListener(mo93463B());
        mo93135t(bVar.mo80313a());
        this.f94408i = bVar.mo80325m();
        y.f88918e.setHintText((CharSequence) C32343x.m95386E(bVar.mo80319g(), bVar.mo80317e(), new Object[0]));
        EditText textInput = y.f88918e.getTextInput();
        if (bVar.mo80314b() == C33702d.C33703a.AMOUNT) {
            y.f88918e.setFilters(new C17201b[]{new C17199a((String) null, 1, (DefaultConstructorMarker) null)});
            i = 8194;
        } else if (bVar.mo80327o()) {
            i = 2;
        } else {
            i = 1;
        }
        textInput.setInputType(i);
        mo93466G(bVar);
        if (bVar.mo80316d() != null) {
            str = C32343x.m95386E(bVar.mo80316d(), true, new Object[0]);
        } else {
            str = null;
        }
        m115449L(str);
        m115448J(bVar);
        y.f88918e.getTextInput().addTextChangedListener(mo93463B());
        y.f88918e.setOnInputFocusChangeListener(new C39731k());
        String l = bVar.mo80324l();
        if (l == null) {
            return null;
        }
        mo93136u(l);
        return C41238w.f97225a;
    }

    /* access modifiers changed from: private */
    /* renamed from: I */
    public static final void m115447I(View view, boolean z) {
        if (!z) {
            C32290b1.m95112b(view);
        }
    }

    /* renamed from: J */
    private final void m115448J(C33699b bVar) {
        this.f94407h = new C31100a(m115444C(bVar), (C43075l) null, 2, (DefaultConstructorMarker) null);
        mo93468y().f88918e.mo35923e(this.f94407h, false, false, false);
    }

    /* renamed from: L */
    private final void m115449L(String str) {
        m115445F(str);
    }

    /* renamed from: M */
    private final void m115450M(CharSequence charSequence) {
        mo93468y().f88918e.setInfoText(charSequence);
        mo93468y().f88918e.mo35919b();
    }

    /* renamed from: A */
    public C40419j mo93462A() {
        return null;
    }

    /* renamed from: B */
    public TextWatcher mo93463B() {
        return this.f94409j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final C36843y mo93464D() {
        return this.f94402c;
    }

    /* renamed from: E */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94402c = C36843y.m109185d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m115446H(bVar);
        mo93137v(!bVar.mo80328p());
        LinearLayout c = mo93468y().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    /* renamed from: G */
    public void mo93466G(C33699b bVar) {
        C41536l.m120489i(bVar, "element");
        String f = bVar.mo80318f();
        if (f != null) {
            mo93468y().f88918e.setMask(new C17617a(f, C37828a.m111211a(), bVar.mo80322j(), mo93462A()));
        } else if (bVar.mo80322j() != null) {
            mo93468y().f88918e.setMask(new C17617a("", C41341q.m119907j(), bVar.mo80322j(), mo93462A()));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public final void mo93467K(String str) {
        mo93468y().f88918e.getTextInput().removeTextChangedListener(mo93463B());
        mo93136u(str);
        mo93468y().f88918e.getTextInput().addTextChangedListener(mo93463B());
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94406g;
    }

    /* renamed from: g */
    public String mo93122g() {
        return mo93468y().f88918e.getRawText();
    }

    /* renamed from: h */
    public Object mo93123h() {
        return mo93122g();
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94403d;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        if (!mo93124i()) {
            return true;
        }
        C31100a aVar = this.f94407h;
        return aVar != null ? aVar.mo71299a() : true;
    }

    /* renamed from: m */
    public void mo93128m(C37179d dVar, List list, C38421a aVar) {
        C41536l.m120489i(dVar, "debt");
        C41536l.m120489i(list, "debtInput");
        C41536l.m120489i(aVar, "oldConfig");
        mo93137v(!this.f94408i);
    }

    /* renamed from: n */
    public void mo93129n(String str, C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        mo93467K(str);
    }

    /* renamed from: p */
    public void mo93131p() {
        boolean z;
        Input input = mo93468y().f88918e;
        if (input.getInputText().length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            input.setInputText("");
        }
        input.mo35919b();
        m115449L(this.f94405f);
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
        mo93467K(String.valueOf(obj));
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94406g = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        Input input;
        C36843y yVar;
        Input input2;
        this.f94404e = z;
        if (!z && (yVar = this.f94402c) != null && (input2 = yVar.f88918e) != null && input2.hasFocus()) {
            C32290b1.m95112b(input2);
            input2.clearFocus();
        }
        C36843y yVar2 = this.f94402c;
        if (yVar2 != null) {
            input = yVar2.f88918e;
        } else {
            input = null;
        }
        if (input != null) {
            input.setEnabled(z);
        }
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        int i;
        String obj = mo93468y().f88918e.getTextInput().getText().toString();
        int length = obj.length();
        boolean z = false;
        if (str != null) {
            i = str.length();
        } else {
            i = 0;
        }
        int abs = Math.abs(length - i);
        Input input = mo93468y().f88918e;
        if (!C41536l.m120484d(obj, str) && abs < 2) {
            z = true;
        }
        input.setAnimate(z);
        Input input2 = mo93468y().f88918e;
        if (str == null) {
            str = "";
        }
        input2.setInputText(str);
        mo93468y().f88918e.setAnimate(true);
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        LinearLayout c;
        this.f94403d = z;
        C36843y yVar = this.f94402c;
        if (yVar != null && (c = yVar.mo3946b()) != null) {
            C32343x.m95483r1(c, z, false, 2, (Object) null);
        }
    }

    /* renamed from: w */
    public boolean mo93138w() {
        return mo93468y().f88918e.mo35918a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final C36843y mo93468y() {
        C36843y yVar = this.f94402c;
        C41536l.m120486f(yVar);
        return yVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final C39163o mo93469z() {
        return this.f94401b;
    }
}
