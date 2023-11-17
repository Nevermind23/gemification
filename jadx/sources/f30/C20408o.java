package f30;

import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import c30.C19456a;
import com.github.mikephil.charting.utils.Utils;
import d30.C19878a;
import g60.C20742c;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p366bk.C10320i;
import p90.C27249a5;
import ue1.C43075l;
import ue1.C43079p;

/* renamed from: f30.o */
public final class C20408o extends C20742c {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C27249a5 f55348d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final C19456a f55349e;

    /* renamed from: f */
    private C43075l f55350f;

    /* renamed from: g */
    private C43079p f55351g;

    /* renamed from: h */
    private C43075l f55352h;

    /* renamed from: i */
    private C43075l f55353i;

    /* renamed from: j */
    private boolean f55354j;

    /* renamed from: k */
    private final C20409a f55355k = new C20409a(this);

    /* renamed from: f30.o$a */
    public static final class C20409a implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C20408o f55356d;

        C20409a(C20408o oVar) {
            this.f55356d = oVar;
        }

        public void afterTextChanged(Editable editable) {
            double d;
            this.f55356d.f55348d.f68321j.removeTextChangedListener(this);
            Double h = C40437u.m117096h(C40439w.m117103B(String.valueOf(editable), " ₾", "", false, 4, (Object) null));
            C20408o oVar = this.f55356d;
            if (h == null) {
                oVar.f55348d.f68321j.setText("");
            }
            if (h != null) {
                d = h.doubleValue();
            } else {
                d = Utils.DOUBLE_EPSILON;
            }
            this.f55356d.f55348d.f68321j.formatWithNonSelectable();
            this.f55356d.f55348d.f68321j.addTextChangedListener(this);
            C19878a t = this.f55356d.f55349e.mo47680t(this.f55356d.getAdapterPosition());
            if (t instanceof C19878a.C19882d) {
                C19878a.C19882d dVar = (C19878a.C19882d) t;
                dVar.mo48201d(d);
                C43079p n = this.f55356d.mo48892n();
                if (n != null) {
                    n.invoke(dVar.mo48199b(), Double.valueOf(d));
                }
            } else if (t instanceof C19878a.C19888j) {
                ((C19878a.C19888j) t).mo48226f(d);
                C43075l o = this.f55356d.mo48893o();
                if (o != null) {
                    o.invoke(Double.valueOf(d));
                }
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20408o(C27249a5 a5Var, C19456a aVar) {
        super((C6201a) a5Var);
        C41536l.m120489i(a5Var, "binding");
        C41536l.m120489i(aVar, "adapter");
        this.f55348d = a5Var;
        this.f55349e = aVar;
    }

    /* renamed from: m */
    private final void m66534m(boolean z) {
        float f;
        LinearLayout linearLayout = this.f55348d.f68320i;
        if (z) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        linearLayout.setAlpha(f);
        this.f55348d.f68316e.setChecked(z);
    }

    /* renamed from: p */
    private final void m66535p(C19878a.C19882d dVar) {
        boolean z;
        this.f55348d.f68316e.setVisibility(8);
        this.f55348d.f68322k.setVisibility(0);
        if (dVar.mo48199b().mo47380d().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f55348d.f68319h.setVisibility(8);
        } else {
            this.f55348d.f68319h.setVisibility(0);
            this.f55348d.f68319h.setText(dVar.mo48199b().mo47380d());
        }
        this.f55348d.f68322k.setOnClickListener(new C20407n(this, dVar));
        if (dVar.mo48199b().mo47383f() == null) {
            this.f55348d.f68317f.setImageResource(dVar.mo48199b().mo47378b());
        } else {
            C32289b0.m95097i(this.f55348d.f68317f, dVar.mo48199b().mo47383f());
        }
        this.f55348d.f68318g.setText(dVar.mo48199b().mo47384g());
        this.f55348d.f68321j.setText(C32343x.m95410Q(dVar.mo48200c(), "", false, 2, (Object) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m66536q(C20408o oVar, C19878a.C19882d dVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        C41536l.m120489i(dVar, "$data");
        C43075l lVar = oVar.f55350f;
        if (lVar != null) {
            lVar.invoke(dVar.mo48199b());
        }
    }

    /* renamed from: r */
    private final void m66537r(C19878a.C19888j jVar) {
        boolean z = false;
        this.f55348d.f68316e.setVisibility(0);
        this.f55348d.f68322k.setVisibility(8);
        this.f55348d.f68319h.setVisibility(8);
        this.f55348d.f68318g.setText(jVar.mo48224e());
        m66534m(jVar.mo48222c());
        String b = jVar.mo48221b();
        if (b == null || b.length() == 0) {
            z = true;
        }
        if (!z) {
            C32289b0.m95097i(this.f55348d.f68317f, C32289b0.m95093e(jVar.mo48221b()));
        } else {
            this.f55348d.f68317f.setImageResource(C10320i.ic_contact_default_avatar);
        }
        this.f55348d.f68321j.setText(C32343x.m95410Q(jVar.mo48223d(), "", false, 2, (Object) null));
        this.f55348d.f68316e.setOnCheckedChangeListener(new C20406m(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m66538s(C20408o oVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(oVar, "this$0");
        C43075l lVar = oVar.f55353i;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m66539v(C20408o oVar, View view, boolean z) {
        C41536l.m120489i(oVar, "this$0");
        oVar.f55354j = z;
    }

    /* renamed from: n */
    public final C43079p mo48892n() {
        return this.f55351g;
    }

    /* renamed from: o */
    public final C43075l mo48893o() {
        return this.f55352h;
    }

    /* renamed from: t */
    public final boolean mo48894t() {
        return this.f55354j;
    }

    /* renamed from: u */
    public void onBind(C19878a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f55354j = this.f55348d.f68321j.hasFocus();
        this.f55348d.f68317f.setImageDrawable((Drawable) null);
        this.f55348d.f68320i.setAlpha(1.0f);
        this.f55348d.f68321j.removeTextChangedListener(this.f55355k);
        this.f55348d.f68316e.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f55348d.f68321j.setNonSelectableString(" ₾");
        this.f55348d.f68321j.setHint(C32343x.m95410Q(Utils.DOUBLE_EPSILON, "GEL", false, 2, (Object) null));
        if (aVar instanceof C19878a.C19888j) {
            m66537r((C19878a.C19888j) aVar);
        } else if (aVar instanceof C19878a.C19882d) {
            m66535p((C19878a.C19882d) aVar);
        }
        this.f55348d.f68321j.formatWithNonSelectable();
        this.f55348d.f68321j.addTextChangedListener(this.f55355k);
        this.f55348d.f68321j.setOnFocusChangeListener(new C20405l(this));
    }

    /* renamed from: w */
    public final void mo48896w(C43075l lVar) {
        this.f55353i = lVar;
    }

    /* renamed from: x */
    public final void mo48897x(C43079p pVar) {
        this.f55351g = pVar;
    }

    /* renamed from: y */
    public final void mo48898y(C43075l lVar) {
        this.f55350f = lVar;
    }

    /* renamed from: z */
    public final void mo48899z(C43075l lVar) {
        this.f55352h = lVar;
    }
}
