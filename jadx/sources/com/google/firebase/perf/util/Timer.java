package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new C5432a();

    /* renamed from: d */
    private long f17312d;

    /* renamed from: e */
    private long f17313e;

    /* renamed from: com.google.firebase.perf.util.Timer$a */
    class C5432a implements Parcelable.Creator {
        C5432a() {
        }

        /* renamed from: a */
        public Timer createFromParcel(Parcel parcel) {
            return new Timer(parcel, (C5432a) null);
        }

        /* renamed from: b */
        public Timer[] newArray(int i) {
            return new Timer[i];
        }
    }

    /* synthetic */ Timer(Parcel parcel, C5432a aVar) {
        this(parcel);
    }

    /* renamed from: a */
    private static long m21567a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    /* renamed from: g */
    public static Timer m21568g(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(m21569i() + (micros - m21567a()), micros);
    }

    /* renamed from: i */
    private static long m21569i() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    /* renamed from: b */
    public long mo18039b() {
        return this.f17312d + mo18040d();
    }

    /* renamed from: d */
    public long mo18040d() {
        return mo18042e(new Timer());
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public long mo18042e(Timer timer) {
        return timer.f17313e - this.f17313e;
    }

    /* renamed from: f */
    public long mo18043f() {
        return this.f17312d;
    }

    /* renamed from: h */
    public void mo18044h() {
        this.f17312d = m21569i();
        this.f17313e = m21567a();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f17312d);
        parcel.writeLong(this.f17313e);
    }

    public Timer() {
        this(m21569i(), m21567a());
    }

    Timer(long j, long j2) {
        this.f17312d = j;
        this.f17313e = j2;
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
