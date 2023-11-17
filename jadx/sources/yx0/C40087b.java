package yx0;

import af1.C40303i;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.app.C0218d;
import ay0.C31100a;
import by0.C31217a;
import cf1.C40419j;
import dy0.C31622e;
import ed1.C40749p;
import fx0.C32023c;
import g91.C32303f;
import g91.C32343x;
import hd1.C41204a;
import hd1.C41205b;
import he1.C41224m;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jx0.C36810a0;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import lx0.C37177b;
import ox0.C37829b;
import ox0.C37833c;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import p341ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p341ge.bog.mobilebank.shared.helper.StringSource;
import p603si.C17796a;
import p603si.C17799b;
import p603si.C17809c;
import ue1.C43075l;
import ux0.C39162n;
import ux0.C39163o;
import vx0.C39491a;
import vx0.C39492b;
import yx0.C40096f;

/* renamed from: yx0.b */
public class C40087b extends C39491a {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C39163o f95301b;

    /* renamed from: c */
    private C36810a0 f95302c;

    /* renamed from: d */
    private boolean f95303d = true;

    /* renamed from: e */
    private boolean f95304e = true;

    /* renamed from: f */
    private C37177b f95305f;

    /* renamed from: g */
    private C41224m f95306g;

    /* renamed from: h */
    private int f95307h = -1;

    /* renamed from: i */
    private C40088a f95308i;

    /* renamed from: j */
    private C31100a f95309j;

    /* renamed from: k */
    private String f95310k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C33699b f95311l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public List f95312m = new ArrayList();

    /* renamed from: n */
    private final C40092d f95313n = new C40092d(this);

    /* renamed from: yx0.b$a */
    public final class C40088a implements View.OnClickListener {

        /* renamed from: h */
        static final /* synthetic */ C40303i[] f95314h = {C41520a0.m120439e(new C41539o(C40088a.class, "selectedOption", "getSelectedOption()Lge/bog/mobilebank/payments/presentation/form/model/SelectElementViewData;", 0))};

        /* renamed from: d */
        private final String f95315d;

        /* renamed from: e */
        private final List f95316e;

        /* renamed from: f */
        private final C41555e f95317f;

        /* renamed from: g */
        final /* synthetic */ C40087b f95318g;

        /* renamed from: yx0.b$a$a */
        public static final class C40089a extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C40087b f95319a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C40089a(Object obj, C40087b bVar) {
                super(obj);
                this.f95319a = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                String str;
                String str2;
                C41536l.m120489i(iVar, "property");
                SelectElementViewData selectElementViewData = (SelectElementViewData) obj2;
                SelectElementViewData selectElementViewData2 = (SelectElementViewData) obj;
                Input input = this.f95319a.mo94025E().f88798e;
                String str3 = "";
                if (selectElementViewData == null || (str = selectElementViewData.mo80348h()) == null) {
                    str = str3;
                }
                input.setInputText(str);
                boolean z = false;
                if (selectElementViewData != null && !selectElementViewData.mo80347g()) {
                    z = true;
                }
                if (z) {
                    Input input2 = this.f95319a.mo94025E().f88798e;
                    String e = selectElementViewData.mo80344e();
                    if (e == null) {
                        str2 = str3;
                    } else {
                        str2 = e;
                    }
                    input2.setStartIconImage(new Image.Url(str2, new Image.Resource(C32023c.f78830c, (Boolean) null, 2, (DefaultConstructorMarker) null), (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 124, (DefaultConstructorMarker) null));
                    this.f95319a.mo94025E().f88798e.setHintText((CharSequence) selectElementViewData.mo80348h());
                    Input input3 = this.f95319a.mo94025E().f88798e;
                    String a = selectElementViewData.mo80340a();
                    if (a != null) {
                        str3 = a;
                    }
                    input3.setInputText(str3);
                    return;
                }
                this.f95319a.mo94025E().f88798e.setStartIconImage((Image) null);
            }
        }

        public C40088a(C40087b bVar, String str, List list) {
            C41536l.m120489i(str, "title");
            C41536l.m120489i(list, "options");
            this.f95318g = bVar;
            this.f95315d = str;
            this.f95316e = list;
            C41551a aVar = C41551a.f97718a;
            this.f95317f = new C40089a((Object) null, bVar);
            bVar.mo94025E().f88798e.setOnClickListener(this);
        }

