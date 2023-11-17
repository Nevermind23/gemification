package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new C5410a();

    /* renamed from: d */
    private final String f17244d;

    /* renamed from: e */
    private final AtomicLong f17245e;

    /* renamed from: com.google.firebase.perf.metrics.Counter$a */
    class C5410a implements Parcelable.Creator {
        C5410a() {
        }

        /* renamed from: a */
        public Counter createFromParcel(Parcel parcel) {
            return new Counter(parcel, (C5410a) null);
        }

        /* renamed from: b */
        public Counter[] newArray(int i) {
            return new Counter[i];
        }
    }

    /* synthetic */ Counter(Parcel parcel, C5410a aVar) {
        this(parcel);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public long mo17779a() {
        return this.f17245e.get();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo17780b() {
        return this.f17244d;
    }

    /* renamed from: d */
    public void mo17781d(long j) {
        this.f17245e.addAndGet(j);
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo17783e(long j) {
        this.f17245e.set(j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17244d);
        parcel.writeLong(this.f17245e.get());
    }

    public Counter(String str) {
        this.f17244d = str;
        this.f17245e = new AtomicLong(0);
    }

    private Counter(Parcel parcel) {
        this.f17244d = parcel.readString();
        this.f17245e = new AtomicLong(parcel.readLong());
    }
}
