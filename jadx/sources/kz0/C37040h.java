package kz0;

import androidx.lifecycle.C1644x;
import androidx.lifecycle.LiveData;
import g91.C32343x;
import hd1.C41204a;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.cleanarch.shareddomain.model.cards.CardInsSecCardModel;
import p341ge.bog.mobilebank.products.presentation.details.models.CardUiModel;
import rz0.C38399b;

/* renamed from: kz0.h */
public final class C37040h extends C21481a implements C37038f, C37039g {

    /* renamed from: d */
    private final List f89184d;

    /* renamed from: e */
    private final C37038f f89185e = this;

    /* renamed from: f */
    private final C37039g f89186f = this;

    /* renamed from: g */
    private final C1644x f89187g = new C1644x();

    /* renamed from: h */
    private final C1644x f89188h = new C1644x();

    /* renamed from: kz0.h$a */
    public interface C37041a {
        /* renamed from: a */
        C37040h mo32789a(List list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37040h(List list, C38399b bVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        C41536l.m120489i(list, "cards");
        C41536l.m120489i(bVar, "mapper");
        this.f89184d = list;
        mo89958s().mo4826r(bVar.mo91924d(list));
    }

    /* renamed from: dw */
    public C1644x mo89958s() {
        return this.f89187g;
    }

    /* renamed from: ew */
    public final C37038f mo89960ew() {
        return this.f89185e;
    }

    /* renamed from: fw */
    public final C37039g mo89961fw() {
        return this.f89186f;
    }

    /* renamed from: o */
    public LiveData mo89957o() {
        return this.f89188h;
    }

    /* renamed from: uf */
    public void mo89956uf(String str) {
        Object obj;
        CardInsSecCardModel d;
        C41536l.m120489i(str, "cardId");
        Iterator it = this.f89184d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((CardUiModel) obj).mo82609b(), str)) {
                break;
            }
        }
        CardUiModel cardUiModel = (CardUiModel) obj;
        if (cardUiModel != null && (d = cardUiModel.mo82610d()) != null) {
            this.f89188h.mo4826r(C32343x.m95466m(d));
        }
    }
}
