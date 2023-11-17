package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.util.C1008h;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C4989c();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C4990d f15916f = new C4987a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final C4990d f15917g = new C4988b();

    /* renamed from: d */
    private final C4990d f15918d;

    /* renamed from: e */
    private final List f15919e;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    class C4987a implements C4990d {
        C4987a() {
        }

        /* renamed from: a */
        public int mo16163a() {
            return 1;
        }

        /* renamed from: b */
        public boolean mo16164b(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && dateValidator.mo16149c(j)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    class C4988b implements C4990d {
        C4988b() {
        }

        /* renamed from: a */
        public int mo16163a() {
            return 2;
        }

        /* renamed from: b */
        public boolean mo16164b(List list, long j) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
                if (dateValidator != null && !dateValidator.mo16149c(j)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    class C4989c implements Parcelable.Creator {
        C4989c() {
        }

        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            C4990d dVar;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = CompositeDateValidator.f15917g;
            } else if (readInt == 1) {
                dVar = CompositeDateValidator.f15916f;
            } else {
                dVar = CompositeDateValidator.f15917g;
            }
            return new CompositeDateValidator((List) C1008h.m3530g(readArrayList), dVar, (C4987a) null);
        }

        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    private interface C4990d {
        /* renamed from: a */
        int mo16163a();

        /* renamed from: b */
        boolean mo16164b(List list, long j);
    }

    /* synthetic */ CompositeDateValidator(List list, C4990d dVar, C4987a aVar) {
        this(list, dVar);
    }

    /* renamed from: d */
    public static CalendarConstraints.DateValidator m19386d(List list) {
        return new CompositeDateValidator(list, f15917g);
    }

    /* renamed from: c */
    public boolean mo16149c(long j) {
        return this.f15918d.mo16164b(this.f15919e, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f15919e.equals(compositeDateValidator.f15919e) || this.f15918d.mo16163a() != compositeDateValidator.f15918d.mo16163a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f15919e.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f15919e);
        parcel.writeInt(this.f15918d.mo16163a());
    }

    private CompositeDateValidator(List list, C4990d dVar) {
        this.f15919e = list;
        this.f15918d = dVar;
    }
}
