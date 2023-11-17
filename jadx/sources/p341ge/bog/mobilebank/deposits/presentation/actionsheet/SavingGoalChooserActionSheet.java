package p341ge.bog.mobilebank.deposits.presentation.actionsheet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import cc0.C19722l;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.deposits.presentation.model.SavingGoalUiModel;
import rb0.C27984c;
import ue1.C43064a;
import xb0.C29707a;

/* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.SavingGoalChooserActionSheet */
public final class SavingGoalChooserActionSheet extends C23015d {

    /* renamed from: N */
    public static final C23005a f60523N = new C23005a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C29707a f60524K;

    /* renamed from: L */
    private final C41217g f60525L = C41219i.m119470b(new C23007c(this));

    /* renamed from: M */
    private final C41217g f60526M = C41219i.m119470b(new C23006b(this));

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.SavingGoalChooserActionSheet$SavingGoalsChooserData */
    private static final class SavingGoalsChooserData implements Parcelable {
        public static final Parcelable.Creator<SavingGoalsChooserData> CREATOR = new C23004a();

        /* renamed from: d */
        private final List f60527d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.SavingGoalChooserActionSheet$SavingGoalsChooserData$a */
        public static final class C23004a implements Parcelable.Creator {
            /* renamed from: a */
            public final SavingGoalsChooserData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(SavingGoalUiModel.CREATOR.createFromParcel(parcel));
                }
                return new SavingGoalsChooserData(arrayList);
            }

            /* renamed from: b */
            public final SavingGoalsChooserData[] newArray(int i) {
                return new SavingGoalsChooserData[i];
            }
        }

        public SavingGoalsChooserData(List list) {
            C41536l.m120489i(list, "goals");
            this.f60527d = list;
        }

        /* renamed from: a */
        public final List mo57678a() {
            return this.f60527d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof SavingGoalsChooserData) && C41536l.m120484d(this.f60527d, ((SavingGoalsChooserData) obj).f60527d);
        }

        public int hashCode() {
            return this.f60527d.hashCode();
        }

        public String toString() {
            List list = this.f60527d;
            return "SavingGoalsChooserData(goals=" + list + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<SavingGoalUiModel> list = this.f60527d;
            parcel.writeInt(list.size());
            for (SavingGoalUiModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.SavingGoalChooserActionSheet$a */
    public static final class C23005a {
        private C23005a() {
        }

        public /* synthetic */ C23005a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final SavingGoalChooserActionSheet mo57688a(List list) {
            C41536l.m120489i(list, "goals");
            SavingGoalChooserActionSheet savingGoalChooserActionSheet = new SavingGoalChooserActionSheet();
            savingGoalChooserActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", new SavingGoalsChooserData(list))));
            return savingGoalChooserActionSheet;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.SavingGoalChooserActionSheet$b */
    static final class C23006b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalChooserActionSheet f60528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23006b(SavingGoalChooserActionSheet savingGoalChooserActionSheet) {
            super(0);
            this.f60528d = savingGoalChooserActionSheet;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public static final void m74615c(SavingGoalChooserActionSheet savingGoalChooserActionSheet, SavingGoalUiModel savingGoalUiModel) {
            C41536l.m120489i(savingGoalChooserActionSheet, "this$0");
            C41536l.m120489i(savingGoalUiModel, "it");
            C1533o.m5445b(savingGoalChooserActionSheet, "REQUEST_KEY_SAVING_GOAL_SELECTED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SAVED_GOAL", savingGoalUiModel)));
            savingGoalChooserActionSheet.mo4577k1();
        }

        /* renamed from: b */
        public final C19722l invoke() {
            return new C19722l(new C23048n(this.f60528d));
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.SavingGoalChooserActionSheet$c */
    static final class C23007c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SavingGoalChooserActionSheet f60529d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23007c(SavingGoalChooserActionSheet savingGoalChooserActionSheet) {
            super(0);
            this.f60529d = savingGoalChooserActionSheet;
        }

        /* renamed from: b */
        public final SavingGoalsChooserData invoke() {
            Bundle arguments = this.f60529d.getArguments();
            SavingGoalsChooserData savingGoalsChooserData = arguments != null ? (SavingGoalsChooserData) arguments.getParcelable("ARG_DATA") : null;
            return savingGoalsChooserData == null ? new SavingGoalsChooserData(C41341q.m119907j()) : savingGoalsChooserData;
        }
    }

    /* renamed from: e2 */
    private final C19722l m74606e2() {
        return (C19722l) this.f60526M.getValue();
    }

    /* renamed from: f2 */
    private final C29707a m74607f2() {
        C29707a aVar = this.f60524K;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: g2 */
    private final SavingGoalsChooserData m74608g2() {
        return (SavingGoalsChooserData) this.f60525L.getValue();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f60524K = C29707a.m90195d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f60524K = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26370a2(C32343x.m95388F("deposit.saving.goal.dep.goal", new Object[0]));
        m74607f2().mo3946b().setAdapter(m74606e2());
        m74607f2().mo3946b().mo5351j(new C13364a(C0767a.m2895e(requireContext(), C27984c.f71248y)));
        m74606e2().mo6029i(m74608g2().mo57678a());
    }
}
