package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.C5010k;
import p009a8.C0076f;
import p009a8.C0078h;

/* renamed from: com.google.android.material.datepicker.p */
class C5034p extends RecyclerView.C1736h {

    /* renamed from: d */
    private final CalendarConstraints f16068d;

    /* renamed from: e */
    private final DateSelector f16069e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C5010k.C5022l f16070f;

    /* renamed from: g */
    private final int f16071g;

    /* renamed from: com.google.android.material.datepicker.p$a */
    class C5035a implements AdapterView.OnItemClickListener {

        /* renamed from: d */
        final /* synthetic */ MaterialCalendarGridView f16072d;

        C5035a(MaterialCalendarGridView materialCalendarGridView) {
            this.f16072d = materialCalendarGridView;
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            if (this.f16072d.getAdapter().mo16296n(i)) {
                C5034p.this.f16070f.mo16263a(this.f16072d.getAdapter().getItem(i).longValue());
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.p$b */
    public static class C5036b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final TextView f16074d;

        /* renamed from: e */
        final MaterialCalendarGridView f16075e;

        C5036b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(C0076f.f285w);
            this.f16074d = textView;
            ViewCompat.m3621s0(textView, true);
            this.f16075e = (MaterialCalendarGridView) linearLayout.findViewById(C0076f.f281s);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    C5034p(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, C5010k.C5022l lVar) {
        int i;
        Month m = calendarConstraints.mo16144m();
        Month i2 = calendarConstraints.mo16140i();
        Month l = calendarConstraints.mo16143l();
        if (m.compareTo(l) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (l.compareTo(i2) <= 0) {
            int x1 = C5033o.f16061i * C5010k.m19520x1(context);
            if (C5023l.m19551R1(context)) {
                i = C5010k.m19520x1(context);
            } else {
                i = 0;
            }
            this.f16071g = x1 + i;
            this.f16068d = calendarConstraints;
            this.f16069e = dateSelector;
            this.f16070f = lVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Month mo16297g(int i) {
        return this.f16068d.mo16144m().mo16215r(i);
    }

    public int getItemCount() {
        return this.f16068d.mo16142k();
    }

    public long getItemId(int i) {
        return this.f16068d.mo16144m().mo16215r(i).mo16214q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public CharSequence mo16298h(int i) {
        return mo16297g(i).mo16213l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo16299i(Month month) {
        return this.f16068d.mo16144m().mo16216s(month);
    }

    /* renamed from: j */
    public void onBindViewHolder(C5036b bVar, int i) {
        Month r = this.f16068d.mo16144m().mo16215r(i);
        bVar.f16074d.setText(r.mo16213l());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f16075e.findViewById(C0076f.f281s);
        if (materialCalendarGridView.getAdapter() == null || !r.equals(materialCalendarGridView.getAdapter().f16063d)) {
            C5033o oVar = new C5033o(r, this.f16069e, this.f16068d);
            materialCalendarGridView.setNumColumns(r.f15928g);
            materialCalendarGridView.setAdapter((ListAdapter) oVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().mo16295m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new C5035a(materialCalendarGridView));
    }

    /* renamed from: k */
    public C5036b onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(C0078h.f307r, viewGroup, false);
        if (!C5023l.m19551R1(viewGroup.getContext())) {
            return new C5036b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.C1752q(-1, this.f16071g));
        return new C5036b(linearLayout, true);
    }
}
