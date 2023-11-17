package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.C1817m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.google.android.material.datepicker.s */
abstract class C5039s extends LinearLayoutManager {

    /* renamed from: com.google.android.material.datepicker.s$a */
    class C5040a extends C1817m {
        C5040a(Context context) {
            super(context);
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public float mo6019v(DisplayMetrics displayMetrics) {
            return 100.0f / ((float) displayMetrics.densityDpi);
        }
    }

    C5039s(Context context, int i, boolean z) {
        super(context, i, z);
    }

    /* renamed from: V1 */
    public void mo5208V1(RecyclerView recyclerView, RecyclerView.C1726b0 b0Var, int i) {
        C5040a aVar = new C5040a(recyclerView.getContext());
        aVar.mo5452p(i);
        mo5662W1(aVar);
    }
}