        /* renamed from: c */
        private final SelectElementViewData m116188c() {
            return (SelectElementViewData) this.f95317f.getValue(this, f95314h[0]);
        }

        /* renamed from: f */
        private final void m116189f(SelectElementViewData selectElementViewData) {
            this.f95317f.setValue(this, f95314h[0], selectElementViewData);
        }

        /* renamed from: a */
        public final String mo94029a() {
            SelectElementViewData c = m116188c();
            if (c != null) {
                return c.mo80346f();
            }
            return null;
        }

        /* renamed from: b */
        public final String mo94030b() {
            SelectElementViewData c = m116188c();
            if (c != null) {
                return c.mo80342d();
            }
            return null;
        }

        /* renamed from: d */
        public final String mo94031d() {
            String a;
            SelectElementViewData c = m116188c();
            if (c == null || (a = c.mo80340a()) == null) {
                return null;
            }
            String i = C32303f.m95198i("GEL", true);
            C41536l.m120488h(i, "getCcyLogo(CCY_GEL, true)");
            return C40439w.m117103B(a, i, "", false, 4, (Object) null);
        }

        /* renamed from: e */
        public final void mo94032e(String str) {
            Object obj;
            Iterator it = this.f95316e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((SelectElementViewData) obj).mo80342d(), str)) {
                    break;
                }
            }
            m116189f((SelectElementViewData) obj);
        }

        public void onClick(View view) {
            String str;
            C41536l.m120489i(view, "v");
            C40096f.C40097a aVar = C40096f.f95327H;
            String str2 = this.f95315d;
            List list = this.f95316e;
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                String d = ((SelectElementViewData) it.next()).mo80342d();
                SelectElementViewData c = m116188c();
                if (c != null) {
                    str = c.mo80342d();
                } else {
                    str = null;
                }
                if (C41536l.m120484d(d, str)) {
                    break;
                }
                i++;
            }
            C40096f a = aVar.mo94043a(str2, list, Integer.valueOf(i), this.f95318g.mo93120e());
            Context context = this.f95318g.mo94025E().mo3946b().getContext();
            C41536l.m120487g(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            a.mo4576A1(((C0218d) context).getSupportFragmentManager(), (String) null);
        }
    }

    /* renamed from: yx0.b$b */
    static final class C40090b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40087b f95320d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40090b(C40087b bVar) {
            super(1);
            this.f95320d = bVar;
        }

        /* renamed from: a */
        public final void mo94034a(C31217a.C31218a aVar) {
            this.f95320d.m116159Q("");
            this.f95320d.mo93131p();
            C40087b bVar = this.f95320d;
            boolean z = true;
            if (aVar.mo71466a() != 1) {
                z = false;
            }
            bVar.mo93137v(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94034a((C31217a.C31218a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yx0.b$c */
    public static final class C40091c extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C40091c f95321d = new C40091c();

        public C40091c() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31217a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31217a.C31218a);
        }
    }

    /* renamed from: yx0.b$d */
    public static final class C40092d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C40087b f95322d;

        C40092d(C40087b bVar) {
            this.f95322d = bVar;
        }

        public void afterTextChanged(Editable editable) {
            C39162n b;
            if (this.f95322d.mo93124i()) {
                this.f95322d.mo94025E().f88798e.mo35919b();
                for (C39492b r : this.f95322d.f95312m) {
                    r.mo80367r(String.valueOf(editable));
                }
                C33699b y = this.f95322d.f95311l;
                boolean z = false;
                if (y != null && y.mo80328p()) {
                    z = true;
                }
                if (!z && (b = this.f95322d.f95301b.mo92813b()) != null) {
                    b.mo80256g0();
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public C40087b(C39163o oVar) {
        C41536l.m120489i(oVar, "formContext");
        this.f95301b = oVar;
    }

    /* renamed from: D */
    private final void m116150D(C33699b bVar) {
        List h = bVar.mo80320h();
        if (h != null) {
            String f = C34646b.m101752f(C37833c.f90838a.mo91151m(), (Context) null, 1, (Object) null);
            String E = C32343x.m95386E(bVar.mo80319g(), bVar.mo80317e(), new Object[0]);
            this.f95308i = new C40088a(this, f + " " + E, h);
        }
    }

    /* renamed from: H */
    private final C17796a m116151H(C33699b bVar) {
        C17796a aVar = new C17796a((List) null, (C17796a.C17797a) null, 3, (DefaultConstructorMarker) null);
        if (bVar.mo80326n()) {
            aVar.add(C17809c.m61562a(C17799b.C17805f.f50686d, C34646b.m101752f(C37833c.f90838a.mo91135U(), (Context) null, 1, (Object) null)));
        }
        return aVar;
    }

    /* renamed from: I */
    private final boolean m116152I(boolean z) {
        C41224m mVar = this.f95306g;
        if (mVar == null) {
            return true;
        }
        String str = (String) mVar.mo95680f();
        if (mo93122g() != null) {
            String g = mo93122g();
            if (g == null) {
                g = "";
            }
            boolean f = ((C40419j) mVar.mo95678e()).mo94489f(g);
            if (z && !f) {
                m116153J(this, str);
            }
            return f;
        } else if (!z) {
            return false;
        } else {
            m116153J(this, str);
            return false;
        }
    }

    /* renamed from: J */
    private static final void m116153J(C40087b bVar, String str) {
        Input input = bVar.mo94025E().f88798e;
        if (str == null) {
            str = C34646b.m101752f(C37833c.f90838a.mo91138X(), (Context) null, 1, (Object) null);
        }
        input.setInfoText(str);
        bVar.mo94025E().f88798e.mo35920c();
    }

    /* renamed from: K */
    private final void m116154K() {
        C40749p i = this.f95301b.mo92812a().mo94990M(new C39163o.C39164a(C40091c.f95321d)).mo95023i(C31217a.C31218a.class);
        C41536l.m120488h(i, "getElementEventObservabl…s T }.cast(T::class.java)");
        C41205b F0 = i.mo94981F0(new C40086a(new C40090b(this)));
        C41536l.m120488h(F0, "private fun observeEleme…           }.bind()\n    }");
        mo93117b(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static final void m116155L(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* renamed from: N */
    private final void m116156N() {
        String g = mo93122g();
        if (g != null) {
            for (C39492b r : this.f95312m) {
                r.mo80367r(g);
            }
        }
    }

    /* renamed from: O */
    private final void m116157O(C33699b bVar) {
        C36810a0 E = mo94025E();
        E.f88798e.getTextInput().removeTextChangedListener(this.f95313n);
        mo93135t(bVar.mo80313a());
        String E2 = C32343x.m95386E(bVar.mo80319g(), bVar.mo80317e(), new Object[0]);
        this.f95310k = E2;
        E.f88798e.setHintText((CharSequence) E2);
        m116150D(bVar);
        m116158P(bVar);
        E.f88798e.getTextInput().addTextChangedListener(this.f95313n);
        String l = bVar.mo80324l();
        if (l != null) {
            mo93136u(l);
        }
    }

    /* renamed from: P */
    private final void m116158P(C33699b bVar) {
        this.f95309j = new C31100a(m116151H(bVar), (C43075l) null, 2, (DefaultConstructorMarker) null);
        mo94025E().f88798e.mo35923e(this.f95309j, false, false, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public final void m116159Q(String str) {
        mo94025E().f88798e.getTextInput().removeTextChangedListener(this.f95313n);
        mo93136u(str);
        mo94025E().f88798e.getTextInput().addTextChangedListener(this.f95313n);
    }

    /* renamed from: R */
    private final void m116160R(CharSequence charSequence) {
        C33702d.C33703a aVar;
        boolean z;
        mo94025E().f88798e.mo35919b();
        C33699b bVar = this.f95311l;
        if (bVar != null) {
            aVar = bVar.mo80314b();
        } else {
            aVar = null;
        }
        if (aVar == C33702d.C33703a.PACKAGES_SELECT) {
            Input input = mo94025E().f88798e;
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
            return;
        }
        mo94025E().f88798e.setInfoText((CharSequence) null);
    }

    /* renamed from: S */
    static /* synthetic */ void m116161S(C40087b bVar, CharSequence charSequence, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                charSequence = "";
            }
            bVar.m116160R(charSequence);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCommission");
    }

    /* renamed from: C */
    public final void mo94024C(StringSource stringSource, List list) {
        C41536l.m120489i(stringSource, "nameKey");
        C41536l.m120489i(list, "options");
        this.f95308i = new C40088a(this, C34646b.m101751e(stringSource, mo94025E().mo3946b().getContext()), list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final C36810a0 mo94025E() {
        C36810a0 a0Var = this.f95302c;
        C41536l.m120486f(a0Var);
        return a0Var;
    }

    /* renamed from: F */
    public final C37177b mo94026F() {
        return this.f95305f;
    }

    /* renamed from: G */
    public final String mo94027G() {
        C40088a aVar = this.f95308i;
        if (aVar != null) {
            return aVar.mo94029a();
        }
        return null;
    }

    /* renamed from: M */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f95302c = C36810a0.m109053d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        mo93119d().dispose();
        mo93133r(new C41204a());
        this.f95311l = bVar;
        if (bVar.mo80314b() == C33702d.C33703a.PACKAGES_SELECT) {
            this.f95306g = C41233s.m119492a(new C40419j("^[0-9]*(\\.?[0-9]{0,2})?[ ]*₾?$"), C34646b.m101752f(C37833c.f90838a.mo91137W(), (Context) null, 1, (Object) null));
        }
        m116157O(bVar);
        m116154K();
        m116161S(this, (CharSequence) null, 1, (Object) null);
        mo93137v(!bVar.mo80328p());
        LinearLayout c = mo94025E().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }

    /* renamed from: a */
    public void mo93116a(C39492b bVar) {
        boolean z;
        C41536l.m120489i(bVar, "listener");
        this.f95312m.add(bVar);
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
        return this.f95307h;
    }

    /* renamed from: f */
    public String mo93121f() {
        C40088a aVar = this.f95308i;
        if (aVar != null) {
            return aVar.mo94031d();
        }
        return null;
    }

    /* renamed from: g */
    public String mo93122g() {
        C40088a aVar = this.f95308i;
        if (aVar != null) {
            return aVar.mo94030b();
        }
        return null;
    }

    /* renamed from: h */
    public Object mo93123h() {
        return mo93122g();
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f95303d;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        if (!mo93124i()) {
            return true;
        }
        C31100a aVar = this.f95309j;
        return aVar != null ? aVar.mo71299a() : true;
    }

    /* renamed from: k */
    public void mo93126k(C37177b bVar) {
        String str;
        this.f95305f = bVar;
        if (bVar == null || (str = C37829b.m111219f(bVar)) == null) {
            str = "";
        }
        m116160R(str);
    }

    /* renamed from: n */
    public void mo93129n(String str, C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        m116159Q(str);
    }

    /* renamed from: o */
    public void mo93130o(C39492b bVar) {
        C41536l.m120489i(bVar, "listener");
        this.f95312m.remove(bVar);
    }

    /* renamed from: p */
    public void mo93131p() {
        Input input = mo94025E().f88798e;
        input.getTextInput().removeTextChangedListener(this.f95313n);
        input.setInputText("");
        input.setInfoText((CharSequence) null);
        input.mo35919b();
        input.getTextInput().addTextChangedListener(this.f95313n);
        input.setStartIconImage((Image) null);
        input.setHintText((CharSequence) this.f95310k);
        m116161S(this, (CharSequence) null, 1, (Object) null);
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
        m116159Q(String.valueOf(obj));
        m116156N();
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f95307h = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        Input input;
        this.f95304e = z;
        C36810a0 a0Var = this.f95302c;
        if (a0Var != null) {
            input = a0Var.f88798e;
        } else {
            input = null;
        }
        if (input != null) {
            input.setEnabled(z);
        }
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        C40088a aVar = this.f95308i;
        if (aVar != null) {
            aVar.mo94032e(str);
        }
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        LinearLayout c;
        if (z && !this.f95303d) {
            m116156N();
        }
        this.f95303d = z;
        C36810a0 a0Var = this.f95302c;
        if (a0Var != null && (c = a0Var.mo3946b()) != null) {
            C32343x.m95483r1(c, mo93124i(), false, 2, (Object) null);
        }
    }

    /* renamed from: w */
    public boolean mo93138w() {
        if (!mo93124i()) {
            return true;
        }
        if (!mo94025E().f88798e.mo35918a() || !m116152I(true) || !m116152I(false)) {
            return false;
        }
        return true;
    }
}
