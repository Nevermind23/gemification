package k81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import kotlin.jvm.internal.C41536l;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43064a;

/* renamed from: k81.o */
public final class C36915o extends C36917q {

    /* renamed from: b */
    private C43064a f89029b;

    /* renamed from: c */
    private C43064a f89030c;

    /* renamed from: d */
    public View f89031d;

    /* renamed from: j */
    private final void m109329j() {
        mo89855f().setOnClickListener(new C36913m(this));
        ((ImageView) mo89855f().findViewById(C10322k.dismiss_banner_image)).setOnClickListener(new C36914n(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m109330k(C36915o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        C43064a aVar = oVar.f89029b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m109331l(C36915o oVar, View view) {
        C41536l.m120489i(oVar, "this$0");
        C43064a aVar = oVar.f89030c;
        if (aVar != null) {
            aVar.invoke();
        }
        oVar.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C10324m.banner_digital_card, viewGroup, false);
        C41536l.m120488h(inflate, "from(context).inflate(R.…ital_card, parent, false)");
        mo89856g(inflate);
        m109329j();
        return mo89855f();
    }

    /* renamed from: f */
    public final View mo89855f() {
        View view = this.f89031d;
        if (view != null) {
            return view;
        }
        C41536l.m120506z("itemView");
        return null;
    }

    /* renamed from: g */
    public final void mo89856g(View view) {
        C41536l.m120489i(view, "<set-?>");
        this.f89031d = view;
    }

    /* renamed from: h */
    public final void mo89857h(C43064a aVar) {
        this.f89029b = aVar;
    }

    /* renamed from: i */
    public final void mo89858i(C43064a aVar) {
        this.f89030c = aVar;
    }
}
