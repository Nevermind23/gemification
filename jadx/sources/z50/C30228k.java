package z50;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import androidx.core.content.C0767a;
import com.alexandrius.accordionswipelayout.library.SwipeLayout;
import g60.C20742c;
import g91.C32289b0;
import he1.C41224m;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.list.ListItem;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineReverseTextItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10328q;
import p90.C27320h6;
import p90.C27330i6;
import r30.C27895b;
import ue1.C43075l;
import y50.C29923a;
import y50.C29928b;

/* renamed from: z50.k */
public final class C30228k extends C20742c {

    /* renamed from: k */
    public static final C30229a f76122k = new C30229a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private final C27330i6 f76123d;

    /* renamed from: e */
    private final C27320h6 f76124e;

    /* renamed from: f */
    private C43075l f76125f;

    /* renamed from: g */
    private C43075l f76126g;

    /* renamed from: h */
    private C43075l f76127h;

    /* renamed from: i */
    private C43075l f76128i;

    /* renamed from: j */
    private C43075l f76129j;

    /* renamed from: z50.k$a */
    public static final class C30229a {
        private C30229a() {
        }

        public /* synthetic */ C30229a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: b */
        private final void m91325b(Context context, SwipeLayout swipeLayout) {
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
        public final C30228k mo70563a(C27330i6 i6Var, Context context) {
            C41536l.m120489i(i6Var, "binding");
            C41536l.m120489i(context, "context");
            SwipeLayout swipeLayout = i6Var.f68993e;
            C41536l.m120488h(swipeLayout, "binding.swipeLayout");
            m91325b(context, swipeLayout);
            C27320h6 a = C27320h6.m84588a(i6Var.f68993e.getSwipeableView());
            C41536l.m120488h(a, "bind(binding.swipeLayout.swipeableView)");
            return new C30228k(i6Var, a);
        }
    }

