package d50;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.pfm.transactioncategories.model.TransactionCategoryModel;
import p760fw.C20575a;

/* renamed from: d50.a */
public abstract class C19907a {

    /* renamed from: d50.a$a */
    public static final class C19908a implements Comparator {
        C19908a() {
        }

        /* renamed from: a */
        public int compare(TransactionCategoryModel transactionCategoryModel, TransactionCategoryModel transactionCategoryModel2) {
            C41536l.m120489i(transactionCategoryModel, "o1");
            C41536l.m120489i(transactionCategoryModel2, "o2");
            if (transactionCategoryModel.mo55075a() == 0) {
                return 1;
            }
            if (transactionCategoryModel2.mo55075a() == 0) {
                return -1;
            }
            if (transactionCategoryModel.mo55075a() > transactionCategoryModel2.mo55075a()) {
                return 1;
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static final TransactionCategoryModel m65797a(C20575a aVar) {
        ArrayList arrayList;
        C41536l.m120489i(aVar, "<this>");
        int parseColor = Color.parseColor("#" + aVar.mo49101a());
        long b = aVar.mo49102b();
        boolean c = aVar.mo49103c();
        String j = aVar.mo49112j();
        if (j == null) {
            j = "";
        }
        String str = j;
        Long k = aVar.mo49113k();
        boolean d = aVar.mo49104d();
        List<C20575a> i = aVar.mo49111i();
        if (i != null) {
            ArrayList arrayList2 = new ArrayList(C41343r.m119925u(i, 10));
            for (C20575a a : i) {
                arrayList2.add(m65797a(a));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        return new TransactionCategoryModel(parseColor, b, c, str, k, d, arrayList);
    }

    /* renamed from: b */
    public static final List m65798b(List list) {
        C41536l.m120489i(list, "<this>");
        ArrayList arrayList = new ArrayList(C41343r.m119925u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m65797a((C20575a) it.next()));
        }
        return C41358y.m120030t0(arrayList, new C19908a());
    }
}
