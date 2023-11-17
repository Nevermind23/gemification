package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5010k;
import java.util.Calendar;
import java.util.Locale;
import p009a8.C0078h;
import p009a8.C0080j;

/* renamed from: com.google.android.material.datepicker.y */
class C5046y extends RecyclerView.C1736h {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C5010k f16082d;

    /* renamed from: com.google.android.material.datepicker.y$a */
    class C5047a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ int f16083d;

        C5047a(int i) {
            this.f16083d = i;
        }

        public void onClick(View view) {
            C5046y.this.f16082d.mo16253C1(C5046y.this.f16082d.mo16257s1().mo16137g(Month.m19419b(this.f16083d, C5046y.this.f16082d.mo16259u1().f15926e)));
            C5046y.this.f16082d.mo16254D1(C5010k.C5021k.DAY);
        }
    }

    /* renamed from: com.google.android.material.datepicker.y$b */
    public static class C5048b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final TextView f16085d;

        C5048b(TextView textView) {
            super(textView);
            this.f16085d = textView;
        }
    }

    C5046y(C5010k kVar) {
        this.f16082d = kVar;
    }

    /* renamed from: g */
    private View.OnClickListener m19631g(int i) {
        return new C5047a(i);
    }

    public int getItemCount() {
        return this.f16082d.mo16257s1().mo16145p();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo16306h(int i) {
        return i - this.f16082d.mo16257s1().mo16144m().f15927f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo16307i(int i) {
        return this.f16082d.mo16257s1().mo16144m().f15927f + i;
    }

    /* renamed from: j */
    public void onBindViewHolder(C5048b bVar, int i) {
        C5000a aVar;
        int i2 = mo16307i(i);
        String string = bVar.f16085d.getContext().getString(C0080j.f349y);
        bVar.f16085d.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        bVar.f16085d.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i2)}));
        C5001b t1 = this.f16082d.mo16258t1();
        Calendar o = C5045x.m19623o();
        if (o.get(1) == i2) {
            aVar = t1.f15960f;
        } else {
            aVar = t1.f15958d;
        }
        for (Long longValue : this.f16082d.mo16260v1().mo16177p1()) {
            o.setTimeInMillis(longValue.longValue());
            if (o.get(1) == i2) {
                aVar = t1.f15959e;
            }
        }
        aVar.mo16242d(bVar.f16085d);
        bVar.f16085d.setOnClickListener(m19631g(i2));
    }

    /* renamed from: k */
    public C5048b onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C5048b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(C0078h.f309t, viewGroup, false));
    }
}
