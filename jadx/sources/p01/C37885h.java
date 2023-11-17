package p01;

import androidx.lifecycle.C1644x;
import hd1.C41204a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p341ge.bog.mobilebank.cleanarch.presentation.common.C21481a;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel;
import p669xh.C18763a;
import q01.C38098a;
import q01.C38099b;

/* renamed from: p01.h */
public final class C37885h extends C21481a implements C37883f, C37884g {

    /* renamed from: d */
    private final CardChooserData f90946d;

    /* renamed from: e */
    private final C37883f f90947e = this;

    /* renamed from: f */
    private final C37884g f90948f = this;

    /* renamed from: g */
    private final C1644x f90949g = new C1644x();

    /* renamed from: h */
    private final C1644x f90950h = new C1644x();

    /* renamed from: i */
    private final C1644x f90951i = new C1644x();

    /* renamed from: p01.h$a */
    public interface C37886a {
        /* renamed from: a */
        C37885h mo32803a(CardChooserData cardChooserData);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37885h(CardChooserData cardChooserData, C37882e eVar) {
        super((C41204a) null, 1, (DefaultConstructorMarker) null);
        Object obj;
        CardChooserData cardChooserData2 = cardChooserData;
        C37882e eVar2 = eVar;
        C41536l.m120489i(cardChooserData2, "data");
        C41536l.m120489i(eVar2, "mapper");
        C38098a aVar = null;
        this.f90946d = cardChooserData2;
        Iterator it = cardChooserData.mo82881a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (C41536l.m120484d(((CardUiModel) obj).mo82989h(), this.f90946d.mo82885e())) {
                break;
            }
        }
        CardUiModel cardUiModel = (CardUiModel) obj;
        if (this.f90946d.mo82881a().isEmpty()) {
            aVar = C38098a.NO_CARDS;
        } else if (this.f90946d.mo82881a().size() == 1 && ((CardUiModel) C41358y.m120007W(this.f90946d.mo82881a())).mo82991i().mo82943a().compareTo(this.f90946d.mo82883d()) < 0) {
            aVar = C38098a.INSUFFICIENT_FUNDS_SINGLE_CARD;
        } else if (cardUiModel != null) {
            if (cardUiModel.mo82995m()) {
                aVar = C38098a.CARD_BLOCKED;
            } else if (cardUiModel.mo82991i().mo82943a().compareTo(this.f90946d.mo82883d()) < 0) {
                aVar = C38098a.INSUFFICIENT_FUNDS;
            }
        }
        C1644x fw = mo91228a();
        List<CardUiModel> a = eVar2.mo91226a(this.f90946d);
        ArrayList arrayList = new ArrayList(C41343r.m119925u(a, 10));
        for (CardUiModel cardUiModel2 : a) {
            if (C41536l.m120484d(cardUiModel2.mo82989h(), this.f90946d.mo82885e())) {
                cardUiModel2 = CardUiModel.m101236b(cardUiModel2, (String) null, (String) null, false, (String) null, 0, (String) null, (String) null, (C18763a) null, (CardExternalFileData) null, (CardExternalFileData) null, (List) null, (AvailableAmount) null, false, true, false, 24575, (Object) null);
            }
            arrayList.add(cardUiModel2);
        }
        fw.mo4826r(new C38099b(aVar, arrayList));
    }

    /* renamed from: dw */
    public final C37883f mo91230dw() {
        return this.f90947e;
    }

    /* renamed from: ew */
    public final C37884g mo91231ew() {
        return this.f90948f;
    }

    /* renamed from: fw */
    public C1644x mo91228a() {
        return this.f90949g;
    }

    /* renamed from: gw */
    public C1644x mo91229r6() {
        return this.f90950h;
    }

    /* renamed from: x9 */
    public void mo91227x9(CardUiModel cardUiModel) {
        C41536l.m120489i(cardUiModel, "card");
        C37224b.m109965d(mo91229r6(), cardUiModel);
    }
}
