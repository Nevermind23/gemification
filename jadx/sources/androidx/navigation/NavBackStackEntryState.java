package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.C1593j;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p202p0.C7549j;
import p202p0.C7575m;
import p202p0.C7589q;

@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C1654a();

    /* renamed from: h */
    public static final C1655b f4693h = new C1655b((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final String f4694d;

    /* renamed from: e */
    private final int f4695e;

    /* renamed from: f */
    private final Bundle f4696f;

    /* renamed from: g */
    private final Bundle f4697g;

    /* renamed from: androidx.navigation.NavBackStackEntryState$a */
    public static final class C1654a implements Parcelable.Creator {
        C1654a() {
        }

        /* renamed from: a */
        public NavBackStackEntryState createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        /* renamed from: b */
        public NavBackStackEntryState[] newArray(int i) {
            return new NavBackStackEntryState[i];
        }
    }

    /* renamed from: androidx.navigation.NavBackStackEntryState$b */
    public static final class C1655b {
        private C1655b() {
        }

        public /* synthetic */ C1655b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public NavBackStackEntryState(C7549j jVar) {
        C41536l.m120489i(jVar, "entry");
        this.f4694d = jVar.mo22098g();
        this.f4695e = jVar.mo22097f().mo22214w();
        this.f4696f = jVar.mo22095d();
        Bundle bundle = new Bundle();
        this.f4697g = bundle;
        jVar.mo22102j(bundle);
    }

    /* renamed from: a */
    public final int mo4999a() {
        return this.f4695e;
    }

    /* renamed from: b */
    public final String mo5000b() {
        return this.f4694d;
    }

    /* renamed from: d */
    public final C7549j mo5001d(Context context, C7589q qVar, C1593j.C1598b bVar, C7575m mVar) {
        C41536l.m120489i(context, "context");
        C41536l.m120489i(qVar, "destination");
        C41536l.m120489i(bVar, "hostLifecycleState");
        Bundle bundle = this.f4696f;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        return C7549j.f22017q.mo22106a(context, qVar, bundle, bVar, mVar, this.f4694d, this.f4697g);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "parcel");
        parcel.writeString(this.f4694d);
        parcel.writeInt(this.f4695e);
        parcel.writeBundle(this.f4696f);
        parcel.writeBundle(this.f4697g);
    }

    public NavBackStackEntryState(Parcel parcel) {
        C41536l.m120489i(parcel, "inParcel");
        String readString = parcel.readString();
        C41536l.m120486f(readString);
        this.f4694d = readString;
        this.f4695e = parcel.readInt();
        Class<NavBackStackEntryState> cls = NavBackStackEntryState.class;
        this.f4696f = parcel.readBundle(cls.getClassLoader());
        Bundle readBundle = parcel.readBundle(cls.getClassLoader());
        C41536l.m120486f(readBundle);
        this.f4697g = readBundle;
    }
}
