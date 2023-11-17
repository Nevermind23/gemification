package fq0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import he1.C41238w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.loanactivation.presentation.activation.model.insuranceprovider.InsuranceProviderData;

/* renamed from: fq0.l */
public final class C31998l extends C21481a implements C31996j, C31997k {

    /* renamed from: d */
    private List f78779d;

    /* renamed from: e */
    private final C31996j f78780e = this;

    /* renamed from: f */
    private final C31997k f78781f = this;

    /* renamed from: g */
    private final C1644x f78782g;

    /* renamed from: h */
    private final C1644x f78783h;

    /* renamed from: i */
    private final C1644x f78784i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31998l(List list) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(list, "providers");
        this.f78779d = list;
        C1644x xVar = new C1644x();
        this.f78782g = xVar;
        this.f78783h = new C1644x();
        this.f78784i = new C1644x();
        xVar.mo4826r(this.f78779d);
    }

    /* renamed from: G3 */
    public LiveData mo72487G3() {
        return this.f78784i;
    }

    /* renamed from: Kr */
    public void mo72485Kr(String str) {
        C41536l.m120489i(str, "id");
        List<InsuranceProviderData> list = this.f78779d;
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        for (InsuranceProviderData insuranceProviderData : list) {
            insuranceProviderData.mo73536g(C41536l.m120484d(insuranceProviderData.mo73529a(), str));
            arrayList.add(C41238w.f97225a);
        }
        C37224b.m109965d(this.f78783h, str);
    }

    /* renamed from: R7 */
    public LiveData mo72488R7() {
        return this.f78783h;
    }

    /* renamed from: X0 */
    public LiveData mo72489X0() {
        return this.f78782g;
    }

    /* renamed from: X2 */
    public void mo72486X2() {
        Object obj;
        Iterator it = this.f78779d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InsuranceProviderData) obj).mo73535f()) {
                break;
            }
        }
        InsuranceProviderData insuranceProviderData = (InsuranceProviderData) obj;
        if (insuranceProviderData != null) {
            C37224b.m109965d(this.f78784i, insuranceProviderData);
        }
    }

    /* renamed from: dw */
    public final C31996j mo72490dw() {
        return this.f78780e;
    }

    /* renamed from: ew */
    public final C31997k mo72491ew() {
        return this.f78781f;
    }
}
