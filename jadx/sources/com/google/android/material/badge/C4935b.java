package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: com.google.android.material.badge.b */
public abstract class C4935b {

    /* renamed from: a */
    public static final boolean f15557a = false;

    /* renamed from: a */
    public static void m18851a(C4933a aVar, View view, FrameLayout frameLayout) {
        m18855e(aVar, view, frameLayout);
        if (aVar.mo15523i() != null) {
            aVar.mo15523i().setForeground(aVar);
        } else if (!f15557a) {
            view.getOverlay().add(aVar);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static SparseArray m18852b(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray sparseArray = new SparseArray(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i);
            if (state != null) {
                sparseArray.put(keyAt, C4933a.m18820e(context, state));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static ParcelableSparseArray m18853c(SparseArray sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            C4933a aVar = (C4933a) sparseArray.valueAt(i);
            if (aVar != null) {
                parcelableSparseArray.put(keyAt, aVar.mo15528m());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m18854d(C4933a aVar, View view) {
        if (aVar != null) {
            if (f15557a || aVar.mo15523i() != null) {
                aVar.mo15523i().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(aVar);
            }
        }
    }

    /* renamed from: e */
    public static void m18855e(C4933a aVar, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        aVar.setBounds(rect);
        aVar.mo15514K(view, frameLayout);
    }

    /* renamed from: f */
    public static void m18856f(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
