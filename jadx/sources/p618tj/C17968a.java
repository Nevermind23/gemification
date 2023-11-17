package p618tj;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.C0767a;
import androidx.core.view.C1152f3;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import he1.C41238w;
import java.util.List;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41551a;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout;
import p341ge.bog.designsystem.components.notificationbadges.NotificationBadgeView;
import p352ak.C9906e6;
import p352ak.C9938i6;
import p352ak.C9946j6;
import p601sg.C17777b;
import p601sg.C17778c;
import p601sg.C17779d;
import p601sg.C17780e;
import p642vh.C18361h0;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18376o;
import p642vh.C18381t;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: tj.a */
public abstract class C17968a {

    /* renamed from: a */
    private int f51163a;

    /* renamed from: b */
    private int f51164b;

    /* renamed from: c */
    private final C6201a f51165c;

    /* renamed from: d */
    private int f51166d;

    /* renamed from: tj.a$a */
    public static class C17969a extends C17968a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f51167k;

        /* renamed from: e */
        private final C18365j0 f51168e;

        /* renamed from: f */
        private final C18381t f51169f;

        /* renamed from: g */
        private final C18361h0 f51170g = new C18361h0(C17970a.f51174d);

        /* renamed from: h */
        private final C18376o f51171h;

        /* renamed from: i */
        private final C41555e f51172i;

        /* renamed from: j */
        private final C41555e f51173j;

        /* renamed from: tj.a$a$a */
        static final class C17970a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17970a f51174d = new C17970a();

            C17970a() {
                super(0);
            }

