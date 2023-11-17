package p860pt;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.savinggoal.entity.DepositPurposeApiEntity;
import p926vw.C29181a;

/* renamed from: pt.a */
public final class C27620a {
    /* renamed from: a */
    public final List mo66992a(List list) {
        C41536l.m120489i(list, "depositPurposes");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo66993b((DepositPurposeApiEntity) it.next()));
        }
        return arrayList;
    }

    /* renamed from: b */
    public final C29181a mo66993b(DepositPurposeApiEntity depositPurposeApiEntity) {
        C41536l.m120489i(depositPurposeApiEntity, "depositPurposeApiEntity");
        return new C29181a(depositPurposeApiEntity.getId(), depositPurposeApiEntity.getSavingGoalId(), depositPurposeApiEntity.getOrderNumber(), depositPurposeApiEntity.getDictionaryKey(), depositPurposeApiEntity.getLookupValue());
    }
}
