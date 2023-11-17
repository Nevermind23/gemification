package x20;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.core.content.C0767a;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.bumptech.glide.C2379b;
import com.github.mikephil.charting.utils.Utils;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10324m;
import p366bk.C10328q;
import p832mv.C26305b;
import p90.C27448v5;
import ue1.C43075l;
import w20.C29192a;

/* renamed from: x20.p */
public final class C29641p extends C29627b {

    /* renamed from: g */
    public static final C29642a f74806g = new C29642a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C43075l f74807d;

    /* renamed from: e */
    private final PopupWindow f74808e;

    /* renamed from: f */
    private final C27448v5 f74809f;

    /* renamed from: x20.p$a */
    public static final class C29642a {
        private C29642a() {
        }

        public /* synthetic */ C29642a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: x20.p$b */
    public /* synthetic */ class C29643b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f74810a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                mv.b$c[] r0 = p832mv.C26305b.C26308c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                mv.b$c r1 = p832mv.C26305b.C26308c.f66669f     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                mv.b$c r1 = p832mv.C26305b.C26308c.COMPLETED     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f74810a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x20.C29641p.C29643b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29641p(View view, C43075l lVar) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f74807d = lVar;
        C27448v5 a = C27448v5.m85101a(m89947A().getSwipeableView());
        C41536l.m120488h(a, "bind(swipeLayout.swipeableView)");
        this.f74809f = a;
        View inflate = LayoutInflater.from(view.getContext()).inflate(C10324m.layout_money_request_details_hint, (ViewGroup) null);
        C41536l.m120488h(inflate, "content");
        this.f74808e = m89963y(inflate);
    }

    /* renamed from: A */
    private final SwipeLayout m89947A() {
        View view = this.itemView;
        C41536l.m120487g(view, "null cannot be cast to non-null type com.alexandrius.accordionswipelayout.library.SwipeLayout");
        return (SwipeLayout) view;
    }

    /* renamed from: B */
    private final void m89948B() {
        ImageView imageView = this.f74809f.f70094i;
        C41536l.m120488h(imageView, "binding.hintTopArrow");
        C32343x.m95483r1(imageView, true, false, 2, (Object) null);
        this.f74808e.showAsDropDown(this.f74809f.f70094i, 0, 0, 1);
    }

