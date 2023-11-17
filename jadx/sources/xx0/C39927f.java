package xx0;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import fx0.C32022b;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import java.util.ArrayList;
import java.util.List;
import jx0.C36809a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ox0.C37833c;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.pagedescription.PageDescriptionView;
import p341ge.bog.mobilebank.payments.domain.model.PaymentCard;
import p341ge.bog.mobilebank.shared.helper.C34646b;
import p349ah.C9860d;
import q31.C38122f;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: xx0.f */
public final class C39927f extends C9860d implements C43075l {

    /* renamed from: I */
    public static final C39928a f94720I = new C39928a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C36809a f94721B;

    /* renamed from: C */
    private final String f94722C = C34646b.m101752f(C37833c.f90838a.mo91156r(), (Context) null, 1, (Object) null);

    /* renamed from: D */
    private final C41217g f94723D = C41219i.m119470b(new C39932e(this));

    /* renamed from: E */
    private final C41217g f94724E = C41219i.m119470b(new C39931d(this));

    /* renamed from: F */
    private final C41217g f94725F = C41219i.m119470b(new C39929b(this));

    /* renamed from: G */
    private final C41217g f94726G = C41219i.m119470b(new C39930c(this));

    /* renamed from: H */
    private final C39925d f94727H = new C39925d(this);

    /* renamed from: xx0.f$a */
    public static final class C39928a {
        private C39928a() {
        }

