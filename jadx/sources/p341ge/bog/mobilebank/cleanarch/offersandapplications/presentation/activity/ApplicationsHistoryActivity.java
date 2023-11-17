package p341ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import f00.C20308a;
import he1.C41217g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.model.Application;
import p366bk.C10328q;
import p90.C27361m;
import ue1.C43064a;

/* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity */
public final class ApplicationsHistoryActivity extends C30772sa {

    /* renamed from: I */
    public static final C21366a f57198I = new C21366a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f57199F = C41219i.m119470b(new C21369d(this));

    /* renamed from: G */
    private final C41217g f57200G = C41219i.m119470b(C21367b.f57203d);

    /* renamed from: H */
    private final C41217g f57201H = C41219i.m119470b(new C21368c(this));

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity$ApplicationHistoryData */
    private static final class ApplicationHistoryData implements Parcelable {
        public static final Parcelable.Creator<ApplicationHistoryData> CREATOR = new C21365a();

        /* renamed from: d */
        private final List f57202d;

        /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity$ApplicationHistoryData$a */
        public static final class C21365a implements Parcelable.Creator {
            /* renamed from: a */
            public final ApplicationHistoryData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(Application.CREATOR.createFromParcel(parcel));
                }
                return new ApplicationHistoryData(arrayList);
            }

            /* renamed from: b */
            public final ApplicationHistoryData[] newArray(int i) {
                return new ApplicationHistoryData[i];
            }
        }

        public ApplicationHistoryData() {
            this((List) null, 1, (DefaultConstructorMarker) null);
        }

        /* renamed from: a */
        public final List mo53383a() {
            return this.f57202d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ApplicationHistoryData) && C41536l.m120484d(this.f57202d, ((ApplicationHistoryData) obj).f57202d);
        }

        public int hashCode() {
            return this.f57202d.hashCode();
        }

        public String toString() {
            List list = this.f57202d;
            return "ApplicationHistoryData(applications=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<Application> list = this.f57202d;
            parcel.writeInt(list.size());
            for (Application writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }

        public ApplicationHistoryData(List list) {
            C41536l.m120489i(list, "applications");
            this.f57202d = list;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ApplicationHistoryData(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? C41341q.m119907j() : list);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity$a */
    public static final class C21366a {
        private C21366a() {
        }

        public /* synthetic */ C21366a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo53393a(Context context, List list) {
            C41536l.m120489i(context, "context");
            Intent intent = new Intent(context, ApplicationsHistoryActivity.class);
            if (list == null) {
                list = C41341q.m119907j();
            }
            intent.putExtra("KEY_APPLICATIONS", new ApplicationHistoryData(list));
            context.startActivity(intent);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity$b */
    /* synthetic */ class C21367b extends C41535k implements C43064a {

        /* renamed from: d */
        public static final C21367b f57203d = new C21367b();

        C21367b() {
            super(0, C20308a.class, "<init>", "<init>()V", 0);
        }

        /* renamed from: b */
        public final C20308a invoke() {
            return new C20308a();
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity$c */
    static final class C21368c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ApplicationsHistoryActivity f57204d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21368c(ApplicationsHistoryActivity applicationsHistoryActivity) {
            super(0);
            this.f57204d = applicationsHistoryActivity;
        }

        /* renamed from: b */
        public final ApplicationHistoryData invoke() {
            ApplicationHistoryData applicationHistoryData;
            if (Build.VERSION.SDK_INT >= 33) {
                applicationHistoryData = (ApplicationHistoryData) this.f57204d.getIntent().getParcelableExtra("KEY_APPLICATIONS", ApplicationHistoryData.class);
            } else {
                applicationHistoryData = (ApplicationHistoryData) this.f57204d.getIntent().getParcelableExtra("KEY_APPLICATIONS");
            }
            if (applicationHistoryData == null) {
                return new ApplicationHistoryData((List) null, 1, (DefaultConstructorMarker) null);
            }
            return applicationHistoryData;
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.offersandapplications.presentation.activity.ApplicationsHistoryActivity$d */
    static final class C21369d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ApplicationsHistoryActivity f57205d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21369d(ApplicationsHistoryActivity applicationsHistoryActivity) {
            super(0);
            this.f57205d = applicationsHistoryActivity;
        }

        /* renamed from: b */
        public final C27361m invoke() {
            return C27361m.m84754d(this.f57205d.getLayoutInflater());
        }
    }

    /* renamed from: E2 */
    private final C20308a m69059E2() {
        return (C20308a) this.f57200G.getValue();
    }

    /* renamed from: F2 */
    private final ApplicationHistoryData m69060F2() {
        return (ApplicationHistoryData) this.f57201H.getValue();
    }

    /* renamed from: G2 */
    private final C27361m m69061G2() {
        return (C27361m) this.f57199F.getValue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m69061G2());
        m69061G2().f69259e.setAdapter(m69059E2());
        m69059E2().mo48789g(m69060F2().mo53383a());
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        String string = getString(C10328q.app_history_apps_and_offers);
        C41536l.m120488h(string, "getString(R.string.app_history_apps_and_offers)");
        return string;
    }
}
