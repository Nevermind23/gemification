package bb1;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import ba1.C10220y;
import db1.C31551a;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.list.SingleLineTextItem;
import p341ge.bog.designsystem.components.list.TwoLineTextItem;
import p615tg.C17963d;
import ua1.C28629b1;
import ua1.C28632c1;
import ue1.C43079p;

/* renamed from: bb1.a */
public final class C31153a extends C1819o {
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final C31154a f77400f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C43079p f77401g;

    /* renamed from: bb1.a$a */
    public enum C31154a {
        SINGLE_LINE,
        TWO_LINE
    }

    /* renamed from: bb1.a$b */
    public final class C31155b extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C28632c1 f77405d;

        /* renamed from: e */
        private final FrameLayout f77406e;

        /* renamed from: f */
        final /* synthetic */ C31153a f77407f;

        /* JADX WARNING: type inference failed for: r2v3, types: [android.widget.FrameLayout, android.view.View] */
        /* JADX WARNING: type inference failed for: r11v1, types: [ge.bog.designsystem.components.list.TwoLineTextItem] */
        /* JADX WARNING: type inference failed for: r5v3, types: [ge.bog.designsystem.components.list.SingleLineTextItem] */
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public C31155b(bb1.C31153a r18, ua1.C28629b1 r19) {
            /*
                r17 = this;
                r0 = r17
                r1 = r19
                java.lang.String r2 = "binding"
                kotlin.jvm.internal.C41536l.m120489i(r1, r2)
                r2 = r18
                r0.f77407f = r2
                android.widget.LinearLayout r3 = r19.mo3946b()
                r0.<init>(r3)
                ge.bog.designsystem.components.list.ListItem r3 = r1.f72681e
                android.view.View r3 = r3.getRightItemView()
                kotlin.jvm.internal.C41536l.m120486f(r3)
                ua1.c1 r3 = ua1.C28632c1.m87625a(r3)
                java.lang.String r4 = "bind(binding.contactInfoItem.rightItemView!!)"
                kotlin.jvm.internal.C41536l.m120488h(r3, r4)
                r0.f77405d = r3
                bb1.a$a r2 = r18.f77400f
                bb1.a$a r3 = bb1.C31153a.C31154a.SINGLE_LINE
                java.lang.String r4 = "binding.root.context"
                if (r2 != r3) goto L_0x0048
                ge.bog.designsystem.components.list.SingleLineTextItem r2 = new ge.bog.designsystem.components.list.SingleLineTextItem
                android.widget.LinearLayout r3 = r19.mo3946b()
                android.content.Context r6 = r3.getContext()
                kotlin.jvm.internal.C41536l.m120488h(r6, r4)
                r7 = 0
                r8 = 0
                r9 = 6
                r10 = 0
                r5 = r2
                r5.<init>(r6, r7, r8, r9, r10)
                goto L_0x005e
            L_0x0048:
                ge.bog.designsystem.components.list.TwoLineTextItem r2 = new ge.bog.designsystem.components.list.TwoLineTextItem
                android.widget.LinearLayout r3 = r19.mo3946b()
                android.content.Context r12 = r3.getContext()
                kotlin.jvm.internal.C41536l.m120488h(r12, r4)
                r13 = 0
                r14 = 0
                r15 = 6
                r16 = 0
                r11 = r2
                r11.<init>(r12, r13, r14, r15, r16)
            L_0x005e:
                r0.f77406e = r2
                boolean r3 = r2 instanceof p341ge.bog.designsystem.components.list.SingleLineTextItem
                r4 = 1
                if (r3 == 0) goto L_0x006b
                r3 = r2
                ge.bog.designsystem.components.list.SingleLineTextItem r3 = (p341ge.bog.designsystem.components.list.SingleLineTextItem) r3
                r3.setSemibold(r4)
            L_0x006b:
                boolean r3 = r2 instanceof p341ge.bog.designsystem.components.list.TwoLineTextItem
                if (r3 == 0) goto L_0x0085
                ak.k0 r3 = p352ak.C9948k0.m36486a(r2)
                java.lang.String r5 = "bind(mainItem)"
                kotlin.jvm.internal.C41536l.m120488h(r3, r5)
                androidx.appcompat.widget.AppCompatTextView r3 = r3.f27185e
                r5 = 10
                r3.setMaxLines(r5)
                r3 = r2
                ge.bog.designsystem.components.list.TwoLineTextItem r3 = (p341ge.bog.designsystem.components.list.TwoLineTextItem) r3
                r3.setSemibold(r4)
            L_0x0085:
                ge.bog.designsystem.components.list.ListItem r1 = r1.f72681e
                r1.setMiddleItemView(r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: bb1.C31153a.C31155b.<init>(bb1.a, ua1.b1):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m92674j(C31153a aVar, C31551a aVar2, int i, View view) {
            C41536l.m120489i(aVar, "this$0");
            C41536l.m120489i(aVar2, "$info");
            C43079p k = aVar.f77401g;
            if (k != null) {
                k.invoke(aVar2, Integer.valueOf(i));
            }
        }

        /* renamed from: i */
        public final void mo71367i(C31551a aVar, int i) {
            C41536l.m120489i(aVar, "info");
            FrameLayout frameLayout = this.f77406e;
            if (frameLayout instanceof SingleLineTextItem) {
                ((SingleLineTextItem) frameLayout).setText(aVar.mo71959a());
            }
            FrameLayout frameLayout2 = this.f77406e;
            if (frameLayout2 instanceof TwoLineTextItem) {
                ((TwoLineTextItem) frameLayout2).setText(aVar.mo71959a());
                FrameLayout frameLayout3 = this.f77406e;
                ((TwoLineTextItem) frameLayout3).setTitle(((TwoLineTextItem) frameLayout3).getContext().getString(C10220y.f28398r0));
            }
            int i2 = 0;
            if (aVar.mo71960b()) {
                this.f77405d.f72693e.setVisibility(0);
                this.f77405d.mo3946b().setOnClickListener(new C31156b(this.f77407f, aVar, i));
            } else {
                this.f77405d.f72693e.setVisibility(8);
                this.f77405d.mo3946b().setOnClickListener((View.OnClickListener) null);
            }
            ImageView imageView = this.f77405d.f72694f;
            if (!aVar.mo71962d()) {
                i2 = 8;
            }
            imageView.setVisibility(i2);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C31153a(C31154a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C31154a.SINGLE_LINE : aVar);
    }

    /* renamed from: i */
    public void mo6029i(List list) {
        super.mo6029i(list);
        this.f77401g = null;
    }

    /* renamed from: m */
    public void onBindViewHolder(C31155b bVar, int i) {
        C41536l.m120489i(bVar, "holder");
        Object obj = mo6026f().get(i);
        C41536l.m120488h(obj, "currentList[position]");
        bVar.mo71367i((C31551a) obj, i);
    }

    /* renamed from: n */
    public C31155b onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C28629b1 d = C28629b1.m87614d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f…arent,\n            false)");
        return new C31155b(this, d);
    }

    /* renamed from: o */
    public final void mo71366o(List list, C43079p pVar) {
        C41536l.m120489i(pVar, "onClick");
        mo6029i(list);
        this.f77401g = pVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C31153a(C31154a aVar) {
        super(C17963d.f51158a.mo45633d());
        C41536l.m120489i(aVar, "type");
        this.f77400f = aVar;
    }
}
