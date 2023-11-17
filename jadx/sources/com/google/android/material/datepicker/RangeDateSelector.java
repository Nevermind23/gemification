package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.util.C1004d;
import androidx.core.util.C1008h;
import com.google.android.material.internal.C5077e;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import p009a8.C0072b;
import p009a8.C0074d;
import p009a8.C0076f;
import p009a8.C0078h;
import p009a8.C0080j;
import p184n8.C7342b;

public class RangeDateSelector implements DateSelector<C1004d> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C4997c();

    /* renamed from: d */
    private String f15932d;

    /* renamed from: e */
    private final String f15933e = " ";
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Long f15934f = null;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Long f15935g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Long f15936h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Long f15937i = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    class C4995a extends C5004e {

        /* renamed from: j */
        final /* synthetic */ TextInputLayout f15938j;

        /* renamed from: k */
        final /* synthetic */ TextInputLayout f15939k;

        /* renamed from: l */
        final /* synthetic */ C5037q f15940l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4995a(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C5037q qVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f15938j = textInputLayout2;
            this.f15939k = textInputLayout3;
            this.f15940l = qVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo16226f() {
            Long unused = RangeDateSelector.this.f15936h = null;
            RangeDateSelector.this.m19440l(this.f15938j, this.f15939k, this.f15940l);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo16227g(Long l) {
            Long unused = RangeDateSelector.this.f15936h = l;
            RangeDateSelector.this.m19440l(this.f15938j, this.f15939k, this.f15940l);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$b */
    class C4996b extends C5004e {

        /* renamed from: j */
        final /* synthetic */ TextInputLayout f15942j;

        /* renamed from: k */
        final /* synthetic */ TextInputLayout f15943k;

        /* renamed from: l */
        final /* synthetic */ C5037q f15944l;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C4996b(String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, C5037q qVar) {
            super(str, dateFormat, textInputLayout, calendarConstraints);
            this.f15942j = textInputLayout2;
            this.f15943k = textInputLayout3;
            this.f15944l = qVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo16226f() {
            Long unused = RangeDateSelector.this.f15937i = null;
            RangeDateSelector.this.m19440l(this.f15942j, this.f15943k, this.f15944l);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo16227g(Long l) {
            Long unused = RangeDateSelector.this.f15937i = l;
            RangeDateSelector.this.m19440l(this.f15942j, this.f15943k, this.f15944l);
        }
    }

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$c */
    class C4997c implements Parcelable.Creator {
        C4997c() {
        }

        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Class<Long> cls = Long.class;
            Long unused = rangeDateSelector.f15934f = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.f15935g = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    /* renamed from: g */
    private void m19437g(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        if (textInputLayout.getError() != null && this.f15932d.contentEquals(textInputLayout.getError())) {
            textInputLayout.setError((CharSequence) null);
        }
        if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
            textInputLayout2.setError((CharSequence) null);
        }
    }

    /* renamed from: i */
    private boolean m19438i(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: j */
    private void m19439j(TextInputLayout textInputLayout, TextInputLayout textInputLayout2) {
        textInputLayout.setError(this.f15932d);
        textInputLayout2.setError(" ");
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m19440l(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, C5037q qVar) {
        Long l = this.f15936h;
        if (l == null || this.f15937i == null) {
            m19437g(textInputLayout, textInputLayout2);
            qVar.mo16272a();
        } else if (m19438i(l.longValue(), this.f15937i.longValue())) {
            this.f15934f = this.f15936h;
            this.f15935g = this.f15937i;
            qVar.mo16273b(mo16178s1());
        } else {
            m19439j(textInputLayout, textInputLayout2);
            qVar.mo16272a();
        }
    }

    /* renamed from: B1 */
    public void mo16169B1(long j) {
        Long l = this.f15934f;
        if (l == null) {
            this.f15934f = Long.valueOf(j);
        } else if (this.f15935g != null || !m19438i(l.longValue(), j)) {
            this.f15935g = null;
            this.f15934f = Long.valueOf(j);
        } else {
            this.f15935g = Long.valueOf(j);
        }
    }

    /* renamed from: K0 */
    public String mo16170K0(Context context) {
        Resources resources = context.getResources();
        Long l = this.f15934f;
        if (l == null && this.f15935g == null) {
            return resources.getString(C0080j.f319E);
        }
        Long l2 = this.f15935g;
        if (l2 == null) {
            return resources.getString(C0080j.f316B, new Object[]{C5008i.m19496c(l.longValue())});
        } else if (l == null) {
            return resources.getString(C0080j.f315A, new Object[]{C5008i.m19496c(l2.longValue())});
        } else {
            C1004d a = C5008i.m19494a(l, l2);
            return resources.getString(C0080j.f317C, new Object[]{a.f3642a, a.f3643b});
        }
    }

    /* renamed from: M0 */
    public Collection mo16171M0() {
        if (this.f15934f == null || this.f15935g == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C1004d(this.f15934f, this.f15935g));
        return arrayList;
    }

    /* renamed from: a1 */
    public View mo16173a1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, CalendarConstraints calendarConstraints, C5037q qVar) {
        View inflate = layoutInflater.inflate(C0078h.f313x, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) inflate.findViewById(C0076f.f249J);
        TextInputLayout textInputLayout2 = (TextInputLayout) inflate.findViewById(C0076f.f248I);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (C5077e.m19859a()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f15932d = inflate.getResources().getString(C0080j.f348x);
        SimpleDateFormat k = C5045x.m19619k();
        Long l = this.f15934f;
        if (l != null) {
            editText.setText(k.format(l));
            this.f15936h = this.f15934f;
        }
        Long l2 = this.f15935g;
        if (l2 != null) {
            editText2.setText(k.format(l2));
            this.f15937i = this.f15935g;
        }
        String l3 = C5045x.m19620l(inflate.getResources(), k);
        textInputLayout.setPlaceholderText(l3);
        textInputLayout2.setPlaceholderText(l3);
        CalendarConstraints calendarConstraints2 = calendarConstraints;
        C4995a aVar = r0;
        TextInputLayout textInputLayout3 = textInputLayout;
        String str = l3;
        TextInputLayout textInputLayout4 = textInputLayout2;
        SimpleDateFormat simpleDateFormat = k;
        C5037q qVar2 = qVar;
        C4995a aVar2 = new C4995a(l3, k, textInputLayout, calendarConstraints2, textInputLayout3, textInputLayout4, qVar2);
        editText.addTextChangedListener(aVar);
        editText2.addTextChangedListener(new C4996b(str, simpleDateFormat, textInputLayout2, calendarConstraints2, textInputLayout3, textInputLayout4, qVar2));
        C5006g.m19492b(editText, editText2);
        return inflate;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e0 */
    public int mo16174e0() {
        return C0080j.f318D;
    }

    /* renamed from: h */
    public C1004d mo16178s1() {
        return new C1004d(this.f15934f, this.f15935g);
    }

    /* renamed from: k */
    public void mo16172O0(C1004d dVar) {
        Long l;
        Object obj = dVar.f3642a;
        if (!(obj == null || dVar.f3643b == null)) {
            C1008h.m3524a(m19438i(((Long) obj).longValue(), ((Long) dVar.f3643b).longValue()));
        }
        Object obj2 = dVar.f3642a;
        Long l2 = null;
        if (obj2 == null) {
            l = null;
        } else {
            l = Long.valueOf(C5045x.m19609a(((Long) obj2).longValue()));
        }
        this.f15934f = l;
        Object obj3 = dVar.f3643b;
        if (obj3 != null) {
            l2 = Long.valueOf(C5045x.m19609a(((Long) obj3).longValue()));
        }
        this.f15935g = l2;
    }

    /* renamed from: k1 */
    public boolean mo16175k1() {
        Long l = this.f15934f;
        if (l == null || this.f15935g == null || !m19438i(l.longValue(), this.f15935g.longValue())) {
            return false;
        }
        return true;
    }

    /* renamed from: o0 */
    public int mo16176o0(Context context) {
        int i;
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        if (Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(C0074d.f189T)) {
            i = C0072b.f126F;
        } else {
            i = C0072b.f124D;
        }
        return C7342b.m28000d(context, i, C5023l.class.getCanonicalName());
    }

    /* renamed from: p1 */
    public Collection mo16177p1() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f15934f;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f15935g;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f15934f);
        parcel.writeValue(this.f15935g);
    }
}
