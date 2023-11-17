package u30;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import com.bumptech.glide.C2379b;
import g91.C32289b0;
import g91.C32343x;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p366bk.C10329r;
import p630ui.C18168a;
import r30.C27895b;
import ue1.C43075l;

/* renamed from: u30.j */
public final class C28561j extends C28567n {

    /* renamed from: o */
    public static final C28562a f72491o = new C28562a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final ImageView f72492d;

    /* renamed from: e */
    private final TextView f72493e;

    /* renamed from: f */
    private final TextView f72494f;

    /* renamed from: g */
    private final ImageButton f72495g;

    /* renamed from: h */
    private final SwipeLayout f72496h;

    /* renamed from: i */
    private final ImageView f72497i;

    /* renamed from: j */
    private final C18168a f72498j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C43075l f72499k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public C43075l f72500l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C43075l f72501m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C43075l f72502n;

    /* renamed from: u30.j$a */
    public static final class C28562a {
        private C28562a() {
        }

        public /* synthetic */ C28562a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m87522b(Context context, SwipeLayout swipeLayout) {
            Context context2 = context;
            ArrayList arrayList = new ArrayList();
            String string = context2.getString(C10328q.template_swipe_menu_edit);
            Integer valueOf = Integer.valueOf(C10320i.edit_new);
            Integer valueOf2 = Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_contact_edit_background));
            int i = C10318g.swipe_menu_contact_edit_text_color;
            arrayList.add(new SwipeLayout.C2363g("EDIT_ID", string, valueOf, valueOf2, Integer.valueOf(C0767a.m2893c(context2, i)), Integer.valueOf(C0767a.m2893c(context2, i)), (Float) null));
            String string2 = context2.getString(C10328q.template_swipe_menu_delete);
            Integer valueOf3 = Integer.valueOf(C10320i.delete_new);
            Integer valueOf4 = Integer.valueOf(C0767a.m2893c(context2, C10318g.swipe_menu_contact_delete_background));
            int i2 = C10318g.f28650u2;
            arrayList.add(new SwipeLayout.C2363g("DELETE_ID", string2, valueOf3, valueOf4, Integer.valueOf(C0767a.m2893c(context2, i2)), Integer.valueOf(C0767a.m2893c(context2, i2)), (Float) null));
            swipeLayout.setRightSwipeItems(arrayList);
        }

        /* renamed from: a */
        public final C28561j mo68300a(ViewGroup viewGroup, C43075l lVar, C43075l lVar2, C43075l lVar3, C43075l lVar4) {
            C41536l.m120489i(viewGroup, "parent");
            View o0 = C32343x.m95473o0(viewGroup, C10324m.item_transfer_contact_swipable, false, 2, (Object) null);
            Context context = viewGroup.getContext();
            C41536l.m120488h(context, "parent.context");
            C41536l.m120487g(o0, "null cannot be cast to non-null type com.alexandrius.accordionswipelayout.library.SwipeLayout");
            m87522b(context, (SwipeLayout) o0);
            C28561j jVar = new C28561j(o0);
            jVar.f72499k = lVar;
            jVar.f72500l = lVar2;
            jVar.f72501m = lVar3;
            jVar.f72502n = lVar4;
            return jVar;
        }
    }

    /* renamed from: u30.j$b */
    public /* synthetic */ class C28563b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f72503a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                su.e[] r0 = p891su.C28269e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                su.e r1 = p891su.C28269e.BUDGET     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                su.e r1 = p891su.C28269e.JURIDICAL_PERSON     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f72503a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: u30.C28561j.C28563b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28561j(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f72492d = (ImageView) view.findViewById(C10322k.contact_icon_image);
        this.f72493e = (TextView) view.findViewById(C10322k.contact_name_text);
        this.f72494f = (TextView) view.findViewById(C10322k.nickname_text);
        this.f72495g = (ImageButton) view.findViewById(C10322k.f28882py);
        this.f72496h = (SwipeLayout) view.findViewById(C10322k.swipe_layout);
        this.f72497i = (ImageView) view.findViewById(C10322k.verifiedBadge);
        Context context = view.getContext();
        C41536l.m120488h(context, "itemView.context");
        this.f72498j = new C18168a(context, C10329r.LayerRadiusBottom40Shadow0);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public static final void m87514s(C28561j jVar, C27895b bVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(bVar, "$item");
        C43075l lVar = jVar.f72499k;
        if (lVar != null) {
            lVar.invoke(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static final void m87515t(C28561j jVar, C27895b bVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(bVar, "$item");
        C43075l lVar = jVar.f72500l;
        if (lVar != null) {
            lVar.invoke(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static final boolean m87516u(C28561j jVar, View view) {
        C41536l.m120489i(jVar, "this$0");
        jVar.f72496h.mo7586B(1, true);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public static final void m87517v(C28561j jVar, C27895b bVar, boolean z, String str) {
        C43075l lVar;
        C41536l.m120489i(jVar, "this$0");
        C41536l.m120489i(bVar, "$item");
        if (C41536l.m120484d(str, "EDIT_ID")) {
            C43075l lVar2 = jVar.f72502n;
            if (lVar2 != null) {
                lVar2.invoke(bVar);
            }
        } else if (C41536l.m120484d(str, "DELETE_ID") && (lVar = jVar.f72501m) != null) {
            lVar.invoke(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public static final void m87518w(C28561j jVar) {
        C41536l.m120489i(jVar, "this$0");
        jVar.f72496h.mo7586B(1, true);
        new Handler().postDelayed(new C28560i(jVar), 500);
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public static final void m87519x(C28561j jVar) {
        C41536l.m120489i(jVar, "this$0");
        jVar.f72496h.mo7588f(true);
    }

    /* renamed from: y */
    private final void m87520y(C27895b bVar, SwipeLayout swipeLayout) {
        if (bVar.mo67445l()) {
            C18168a aVar = this.f72498j;
            View swipeableView = swipeLayout.getSwipeableView();
            C41536l.m120488h(swipeableView, "itemView.swipeableView");
            aVar.mo45824a(swipeableView);
            return;
        }
        C18168a.f51475c.mo45833a(swipeLayout);
    }

    /* renamed from: r */
    public void onBind(C27895b bVar) {
        int i;
        C41536l.m120489i(bVar, "item");
        this.f72492d.setImageDrawable((Drawable) null);
        C2379b.m9210t(this.f72492d.getContext()).mo7742m(this.f72492d);
        boolean z = true;
        if (bVar.mo67443j() != null) {
            C32289b0.m95097i(this.f72492d, bVar.mo67443j());
        } else {
            ImageView imageView = this.f72492d;
            int i2 = C28563b.f72503a[bVar.mo67438f().ordinal()];
            if (i2 == 1) {
                i = C10320i.ic_contact_treasury;
            } else if (i2 == 2) {
                i = C10320i.ic_contact_company_small;
            } else if (bVar.mo67444k()) {
                i = C10320i.ic_contact_default_avatar_bog;
            } else {
                i = C10320i.ic_contact_default_avatar;
            }
            imageView.setImageResource(i);
        }
        if (!bVar.mo67447n() || !bVar.mo67435d()) {
            this.f72497i.setVisibility(8);
        } else {
            this.f72497i.setVisibility(0);
        }
        this.f72493e.setText(bVar.mo67436e());
        TextView textView = this.f72494f;
        C41536l.m120488h(textView, "nickNameText");
        if (bVar.mo67440h() == null) {
            z = false;
        }
        C32343x.m95483r1(textView, z, false, 2, (Object) null);
        this.f72494f.setText(bVar.mo67440h());
        this.itemView.setOnClickListener(new C28555d(this, bVar));
        this.f72495g.setOnClickListener(new C28556e(this, bVar));
        this.itemView.setOnLongClickListener(new C28557f(this));
        this.f72496h.setOnSwipeItemClickListener(new C28558g(this, bVar));
        if (bVar.mo67442i() && !PreferencesApiManager.getInstance().isContactSwiped()) {
            PreferencesApiManager.getInstance().setIsContactSwiped();
            new Handler().postDelayed(new C28559h(this), 500);
        }
        SwipeLayout swipeLayout = (SwipeLayout) this.itemView;
        if (swipeLayout != null) {
            m87520y(bVar, swipeLayout);
        }
    }
}
