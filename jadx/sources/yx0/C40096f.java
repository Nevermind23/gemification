package yx0;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.core.content.C0767a;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fx0.C32022b;
import fx0.C32023c;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import jx0.C36811b;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.C13364a;
import p341ge.bog.mobilebank.payments.presentation.form.model.SelectElementViewData;
import p349ah.C9860d;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: yx0.f */
public final class C40096f extends C9860d implements C43075l {

    /* renamed from: H */
    public static final C40097a f95327H = new C40097a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C36811b f95328B;

    /* renamed from: C */
    private final C41217g f95329C = C41219i.m119470b(new C40102f(this));

    /* renamed from: D */
    private final C41217g f95330D = C41219i.m119470b(new C40098b(this));

    /* renamed from: E */
    private final C41217g f95331E = C41219i.m119470b(new C40103g(this));

    /* renamed from: F */
    private final C40104g f95332F = new C40104g();

    /* renamed from: G */
    private final C41217g f95333G = C41219i.m119470b(new C40101e(this));

    /* renamed from: yx0.f$a */
    public static final class C40097a {
        private C40097a() {
        }

        public /* synthetic */ C40097a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40096f mo94043a(String str, List list, Integer num, int i) {
            int i2;
            C41536l.m120489i(str, "optionsTitle");
            C41536l.m120489i(list, "optionsList");
            C40096f fVar = new C40096f();
            Bundle bundle = new Bundle();
            bundle.putString("options_title", str);
            if (num != null) {
                i2 = num.intValue();
            } else {
                i2 = -1;
            }
            bundle.putInt("selected_pos", i2);
            bundle.putInt("element_index", i);
            bundle.putParcelableArrayList("options_list", new ArrayList(list));
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: yx0.f$b */
    static final class C40098b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40096f f95334d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40098b(C40096f fVar) {
            super(0);
            this.f95334d = fVar;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Bundle arguments = this.f95334d.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt("element_index"));
            }
            return null;
        }
    }

    /* renamed from: yx0.f$c */
    /* synthetic */ class C40099c extends C41535k implements C43075l {
        C40099c(Object obj) {
            super(1, obj, C40111j.class, "filter", "filter(Ljava/lang/CharSequence;)V", 0);
        }

        /* renamed from: b */
        public final void mo94045b(CharSequence charSequence) {
            ((C40111j) this.receiver).filter(charSequence);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94045b((CharSequence) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yx0.f$d */
    static final class C40100d extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C40096f f95335d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40100d(C40096f fVar) {
            super(1);
            this.f95335d = fVar;
        }

        /* renamed from: a */
        public final void mo94046a(List list) {
            C41536l.m120489i(list, "filteredOptions");
            this.f95335d.m116208q2(list);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo94046a((List) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: yx0.f$e */
    static final class C40101e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40096f f95336d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40101e(C40096f fVar) {
            super(0);
            this.f95336d = fVar;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            ArrayList arrayList = null;
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle arguments = this.f95336d.getArguments();
                if (arguments != null) {
                    arrayList = arguments.getParcelableArrayList("options_list", SelectElementViewData.class);
                }
            } else {
                Bundle arguments2 = this.f95336d.getArguments();
                if (arguments2 != null) {
                    arrayList = arguments2.getParcelableArrayList("options_list");
                }
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Invalid options list argument".toString());
        }
    }

    /* renamed from: yx0.f$f */
    static final class C40102f extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40096f f95337d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40102f(C40096f fVar) {
            super(0);
            this.f95337d = fVar;
        }

        public final String invoke() {
            Bundle arguments = this.f95337d.getArguments();
            if (arguments != null) {
                return arguments.getString("options_title");
            }
            return null;
        }
    }

    /* renamed from: yx0.f$g */
    static final class C40103g extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40096f f95338d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40103g(C40096f fVar) {
            super(0);
            this.f95338d = fVar;
        }

        /* renamed from: b */
        public final Integer invoke() {
            Bundle arguments = this.f95338d.getArguments();
            if (arguments != null) {
                return Integer.valueOf(arguments.getInt("selected_pos"));
            }
            return null;
        }
    }

    /* renamed from: h2 */
    private final C36811b m116200h2() {
        C36811b bVar = this.f95328B;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* renamed from: i2 */
    private final Integer m116201i2() {
        return (Integer) this.f95330D.getValue();
    }

    /* renamed from: j2 */
    private final List m116202j2() {
        Object value = this.f95333G.getValue();
        C41536l.m120488h(value, "<get-optionsList>(...)");
        return (List) value;
    }

    /* renamed from: k2 */
    private final String m116203k2() {
        return (String) this.f95329C.getValue();
    }

    /* renamed from: l2 */
    private final Integer m116204l2() {
        return (Integer) this.f95331E.getValue();
    }

    /* renamed from: m2 */
    private final void m116205m2() {
        RecyclerView recyclerView = m116200h2().f88800e;
        recyclerView.setItemAnimator((RecyclerView.C1742m) null);
        boolean z = true;
        recyclerView.mo5351j(new C13364a(C0767a.m2895e(recyclerView.getContext(), C32023c.f78828a), true, false));
        C40104g gVar = this.f95332F;
        gVar.mo94050l(this);
        gVar.mo6030j(m116202j2(), new C40093c(gVar, this));
        recyclerView.setAdapter(gVar);
        if (m116202j2().size() < 8 || !((SelectElementViewData) C41358y.m120007W(m116202j2())).mo80347g()) {
            z = false;
        }
        if (z) {
            m116200h2().f88801f.setVisibility(0);
            m116200h2().f88801f.setOnTextChangeListener(new C40099c(new C40111j(m116202j2(), new C40100d(this))));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public static final void m116206n2(C40104g gVar, C40096f fVar) {
        C41536l.m120489i(gVar, "$adapter");
        C41536l.m120489i(fVar, "this$0");
        gVar.mo94051m(fVar.m116204l2());
    }

    /* renamed from: p2 */
    private final void m116207p2() {
        mo26370a2(m116203k2());
        mo26369Z1(getResources().getDimensionPixelSize(C32022b.action_sheet_peek_height_default));
        BottomSheetBehavior K1 = mo26359K1();
        if (K1 != null) {
            K1.mo15579I0(4);
            K1.mo15578H0(false);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public final void m116208q2(List list) {
        this.f95332F.mo6030j(list, new C40094d(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: r2 */
    public static final void m116209r2(C40096f fVar) {
        C41536l.m120489i(fVar, "this$0");
        RecyclerView recyclerView = fVar.m116200h2().f88800e;
        recyclerView.post(new C40095e(recyclerView));
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public static final void m116210s2(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "$this_with");
        recyclerView.mo5425x1(0);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f95328B = C36811b.m109057d(layoutInflater, viewGroup, true);
        m116207p2();
        m116205m2();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo94042o2((SelectElementViewData) obj);
        return C41238w.f97225a;
    }

    /* renamed from: o2 */
    public void mo94042o2(SelectElementViewData selectElementViewData) {
        C41536l.m120489i(selectElementViewData, "option");
        C1533o.m5445b(this, "SELECT_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("SELECT_RESULT_KEY", selectElementViewData.mo80342d()), C41233s.m119492a("SELECT_RESULT_ELEMENT_INDEX", m116201i2())));
        mo4577k1();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f95328B = null;
    }
}
