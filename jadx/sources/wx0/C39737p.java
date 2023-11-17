package wx0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.C0173b;
import androidx.appcompat.widget.AppCompatImageView;
import by0.C31217a;
import cf1.C40419j;
import com.bumptech.glide.C2394j;
import com.bumptech.glide.load.resource.bitmap.C2524n;
import dy0.C31622e;
import ed1.C40749p;
import fx0.C32024d;
import g91.C32343x;
import hd1.C41205b;
import he1.C41238w;
import i91.C36370c;
import java.util.Iterator;
import java.util.Map;
import jx0.C36824h0;
import jx0.C36826i0;
import jx0.C36828j0;
import jx0.C36843y;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37828a;
import ox0.C37833c;
import p035c4.C2256h;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.input.Input;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p589ri.C17617a;
import p642vh.C18368l;
import ue1.C43064a;
import ue1.C43075l;
import ux0.C39162n;
import ux0.C39163o;

/* renamed from: wx0.p */
public final class C39737p extends C39732l {

    /* renamed from: k */
    private boolean f94413k;

    /* renamed from: l */
    private C0173b f94414l;

    /* renamed from: m */
    private boolean f94415m;

    /* renamed from: n */
    private View f94416n;

    /* renamed from: o */
    private View f94417o;

    /* renamed from: p */
    private View f94418p;

    /* renamed from: q */
    private String f94419q;

    /* renamed from: r */
    private Context f94420r;

    /* renamed from: s */
    private final TextWatcher f94421s = new C39742e(this);

    /* renamed from: wx0.p$a */
    static final class C39738a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39737p f94422d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39738a(C39737p pVar) {
            super(0);
            this.f94422d = pVar;
        }

