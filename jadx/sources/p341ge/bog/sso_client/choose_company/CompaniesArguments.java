package p341ge.bog.sso_client.choose_company;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.sso_client.models.RelatedCompany;

/* renamed from: ge.bog.sso_client.choose_company.CompaniesArguments */
public final class CompaniesArguments implements Parcelable {
    public static final Parcelable.Creator<CompaniesArguments> CREATOR = new C15272b();

    /* renamed from: e */
    public static final C15271a f43651e = new C15271a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final List f43652d;

    /* renamed from: ge.bog.sso_client.choose_company.CompaniesArguments$a */
    public static final class C15271a {
        private C15271a() {
        }

        public /* synthetic */ C15271a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final CompaniesArguments mo42337a(Intent intent) {
            if (intent != null) {
                return (CompaniesArguments) intent.getParcelableExtra("companies");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.sso_client.choose_company.CompaniesArguments$b */
    public static final class C15272b implements Parcelable.Creator {
        /* renamed from: a */
        public final CompaniesArguments createFromParcel(Parcel parcel) {
            C41536l.m120489i(parcel, "parcel");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i = 0; i != readInt; i++) {
                arrayList.add(RelatedCompany.CREATOR.createFromParcel(parcel));
            }
            return new CompaniesArguments(arrayList);
        }

        /* renamed from: b */
        public final CompaniesArguments[] newArray(int i) {
            return new CompaniesArguments[i];
        }
    }

    public CompaniesArguments(List list) {
        C41536l.m120489i(list, "companies");
        this.f43652d = list;
    }

    /* renamed from: a */
    public final List mo42330a() {
        return this.f43652d;
    }

    /* renamed from: b */
    public final Intent mo42331b() {
        Intent putExtra = new Intent().putExtra("companies", new CompaniesArguments(this.f43652d));
        C41536l.m120488h(putExtra, "Intent().putExtra(KEY, C…niesArguments(companies))");
        return putExtra;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CompaniesArguments) && C41536l.m120484d(this.f43652d, ((CompaniesArguments) obj).f43652d);
    }

    public int hashCode() {
        return this.f43652d.hashCode();
    }

    public String toString() {
        return "CompaniesArguments(companies=" + this.f43652d + ')';
    }

    public void writeToParcel(Parcel parcel, int i) {
        C41536l.m120489i(parcel, "out");
        List<RelatedCompany> list = this.f43652d;
        parcel.writeInt(list.size());
        for (RelatedCompany writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, i);
        }
    }
}
