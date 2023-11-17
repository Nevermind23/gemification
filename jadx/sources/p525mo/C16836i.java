package p525mo;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import hd1.C41204a;
import j51.C36732d;
import java.util.ArrayList;
import java.util.List;
import k51.C36873a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.categorypackages.presentation.application.firststage.model.EmailUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p539no.C17132a;
import p581qo.C17572a;

/* renamed from: mo.i */
public final class C16836i extends C21481a implements C16834g, C16835h {

    /* renamed from: d */
    private final String f47116d;

    /* renamed from: e */
    private final C16834g f47117e = this;

    /* renamed from: f */
    private final C16835h f47118f = this;

    /* renamed from: g */
    private final C1644x f47119g = new C1644x();

    /* renamed from: h */
    private final C1644x f47120h = new C1644x();

    /* renamed from: mo.i$a */
    public interface C16837a {
        /* renamed from: a */
        C16836i mo32826a(String str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C16836i(String str, C36732d dVar, C17572a aVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(str, "selectedEmailId");
        C41536l.m120489i(dVar, "getEmails");
        C41536l.m120489i(aVar, "mapper");
        this.f47116d = str;
        List<C36873a> a = dVar.mo89559a();
        ArrayList<EmailUiModel> arrayList = new ArrayList<>(C41343r.m119925u(a, 10));
        for (C36873a a2 : a) {
            arrayList.add(aVar.mo45105a(a2));
        }
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (EmailUiModel emailUiModel : arrayList) {
            arrayList2.add(new C17132a(emailUiModel, C41536l.m120484d(emailUiModel.mo40656b(), this.f47116d)));
        }
        this.f47120h.mo4826r(arrayList2);
    }

    /* renamed from: R0 */
    public LiveData mo43956R0() {
        return this.f47119g;
    }

    /* renamed from: Ue */
    public void mo43955Ue(EmailUiModel emailUiModel) {
        C41536l.m120489i(emailUiModel, "email");
        C37224b.m109965d(this.f47119g, emailUiModel);
    }

    /* renamed from: dw */
    public final C16834g mo43958dw() {
        return this.f47117e;
    }

    /* renamed from: ew */
    public final C16835h mo43959ew() {
        return this.f47118f;
    }

    /* renamed from: q */
    public LiveData mo43957q() {
        return this.f47120h;
    }
}
