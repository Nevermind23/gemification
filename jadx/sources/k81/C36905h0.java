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

/* renamed from: k81.h0 */
public final class C36905h0 extends C36917q {

    /* renamed from: b */
    private C43064a f89016b;

    /* renamed from: c */
    private C43064a f89017c;

    /* renamed from: d */
    public View f89018d;

    /* renamed from: j */
    private final void m109299j() {
        mo89841f().setOnClickListener(new C36901f0(this));
        ((ImageView) mo89841f().findViewById(C10322k.dismiss_banner_image)).setOnClickListener(new C36903g0(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m109300k(C36905h0 h0Var, View view) {
        C41536l.m120489i(h0Var, "this$0");
        C43064a aVar = h0Var.f89016b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m109301l(C36905h0 h0Var, View view) {
        C41536l.m120489i(h0Var, "this$0");
        C43064a aVar = h0Var.f89017c;
        if (aVar != null) {
            aVar.invoke();
        }
        h0Var.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C10324m.banner_student_card, viewGroup, false);
        C41536l.m120488h(inflate, "from(context).inflate(R.…dent_card, parent, false)");
        mo89842g(inflate);
        m109299j();
        return mo89841f();
    }

    /* renamed from: f */
    public final View mo89841f() {
        View view = this.f89018d;
        if (view != null) {
            return view;
        }
        C41536l.m120506z("itemView");
        return null;
    }

    /* renamed from: g */
    public final void mo89842g(View view) {
        C41536l.m120489i(view, "<set-?>");
        this.f89018d = view;
    }

    /* renamed from: h */
    public final void mo89843h(C43064a aVar) {
        this.f89016b = aVar;
    }

    /* renamed from: i */
    public final void mo89844i(C43064a aVar) {
        this.f89017c = aVar;
    }
}
