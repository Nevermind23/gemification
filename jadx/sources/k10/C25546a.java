package k10;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.C1942e;
import androidx.viewpager2.widget.ViewPager2;
import b50.C19333a;
import com.google.android.material.tabs.TabLayout;
import f50.C20432f;
import g91.C32319m;
import g91.C32343x;
import i10.C25100c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k10.C25566i;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n10.C26344e;
import n10.C26352l;
import n10.C26357q;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.datefilter.DateFilterView;
import p341ge.bog.designsystem.components.textgroup.TextGroupView;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p366bk.C10313b;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import t10.C28296a;
import t10.C28297b;
import t10.C28298c;
import ue1.C43064a;
import ue1.C43075l;
import ue1.C43079p;
import x00.C29615f;

/* renamed from: k10.a */
public final class C25546a extends C29615f {

    /* renamed from: O */
    public static final C25547a f65216O = new C25547a((DefaultConstructorMarker) null);

    /* renamed from: A */
    private C43064a f65217A;

    /* renamed from: B */
    private C43064a f65218B;

    /* renamed from: C */
    private C43064a f65219C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C43064a f65220D;

    /* renamed from: E */
    private C43075l f65221E;

    /* renamed from: F */
    private C43075l f65222F;

    /* renamed from: G */
    private C43075l f65223G;

    /* renamed from: H */
    private C43075l f65224H;

    /* renamed from: I */
    private C43064a f65225I;

    /* renamed from: J */
    private C43064a f65226J;

    /* renamed from: K */
    private C43064a f65227K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C43079p f65228L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public FilterValue.Calendar f65229M = new FilterValue.Calendar(0, (Long) null, (Long) null, 0L);

    /* renamed from: N */
    private List f65230N = C41341q.m119907j();

    /* renamed from: f */
    private ArrayList f65231f;

    /* renamed from: g */
    private C28297b f65232g;

    /* renamed from: h */
    private C28298c f65233h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final boolean f65234i;

    /* renamed from: j */
    private final boolean f65235j;

    /* renamed from: k */
    private boolean f65236k;

    /* renamed from: l */
    private boolean f65237l;

    /* renamed from: m */
    private final C25566i.C25567a f65238m;

    /* renamed from: n */
    private List f65239n = C41341q.m119907j();

    /* renamed from: o */
    private List f65240o = C41341q.m119907j();
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f65241p = "";
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f65242q = "";

    /* renamed from: r */
    private C25558k f65243r = C25558k.HISTORY;

    /* renamed from: s */
    private boolean f65244s;

    /* renamed from: t */
    private boolean f65245t;

    /* renamed from: u */
    private boolean f65246u = true;

    /* renamed from: v */
    private C43064a f65247v;

    /* renamed from: w */
    private C43064a f65248w;

    /* renamed from: x */
    private C43075l f65249x;

    /* renamed from: y */
    private C43064a f65250y;

    /* renamed from: z */
    private C43064a f65251z;

    /* renamed from: k10.a$a */
    public static final class C25547a {
        private C25547a() {
        }

        public /* synthetic */ C25547a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: k10.a$b */
    public final class C25548b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TextView f65252d;

        /* renamed from: e */
        final /* synthetic */ C25546a f65253e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25548b(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65253e = aVar;
            View findViewById = view.findViewById(C10322k.contact_add_new_text_view);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.…ontact_add_new_text_view)");
            this.f65252d = (TextView) findViewById;
            view.setOnClickListener(new C25559b(aVar, view));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m80770i(C25546a aVar, View view, View view2) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(view, "$itemView");
            C43075l O = aVar.mo64088O();
            if (O != null) {
                O.invoke(view);
            }
        }

