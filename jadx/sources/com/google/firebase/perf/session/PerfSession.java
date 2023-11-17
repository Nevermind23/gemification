package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.config.C5380a;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import p212pa.C7777a;
import p225qa.C7983k;
import p225qa.C7987l;

public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new C5418a();

    /* renamed from: d */
    private final String f17275d;

    /* renamed from: e */
    private final Timer f17276e;

    /* renamed from: f */
    private boolean f17277f;

    /* renamed from: com.google.firebase.perf.session.PerfSession$a */
    class C5418a implements Parcelable.Creator {
        C5418a() {
        }

        /* renamed from: a */
        public PerfSession createFromParcel(Parcel parcel) {
            return new PerfSession(parcel, (C5418a) null);
        }

        /* renamed from: b */
        public PerfSession[] newArray(int i) {
            return new PerfSession[i];
        }
    }

    /* synthetic */ PerfSession(Parcel parcel, C5418a aVar) {
        this(parcel);
    }

    /* renamed from: b */
    public static C7983k[] m21522b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        C7983k[] kVarArr = new C7983k[list.size()];
        C7983k a = ((PerfSession) list.get(0)).mo17997a();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            C7983k a2 = ((PerfSession) list.get(i)).mo17997a();
            if (z || !((PerfSession) list.get(i)).mo18002h()) {
                kVarArr[i] = a2;
            } else {
                kVarArr[0] = a2;
                kVarArr[i] = a;
                z = true;
            }
        }
        if (!z) {
            kVarArr[0] = a;
        }
        return kVarArr;
    }

    /* renamed from: d */
    public static PerfSession m21523d() {
        PerfSession perfSession = new PerfSession(UUID.randomUUID().toString().replace("-", ""), new C7777a());
        perfSession.mo18004j(m21524k());
        return perfSession;
    }

    /* renamed from: k */
    public static boolean m21524k() {
        C5380a g = C5380a.m21272g();
        if (!g.mo17718K() || Math.random() >= g.mo17714D()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public C7983k mo17997a() {
        C7983k.C7986c A = C7983k.m30315Z().mo23112A(this.f17275d);
        if (this.f17277f) {
            A.mo23113z(C7987l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return (C7983k) A.mo18768o();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Timer mo17999e() {
        return this.f17276e;
    }

    /* renamed from: f */
    public boolean mo18000f() {
        if (TimeUnit.MICROSECONDS.toMinutes(this.f17276e.mo18040d()) > C5380a.m21272g().mo17711A()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean mo18001g() {
        return this.f17277f;
    }

    /* renamed from: h */
    public boolean mo18002h() {
        return this.f17277f;
    }

    /* renamed from: i */
    public String mo18003i() {
        return this.f17275d;
    }

    /* renamed from: j */
    public void mo18004j(boolean z) {
        this.f17277f = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f17275d);
        parcel.writeByte(this.f17277f ? (byte) 1 : 0);
        parcel.writeParcelable(this.f17276e, 0);
    }

    public PerfSession(String str, C7777a aVar) {
        this.f17277f = false;
        this.f17275d = str;
        this.f17276e = aVar.mo22535a();
    }

    private PerfSession(Parcel parcel) {
        boolean z = false;
        this.f17277f = false;
        this.f17275d = parcel.readString();
        this.f17277f = parcel.readByte() != 0 ? true : z;
        this.f17276e = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }
}
