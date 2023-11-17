package com.alexandrius.accordionswipelayout.library;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.C1358e;
import androidx.databinding.C1359f;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.List;

public class DataBinderMapperImpl extends C1358e {

    /* renamed from: a */
    private static final SparseIntArray f7431a = new SparseIntArray(0);

    /* renamed from: a */
    public List mo3957a() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    /* renamed from: b */
    public ViewDataBinding mo3888b(C1359f fVar, View view, int i) {
        if (f7431a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    /* renamed from: c */
    public ViewDataBinding mo3889c(C1359f fVar, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || f7431a.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
