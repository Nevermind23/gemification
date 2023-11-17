package p01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.cardchooser.model.CardChooserData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.AvailableAmount;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardExternalFileData;
import p341ge.bog.mobilebank.qrwithdrawal.presentation.model.CardUiModel;
import p669xh.C18763a;

/* renamed from: p01.e */
public final class C37882e {
    /* renamed from: a */
    public final List mo91226a(CardChooserData cardChooserData) {
        CardUiModel cardUiModel;
        Object obj;
        Object obj2;
        C41536l.m120489i(cardChooserData, "data");
        List<CardUiModel> a = cardChooserData.mo82881a();
        ArrayList arrayList = new ArrayList();
        for (CardUiModel cardUiModel2 : a) {
            Iterator it = cardUiModel2.mo82983d().iterator();
            while (true) {
                cardUiModel = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C41536l.m120484d(((AvailableAmount) obj).mo82944b(), cardChooserData.mo82882b())) {
                    break;
                }
            }
            AvailableAmount availableAmount = (AvailableAmount) obj;
            if (availableAmount == null || C41536l.m120484d(availableAmount.mo82943a(), BigDecimal.ZERO)) {
                Iterator it2 = cardUiModel2.mo82983d().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (C41536l.m120484d(((AvailableAmount) obj2).mo82944b(), "GEL")) {
                        break;
                    }
                }
                availableAmount = (AvailableAmount) obj2;
            }
            AvailableAmount availableAmount2 = availableAmount;
            if (availableAmount2 != null) {
                cardUiModel = CardUiModel.m101236b(cardUiModel2, (String) null, (String) null, false, (String) null, 0, (String) null, (String) null, (C18763a) null, (CardExternalFileData) null, (CardExternalFileData) null, (List) null, availableAmount2, false, C41536l.m120484d(cardUiModel2.mo82989h(), cardChooserData.mo82885e()), false, 22527, (Object) null);
            }
            if (cardUiModel != null) {
                arrayList.add(cardUiModel);
            }
        }
        return arrayList;
    }
}