    /* renamed from: z50.k$b */
    public /* synthetic */ class C30230b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f76130a;

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
                f76130a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: z50.C30228k.C30230b.<clinit>():void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C30228k(C27330i6 i6Var, C27320h6 h6Var) {
        super((C6201a) i6Var);
        C41536l.m120489i(i6Var, "swipeViewBinding");
        C41536l.m120489i(h6Var, "binding");
        this.f76123d = i6Var;
        this.f76124e = h6Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m91314n(C30228k kVar, C29923a.C29925b bVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(bVar, "$castData");
        C43075l lVar = kVar.f76125f;
        if (lVar != null) {
            lVar.invoke(new C41224m(bVar, Boolean.valueOf(z)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final boolean m91315o(C29923a.C29925b bVar, C30228k kVar, View view) {
        C41536l.m120489i(bVar, "$castData");
        C41536l.m120489i(kVar, "this$0");
        if (!bVar.mo70225c()) {
            kVar.f76123d.f68993e.mo7586B(1, true);
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m91316p(C30228k kVar, C29923a.C29925b bVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(bVar, "$castData");
        C43075l lVar = kVar.f76126g;
        if (lVar != null) {
            lVar.invoke(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m91317q(C30228k kVar, C29923a.C29925b bVar, View view) {
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(bVar, "$castData");
        C43075l lVar = kVar.f76127h;
        if (lVar != null) {
            lVar.invoke(bVar);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public static final void m91318r(C30228k kVar, C29923a.C29925b bVar, boolean z, String str) {
        C43075l lVar;
        C41536l.m120489i(kVar, "this$0");
        C41536l.m120489i(bVar, "$castData");
        if (C41536l.m120484d(str, "EDIT_ID")) {
            C43075l lVar2 = kVar.f76129j;
            if (lVar2 != null) {
                lVar2.invoke(bVar);
            }
        } else if (C41536l.m120484d(str, "DELETE_ID") && (lVar = kVar.f76128i) != null) {
            lVar.invoke(bVar);
        }
    }

    /* renamed from: m */
    public void onBind(C29923a aVar) {
        boolean z;
        int i;
        C41536l.m120489i(aVar, "data");
        C29923a.C29925b bVar = (C29923a.C29925b) aVar;
        C29928b b = bVar.mo70224b();
        String j = ((C27895b) b.mo70237c()).mo67443j();
        boolean z2 = true;
        if (j == null || j.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            BogImageView bogImageView = this.f76124e.f68888f;
            int i2 = C30230b.f76130a[((C27895b) b.mo70237c()).mo67438f().ordinal()];
            if (i2 == 1) {
                i = C10320i.ic_contact_treasury;
            } else if (i2 == 2) {
                i = C10320i.ic_contact_company_small;
            } else if (((C27895b) b.mo70237c()).mo67444k()) {
                i = C10320i.ic_contact_default_avatar_bog;
            } else {
                i = C10320i.ic_contact_default_avatar;
            }
            bogImageView.setImageResource(i);
        } else {
            C32289b0.m95097i(this.f76124e.f68888f, ((C27895b) b.mo70237c()).mo67443j());
        }
        int i3 = 8;
        if (bVar.mo70225c()) {
            this.f76124e.f68887e.setVisibility(0);
            this.f76124e.f68891i.setVisibility(8);
            this.f76123d.f68993e.setSwipeEnabled(false);
            this.f76123d.f68993e.mo7588f(false);
        } else {
            this.f76124e.f68887e.setVisibility(8);
            this.f76124e.f68891i.setVisibility(0);
            this.f76123d.f68993e.setSwipeEnabled(true);
        }
        this.f76124e.f68887e.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
        this.f76124e.f68887e.setChecked(b.mo70238d());
        this.f76124e.f68887e.setOnCheckedChangeListener(new C30223f(this, bVar));
        this.itemView.setOnLongClickListener(new C30224g(bVar, this));
        BogImageView bogImageView2 = this.f76124e.f68892j;
        if (((C27895b) b.mo70237c()).mo67447n() && ((C27895b) b.mo70237c()).mo67435d()) {
            i3 = 0;
        }
        bogImageView2.setVisibility(i3);
        String h = ((C27895b) b.mo70237c()).mo67440h();
        if (!(h == null || h.length() == 0)) {
            z2 = false;
        }
        if (z2) {
            ListItem c = this.f76124e.mo3946b();
            Context context = this.f76124e.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            SingleLineTextItem singleLineTextItem = new SingleLineTextItem(context, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            singleLineTextItem.setText(((C27895b) b.mo70237c()).mo67436e());
            c.setMiddleItemView(singleLineTextItem);
        } else {
            ListItem c2 = this.f76124e.mo3946b();
            Context context2 = this.f76124e.mo3946b().getContext();
            C41536l.m120488h(context2, "binding.root.context");
            TwoLineReverseTextItem twoLineReverseTextItem = new TwoLineReverseTextItem(context2, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
            twoLineReverseTextItem.setText(((C27895b) b.mo70237c()).mo67436e());
            twoLineReverseTextItem.setTitle(((C27895b) b.mo70237c()).mo67440h());
            c2.setMiddleItemView(twoLineReverseTextItem);
        }
        this.f76124e.mo3946b().setOnClickListener(new C30225h(this, bVar));
        this.f76124e.f68890h.setOnClickListener(new C30226i(this, bVar));
        this.f76123d.f68993e.setOnSwipeItemClickListener(new C30227j(this, bVar));
    }

    /* renamed from: s */
    public final void mo70558s(C43075l lVar) {
        this.f76125f = lVar;
    }

    /* renamed from: t */
    public final void mo70559t(C43075l lVar) {
        this.f76126g = lVar;
    }

    /* renamed from: u */
    public final void mo70560u(C43075l lVar) {
        this.f76128i = lVar;
    }

    /* renamed from: v */
    public final void mo70561v(C43075l lVar) {
        this.f76129j = lVar;
    }

    /* renamed from: w */
    public final void mo70562w(C43075l lVar) {
        this.f76127h = lVar;
    }
}