            public final Object invoke() {
                return "Icon Picker does not support urls";
            }
        }

        /* renamed from: tj.a$a$b */
        public static final class C17971b extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C17969a f51175a;

            /* renamed from: b */
            final /* synthetic */ C9946j6 f51176b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17971b(Object obj, C17969a aVar, C9946j6 j6Var) {
                super(obj);
                this.f51175a = aVar;
                this.f51176b = j6Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                int intValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != intValue) {
                    C17969a aVar = this.f51175a;
                    AppCompatImageView appCompatImageView = this.f51176b.f27175g;
                    C41536l.m120488h(appCompatImageView, "binding.thumbnail");
                    aVar.mo45660q(appCompatImageView, intValue);
                }
            }
        }

        /* renamed from: tj.a$a$c */
        public static final class C17972c extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C17969a f51177a;

            /* renamed from: b */
            final /* synthetic */ C9946j6 f51178b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17972c(Object obj, C17969a aVar, C9946j6 j6Var) {
                super(obj);
                this.f51177a = aVar;
                this.f51178b = j6Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                int intValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != intValue) {
                    C17969a aVar = this.f51177a;
                    BadgeRelativeLayout badgeRelativeLayout = this.f51178b.f27173e;
                    C41536l.m120488h(badgeRelativeLayout, "binding.badgeLayout");
                    aVar.mo45655l(badgeRelativeLayout, intValue);
                }
            }
        }

        static {
            Class<C17969a> cls = C17969a.class;
            f51167k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "chevronVisible", "getChevronVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "iconUrls", "getIconUrls()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "iconDrawable", "getIconDrawable()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "strokeColor", "getStrokeColor()I", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCount", "getBadgeCount()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17969a(C9946j6 j6Var) {
            super(j6Var, 0, 0, C17779d.stroke_width, 6, (DefaultConstructorMarker) null);
            C41536l.m120489i(j6Var, "binding");
            AppCompatImageView appCompatImageView = j6Var.f27176h;
            C41536l.m120488h(appCompatImageView, "binding.thumbnailChevronImage");
            this.f51168e = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView2 = j6Var.f27175g;
            C41536l.m120488h(appCompatImageView2, "binding.thumbnail");
            this.f51169f = new C18381t(appCompatImageView2, (PorterDuff.Mode) null, 2, (DefaultConstructorMarker) null);
            AppCompatImageView appCompatImageView3 = j6Var.f27175g;
            C41536l.m120488h(appCompatImageView3, "binding.thumbnail");
            this.f51171h = new C18376o(appCompatImageView3);
            C41551a aVar = C41551a.f97718a;
            this.f51172i = new C17971b(Integer.valueOf(C18368l.m62755d(mo45647d(), C17777b.f49596k)), this, j6Var);
            this.f51173j = new C17972c(Integer.MIN_VALUE, this, j6Var);
            NotificationBadgeView badgeView = j6Var.f27173e.getBadgeView();
            badgeView.setBadgeColor(Integer.valueOf(C0767a.m2893c(badgeView.getContext(), C17778c.color_support_first_solid_df_500)));
            Context context = badgeView.getContext();
            C41536l.m120488h(context, "context");
            badgeView.setBorderColor(Integer.valueOf(C18368l.m62755d(context, C17777b.f49595j)));
        }

        /* renamed from: a */
        public int mo45644a() {
            return ((Number) this.f51173j.getValue(this, f51167k[5])).intValue();
        }

        /* renamed from: c */
        public boolean mo45646c() {
            return this.f51168e.getValue(this, f51167k[0]).booleanValue();
        }

        /* renamed from: f */
        public Drawable mo45649f() {
            return this.f51171h.getValue(this, f51167k[3]);
        }

        /* renamed from: g */
        public ColorStateList mo45650g() {
            return this.f51169f.getValue(this, f51167k[1]);
        }

        /* renamed from: h */
        public List mo45651h() {
            return (List) this.f51170g.getValue(this, f51167k[2]);
        }

        /* renamed from: i */
        public int mo45652i() {
            return ((Number) this.f51172i.getValue(this, f51167k[4])).intValue();
        }

        /* renamed from: k */
        public void mo45654k(int i) {
            this.f51173j.setValue(this, f51167k[5], Integer.valueOf(i));
        }

        /* renamed from: m */
        public void mo45656m(boolean z) {
            this.f51168e.mo46151c(this, f51167k[0], z);
        }

        /* renamed from: n */
        public void mo45657n(Drawable drawable) {
            this.f51171h.setValue(this, f51167k[3], drawable);
        }

        /* renamed from: o */
        public void mo45658o(ColorStateList colorStateList) {
            this.f51169f.setValue(this, f51167k[1], colorStateList);
        }

        /* renamed from: p */
        public void mo45659p(List list) {
            this.f51170g.setValue(this, f51167k[2], list);
        }

        /* renamed from: r */
        public void mo45661r(int i) {
            this.f51172i.setValue(this, f51167k[4], Integer.valueOf(i));
        }
    }

    /* renamed from: tj.a$b */
    public static class C17973b extends C17968a {

        /* renamed from: k */
        static final /* synthetic */ C40303i[] f51179k;

        /* renamed from: e */
        private final C18365j0 f51180e;

        /* renamed from: f */
        private final C18361h0 f51181f = new C18361h0(C17975b.f51187d);

        /* renamed from: g */
        private final C18361h0 f51182g = new C18361h0(C17974a.f51186d);

        /* renamed from: h */
        private final C41555e f51183h;

        /* renamed from: i */
        private final C41555e f51184i;

        /* renamed from: j */
        private final C41555e f51185j;

        /* renamed from: tj.a$b$a */
        static final class C17974a extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17974a f51186d = new C17974a();

            C17974a() {
                super(0);
            }

            public final Object invoke() {
                return "Thumbnail Picker does not support urls";
            }
        }

        /* renamed from: tj.a$b$b */
        static final class C17975b extends C41537m implements C43064a {

            /* renamed from: d */
            public static final C17975b f51187d = new C17975b();

            C17975b() {
                super(0);
            }

            public final Object invoke() {
                return "Thumbnail picker does not support tint";
            }
        }

        /* renamed from: tj.a$b$c */
        public static final class C17976c extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C9938i6 f51188a;

            /* renamed from: b */
            final /* synthetic */ C17973b f51189b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17976c(Object obj, C9938i6 i6Var, C17973b bVar) {
                super(obj);
                this.f51188a = i6Var;
                this.f51189b = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41238w wVar;
                C41536l.m120489i(iVar, "property");
                List list = (List) obj2;
                if (!C41536l.m120484d((List) obj, list)) {
                    if (list != null) {
                        this.f51189b.m61931u(list);
                        wVar = C41238w.f97225a;
                    } else {
                        wVar = null;
                    }
                    if (wVar == null) {
                        this.f51188a.f27127g.removeAllViews();
                    }
                }
            }
        }

        /* renamed from: tj.a$b$d */
        public static final class C17977d extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C17973b f51190a;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17977d(Object obj, C17973b bVar) {
                super(obj);
                this.f51190a = bVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                int intValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != intValue) {
                    this.f51190a.m61932v(intValue);
                }
            }
        }

        /* renamed from: tj.a$b$e */
        public static final class C17978e extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C17973b f51191a;

            /* renamed from: b */
            final /* synthetic */ C9938i6 f51192b;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C17978e(Object obj, C17973b bVar, C9938i6 i6Var) {
                super(obj);
                this.f51191a = bVar;
                this.f51192b = i6Var;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                C41536l.m120489i(iVar, "property");
                int intValue = ((Number) obj2).intValue();
                if (((Number) obj).intValue() != intValue) {
                    C17973b bVar = this.f51191a;
                    BadgeRelativeLayout badgeRelativeLayout = this.f51192b.f27125e;
                    C41536l.m120488h(badgeRelativeLayout, "binding.badgeLayout");
                    bVar.mo45655l(badgeRelativeLayout, intValue);
                }
            }
        }

        static {
            Class<C17973b> cls = C17973b.class;
            f51179k = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "chevronVisible", "getChevronVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "iconTint", "getIconTint()Landroid/content/res/ColorStateList;", 0)), C41520a0.m120439e(new C41539o(cls, "iconDrawable", "getIconDrawable()Landroid/graphics/drawable/Drawable;", 0)), C41520a0.m120439e(new C41539o(cls, "iconUrls", "getIconUrls()Ljava/util/List;", 0)), C41520a0.m120439e(new C41539o(cls, "strokeColor", "getStrokeColor()I", 0)), C41520a0.m120439e(new C41539o(cls, "badgeCount", "getBadgeCount()I", 0))};
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C17973b(C9938i6 i6Var) {
            super(i6Var, 0, 0, C17779d.stroke_width, 6, (DefaultConstructorMarker) null);
            C41536l.m120489i(i6Var, "binding");
            AppCompatImageView appCompatImageView = i6Var.f27126f;
            C41536l.m120488h(appCompatImageView, "binding.thumbnailChevronImage");
            this.f51180e = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
            C41551a aVar = C41551a.f97718a;
            this.f51183h = new C17976c(C41341q.m119907j(), i6Var, this);
            this.f51184i = new C17977d(Integer.valueOf(C18368l.m62755d(mo45647d(), C17777b.f49596k)), this);
            this.f51185j = new C17978e(Integer.MIN_VALUE, this, i6Var);
            NotificationBadgeView badgeView = i6Var.f27125e.getBadgeView();
            badgeView.setBadgeColor(Integer.valueOf(C0767a.m2893c(badgeView.getContext(), C17778c.color_support_first_solid_df_500)));
            Context context = badgeView.getContext();
            C41536l.m120488h(context, "context");
            badgeView.setBorderColor(Integer.valueOf(C18368l.m62755d(context, C17777b.f49595j)));
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public final void m61931u(List list) {
            int i;
            ((C9938i6) mo45645b()).f27127g.removeAllViews();
            if (mo45646c()) {
                i = 4;
            } else {
                i = 3;
            }
            LayoutInflater from = LayoutInflater.from(mo45647d());
            mo45654k(list.size() - i);
            int min = Math.min(list.size() - 1, i - 1);
            float dimension = mo45647d().getResources().getDimension(C17779d.f49642K1);
            if (min >= 0) {
                int i2 = 0;
                while (true) {
                    C9906e6 d = C9906e6.m36335d(from);
                    C41536l.m120488h(d, "inflate(inflater)");
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.leftMargin = ((int) dimension) * i2;
                    d.mo3946b().setLayoutParams(layoutParams);
                    AppCompatImageView appCompatImageView = d.f26969f;
                    C41536l.m120488h(appCompatImageView, "thumbnailBadgeBinding.thumbnail");
                    mo45660q(appCompatImageView, mo45652i());
                    ((C2394j) ((C2394j) C2379b.m9210t(mo45647d()).mo7757y((String) list.get(i2)).mo7222d()).mo7220c0(C17780e.f49668q1)).mo7718L0(d.f26969f);
                    ((C9938i6) mo45645b()).f27127g.addView(d.mo3946b());
                    if (i2 != min) {
                        i2++;
                    } else {
                        return;
                    }
                }
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public final void m61932v(int i) {
            FrameLayout frameLayout = ((C9938i6) mo45645b()).f27127g;
            C41536l.m120488h(frameLayout, "binding.thumbnails");
            for (View q : C1152f3.m4215b(frameLayout)) {
                mo45660q(q, i);
            }
        }

        /* renamed from: a */
        public int mo45644a() {
            return ((Number) this.f51185j.getValue(this, f51179k[5])).intValue();
        }

        /* renamed from: c */
        public boolean mo45646c() {
            return this.f51180e.getValue(this, f51179k[0]).booleanValue();
        }

        /* renamed from: f */
        public Drawable mo45649f() {
            return (Drawable) this.f51182g.getValue(this, f51179k[2]);
        }

        /* renamed from: g */
        public ColorStateList mo45650g() {
            return (ColorStateList) this.f51181f.getValue(this, f51179k[1]);
        }

        /* renamed from: h */
        public List mo45651h() {
            return (List) this.f51183h.getValue(this, f51179k[3]);
        }

        /* renamed from: i */
        public int mo45652i() {
            return ((Number) this.f51184i.getValue(this, f51179k[4])).intValue();
        }

        /* renamed from: k */
        public void mo45654k(int i) {
            this.f51185j.setValue(this, f51179k[5], Integer.valueOf(i));
        }

        /* renamed from: m */
        public void mo45656m(boolean z) {
            this.f51180e.mo46151c(this, f51179k[0], z);
        }

        /* renamed from: n */
        public void mo45657n(Drawable drawable) {
            this.f51182g.setValue(this, f51179k[2], drawable);
        }

        /* renamed from: o */
        public void mo45658o(ColorStateList colorStateList) {
            this.f51181f.setValue(this, f51179k[1], colorStateList);
        }

        /* renamed from: p */
        public void mo45659p(List list) {
            this.f51183h.setValue(this, f51179k[3], list);
        }

        /* renamed from: r */
        public void mo45661r(int i) {
            this.f51184i.setValue(this, f51179k[4], Integer.valueOf(i));
        }
    }

    public /* synthetic */ C17968a(C6201a aVar, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, i, i2, i3);
    }

    /* renamed from: a */
    public abstract int mo45644a();

    /* renamed from: b */
    public final C6201a mo45645b() {
        return this.f51165c;
    }

    /* renamed from: c */
    public abstract boolean mo45646c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Context mo45647d() {
        Context context = this.f51165c.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: e */
    public final int mo45648e() {
        return this.f51163a;
    }

    /* renamed from: f */
    public abstract Drawable mo45649f();

    /* renamed from: g */
    public abstract ColorStateList mo45650g();

    /* renamed from: h */
    public abstract List mo45651h();

    /* renamed from: i */
    public abstract int mo45652i();

    /* renamed from: j */
    public final int mo45653j() {
        return this.f51164b;
    }

    /* renamed from: k */
    public abstract void mo45654k(int i);

    /* renamed from: l */
    public void mo45655l(BadgeRelativeLayout badgeRelativeLayout, int i) {
        boolean z;
        C41536l.m120489i(badgeRelativeLayout, "badgeLayout");
        int i2 = 0;
        if (mo45644a() > 0) {
            z = true;
        } else {
            z = false;
        }
        int dimensionPixelOffset = mo45647d().getResources().getDimensionPixelOffset(C17779d.badge_padding_end);
        if (z) {
            i2 = dimensionPixelOffset;
        }
        badgeRelativeLayout.setPadding(badgeRelativeLayout.getPaddingLeft(), badgeRelativeLayout.getPaddingTop(), i2, badgeRelativeLayout.getPaddingBottom());
        badgeRelativeLayout.setBadgeVisible(z);
        badgeRelativeLayout.getBadgeView().setBadge(new NotificationBadgeView.BadgeType.Number(mo45644a()));
    }

    /* renamed from: m */
    public abstract void mo45656m(boolean z);

    /* renamed from: n */
    public abstract void mo45657n(Drawable drawable);

    /* renamed from: o */
    public abstract void mo45658o(ColorStateList colorStateList);

    /* renamed from: p */
    public abstract void mo45659p(List list);

    /* renamed from: q */
    public void mo45660q(View view, int i) {
        C41536l.m120489i(view, "view");
        Drawable current = view.getBackground().getCurrent();
        C41536l.m120487g(current, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((GradientDrawable) current).setStroke(this.f51166d, i);
    }

    /* renamed from: r */
    public abstract void mo45661r(int i);

    public /* synthetic */ C17968a(C6201a aVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar);
    }

    private C17968a(C6201a aVar) {
        this.f51163a = -1;
        this.f51164b = -1;
        this.f51166d = -1;
        this.f51165c = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17968a(C6201a aVar, int i, int i2, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3, (DefaultConstructorMarker) null);
    }

    private C17968a(C6201a aVar, int i, int i2, int i3) {
        this(aVar, (DefaultConstructorMarker) null);
        if (i2 != 0) {
            this.f51163a = mo45647d().getResources().getDimensionPixelSize(i2);
        }
        if (i != 0) {
            this.f51164b = mo45647d().getResources().getDimensionPixelSize(i);
        }
        if (i3 != 0) {
            this.f51166d = mo45647d().getResources().getDimensionPixelOffset(i3);
        }
    }
}
