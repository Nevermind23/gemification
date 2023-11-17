package com.medallia.digital.mobilesdk;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

/* renamed from: com.medallia.digital.mobilesdk.d0 */
abstract class C10771d0 extends RelativeLayout {

    /* renamed from: a */
    final C10731b0 f30850a;

    /* renamed from: b */
    View f30851b;

    /* renamed from: c */
    RelativeLayout f30852c;

    /* renamed from: d */
    RelativeLayout f30853d;

    /* renamed from: e */
    public boolean f30854e;

    /* renamed from: f */
    String f30855f;

    C10771d0(C10731b0 b0Var, Context context, String str) {
        super(context);
        this.f30850a = b0Var;
        this.f30855f = str;
        m39297a(context);
    }

    /* renamed from: a */
    private void m39297a(Context context) {
        View inflate = View.inflate(context, C10706R.layout.view_base_banner, this);
        this.f30851b = inflate;
        this.f30853d = (RelativeLayout) inflate.findViewById(C10706R.C10708id.medallia_banner_base_view);
        RelativeLayout relativeLayout = (RelativeLayout) this.f30851b.findViewById(C10706R.C10708id.medallia_shadow_view);
        this.f30852c = relativeLayout;
        relativeLayout.addView(mo28056b(context));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo28055a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract RelativeLayout mo28056b(Context context);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo28057b();

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract boolean mo28058c();

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract boolean mo28059d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract View mo28060e();

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract View mo28061f();
}
