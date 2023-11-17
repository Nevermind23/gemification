package d20;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.RecyclerView;
import b50.C19333a;
import com.github.mikephil.charting.utils.Utils;
import f50.C20432f;
import g20.C20593b;
import g20.C20595b0;
import g20.C20597c;
import g20.C20601e;
import g20.C20602e0;
import g20.C20606f0;
import g20.C20614j;
import g20.C20619k;
import g20.C20622l0;
import g20.C20626o;
import g20.C20630r;
import g20.C20635t;
import h20.C24851a;
import h20.C24852b;
import he1.C41238w;
import i20.C25103c;
import i20.C25105e;
import ih0.C25209b;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import k20.C25575b;
import k30.C25627a;
import kotlin.jvm.internal.C41535k;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import l50.C25832l;
import l50.C25840t;
import p341ge.bog.mobilebank.cleanarch.gamification.views.GamificationBanner;
import p341ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel;
import p341ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.C21770a;
import p341ge.bog.mobilebank.model.usrinfo.UserRestrictions;
import p341ge.bog.mobilebank.p975ui.activities.MainActivity;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p380ck.C10457a;
import p380ck.C10463g;
import p380ck.C10464h;
import p90.C27290e6;
import p90.C27368m6;
import p90.C27384o4;
import p90.C27393p4;
import p90.C27402q4;
import p90.C27411r4;
import q31.C38125h;
import ue1.C43064a;
import ue1.C43075l;
import x00.C29609d;
import x00.C29615f;

/* renamed from: d20.i */
public final class C19854i extends C29615f {

    /* renamed from: I */
    public static final C19855a f54282I = new C19855a((DefaultConstructorMarker) null);

    /* renamed from: J */
    public static final int f54283J = C19856b.TYPE_LAST_OPERATIONS_ITEM.ordinal();

    /* renamed from: A */
    private C43064a f54284A;

    /* renamed from: B */
    private C43064a f54285B;

    /* renamed from: C */
    private C19858c f54286C;

    /* renamed from: D */
    private final C19848f f54287D = new C19848f();
    /* access modifiers changed from: private */

    /* renamed from: E */
    public final C19824b f54288E;

    /* renamed from: F */
    private boolean f54289F;

    /* renamed from: G */
    private RecyclerView f54290G;

    /* renamed from: H */
    private C25209b f54291H;

    /* renamed from: f */
    private final MainActivity f54292f;

    /* renamed from: g */
    private final C43075l f54293g;

    /* renamed from: h */
    private final C43075l f54294h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C43064a f54295i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C43064a f54296j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final C43075l f54297k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C43075l f54298l;

    /* renamed from: m */
    private final C43064a f54299m;

    /* renamed from: n */
    private final C24851a f54300n;

    /* renamed from: o */
    private final C24852b f54301o;

    /* renamed from: p */
    private final GamificationBanner.C21046a f54302p;

    /* renamed from: q */
    private final GamificationBanner.C21046a f54303q;

    /* renamed from: r */
    private C25840t f54304r;

    /* renamed from: s */
    private List f54305s;

    /* renamed from: t */
    private List f54306t;

    /* renamed from: u */
    private C25103c f54307u;

    /* renamed from: v */
    private List f54308v;

    /* renamed from: w */
    private C21770a.C21771a f54309w;

    /* renamed from: x */
    private JuniorRequestDataUiModel f54310x;

    /* renamed from: y */
    private List f54311y = C41341q.m119907j();

    /* renamed from: z */
    private List f54312z = C41341q.m119907j();

    /* renamed from: d20.i$a */
    public static final class C19855a {
        private C19855a() {
        }

        public /* synthetic */ C19855a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: d20.i$b */
    private enum C19856b {
        TYPE_STORY_CONTENT,
        TYPE_REMAINING_AMOUNT,
        TYPE_CARD_PAGER,
        TYPE_BONUS_PROGRAMS,
        TYPE_GAMIFICATION,
        TYPE_DEPOSITS_LIABILITIES,
        TYPE_NBO_CONTENT,
        TYPE_UPCOMING_PAYMENTS_HEADER,
        TYPE_UPCOMING_PAYMENTS_ITEM,
        TYPE_UPCOMING_PAYMENTS_MORE,
        TYPE_UPCOMING_PAYMENTS_FOOTER,
        TYPE_BANNER_PAGER,
        TYPE_GOOGLE_PAY_BANNER,
        TYPE_BUDGET,
        TYPE_LAST_OPERATIONS_HEADER,
        TYPE_LAST_OPERATIONS_ITEM,
        TYPE_LAST_OPERATIONS_LOADING,
        TYPE_LAST_OPERATIONS_ERROR,
        TYPE_LAST_OPERATIONS_FOOTER,
        TYPE_ALL_OPERATIONS_BUTTON,
        TYPE_JUNIOR;
        

        /* renamed from: d */
        public static final C19857a f54313d = null;

        /* renamed from: d20.i$b$a */
        public static final class C19857a {
            private C19857a() {
            }

            public /* synthetic */ C19857a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C19856b mo48175a(int i) {
                boolean z;
                for (C19856b bVar : C19856b.values()) {
                    if (bVar.ordinal() == i) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return bVar;
                    }
                }
                return null;
            }
        }

        static {
            f54313d = new C19857a((DefaultConstructorMarker) null);
        }
    }

    /* renamed from: d20.i$c */
    public interface C19858c {
    }