        /* renamed from: j */
        public final void mo64123j() {
            int i;
            TextView textView = this.f65252d;
            if (this.f65253e.f65234i) {
                i = C10328q.contact_add_treasury_code;
            } else {
                i = C10328q.contact_add_new_account;
            }
            textView.setText(i);
        }
    }

    /* renamed from: k10.a$c */
    public final class C25549c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final DateFilterView f65254d;

        /* renamed from: e */
        final /* synthetic */ C25546a f65255e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25549c(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65255e = aVar;
            View findViewById = view.findViewById(C10322k.calendar_filter_view);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.calendar_filter_view)");
            this.f65254d = (DateFilterView) findViewById;
            view.setOnClickListener(new C25560c(aVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m80773i(C25546a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C43064a G = aVar.f65220D;
            if (G != null) {
                G.invoke();
            }
        }

        /* renamed from: j */
        public final void mo64124j() {
            long j;
            this.f65254d.setStartTimestamp(this.f65255e.f65229M.mo53804d());
            DateFilterView dateFilterView = this.f65254d;
            Long a = this.f65255e.f65229M.mo53802a();
            if (a != null) {
                j = a.longValue();
            } else {
                j = C32319m.m95305l();
            }
            dateFilterView.setEndTimestamp(j);
        }
    }

    /* renamed from: k10.a$d */
    public final class C25550d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final Button f65256d;

        /* renamed from: e */
        final /* synthetic */ C25546a f65257e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25550d(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65257e = aVar;
            View findViewById = view.findViewById(C10322k.message_button);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.message_button)");
            Button button = (Button) findViewById;
            this.f65256d = button;
            button.setOnClickListener(new C25561d(aVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m80776i(C25546a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C43064a P = aVar.mo64089P();
            if (P != null) {
                P.invoke();
            }
        }
    }

    /* renamed from: k10.a$e */
    public final class C25551e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final Button f65258d;

        /* renamed from: e */
        final /* synthetic */ C25546a f65259e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25551e(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65259e = aVar;
            View findViewById = view.findViewById(C10322k.message_button);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.message_button)");
            Button button = (Button) findViewById;
            this.f65258d = button;
            button.setOnClickListener(new C25562e(aVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public static final void m80778i(C25546a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            C43064a Q = aVar.mo64090Q();
            if (Q != null) {
                Q.invoke();
            }
        }
    }

    /* renamed from: k10.a$f */
    public final class C25552f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C25546a f65260d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25552f(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65260d = aVar;
        }
    }

    /* renamed from: k10.a$g */
    public final class C25553g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final LinearLayout f65261d;

        /* renamed from: e */
        private final Animation f65262e;

        /* renamed from: f */
        final /* synthetic */ C25546a f65263f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25553g(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65263f = aVar;
            View findViewById = view.findViewById(C10322k.f28797Uj);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.loading_view)");
            this.f65261d = (LinearLayout) findViewById;
            this.f65262e = AnimationUtils.loadAnimation(view.getContext(), C10313b.infinite_alpha);
        }

        /* renamed from: h */
        public final void mo64125h() {
            this.f65261d.startAnimation(this.f65262e);
        }
    }

    /* renamed from: k10.a$h */
    public final class C25554h extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TabLayout f65264d;

        /* renamed from: e */
        final /* synthetic */ C25546a f65265e;

        /* renamed from: k10.a$h$a */
        public static final class C25555a implements TabLayout.C5149d {

            /* renamed from: a */
            final /* synthetic */ C25546a f65266a;

            C25555a(C25546a aVar) {
                this.f65266a = aVar;
            }

            /* renamed from: a */
            public void mo16942a(TabLayout.C5153g gVar) {
                C41536l.m120489i(gVar, "tab");
                this.f65266a.mo64115p0(gVar.mo16958g());
            }

            /* renamed from: b */
            public void mo16943b(TabLayout.C5153g gVar) {
                C41536l.m120489i(gVar, "tab");
            }

            /* renamed from: c */
            public void mo16944c(TabLayout.C5153g gVar) {
                C41536l.m120489i(gVar, "tab");
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25554h(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65265e = aVar;
            View findViewById = view.findViewById(C10322k.contact_tab_layout);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.contact_tab_layout)");
            TabLayout tabLayout = (TabLayout) findViewById;
            this.f65264d = tabLayout;
            tabLayout.addOnTabSelectedListener((TabLayout.C5149d) new C25555a(aVar));
        }

        /* renamed from: h */
        public final void mo64126h() {
            int i;
            TabLayout.C5153g tabAt = this.f65264d.getTabAt(C25558k.ACCOUNTS.mo64129b());
            if (tabAt != null) {
                if (this.f65265e.f65234i) {
                    i = C10328q.contact_treasury_tab;
                } else {
                    i = C10328q.f28938S4;
                }
                tabAt.mo16971t(i);
            }
        }
    }

    /* renamed from: k10.a$i */
    public final class C25556i extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final TextGroupView f65267d;

        /* renamed from: e */
        private final TextGroupView f65268e;

        /* renamed from: f */
        final /* synthetic */ C25546a f65269f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25556i(C25546a aVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f65269f = aVar;
            View findViewById = view.findViewById(C10322k.f28718Dm);
            C41536l.m120488h(findViewById, "itemView.findViewById(R.id.negative_button)");
            TextGroupView textGroupView = (TextGroupView) findViewById;
            this.f65267d = textGroupView;
            View findViewById2 = view.findViewById(C10322k.f28782Pp);
            C41536l.m120488h(findViewById2, "itemView.findViewById(R.id.positive_button)");
            TextGroupView textGroupView2 = (TextGroupView) findViewById2;
            this.f65268e = textGroupView2;
            textGroupView.setOnClickListener(new C25563f(this, aVar));
            textGroupView2.setOnClickListener(new C25564g(this, aVar));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m80786j(C25556i iVar, C25546a aVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C32343x.m95474o1(iVar.f65267d);
            if (iVar.f65267d.mo36844a() && iVar.f65268e.mo36844a()) {
                C32343x.m95474o1(iVar.f65268e);
            }
            C43079p H = aVar.f65228L;
            if (H != null) {
                H.invoke(Boolean.valueOf(iVar.f65267d.mo36844a()), Boolean.FALSE);
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m80787k(C25556i iVar, C25546a aVar, View view) {
            C41536l.m120489i(iVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C32343x.m95474o1(iVar.f65268e);
            if (iVar.f65268e.mo36844a() && iVar.f65267d.mo36844a()) {
                C32343x.m95474o1(iVar.f65267d);
            }
            C43079p H = aVar.f65228L;
            if (H != null) {
                H.invoke(Boolean.FALSE, Boolean.valueOf(iVar.f65268e.mo36844a()));
            }
        }

        /* renamed from: l */
        public final void mo64127l() {
            this.f65267d.setBottomTitle(this.f65269f.f65242q);
            this.f65268e.setBottomTitle(this.f65269f.f65241p);
        }
    }

    /* renamed from: k10.a$j */
    public static final class C25557j extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final ViewPager2 f65270d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25557j(View view, C25566i.C25567a aVar) {
            super(view);
            C41536l.m120489i(view, "itemView");
            ViewPager2 viewPager2 = (ViewPager2) view.findViewById(C10322k.money_requests_pager);
            viewPager2.setOffscreenPageLimit(1);
            viewPager2.setPageTransformer(new C1942e(C32343x.m95394I(8)));
            viewPager2.setAdapter(new C25566i(aVar));
            this.f65270d = viewPager2;
        }

        /* renamed from: h */
        public final void mo64128h(List list) {
            C41536l.m120489i(list, "requests");
            RecyclerView.C1736h adapter = this.f65270d.getAdapter();
            C41536l.m120487g(adapter, "null cannot be cast to non-null type ge.bog.mobilebank.cleanarch.presentation.contacts.details.adapter.MoneyRequestPagerAdapter");
            ((C25566i) adapter).mo6029i(list);
        }
    }

    /* renamed from: k10.a$k */
    public enum C25558k {
        HISTORY(0),
        ACCOUNTS(1);
        

        /* renamed from: d */
        private final int f65274d;

        private C25558k(int i) {
            this.f65274d = i;
        }

        /* renamed from: b */
        public final int mo64129b() {
            return this.f65274d;
        }
    }

    public C25546a(ArrayList arrayList, C28297b bVar, C28298c cVar, boolean z, boolean z2, boolean z3, boolean z4, C25566i.C25567a aVar) {
        C41536l.m120489i(arrayList, "accounts");
        C41536l.m120489i(bVar, "contactNameItem");
        C41536l.m120489i(cVar, "profilePictureItem");
        this.f65231f = arrayList;
        this.f65232g = bVar;
        this.f65233h = cVar;
        this.f65234i = z;
        this.f65235j = z2;
        this.f65236k = z3;
        this.f65237l = z4;
        this.f65238m = aVar;
    }

    /* renamed from: L */
    private final void m80728L(int i, C20432f fVar) {
        C20432f.C20434b bVar = (C20432f.C20434b) this.f65240o.get(i);
        if (bVar instanceof C20432f.C20434b.C20436b) {
            C20432f.m66575q(fVar, (C20432f.C20434b.C20436b) bVar, (C43075l) null, Boolean.TRUE, (C43075l) null, 8, (Object) null);
        } else if (bVar instanceof C20432f.C20434b.C20435a) {
            String a = ((C20432f.C20434b.C20435a) bVar).mo48922a();
            if (a == null) {
                a = "";
            }
            fVar.mo48920r(a);
        }
    }

    /* renamed from: N */
    private final int m80729N() {
        return this.f65234i ? 10 : 5;
    }

    /* renamed from: K */
    public final void mo64086K(C28296a aVar) {
        C41536l.m120489i(aVar, "account");
        this.f65231f.add(aVar);
        if (this.f65243r == C25558k.ACCOUNTS) {
            mo69513f(m80729N(), 1);
            mo69516r(m80729N());
        }
    }

    /* renamed from: M */
    public final void mo64087M(String str) {
        C41536l.m120489i(str, "acctNo");
        int i = -1;
        int i2 = 0;
        for (Object next : this.f65231f) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                C41341q.m119917t();
            }
            if (C41536l.m120484d(((C28296a) next).mo67926a(), str)) {
                i = i2;
            }
            i2 = i3;
        }
        this.f65231f.remove(i);
        mo69518t(m80729N(), i);
        mo69516r(m80729N());
    }

    /* renamed from: O */
    public final C43075l mo64088O() {
        return this.f65249x;
    }

    /* renamed from: P */
    public final C43064a mo64089P() {
        return this.f65247v;
    }

    /* renamed from: Q */
    public final C43064a mo64090Q() {
        return this.f65248w;
    }

    /* renamed from: R */
    public final boolean mo64091R() {
        return this.f65236k;
    }

    /* renamed from: S */
    public final void mo64092S(C43064a aVar) {
        C41536l.m120489i(aVar, "onClick");
        this.f65227K = aVar;
    }

    /* renamed from: T */
    public final void mo64093T(C43064a aVar) {
        C41536l.m120489i(aVar, "moneyRequestClickListener");
        this.f65226J = aVar;
    }

    /* renamed from: U */
    public final void mo64094U(C43064a aVar) {
        C41536l.m120489i(aVar, "listener");
        this.f65225I = aVar;
    }

    /* renamed from: V */
    public final void mo64095V() {
        this.f65245t = true;
        if (this.f65243r == C25558k.HISTORY) {
            mo69520v(4, 7, m80729N(), 6, 9);
            C29615f.m89897A(this, 2, 1, false, 4, (Object) null);
            C29615f.m89897A(this, 3, 1, false, 4, (Object) null);
            C29615f.m89897A(this, 8, 1, false, 4, (Object) null);
        }
    }

    /* renamed from: W */
    public final void mo64096W(C43075l lVar) {
        C41536l.m120489i(lVar, "listener");
        this.f65224H = lVar;
    }

    /* renamed from: X */
    public final void mo64097X(FilterValue.Calendar calendar) {
        C41536l.m120489i(calendar, "calendarValue");
        this.f65229M = calendar;
        mo69516r(2);
    }

    /* renamed from: Y */
    public final void mo64098Y(C43075l lVar) {
        this.f65222F = lVar;
    }

    /* renamed from: Z */
    public final void mo64099Z(String str) {
        C41536l.m120489i(str, "income");
        this.f65241p = str;
        mo69516r(3);
    }

    /* renamed from: a0 */
    public final void mo64100a0(List list) {
        C41536l.m120489i(list, "requests");
        this.f65230N = list;
        C29615f.m89897A(this, 12, list.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
    }

    /* renamed from: b0 */
    public final void mo64101b0(C43064a aVar) {
        this.f65218B = aVar;
    }

    /* renamed from: c0 */
    public final void mo64102c0(C43064a aVar) {
        this.f65220D = aVar;
    }

    /* renamed from: d0 */
    public final void mo64103d0(C43064a aVar) {
        this.f65251z = aVar;
    }

    /* renamed from: e0 */
    public final void mo64104e0(C43064a aVar) {
        this.f65250y = aVar;
    }

    /* renamed from: f0 */
    public final void mo64105f0(C43064a aVar) {
        this.f65217A = aVar;
    }

    /* renamed from: g0 */
    public final void mo64106g0(C43079p pVar) {
        this.f65228L = pVar;
    }

    /* renamed from: h0 */
    public final void mo64107h0(C43075l lVar) {
        this.f65249x = lVar;
    }

    /* renamed from: i0 */
    public final void mo64108i0(C43064a aVar) {
        this.f65219C = aVar;
    }

    /* renamed from: j0 */
    public final void mo64109j0(C43064a aVar) {
        this.f65247v = aVar;
    }

    /* renamed from: k0 */
    public final void mo64110k0(C43064a aVar) {
        this.f65248w = aVar;
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(0, 1), new C29615f.C29617b(12, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(1, 1), new C29615f.C29617b(2, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(3, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(4, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(11, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(m80729N(), 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(6, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(7, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(8, 0, 2, (DefaultConstructorMarker) null), new C29615f.C29617b(9, 0, 2, (DefaultConstructorMarker) null));
    }

    /* renamed from: l0 */
    public final void mo64111l0(String str) {
        C41536l.m120489i(str, "outcome");
        this.f65242q = str;
        mo69516r(3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r5.compareTo(r8) > 0) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0088, code lost:
        if (r5.compareTo(r8) < 0) goto L_0x008a;
     */
    /* renamed from: m0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64112m0(boolean r11, boolean r12) {
        /*
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r10.f65239n
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0022
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof f50.C20432f.C20434b.C20436b
            if (r4 == 0) goto L_0x0010
            r2.add(r3)
            goto L_0x0010
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x002b:
            boolean r3 = r2.hasNext()
            r4 = 0
            if (r3 == 0) goto L_0x0091
            java.lang.Object r3 = r2.next()
            r5 = r3
            f50.f$b$b r5 = (f50.C20432f.C20434b.C20436b) r5
            ge.bog.mobilebank.model.account.AccountOperation r6 = r5.mo48927a()
            if (r6 != 0) goto L_0x0040
            goto L_0x008b
        L_0x0040:
            r6 = 1
            java.lang.String r7 = "valueOf(this.toLong())"
            r8 = 0
            if (r11 == 0) goto L_0x0068
            ge.bog.mobilebank.model.account.AccountOperation r5 = r5.mo48927a()
            if (r5 == 0) goto L_0x0053
            java.math.BigDecimal r5 = r5.getAmount()
            if (r5 != 0) goto L_0x005a
        L_0x0053:
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r8)
            kotlin.jvm.internal.C41536l.m120488h(r5, r7)
        L_0x005a:
            java.math.BigDecimal r8 = java.math.BigDecimal.valueOf(r8)
            kotlin.jvm.internal.C41536l.m120488h(r8, r7)
            int r5 = r5.compareTo(r8)
            if (r5 <= 0) goto L_0x008b
            goto L_0x008a
        L_0x0068:
            if (r12 == 0) goto L_0x008a
            ge.bog.mobilebank.model.account.AccountOperation r5 = r5.mo48927a()
            if (r5 == 0) goto L_0x0076
            java.math.BigDecimal r5 = r5.getAmount()
            if (r5 != 0) goto L_0x007d
        L_0x0076:
            java.math.BigDecimal r5 = java.math.BigDecimal.valueOf(r8)
            kotlin.jvm.internal.C41536l.m120488h(r5, r7)
        L_0x007d:
            java.math.BigDecimal r8 = java.math.BigDecimal.valueOf(r8)
            kotlin.jvm.internal.C41536l.m120488h(r8, r7)
            int r5 = r5.compareTo(r8)
            if (r5 >= 0) goto L_0x008b
        L_0x008a:
            r4 = r6
        L_0x008b:
            if (r4 == 0) goto L_0x002b
            r1.add(r3)
            goto L_0x002b
        L_0x0091:
            java.util.Iterator r11 = r1.iterator()
        L_0x0095:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x00a7
            java.lang.Object r12 = r11.next()
            f50.f$b$b r12 = (f50.C20432f.C20434b.C20436b) r12
            r1 = 2
            r2 = 0
            b50.C19333a.m64783b(r0, r12, r4, r1, r2)
            goto L_0x0095
        L_0x00a7:
            java.util.List r11 = ie1.C41358y.m120036z0(r0)
            r10.f65240o = r11
            r1 = 4
            int r2 = r11.size()
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r10
            x00.C29615f.m89897A(r0, r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k10.C25546a.mo64112m0(boolean, boolean):void");
    }

    /* renamed from: n0 */
    public final void mo64113n0(C43075l lVar) {
        this.f65223G = lVar;
    }

    /* renamed from: o0 */
    public final void mo64114o0(C43075l lVar) {
        this.f65221E = lVar;
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        switch (i) {
            case 0:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_details, viewGroup, false);
                C41536l.m120488h(inflate, "from(parent.context)\n   …t_details, parent, false)");
                C26352l lVar = new C26352l(inflate);
                lVar.mo65535v(this.f65250y);
                lVar.mo65534u(this.f65251z);
                lVar.mo65539z(this.f65219C);
                lVar.mo65538y(this.f65225I);
                lVar.mo65537x(this.f65226J);
                lVar.mo65536w(this.f65227K);
                return lVar;
            case 1:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_tab, viewGroup, false);
                C41536l.m120488h(inflate2, "from(parent.context)\n   …ntact_tab, parent, false)");
                return new C25554h(this, inflate2);
            case 2:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_calendar_filter, viewGroup, false);
                C41536l.m120488h(inflate3, "from(parent.context)\n   …ar_filter, parent, false)");
                return new C25549c(this, inflate3);
            case 3:
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_transfers, viewGroup, false);
                C41536l.m120488h(inflate4, "from(parent.context)\n   …transfers, parent, false)");
                return new C25556i(this, inflate4);
            case 5:
                C26344e a = C26344e.f66718p.mo65525a(viewGroup);
                a.mo65522s(this.f65221E);
                a.mo65521r(this.f65224H);
                a.mo65523t(this.f65222F);
                a.mo65524u(this.f65223G);
                return a;
            case 6:
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_add_acount, viewGroup, false);
                C41536l.m120488h(inflate5, "from(parent.context)\n   …dd_acount, parent, false)");
                return new C25548b(this, inflate5);
            case 7:
                View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_no_filtered_contact_history, viewGroup, false);
                C41536l.m120488h(inflate6, "from(parent.context)\n   …t_history, parent, false)");
                return new C25551e(this, inflate6);
            case 8:
                View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_error, viewGroup, false);
                C41536l.m120488h(inflate7, "from(parent.context)\n   …act_error, parent, false)");
                return new C25550d(this, inflate7);
            case 9:
                View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.item_contact_no_history, viewGroup, false);
                C41536l.m120488h(inflate8, "from(parent.context)\n   …o_history, parent, false)");
                return new C25552f(this, inflate8);
            case 10:
                C26357q a2 = C26357q.f66764o.mo65548a(viewGroup);
                a2.mo65545s(this.f65221E);
                a2.mo65544r(this.f65224H);
                a2.mo65546t(this.f65222F);
                a2.mo65547u(this.f65223G);
                return a2;
            case 11:
                View inflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.contact_operations_loading, viewGroup, false);
                C41536l.m120488h(inflate9, "from(parent.context)\n   …s_loading, parent, false)");
                return new C25553g(this, inflate9);
            case 12:
                return new C25557j(C32343x.m95467m0(viewGroup, C10324m.item_contact_details_money_request_pager, false), this.f65238m);
            default:
                C20432f.C20433a aVar = C20432f.f55387t;
                Activity a3 = C25100c.m80062a(viewGroup);
                C41536l.m120486f(a3);
                return C20432f.C20433a.m66586b(aVar, viewGroup, a3, "payment", false, 8, (Object) null);
        }
    }

    /* renamed from: p */
    public void mo48135p(RecyclerView.C1734f0 f0Var, int i, int i2) {
        C41536l.m120489i(f0Var, "holder");
        if (f0Var instanceof C26352l) {
            ((C26352l) f0Var).mo65533p(this.f65232g, this.f65233h, this.f65235j, this.f65236k, this.f65237l);
        } else if (f0Var instanceof C25549c) {
            ((C25549c) f0Var).mo64124j();
        } else if (f0Var instanceof C25556i) {
            ((C25556i) f0Var).mo64127l();
        } else if (f0Var instanceof C26344e) {
            Object obj = this.f65231f.get(i2);
            C41536l.m120488h(obj, "accounts[positionInSection]");
            ((C26344e) f0Var).mo65520n((C28296a) obj);
        } else if (f0Var instanceof C20432f) {
            m80728L(i2, (C20432f) f0Var);
        } else if (f0Var instanceof C26357q) {
            Object obj2 = this.f65231f.get(i2);
            C41536l.m120488h(obj2, "accounts[positionInSection]");
            ((C26357q) f0Var).mo65543n((C28296a) obj2);
        } else if (f0Var instanceof C25554h) {
            ((C25554h) f0Var).mo64126h();
        } else if (f0Var instanceof C25548b) {
            ((C25548b) f0Var).mo64123j();
        } else if (f0Var instanceof C25553g) {
            ((C25553g) f0Var).mo64125h();
        } else if (f0Var instanceof C25557j) {
            ((C25557j) f0Var).mo64128h(this.f65230N);
        }
    }

    /* renamed from: p0 */
    public final void mo64115p0(int i) {
        C25558k kVar = C25558k.HISTORY;
        if (i == kVar.mo64129b()) {
            C43064a aVar = this.f65217A;
            if (aVar != null) {
                aVar.invoke();
            }
            this.f65243r = kVar;
            C26344e.f66718p.mo65526b().removeCallbacksAndMessages((Object) null);
            C26357q.f66764o.mo65549b().removeCallbacksAndMessages((Object) null);
            mo69520v(m80729N(), 6, 7, 8, 4, 9, 11);
            C29615f.m89897A(this, 2, 1, false, 4, (Object) null);
            C29615f.m89897A(this, 3, 1, false, 4, (Object) null);
            if (this.f65246u) {
                C29615f.m89897A(this, 11, 3, false, 4, (Object) null);
            } else if (this.f65245t) {
                C29615f.m89897A(this, 8, 1, false, 4, (Object) null);
            } else if (this.f65240o.isEmpty() && !this.f65244s) {
                C29615f.m89897A(this, 9, 1, false, 4, (Object) null);
            } else if (!this.f65240o.isEmpty() || !this.f65244s) {
                C29615f.m89897A(this, 4, this.f65240o.size(), false, 4, (Object) null);
            } else {
                C29615f.m89897A(this, 7, 1, false, 4, (Object) null);
            }
        } else {
            C25558k kVar2 = C25558k.ACCOUNTS;
            if (i == kVar2.mo64129b()) {
                C43064a aVar2 = this.f65218B;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                this.f65243r = kVar2;
                mo69520v(4, 2, 3, 7, 8, 9, 11);
                C29615f.m89897A(this, m80729N(), this.f65231f.size(), false, 4, (Object) null);
                C29615f.m89897A(this, 6, 1, false, 4, (Object) null);
            }
        }
    }

    /* renamed from: q0 */
    public final void mo64116q0(boolean z) {
        this.f65246u = z;
        mo64115p0(this.f65243r.mo64129b());
    }

    /* renamed from: r0 */
    public final void mo64117r0() {
        this.f65236k = !this.f65236k;
        mo69516r(0);
    }

    /* renamed from: s0 */
    public final void mo64118s0(C28296a aVar) {
        C41536l.m120489i(aVar, "accountItem");
        int i = 0;
        for (Object next : this.f65231f) {
            int i2 = i + 1;
            if (i < 0) {
                C41341q.m119917t();
            }
            if (C41536l.m120484d(((C28296a) next).mo67926a(), aVar.mo67926a())) {
                this.f65231f.set(i, aVar);
            }
            i = i2;
        }
        mo69516r(m80729N());
    }

    /* renamed from: t0 */
    public final void mo64119t0(boolean z) {
        this.f65244s = z;
    }

    /* renamed from: u0 */
    public final void mo64120u0(C28297b bVar) {
        C41536l.m120489i(bVar, "namesItem");
        this.f65232g = bVar;
        mo69516r(0);
    }

    /* renamed from: v0 */
    public final void mo64121v0(List list) {
        C41536l.m120489i(list, "payments");
        ArrayList<C20432f.C20434b> arrayList = new ArrayList<>();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19333a.m64783b(arrayList, (C20432f.C20434b.C20436b) it.next(), false, 2, (Object) null);
        }
        this.f65239n = arrayList;
        ArrayList arrayList2 = new ArrayList(C41343r.m119925u(arrayList, 10));
        for (C20432f.C20434b add : arrayList) {
            arrayList2.add(add);
        }
        this.f65240o = arrayList2;
        this.f65245t = false;
        if (this.f65243r == C25558k.HISTORY) {
            mo69520v(m80729N(), 6, 7, 8, 4, 9);
            C29615f.m89897A(this, 2, 1, false, 4, (Object) null);
            C29615f.m89897A(this, 3, 1, false, 4, (Object) null);
            if (this.f65240o.isEmpty() && !this.f65244s) {
                C29615f.m89897A(this, 9, 1, false, 4, (Object) null);
            } else if (!this.f65240o.isEmpty() || !this.f65244s) {
                C29615f.m89897A(this, 4, this.f65240o.size(), false, 4, (Object) null);
            } else {
                C29615f.m89897A(this, 7, 1, false, 4, (Object) null);
            }
        }
    }

    /* renamed from: w0 */
    public final void mo64122w0(C28298c cVar) {
        C41536l.m120489i(cVar, "profilePictureItem");
        this.f65233h = cVar;
        mo69516r(0);
    }
}
