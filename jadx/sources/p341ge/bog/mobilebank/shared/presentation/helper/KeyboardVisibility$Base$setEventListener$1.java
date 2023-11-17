package p341ge.bog.mobilebank.shared.presentation.helper;

import androidx.lifecycle.C1577e;
import androidx.lifecycle.C1579f;
import androidx.lifecycle.C1619q;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility;

/* renamed from: ge.bog.mobilebank.shared.presentation.helper.KeyboardVisibility$Base$setEventListener$1 */
public final class KeyboardVisibility$Base$setEventListener$1 implements C1579f {

    /* renamed from: d */
    final /* synthetic */ KeyboardVisibility.Base.C34650a f83766d;

    /* renamed from: e */
    final /* synthetic */ C1619q f83767e;

    KeyboardVisibility$Base$setEventListener$1(KeyboardVisibility.Base.C34650a aVar, C1619q qVar) {
        this.f83766d = aVar;
        this.f83767e = qVar;
    }

    /* renamed from: a */
    public /* synthetic */ void mo3970a(C1619q qVar) {
        C1577e.m5595a(this, qVar);
    }

    /* renamed from: d */
    public /* synthetic */ void mo3971d(C1619q qVar) {
        C1577e.m5598d(this, qVar);
    }

    /* renamed from: e */
    public /* synthetic */ void mo3972e(C1619q qVar) {
        C1577e.m5597c(this, qVar);
    }

    public void onDestroy(C1619q qVar) {
        C41536l.m120489i(qVar, "owner");
        this.f83766d.unregister();
        this.f83767e.getLifecycle().mo4909d(this);
    }

    public /* synthetic */ void onStart(C1619q qVar) {
        C1577e.m5599e(this, qVar);
    }

    public /* synthetic */ void onStop(C1619q qVar) {
        C1577e.m5600f(this, qVar);
    }
}