    /* renamed from: p */
    private final void m89956p() {
        Context context = this.itemView.getContext();
        m89947A().setRightSwipeItem(new SwipeLayout.C2363g("SWIPE_MENU_MARK_AS_RECEIVED_ITEM_ID", context.getString(C10328q.money_request_details_receiver_swipe_menu_item_mark_as_received), Integer.valueOf(C10320i.ic_check_white), Integer.valueOf(C0767a.m2893c(context, C10318g.f28631S0)), Integer.valueOf(C0767a.m2893c(context, C10318g.f28628O0)), Integer.valueOf(C0767a.m2893c(context, C10318g.color_invert_component_tr_100)), (Float) null));
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m89957r(C29641p pVar) {
        C41536l.m120489i(pVar, "this$0");
        pVar.m89947A().mo7586B(1, true);
        pVar.m89947A().postDelayed(new C29640o(pVar), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m89958s(C29641p pVar) {
        C41536l.m120489i(pVar, "this$0");
        pVar.m89947A().mo7588f(true);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final void m89959u(C29641p pVar, View view) {
        C41536l.m120489i(pVar, "this$0");
        pVar.m89948B();
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m89960v(C29641p pVar) {
        C41536l.m120489i(pVar, "this$0");
        ImageView imageView = pVar.f74809f.f70094i;
        C41536l.m120488h(imageView, "binding.hintTopArrow");
        C32343x.m95483r1(imageView, false, false, 2, (Object) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final boolean m89961w(C29641p pVar, View view) {
        C41536l.m120489i(pVar, "this$0");
        pVar.m89947A().mo7586B(1, true);
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m89962x(C29641p pVar, C29192a.C29198f fVar, SwipeLayout swipeLayout, boolean z, String str) {
        C41536l.m120489i(pVar, "this$0");
        C41536l.m120489i(fVar, "$item");
        C43075l lVar = pVar.f74807d;
        if (lVar != null) {
            lVar.invoke(fVar);
        }
    }

    /* renamed from: y */
    private final PopupWindow m89963y(View view) {
        PopupWindow popupWindow = new PopupWindow(view, -1, -2);
        popupWindow.setBackgroundDrawable(new ColorDrawable());
        popupWindow.setOutsideTouchable(true);
        popupWindow.setTouchInterceptor(new C29638m(popupWindow));
        return popupWindow;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public static final boolean m89964z(PopupWindow popupWindow, View view, MotionEvent motionEvent) {
        C41536l.m120489i(popupWindow, "$popup");
        popupWindow.dismiss();
        return false;
    }

    /* renamed from: q */
    public final void mo69558q() {
        if (m89947A().mo7596p()) {
            m89947A().postDelayed(new C29639n(this), 500);
        }
    }

    /* renamed from: t */
    public void mo69544h(C29192a.C29198f fVar) {
        int i;
        boolean z;
        int i2;
        C41536l.m120489i(fVar, "item");
        if (fVar.mo69058h() == C26305b.C26308c.ACTIVE) {
            m89956p();
        } else {
            m89947A().mo7620z();
        }
        int i3 = C29643b.f74810a[fVar.mo69058h().ordinal()];
        boolean z2 = true;
        if (i3 == 1) {
            i = C10318g.money_request_rejected_color;
        } else if (i3 != 2) {
            i = C10318g.f28625J0;
        } else {
            i = C10318g.money_request_completed_color;
        }
        this.f74809f.f70095j.setBackgroundColor(C0767a.m2893c(this.itemView.getContext(), i));
        ImageView imageView = this.f74809f.f70094i;
        C41536l.m120488h(imageView, "binding.hintTopArrow");
        C32343x.m95483r1(imageView, false, false, 2, (Object) null);
        ImageView imageView2 = this.f74809f.f70093h;
        C41536l.m120488h(imageView2, "binding.hintIcon");
        C32343x.m95483r1(imageView2, !fVar.mo69061j(), false, 2, (Object) null);
        this.f74809f.f70093h.setOnClickListener(new C29634i(this));
        this.f74808e.setOnDismissListener(new C29635j(this));
        this.f74809f.f70092g.setText(fVar.mo69053d());
        TextView textView = this.f74809f.f70096k;
        C41536l.m120488h(textView, "binding.nicknameText");
        String e = fVar.mo69054e();
        if (e == null || e.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        C32343x.m95483r1(textView, !z, false, 2, (Object) null);
        this.f74809f.f70096k.setText(fVar.mo69054e());
        this.f74809f.f70091f.setImageDrawable((Drawable) null);
        C2379b.m9210t(this.f74809f.f70091f.getContext()).mo7742m(this.f74809f.f70091f);
        if (fVar.mo69056f() != null) {
            C32289b0.m95097i(this.f74809f.f70091f, fVar.mo69056f());
        } else {
            this.f74809f.f70091f.setImageResource(fVar.mo69052c());
        }
        TextView textView2 = this.f74809f.f70097l;
        C41536l.m120488h(textView2, "binding.requestAmountText");
        C32343x.m95483r1(textView2, !fVar.mo69062k(), false, 2, (Object) null);
        this.f74809f.f70097l.setText(C32343x.m95410Q(fVar.mo69057g(), "₾", false, 2, (Object) null));
        TextView textView3 = this.f74809f.f70098m;
        C41536l.m120488h(textView3, "binding.transferredAmountText");
        if (fVar.mo69062k() || fVar.mo69060i() <= Utils.DOUBLE_EPSILON) {
            z2 = false;
        }
        C32343x.m95483r1(textView3, z2, false, 2, (Object) null);
        this.f74809f.f70098m.setText(C32343x.m95410Q(fVar.mo69060i(), "₾", false, 2, (Object) null));
        if (fVar.mo69058h() == C26305b.C26308c.f66669f) {
            i2 = C10318g.money_request_details_rejected_amount_color;
        } else {
            i2 = C10318g.money_request_details_transferred_amount_color;
        }
        this.f74809f.f70098m.setTextColor(C0767a.m2893c(this.itemView.getContext(), i2));
        if (m89947A().mo7596p()) {
            this.itemView.setOnLongClickListener(new C29636k(this));
        } else {
            this.itemView.setOnLongClickListener((View.OnLongClickListener) null);
        }
        m89947A().setOnItemClickListener(new C29637l(this, fVar));
    }
}