        public /* synthetic */ C39928a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39927f mo93661a(List list, Long l, boolean z, String str) {
            long j;
            C41536l.m120489i(list, "cardList");
            C39927f fVar = new C39927f();
            Bundle bundle = new Bundle();
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
            }
            bundle.putLong("selected_id", j);
            bundle.putBoolean("can_order_card", z);
            bundle.putString("description_text", str);
            bundle.putParcelableArrayList("cards_list", new ArrayList(list));
            fVar.setArguments(bundle);
            return fVar;
        }
    }

    /* renamed from: xx0.f$b */
    static final class C39929b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39927f f94728d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39929b(C39927f fVar) {
            super(0);
            this.f94728d = fVar;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            Bundle arguments = this.f94728d.getArguments();
            if (arguments != null) {
                return Boolean.valueOf(arguments.getBoolean("can_order_card"));
            }
            return null;
        }
    }

    /* renamed from: xx0.f$c */
    static final class C39930c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39927f f94729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39930c(C39927f fVar) {
            super(0);
            this.f94729d = fVar;
        }

        /* renamed from: b */
        public final ArrayList invoke() {
            ArrayList arrayList = null;
            if (Build.VERSION.SDK_INT >= 33) {
                Bundle arguments = this.f94729d.getArguments();
                if (arguments != null) {
                    arrayList = arguments.getParcelableArrayList("cards_list", PaymentCard.class);
                }
            } else {
                Bundle arguments2 = this.f94729d.getArguments();
                if (arguments2 != null) {
                    arrayList = arguments2.getParcelableArrayList("cards_list");
                }
            }
            if (arrayList != null) {
                return arrayList;
            }
            throw new IllegalArgumentException("Invalid card list argument".toString());
        }
    }

    /* renamed from: xx0.f$d */
    static final class C39931d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39927f f94730d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39931d(C39927f fVar) {
            super(0);
            this.f94730d = fVar;
        }

        public final String invoke() {
            Bundle arguments = this.f94730d.getArguments();
            if (arguments != null) {
                return arguments.getString("description_text");
            }
            return null;
        }
    }

    /* renamed from: xx0.f$e */
    static final class C39932e extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C39927f f94731d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39932e(C39927f fVar) {
            super(0);
            this.f94731d = fVar;
        }

        /* renamed from: b */
        public final Long invoke() {
            Bundle arguments = this.f94731d.getArguments();
            if (arguments != null) {
                return Long.valueOf(arguments.getLong("selected_id"));
            }
            return null;
        }
    }

    /* renamed from: e2 */
    private final C36809a m115781e2() {
        C36809a aVar = this.f94721B;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: f2 */
    private final Boolean m115782f2() {
        return (Boolean) this.f94725F.getValue();
    }

    /* renamed from: g2 */
    private final List m115783g2() {
        Object value = this.f94726G.getValue();
        C41536l.m120488h(value, "<get-cardList>(...)");
        return (List) value;
    }

    /* renamed from: h2 */
    private final String m115784h2() {
        return (String) this.f94724E.getValue();
    }

    /* renamed from: i2 */
    private final Long m115785i2() {
        return (Long) this.f94723D.getValue();
    }

    /* renamed from: j2 */
    private final void m115786j2() {
        String str;
        boolean z;
        boolean z2;
        C36809a e2 = m115781e2();
        LinearLayout linearLayout = e2.f88795h;
        C41536l.m120488h(linearLayout, "noCardView");
        C32343x.m95483r1(linearLayout, m115783g2().isEmpty(), false, 2, (Object) null);
        Button button = e2.f88796i;
        C41536l.m120488h(button, "orderCardButton");
        Boolean f2 = m115782f2();
        Boolean bool = Boolean.TRUE;
        C32343x.m95483r1(button, C41536l.m120484d(f2, bool), false, 2, (Object) null);
        PageDescriptionView pageDescriptionView = e2.f88794g;
        if (C41536l.m120484d(m115782f2(), bool)) {
            str = C34646b.m101752f(C37833c.f90838a.mo91155q(), (Context) null, 1, (Object) null);
        } else {
            str = C34646b.m101752f(C37833c.f90838a.mo91154p(), (Context) null, 1, (Object) null);
        }
        pageDescriptionView.setText(str);
        PageDescriptionView pageDescriptionView2 = e2.f88792e;
        C41536l.m120488h(pageDescriptionView2, "cardNotSelectedDescription");
        String h2 = m115784h2();
        if (h2 == null || h2.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z || !(!m115783g2().isEmpty())) {
            z2 = false;
        } else {
            z2 = true;
        }
        C32343x.m95483r1(pageDescriptionView2, z2, false, 2, (Object) null);
        e2.f88792e.setText(m115784h2());
        e2.f88796i.setButtonText(C34646b.m101752f(C37833c.f90838a.mo91153o(), (Context) null, 1, (Object) null));
        e2.f88796i.setOnClickListener(new C39926e(this));
        RecyclerView recyclerView = e2.f88793f;
        C41536l.m120488h(recyclerView, "cardsRecycler");
        C32343x.m95483r1(recyclerView, !m115783g2().isEmpty(), false, 2, (Object) null);
        e2.f88793f.setItemAnimator((RecyclerView.C1742m) null);
        RecyclerView recyclerView2 = e2.f88793f;
        C39925d dVar = this.f94727H;
        dVar.mo93658o(m115785i2());
        dVar.mo6029i(m115783g2());
        recyclerView2.setAdapter(dVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m115787k2(C39927f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        Context context = fVar.getContext();
        if (context != null) {
            C38122f.C38123a.m112219o(C38125h.m112238c(context), context, (String) null, (String) null, false, 8, (Object) null);
            fVar.mo4577k1();
        }
    }

    /* renamed from: m2 */
    private final void m115788m2() {
        mo26370a2(this.f94722C);
        mo26369Z1(getResources().getDimensionPixelSize(C32022b.action_sheet_peek_height_default));
        BottomSheetBehavior K1 = mo26359K1();
        if (K1 != null) {
            K1.mo15579I0(4);
            K1.mo15578H0(false);
        }
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f94721B = C36809a.m109049d(layoutInflater, viewGroup, true);
        m115788m2();
        m115786j2();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo93660l2(((Number) obj).longValue());
        return C41238w.f97225a;
    }

    /* renamed from: l2 */
    public void mo93660l2(long j) {
        C1533o.m5445b(this, "SELECT_CARD_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("SELECT_CARD_RESULT_KEY", Long.valueOf(j))));
        mo4577k1();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f94721B = null;
    }
}
