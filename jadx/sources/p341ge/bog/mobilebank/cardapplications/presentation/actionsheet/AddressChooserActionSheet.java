package p341ge.bog.mobilebank.cardapplications.presentation.actionsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.Group;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1514j0;
import androidx.fragment.app.C1533o;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C1591i;
import androidx.lifecycle.C1619q;
import androidx.lifecycle.C1620q0;
import androidx.lifecycle.C1636t0;
import androidx.lifecycle.C1638u0;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32286a1;
import g91.C32343x;
import he1.C41212c;
import he1.C41217g;
import he1.C41222k;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m41.C37224b;
import p163m0.C7047a;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.cardapplications.presentation.model.AddressAdapterModel;
import p341ge.bog.mobilebank.cardapplications.presentation.model.SelectedAddress;
import p411em.C12487d;
import p412en.C12582l;
import p412en.C12587m;
import p412en.C12592n;
import p412en.C12597o;
import p481jm.C16218b;
import p621tm.C17992b;
import p621tm.C18007i;
import p674xm.C18781a;
import ue1.C43064a;
import ue1.C43075l;
import x00.C29606a;

/* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet */
public final class AddressChooserActionSheet extends C13959f {

    /* renamed from: P */
    public static final C13935a f41314P = new C13935a((DefaultConstructorMarker) null);

    /* renamed from: K */
    public C12582l f41315K;

    /* renamed from: L */
    private C16218b f41316L;

    /* renamed from: M */
    private final C41217g f41317M = C41219i.m119470b(new C13936b(this));

    /* renamed from: N */
    private final C41217g f41318N = C41219i.m119470b(new C13943h(this));

    /* renamed from: O */
    private final C41217g f41319O;

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$Data */
    private static final class Data implements Parcelable {
        public static final Parcelable.Creator<Data> CREATOR = new C13934a();

        /* renamed from: d */
        private final List f41320d;

        /* renamed from: e */
        private final C18781a f41321e;

        /* renamed from: f */
        private final Set f41322f;

        /* renamed from: g */
        private final String f41323g;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$Data$a */
        public static final class C13934a implements Parcelable.Creator {
            /* renamed from: a */
            public final Data createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList.add(AddressAdapterModel.CREATOR.createFromParcel(parcel));
                }
                C18781a valueOf = C18781a.valueOf(parcel.readString());
                int readInt2 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
                for (int i2 = 0; i2 != readInt2; i2++) {
                    linkedHashSet.add(SelectedAddress.CREATOR.createFromParcel(parcel));
                }
                return new Data(arrayList, valueOf, linkedHashSet, parcel.readString());
            }

