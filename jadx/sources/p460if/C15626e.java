package p460if;

import be1.C40329b;
import be1.C40330c;
import dg1.C40681e;
import ed1.C40741h;
import kotlin.jvm.internal.C41536l;
import of1.C41880d0;
import of1.C41897h0;
import of1.C41901i0;
import p652we.C18539d;
import p652we.C18549h;
import p652we.C18561l;

/* renamed from: if.e */
public final class C15626e extends C41901i0 {

    /* renamed from: a */
    private final C40329b f44431a;

    public C15626e() {
        C40329b K = C40330c.m116776M().mo94358K();
        C41536l.m120485e(K, "PublishProcessor.create<…t.Event>().toSerialized()");
        this.f44431a = K;
    }

    /* renamed from: a */
    public void mo42923a(C41897h0 h0Var, int i, String str) {
        C41536l.m120490j(h0Var, "webSocket");
        C41536l.m120490j(str, "reason");
        this.f44431a.onNext(new C18561l.C18562a.C18563a(new C18549h(i, str)));
    }

    /* renamed from: b */
    public void mo42924b(C41897h0 h0Var, int i, String str) {
        C41536l.m120490j(h0Var, "webSocket");
        C41536l.m120490j(str, "reason");
        this.f44431a.onNext(new C18561l.C18562a.C18564b(new C18549h(i, str)));
    }

    /* renamed from: c */
    public void mo42925c(C41897h0 h0Var, Throwable th, C41880d0 d0Var) {
        C41536l.m120490j(h0Var, "webSocket");
        C41536l.m120490j(th, "t");
        this.f44431a.onNext(new C18561l.C18562a.C18565c(th));
    }

    /* renamed from: d */
    public void mo42926d(C41897h0 h0Var, C40681e eVar) {
        C41536l.m120490j(h0Var, "webSocket");
        C41536l.m120490j(eVar, "bytes");
        C40329b bVar = this.f44431a;
        byte[] E = eVar.mo94796E();
        C41536l.m120485e(E, "bytes.toByteArray()");
        bVar.onNext(new C18561l.C18562a.C18567e(new C18539d.C18540a(E)));
    }

    /* renamed from: e */
    public void mo42927e(C41897h0 h0Var, String str) {
        C41536l.m120490j(h0Var, "webSocket");
        C41536l.m120490j(str, "text");
        this.f44431a.onNext(new C18561l.C18562a.C18567e(new C18539d.C18541b(str)));
    }

    /* renamed from: f */
    public void mo42928f(C41897h0 h0Var, C41880d0 d0Var) {
        C41536l.m120490j(h0Var, "webSocket");
        C41536l.m120490j(d0Var, "response");
        this.f44431a.onNext(new C18561l.C18562a.C18566d(h0Var));
    }

    /* renamed from: g */
    public final C40741h mo42929g() {
        C40741h y = this.f44431a.mo94942y();
        C41536l.m120485e(y, "processor.onBackpressureBuffer()");
        return y;
    }

    /* renamed from: h */
    public final void mo42930h() {
        this.f44431a.onComplete();
    }
}
