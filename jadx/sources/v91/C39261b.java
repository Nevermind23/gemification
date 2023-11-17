package v91;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import java.util.Map;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p615tg.C17963d;
import p91.C37932c;
import w91.C39618a;
import y91.C40037b;

/* renamed from: v91.b */
public final class C39261b extends C1819o {

    /* renamed from: f */
    private final C39618a f93462f;

    /* renamed from: v91.b$a */
    public static final class C39262a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C37932c f93463d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C39262a(C37932c cVar) {
            super(cVar.mo3946b());
            C41536l.m120489i(cVar, "binding");
            this.f93463d = cVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m114398j(C39618a aVar, C40037b bVar, View view) {
            C41536l.m120489i(aVar, "$listener");
            C41536l.m120489i(bVar, "$item");
            aVar.mo88190a(bVar);
        }

        /* renamed from: k */
        private final Image.Url m114399k(C40037b bVar) {
            String str;
            String d = bVar.mo93890c().mo89541d();
            if (d != null) {
                str = C32289b0.m95091c(d);
            } else {
                str = null;
            }
            if (str == null) {
                return null;
            }
            return new Image.Url(str, (Image.Placeholder) null, (Image.Placeholder) null, (Map) null, (Drawable) null, (Drawable) null, (Boolean) null, 126, (DefaultConstructorMarker) null);
        }

        /* JADX WARNING: type inference failed for: r0v13, types: [android.graphics.drawable.Drawable] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Unknown variable types count: 1 */
        /* renamed from: i */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo92898i(y91.C40037b r7, w91.C39618a r8) {
            /*
                r6 = this;
                java.lang.String r0 = "item"
                kotlin.jvm.internal.C41536l.m120489i(r7, r0)
                java.lang.String r0 = "listener"
                kotlin.jvm.internal.C41536l.m120489i(r8, r0)
                p91.c r0 = r6.f93463d
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.mo3946b()
                v91.a r1 = new v91.a
                r1.<init>(r8, r7)
                r0.setOnClickListener(r1)
                p91.c r8 = r6.f93463d
                androidx.appcompat.widget.AppCompatImageView r8 = r8.f91060e
                java.lang.String r0 = "binding.backgroundImage"
                kotlin.jvm.internal.C41536l.m120488h(r8, r0)
                ge.bog.designsystem.components.common.Image$Url r0 = r6.m114399k(r7)
                r1 = 0
                r2 = 2
                p642vh.C18368l.m62746A(r8, r0, r1, r2, r1)
                p91.c r8 = r6.f93463d
                ge.bog.designsystem.components.notificationbadges.NotificationBadgeView r8 = r8.f91062g
                java.lang.String r0 = "binding.notificationBadge"
                kotlin.jvm.internal.C41536l.m120488h(r8, r0)
                boolean r0 = r7.mo93891d()
                r3 = 0
                g91.C32343x.m95483r1(r8, r0, r3, r2, r1)
                ge.bog.designsystem.components.common.Color$Attribute r8 = new ge.bog.designsystem.components.common.Color$Attribute
                boolean r0 = r7.mo93891d()
                if (r0 == 0) goto L_0x0046
                int r0 = l91.C37114a.f89308b
                goto L_0x0048
            L_0x0046:
                int r0 = l91.C37114a.f89307a
            L_0x0048:
                r8.<init>(r0)
                boolean r7 = r7.mo93891d()
                if (r7 == 0) goto L_0x0059
                ge.bog.designsystem.components.common.Color$Attribute r7 = new ge.bog.designsystem.components.common.Color$Attribute
                int r0 = l91.C37114a.f89309c
                r7.<init>(r0)
                goto L_0x005a
            L_0x0059:
                r7 = r1
            L_0x005a:
                p91.c r0 = r6.f93463d
                androidx.constraintlayout.widget.ConstraintLayout r0 = r0.mo3946b()
                android.content.Context r0 = r0.getContext()
                int r2 = p601sg.C17780e.rounded_stroke_radius_16_invert_component_solid_1dp
                android.graphics.drawable.Drawable r0 = p045d.C5769a.m23210b(r0, r2)
                if (r0 == 0) goto L_0x00b1
                boolean r2 = r0 instanceof android.graphics.drawable.GradientDrawable
                if (r2 == 0) goto L_0x0073
                r1 = r0
                android.graphics.drawable.GradientDrawable r1 = (android.graphics.drawable.GradientDrawable) r1
            L_0x0073:
                if (r1 == 0) goto L_0x00b0
                r2 = 1
                int r2 = p642vh.C18368l.m62762k(r2)
                p91.c r4 = r6.f93463d
                androidx.constraintlayout.widget.ConstraintLayout r4 = r4.mo3946b()
                android.content.Context r4 = r4.getContext()
                java.lang.String r5 = "binding.root.context"
                kotlin.jvm.internal.C41536l.m120488h(r4, r5)
                int r8 = r8.mo35260a(r4)
                r1.setStroke(r2, r8)
                if (r7 == 0) goto L_0x00a3
                p91.c r8 = r6.f93463d
                androidx.constraintlayout.widget.ConstraintLayout r8 = r8.mo3946b()
                android.content.Context r8 = r8.getContext()
                kotlin.jvm.internal.C41536l.m120488h(r8, r5)
                int r3 = r7.mo35260a(r8)
            L_0x00a3:
                r1.setColor(r3)
                r7 = 16
                int r7 = p642vh.C18368l.m62762k(r7)
                float r7 = (float) r7
                r1.setCornerRadius(r7)
            L_0x00b0:
                r1 = r0
            L_0x00b1:
                p91.c r7 = r6.f93463d
                android.widget.FrameLayout r7 = r7.f91061f
                r7.setBackground(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: v91.C39261b.C39262a.mo92898i(y91.b, w91.a):void");
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C39261b(C39618a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "listener");
        this.f93462f = aVar;
    }

    /* renamed from: k */
    public void onBindViewHolder(C39262a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo92898i((C40037b) g, this.f93462f);
    }

    /* renamed from: l */
    public C39262a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C37932c d = C37932c.m111484d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C39262a(d);
    }
}
