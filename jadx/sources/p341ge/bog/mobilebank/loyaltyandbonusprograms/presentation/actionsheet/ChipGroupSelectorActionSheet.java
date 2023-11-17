package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import ct0.C31409a;
import ct0.C31410b;
import he1.C41233s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.chips.Chip;
import p341ge.bog.designsystem.components.chips.ChipGroup;
import p341ge.bog.designsystem.components.fixedbutton.FixedButtonView;
import p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.model.SelectorChipData;
import p725cr.C19788a;
import vs0.C39461t;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ChipGroupSelectorActionSheet */
public final class ChipGroupSelectorActionSheet extends C19788a {

    /* renamed from: J */
    public static final C32776a f80607J = new C32776a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C39461t f80608H;

    /* renamed from: I */
    private int f80609I = -1;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ChipGroupSelectorActionSheet$ActionSheetData */
    public static final class ActionSheetData implements Parcelable {
        public static final Parcelable.Creator<ActionSheetData> CREATOR = new C32775a();

        /* renamed from: d */
        private final List f80610d;

        /* renamed from: e */
        private final String f80611e;

        /* renamed from: f */
        private final String f80612f;

        /* renamed from: g */
        private final String f80613g;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ChipGroupSelectorActionSheet$ActionSheetData$a */
        public static final class C32775a implements Parcelable.Creator {
            /* renamed from: a */
            public final ActionSheetData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(SelectorChipData.CREATOR.createFromParcel(parcel));
                }
                return new ActionSheetData(arrayList, parcel.readString(), parcel.readString(), parcel.readString());
            }

            /* renamed from: b */
            public final ActionSheetData[] newArray(int i) {
                return new ActionSheetData[i];
            }
        }

        public ActionSheetData(List list, String str, String str2, String str3) {
            C41536l.m120489i(list, "chips");
            C41536l.m120489i(str, "title");
            C41536l.m120489i(str2, "description");
            this.f80610d = list;
            this.f80611e = str;
            this.f80612f = str2;
            this.f80613g = str3;
        }

        /* renamed from: a */
        public final String mo74650a() {
            return this.f80613g;
        }

        /* renamed from: b */
        public final List mo74651b() {
            return this.f80610d;
        }

        /* renamed from: d */
        public final String mo74652d() {
            return this.f80612f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final String mo74654e() {
            return this.f80611e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ActionSheetData)) {
                return false;
            }
            ActionSheetData actionSheetData = (ActionSheetData) obj;
            return C41536l.m120484d(this.f80610d, actionSheetData.f80610d) && C41536l.m120484d(this.f80611e, actionSheetData.f80611e) && C41536l.m120484d(this.f80612f, actionSheetData.f80612f) && C41536l.m120484d(this.f80613g, actionSheetData.f80613g);
        }

        public int hashCode() {
            int hashCode = ((((this.f80610d.hashCode() * 31) + this.f80611e.hashCode()) * 31) + this.f80612f.hashCode()) * 31;
            String str = this.f80613g;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            List list = this.f80610d;
            String str = this.f80611e;
            String str2 = this.f80612f;
            String str3 = this.f80613g;
            return "ActionSheetData(chips=" + list + ", title=" + str + ", description=" + str2 + ", buttonText=" + str3 + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<SelectorChipData> list = this.f80610d;
            parcel.writeInt(list.size());
            for (SelectorChipData writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
            parcel.writeString(this.f80611e);
            parcel.writeString(this.f80612f);
            parcel.writeString(this.f80613g);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.actionsheet.ChipGroupSelectorActionSheet$a */
    public static final class C32776a {
        private C32776a() {
        }

        public /* synthetic */ C32776a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ChipGroupSelectorActionSheet mo74663a(ActionSheetData actionSheetData, String str) {
            C41536l.m120489i(actionSheetData, "data");
            C41536l.m120489i(str, "requestKey");
            ChipGroupSelectorActionSheet chipGroupSelectorActionSheet = new ChipGroupSelectorActionSheet();
            chipGroupSelectorActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_ACTION_SHEET_DATA", actionSheetData), C41233s.m119492a("ARG_REQUEST_KEY", str)));
            return chipGroupSelectorActionSheet;
        }
    }

    /* renamed from: g2 */
    private final void m96818g2() {
        m96821j2().f93846e.setOnChipActivatedChangedListener(new C31409a(this));
        m96821j2().f93847f.setOnClickListener(new C31410b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m96819h2(ChipGroupSelectorActionSheet chipGroupSelectorActionSheet, Chip chip, int i) {
        boolean z;
        C41536l.m120489i(chipGroupSelectorActionSheet, "this$0");
        C41536l.m120489i(chip, "<anonymous parameter 0>");
        FixedButtonView fixedButtonView = chipGroupSelectorActionSheet.m96821j2().f93847f;
        if (i != -1) {
            z = true;
        } else {
            z = false;
        }
        fixedButtonView.setEnabled(z);
        chipGroupSelectorActionSheet.f80609I = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m96820i2(ChipGroupSelectorActionSheet chipGroupSelectorActionSheet, View view) {
        String str;
        C41536l.m120489i(chipGroupSelectorActionSheet, "this$0");
        int i = chipGroupSelectorActionSheet.f80609I;
        Bundle arguments = chipGroupSelectorActionSheet.getArguments();
        if (arguments == null || (str = arguments.getString("ARG_REQUEST_KEY")) == null) {
            str = "REQUEST_KEY_CHIP_GROUP_SELECTOR";
        }
        if (i != -1) {
            C1533o.m5445b(chipGroupSelectorActionSheet, str, C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SELECTED_CHIP", Integer.valueOf(i))));
            chipGroupSelectorActionSheet.mo4577k1();
        }
    }

    /* renamed from: j2 */
    private final C39461t m96821j2() {
        C39461t tVar = this.f80608H;
        C41536l.m120486f(tVar);
        return tVar;
    }

    /* renamed from: k2 */
    private final void m96822k2(ActionSheetData actionSheetData) {
        m96821j2().f93848g.setText(actionSheetData.mo74652d());
        String a = actionSheetData.mo74650a();
        if (a != null) {
            m96821j2().f93847f.getButton().setButtonText(a);
        }
        for (SelectorChipData a2 : actionSheetData.mo74651b()) {
            ChipGroup chipGroup = m96821j2().f93846e;
            Context requireContext = requireContext();
            C41536l.m120488h(requireContext, "requireContext()");
            Chip chip = new Chip(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            chip.setChipTitle(a2.mo74991a());
            chipGroup.mo35183o(chip);
        }
        Iterator it = actionSheetData.mo74651b().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (((SelectorChipData) it.next()).mo74992b()) {
                break;
            } else {
                i++;
            }
        }
        this.f80609I = i;
        if (i != -1) {
            ChipGroup chipGroup2 = m96821j2().f93846e;
            C41536l.m120488h(chipGroup2, "binding.chips");
            ChipGroup.m49760n(chipGroup2, this.f80609I, false, 2, (Object) null);
        } else {
            m96821j2().f93847f.setEnabled(false);
        }
        m96818g2();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f80608H = C39461t.m114700d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80608H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        ActionSheetData actionSheetData;
        C41536l.m120489i(view, "view");
        Bundle arguments = getArguments();
        if (arguments == null || (actionSheetData = (ActionSheetData) arguments.getParcelable("ARG_ACTION_SHEET_DATA")) == null) {
            actionSheetData = null;
        } else {
            mo26370a2(actionSheetData.mo74654e());
            super.onViewCreated(view, bundle);
            m96822k2(actionSheetData);
        }
        if (actionSheetData == null) {
            mo4577k1();
        }
    }
}