    /* renamed from: d20.i$d */
    public /* synthetic */ class C19859d {

        /* renamed from: a */
        public static final /* synthetic */ int[] f54336a;

        /* JADX WARNING: Can't wrap try/catch for region: R(45:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|25|26|27|28|29|30|31|32|33|34|35|36|37|38|39|40|41|42|43|45) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0046 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x005a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x008c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0096 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x00a0 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x00aa */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x00b4 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00be */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00c8 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                d20.i$b[] r0 = d20.C19854i.C19856b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_REMAINING_AMOUNT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_CARD_PAGER     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_HEADER     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_LAST_OPERATIONS_HEADER     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_ITEM     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_MORE     // Catch:{ NoSuchFieldError -> 0x003d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_FOOTER     // Catch:{ NoSuchFieldError -> 0x0046 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0046 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0046 }
            L_0x0046:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_LAST_OPERATIONS_FOOTER     // Catch:{ NoSuchFieldError -> 0x0050 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0050 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0050 }
            L_0x0050:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_LAST_OPERATIONS_ITEM     // Catch:{ NoSuchFieldError -> 0x005a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005a }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x005a }
            L_0x005a:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_ALL_OPERATIONS_BUTTON     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_LAST_OPERATIONS_LOADING     // Catch:{ NoSuchFieldError -> 0x006e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_LAST_OPERATIONS_ERROR     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_BANNER_PAGER     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_BONUS_PROGRAMS     // Catch:{ NoSuchFieldError -> 0x008c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008c }
                r2 = 14
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008c }
            L_0x008c:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_GAMIFICATION     // Catch:{ NoSuchFieldError -> 0x0096 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0096 }
                r2 = 15
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0096 }
            L_0x0096:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_DEPOSITS_LIABILITIES     // Catch:{ NoSuchFieldError -> 0x00a0 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a0 }
                r2 = 16
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00a0 }
            L_0x00a0:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_BUDGET     // Catch:{ NoSuchFieldError -> 0x00aa }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00aa }
                r2 = 17
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00aa }
            L_0x00aa:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_JUNIOR     // Catch:{ NoSuchFieldError -> 0x00b4 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b4 }
                r2 = 18
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00b4 }
            L_0x00b4:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_GOOGLE_PAY_BANNER     // Catch:{ NoSuchFieldError -> 0x00be }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00be }
                r2 = 19
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00be }
            L_0x00be:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_NBO_CONTENT     // Catch:{ NoSuchFieldError -> 0x00c8 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c8 }
                r2 = 20
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c8 }
            L_0x00c8:
                d20.i$b r1 = d20.C19854i.C19856b.TYPE_STORY_CONTENT     // Catch:{ NoSuchFieldError -> 0x00d2 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00d2 }
                r2 = 21
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00d2 }
            L_0x00d2:
                f54336a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: d20.C19854i.C19859d.<clinit>():void");
        }
    }

    /* renamed from: d20.i$e */
    public final class C19860e extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final BogTextView f54337d;

        /* renamed from: e */
        private final BogTextView f54338e;

        /* renamed from: f */
        private final ImageView f54339f;

        /* renamed from: g */
        private final LinearLayout f54340g;

        /* renamed from: h */
        final /* synthetic */ C19854i f54341h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19860e(C19854i iVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f54341h = iVar;
            this.f54337d = (BogTextView) view.findViewById(C10322k.home_last_operations_title);
            this.f54338e = (BogTextView) view.findViewById(C10322k.home_last_operations_button_text);
            this.f54339f = (ImageView) view.findViewById(C10322k.home_last_operations_button_iv);
            this.f54340g = (LinearLayout) view.findViewById(C10322k.home_last_operations_button);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m65691j(C43064a aVar, View view) {
            C41536l.m120489i(aVar, "$onClick");
            aVar.invoke();
        }

        /* renamed from: i */
        public final void mo48176i(C43064a aVar, int i, int i2, int i3) {
            if (aVar != null) {
                this.f54340g.setOnClickListener(new C19872j(aVar));
            }
            this.f54337d.setText(this.itemView.getContext().getText(i));
            this.f54338e.setText(this.itemView.getContext().getText(i2));
            this.f54339f.setImageDrawable(C0767a.m2895e(this.itemView.getContext(), i3));
        }
    }

    /* renamed from: d20.i$f */
    public final class C19861f extends RecyclerView.C1734f0 {

        /* renamed from: d */
        final /* synthetic */ C19854i f54342d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19861f(C19854i iVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f54342d = iVar;
        }
    }

    /* renamed from: d20.i$g */
    public final class C19862g extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final BogTextView f54343d;

        /* renamed from: e */
        private final TextView f54344e;

        /* renamed from: f */
        final /* synthetic */ C19854i f54345f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19862g(C19854i iVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f54345f = iVar;
            this.f54343d = (BogTextView) view.findViewById(C10322k.home_widget_header_text);
            this.f54344e = (TextView) view.findViewById(C10322k.home_widget_header_counter);
        }

        /* renamed from: i */
        public static /* synthetic */ void m65693i(C19862g gVar, int i, int i2, int i3, Object obj) {
            if ((i3 & 2) != 0) {
                i2 = -1;
            }
            gVar.mo48177h(i, i2);
        }

        /* renamed from: h */
        public final void mo48177h(int i, int i2) {
            int i3;
            String str;
            this.f54343d.setText(this.itemView.getContext().getString(i));
            TextView textView = this.f54344e;
            if (i2 != -1) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            textView.setVisibility(i3);
            TextView textView2 = this.f54344e;
            if (i2 > 9) {
                str = "9+";
            } else {
                str = String.valueOf(i2);
            }
            textView2.setText(str);
        }
    }

    /* renamed from: d20.i$h */
    public final class C19863h extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final BogTextView f54346d;

        /* renamed from: e */
        private final ImageView f54347e;

        /* renamed from: f */
        final /* synthetic */ C19854i f54348f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C19863h(C19854i iVar, View view) {
            super(view);
            C41536l.m120489i(view, "itemView");
            this.f54348f = iVar;
            this.f54346d = (BogTextView) view.findViewById(C10322k.home_widget_more_text);
            this.f54347e = (ImageView) view.findViewById(C10322k.home_widget_more_expand_arrow);
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m65696j(C43064a aVar, C19863h hVar, View view) {
            C41536l.m120489i(hVar, "this$0");
            if (aVar != null) {
                hVar.m65697k((Boolean) aVar.invoke());
            }
        }

        /* renamed from: k */
        private final void m65697k(Boolean bool) {
            if (bool == null) {
                return;
            }
            if (bool.booleanValue()) {
                this.f54346d.setText(this.itemView.getContext().getString(C10328q.button_text_close));
                this.f54347e.setRotation(180.0f);
                return;
            }
            this.f54346d.setText(this.itemView.getContext().getString(C10328q.button_text_more));
            this.f54347e.setRotation(Utils.FLOAT_EPSILON);
        }

        /* renamed from: i */
        public final void mo48178i(C43064a aVar) {
            m65697k(Boolean.FALSE);
            this.itemView.setOnClickListener(new C19873k(aVar, this));
        }
    }

    /* renamed from: d20.i$i */
    static final class C19864i extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19854i f54349d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19864i(C19854i iVar) {
            super(0);
            this.f54349d = iVar;
        }

        public final void invoke() {
            this.f54349d.mo69517s(C19856b.TYPE_BANNER_PAGER.ordinal());
        }
    }

    /* renamed from: d20.i$j */
    /* synthetic */ class C19865j extends C41535k implements C43064a {
        C19865j(Object obj) {
            super(0, obj, MainActivity.class, "showPaymentsTab", "showPaymentsTab()V", 0);
        }

        /* renamed from: b */
        public final void mo48179b() {
            ((MainActivity) this.receiver).mo86139N7();
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            mo48179b();
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.i$k */
    /* synthetic */ class C19866k extends C41535k implements C43064a {
        C19866k(Object obj) {
            super(0, obj, C19854i.class, "toggleUpcomingPayments", "toggleUpcomingPayments()Ljava/lang/Boolean;", 0);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return ((C19854i) this.receiver).m65663j0();
        }
    }

    /* renamed from: d20.i$l */
    static final class C19867l extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19854i f54350d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19867l(C19854i iVar) {
            super(1);
            this.f54350d = iVar;
        }

        /* renamed from: a */
        public final void mo48181a(boolean z) {
            this.f54350d.f54297k.invoke(Boolean.valueOf(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48181a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.i$m */
    static final class C19868m extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19854i f54351d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19868m(C19854i iVar) {
            super(1);
            this.f54351d = iVar;
        }

        /* renamed from: a */
        public final void mo48182a(boolean z) {
            this.f54351d.f54298l.invoke(Boolean.valueOf(z));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48182a(((Boolean) obj).booleanValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.i$n */
    static final class C19869n extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C19854i f54352d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19869n(C19854i iVar) {
            super(1);
            this.f54352d = iVar;
        }

        /* renamed from: a */
        public final void mo48183a(int i) {
            this.f54352d.f54288E.mo48127N(i);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo48183a(((Number) obj).intValue());
            return C41238w.f97225a;
        }
    }

    /* renamed from: d20.i$o */
    static final class C19870o extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19854i f54353d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19870o(C19854i iVar) {
            super(0);
            this.f54353d = iVar;
        }

        public final void invoke() {
            this.f54353d.f54295i.invoke();
            C19854i iVar = this.f54353d;
            String str = C10457a.f29780a;
            C41536l.m120488h(str, "CLICK_HOME_BANNER");
            iVar.m65661L(str);
        }
    }

    /* renamed from: d20.i$p */
    static final class C19871p extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19854i f54354d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19871p(C19854i iVar) {
            super(0);
            this.f54354d = iVar;
        }

        public final void invoke() {
            this.f54354d.f54296j.invoke();
            C29615f.m89897A(this.f54354d, C19856b.TYPE_GOOGLE_PAY_BANNER.ordinal(), 0, false, 4, (Object) null);
        }
    }

    public C19854i(MainActivity mainActivity, C43075l lVar, C43075l lVar2, C43075l lVar3, C43075l lVar4, C43064a aVar, C43064a aVar2, C43075l lVar5, C43075l lVar6, C43064a aVar3, C24851a aVar4, C24852b bVar, GamificationBanner.C21046a aVar5, GamificationBanner.C21046a aVar6, PreferencesApiManager preferencesApiManager) {
        MainActivity mainActivity2 = mainActivity;
        C43075l lVar7 = lVar3;
        C43075l lVar8 = lVar4;
        C43064a aVar7 = aVar;
        C43064a aVar8 = aVar2;
        C43075l lVar9 = lVar5;
        C43075l lVar10 = lVar6;
        C43064a aVar9 = aVar3;
        C24851a aVar10 = aVar4;
        C24852b bVar2 = bVar;
        GamificationBanner.C21046a aVar11 = aVar5;
        GamificationBanner.C21046a aVar12 = aVar6;
        C41536l.m120489i(mainActivity2, "activity");
        C41536l.m120489i(lVar, "onNboBannerClick");
        C41536l.m120489i(lVar2, "onNboBannerRemove");
        C41536l.m120489i(lVar7, "onOpenCreditCardDetails");
        C41536l.m120489i(lVar8, "onOpenJunior");
        C41536l.m120489i(aVar7, "onGooglePayBannerClick");
        C41536l.m120489i(aVar8, "onGooglePayBannerDismiss");
        C41536l.m120489i(lVar9, "onBalanceAppearanceChanged");
        C41536l.m120489i(lVar10, "onBalanceHidden");
        C41536l.m120489i(aVar9, "onLoanOverdueWarningClick");
        C41536l.m120489i(aVar10, "nboCardListener");
        C41536l.m120489i(bVar2, "storyThumbnailListener");
        C41536l.m120489i(aVar11, "onGamificationBannerClicked");
        C41536l.m120489i(aVar12, "onGamificationBannerClosed");
        C41536l.m120489i(preferencesApiManager, "mPreferencesApiManager");
        this.f54292f = mainActivity2;
        this.f54293g = lVar7;
        this.f54294h = lVar8;
        this.f54295i = aVar7;
        this.f54296j = aVar8;
        this.f54297k = lVar9;
        this.f54298l = lVar10;
        this.f54299m = aVar9;
        this.f54300n = aVar10;
        this.f54301o = bVar2;
        this.f54302p = aVar11;
        this.f54303q = aVar12;
        C19824b bVar3 = new C19824b(preferencesApiManager, mainActivity, new C19864i(this), lVar, lVar2);
        this.f54288E = bVar3;
        this.f54291H = C25209b.NONE;
        bVar3.mo48129U(new C19853h(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public final void m65661L(String str) {
        C36546y.m108282F().mo27137H("Google_Pay", str, (String) null, (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
    }

    /* renamed from: N */
    private final void m65662N() {
        RecyclerView recyclerView = this.f54290G;
        if (recyclerView != null) {
            recyclerView.mo5425x1(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j0 */
    public final Boolean m65663j0() {
        String str;
        boolean z = !this.f54289F;
        this.f54289F = z;
        List list = this.f54305s;
        if (list == null) {
            return null;
        }
        if (z) {
            mo69513f(C19856b.TYPE_UPCOMING_PAYMENTS_ITEM.ordinal(), list.size() - 2);
        } else {
            mo69522x(C19856b.TYPE_UPCOMING_PAYMENTS_ITEM.ordinal(), list.size() - 2);
        }
        C10463g F = C36546y.m108282F();
        if (this.f54289F) {
            str = "expand";
        } else {
            str = "collapse";
        }
        F.mo27152s("home", str, "click_future_operation_mode");
        return Boolean.valueOf(this.f54289F);
    }

    /* renamed from: M */
    public final void mo48153M() {
        mo69517s(C19856b.TYPE_BANNER_PAGER.ordinal());
    }

    /* renamed from: O */
    public final void mo48154O(C25840t tVar) {
        boolean z;
        boolean z2;
        int i;
        boolean z3;
        C41536l.m120489i(tVar, "data");
        this.f54304r = tVar;
        List a = tVar.mo64608c().mo64555a();
        int i2 = 1;
        if (!(a instanceof Collection) || !a.isEmpty()) {
            Iterator it = a.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (!((C25832l) it.next()).mo64545u()) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = false;
        List a2 = tVar.mo64608c().mo64555a();
        if (!(a2 instanceof Collection) || !a2.isEmpty()) {
            Iterator it2 = a2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                List a3 = ((C25832l) it2.next()).mo64522a();
                if (a3 == null || a3.isEmpty()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    z2 = true;
                    break;
                }
            }
            boolean z4 = !z2;
            if (!z || z4) {
                i = 1;
            } else {
                i = 0;
            }
            mo69523z(C19856b.TYPE_CARD_PAGER.ordinal(), i, false);
            int ordinal = C19856b.TYPE_REMAINING_AMOUNT.ordinal();
            if (!(!tVar.mo64608c().mo64555a().isEmpty()) && i != 0) {
                i2 = 0;
            }
            mo69523z(ordinal, i2, false);
            m65662N();
        }
        z2 = false;
        boolean z42 = !z2;
        if (!z) {
        }
        i = 1;
        mo69523z(C19856b.TYPE_CARD_PAGER.ordinal(), i, false);
        int ordinal2 = C19856b.TYPE_REMAINING_AMOUNT.ordinal();
        i2 = 0;
        mo69523z(ordinal2, i2, false);
        m65662N();
    }

    /* renamed from: P */
    public final void mo48155P(C43064a aVar) {
        C41536l.m120489i(aVar, "onReload");
        this.f54304r = null;
        mo69517s(C19856b.TYPE_REMAINING_AMOUNT.ordinal());
        mo69523z(C19856b.TYPE_CARD_PAGER.ordinal(), 1, false);
        this.f54284A = aVar;
        m65662N();
    }

    /* renamed from: Q */
    public final void mo48156Q(C25103c cVar) {
        C41536l.m120489i(cVar, "data");
        this.f54307u = cVar;
        C29615f.m89897A(this, C19856b.TYPE_BONUS_PROGRAMS.ordinal(), 1, false, 4, (Object) null);
        C25575b bVar = new C25575b();
        C25103c cVar2 = this.f54307u;
        if (cVar2 == null) {
            C41536l.m120506z("assetLiability");
            cVar2 = null;
        }
        if (bVar.mo64150gw(cVar2)) {
            C29615f.m89897A(this, C19856b.TYPE_DEPOSITS_LIABILITIES.ordinal(), 0, false, 4, (Object) null);
        } else {
            C29615f.m89897A(this, C19856b.TYPE_DEPOSITS_LIABILITIES.ordinal(), 1, false, 4, (Object) null);
        }
        m65662N();
    }

    /* renamed from: R */
    public final void mo48157R(C21770a.C21771a aVar) {
        C41536l.m120489i(aVar, "data");
        this.f54309w = aVar;
        int ordinal = C19856b.TYPE_BUDGET.ordinal();
        C21770a.C21771a aVar2 = this.f54309w;
        if (aVar2 == null) {
            C41536l.m120506z("budgetData");
            aVar2 = null;
        }
        C29615f.m89897A(this, ordinal, aVar2.mo54297a() ? 1 : 0, false, 4, (Object) null);
        m65662N();
    }

    /* renamed from: S */
    public final void mo48158S(C25209b bVar) {
        int i;
        C41536l.m120489i(bVar, "type");
        this.f54291H = bVar;
        int ordinal = C19856b.TYPE_GAMIFICATION.ordinal();
        if (bVar != C25209b.NONE) {
            i = 1;
        } else {
            i = 0;
        }
        C29615f.m89897A(this, ordinal, i, false, 4, (Object) null);
        m65662N();
    }

    /* renamed from: T */
    public final void mo48159T(List list) {
        C41536l.m120489i(list, "items");
        this.f54310x = (JuniorRequestDataUiModel) C41358y.m120009Y(list);
        C29615f.m89897A(this, C19856b.TYPE_JUNIOR.ordinal(), list.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
        m65662N();
    }

    /* renamed from: U */
    public final void mo48160U(C43064a aVar) {
        C41536l.m120489i(aVar, "onReload");
        this.f54306t = null;
        mo69517s(C19856b.TYPE_LAST_OPERATIONS_LOADING.ordinal());
        C29615f.m89897A(this, C19856b.TYPE_LAST_OPERATIONS_FOOTER.ordinal(), 1, false, 4, (Object) null);
        mo69517s(C19856b.TYPE_LAST_OPERATIONS_ITEM.ordinal());
        C29615f.m89897A(this, C19856b.TYPE_LAST_OPERATIONS_ERROR.ordinal(), 1, false, 4, (Object) null);
        this.f54285B = aVar;
        m65662N();
    }

    /* renamed from: V */
    public final void mo48161V(List list) {
        C41536l.m120489i(list, "data");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C19333a.m64783b(arrayList, (C20432f.C20434b.C20436b) it.next(), false, 2, (Object) null);
        }
        this.f54306t = arrayList;
        C29615f.m89897A(this, C19856b.TYPE_LAST_OPERATIONS_ITEM.ordinal(), arrayList.size(), false, 4, (Object) null);
        mo69517s(C19856b.TYPE_LAST_OPERATIONS_LOADING.ordinal());
        C29615f.m89897A(this, C19856b.TYPE_LAST_OPERATIONS_ERROR.ordinal(), list.isEmpty() ? 1 : 0, false, 4, (Object) null);
        C29615f.m89897A(this, C19856b.TYPE_ALL_OPERATIONS_BUTTON.ordinal(), list.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
        C29615f.m89897A(this, C19856b.TYPE_LAST_OPERATIONS_FOOTER.ordinal(), list.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
    }

    /* renamed from: W */
    public final void mo48162W(boolean z) {
        if (z) {
            this.f54306t = null;
            mo69517s(C19856b.TYPE_LAST_OPERATIONS_ITEM.ordinal());
            mo69517s(C19856b.TYPE_LAST_OPERATIONS_ERROR.ordinal());
            mo69517s(C19856b.TYPE_ALL_OPERATIONS_BUTTON.ordinal());
            mo69517s(C19856b.TYPE_LAST_OPERATIONS_FOOTER.ordinal());
            C29615f.m89897A(this, C19856b.TYPE_LAST_OPERATIONS_LOADING.ordinal(), 1, false, 4, (Object) null);
        }
    }

    /* renamed from: X */
    public final void mo48163X(C25105e eVar) {
        C41536l.m120489i(eVar, "data");
        if (this.f54288E.mo48128T(eVar)) {
            C29615f.m89897A(this, C19856b.TYPE_BANNER_PAGER.ordinal(), 1, false, 4, (Object) null);
            m65662N();
        }
    }

    /* renamed from: Y */
    public final void mo48164Y(List list) {
        C41536l.m120489i(list, "list");
        this.f54311y = list;
        C29615f.m89897A(this, C19856b.TYPE_NBO_CONTENT.ordinal(), list.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
        m65662N();
    }

    /* renamed from: Z */
    public final void mo48165Z(C19858c cVar) {
        C41536l.m120489i(cVar, "listener");
        this.f54286C = cVar;
    }

    /* renamed from: a0 */
    public final void mo48166a0(C25627a aVar) {
        C41536l.m120489i(aVar, "data");
        if (!C36546y.m108285N().mo89313K().getUserRestrictions().contains(UserRestrictions.OFFERS_GET_OFFER_LIMIT_INFO) && this.f54288E.mo48130W(aVar)) {
            C29615f.m89897A(this, C19856b.TYPE_BANNER_PAGER.ordinal(), 1, false, 4, (Object) null);
            m65662N();
        }
    }

    /* renamed from: b0 */
    public final void mo48167b0(List list) {
        C41536l.m120489i(list, "data");
        if (this.f54288E.mo48131X(list)) {
            C29615f.m89897A(this, C19856b.TYPE_BANNER_PAGER.ordinal(), 1, false, 4, (Object) null);
            m65662N();
        }
    }

    /* renamed from: c0 */
    public final void mo48168c0(List list) {
        C41536l.m120489i(list, "data");
        if (this.f54288E.mo48132Y(list)) {
            C29615f.m89897A(this, C19856b.TYPE_BANNER_PAGER.ordinal(), 1, false, 4, (Object) null);
            m65662N();
        }
    }

    /* renamed from: d0 */
    public final void mo48169d0(List list) {
        C41536l.m120489i(list, "data");
        this.f54308v = list;
        C29615f.m89897A(this, C19856b.TYPE_BONUS_PROGRAMS.ordinal(), 1, false, 4, (Object) null);
        m65662N();
    }

    /* renamed from: e0 */
    public final void mo48170e0(List list) {
        C41536l.m120489i(list, "list");
        this.f54312z = list;
        C29615f.m89897A(this, C19856b.TYPE_STORY_CONTENT.ordinal(), list.isEmpty() ^ true ? 1 : 0, false, 4, (Object) null);
        m65662N();
    }

    /* renamed from: f0 */
    public final void mo48171f0(boolean z) {
        if (this.f54288E.mo48133b0(z)) {
            C29615f.m89897A(this, C19856b.TYPE_BANNER_PAGER.ordinal(), 1, false, 4, (Object) null);
            m65662N();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0031, code lost:
        if (r5.mo63625j() <= r6.longValue()) goto L_0x0035;
     */
    /* renamed from: g0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo48172g0(u00.C28534b r12) {
        /*
            r11 = this;
            java.lang.String r0 = "data"
            kotlin.jvm.internal.C41536l.m120489i(r12, r0)
            r0 = 0
            java.util.List r1 = r12.mo68254a(r0)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0013:
            boolean r3 = r1.hasNext()
            r4 = 1
            if (r3 == 0) goto L_0x003b
            java.lang.Object r3 = r1.next()
            r5 = r3
            i20.h r5 = (i20.C25111h) r5
            java.lang.Long r6 = r5.mo63617d()
            if (r6 == 0) goto L_0x0034
            long r6 = r6.longValue()
            long r8 = r5.mo63625j()
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 > 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r4 = r0
        L_0x0035:
            if (r4 == 0) goto L_0x0013
            r2.add(r3)
            goto L_0x0013
        L_0x003b:
            java.util.List r12 = r12.mo68255b()
            java.util.List r12 = ie1.C41358y.m120023m0(r2, r12)
            r11.f54305s = r12
            if (r12 == 0) goto L_0x0080
            d20.i$b r1 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_ITEM
            int r6 = r1.ordinal()
            boolean r1 = r11.f54289F
            r2 = 2
            if (r1 == 0) goto L_0x0057
            int r1 = r12.size()
            goto L_0x005f
        L_0x0057:
            int r1 = r12.size()
            int r1 = java.lang.Math.min(r2, r1)
        L_0x005f:
            r7 = r1
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r11
            x00.C29615f.m89897A(r5, r6, r7, r8, r9, r10)
            d20.i$b r1 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_MORE
            int r6 = r1.ordinal()
            int r12 = r12.size()
            if (r12 <= r2) goto L_0x0075
            r7 = r4
            goto L_0x0076
        L_0x0075:
            r7 = r0
        L_0x0076:
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r11
            x00.C29615f.m89897A(r5, r6, r7, r8, r9, r10)
            he1.w r12 = he1.C41238w.f97225a
            goto L_0x0081
        L_0x0080:
            r12 = 0
        L_0x0081:
            if (r12 != 0) goto L_0x0095
            d20.i$b r12 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_MORE
            int r12 = r12.ordinal()
            r11.mo69517s(r12)
            d20.i$b r12 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_ITEM
            int r12 = r12.ordinal()
            r11.mo69517s(r12)
        L_0x0095:
            d20.i$b r12 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_HEADER
            int r6 = r12.ordinal()
            java.util.List r12 = r11.f54305s
            if (r12 == 0) goto L_0x00a8
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00a6
            goto L_0x00a8
        L_0x00a6:
            r12 = r0
            goto L_0x00a9
        L_0x00a8:
            r12 = r4
        L_0x00a9:
            r7 = r12 ^ 1
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r11
            x00.C29615f.m89897A(r5, r6, r7, r8, r9, r10)
            d20.i$b r12 = d20.C19854i.C19856b.TYPE_UPCOMING_PAYMENTS_FOOTER
            int r6 = r12.ordinal()
            java.util.List r12 = r11.f54305s
            if (r12 == 0) goto L_0x00c2
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x00c3
        L_0x00c2:
            r0 = r4
        L_0x00c3:
            r7 = r0 ^ 1
            r8 = 0
            r9 = 4
            r10 = 0
            r5 = r11
            x00.C29615f.m89897A(r5, r6, r7, r8, r9, r10)
            r11.m65662N()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.C19854i.mo48172g0(u00.b):void");
    }

    /* renamed from: h0 */
    public final void mo48173h0() {
        mo69517s(C19856b.TYPE_UPCOMING_PAYMENTS_ITEM.ordinal());
        mo69517s(C19856b.TYPE_UPCOMING_PAYMENTS_HEADER.ordinal());
        mo69517s(C19856b.TYPE_UPCOMING_PAYMENTS_FOOTER.ordinal());
        mo69517s(C19856b.TYPE_UPCOMING_PAYMENTS_MORE.ordinal());
    }

    /* renamed from: i0 */
    public final void mo48174i0(boolean z) {
        C29615f.m89897A(this, C19856b.TYPE_GOOGLE_PAY_BANNER.ordinal(), z ? 1 : 0, false, 4, (Object) null);
        m65662N();
    }

    /* renamed from: l */
    public List mo48134l() {
        return C41341q.m119910m(new C29615f.C29617b(C19856b.TYPE_STORY_CONTENT.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_REMAINING_AMOUNT.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_CARD_PAGER.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_BONUS_PROGRAMS.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_GAMIFICATION.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_DEPOSITS_LIABILITIES.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_NBO_CONTENT.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_UPCOMING_PAYMENTS_HEADER.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_UPCOMING_PAYMENTS_ITEM.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_UPCOMING_PAYMENTS_MORE.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_UPCOMING_PAYMENTS_FOOTER.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_GOOGLE_PAY_BANNER.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_BUDGET.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_JUNIOR.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_BANNER_PAGER.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_LAST_OPERATIONS_HEADER.ordinal(), 1), new C29615f.C29617b(C19856b.TYPE_LAST_OPERATIONS_ITEM.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_LAST_OPERATIONS_LOADING.ordinal(), 1), new C29615f.C29617b(C19856b.TYPE_LAST_OPERATIONS_ERROR.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_ALL_OPERATIONS_BUTTON.ordinal(), 0), new C29615f.C29617b(C19856b.TYPE_LAST_OPERATIONS_FOOTER.ordinal(), 0));
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C41536l.m120489i(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.f54290G = recyclerView;
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C19856b a = C19856b.f54313d.mo48175a(i);
        switch (a == null ? -1 : C19859d.f54336a[a.ordinal()]) {
            case 1:
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_remaining_amount_layout, viewGroup, false);
                C41536l.m120488h(inflate, "from(parent.context)\n   …nt_layout, parent, false)");
                C20602e0 e0Var = new C20602e0(inflate);
                e0Var.mo49147v(new C19867l(this));
                e0Var.mo49148x(new C19868m(this));
                return e0Var;
            case 2:
                return C20630r.C20632b.m66943b(C20630r.f55716i, viewGroup, this.f54287D, (C43075l) null, 4, (Object) null);
            case 3:
            case 4:
                View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_widget_header_item, viewGroup, false);
                C41536l.m120488h(inflate2, "from(parent.context)\n   …ader_item, parent, false)");
                return new C19862g(this, inflate2);
            case 5:
                C27411r4 d = C27411r4.m84951d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d, "inflate(\n               …  false\n                )");
                return new C20622l0(d);
            case 6:
                View inflate3 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_widget_more_item, viewGroup, false);
                C41536l.m120488h(inflate3, "from(parent.context)\n   …more_item, parent, false)");
                return new C19863h(this, inflate3);
            case 7:
            case 8:
                View inflate4 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_widget_footer_item, viewGroup, false);
                C41536l.m120488h(inflate4, "from(parent.context)\n   …oter_item, parent, false)");
                return new C19861f(this, inflate4);
            case 9:
                return C20432f.f55387t.mo48921a(viewGroup, this.f54292f, "home", false);
            case 10:
                return C20593b.f55645f.mo49139a(viewGroup);
            case 11:
                View inflate5 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.operaion_loading_item, viewGroup, false);
                C41536l.m120488h(inflate5, "from(parent.context)\n   …ding_item, parent, false)");
                return new C29609d.C29612c(inflate5);
            case 12:
                View inflate6 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_error_layout, viewGroup, false);
                C41536l.m120488h(inflate6, "from(parent.context)\n   …or_layout, parent, false)");
                return new C19860e(this, inflate6);
            case 13:
                return C20630r.f55716i.mo49176a(viewGroup, this.f54288E, new C19869n(this));
            case 14:
                View inflate7 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_bonus_programs_layout, viewGroup, false);
                C41536l.m120488h(inflate7, "from(parent.context)\n   …ms_layout, parent, false)");
                Context context = viewGroup.getContext();
                C41536l.m120488h(context, "parent.context");
                return new C20597c(inflate7, context);
            case 15:
                C27384o4 d2 = C27384o4.m84841d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d2, "inflate(\n               …  false\n                )");
                return new C20619k(d2, this.f54302p, this.f54303q);
            case 16:
                View inflate8 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_deposits_and_liabilities_layout, viewGroup, false);
                C41536l.m120488h(inflate8, "from(parent.context)\n   …es_layout, parent, false)");
                Context context2 = viewGroup.getContext();
                C41536l.m120488h(context2, "parent.context");
                return new C20614j(inflate8, context2, this.f54299m);
            case 17:
                View inflate9 = LayoutInflater.from(viewGroup.getContext()).inflate(C10324m.home_budget_layout, viewGroup, false);
                C41536l.m120488h(inflate9, "from(parent.context)\n   …et_layout, parent, false)");
                Context context3 = viewGroup.getContext();
                C41536l.m120488h(context3, "parent.context");
                return new C20601e(inflate9, context3);
            case 18:
                C27402q4 d3 = C27402q4.m84912d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d3, "inflate(\n               …, false\n                )");
                Context context4 = viewGroup.getContext();
                C41536l.m120488h(context4, "parent.context");
                return new C20635t(d3, context4);
            case 19:
                C27393p4 d4 = C27393p4.m84877d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d4, "inflate(\n               …rent, false\n            )");
                return new C20626o(d4, new C19870o(this), new C19871p(this));
            case 20:
                C27290e6 d5 = C27290e6.m84462d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d5, "inflate(\n               …, false\n                )");
                Context context5 = viewGroup.getContext();
                C41536l.m120488h(context5, "parent.context");
                return new C20595b0(d5, C38125h.m112240e(context5).mo72371a(this.f54300n));
            case 21:
                Context context6 = viewGroup.getContext();
                C41536l.m120488h(context6, "parent.context");
                C19877n b = C38125h.m112240e(context6).mo72372b(this.f54301o);
                C27368m6 d6 = C27368m6.m84782d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
                C41536l.m120488h(d6, "inflate(\n               …, false\n                )");
                return new C20606f0(b, d6);
            default:
                throw new IllegalStateException("Illegal View type");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a$a} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: i20.c} */
    /* JADX WARNING: type inference failed for: r3v0 */
    /* JADX WARNING: type inference failed for: r3v2 */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v14 */
    /* JADX WARNING: type inference failed for: r3v15 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo48135p(androidx.recyclerview.widget.RecyclerView.C1734f0 r8, int r9, int r10) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.C41536l.m120489i(r8, r0)
            boolean r0 = r8 instanceof g20.C20602e0
            if (r0 == 0) goto L_0x0014
            l50.t r9 = r7.f54304r
            if (r9 == 0) goto L_0x0261
            g20.e0 r8 = (g20.C20602e0) r8
            r8.mo49146n(r9)
            goto L_0x0261
        L_0x0014:
            boolean r0 = r8 instanceof g20.C20630r
            r1 = 2
            r2 = -1
            r3 = 0
            if (r0 == 0) goto L_0x0054
            d20.i$b$a r8 = d20.C19854i.C19856b.f54313d
            int r9 = r7.getItemViewType(r9)
            d20.i$b r8 = r8.mo48175a(r9)
            if (r8 != 0) goto L_0x0028
            goto L_0x0030
        L_0x0028:
            int[] r9 = d20.C19854i.C19859d.f54336a
            int r8 = r8.ordinal()
            r2 = r9[r8]
        L_0x0030:
            if (r2 != r1) goto L_0x0261
            l50.t r8 = r7.f54304r
            if (r8 == 0) goto L_0x0049
            d20.f r9 = r7.f54287D
            l50.o r10 = r8.mo64608c()
            java.util.List r10 = r10.mo64555a()
            boolean r8 = r8.mo64610e()
            r9.mo48150F(r10, r8)
            he1.w r3 = he1.C41238w.f97225a
        L_0x0049:
            if (r3 != 0) goto L_0x0261
            d20.f r8 = r7.f54287D
            ue1.a r9 = r7.f54284A
            r8.mo48151G(r9)
            goto L_0x0261
        L_0x0054:
            boolean r0 = r8 instanceof d20.C19854i.C19862g
            r4 = 0
            if (r0 == 0) goto L_0x0096
            d20.i$b$a r10 = d20.C19854i.C19856b.f54313d
            int r9 = r7.getItemViewType(r9)
            d20.i$b r9 = r10.mo48175a(r9)
            if (r9 != 0) goto L_0x0067
            r9 = r2
            goto L_0x006f
        L_0x0067:
            int[] r10 = d20.C19854i.C19859d.f54336a
            int r9 = r9.ordinal()
            r9 = r10[r9]
        L_0x006f:
            r10 = 3
            if (r9 == r10) goto L_0x0080
            r10 = 4
            if (r9 == r10) goto L_0x0077
            goto L_0x0261
        L_0x0077:
            d20.i$g r8 = (d20.C19854i.C19862g) r8
            int r9 = p366bk.C10328q.main_activity_last_transactions
            d20.C19854i.C19862g.m65693i(r8, r9, r4, r1, r3)
            goto L_0x0261
        L_0x0080:
            java.util.List r9 = r7.f54305s
            if (r9 == 0) goto L_0x0089
            int r9 = r9.size()
            goto L_0x008a
        L_0x0089:
            r9 = r2
        L_0x008a:
            d20.i$g r8 = (d20.C19854i.C19862g) r8
            int r10 = p366bk.C10328q.main_activity_upcoming_payments
            if (r9 <= r1) goto L_0x0091
            r2 = r9
        L_0x0091:
            r8.mo48177h(r10, r2)
            goto L_0x0261
        L_0x0096:
            boolean r0 = r8 instanceof d20.C19854i.C19860e
            if (r0 == 0) goto L_0x00dd
            d20.i$b$a r10 = d20.C19854i.C19856b.f54313d
            int r9 = r7.getItemViewType(r9)
            d20.i$b r9 = r10.mo48175a(r9)
            if (r9 != 0) goto L_0x00a7
            goto L_0x00af
        L_0x00a7:
            int[] r10 = d20.C19854i.C19859d.f54336a
            int r9 = r9.ordinal()
            r2 = r10[r9]
        L_0x00af:
            r9 = 12
            if (r2 != r9) goto L_0x0261
            java.util.List r9 = r7.f54306t
            if (r9 == 0) goto L_0x00cc
            r9 = r8
            d20.i$e r9 = (d20.C19854i.C19860e) r9
            d20.i$j r10 = new d20.i$j
            ge.bog.mobilebank.ui.activities.MainActivity r0 = r7.f54292f
            r10.<init>(r0)
            int r0 = p366bk.C10328q.homepage_last_operations_absent_title
            int r1 = p366bk.C10328q.pay
            int r2 = p366bk.C10320i.ic_pay
            r9.mo48176i(r10, r0, r1, r2)
            he1.w r3 = he1.C41238w.f97225a
        L_0x00cc:
            if (r3 != 0) goto L_0x0261
            d20.i$e r8 = (d20.C19854i.C19860e) r8
            ue1.a r9 = r7.f54285B
            int r10 = p366bk.C10328q.homepage_last_operations_error_title
            int r0 = p366bk.C10328q.homepage_error_button_text
            int r1 = p366bk.C10320i.ic_reload
            r8.mo48176i(r9, r10, r0, r1)
            goto L_0x0261
        L_0x00dd:
            boolean r0 = r8 instanceof d20.C19854i.C19863h
            if (r0 == 0) goto L_0x0105
            d20.i$b$a r10 = d20.C19854i.C19856b.f54313d
            int r9 = r7.getItemViewType(r9)
            d20.i$b r9 = r10.mo48175a(r9)
            if (r9 != 0) goto L_0x00ee
            goto L_0x00f6
        L_0x00ee:
            int[] r10 = d20.C19854i.C19859d.f54336a
            int r9 = r9.ordinal()
            r2 = r10[r9]
        L_0x00f6:
            r9 = 6
            if (r2 != r9) goto L_0x0261
            d20.i$h r8 = (d20.C19854i.C19863h) r8
            d20.i$k r9 = new d20.i$k
            r9.<init>(r7)
            r8.mo48178i(r9)
            goto L_0x0261
        L_0x0105:
            boolean r9 = r8 instanceof g20.C20622l0
            r0 = 1
            if (r9 == 0) goto L_0x0143
            java.util.List r9 = r7.f54305s
            if (r9 == 0) goto L_0x0261
            java.lang.Object r1 = r9.get(r10)
            i20.g r1 = (i20.C25110g) r1
            boolean r2 = r1 instanceof u00.C28535c
            if (r2 == 0) goto L_0x012c
            r2 = r8
            g20.l0 r2 = (g20.C20622l0) r2
            r3 = r1
            u00.c r3 = (u00.C28535c) r3
            int r5 = r9.size()
            int r6 = r10 + 1
            if (r5 != r6) goto L_0x0128
            r5 = r0
            goto L_0x0129
        L_0x0128:
            r5 = r4
        L_0x0129:
            r2.mo49172k(r3, r5)
        L_0x012c:
            boolean r2 = r1 instanceof i20.C25111h
            if (r2 == 0) goto L_0x0261
            g20.l0 r8 = (g20.C20622l0) r8
            i20.h r1 = (i20.C25111h) r1
            int r9 = r9.size()
            int r10 = r10 + r0
            if (r9 != r10) goto L_0x013c
            r4 = r0
        L_0x013c:
            ue1.l r9 = r7.f54293g
            r8.mo49171j(r1, r4, r9)
            goto L_0x0261
        L_0x0143:
            boolean r9 = r8 instanceof x00.C29609d.C29612c
            if (r9 == 0) goto L_0x0158
            android.view.View r8 = r8.itemView
            android.content.Context r9 = r8.getContext()
            int r10 = p366bk.C10313b.infinite_alpha
            android.view.animation.Animation r9 = android.view.animation.AnimationUtils.loadAnimation(r9, r10)
            r8.startAnimation(r9)
            goto L_0x0261
        L_0x0158:
            boolean r9 = r8 instanceof f50.C20432f
            if (r9 == 0) goto L_0x0190
            java.util.List r9 = r7.f54306t
            if (r9 == 0) goto L_0x0261
            java.lang.Object r9 = r9.get(r10)
            f50.f$b r9 = (f50.C20432f.C20434b) r9
            boolean r10 = r9 instanceof f50.C20432f.C20434b.C20436b
            if (r10 == 0) goto L_0x017b
            r0 = r8
            f50.f r0 = (f50.C20432f) r0
            r1 = r9
            f50.f$b$b r1 = (f50.C20432f.C20434b.C20436b) r1
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 14
            r6 = 0
            f50.C20432f.m66575q(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0261
        L_0x017b:
            boolean r10 = r9 instanceof f50.C20432f.C20434b.C20435a
            if (r10 == 0) goto L_0x0261
            f50.f r8 = (f50.C20432f) r8
            f50.f$b$a r9 = (f50.C20432f.C20434b.C20435a) r9
            java.lang.String r9 = r9.mo48922a()
            if (r9 != 0) goto L_0x018b
            java.lang.String r9 = ""
        L_0x018b:
            r8.mo48920r(r9)
            goto L_0x0261
        L_0x0190:
            boolean r9 = r8 instanceof g20.C20597c
            java.lang.String r10 = "assetLiability"
            if (r9 == 0) goto L_0x01c5
            i20.c r9 = r7.f54307u
            if (r9 == 0) goto L_0x0261
            java.util.List r9 = r7.f54308v
            if (r9 == 0) goto L_0x0261
            g20.c r8 = (g20.C20597c) r8
            k20.a r9 = new k20.a
            r9.<init>()
            i20.c r0 = r7.f54307u
            if (r0 != 0) goto L_0x01ad
            kotlin.jvm.internal.C41536l.m120506z(r10)
            r0 = r3
        L_0x01ad:
            java.util.List r10 = r0.mo63555e()
            java.util.List r0 = r7.f54308v
            if (r0 != 0) goto L_0x01bb
            java.lang.String r0 = "productTypeList"
            kotlin.jvm.internal.C41536l.m120506z(r0)
            goto L_0x01bc
        L_0x01bb:
            r3 = r0
        L_0x01bc:
            java.util.List r9 = r9.mo64141fw(r10, r3)
            r8.mo49141h(r9)
            goto L_0x0261
        L_0x01c5:
            boolean r9 = r8 instanceof g20.C20614j
            if (r9 == 0) goto L_0x0201
            i20.c r9 = r7.f54307u
            if (r9 == 0) goto L_0x0261
            g20.j r8 = (g20.C20614j) r8
            k20.b r9 = new k20.b
            r9.<init>()
            i20.c r0 = r7.f54307u
            if (r0 != 0) goto L_0x01dc
            kotlin.jvm.internal.C41536l.m120506z(r10)
            r0 = r3
        L_0x01dc:
            java.util.List r0 = r0.mo63553c()
            i20.c r1 = r7.f54307u
            if (r1 != 0) goto L_0x01e8
            kotlin.jvm.internal.C41536l.m120506z(r10)
            r1 = r3
        L_0x01e8:
            java.util.List r1 = r1.mo63554d()
            java.util.List r9 = r9.mo64149fw(r0, r1)
            i20.c r0 = r7.f54307u
            if (r0 != 0) goto L_0x01f8
            kotlin.jvm.internal.C41536l.m120506z(r10)
            goto L_0x01f9
        L_0x01f8:
            r3 = r0
        L_0x01f9:
            boolean r10 = r3.mo63557f()
            r8.mo49162k(r9, r10)
            goto L_0x0261
        L_0x0201:
            boolean r9 = r8 instanceof g20.C20601e
            if (r9 == 0) goto L_0x0223
            ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a$a r9 = r7.f54309w
            if (r9 == 0) goto L_0x0261
            g20.e r8 = (g20.C20601e) r8
            ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a r9 = new ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a
            r9.<init>()
            ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a$a r10 = r7.f54309w
            if (r10 != 0) goto L_0x021a
            java.lang.String r10 = "budgetData"
            kotlin.jvm.internal.C41536l.m120506z(r10)
            goto L_0x021b
        L_0x021a:
            r3 = r10
        L_0x021b:
            ge.bog.mobilebank.cleanarch.presentation.home.viewmodel.a$b r9 = r9.mo54296dw(r3)
            r8.mo49145i(r9)
            goto L_0x0261
        L_0x0223:
            boolean r9 = r8 instanceof g20.C20635t
            if (r9 == 0) goto L_0x0234
            g20.t r8 = (g20.C20635t) r8
            ge.bog.mobilebank.cleanarch.junior.presentation.JuniorRequestDataUiModel r9 = r7.f54310x
            if (r9 != 0) goto L_0x022e
            return
        L_0x022e:
            ue1.l r10 = r7.f54294h
            r8.mo49178i(r9, r10)
            goto L_0x0261
        L_0x0234:
            boolean r9 = r8 instanceof g20.C20626o
            if (r9 == 0) goto L_0x023e
            g20.o r8 = (g20.C20626o) r8
            r8.mo49175k(r0)
            goto L_0x0261
        L_0x023e:
            boolean r9 = r8 instanceof g20.C20595b0
            if (r9 == 0) goto L_0x024a
            g20.b0 r8 = (g20.C20595b0) r8
            java.util.List r9 = r7.f54311y
            r8.mo49140h(r9)
            goto L_0x0261
        L_0x024a:
            boolean r9 = r8 instanceof g20.C20606f0
            if (r9 == 0) goto L_0x0256
            g20.f0 r8 = (g20.C20606f0) r8
            java.util.List r9 = r7.f54312z
            r8.mo49152h(r9)
            goto L_0x0261
        L_0x0256:
            boolean r9 = r8 instanceof g20.C20619k
            if (r9 == 0) goto L_0x0261
            g20.k r8 = (g20.C20619k) r8
            ih0.b r9 = r7.f54291H
            r8.mo49168h(r9)
        L_0x0261:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d20.C19854i.mo48135p(androidx.recyclerview.widget.RecyclerView$f0, int, int):void");
    }
}
