package vx0;

import android.view.View;
import android.view.ViewGroup;
import dy0.C31622e;
import hd1.C41204a;
import hd1.C41205b;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import lx0.C37177b;
import lx0.C37179d;
import p341ge.bog.mobilebank.payments.presentation.form.base.C33702d;
import s31.C38421a;

/* renamed from: vx0.a */
public abstract class C39491a {

    /* renamed from: a */
    private C41204a f93935a = new C41204a();

    /* renamed from: a */
    public void mo93116a(C39492b bVar) {
        C41536l.m120489i(bVar, "listener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo93117b(C41205b bVar) {
        C41536l.m120489i(bVar, "<this>");
        this.f93935a.mo95660b(bVar);
    }

    /* renamed from: c */
    public void mo93118c() {
        this.f93935a.dispose();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C41204a mo93119d() {
        return this.f93935a;
    }

    /* renamed from: e */
    public abstract int mo93120e();

    /* renamed from: f */
    public String mo93121f() {
        return "";
    }

    /* renamed from: g */
    public abstract String mo93122g();

    /* renamed from: h */
    public Object mo93123h() {
        return null;
    }

    /* renamed from: i */
    public abstract boolean mo93124i();

    /* renamed from: j */
    public abstract boolean mo93125j();

    /* renamed from: k */
    public void mo93126k(C37177b bVar) {
    }

    /* renamed from: l */
    public abstract View mo93127l(ViewGroup viewGroup, C33702d dVar);

    /* renamed from: m */
    public void mo93128m(C37179d dVar, List list, C38421a aVar) {
        C41536l.m120489i(dVar, "debt");
        C41536l.m120489i(list, "debtInput");
        C41536l.m120489i(aVar, "oldConfig");
    }

    /* renamed from: n */
    public void mo93129n(String str, C31622e eVar) {
        C41536l.m120489i(eVar, "template");
    }

    /* renamed from: o */
    public void mo93130o(C39492b bVar) {
        C41536l.m120489i(bVar, "listener");
    }

    /* renamed from: p */
    public void mo93131p() {
    }

    /* renamed from: q */
    public void mo93132q(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo93133r(C41204a aVar) {
        C41536l.m120489i(aVar, "<set-?>");
        this.f93935a = aVar;
    }

    /* renamed from: s */
    public abstract void mo93134s(int i);

    /* renamed from: t */
    public abstract void mo93135t(boolean z);

    /* renamed from: u */
    public abstract void mo93136u(String str);

    /* renamed from: v */
    public abstract void mo93137v(boolean z);

    /* renamed from: w */
    public boolean mo93138w() {
        return true;
    }
}
