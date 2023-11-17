package p341ge.bog.mobilebank.deposits.presentation.activity;

import a81.C30772sa;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.core.content.C0767a;
import dc0.C19970a;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o31.C37613p;
import p341ge.bog.designsystem.components.list.C13364a;
import rb0.C27984c;
import ue1.C43064a;
import xb0.C29719g;

/* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositSuccessActivity */
public final class BreakDepositSuccessActivity extends C30772sa {

    /* renamed from: I */
    public static final C23078a f60602I = new C23078a((DefaultConstructorMarker) null);

    /* renamed from: F */
    private final C41217g f60603F = C41219i.m119470b(new C23080c(this));

    /* renamed from: G */
    private final C41217g f60604G = C41219i.m119470b(C23079b.f60607d);

    /* renamed from: H */
    private final C41217g f60605H = C41219i.m119470b(new C23081d(this));

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositSuccessActivity$BreakDepositSuccessData */
    private static final class BreakDepositSuccessData implements Parcelable {
        public static final Parcelable.Creator<BreakDepositSuccessData> CREATOR = new C23077a();

        /* renamed from: d */
        private final List f60606d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositSuccessActivity$BreakDepositSuccessData$a */
        public static final class C23077a implements Parcelable.Creator {
            /* renamed from: a */
            public final BreakDepositSuccessData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(parcel.readParcelable(BreakDepositSuccessData.class.getClassLoader()));
                }
                return new BreakDepositSuccessData(arrayList);
            }

            /* renamed from: b */
            public final BreakDepositSuccessData[] newArray(int i) {
                return new BreakDepositSuccessData[i];
            }
        }

        public BreakDepositSuccessData(List list) {
            C41536l.m120489i(list, "details");
            this.f60606d = list;
        }

        /* renamed from: a */
        public final List mo57751a() {
            return this.f60606d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof BreakDepositSuccessData) && C41536l.m120484d(this.f60606d, ((BreakDepositSuccessData) obj).f60606d);
        }

        public int hashCode() {
            return this.f60606d.hashCode();
        }

        public String toString() {
            List list = this.f60606d;
            return "BreakDepositSuccessData(details=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<Parcelable> list = this.f60606d;
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositSuccessActivity$a */
    public static final class C23078a {
        private C23078a() {
        }

        public /* synthetic */ C23078a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final void mo57761a(Context context, List list) {
            C41536l.m120489i(context, "context");
            C41536l.m120489i(list, "details");
            context.startActivity(C37613p.m110614a(new Intent(context, BreakDepositSuccessActivity.class), C41233s.m119492a("ARG_SUCCESS_DATA", new BreakDepositSuccessData(list))));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositSuccessActivity$b */
    static final class C23079b extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C23079b f60607d = new C23079b();

        C23079b() {
            super(0);
        }

        /* renamed from: b */
        public final C19970a invoke() {
            return new C19970a();
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositSuccessActivity$c */
    static final class C23080c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BreakDepositSuccessActivity f60608d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23080c(BreakDepositSuccessActivity breakDepositSuccessActivity) {
            super(0);
            this.f60608d = breakDepositSuccessActivity;
        }

        /* renamed from: b */
        public final C29719g invoke() {
            return C29719g.m90241d(this.f60608d.getLayoutInflater());
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.activity.BreakDepositSuccessActivity$d */
    static final class C23081d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ BreakDepositSuccessActivity f60609d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23081d(BreakDepositSuccessActivity breakDepositSuccessActivity) {
            super(0);
            this.f60609d = breakDepositSuccessActivity;
        }

        /* renamed from: b */
        public final BreakDepositSuccessData invoke() {
            BreakDepositSuccessData breakDepositSuccessData = (BreakDepositSuccessData) this.f60609d.getIntent().getParcelableExtra("ARG_SUCCESS_DATA");
            if (breakDepositSuccessData == null) {
                return new BreakDepositSuccessData(C41341q.m119907j());
            }
            return breakDepositSuccessData;
        }
    }

    /* renamed from: F2 */
    private final C19970a m74759F2() {
        return (C19970a) this.f60604G.getValue();
    }

    /* renamed from: G2 */
    private final C29719g m74760G2() {
        return (C29719g) this.f60603F.getValue();
    }

    /* renamed from: H2 */
    private final BreakDepositSuccessData m74761H2() {
        return (BreakDepositSuccessData) this.f60605H.getValue();
    }

    /* renamed from: I2 */
    private final void m74762I2() {
        m74760G2().f75043g.setAdapter(m74759F2());
        m74760G2().f75043g.mo5351j(new C13364a(C0767a.m2895e(this, C27984c.f71248y)));
        m74759F2().mo6029i(m74761H2().mo57751a());
    }

    /* renamed from: J2 */
    private final void m74763J2() {
        m74760G2().f75044h.setTitleText(C32343x.m95388F("deposits.break.success.message", new Object[0]));
        m74760G2().f75045i.setButtonText(C32343x.m95388F("deposits.break.success.button.android", new Object[0]));
        m74760G2().f75041e.setTitle(C32343x.m95388F("deposits.break.success.details", new Object[0]));
    }

    /* renamed from: K2 */
    private final void m74764K2() {
        m74763J2();
        m74762I2();
        m74760G2().f75045i.setOnClickListener(new C23164k(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L2 */
    public static final void m74765L2(BreakDepositSuccessActivity breakDepositSuccessActivity, View view) {
        C41536l.m120489i(breakDepositSuccessActivity, "this$0");
        breakDepositSuccessActivity.finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        super.mo70996D2(bundle, m74760G2());
        m74764K2();
        getWindow().setStatusBarColor(0);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return C32343x.m95388F("deposits.break.page.header", new Object[0]);
    }
}
