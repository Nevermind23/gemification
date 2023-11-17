package p747et;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryAddResponse;
import p341ge.bog.mobilebank.cleanarch.data.pfm.transactioncategories.entity.TransactionCategoryEntity;
import p760fw.C20575a;
import r90.C27950a;

/* renamed from: et.a */
public final class C20290a {
    /* renamed from: a */
    public final C20575a mo48770a(TransactionCategoryAddResponse transactionCategoryAddResponse) {
        C41536l.m120489i(transactionCategoryAddResponse, "transaction");
        return mo48771b(transactionCategoryAddResponse.getPfmData());
    }

    /* renamed from: b */
    public final C20575a mo48771b(TransactionCategoryEntity transactionCategoryEntity) {
        boolean z;
        ArrayList arrayList;
        ArrayList arrayList2;
        String str;
        C41536l.m120489i(transactionCategoryEntity, "transactionCategoryEntity");
        boolean catComputable = transactionCategoryEntity.getCatComputable();
        String catHexrgbcolor = transactionCategoryEntity.getCatHexrgbcolor();
        long catId = transactionCategoryEntity.getCatId();
        boolean catIsCustom = transactionCategoryEntity.getCatIsCustom();
        boolean catIsIncome = transactionCategoryEntity.getCatIsIncome();
        Boolean catIsbudgetizable = transactionCategoryEntity.getCatIsbudgetizable();
        if (catIsbudgetizable != null) {
            z = catIsbudgetizable.booleanValue();
        } else {
            z = false;
        }
        String catKey = transactionCategoryEntity.getCatKey();
        int catLevel = transactionCategoryEntity.getCatLevel();
        String catName = transactionCategoryEntity.getCatName();
        Integer catOrder = transactionCategoryEntity.getCatOrder();
        Long parentCatId = transactionCategoryEntity.getParentCatId();
        List<TransactionCategoryEntity> categories = transactionCategoryEntity.getCategories();
        if (categories != null) {
            ArrayList arrayList3 = new ArrayList(C41343r.m119925u(categories, 10));
            Iterator<T> it = categories.iterator();
            while (it.hasNext()) {
                Iterator<T> it2 = it;
                arrayList3.add(mo48771b((TransactionCategoryEntity) it.next()));
                it = it2;
            }
            arrayList = arrayList3;
        } else {
            arrayList = null;
        }
        if (transactionCategoryEntity.getCatIsCustom()) {
            str = transactionCategoryEntity.getCatName();
            arrayList2 = arrayList;
        } else {
            arrayList2 = arrayList;
            str = C27950a.m86287d(transactionCategoryEntity.getCatKey(), false, 2, (Object) null);
        }
        return new C20575a(catComputable, catHexrgbcolor, catId, catIsCustom, catIsIncome, z, catKey, catLevel, catName, catOrder, parentCatId, arrayList2, str);
    }

    /* renamed from: c */
    public final List mo48772c(List list) {
        C41536l.m120489i(list, "transactions");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(mo48771b((TransactionCategoryEntity) it.next()));
        }
        return arrayList;
    }
}
