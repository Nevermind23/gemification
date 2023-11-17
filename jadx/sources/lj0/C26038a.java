package lj0;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import ue1.C43080q;

/* renamed from: lj0.a */
public abstract class C26038a extends C35651n1 {

    /* renamed from: d */
    private final C43080q f66130d;

    /* renamed from: e */
    private C6201a f66131e;

    public C26038a(C43080q qVar) {
        C41536l.m120489i(qVar, "inflate");
        this.f66130d = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i1 */
    public final C6201a mo64933i1() {
        C6201a aVar = this.f66131e;
        C41536l.m120486f(aVar);
        return aVar;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        this.f66131e = (C6201a) this.f66130d.invoke(layoutInflater, viewGroup, Boolean.FALSE);
        return mo64933i1().mo3946b();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f66131e = null;
    }
}