        public final void invoke() {
            C0173b V = this.f94422d.mo93476V();
            if (V != null) {
                V.mo404a("android.permission.READ_CONTACTS");
            }
        }
    }

    /* renamed from: wx0.p$b */
    static final class C39739b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39739b f94423d = new C39739b();

        C39739b() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$setImage");
            C2394j A0 = jVar.mo7215a(new C2256h().mo7252u0(new C2524n()));
            C41536l.m120488h(A0, "apply(RequestOptions().transform(CircleCrop()))");
            return A0;
        }
    }

    /* renamed from: wx0.p$c */
    static final class C39740c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39737p f94424d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39740c(C39737p pVar) {
            super(1);
            this.f94424d = pVar;
        }

        /* renamed from: a */
        public final void mo93483a(C31217a.C31219b bVar) {
            String a = bVar.mo71470a();
            if (a == null) {
                a = "";
            }
            this.f94424d.mo93136u(C37828a.m111212b().mo94490g(a, ""));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93483a((C31217a.C31219b) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: wx0.p$d */
    public static final class C39741d extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C39741d f94425d = new C39741d();

        public C39741d() {
            super(1);
        }

        /* renamed from: a */
        public final Boolean invoke(C31217a aVar) {
            C41536l.m120489i(aVar, "it");
            return Boolean.valueOf(aVar instanceof C31217a.C31219b);
        }
    }

    /* renamed from: wx0.p$e */
    public static final class C39742e implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C39737p f94426d;

        C39742e(C39737p pVar) {
            this.f94426d = pVar;
        }

        public void afterTextChanged(Editable editable) {
            this.f94426d.m115481U();
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39737p(C39163o oVar) {
        super(oVar);
        C41536l.m120489i(oVar, "formContext");
    }

    /* renamed from: S */
    private final void m115479S(String str) {
        C39162n b;
        boolean z = false;
        if (str != null && str.length() == 9) {
            z = true;
        }
        if (z && C32343x.m95493v0(str) && (b = mo93469z().mo92813b()) != null) {
            b.mo80249I();
        }
    }

    /* renamed from: T */
    private final void m115480T(String str) {
        boolean z;
        String str2;
        String str3;
        boolean z2;
        Iterator it = C37828a.m111213c().iterator();
        while (true) {
            z = true;
            str2 = "";
            if (!it.hasNext()) {
                str3 = str2;
                break;
            }
            str3 = (String) it.next();
            if (str == null || !C40439w.m117109H(str, str3, false, 2, (Object) null)) {
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
        if (str3.length() <= 0) {
            z = false;
        }
        if (z) {
            if (str != null) {
                String substring = str.substring(str3.length(), str.length());
                C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                if (substring != null) {
                    str2 = substring;
                }
            }
            mo93467K(str2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U */
    public final void m115481U() {
        mo93468y().f88918e.mo35919b();
        mo93468y().f88918e.setInfoText((CharSequence) null);
        String rawText = mo93468y().f88918e.getRawText();
        m115480T(rawText);
        m115479S(rawText);
        mo93481h0();
        C39162n b = mo93469z().mo92813b();
        if (b != null) {
            b.mo80256g0();
        }
    }

    /* renamed from: W */
    private final void m115482W(Context context) {
        if (this.f94417o == null) {
            this.f94417o = C36824h0.m109109d(LayoutInflater.from(context), (ViewGroup) null, false).mo3946b();
        }
    }

    /* renamed from: X */
    private final void m115483X(Context context) {
        if (this.f94416n == null) {
            this.f94416n = C36828j0.m109125d(LayoutInflater.from(context), (ViewGroup) null, false).mo3946b();
        }
    }

    /* renamed from: Y */
    private final void m115484Y(String str) {
        LayerView layerView = null;
        if (str != null) {
            layerView = C36826i0.m109117d(LayoutInflater.from(this.f94420r), (ViewGroup) null, false).mo3946b();
            AppCompatImageView appCompatImageView = (AppCompatImageView) layerView.findViewById(C32024d.f78860y);
            if (appCompatImageView != null) {
                C41536l.m120488h(appCompatImageView, "findViewById<AppCompatImageView>(R.id.icon)");
                C18368l.m62777z(appCompatImageView, new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null), C39739b.f94423d);
            }
        }
        this.f94418p = layerView;
        mo93480e0();
    }

    /* renamed from: Z */
    private final void m115485Z() {
        C40749p i = mo93469z().mo92812a().mo94990M(new C39163o.C39164a(C39741d.f94425d)).mo95023i(C31217a.C31219b.class);
        C41536l.m120488h(i, "getElementEventObservabl…s T }.cast(T::class.java)");
        C41205b F0 = i.mo94981F0(new C39736o(new C39740c(this)));
        C41536l.m120488h(F0, "private fun observeEleme…           }.bind()\n    }");
        mo93117b(F0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public static final void m115486a0(C43075l lVar, Object obj) {
        C41536l.m120489i(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* access modifiers changed from: private */
    /* renamed from: f0 */
    public static final void m115487f0(View view) {
    }

    /* access modifiers changed from: private */
    /* renamed from: g0 */
    public static final void m115488g0(C39737p pVar, View view) {
        C41536l.m120489i(pVar, "this$0");
        pVar.mo93475R(true);
    }

    /* renamed from: A */
    public C40419j mo93462A() {
        return C37828a.m111212b();
    }

    /* renamed from: B */
    public TextWatcher mo93463B() {
        return this.f94421s;
    }

    /* renamed from: E */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        View E = super.mo93127l(viewGroup, bVar);
        this.f94420r = viewGroup.getContext();
        Context context = viewGroup.getContext();
        C41536l.m120488h(context, "container.context");
        m115483X(context);
        Context context2 = viewGroup.getContext();
        C41536l.m120488h(context2, "container.context");
        m115482W(context2);
        mo93480e0();
        m115485Z();
        return E;
    }

    /* renamed from: G */
    public void mo93466G(C33699b bVar) {
        C41536l.m120489i(bVar, "element");
        super.mo93466G(bVar);
        if (mo93468y().f88918e.getMask() == null) {
            mo93468y().f88918e.setMask(new C17617a("", C41341q.m119907j(), (String) null, mo93462A()));
        }
    }

    /* renamed from: R */
    public final void mo93475R(boolean z) {
        C39162n b;
        if ((z || mo93469z().mo92814c(true)) && this.f94420r != null && (b = mo93469z().mo92813b()) != null) {
            C37833c cVar = C37833c.f90838a;
            String f = C34646b.m101752f(cVar.mo91148j(), (Context) null, 1, (Object) null);
            String f2 = C34646b.m101752f(cVar.mo91145g(), (Context) null, 1, (Object) null);
            String f3 = C34646b.m101752f(cVar.mo91147i(), (Context) null, 1, (Object) null);
            b.mo80255d0(f, f2, f3, C34646b.m101752f(cVar.mo91146h(), (Context) null, 1, (Object) null), new C39738a(this));
        }
    }

    /* renamed from: V */
    public final C0173b mo93476V() {
        return this.f94414l;
    }

    /* renamed from: b0 */
    public final void mo93477b0(boolean z) {
        this.f94413k = z;
        mo93480e0();
    }

    /* renamed from: c */
    public void mo93118c() {
        super.mo93118c();
        this.f94420r = null;
        this.f94414l = null;
        this.f94418p = null;
        this.f94417o = null;
        this.f94416n = null;
    }

    /* renamed from: c0 */
    public final void mo93478c0(String str) {
        C41238w wVar;
        this.f94419q = str;
        if (str != null) {
            m115484Y(str);
            wVar = C41238w.f97225a;
        } else {
            wVar = null;
        }
        if (wVar == null) {
            this.f94418p = null;
        }
    }

    /* renamed from: d0 */
    public final void mo93479d0(C0173b bVar) {
        this.f94414l = bVar;
    }

    /* renamed from: e0 */
    public final void mo93480e0() {
        Input input;
        View view;
        Context context = this.f94420r;
        if (context != null) {
            this.f94415m = C36370c.m107927h(context);
        }
        C36843y D = mo93464D();
        if (D != null && (input = D.f88918e) != null) {
            input.setEndComponentClickListener(new C39734m());
            if (this.f94413k) {
                view = this.f94416n;
            } else if (!this.f94415m) {
                input.setEndComponentClickListener(new C39735n(this));
                view = this.f94417o;
            } else {
                view = this.f94418p;
            }
            input.setEndComponentView(view);
        }
    }

    /* renamed from: h0 */
    public final void mo93481h0() {
        mo93469z().mo92816e(new C31217a.C31220c(mo93468y().f88918e.getRawText()));
    }

    /* renamed from: n */
    public void mo93129n(String str, C31622e eVar) {
        C41536l.m120489i(eVar, "template");
        super.mo93129n(str, eVar);
        m115481U();
    }
}
