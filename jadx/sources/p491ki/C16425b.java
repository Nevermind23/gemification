package p491ki;

import af1.C40303i;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.properties.C41553c;
import kotlin.properties.C41555e;
import p035c4.C2247a;
import p086g1.C6201a;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p352ak.C9959l3;
import p352ak.C9967m3;
import p601sg.C17777b;
import p601sg.C17780e;
import p642vh.C18368l;
import p642vh.C18379r;
import ue1.C43075l;

/* renamed from: ki.b */
public abstract class C16425b {

    /* renamed from: e */
    public static final C16428c f46403e = new C16428c((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final C43075l f46404f = C16427b.f46412d;

    /* renamed from: a */
    private final C6201a f46405a;

    /* renamed from: b */
    private final C16429d f46406b;

    /* renamed from: c */
    private int f46407c;

    /* renamed from: d */
    private int f46408d;

    /* renamed from: ki.b$a */
    public static class C16426a extends C16425b {

        /* renamed from: i */
        static final /* synthetic */ C40303i[] f46409i = {C41520a0.m120439e(new C41539o(C16426a.class, "tint", "getTint()Lge/bog/designsystem/components/common/Color;", 0))};

        /* renamed from: g */
        private final C18379r f46410g;

        /* renamed from: h */
        private boolean f46411h;

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16426a(p352ak.C9959l3 r8, p491ki.C16425b.C16429d r9) {
            /*
                r7 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                java.lang.String r0 = "onSelectionChangeListener"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                int r5 = p601sg.C17779d.image_chooser_size
                r6 = 0
                r1 = r7
                r2 = r8
                r3 = r9
                r4 = r5
                r1.<init>(r2, r3, r4, r5, r6)
                vh.r r9 = new vh.r
                androidx.appcompat.widget.AppCompatImageView r0 = r8.f27241g
                java.lang.String r1 = "binding.thumbnail"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                r9.<init>(r0)
                r7.f46410g = r9
                androidx.appcompat.widget.AppCompatImageView r8 = r8.f27241g
                ki.a r9 = new ki.a
                r9.<init>(r7)
                r8.setOnClickListener(r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p491ki.C16425b.C16426a.<init>(ak.l3, ki.b$d):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m58552k(C16426a aVar, View view) {
            C41536l.m120489i(aVar, "this$0");
            boolean z = aVar.f46411h;
            if (z) {
                aVar.mo43555l(!z);
            }
        }

        /* renamed from: c */
        public boolean mo43548c() {
            return this.f46411h;
        }

        /* renamed from: h */
        public void mo43553h(boolean z) {
            mo43555l(z);
        }

        /* renamed from: i */
        public void mo43554i(Image image) {
            AppCompatImageView appCompatImageView = ((C9959l3) mo43547b()).f27241g;
            C41536l.m120488h(appCompatImageView, "binding.thumbnail");
            C18368l.m62777z(appCompatImageView, image, C16425b.f46404f);
            mo43555l(true);
        }

        /* renamed from: l */
        public final void mo43555l(boolean z) {
            this.f46411h = z;
            ((C9959l3) mo43547b()).f27239e.setSelected(z);
            if (z) {
                ((C9959l3) mo43547b()).f27241g.setVisibility(0);
                ((C9959l3) mo43547b()).f27240f.setVisibility(8);
            } else {
                ((C9959l3) mo43547b()).f27241g.setVisibility(8);
                ((C9959l3) mo43547b()).f27240f.setVisibility(0);
            }
            mo43551f().mo43557a(z);
        }
    }

    /* renamed from: ki.b$b */
    static final class C16427b extends C41537m implements C43075l {

        /* renamed from: d */
        public static final C16427b f46412d = new C16427b();

        C16427b() {
            super(1);
        }

        /* renamed from: a */
        public final C2394j invoke(C2394j jVar) {
            C41536l.m120489i(jVar, "$this$null");
            C2247a l = ((C2394j) jVar.mo7220c0(C17780e.f49662k1)).mo7235l();
            C41536l.m120488h(l, "placeholder(R.drawable.t…             .fitCenter()");
            return (C2394j) l;
        }
    }

    /* renamed from: ki.b$c */
    public static final class C16428c {
        private C16428c() {
        }

        public /* synthetic */ C16428c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ki.b$d */
    public interface C16429d {
        /* renamed from: a */
        void mo43557a(boolean z);
    }

    /* renamed from: ki.b$e */
    public static class C16430e extends C16425b {

        /* renamed from: i */
        static final /* synthetic */ C40303i[] f46413i;

        /* renamed from: g */
        private final C18379r f46414g;

        /* renamed from: h */
        private final C41555e f46415h;

        /* renamed from: ki.b$e$a */
        public static final class C16431a extends C41553c {

            /* renamed from: a */
            final /* synthetic */ C9967m3 f46416a;

            /* renamed from: b */
            final /* synthetic */ C16430e f46417b;

            /* renamed from: c */
            final /* synthetic */ C16429d f46418c;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public C16431a(Object obj, C9967m3 m3Var, C16430e eVar, C16429d dVar) {
                super(obj);
                this.f46416a = m3Var;
                this.f46417b = eVar;
                this.f46418c = dVar;
            }

            /* access modifiers changed from: protected */
            public void afterChange(C40303i iVar, Object obj, Object obj2) {
                Color.Attribute attribute;
                C41536l.m120489i(iVar, "property");
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (((Boolean) obj).booleanValue() != booleanValue) {
                    this.f46416a.f27269e.setBadgeVisible(booleanValue);
                    C16430e eVar = this.f46417b;
                    if (booleanValue) {
                        attribute = new Color.Attribute(C17777b.color_white_tr_100);
                    } else {
                        attribute = null;
                    }
                    eVar.mo43558l(attribute);
                    this.f46418c.mo43557a(booleanValue);
                }
            }
        }

        static {
            Class<C16430e> cls = C16430e.class;
            f46413i = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "tint", "getTint()Lge/bog/designsystem/components/common/Color;", 0)), C41520a0.m120439e(new C41539o(cls, "checked", "getChecked()Z", 0))};
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C16430e(p352ak.C9967m3 r9, p491ki.C16425b.C16429d r10) {
            /*
                r8 = this;
                java.lang.String r0 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r9, r0)
                java.lang.String r0 = "onSelectionChangeListener"
                kotlin.jvm.internal.C41536l.m120489i(r10, r0)
                int r5 = p601sg.C17779d.image_selector_size
                r6 = 0
                r1 = r8
                r2 = r9
                r3 = r10
                r4 = r5
                r1.<init>(r2, r3, r4, r5, r6)
                vh.r r0 = new vh.r
                androidx.appcompat.widget.AppCompatImageView r1 = r9.f27271g
                java.lang.String r2 = "binding.thumbnail"
                kotlin.jvm.internal.C41536l.m120488h(r1, r2)
                r0.<init>(r1)
                r8.f46414g = r0
                kotlin.properties.a r0 = kotlin.properties.C41551a.f97718a
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                ki.b$e$a r1 = new ki.b$e$a
                r1.<init>(r0, r9, r8, r10)
                r8.f46415h = r1
                ge.bog.designsystem.components.notificationbadges.BadgeRelativeLayout r10 = r9.f27269e
                ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r10 = r10.getBadgeView()
                ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon r7 = new ge.bog.designsystem.components.notificationbadges.NotificationBadgeView$BadgeType$Icon
                int r1 = p601sg.C17780e.f49647B
                r2 = 0
                r3 = 0
                r4 = 0
                r5 = 14
                r0 = r7
                r0.<init>(r1, r2, r3, r4, r5, r6)
                r10.setBadge(r7)
                android.content.Context r0 = r10.getContext()
                int r1 = p601sg.C17778c.f49617S
                int r0 = androidx.core.content.C0767a.m2893c(r0, r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r10.setBadgeColor(r0)
                android.content.Context r0 = r10.getContext()
                java.lang.String r1 = "context"
                kotlin.jvm.internal.C41536l.m120488h(r0, r1)
                int r1 = p601sg.C17777b.f49595j
                int r0 = p642vh.C18368l.m62755d(r0, r1)
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                r10.setBorderColor(r0)
                androidx.appcompat.widget.AppCompatImageView r9 = r9.f27271g
                ki.c r10 = new ki.c
                r10.<init>(r8)
                r9.setOnClickListener(r10)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p491ki.C16425b.C16430e.<init>(ak.m3, ki.b$d):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public static final void m58560k(C16430e eVar, View view) {
            C41536l.m120489i(eVar, "this$0");
            eVar.mo43553h(!eVar.mo43548c());
        }

        /* renamed from: c */
        public boolean mo43548c() {
            return ((Boolean) this.f46415h.getValue(this, f46413i[1])).booleanValue();
        }

        /* renamed from: h */
        public void mo43553h(boolean z) {
            this.f46415h.setValue(this, f46413i[1], Boolean.valueOf(z));
        }

        /* renamed from: i */
        public void mo43554i(Image image) {
            AppCompatImageView appCompatImageView = ((C9967m3) mo43547b()).f27271g;
            C41536l.m120488h(appCompatImageView, "binding.thumbnail");
            C18368l.m62777z(appCompatImageView, image, C16425b.f46404f);
        }

        /* renamed from: l */
        public void mo43558l(Color color) {
            this.f46414g.setValue(this, f46413i[0], color);
        }
    }

    public /* synthetic */ C16425b(C6201a aVar, C16429d dVar, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, dVar, i, i2);
    }

    /* renamed from: b */
    public final C6201a mo43547b() {
        return this.f46405a;
    }

    /* renamed from: c */
    public abstract boolean mo43548c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Context mo43549d() {
        Context context = this.f46405a.mo3946b().getContext();
        C41536l.m120488h(context, "binding.root.context");
        return context;
    }

    /* renamed from: e */
    public final int mo43550e() {
        return this.f46407c;
    }

    /* renamed from: f */
    public final C16429d mo43551f() {
        return this.f46406b;
    }

    /* renamed from: g */
    public final int mo43552g() {
        return this.f46408d;
    }

    /* renamed from: h */
    public abstract void mo43553h(boolean z);

    /* renamed from: i */
    public abstract void mo43554i(Image image);

    private C16425b(C6201a aVar, C16429d dVar, int i, int i2) {
        this.f46405a = aVar;
        this.f46406b = dVar;
        this.f46407c = -1;
        this.f46408d = -1;
        if (i2 != 0) {
            this.f46407c = mo43549d().getResources().getDimensionPixelSize(i2);
        }
        if (i != 0) {
            this.f46408d = mo43549d().getResources().getDimensionPixelSize(i);
        }
    }
}