            /* renamed from: b */
            public final Data[] newArray(int i) {
                return new Data[i];
            }
        }

        public Data(List list, C18781a aVar, Set set, String str) {
            C41536l.m120489i(list, "addresses");
            C41536l.m120489i(aVar, "startingStep");
            C41536l.m120489i(set, "selectedAddresses");
            C41536l.m120489i(str, "requestKey");
            this.f41320d = list;
            this.f41321e = aVar;
            this.f41322f = set;
            this.f41323g = str;
        }

        /* renamed from: a */
        public final List mo39024a() {
            return this.f41320d;
        }

        /* renamed from: b */
        public final String mo39025b() {
            return this.f41323g;
        }

        /* renamed from: d */
        public final Set mo39026d() {
            return this.f41322f;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public final C18781a mo39028e() {
            return this.f41321e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return C41536l.m120484d(this.f41320d, data.f41320d) && this.f41321e == data.f41321e && C41536l.m120484d(this.f41322f, data.f41322f) && C41536l.m120484d(this.f41323g, data.f41323g);
        }

        public int hashCode() {
            return (((((this.f41320d.hashCode() * 31) + this.f41321e.hashCode()) * 31) + this.f41322f.hashCode()) * 31) + this.f41323g.hashCode();
        }

        public String toString() {
            List list = this.f41320d;
            C18781a aVar = this.f41321e;
            Set set = this.f41322f;
            String str = this.f41323g;
            return "Data(addresses=" + list + ", startingStep=" + aVar + ", selectedAddresses=" + set + ", requestKey=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            List<AddressAdapterModel> list = this.f41320d;
            parcel.writeInt(list.size());
            for (AddressAdapterModel writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, i);
            }
            parcel.writeString(this.f41321e.name());
            Set<SelectedAddress> set = this.f41322f;
            parcel.writeInt(set.size());
            for (SelectedAddress writeToParcel2 : set) {
                writeToParcel2.writeToParcel(parcel, i);
            }
            parcel.writeString(this.f41323g);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$a */
    public static final class C13935a {
        private C13935a() {
        }

        public /* synthetic */ C13935a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        public static /* synthetic */ AddressChooserActionSheet m51910b(C13935a aVar, List list, C18781a aVar2, Set set, String str, int i, Object obj) {
            if ((i & 4) != 0) {
                set = C41357x0.m119985e();
            }
            if ((i & 8) != 0) {
                str = "ADDRESS_SELECTED";
            }
            return aVar.mo39037a(list, aVar2, set, str);
        }

        /* renamed from: a */
        public final AddressChooserActionSheet mo39037a(List list, C18781a aVar, Set set, String str) {
            C41536l.m120489i(list, "addresses");
            C41536l.m120489i(aVar, "startingStep");
            C41536l.m120489i(set, "selectedAddresses");
            C41536l.m120489i(str, "requestKey");
            AddressChooserActionSheet addressChooserActionSheet = new AddressChooserActionSheet();
            addressChooserActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", new Data(list, aVar, set, str))));
            return addressChooserActionSheet;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$b */
    static final class C13936b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddressChooserActionSheet f41324d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$b$a */
        /* synthetic */ class C13937a implements C18007i, C41532h {

            /* renamed from: a */
            final /* synthetic */ C12587m f41325a;

            C13937a(C12587m mVar) {
                this.f41325a = mVar;
            }

            /* renamed from: a */
            public final void mo39039a(AddressAdapterModel addressAdapterModel) {
                C41536l.m120489i(addressAdapterModel, "p0");
                this.f41325a.mo33272ev(addressAdapterModel);
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof C18007i) || !(obj instanceof C41532h)) {
                    return false;
                }
                return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
            }

            public final C41212c getFunctionDelegate() {
                return new C41535k(1, this.f41325a, C12587m.class, "onAddressClicked", "onAddressClicked(Lge/bog/mobilebank/cardapplications/presentation/model/AddressAdapterModel;)V", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13936b(AddressChooserActionSheet addressChooserActionSheet) {
            super(0);
            this.f41324d = addressChooserActionSheet;
        }

        /* renamed from: b */
        public final C17992b invoke() {
            return new C17992b(new C13937a(this.f41324d.m51897o2().mo33277gw()));
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$c */
    /* synthetic */ class C13938c extends C41535k implements C43075l {
        C13938c(Object obj) {
            super(1, obj, C12587m.class, "onSearch", "onSearch(Ljava/lang/String;)V", 0);
        }

        /* renamed from: b */
        public final void mo39042b(String str) {
            C41536l.m120489i(str, "p0");
            ((C12587m) this.receiver).mo33270U9(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39042b((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$d */
    static final class C13939d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddressChooserActionSheet f41326d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13939d(AddressChooserActionSheet addressChooserActionSheet) {
            super(1);
            this.f41326d = addressChooserActionSheet;
        }

        /* renamed from: a */
        public final void mo39043a(C18781a aVar) {
            boolean z;
            if (aVar != null) {
                AddressChooserActionSheet addressChooserActionSheet = this.f41326d;
                Button J1 = addressChooserActionSheet.mo26358J1();
                if (aVar.mo46580b() != null) {
                    z = true;
                } else {
                    z = false;
                }
                C32343x.m95483r1(J1, z, false, 2, (Object) null);
                addressChooserActionSheet.mo26370a2(C32343x.m95388F(aVar.mo46581c(), new Object[0]));
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39043a((C18781a) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$e */
    /* synthetic */ class C13940e extends C41535k implements C43075l {
        C13940e(Object obj) {
            super(1, obj, C17992b.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        /* renamed from: b */
        public final void mo39044b(List list) {
            ((C17992b) this.receiver).mo6029i(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39044b((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$f */
    static final class C13941f extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddressChooserActionSheet f41327d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13941f(AddressChooserActionSheet addressChooserActionSheet) {
            super(1);
            this.f41327d = addressChooserActionSheet;
        }

        /* renamed from: a */
        public final void mo39045a(AddressAdapterModel addressAdapterModel) {
            C41536l.m120489i(addressAdapterModel, "it");
            AddressChooserActionSheet addressChooserActionSheet = this.f41327d;
            C1533o.m5445b(addressChooserActionSheet, addressChooserActionSheet.m51896m2().mo39025b(), C0908e.m3336b(C41233s.m119492a("SELECTED_ADDRESS", addressAdapterModel)));
            this.f41327d.mo4577k1();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39045a((AddressAdapterModel) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$g */
    static final class C13942g extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ AddressChooserActionSheet f41328d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13942g(AddressChooserActionSheet addressChooserActionSheet) {
            super(1);
            this.f41328d = addressChooserActionSheet;
        }

        /* renamed from: a */
        public final void mo39046a(C41238w wVar) {
            C41536l.m120489i(wVar, "it");
            this.f41328d.m51895l2().f45775i.setInputText((CharSequence) null);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo39046a((C41238w) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$h */
    static final class C13943h extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddressChooserActionSheet f41329d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13943h(AddressChooserActionSheet addressChooserActionSheet) {
            super(0);
            this.f41329d = addressChooserActionSheet;
        }

        /* renamed from: b */
        public final Data invoke() {
            Data data;
            Bundle arguments = this.f41329d.getArguments();
            if (arguments != null) {
                data = (Data) arguments.getParcelable("ARG_DATA");
            } else {
                data = null;
            }
            if (data == null) {
                return new Data(C41341q.m119907j(), C18781a.SC_CITY, C41357x0.m119985e(), "ADDRESS_SELECTED");
            }
            return data;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$i */
    static final class C13944i implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f41330a;

        C13944i(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f41330a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f41330a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f41330a.invoke(obj);
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$j */
    public static final class C13945j extends C29606a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13945j(Context context, int i) {
            super(context, i);
            C41536l.m120488h(context, "requireContext()");
        }

        /* renamed from: j */
        public boolean mo39050j(View view, RecyclerView recyclerView) {
            C41536l.m120489i(view, "view");
            C41536l.m120489i(recyclerView, "parent");
            int k0 = recyclerView.mo5355k0(view);
            RecyclerView.C1736h adapter = recyclerView.getAdapter();
            if (k0 == -1 || adapter == null || k0 == adapter.getItemCount() - 1) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$k */
    public static final class C13946k extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ Fragment f41331d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13946k(Fragment fragment) {
            super(0);
            this.f41331d = fragment;
        }

        public final Fragment invoke() {
            return this.f41331d;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$l */
    public static final class C13947l extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13947l(C43064a aVar) {
            super(0);
            this.f41332d = aVar;
        }

        public final C1638u0 invoke() {
            return (C1638u0) this.f41332d.invoke();
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$m */
    public static final class C13948m extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C41217g f41333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13948m(C41217g gVar) {
            super(0);
            this.f41333d = gVar;
        }

        public final C1636t0 invoke() {
            C1636t0 viewModelStore = C1514j0.m5375d(this.f41333d).getViewModelStore();
            C41536l.m120488h(viewModelStore, "owner.viewModelStore");
            return viewModelStore;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$n */
    public static final class C13949n extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C43064a f41334d;

        /* renamed from: e */
        final /* synthetic */ C41217g f41335e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13949n(C43064a aVar, C41217g gVar) {
            super(0);
            this.f41334d = aVar;
            this.f41335e = gVar;
        }

        public final C7047a invoke() {
            C7047a aVar;
            C43064a aVar2 = this.f41334d;
            if (aVar2 != null && (aVar = (C7047a) aVar2.invoke()) != null) {
                return aVar;
            }
            C1638u0 a = C1514j0.m5375d(this.f41335e);
            C1591i iVar = a instanceof C1591i ? (C1591i) a : null;
            C7047a defaultViewModelCreationExtras = iVar != null ? iVar.getDefaultViewModelCreationExtras() : null;
            return defaultViewModelCreationExtras == null ? C7047a.C7048a.f20987b : defaultViewModelCreationExtras;
        }
    }

    /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$o */
    static final class C13950o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AddressChooserActionSheet f41336d;

        /* renamed from: ge.bog.mobilebank.cardapplications.presentation.actionsheet.AddressChooserActionSheet$o$a */
        static final class C13951a extends C41537m implements C43064a {

            /* renamed from: d */
            final /* synthetic */ AddressChooserActionSheet f41337d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C13951a(AddressChooserActionSheet addressChooserActionSheet) {
                super(0);
                this.f41337d = addressChooserActionSheet;
            }

            /* renamed from: b */
            public final C12597o invoke() {
                return this.f41337d.mo39023n2().mo32804a(this.f41337d.m51896m2().mo39024a(), this.f41337d.m51896m2().mo39028e(), this.f41337d.m51896m2().mo39026d());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13950o(AddressChooserActionSheet addressChooserActionSheet) {
            super(0);
            this.f41336d = addressChooserActionSheet;
        }

        public final C1620q0.C1624b invoke() {
            return C32286a1.f79687a.mo72809a(new C13951a(this.f41336d));
        }
    }

    public AddressChooserActionSheet() {
        C13950o oVar = new C13950o(this);
        C41217g a = C41219i.m119469a(C41222k.NONE, new C13947l(new C13946k(this)));
        this.f41319O = C1514j0.m5374c(this, C41520a0.m120436b(C12597o.class), new C13948m(a), new C13949n((C43064a) null, a), oVar);
    }

    /* renamed from: i2 */
    private final void m51892i2() {
        m51895l2().f45775i.setOnTextChangeListener(new C13938c(m51897o2().mo33277gw()));
    }

    /* renamed from: j2 */
    private final void m51893j2() {
        C12592n hw = m51897o2().mo33278hw();
        hw.mo33276Rg().mo4819k(getViewLifecycleOwner(), new C13944i(new C13939d(this)));
        hw.mo33273Fu().mo4819k(getViewLifecycleOwner(), new C13944i(new C13940e(m51894k2())));
        LiveData Op = hw.mo33275Op();
        C1619q viewLifecycleOwner = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner, "viewLifecycleOwner");
        C37224b.m109963b(Op, viewLifecycleOwner, new C13941f(this));
        LiveData N6 = hw.mo33274N6();
        C1619q viewLifecycleOwner2 = getViewLifecycleOwner();
        C41536l.m120488h(viewLifecycleOwner2, "viewLifecycleOwner");
        C37224b.m109963b(N6, viewLifecycleOwner2, new C13942g(this));
    }

    /* renamed from: k2 */
    private final C17992b m51894k2() {
        return (C17992b) this.f41317M.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: l2 */
    public final C16218b m51895l2() {
        C16218b bVar = this.f41316L;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public final Data m51896m2() {
        return (Data) this.f41318N.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public final C12597o m51897o2() {
        return (C12597o) this.f41319O.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static final boolean m51898p2(AddressChooserActionSheet addressChooserActionSheet, DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C41536l.m120489i(addressChooserActionSheet, "this$0");
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        addressChooserActionSheet.mo26366S1();
        return true;
    }

    /* renamed from: q2 */
    private final void m51899q2() {
        m51895l2().f45771e.setItemAnimator((RecyclerView.C1742m) null);
        m51895l2().f45771e.setAdapter(m51894k2());
        C13945j jVar = new C13945j(requireContext(), C12487d.f37172u);
        m51895l2().f45773g.setText(C32343x.m95388F("text.applications.debitcard.delivery.tbilisi.only", new Object[0]));
        Group group = m51895l2().f45774h;
        C41536l.m120488h(group, "binding.onlyTbilisiInfo");
        C32343x.m95483r1(group, C41341q.m119910m(C18781a.INSTANT_DELIVERY_DISTRICT, C18781a.DELIVERY_DISTRICT).contains(m51896m2().mo39028e()), false, 2, (Object) null);
        m51895l2().f45771e.mo5351j(jVar);
    }

    /* renamed from: S1 */
    public void mo26366S1() {
        super.mo26366S1();
        m51897o2().mo33277gw().mo33271ec();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41316L = C16218b.m57801d(layoutInflater, viewGroup, true);
    }

    /* renamed from: n2 */
    public final C12582l mo39023n2() {
        C12582l lVar = this.f41315K;
        if (lVar != null) {
            return lVar;
        }
        C41536l.m120506z("factory");
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f41316L = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m51899q2();
        m51893j2();
        m51892i2();
    }

    /* renamed from: q1 */
    public Dialog mo710q1(Bundle bundle) {
        Dialog q1 = super.mo710q1(bundle);
        q1.setOnKeyListener(new C13952a(this));
        return q1;
    }
}
