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

/* renamed from: k81.i */
public final class C36906i extends C36917q {

    /* renamed from: b */
    private C43064a f89019b;

    /* renamed from: c */
    private C43064a f89020c;

    /* renamed from: d */
    public View f89021d;

    /* renamed from: j */
    private final void m109309j() {
        mo89845f().setOnClickListener(new C36902g(this));
        ((ImageView) mo89845f().findViewById(C10322k.dismiss_banner_image)).setOnClickListener(new C36904h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m109310k(C36906i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        C43064a aVar = iVar.f89019b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m109311l(C36906i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        C43064a aVar = iVar.f89020c;
        if (aVar != null) {
            aVar.invoke();
        }
        iVar.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C10324m.banner_credit_info_register, viewGroup, false);
        C41536l.m120488h(inflate, "from(context).inflate(R.…_register, parent, false)");
        mo89846g(inflate);
        m109309j();
        return mo89845f();
    }

    /* renamed from: f */
    public final View mo89845f() {
        View view = this.f89021d;
        if (view != null) {
            return view;
        }
        C41536l.m120506z("itemView");
        return null;
    }

    /* renamed from: g */
    public final void mo89846g(View view) {
        C41536l.m120489i(view, "<set-?>");
        this.f89021d = view;
    }

    /* renamed from: h */
    public final void mo89847h(C43064a aVar) {
        this.f89019b = aVar;
    }

    /* renamed from: i */
    public final void mo89848i(C43064a aVar) {
        this.f89020c = aVar;
    }
}
