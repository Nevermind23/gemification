package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import com.google.android.material.internal.C5077e;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import p009a8.C0072b;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0080j;
import p184n8.C7342b;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C4999b();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Long f15946d;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    class C4998a extends C5004e {

        /* renamed from: j */
        final /* synthetic */ C5037q f15947j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4998a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, C5037q qVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f15947j = qVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo16226f() {
            this.f15947j.mo16272a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo16227g(Long l) {
            if (l == null) {
                SingleDateSelector.this.m19461d();
            } else {
                SingleDateSelector.this.mo16169B1(l.longValue());
            }
            this.f15947j.mo16273b(SingleDateSelector.this.mo16178s1());
        }
    }

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$b */
    class C4999b implements Parcelable.Creator {
        C4999b() {
        }

        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.f15946d = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m19461d() {
        this.f15946d = null;
    }

    /* renamed from: B1 */
    public void mo16169B1(long j) {
        this.f15946d = Long.valueOf(j);
    }

    /* renamed from: K0 */
    public String mo16170K0(Context context) {
        Resources resources = context.getResources();
        Long l = this.f15946d;
        if (l == null) {
            return resources.getString(C0080j.f343s);
        }
        String j = C5008i.m19503j(l.longValue());
        return resources.getString(C0080j.f341q, new Object[]{j});
    }

    /* renamed from: M0 */
    public Collection mo16171M0() {
        return new ArrayList();
    }

    /* renamed from: a1 */
    public View mo16173a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C5037q qVar) {
        View inflate = layoutInflater.inflate(C0078h.f312w, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C0076f.f247H);
        EditText editText = textInputLayout.getEditText();
        if (C5077e.m19859a()) {
            editText.setInputType(17);
        }
        SimpleDateFormat k = C5045x.m19619k();
        String l = C5045x.m19620l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l);
        Long l2 = this.f15946d;
        if (l2 != null) {
            editText.setText(k.format(l2));
        }
        editText.addTextChangedListener(new C4998a(l, k, textInputLayout, calendarConstraints, qVar));
        C5006g.m19492b(editText);
        return inflate;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Long mo16178s1() {
        return this.f15946d;
    }

    /* renamed from: e0 */
    public int mo16174e0() {
        return C0080j.f342r;
    }

    /* renamed from: f */
    public void mo16172O0(Long l) {
        this.f15946d = l == null ? null : Long.valueOf(C5045x.m19609a(l.longValue()));
    }

    /* renamed from: k1 */
    public boolean mo16175k1() {
        return this.f15946d != null;
    }

    /* renamed from: o0 */
    public int mo16176o0(Context context) {
        return C7342b.m28000d(context, C0072b.f126F, C5023l.class.getCanonicalName());
    }

    /* renamed from: p1 */
    public Collection mo16177p1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f15946d;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f15946d);
    }
}
