package p341ge.bog.mobilebank;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1358e;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;
import p366bk.C10324m;
import p90.C27257b3;
import p90.C27307g3;
import p90.C27327i3;
import p90.C27356l3;
import p90.C27401q3;
import p90.C27418s2;
import p90.C27419s3;
import p90.C27437u3;
import p90.C27467x6;

/* renamed from: ge.bog.mobilebank.DataBinderMapperImpl */
public class DataBinderMapperImpl extends C1358e {

    /* renamed from: a */
    private static final SparseIntArray f40617a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(9);
        f40617a = sparseIntArray;
        sparseIntArray.put(C10324m.credit_card_detailed, 1);
        sparseIntArray.put(C10324m.dialog_plus_gift_message, 2);
        sparseIntArray.put(C10324m.fragment_account_detailed, 3);
        sparseIntArray.put(C10324m.fragment_bond_details, 4);
        sparseIntArray.put(C10324m.fragment_card_detailed, 5);
        sparseIntArray.put(C10324m.fragment_deposit_bond_details, 6);
        sparseIntArray.put(C10324m.fragment_deposit_detailed, 7);
        sparseIntArray.put(C10324m.fragment_loan_details, 8);
        sparseIntArray.put(C10324m.layout_credit_info_banner, 9);
    }

    /* renamed from: a */
    public List mo3957a() {
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.alexandrius.accordionswipelayout.library.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.externallibs.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.shared2.DataBinderMapperImpl());
        return arrayList;
    }

    /* renamed from: b */
    public ViewDataBinding mo3888b(C1359f fVar, View view, int i) {
        int i2 = f40617a.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag != null) {
            switch (i2) {
                case 1:
                    if ("layout/credit_card_detailed_0".equals(tag)) {
                        return new C27418s2(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for credit_card_detailed is invalid. Received: " + tag);
                case 2:
                    if ("layout/dialog_plus_gift_message_0".equals(tag)) {
                        return new C27257b3(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for dialog_plus_gift_message is invalid. Received: " + tag);
                case 3:
                    if ("layout/fragment_account_detailed_0".equals(tag)) {
                        return new C27307g3(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_account_detailed is invalid. Received: " + tag);
                case 4:
                    if ("layout/fragment_bond_details_0".equals(tag)) {
                        return new C27327i3(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_bond_details is invalid. Received: " + tag);
                case 5:
                    if ("layout/fragment_card_detailed_0".equals(tag)) {
                        return new C27356l3(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_card_detailed is invalid. Received: " + tag);
                case 6:
                    if ("layout/fragment_deposit_bond_details_0".equals(tag)) {
                        return new C27401q3(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_deposit_bond_details is invalid. Received: " + tag);
                case 7:
                    if ("layout/fragment_deposit_detailed_0".equals(tag)) {
                        return new C27419s3(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_deposit_detailed is invalid. Received: " + tag);
                case 8:
                    if ("layout/fragment_loan_details_0".equals(tag)) {
                        return new C27437u3(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for fragment_loan_details is invalid. Received: " + tag);
                case 9:
                    if ("layout/layout_credit_info_banner_0".equals(tag)) {
                        return new C27467x6(fVar, view);
                    }
                    throw new IllegalArgumentException("The tag for layout_credit_info_banner is invalid. Received: " + tag);
                default:
                    return null;
            }
        } else {
            throw new RuntimeException("view must have a tag");
        }
    }

    /* renamed from: c */
    public ViewDataBinding mo3889c(C1359f fVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f40617a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
