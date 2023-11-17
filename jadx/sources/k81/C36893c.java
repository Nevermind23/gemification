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

/* renamed from: k81.c */
public final class C36893c extends C36917q {

    /* renamed from: b */
    private C43064a f88999b;

    /* renamed from: c */
    private C43064a f89000c;

    /* renamed from: d */
    public View f89001d;

    /* renamed from: j */
    private final void m109274j() {
        mo89826f().setOnClickListener(new C36889a(this));
        ((ImageView) mo89826f().findViewById(C10322k.dismiss_banner_image)).setOnClickListener(new C36891b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m109275k(C36893c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43064a aVar = cVar.f88999b;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m109276l(C36893c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        C43064a aVar = cVar.f89000c;
        if (aVar != null) {
            aVar.invoke();
        }
        cVar.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(C10324m.banner_become_solo, viewGroup, false);
        C41536l.m120488h(inflate, "from(context).inflate(R.…come_solo, parent, false)");
        mo89827g(inflate);
        m109274j();
        return mo89826f();
    }

    /* renamed from: f */
    public final View mo89826f() {
        View view = this.f89001d;
        if (view != null) {
            return view;
        }
        C41536l.m120506z("itemView");
        return null;
    }

    /* renamed from: g */
    public final void mo89827g(View view) {
        C41536l.m120489i(view, "<set-?>");
        this.f89001d = view;
    }

    /* renamed from: h */
    public final void mo89828h(C43064a aVar) {
        this.f88999b = aVar;
    }

    /* renamed from: i */
    public final void mo89829i(C43064a aVar) {
        this.f89000c = aVar;
    }
}
