package p341ge.bog.mobilebank.statements;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1358e;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ge.bog.mobilebank.statements.DataBinderMapperImpl */
public class DataBinderMapperImpl extends C1358e {

    /* renamed from: a */
    private static final SparseIntArray f83900a = new SparseIntArray(0);

    /* renamed from: a */
    public List mo3957a() {
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.alexandrius.accordionswipelayout.library.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.products.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.shared.DataBinderMapperImpl());
        arrayList.add(new p341ge.bog.mobilebank.shared2.DataBinderMapperImpl());
        return arrayList;
    }

    /* renamed from: b */
    public ViewDataBinding mo3888b(C1359f fVar, View view, int i) {
        if (f83900a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: c */
    public ViewDataBinding mo3889c(C1359f fVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f83900a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
