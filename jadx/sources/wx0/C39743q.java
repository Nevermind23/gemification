package wx0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import jx0.C36836r;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33699b;
import vx0.C39491a;

/* renamed from: wx0.q */
public final class C39743q extends C39491a {

    /* renamed from: b */
    private C36836r f94427b;

    /* renamed from: c */
    private boolean f94428c = true;

    /* renamed from: d */
    private boolean f94429d = true;

    /* renamed from: e */
    private int f94430e = -1;

    /* renamed from: x */
    private final C36836r m115506x() {
        C36836r rVar = this.f94427b;
        C41536l.m120486f(rVar);
        return rVar;
    }

    /* renamed from: e */
    public int mo93120e() {
        return this.f94430e;
    }

    /* renamed from: g */
    public String mo93122g() {
        return m115506x().f88899e.getText().toString();
    }

    /* renamed from: i */
    public boolean mo93124i() {
        return this.f94428c;
    }

    /* renamed from: j */
    public boolean mo93125j() {
        return true;
    }

    /* renamed from: s */
    public void mo93134s(int i) {
        this.f94430e = i;
    }

    /* renamed from: t */
    public void mo93135t(boolean z) {
        this.f94429d = z;
    }

    /* renamed from: u */
    public void mo93136u(String str) {
        m115506x().f88899e.setText(str);
    }

    /* renamed from: v */
    public void mo93137v(boolean z) {
        this.f94428c = z;
    }

    /* renamed from: y */
    public View mo93127l(ViewGroup viewGroup, C33699b bVar) {
        C41536l.m120489i(viewGroup, "container");
        C41536l.m120489i(bVar, "element");
        this.f94427b = C36836r.m109157d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        mo93136u(bVar.mo80324l());
        FrameLayout c = m115506x().mo3946b();
        C41536l.m120488h(c, "binding.root");
        return c;
    }
}
